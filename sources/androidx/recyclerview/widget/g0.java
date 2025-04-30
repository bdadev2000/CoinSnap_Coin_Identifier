package androidx.recyclerview.widget;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 extends L {
    public final /* synthetic */ RecyclerView b;

    public g0(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    public final void a() {
        boolean z8 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.b;
        if (z8 && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
            ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
        } else {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onChanged() {
        RecyclerView recyclerView = this.b;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f5030f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!recyclerView.mAdapterHelper.g()) {
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeChanged(int i9, int i10, Object obj) {
        RecyclerView recyclerView = this.b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0518b c0518b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c0518b.getClass();
            return;
        }
        ArrayList arrayList = c0518b.b;
        arrayList.add(c0518b.h(4, i9, i10, obj));
        c0518b.f4957f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeInserted(int i9, int i10) {
        RecyclerView recyclerView = this.b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0518b c0518b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c0518b.getClass();
            return;
        }
        ArrayList arrayList = c0518b.b;
        arrayList.add(c0518b.h(1, i9, i10, null));
        c0518b.f4957f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeMoved(int i9, int i10, int i11) {
        RecyclerView recyclerView = this.b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0518b c0518b = recyclerView.mAdapterHelper;
        c0518b.getClass();
        if (i9 != i10) {
            ArrayList arrayList = c0518b.b;
            arrayList.add(c0518b.h(8, i9, i10, null));
            c0518b.f4957f |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeRemoved(int i9, int i10) {
        RecyclerView recyclerView = this.b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0518b c0518b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c0518b.getClass();
            return;
        }
        ArrayList arrayList = c0518b.b;
        arrayList.add(c0518b.h(2, i9, i10, null));
        c0518b.f4957f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onStateRestorationPolicyChanged() {
        J j7;
        RecyclerView recyclerView = this.b;
        if (recyclerView.mPendingSavedState != null && (j7 = recyclerView.mAdapter) != null && j7.canRestoreState()) {
            recyclerView.requestLayout();
        }
    }
}
