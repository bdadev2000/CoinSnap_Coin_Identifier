package com.google.common.util.concurrent;

import com.google.android.gms.common.api.Api;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    /* loaded from: classes.dex */
    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        public /* synthetic */ CompactStriped(int i2, Supplier supplier, AnonymousClass1 anonymousClass1) {
            this(i2, supplier);
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
            return (L) this.array[i2];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }

        private CompactStriped(int i2, Supplier<L> supplier) {
            super(i2);
            int i3 = 0;
            Preconditions.checkArgument(i2 <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i3 >= objArr.length) {
                    return;
                }
                objArr[i3] = supplier.get();
                i3++;
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        public LargeLazyStriped(int i2, Supplier<L> supplier) {
            super(i2);
            int i3 = this.mask;
            this.size = i3 == -1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3 + 1;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i2, size());
            }
            L l2 = this.locks.get(Integer.valueOf(i2));
            if (l2 != null) {
                return l2;
            }
            L l3 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i2), l3), l3);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* loaded from: classes.dex */
    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    /* loaded from: classes.dex */
    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i2) {
            super(i2, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        public PowerOfTwoStriped(int i2) {
            super();
            Preconditions.checkArgument(i2 > 0, "Stripes must be positive");
            this.mask = i2 > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i2) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        /* loaded from: classes.dex */
        public static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            public ArrayReference(L l2, int i2, ReferenceQueue<L> referenceQueue) {
                super(l2, referenceQueue);
                this.index = i2;
            }
        }

        public SmallLazyStriped(int i2, Supplier<L> supplier) {
            super(i2);
            this.queue = new ReferenceQueue<>();
            int i3 = this.mask;
            int i4 = i3 == -1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i3 + 1;
            this.size = i4;
            this.locks = new AtomicReferenceArray<>(i4);
            this.supplier = supplier;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> poll = this.queue.poll();
                if (poll == null) {
                    return;
                }
                ArrayReference<? extends L> arrayReference = (ArrayReference) poll;
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                int i2 = arrayReference.index;
                while (!atomicReferenceArray.compareAndSet(i2, arrayReference, null) && atomicReferenceArray.get(i2) == arrayReference) {
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i2) {
            L l2;
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i2, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i2);
            L l3 = arrayReference == null ? null : arrayReference.get();
            if (l3 != null) {
                return l3;
            }
            L l4 = this.supplier.get();
            ArrayReference<? extends L> arrayReference2 = new ArrayReference<>(l4, i2, this.queue);
            do {
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                while (!atomicReferenceArray.compareAndSet(i2, arrayReference, arrayReference2)) {
                    if (atomicReferenceArray.get(i2) != arrayReference) {
                        arrayReference = this.locks.get(i2);
                        l2 = arrayReference == null ? null : arrayReference.get();
                    }
                }
                drainQueue();
                return l4;
            } while (l2 == null);
            return l2;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* loaded from: classes.dex */
    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }
    }

    /* loaded from: classes.dex */
    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    /* loaded from: classes.dex */
    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    private Striped() {
    }

    public /* synthetic */ Striped(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ Lock b() {
        return lambda$lazyWeakLock$0();
    }

    public static int ceilToPowerOfTwo(int i2) {
        return 1 << IntMath.log2(i2, RoundingMode.CEILING);
    }

    public static <L> Striped<L> custom(int i2, Supplier<L> supplier) {
        return new CompactStriped(i2, supplier);
    }

    private static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i2) {
        return new Semaphore(i2, false);
    }

    public static /* synthetic */ Semaphore lambda$semaphore$1(int i2) {
        return new PaddedSemaphore(i2);
    }

    private static <L> Striped<L> lazy(int i2, Supplier<L> supplier) {
        return i2 < 1024 ? new SmallLazyStriped(i2, supplier) : new LargeLazyStriped(i2, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i2) {
        return lazy(i2, new j(3));
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i2) {
        return lazy(i2, new j(0));
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i2, int i3) {
        return lazy(i2, new i(i3, 1));
    }

    public static Striped<Lock> lock(int i2) {
        return custom(i2, new j(1));
    }

    public static Striped<ReadWriteLock> readWriteLock(int i2) {
        return custom(i2, new j(2));
    }

    public static Striped<Semaphore> semaphore(int i2, int i3) {
        return custom(i2, new i(i3, 0));
    }

    public static int smear(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList newArrayList = Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i2 = 0; i2 < newArrayList.size(); i2++) {
            iArr[i2] = indexFor(newArrayList.get(i2));
        }
        Arrays.sort(iArr);
        int i3 = iArr[0];
        newArrayList.set(0, getAt(i3));
        for (int i4 = 1; i4 < newArrayList.size(); i4++) {
            int i5 = iArr[i4];
            if (i5 == i3) {
                newArrayList.set(i4, newArrayList.get(i4 - 1));
            } else {
                newArrayList.set(i4, getAt(i5));
                i3 = i5;
            }
        }
        return Collections.unmodifiableList(newArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i2);

    public abstract int indexFor(Object obj);

    public abstract int size();
}
