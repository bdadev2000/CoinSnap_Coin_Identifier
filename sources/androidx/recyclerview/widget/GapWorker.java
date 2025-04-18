package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GapWorker implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f21000f = new ThreadLocal();

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator f21001g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21002a;

    /* renamed from: b, reason: collision with root package name */
    public long f21003b;

    /* renamed from: c, reason: collision with root package name */
    public long f21004c;
    public ArrayList d;

    /* renamed from: androidx.recyclerview.widget.GapWorker$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Comparator<Task> {
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.GapWorker.Task r7, androidx.recyclerview.widget.GapWorker.Task r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.GapWorker$Task r7 = (androidx.recyclerview.widget.GapWorker.Task) r7
                androidx.recyclerview.widget.GapWorker$Task r8 = (androidx.recyclerview.widget.GapWorker.Task) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f21008a
                boolean r3 = r8.f21008a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f21009b
                int r2 = r7.f21009b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f21010c
                int r8 = r8.f21010c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GapWorker.AnonymousClass1.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes2.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* renamed from: a, reason: collision with root package name */
        public int f21005a;

        /* renamed from: b, reason: collision with root package name */
        public int f21006b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f21007c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public final void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.d;
            int i5 = i4 * 2;
            int[] iArr = this.f21007c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f21007c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[i4 * 4];
                this.f21007c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f21007c;
            iArr4[i5] = i2;
            iArr4[i5 + 1] = i3;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z2) {
            this.d = 0;
            int[] iArr = this.f21007c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z2) {
                if (!recyclerView.mAdapterHelper.i()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f21005a, this.f21006b, recyclerView.mState, this);
            }
            int i2 = this.d;
            if (i2 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i2;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z2;
                recyclerView.mRecycler.n();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Task {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21008a;

        /* renamed from: b, reason: collision with root package name */
        public int f21009b;

        /* renamed from: c, reason: collision with root package name */
        public int f21010c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.ViewHolder c(RecyclerView recyclerView, int i2, long j2) {
        int c2 = recyclerView.mChildHelper.f20926a.c();
        for (int i3 = 0; i3 < c2; i3++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.f20926a.a(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder l2 = recycler.l(j2, i2);
            if (l2 != null) {
                if (!l2.isBound() || l2.isInvalid()) {
                    recycler.a(l2, false);
                } else {
                    recycler.i(l2.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return l2;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f21002a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f21003b == 0) {
                this.f21003b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.f21005a = i2;
        layoutPrefetchRegistryImpl.f21006b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j2) {
        Task task;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Task task2;
        ArrayList arrayList = this.f21002a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i2 += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.f21006b) + Math.abs(layoutPrefetchRegistryImpl.f21005a);
                for (int i6 = 0; i6 < layoutPrefetchRegistryImpl.d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        task2 = obj;
                    } else {
                        task2 = (Task) arrayList2.get(i4);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f21007c;
                    int i7 = iArr[i6 + 1];
                    task2.f21008a = i7 <= abs;
                    task2.f21009b = abs;
                    task2.f21010c = i7;
                    task2.d = recyclerView4;
                    task2.e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, f21001g);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (task = (Task) arrayList2.get(i8)).d) != null; i8++) {
            RecyclerView.ViewHolder c2 = c(recyclerView, task.e, task.f21008a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.mNestedRecyclerView != null && c2.isBound() && !c2.isInvalid() && (recyclerView2 = c2.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.f20926a.c() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView2.mPrefetchRegistry;
                layoutPrefetchRegistryImpl2.b(recyclerView2, true);
                if (layoutPrefetchRegistryImpl2.d != 0) {
                    try {
                        int i9 = TraceCompat.f18616a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        state.d = 1;
                        state.e = adapter.getItemCount();
                        state.f21105g = false;
                        state.f21106h = false;
                        state.f21107i = false;
                        for (int i10 = 0; i10 < layoutPrefetchRegistryImpl2.d * 2; i10 += 2) {
                            c(recyclerView2, layoutPrefetchRegistryImpl2.f21007c[i10], j2);
                        }
                        Trace.endSection();
                        task.f21008a = false;
                        task.f21009b = 0;
                        task.f21010c = 0;
                        task.d = null;
                        task.e = 0;
                    } catch (Throwable th) {
                        int i11 = TraceCompat.f18616a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            task.f21008a = false;
            task.f21009b = 0;
            task.f21010c = 0;
            task.d = null;
            task.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = TraceCompat.f18616a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f21002a;
            if (arrayList.isEmpty()) {
                this.f21003b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f21003b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f21004c);
                this.f21003b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f21003b = 0L;
            int i4 = TraceCompat.f18616a;
            Trace.endSection();
            throw th;
        }
    }
}
