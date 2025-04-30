package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class H implements D0, O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4935a;

    public /* synthetic */ H(RecyclerView recyclerView) {
        this.f4935a = recyclerView;
    }

    public void a(C0516a c0516a) {
        int i9 = c0516a.f4950a;
        RecyclerView recyclerView = this.f4935a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 == 8) {
                        recyclerView.mLayout.onItemsMoved(recyclerView, c0516a.b, c0516a.f4952d, 1);
                        return;
                    }
                    return;
                }
                recyclerView.mLayout.onItemsUpdated(recyclerView, c0516a.b, c0516a.f4952d, c0516a.f4951c);
                return;
            }
            recyclerView.mLayout.onItemsRemoved(recyclerView, c0516a.b, c0516a.f4952d);
            return;
        }
        recyclerView.mLayout.onItemsAdded(recyclerView, c0516a.b, c0516a.f4952d);
    }

    public p0 b(int i9) {
        RecyclerView recyclerView = this.f4935a;
        p0 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i9, true);
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

    public void c(int i9) {
        RecyclerView recyclerView = this.f4935a;
        View childAt = recyclerView.getChildAt(i9);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i9);
    }
}
