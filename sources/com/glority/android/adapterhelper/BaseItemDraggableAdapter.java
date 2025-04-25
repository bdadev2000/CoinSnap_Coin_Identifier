package com.glority.android.adapterhelper;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.listener.OnItemDragListener;
import com.glority.android.adapterhelper.listener.OnItemSwipeListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: BaseItemDraggableAdapter.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b&\u0018\u0000 ^*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001^B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J$\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020\u00162\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u000bH\u0007J\u0006\u0010?\u001a\u000209J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BJ\u0010\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u0006H\u0002J\u001d\u0010E\u001a\u0002092\u0006\u0010F\u001a\u00028\u00012\u0006\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u0002092\u0006\u0010A\u001a\u00020BJ\u0016\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020B2\u0006\u0010K\u001a\u00020BJ\u000e\u0010L\u001a\u0002092\u0006\u0010A\u001a\u00020BJ\u000e\u0010M\u001a\u0002092\u0006\u0010A\u001a\u00020BJ\u000e\u0010N\u001a\u0002092\u0006\u0010A\u001a\u00020BJ\u000e\u0010O\u001a\u0002092\u0006\u0010A\u001a\u00020BJ2\u0010P\u001a\u0002092\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u000bJ\u0010\u0010W\u001a\u0002092\b\u0010X\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010Y\u001a\u0002092\b\u0010Z\u001a\u0004\u0018\u00010\"J\u000e\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020\u000bJ\u000e\u0010]\u001a\u0002092\u0006\u0010=\u001a\u00020\u0006R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006_"}, d2 = {"Lcom/glority/android/adapterhelper/BaseItemDraggableAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "K", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "layoutResId", "", "data", "", "(ILjava/util/List;)V", "<set-?>", "", "isItemDraggable", "()Z", "setItemDraggable", "(Z)V", "isItemSwipeEnable", "setItemSwipeEnable", "mDragOnLongPress", "getMDragOnLongPress", "setMDragOnLongPress", "mItemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "getMItemTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "setMItemTouchHelper", "(Landroidx/recyclerview/widget/ItemTouchHelper;)V", "mOnItemDragListener", "Lcom/glority/android/adapterhelper/listener/OnItemDragListener;", "getMOnItemDragListener", "()Lcom/glority/android/adapterhelper/listener/OnItemDragListener;", "setMOnItemDragListener", "(Lcom/glority/android/adapterhelper/listener/OnItemDragListener;)V", "mOnItemSwipeListener", "Lcom/glority/android/adapterhelper/listener/OnItemSwipeListener;", "getMOnItemSwipeListener", "()Lcom/glority/android/adapterhelper/listener/OnItemSwipeListener;", "setMOnItemSwipeListener", "(Lcom/glority/android/adapterhelper/listener/OnItemSwipeListener;)V", "mOnToggleViewLongClickListener", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "mOnToggleViewTouchListener", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "mToggleViewId", "getMToggleViewId", "()I", "setMToggleViewId", "(I)V", "disableDragItem", "", "disableSwipeItem", "enableDragItem", "itemTouchHelper", "toggleViewId", "dragOnLongPress", "enableSwipeItem", "getViewHolderPosition", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inRange", "position", "onBindViewHolder", "holder", "(Lcom/glority/android/adapterhelper/BaseViewHolder;I)V", "onItemDragEnd", "onItemDragMoving", "source", "target", "onItemDragStart", "onItemSwipeClear", "onItemSwipeStart", "onItemSwiped", "onItemSwiping", "canvas", "Landroid/graphics/Canvas;", "dX", "", "dY", "isCurrentlyActive", "setOnItemDragListener", "onItemDragListener", "setOnItemSwipeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setToggleDragOnLongPress", "longPress", "setToggleViewId", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class BaseItemDraggableAdapter<T, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int NO_TOGGLE_VIEW = 0;
    private boolean isItemDraggable;
    private boolean isItemSwipeEnable;
    private boolean mDragOnLongPress;
    private ItemTouchHelper mItemTouchHelper;
    private OnItemDragListener mOnItemDragListener;
    private OnItemSwipeListener mOnItemSwipeListener;
    private View.OnLongClickListener mOnToggleViewLongClickListener;
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int mToggleViewId;

    public final void enableDragItem(ItemTouchHelper itemTouchHelper) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        enableDragItem$default(this, itemTouchHelper, 0, false, 6, null);
    }

    public final void enableDragItem(ItemTouchHelper itemTouchHelper, int i) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        enableDragItem$default(this, itemTouchHelper, i, false, 4, null);
    }

    public BaseItemDraggableAdapter(int i, List<T> list) {
        super(i, list);
        this.mDragOnLongPress = true;
    }

    protected final int getMToggleViewId() {
        return this.mToggleViewId;
    }

    protected final void setMToggleViewId(int i) {
        this.mToggleViewId = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ItemTouchHelper getMItemTouchHelper() {
        return this.mItemTouchHelper;
    }

    protected final void setMItemTouchHelper(ItemTouchHelper itemTouchHelper) {
        this.mItemTouchHelper = itemTouchHelper;
    }

    /* renamed from: isItemDraggable, reason: from getter */
    public final boolean getIsItemDraggable() {
        return this.isItemDraggable;
    }

    protected final void setItemDraggable(boolean z) {
        this.isItemDraggable = z;
    }

    /* renamed from: isItemSwipeEnable, reason: from getter */
    public final boolean getIsItemSwipeEnable() {
        return this.isItemSwipeEnable;
    }

    protected final void setItemSwipeEnable(boolean z) {
        this.isItemSwipeEnable = z;
    }

    protected final OnItemDragListener getMOnItemDragListener() {
        return this.mOnItemDragListener;
    }

    protected final void setMOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    protected final OnItemSwipeListener getMOnItemSwipeListener() {
        return this.mOnItemSwipeListener;
    }

    protected final void setMOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getMDragOnLongPress() {
        return this.mDragOnLongPress;
    }

    protected final void setMDragOnLongPress(boolean z) {
        this.mDragOnLongPress = z;
    }

    protected final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    protected final void setMOnToggleViewTouchListener(View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    protected final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    protected final void setMOnToggleViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder((BaseItemDraggableAdapter<T, K>) holder, position);
        int itemViewType = holder.getItemViewType();
        if (this.mItemTouchHelper == null || !this.isItemDraggable || itemViewType == 546 || itemViewType == 273 || itemViewType == 1365 || itemViewType == 819) {
            return;
        }
        int i = this.mToggleViewId;
        if (i != 0) {
            View view = holder.getView(i);
            if (view != null) {
                view.setTag(R.id.BaseQuickAdapter_viewholder_support, holder);
                if (this.mDragOnLongPress) {
                    view.setOnLongClickListener(this.mOnToggleViewLongClickListener);
                    return;
                } else {
                    view.setOnTouchListener(this.mOnToggleViewTouchListener);
                    return;
                }
            }
            return;
        }
        holder.itemView.setTag(R.id.BaseQuickAdapter_viewholder_support, holder);
        holder.itemView.setOnLongClickListener(this.mOnToggleViewLongClickListener);
    }

    public final void setToggleViewId(int toggleViewId) {
        this.mToggleViewId = toggleViewId;
    }

    public final void setToggleDragOnLongPress(boolean longPress) {
        this.mDragOnLongPress = longPress;
        if (longPress) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener(this) { // from class: com.glority.android.adapterhelper.BaseItemDraggableAdapter$setToggleDragOnLongPress$1
                final /* synthetic */ BaseItemDraggableAdapter<T, K> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    if (this.this$0.getMItemTouchHelper() == null || !this.this$0.getIsItemDraggable()) {
                        return true;
                    }
                    ItemTouchHelper mItemTouchHelper = this.this$0.getMItemTouchHelper();
                    Intrinsics.checkNotNull(mItemTouchHelper);
                    Object tag = v.getTag(R.id.BaseQuickAdapter_viewholder_support);
                    if (tag == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
                    }
                    mItemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener(this) { // from class: com.glority.android.adapterhelper.BaseItemDraggableAdapter$setToggleDragOnLongPress$2
                final /* synthetic */ BaseItemDraggableAdapter<T, K> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View v, MotionEvent event) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (MotionEventCompat.getActionMasked(event) != 0 || this.this$0.getMDragOnLongPress()) {
                        return false;
                    }
                    if (this.this$0.getMItemTouchHelper() != null && this.this$0.getIsItemDraggable()) {
                        ItemTouchHelper mItemTouchHelper = this.this$0.getMItemTouchHelper();
                        Intrinsics.checkNotNull(mItemTouchHelper);
                        Object tag = v.getTag(R.id.BaseQuickAdapter_viewholder_support);
                        if (tag == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
                        }
                        mItemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
                    }
                    return true;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public static /* synthetic */ void enableDragItem$default(BaseItemDraggableAdapter baseItemDraggableAdapter, ItemTouchHelper itemTouchHelper, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableDragItem");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        baseItemDraggableAdapter.enableDragItem(itemTouchHelper, i, z);
    }

    public final void enableDragItem(ItemTouchHelper itemTouchHelper, int toggleViewId, boolean dragOnLongPress) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        this.isItemDraggable = true;
        this.mItemTouchHelper = itemTouchHelper;
        setToggleViewId(toggleViewId);
        setToggleDragOnLongPress(dragOnLongPress);
    }

    public final void disableDragItem() {
        this.isItemDraggable = false;
        this.mItemTouchHelper = null;
    }

    public final void enableSwipeItem() {
        this.isItemSwipeEnable = true;
    }

    public final void disableSwipeItem() {
        this.isItemSwipeEnable = false;
    }

    public final void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    public final int getViewHolderPosition(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - getHeaderLayoutCount();
    }

    public final void onItemDragStart(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.isItemDraggable) {
            return;
        }
        Intrinsics.checkNotNull(onItemDragListener);
        onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public final void onItemDragMoving(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        int viewHolderPosition = getViewHolderPosition(source);
        int viewHolderPosition2 = getViewHolderPosition(target);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition >= viewHolderPosition2) {
                int i = viewHolderPosition2 + 1;
                if (i <= viewHolderPosition) {
                    int i2 = viewHolderPosition;
                    while (true) {
                        int i3 = i2 - 1;
                        Collections.swap(getMData(), i2, i2 - 1);
                        if (i2 == i) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
            } else if (viewHolderPosition < viewHolderPosition2) {
                int i4 = viewHolderPosition;
                while (true) {
                    int i5 = i4 + 1;
                    Collections.swap(getMData(), i4, i5);
                    if (i5 >= viewHolderPosition2) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.isItemDraggable) {
            return;
        }
        Intrinsics.checkNotNull(onItemDragListener);
        onItemDragListener.onItemDragMoving(source, viewHolderPosition, target, viewHolderPosition2);
    }

    public final void onItemDragEnd(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.isItemDraggable) {
            return;
        }
        Intrinsics.checkNotNull(onItemDragListener);
        onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
    }

    public final void setOnItemSwipeListener(OnItemSwipeListener listener) {
        this.mOnItemSwipeListener = listener;
    }

    public final void onItemSwipeStart(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.isItemSwipeEnable) {
            return;
        }
        Intrinsics.checkNotNull(onItemSwipeListener);
        onItemSwipeListener.onItemSwipeStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public final void onItemSwipeClear(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.isItemSwipeEnable) {
            return;
        }
        Intrinsics.checkNotNull(onItemSwipeListener);
        onItemSwipeListener.clearView(viewHolder, getViewHolderPosition(viewHolder));
    }

    public final void onItemSwiped(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            List<T> mData = getMData();
            if (!TypeIntrinsics.isMutableList(mData)) {
                mData = null;
            }
            if (mData != null) {
                mData.remove(viewHolderPosition);
            }
            notifyItemRemoved(viewHolder.getAdapterPosition());
            OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
            if (onItemSwipeListener == null || !this.isItemSwipeEnable) {
                return;
            }
            Intrinsics.checkNotNull(onItemSwipeListener);
            onItemSwipeListener.onItemSwiped(viewHolder, viewHolderPosition);
        }
    }

    public final void onItemSwiping(Canvas canvas, RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.isItemSwipeEnable) {
            return;
        }
        Intrinsics.checkNotNull(onItemSwipeListener);
        onItemSwipeListener.onItemSwipeMoving(canvas, viewHolder, dX, dY, isCurrentlyActive);
    }

    private final boolean inRange(int position) {
        return position >= 0 && position < getMData().size();
    }
}
