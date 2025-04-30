package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0538s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f5084g = new ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    public static final C5.c f5085h = new C5.c(8);
    public ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public long f5086c;

    /* renamed from: d, reason: collision with root package name */
    public long f5087d;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5088f;

    public static p0 c(RecyclerView recyclerView, int i9, long j7) {
        int h6 = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < h6; i10++) {
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i9 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        C0525e0 c0525e0 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            p0 l = c0525e0.l(i9, j7);
            if (l != null) {
                if (l.isBound() && !l.isInvalid()) {
                    c0525e0.i(l.itemView);
                } else {
                    c0525e0.a(l, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return l;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i9, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5086c == 0) {
                this.f5086c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0537q c0537q = recyclerView.mPrefetchRegistry;
        c0537q.f5073a = i9;
        c0537q.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j7) {
        r rVar;
        RecyclerView recyclerView;
        long j9;
        RecyclerView recyclerView2;
        r rVar2;
        boolean z8;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i9 += recyclerView3.mPrefetchRegistry.f5075d;
            }
        }
        ArrayList arrayList2 = this.f5088f;
        arrayList2.ensureCapacity(i9);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0537q c0537q = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(c0537q.b) + Math.abs(c0537q.f5073a);
                for (int i13 = 0; i13 < c0537q.f5075d * 2; i13 += 2) {
                    if (i11 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        rVar2 = obj;
                    } else {
                        rVar2 = (r) arrayList2.get(i11);
                    }
                    int[] iArr = c0537q.f5074c;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    rVar2.f5078a = z8;
                    rVar2.b = abs;
                    rVar2.f5079c = i14;
                    rVar2.f5080d = recyclerView4;
                    rVar2.f5081e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList2, f5085h);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (rVar = (r) arrayList2.get(i15)).f5080d) != null; i15++) {
            if (rVar.f5078a) {
                j9 = Long.MAX_VALUE;
            } else {
                j9 = j7;
            }
            p0 c9 = c(recyclerView, rVar.f5081e, j9);
            if (c9 != null && c9.mNestedRecyclerView != null && c9.isBound() && !c9.isInvalid() && (recyclerView2 = c9.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C0537q c0537q2 = recyclerView2.mPrefetchRegistry;
                c0537q2.b(recyclerView2, true);
                if (c0537q2.f5075d != 0) {
                    try {
                        int i16 = P.n.f2266a;
                        Trace.beginSection("RV Nested Prefetch");
                        l0 l0Var = recyclerView2.mState;
                        J j10 = recyclerView2.mAdapter;
                        l0Var.f5028d = 1;
                        l0Var.f5029e = j10.getItemCount();
                        l0Var.f5031g = false;
                        l0Var.f5032h = false;
                        l0Var.f5033i = false;
                        for (int i17 = 0; i17 < c0537q2.f5075d * 2; i17 += 2) {
                            c(recyclerView2, c0537q2.f5074c[i17], j7);
                        }
                        Trace.endSection();
                        rVar.f5078a = false;
                        rVar.b = 0;
                        rVar.f5079c = 0;
                        rVar.f5080d = null;
                        rVar.f5081e = 0;
                    } catch (Throwable th) {
                        int i18 = P.n.f2266a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            rVar.f5078a = false;
            rVar.b = 0;
            rVar.f5079c = 0;
            rVar.f5080d = null;
            rVar.f5081e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i9 = P.n.f2266a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                this.f5086c = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j7 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j7 = Math.max(recyclerView.getDrawingTime(), j7);
                }
            }
            if (j7 == 0) {
                this.f5086c = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j7) + this.f5087d);
                this.f5086c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f5086c = 0L;
            int i11 = P.n.f2266a;
            Trace.endSection();
            throw th;
        }
    }
}
