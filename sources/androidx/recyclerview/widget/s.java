package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f2025g = new ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    public static final b0.g f2026h = new b0.g(1);

    /* renamed from: c, reason: collision with root package name */
    public long f2028c;

    /* renamed from: d, reason: collision with root package name */
    public long f2029d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2027b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2030f = new ArrayList();

    public static o1 c(RecyclerView recyclerView, int i10, long j3) {
        boolean z10;
        int h10 = recyclerView.mChildHelper.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i11));
                if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        d1 d1Var = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            o1 m10 = d1Var.m(j3, i10);
            if (m10 != null) {
                if (m10.isBound() && !m10.isInvalid()) {
                    d1Var.j(m10.itemView);
                } else {
                    d1Var.a(m10, false);
                }
            }
            return m10;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f2027b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2028c == 0) {
                this.f2028c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        q qVar = recyclerView.mPrefetchRegistry;
        qVar.a = i10;
        qVar.f2010b = i11;
    }

    public final void b(long j3) {
        r rVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        r rVar2;
        boolean z10;
        ArrayList arrayList = this.f2027b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i10 += recyclerView3.mPrefetchRegistry.f2012d;
            }
        }
        ArrayList arrayList2 = this.f2030f;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                q qVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(qVar.f2010b) + Math.abs(qVar.a);
                for (int i14 = 0; i14 < qVar.f2012d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        rVar2 = new r();
                        arrayList2.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList2.get(i12);
                    }
                    int[] iArr = qVar.f2011c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rVar2.a = z10;
                    rVar2.f2020b = abs;
                    rVar2.f2021c = i15;
                    rVar2.f2022d = recyclerView4;
                    rVar2.f2023e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f2026h);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (rVar = (r) arrayList2.get(i16)).f2022d) != null; i16++) {
            if (rVar.a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            o1 c10 = c(recyclerView, rVar.f2023e, j10);
            if (c10 != null && c10.mNestedRecyclerView != null && c10.isBound() && !c10.isInvalid() && (recyclerView2 = c10.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                q qVar2 = recyclerView2.mPrefetchRegistry;
                qVar2.b(recyclerView2, true);
                if (qVar2.f2012d != 0) {
                    try {
                        int i17 = j0.n.a;
                        Trace.beginSection("RV Nested Prefetch");
                        k1 k1Var = recyclerView2.mState;
                        j0 j0Var = recyclerView2.mAdapter;
                        k1Var.f1962d = 1;
                        k1Var.f1963e = j0Var.getItemCount();
                        k1Var.f1965g = false;
                        k1Var.f1966h = false;
                        k1Var.f1967i = false;
                        for (int i18 = 0; i18 < qVar2.f2012d * 2; i18 += 2) {
                            c(recyclerView2, qVar2.f2011c[i18], j3);
                        }
                        Trace.endSection();
                        rVar.a = false;
                        rVar.f2020b = 0;
                        rVar.f2021c = 0;
                        rVar.f2022d = null;
                        rVar.f2023e = 0;
                    } catch (Throwable th2) {
                        int i19 = j0.n.a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.a = false;
            rVar.f2020b = 0;
            rVar.f2021c = 0;
            rVar.f2022d = null;
            rVar.f2023e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = j0.n.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2027b;
            if (arrayList.isEmpty()) {
                this.f2028c = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f2028c = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f2029d);
                this.f2028c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th2) {
            this.f2028c = 0L;
            int i12 = j0.n.a;
            Trace.endSection();
            throw th2;
        }
    }
}
