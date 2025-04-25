package com.glority.android.adapterhelper.callback;

import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseItemDraggableAdapter;
import com.glority.android.adapterhelper.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ItemDragAndSwipeCallback.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J@\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J \u0010\u001f\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0016J@\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0016J\u001a\u0010'\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0018\u0010(\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0006H\u0016J\u000e\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0006J\u000e\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\bR\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/glority/android/adapterhelper/callback/ItemDragAndSwipeCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "mAdapter", "Lcom/glority/android/adapterhelper/BaseItemDraggableAdapter;", "(Lcom/glority/android/adapterhelper/BaseItemDraggableAdapter;)V", "mDragMoveFlags", "", "mMoveThreshold", "", "mSwipeMoveFlags", "mSwipeThreshold", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getMoveThreshold", "getMovementFlags", "getSwipeThreshold", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "isViewCreateByAdapter", "onChildDrawOver", "c", "Landroid/graphics/Canvas;", "dX", "dY", "actionState", "isCurrentlyActive", "onMove", "source", "target", "onMoved", "fromPos", "toPos", "x", "y", "onSelectedChanged", "onSwiped", "direction", "setDragMoveFlags", "dragMoveFlags", "setMoveThreshold", "moveThreshold", "setSwipeMoveFlags", "swipeMoveFlags", "setSwipeThreshold", "swipeThreshold", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ItemDragAndSwipeCallback extends ItemTouchHelper.Callback {
    private final BaseItemDraggableAdapter<?, ?> mAdapter;
    private int mDragMoveFlags;
    private float mMoveThreshold;
    private int mSwipeMoveFlags;
    private float mSwipeThreshold;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return false;
    }

    public ItemDragAndSwipeCallback(BaseItemDraggableAdapter<?, ?> mAdapter) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mAdapter = mAdapter;
        this.mMoveThreshold = 0.1f;
        this.mSwipeThreshold = 0.7f;
        this.mDragMoveFlags = 15;
        this.mSwipeMoveFlags = 32;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.mAdapter.getIsItemSwipeEnable();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        if (actionState == 2) {
            Intrinsics.checkNotNull(viewHolder);
            if (!isViewCreateByAdapter(viewHolder)) {
                this.mAdapter.onItemDragStart(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, true);
                super.onSelectedChanged(viewHolder, actionState);
            }
        }
        if (actionState == 1) {
            Intrinsics.checkNotNull(viewHolder);
            if (!isViewCreateByAdapter(viewHolder)) {
                this.mAdapter.onItemSwipeStart(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, true);
            }
        }
        super.onSelectedChanged(viewHolder, actionState);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        if (isViewCreateByAdapter(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R.id.BaseQuickAdapter_dragging_support) != null) {
            Object tag = viewHolder.itemView.getTag(R.id.BaseQuickAdapter_dragging_support);
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            if (((Boolean) tag).booleanValue()) {
                this.mAdapter.onItemDragEnd(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, false);
            }
        }
        if (viewHolder.itemView.getTag(R.id.BaseQuickAdapter_swiping_support) != null) {
            Object tag2 = viewHolder.itemView.getTag(R.id.BaseQuickAdapter_swiping_support);
            if (tag2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            if (((Boolean) tag2).booleanValue()) {
                this.mAdapter.onItemSwipeClear(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (isViewCreateByAdapter(viewHolder)) {
            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        return source.getItemViewType() == target.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder source, int fromPos, RecyclerView.ViewHolder target, int toPos, int x, int y) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onMoved(recyclerView, source, fromPos, target, toPos, x, y);
        this.mAdapter.onItemDragMoving(source, target);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (isViewCreateByAdapter(viewHolder)) {
            return;
        }
        this.mAdapter.onItemSwiped(viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return this.mSwipeThreshold;
    }

    public final void setSwipeThreshold(float swipeThreshold) {
        this.mSwipeThreshold = swipeThreshold;
    }

    public final void setMoveThreshold(float moveThreshold) {
        this.mMoveThreshold = moveThreshold;
    }

    public final void setDragMoveFlags(int dragMoveFlags) {
        this.mDragMoveFlags = dragMoveFlags;
    }

    public final void setSwipeMoveFlags(int swipeMoveFlags) {
        this.mSwipeMoveFlags = swipeMoveFlags;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDrawOver(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        if (actionState != 1 || isViewCreateByAdapter(viewHolder)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(viewHolder.itemView, "viewHolder.itemView");
        c.save();
        if (dX > 0.0f) {
            c.clipRect(r8.getLeft(), r8.getTop(), r8.getLeft() + dX, r8.getBottom());
            c.translate(r8.getLeft(), r8.getTop());
        } else {
            c.clipRect(r8.getRight() + dX, r8.getTop(), r8.getRight(), r8.getBottom());
            c.translate(r8.getRight() + dX, r8.getTop());
        }
        this.mAdapter.onItemSwiping(c, viewHolder, dX, dY, isCurrentlyActive);
        c.restore();
    }

    private final boolean isViewCreateByAdapter(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 273 || itemViewType == 546 || itemViewType == 819 || itemViewType == 1365;
    }
}
