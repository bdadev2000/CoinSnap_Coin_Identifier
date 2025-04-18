package androidx.recyclerview.widget;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f1 extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1910b;

    public f1(RecyclerView recyclerView) {
        this.f1910b = recyclerView;
    }

    public final void a() {
        boolean z10 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f1910b;
        if (z10 && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
            ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
        } else {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onChanged() {
        RecyclerView recyclerView = this.f1910b;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f1964f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!recyclerView.mAdapterHelper.g()) {
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeChanged(int i10, int i11, Object obj) {
        RecyclerView recyclerView = this.f1910b;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        boolean z10 = false;
        if (i11 < 1) {
            bVar.getClass();
        } else {
            ArrayList arrayList = bVar.f1862b;
            arrayList.add(bVar.h(4, i10, i11, obj));
            bVar.f1866f |= 4;
            if (arrayList.size() == 1) {
                z10 = true;
            }
        }
        if (z10) {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3.size() == 1) goto L9;
     */
    @Override // androidx.recyclerview.widget.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemRangeInserted(int r5, int r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1910b
            r1 = 0
            r0.assertNotInLayoutOrScroll(r1)
            androidx.recyclerview.widget.b r0 = r0.mAdapterHelper
            r2 = 1
            if (r6 >= r2) goto Lf
            r0.getClass()
            goto L24
        Lf:
            java.util.ArrayList r3 = r0.f1862b
            androidx.recyclerview.widget.a r5 = r0.h(r2, r5, r6, r1)
            r3.add(r5)
            int r5 = r0.f1866f
            r5 = r5 | r2
            r0.f1866f = r5
            int r5 = r3.size()
            if (r5 != r2) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L2a
            r4.a()
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.onItemRangeInserted(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r1.size() == 1) goto L9;
     */
    @Override // androidx.recyclerview.widget.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemRangeMoved(int r4, int r5, int r6) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r6 = r3.f1910b
            r0 = 0
            r6.assertNotInLayoutOrScroll(r0)
            androidx.recyclerview.widget.b r6 = r6.mAdapterHelper
            r6.getClass()
            if (r4 != r5) goto Le
            goto L26
        Le:
            java.util.ArrayList r1 = r6.f1862b
            r2 = 8
            androidx.recyclerview.widget.a r4 = r6.h(r2, r4, r5, r0)
            r1.add(r4)
            int r4 = r6.f1866f
            r4 = r4 | r2
            r6.f1866f = r4
            int r4 = r1.size()
            r5 = 1
            if (r4 != r5) goto L26
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L2c
            r3.a()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.onItemRangeMoved(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3.size() == 1) goto L9;
     */
    @Override // androidx.recyclerview.widget.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onItemRangeRemoved(int r6, int r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f1910b
            r1 = 0
            r0.assertNotInLayoutOrScroll(r1)
            androidx.recyclerview.widget.b r0 = r0.mAdapterHelper
            r2 = 1
            if (r7 >= r2) goto Lf
            r0.getClass()
            goto L25
        Lf:
            java.util.ArrayList r3 = r0.f1862b
            r4 = 2
            androidx.recyclerview.widget.a r6 = r0.h(r4, r6, r7, r1)
            r3.add(r6)
            int r6 = r0.f1866f
            r6 = r6 | r4
            r0.f1866f = r6
            int r6 = r3.size()
            if (r6 != r2) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L2b
            r5.a()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f1.onItemRangeRemoved(int, int):void");
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onStateRestorationPolicyChanged() {
        j0 j0Var;
        RecyclerView recyclerView = this.f1910b;
        if (recyclerView.mPendingSavedState != null && (j0Var = recyclerView.mAdapter) != null && j0Var.canRestoreState()) {
            recyclerView.requestLayout();
        }
    }
}
