package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class h0 implements c2, o0 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ h0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(a aVar) {
        int i10 = aVar.a;
        RecyclerView recyclerView = this.a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        recyclerView.mLayout.onItemsMoved(recyclerView, aVar.f1855b, aVar.f1857d, 1);
                        return;
                    }
                    return;
                }
                recyclerView.mLayout.onItemsUpdated(recyclerView, aVar.f1855b, aVar.f1857d, aVar.f1856c);
                return;
            }
            recyclerView.mLayout.onItemsRemoved(recyclerView, aVar.f1855b, aVar.f1857d);
            return;
        }
        recyclerView.mLayout.onItemsAdded(recyclerView, aVar.f1855b, aVar.f1857d);
    }

    public final o1 b(int i10) {
        RecyclerView recyclerView = this.a;
        o1 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i10, true);
        if (findViewHolderForPosition == null) {
            return null;
        }
        if (recyclerView.mChildHelper.k(findViewHolderForPosition.itemView)) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
        return findViewHolderForPosition;
    }

    public final int c() {
        return this.a.getChildCount();
    }

    public final void d(int i10) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
