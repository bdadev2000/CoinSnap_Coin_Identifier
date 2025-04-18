package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.same.report.i;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017J0\u0010 \u001a\u0004\u0018\u00018\u00002!\u0010!\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010&J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0015\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0002¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010.J$\u0010/\u001a\u0004\u0018\u00018\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010$J\r\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0011\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0011\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0018\u00104\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0010H\u0002R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "size", "getSize", "()I", "setSize", "(I)V", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function1;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "find", "predicate", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "siftDownFrom", i.a, "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* loaded from: classes3.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final AtomicIntegerFieldUpdater _size$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");

    @Volatile
    private volatile int _size;
    private T[] a;

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, getSize() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) copyOf);
            this.a = tArr3;
            return tArr3;
        }
        return tArr;
    }

    private final void setSize(int i10) {
        _size$FU.set(this, i10);
    }

    private final void siftDownFrom(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= getSize()) {
                return;
            }
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i12 = i11 + 1;
            if (i12 < getSize()) {
                T t5 = tArr[i12];
                Intrinsics.checkNotNull(t5);
                T t10 = tArr[i11];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t5).compareTo(t10) < 0) {
                    i11 = i12;
                }
            }
            T t11 = tArr[i10];
            Intrinsics.checkNotNull(t11);
            T t12 = tArr[i11];
            Intrinsics.checkNotNull(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            swap(i10, i11);
            i10 = i11;
        }
    }

    private final void siftUpFrom(int i10) {
        while (i10 > 0) {
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t5 = tArr[i11];
            Intrinsics.checkNotNull(t5);
            T t10 = tArr[i10];
            Intrinsics.checkNotNull(t10);
            if (((Comparable) t5).compareTo(t10) <= 0) {
                return;
            }
            swap(i10, i11);
            i10 = i11;
        }
    }

    private final void swap(int i10, int j3) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t5 = tArr[j3];
        Intrinsics.checkNotNull(t5);
        T t10 = tArr[i10];
        Intrinsics.checkNotNull(t10);
        tArr[i10] = t5;
        tArr[j3] = t10;
        t5.setIndex(i10);
        t10.setIndex(j3);
    }

    @PublishedApi
    public final void addImpl(T node) {
        node.setHeap(this);
        T[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = node;
        node.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(T node, Function1<? super T, Boolean> cond) {
        boolean z10;
        synchronized (this) {
            try {
                if (cond.invoke(firstImpl()).booleanValue()) {
                    addImpl(node);
                    z10 = true;
                } else {
                    z10 = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        return z10;
    }

    public final void clear() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                ArraysKt___ArraysJvmKt.fill$default(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            _size$FU.set(this, 0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final T find(Function1<? super T, Boolean> predicate) {
        T t5;
        synchronized (this) {
            int size = getSize();
            int i10 = 0;
            while (true) {
                t5 = null;
                if (i10 >= size) {
                    break;
                }
                T[] tArr = this.a;
                if (tArr != null) {
                    t5 = (Object) tArr[i10];
                }
                Intrinsics.checkNotNull(t5);
                if (predicate.invoke(t5).booleanValue()) {
                    break;
                }
                i10++;
            }
        }
        return t5;
    }

    @PublishedApi
    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(T node) {
        boolean z10;
        synchronized (this) {
            if (node.getHeap() == null) {
                z10 = false;
            } else {
                removeAtImpl(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    @PublishedApi
    public final T removeAtImpl(int index) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        setSize(getSize() - 1);
        if (index < getSize()) {
            swap(index, getSize());
            int i10 = (index - 1) / 2;
            if (index > 0) {
                T t5 = tArr[index];
                Intrinsics.checkNotNull(t5);
                T t10 = tArr[i10];
                Intrinsics.checkNotNull(t10);
                if (((Comparable) t5).compareTo(t10) < 0) {
                    swap(index, i10);
                    siftUpFrom(i10);
                }
            }
            siftDownFrom(index);
        }
        T t11 = tArr[getSize()];
        Intrinsics.checkNotNull(t11);
        t11.setHeap(null);
        t11.setIndex(-1);
        tArr[getSize()] = null;
        return t11;
    }

    public final T removeFirstIf(Function1<? super T, Boolean> predicate) {
        synchronized (this) {
            try {
                T firstImpl = firstImpl();
                T t5 = null;
                if (firstImpl == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                if (predicate.invoke(firstImpl).booleanValue()) {
                    t5 = removeAtImpl(0);
                }
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return t5;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public final T removeFirstOrNull() {
        T t5;
        synchronized (this) {
            if (getSize() > 0) {
                t5 = removeAtImpl(0);
            } else {
                t5 = null;
            }
        }
        return t5;
    }
}
