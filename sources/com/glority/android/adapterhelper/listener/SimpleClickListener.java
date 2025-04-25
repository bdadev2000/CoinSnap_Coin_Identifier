package com.glority.android.adapterhelper.listener;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.listener.SimpleClickListener;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleClickListener.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J,\u0010\u001e\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&J,\u0010!\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&J,\u0010\"\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&J,\u0010#\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u001a\u0010'\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R$\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/glority/android/adapterhelper/listener/SimpleClickListener;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "()V", "baseQuickAdapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "getBaseQuickAdapter", "()Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "setBaseQuickAdapter", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter;)V", "mGestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "mIsPrepressed", "", "mIsShowPress", "mPressedView", "Landroid/view/View;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "inRangeOfView", "view", "ev", "Landroid/view/MotionEvent;", "isHeaderOrFooterPosition", "position", "", "isHeaderOrFooterView", "type", "onInterceptTouchEvent", "rv", "e", "onItemChildClick", "", "adapter", "onItemChildLongClick", "onItemClick", "onItemLongClick", "onRequestDisallowInterceptTouchEvent", "disallowIntercept", "onTouchEvent", "setPressViewHotSpot", "Companion", "ItemTouchHelperGestureListener", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class SimpleClickListener implements RecyclerView.OnItemTouchListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String TAG = "SimpleClickListener";
    private BaseQuickAdapter<?, ?> baseQuickAdapter;
    private GestureDetectorCompat mGestureDetector;
    private boolean mIsPrepressed;
    private boolean mIsShowPress;
    private View mPressedView;
    private RecyclerView recyclerView;

    private final boolean isHeaderOrFooterView(int type) {
        return type == 1365 || type == 273 || type == 819 || type == 546;
    }

    public abstract void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position);

    public abstract void onItemChildLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position);

    public abstract void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position);

    public abstract void onItemLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position);

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    protected final BaseQuickAdapter<?, ?> getBaseQuickAdapter() {
        return this.baseQuickAdapter;
    }

    protected final void setBaseQuickAdapter(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.baseQuickAdapter = baseQuickAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            this.recyclerView = rv;
            Intrinsics.checkNotNull(rv);
            this.baseQuickAdapter = (BaseQuickAdapter) rv.getAdapter();
            RecyclerView recyclerView2 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView2);
            Context context = recyclerView2.getContext();
            RecyclerView recyclerView3 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView3);
            this.mGestureDetector = new GestureDetectorCompat(context, new ItemTouchHelperGestureListener(this, recyclerView3));
        } else if (recyclerView != rv) {
            this.recyclerView = rv;
            Intrinsics.checkNotNull(rv);
            this.baseQuickAdapter = (BaseQuickAdapter) rv.getAdapter();
            RecyclerView recyclerView4 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView4);
            Context context2 = recyclerView4.getContext();
            RecyclerView recyclerView5 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView5);
            this.mGestureDetector = new GestureDetectorCompat(context2, new ItemTouchHelperGestureListener(this, recyclerView5));
        }
        GestureDetectorCompat gestureDetectorCompat = this.mGestureDetector;
        Intrinsics.checkNotNull(gestureDetectorCompat);
        if (!gestureDetectorCompat.onTouchEvent(e) && e.getActionMasked() == 1 && this.mIsShowPress) {
            if (this.mPressedView != null) {
                RecyclerView recyclerView6 = this.recyclerView;
                Intrinsics.checkNotNull(recyclerView6);
                View view = this.mPressedView;
                Intrinsics.checkNotNull(view);
                RecyclerView.ViewHolder childViewHolder = recyclerView6.getChildViewHolder(view);
                if (childViewHolder == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.android.adapterhelper.BaseViewHolder");
                }
                if (!isHeaderOrFooterView(((BaseViewHolder) childViewHolder).getItemViewType())) {
                    View view2 = this.mPressedView;
                    Intrinsics.checkNotNull(view2);
                    view2.setPressed(false);
                }
            }
            this.mIsShowPress = false;
            this.mIsPrepressed = false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        GestureDetectorCompat gestureDetectorCompat = this.mGestureDetector;
        Intrinsics.checkNotNull(gestureDetectorCompat);
        gestureDetectorCompat.onTouchEvent(e);
    }

    /* compiled from: SimpleClickListener.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/adapterhelper/listener/SimpleClickListener$ItemTouchHelperGestureListener;", "Landroid/view/GestureDetector$OnGestureListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Lcom/glority/android/adapterhelper/listener/SimpleClickListener;Landroidx/recyclerview/widget/RecyclerView;)V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onScroll", "distanceX", "distanceY", "onShowPress", "onSingleTapUp", "resetPressedView", "pressedView", "Landroid/view/View;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    private final class ItemTouchHelperGestureListener implements GestureDetector.OnGestureListener {
        private final RecyclerView recyclerView;
        final /* synthetic */ SimpleClickListener this$0;

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            return false;
        }

        public ItemTouchHelperGestureListener(SimpleClickListener this$0, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            this.this$0 = this$0;
            this.recyclerView = recyclerView;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.this$0.mIsPrepressed = true;
            this.this$0.mPressedView = this.recyclerView.findChildViewUnder(e.getX(), e.getY());
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (!this.this$0.mIsPrepressed || this.this$0.mPressedView == null) {
                return;
            }
            this.this$0.mIsShowPress = true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.this$0.mIsPrepressed && this.this$0.mPressedView != null) {
                if (this.recyclerView.getScrollState() != 0 || this.this$0.getBaseQuickAdapter() == null) {
                    return false;
                }
                View view = this.this$0.mPressedView;
                Intrinsics.checkNotNull(view);
                RecyclerView.ViewHolder childViewHolder = this.recyclerView.getChildViewHolder(view);
                if (childViewHolder == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.android.adapterhelper.BaseViewHolder");
                }
                BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
                int adapterPosition = baseViewHolder.getAdapterPosition();
                if (adapterPosition == -1 || this.this$0.isHeaderOrFooterPosition(adapterPosition)) {
                    return false;
                }
                BaseQuickAdapter<?, ?> baseQuickAdapter = this.this$0.getBaseQuickAdapter();
                Intrinsics.checkNotNull(baseQuickAdapter);
                int headerLayoutCount = adapterPosition - baseQuickAdapter.getHeaderLayoutCount();
                HashSet<Integer> childClickViewIds = baseViewHolder.getChildClickViewIds();
                Set<Integer> nestViews = baseViewHolder.getNestViews();
                if (!(!childClickViewIds.isEmpty())) {
                    this.this$0.setPressViewHotSpot(e, view);
                    View view2 = this.this$0.mPressedView;
                    Intrinsics.checkNotNull(view2);
                    view2.setPressed(true);
                    if (childClickViewIds != null && childClickViewIds.size() > 0) {
                        for (Integer num : childClickViewIds) {
                            Intrinsics.checkNotNull(num);
                            View findViewById = view.findViewById(num.intValue());
                            if (findViewById != null) {
                                findViewById.setPressed(false);
                            }
                        }
                    }
                    SimpleClickListener simpleClickListener = this.this$0;
                    simpleClickListener.onItemClick(simpleClickListener.getBaseQuickAdapter(), view, headerLayoutCount);
                } else {
                    for (Integer num2 : childClickViewIds) {
                        Intrinsics.checkNotNull(num2);
                        View findViewById2 = view.findViewById(num2.intValue());
                        if (findViewById2 != null) {
                            if (this.this$0.inRangeOfView(findViewById2, e) && findViewById2.isEnabled()) {
                                if (nestViews.contains(num2)) {
                                    return false;
                                }
                                this.this$0.setPressViewHotSpot(e, findViewById2);
                                findViewById2.setPressed(true);
                                SimpleClickListener simpleClickListener2 = this.this$0;
                                simpleClickListener2.onItemChildClick(simpleClickListener2.getBaseQuickAdapter(), findViewById2, headerLayoutCount);
                                resetPressedView(findViewById2);
                                return true;
                            }
                            findViewById2.setPressed(false);
                        }
                    }
                    this.this$0.setPressViewHotSpot(e, view);
                    View view3 = this.this$0.mPressedView;
                    Intrinsics.checkNotNull(view3);
                    view3.setPressed(true);
                    for (Integer num3 : childClickViewIds) {
                        Intrinsics.checkNotNull(num3);
                        View findViewById3 = view.findViewById(num3.intValue());
                        if (findViewById3 != null) {
                            findViewById3.setPressed(false);
                        }
                    }
                    SimpleClickListener simpleClickListener3 = this.this$0;
                    simpleClickListener3.onItemClick(simpleClickListener3.getBaseQuickAdapter(), view, headerLayoutCount);
                }
                resetPressedView(view);
            }
            return true;
        }

        private final void resetPressedView(final View pressedView) {
            if (pressedView != null) {
                pressedView.postDelayed(new Runnable() { // from class: com.glority.android.adapterhelper.listener.SimpleClickListener$ItemTouchHelperGestureListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleClickListener.ItemTouchHelperGestureListener.m7694resetPressedView$lambda0(pressedView);
                    }
                }, 50L);
            }
            this.this$0.mIsPrepressed = false;
            this.this$0.mPressedView = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: resetPressedView$lambda-0, reason: not valid java name */
        public static final void m7694resetPressedView$lambda0(View view) {
            if (view != null) {
                view.setPressed(false);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.recyclerView.getScrollState() != 0 || this.this$0.getBaseQuickAdapter() == null || !this.this$0.mIsPrepressed || this.this$0.mPressedView == null) {
                return;
            }
            View view = this.this$0.mPressedView;
            Intrinsics.checkNotNull(view);
            view.performHapticFeedback(0);
            RecyclerView recyclerView = this.recyclerView;
            View view2 = this.this$0.mPressedView;
            Intrinsics.checkNotNull(view2);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view2);
            if (childViewHolder == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.glority.android.adapterhelper.BaseViewHolder");
            }
            BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
            int adapterPosition = baseViewHolder.getAdapterPosition();
            if (adapterPosition == -1 || this.this$0.isHeaderOrFooterPosition(adapterPosition)) {
                return;
            }
            HashSet<Integer> itemChildLongClickViewIds = baseViewHolder.getItemChildLongClickViewIds();
            Set<Integer> nestViews = baseViewHolder.getNestViews();
            if (itemChildLongClickViewIds.size() > 0) {
                for (Integer num : itemChildLongClickViewIds) {
                    View view3 = this.this$0.mPressedView;
                    Intrinsics.checkNotNull(view3);
                    Intrinsics.checkNotNull(num);
                    View findViewById = view3.findViewById(num.intValue());
                    if (this.this$0.inRangeOfView(findViewById, e) && findViewById.isEnabled()) {
                        if (nestViews.contains(num)) {
                            return;
                        }
                        this.this$0.setPressViewHotSpot(e, findViewById);
                        SimpleClickListener simpleClickListener = this.this$0;
                        BaseQuickAdapter<?, ?> baseQuickAdapter = simpleClickListener.getBaseQuickAdapter();
                        BaseQuickAdapter<?, ?> baseQuickAdapter2 = this.this$0.getBaseQuickAdapter();
                        Intrinsics.checkNotNull(baseQuickAdapter2);
                        simpleClickListener.onItemChildLongClick(baseQuickAdapter, findViewById, adapterPosition - baseQuickAdapter2.getHeaderLayoutCount());
                        findViewById.setPressed(true);
                        this.this$0.mIsShowPress = true;
                        return;
                    }
                }
            }
            SimpleClickListener simpleClickListener2 = this.this$0;
            BaseQuickAdapter<?, ?> baseQuickAdapter3 = simpleClickListener2.getBaseQuickAdapter();
            View view4 = this.this$0.mPressedView;
            BaseQuickAdapter<?, ?> baseQuickAdapter4 = this.this$0.getBaseQuickAdapter();
            Intrinsics.checkNotNull(baseQuickAdapter4);
            simpleClickListener2.onItemLongClick(baseQuickAdapter3, view4, adapterPosition - baseQuickAdapter4.getHeaderLayoutCount());
            SimpleClickListener simpleClickListener3 = this.this$0;
            simpleClickListener3.setPressViewHotSpot(e, simpleClickListener3.mPressedView);
            View view5 = this.this$0.mPressedView;
            Intrinsics.checkNotNull(view5);
            view5.setPressed(true);
            for (Integer num2 : itemChildLongClickViewIds) {
                View view6 = this.this$0.mPressedView;
                Intrinsics.checkNotNull(view6);
                Intrinsics.checkNotNull(num2);
                View findViewById2 = view6.findViewById(num2.intValue());
                if (findViewById2 != null) {
                    findViewById2.setPressed(false);
                }
            }
            this.this$0.mIsShowPress = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPressViewHotSpot(MotionEvent e, View mPressedView) {
        if (mPressedView == null || mPressedView.getBackground() == null) {
            return;
        }
        mPressedView.getBackground().setHotspot(e.getRawX(), e.getY() - mPressedView.getY());
    }

    public final boolean inRangeOfView(View view, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int[] iArr = new int[2];
        if (view == null || !view.isShown()) {
            return false;
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return ev.getRawX() >= ((float) i) && ev.getRawX() <= ((float) (i + view.getWidth())) && ev.getRawY() >= ((float) i2) && ev.getRawY() <= ((float) (i2 + view.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHeaderOrFooterPosition(int position) {
        if (this.baseQuickAdapter == null) {
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView == null) {
                return false;
            }
            Intrinsics.checkNotNull(recyclerView);
            this.baseQuickAdapter = (BaseQuickAdapter) recyclerView.getAdapter();
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.baseQuickAdapter;
        Intrinsics.checkNotNull(baseQuickAdapter);
        int itemViewType = baseQuickAdapter.getItemViewType(position);
        return itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546;
    }

    /* compiled from: SimpleClickListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/adapterhelper/listener/SimpleClickListener$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG() {
            return SimpleClickListener.TAG;
        }

        public final void setTAG(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SimpleClickListener.TAG = str;
        }
    }
}
