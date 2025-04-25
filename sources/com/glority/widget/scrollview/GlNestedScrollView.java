package com.glority.widget.scrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class GlNestedScrollView extends ViewGroup implements ScrollingView, NestedScrollingParent2, NestedScrollingChild2 {
    private static final int MAX_CYCLE_COUNT = 1000;
    private static final int SCROLL_HORIZONTAL = 2;
    private static final int SCROLL_NONE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final int SCROLL_VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new Interpolator() { // from class: com.glority.widget.scrollview.GlNestedScrollView$$ExternalSyntheticLambda0
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return GlNestedScrollView.lambda$static$0(f);
        }
    };
    private int SCROLL_ORIENTATION;
    private boolean disableChildHorizontalScroll;
    private boolean isBrake;
    private boolean isPermanent;
    private boolean isTouchNotTriggerScrollStick;
    private int mActivePointerId;
    private int mAdjust;
    private int mAdjustHeightOffset;
    private VelocityTracker mAdjustVelocityTracker;
    private int mAdjustYVelocity;
    private boolean mAutoAdjustHeightAtBottomView;
    private final NestedScrollingChildHelper mChildHelper;
    private View mCurrentStickyView;
    private final List<View> mCurrentStickyViews;
    private int mCycleCount;
    private final int[] mDownLocation;
    private EdgeEffect mEdgeGlowBottom;
    private EdgeEffect mEdgeGlowTop;
    private int mEventX;
    private int mEventY;
    private final HashMap<Integer, Float> mFixedYMap;
    private int mLastScrollerY;
    private final int mMaximumVelocity;
    private final int mMinimumVelocity;
    private int mNestedYOffset;
    private int mOldScrollY;
    private OnPermanentStickyChangeListener mOnPermanentStickyChangeListener;
    protected OnScrollChangeListener mOnScrollChangeListener;
    private OnStickyChangeListener mOnStickyChangeListener;
    private final NestedScrollingParentHelper mParentHelper;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    int mScrollRange;
    private int mScrollState;
    private int mScrollToIndex;
    private int mScrollToIndexWithOffset;
    private View mScrollToTopView;
    private final OverScroller mScroller;
    private int mSecondScrollY;
    private int mSmoothScrollOffset;
    private int mStickyOffset;
    private final List<View> mTempStickyViews;
    private final int mTouchSlop;
    private int mTouchY;
    private boolean mTouching;
    private VelocityTracker mVelocityTracker;
    private final List<View> mViews;

    /* loaded from: classes12.dex */
    public interface OnPermanentStickyChangeListener {
        void onStickyChange(List<View> list);
    }

    /* loaded from: classes12.dex */
    public interface OnScrollChangeListener {
        void onScrollChange(View view, int i, int i2, int i3);
    }

    /* loaded from: classes12.dex */
    public interface OnStickyChangeListener {
        void onStickyChange(View view, View view2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void onScrollStateChanged(int i) {
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
    }

    public GlNestedScrollView(Context context) {
        this(context, null);
    }

    public GlNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFixedYMap = new HashMap<>();
        this.mDownLocation = new int[2];
        this.mTouching = false;
        this.SCROLL_ORIENTATION = 0;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollToIndex = -1;
        this.mSmoothScrollOffset = 0;
        this.mScrollToIndexWithOffset = 0;
        this.mCycleCount = 0;
        this.mCurrentStickyViews = new ArrayList();
        this.mTempStickyViews = new ArrayList();
        this.mOldScrollY = 0;
        this.mViews = new ArrayList();
        this.mNestedYOffset = 0;
        this.mScrollState = 0;
        this.isTouchNotTriggerScrollStick = false;
        this.isBrake = false;
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.GlNestedScrollView);
            this.isPermanent = typedArray.getBoolean(R.styleable.GlNestedScrollView_isPermanent, false);
            this.disableChildHorizontalScroll = typedArray.getBoolean(R.styleable.GlNestedScrollView_disableChildHorizontalScroll, false);
            this.mStickyOffset = typedArray.getDimensionPixelOffset(R.styleable.GlNestedScrollView_stickyOffset, 0);
            this.mAutoAdjustHeightAtBottomView = typedArray.getBoolean(R.styleable.GlNestedScrollView_autoAdjustHeightAtBottomView, false);
            this.mAdjustHeightOffset = typedArray.getDimensionPixelOffset(R.styleable.GlNestedScrollView_adjustHeightOffset, 0);
            this.mScroller = new OverScroller(getContext(), sQuinticInterpolator);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            setWillNotDraw(false);
            setVerticalScrollBarEnabled(true);
            this.mParentHelper = new NestedScrollingParentHelper(this);
            this.mChildHelper = new NestedScrollingChildHelper(this);
            setNestedScrollingEnabled(true);
            setChildrenDrawingOrderEnabled(true);
            setMotionEventSplittingEnabled(false);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            wipeTopBottomMargin((LayoutParams) layoutParams);
        }
        super.addView(view, i, layoutParams);
        disableCoordinateChildScrollIfNeeded(view);
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    protected boolean addViewInLayout(View view) {
        return addViewInLayout(view, -1);
    }

    protected boolean addViewInLayout(View view, int i) {
        return super.addViewInLayout(view, i, generateDefaultLayoutParams());
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (layoutParams instanceof LayoutParams) {
            wipeTopBottomMargin((LayoutParams) layoutParams);
        }
        boolean addViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (addViewInLayout) {
            disableCoordinateChildScrollIfNeeded(view);
        }
        return addViewInLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void disableCoordinateChildScrollIfNeeded(View view) {
        List<View> scrolledViews;
        if (GlScrollUtils.isCoordinateScrollerChild(view)) {
            View scrollChild = GlScrollUtils.getScrollChild(view);
            disableChildScroll(scrollChild);
            if (!(scrollChild instanceof GlNestedScroller) || (scrolledViews = ((GlNestedScroller) scrollChild).getScrolledViews()) == null || scrolledViews.isEmpty()) {
                return;
            }
            int size = scrolledViews.size();
            for (int i = 0; i < size; i++) {
                disableChildScroll(scrolledViews.get(i));
            }
        }
    }

    private void disableChildScroll(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        resetScrollToTopView();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = nonGoneChildren.get(i5);
            measureChildWithMargins(view, i, 0, i2, getAdjustHeightForChild(view));
            i3 = Math.max(i3, getContentWidth(view));
            i4 += view.getMeasuredHeight();
        }
        setMeasuredDimension(measureSize(i, i3 + getPaddingLeft() + getPaddingRight()), measureSize(i2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    private int getAdjustHeightForChild(View view) {
        if (this.mAutoAdjustHeightAtBottomView && view == getChildAt(getChildCount() - 1)) {
            return getAdjustHeight();
        }
        return 0;
    }

    private int getAdjustHeight() {
        List<View> stickyChildren = getStickyChildren();
        int i = this.mAdjustHeightOffset;
        int size = stickyChildren.size();
        if (this.isPermanent) {
            for (int i2 = 0; i2 < size; i2++) {
                View view = stickyChildren.get(i2);
                if (!isSink(view)) {
                    i += view.getMeasuredHeight();
                }
            }
            return i;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            View view2 = stickyChildren.get(i3);
            if (!isSink(view2)) {
                return i + view2.getMeasuredHeight();
            }
        }
        return i;
    }

    private int getContentWidth(View view) {
        int measuredWidth = view.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int measureSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        wipeTopBottomMargin((LayoutParams) view.getLayoutParams());
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mScrollRange = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i5 = 0;
        while (i5 < size) {
            View view = nonGoneChildren.get(i5);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            int childLeft = getChildLeft(view, measuredWidth, paddingLeft, paddingRight);
            view.layout(childLeft, paddingTop, view.getMeasuredWidth() + childLeft, measuredHeight);
            this.mScrollRange += view.getHeight();
            i5++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.mScrollRange - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.mScrollRange = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.mScrollRange = 0;
        }
        checkLayoutChange(z, false);
        sortViews();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    private void sortViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!isStickyView(childAt) || isSink(childAt)) {
                arrayList.add(childAt);
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = getChildAt(i2);
            if (isStickyView(childAt2) && !isSink(childAt2)) {
                arrayList.add(childAt2);
            }
        }
        this.mViews.clear();
        this.mViews.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.glority.widget.scrollview.GlNestedScrollView$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$glority$widget$scrollview$GlNestedScrollView$LayoutParams$Align;

        static {
            int[] iArr = new int[LayoutParams.Align.values().length];
            $SwitchMap$com$glority$widget$scrollview$GlNestedScrollView$LayoutParams$Align = iArr;
            try {
                iArr[LayoutParams.Align.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$glority$widget$scrollview$GlNestedScrollView$LayoutParams$Align[LayoutParams.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$glority$widget$scrollview$GlNestedScrollView$LayoutParams$Align[LayoutParams.Align.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int getChildLeft(View view, int i, int i2, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = AnonymousClass3.$SwitchMap$com$glority$widget$scrollview$GlNestedScrollView$LayoutParams$Align[layoutParams.align.ordinal()];
        if (i4 == 1) {
            return ((i - view.getMeasuredWidth()) - i3) - layoutParams.rightMargin;
        }
        if (i4 == 2) {
            return layoutParams.leftMargin + i2 + ((((((i - view.getMeasuredWidth()) - i2) - layoutParams.leftMargin) - i3) - layoutParams.rightMargin) / 2);
        }
        return i2 + layoutParams.leftMargin;
    }

    private void resetScrollToTopView() {
        View findFirstVisibleView = findFirstVisibleView();
        this.mScrollToTopView = findFirstVisibleView;
        if (findFirstVisibleView != null) {
            this.mAdjust = getScrollY() - this.mScrollToTopView.getTop();
        }
    }

    private void wipeTopBottomMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x015e, code lost:
    
        if (isIntercept(r10[0], r10[1]) != false) goto L47;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scrollview.GlNestedScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (isIntercept(r0[0], r0[1]) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L34
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L28
            r3 = 2
            if (r0 == r3) goto L11
            r3 = 3
            if (r0 == r3) goto L28
            goto L3c
        L11:
            int r0 = r4.SCROLL_ORIENTATION
            if (r0 == r3) goto L3c
            boolean r0 = r4.isIntercept(r5)
            if (r0 != 0) goto L27
            int[] r0 = r4.mDownLocation
            r1 = r0[r1]
            r0 = r0[r2]
            boolean r0 = r4.isIntercept(r1, r0)
            if (r0 == 0) goto L3c
        L27:
            return r2
        L28:
            r4.stopNestedScroll(r1)
            boolean r0 = r4.isBrake
            if (r0 == 0) goto L3c
            int r0 = r4.SCROLL_ORIENTATION
            if (r0 != 0) goto L3c
            return r2
        L34:
            r4.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r0.addMovement(r5)
        L3c:
            boolean r5 = super.onInterceptTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scrollview.GlNestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r4 != 6) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scrollview.GlNestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean canScrollVertically() {
        return (isScrollTop() && isScrollBottom()) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int indexOfChild;
        return (this.mViews.size() <= i2 || (indexOfChild = indexOfChild(this.mViews.get(i2))) == -1) ? super.getChildDrawingOrder(i, i2) : indexOfChild;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDrawingPosition(View view) {
        return this.mViews.indexOf(view);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        if (this.mOldScrollY != getScrollY()) {
            this.mOldScrollY = getScrollY();
            resetSticky();
        }
        if (this.mEdgeGlowTop != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.mEdgeGlowTop.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    i2 = getPaddingTop() + scrollY;
                } else {
                    i2 = scrollY;
                }
                canvas.translate(i, i2);
                this.mEdgeGlowTop.setSize(width, height);
                if (this.mEdgeGlowTop.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.mEdgeGlowBottom.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int i4 = scrollY + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i3 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                i4 -= getPaddingBottom();
            }
            canvas.translate(i3 - width2, i4);
            canvas.rotate(180.0f, width2, 0.0f);
            this.mEdgeGlowBottom.setSize(width2, height2);
            if (this.mEdgeGlowBottom.draw(canvas)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private void fling(int i) {
        if (Math.abs(i) > this.mMinimumVelocity) {
            float f = i;
            if (dispatchNestedPreFling(0.0f, f)) {
                return;
            }
            dispatchNestedFling(0.0f, f, (i < 0 && !isScrollTop()) || (i > 0 && !isScrollBottom()));
            this.mScroller.fling(0, this.mSecondScrollY, 1, i, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            startNestedScroll(2, 1);
            setScrollState(2);
            this.mLastScrollerY = this.mSecondScrollY;
            invalidate();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int i;
        if (this.mScrollToIndex != -1 && (i = this.mSmoothScrollOffset) != 0) {
            if (i > 0 && i < 200) {
                this.mSmoothScrollOffset = i + 5;
            }
            int i2 = this.mSmoothScrollOffset;
            if (i2 < 0 && i2 > -200) {
                this.mSmoothScrollOffset = i2 - 5;
            }
            dispatchScroll(this.mSmoothScrollOffset);
            this.mCycleCount++;
            invalidate();
            return;
        }
        if (this.mScroller.computeScrollOffset()) {
            int currY = this.mScroller.getCurrY();
            int i3 = currY - this.mLastScrollerY;
            this.mLastScrollerY = currY;
            int[] iArr = this.mScrollConsumed;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i3, iArr, null, 1);
            int i4 = i3 - this.mScrollConsumed[1];
            int i5 = this.mSecondScrollY;
            dispatchScroll(i4);
            int i6 = this.mSecondScrollY - i5;
            int i7 = i4 - i6;
            if ((i7 < 0 && isScrollTop()) || (i7 > 0 && isScrollBottom())) {
                dispatchNestedScroll(0, i6, 0, i7, this.mScrollOffset, 1);
                i7 += this.mScrollOffset[1];
            }
            if ((i7 < 0 && isScrollTop()) || (i7 > 0 && isScrollBottom())) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
                    ensureGlows();
                    if (i7 < 0) {
                        if (this.mEdgeGlowTop.isFinished()) {
                            this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                        }
                    } else if (this.mEdgeGlowBottom.isFinished()) {
                        this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                }
                stopScroll();
            }
            invalidate();
        }
        if (this.mScrollState == 2 && this.mScroller.isFinished()) {
            stopNestedScroll(1);
            checkTargetsScroll(false, false);
            setScrollState(0);
        }
    }

    private void endDrag() {
        EdgeEffect edgeEffect = this.mEdgeGlowTop;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
    }

    private void ensureGlows() {
        if (getOverScrollMode() != 2) {
            if (this.mEdgeGlowTop == null) {
                Context context = getContext();
                this.mEdgeGlowTop = new EdgeEffect(context);
                this.mEdgeGlowBottom = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.mEdgeGlowTop = null;
        this.mEdgeGlowBottom = null;
    }

    private void dispatchScroll(int i) {
        if (i > 0) {
            scrollUp(i);
        } else if (i < 0) {
            scrollDown(i);
        }
    }

    private void scrollUp(int i) {
        int i2;
        int i3;
        View bottomView;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i4 = this.mScrollToIndex;
            int i5 = 0;
            if (i4 != -1) {
                View childAt = getChildAt(i4);
                i3 = (childAt.getTop() - this.mScrollToIndexWithOffset) - getAdjustHeightForChild(childAt);
                i2 = this.mScrollToIndexWithOffset < 0 ? getViewsScrollOffset(this.mScrollToIndex) : 0;
                if (this.mCycleCount >= 1000 || getScrollY() + getPaddingTop() + i2 >= i3 || isScrollBottom()) {
                    this.mScrollToIndex = -1;
                    this.mSmoothScrollOffset = 0;
                    this.mScrollToIndexWithOffset = 0;
                    this.mCycleCount = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (!isScrollBottom()) {
                if (getScrollY() < this.mScrollRange) {
                    bottomView = findFirstVisibleView();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    awakenScrollBars();
                    int scrollBottomOffset = GlScrollUtils.getScrollBottomOffset(bottomView);
                    if (scrollBottomOffset > 0) {
                        i5 = Math.min(i, scrollBottomOffset);
                        if (this.mScrollToIndex != -1) {
                            i5 = Math.min(i5, i3 - ((getScrollY() + getPaddingTop()) + i2));
                        }
                        scrollChild(bottomView, i5);
                    } else {
                        i5 = Math.min(i, (bottomView.getBottom() - getPaddingTop()) - getScrollY());
                        if (this.mScrollToIndex != -1) {
                            i5 = Math.min(i5, i3 - ((getScrollY() + getPaddingTop()) + i2));
                        }
                        scrollSelf(getScrollY() + i5);
                    }
                    this.mSecondScrollY += i5;
                    i -= i5;
                }
            }
            if (i5 <= 0) {
                break;
            }
        } while (i > 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset != computeVerticalScrollOffset2) {
            scrollChange(computeVerticalScrollOffset2, computeVerticalScrollOffset);
        }
    }

    private void scrollDown(int i) {
        int i2;
        int i3;
        View bottomView;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i4 = this.mScrollToIndex;
            int i5 = 0;
            if (i4 != -1) {
                View childAt = getChildAt(i4);
                i3 = (childAt.getTop() - this.mScrollToIndexWithOffset) - getAdjustHeightForChild(childAt);
                i2 = getViewsScrollOffset(this.mScrollToIndex);
                if (this.mCycleCount >= 1000 || getScrollY() + getPaddingTop() + i2 <= i3 || isScrollTop()) {
                    this.mScrollToIndex = -1;
                    this.mSmoothScrollOffset = 0;
                    this.mScrollToIndexWithOffset = 0;
                    this.mCycleCount = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (!isScrollTop()) {
                if (getScrollY() < this.mScrollRange) {
                    bottomView = findLastVisibleView();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    awakenScrollBars();
                    int scrollTopOffset = GlScrollUtils.getScrollTopOffset(bottomView);
                    if (scrollTopOffset < 0) {
                        i5 = Math.max(i, scrollTopOffset);
                        if (this.mScrollToIndex != -1) {
                            i5 = Math.max(i5, i3 - ((getScrollY() + getPaddingTop()) + i2));
                        }
                        scrollChild(bottomView, i5);
                    } else {
                        int scrollY = getScrollY();
                        int max = Math.max(Math.max(i, ((bottomView.getTop() + getPaddingBottom()) - scrollY) - getHeight()), -scrollY);
                        if (this.mScrollToIndex != -1) {
                            max = Math.max(max, i3 - ((getScrollY() + getPaddingTop()) + i2));
                        }
                        scrollSelf(scrollY + max);
                        i5 = max;
                    }
                    this.mSecondScrollY += i5;
                    i -= i5;
                }
            }
            if (i5 >= 0) {
                break;
            }
        } while (i < 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset != computeVerticalScrollOffset2) {
            scrollChange(computeVerticalScrollOffset2, computeVerticalScrollOffset);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        scrollTo(0, this.mSecondScrollY + i2);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        dispatchScroll(i2 - this.mSecondScrollY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void scrollChange(int i, int i2) {
        OnScrollChangeListener onScrollChangeListener = this.mOnScrollChangeListener;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, this.mScrollState);
        }
    }

    private void stickyChange(View view, View view2) {
        OnStickyChangeListener onStickyChangeListener = this.mOnStickyChangeListener;
        if (onStickyChangeListener != null) {
            onStickyChangeListener.onStickyChange(view, view2);
        }
    }

    private void permanentStickyChange(List<View> list) {
        OnPermanentStickyChangeListener onPermanentStickyChangeListener = this.mOnPermanentStickyChangeListener;
        if (onPermanentStickyChangeListener != null) {
            onPermanentStickyChangeListener.onStickyChange(list);
        }
    }

    private void scrollSelf(int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.mScrollRange;
            if (i > i2) {
                i = i2;
            }
        }
        super.scrollTo(0, i);
    }

    private void scrollChild(View view, int i) {
        View scrolledView = GlScrollUtils.getScrolledView(view);
        if (scrolledView instanceof AbsListView) {
            ((AbsListView) scrolledView).scrollListBy(i);
            return;
        }
        boolean startInterceptRequestLayout = scrolledView instanceof RecyclerView ? GlScrollUtils.startInterceptRequestLayout((RecyclerView) scrolledView) : false;
        scrolledView.scrollBy(0, i);
        if (startInterceptRequestLayout) {
            final RecyclerView recyclerView = (RecyclerView) scrolledView;
            recyclerView.postDelayed(new Runnable() { // from class: com.glority.widget.scrollview.GlNestedScrollView.1
                @Override // java.lang.Runnable
                public void run() {
                    GlScrollUtils.stopInterceptRequestLayout(recyclerView);
                }
            }, 0L);
        }
    }

    public void checkLayoutChange() {
        postDelayed(new Runnable() { // from class: com.glority.widget.scrollview.GlNestedScrollView.2
            @Override // java.lang.Runnable
            public void run() {
                GlNestedScrollView.this.checkLayoutChange(false, true);
            }
        }, 20L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLayoutChange(boolean z, boolean z2) {
        int i = this.mSecondScrollY;
        View view = this.mScrollToTopView;
        if (view != null && z) {
            if (indexOfChild(view) != -1) {
                scrollSelf(this.mScrollToTopView.getTop() + this.mAdjust);
            }
        } else {
            scrollSelf(getScrollY());
        }
        checkTargetsScroll(true, z2);
        if (i != this.mSecondScrollY && this.mScrollToTopView != findFirstVisibleView()) {
            scrollTo(0, i);
        }
        this.mScrollToTopView = null;
        this.mAdjust = 0;
        resetChildren();
        resetSticky();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void checkTargetsScroll(boolean z, boolean z2) {
        int computeVerticalScrollOffset;
        if (z2 || (!this.mTouching && this.mScroller.isFinished() && this.mScrollToIndex == -1)) {
            int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
            View findFirstVisibleView = findFirstVisibleView();
            if (findFirstVisibleView == null) {
                return;
            }
            int indexOfChild = indexOfChild(findFirstVisibleView);
            if (z) {
                while (true) {
                    int scrollBottomOffset = GlScrollUtils.getScrollBottomOffset(findFirstVisibleView);
                    int top = findFirstVisibleView.getTop() - getScrollY();
                    if (scrollBottomOffset <= 0 || top >= 0) {
                        break;
                    }
                    int min = Math.min(scrollBottomOffset, -top);
                    scrollSelf(getScrollY() - min);
                    scrollChild(findFirstVisibleView, min);
                }
            }
            for (int i = 0; i < indexOfChild; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && GlScrollUtils.isCoordinateScrollerChild(childAt)) {
                    View scrollChild = GlScrollUtils.getScrollChild(childAt);
                    if (scrollChild instanceof GlNestedScroller) {
                        List<View> scrolledViews = ((GlNestedScroller) scrollChild).getScrolledViews();
                        if (scrolledViews != null && !scrolledViews.isEmpty()) {
                            int size = scrolledViews.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                scrollChildContentToBottom(scrolledViews.get(i2));
                            }
                        }
                    } else {
                        scrollChildContentToBottom(scrollChild);
                    }
                }
            }
            while (true) {
                indexOfChild++;
                if (indexOfChild >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(indexOfChild);
                if (childAt2.getVisibility() != 8 && GlScrollUtils.isCoordinateScrollerChild(childAt2) && (indexOfChild != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.mScrollRange)) {
                    View scrollChild2 = GlScrollUtils.getScrollChild(childAt2);
                    if (scrollChild2 instanceof GlNestedScroller) {
                        List<View> scrolledViews2 = ((GlNestedScroller) scrollChild2).getScrolledViews();
                        if (scrolledViews2 != null && !scrolledViews2.isEmpty()) {
                            int size2 = scrolledViews2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                scrollChildContentToTop(scrolledViews2.get(i3));
                            }
                        }
                    } else {
                        scrollChildContentToTop(scrollChild2);
                    }
                }
            }
            computeOwnScrollOffset();
            if (z && computeVerticalScrollOffset2 != (computeVerticalScrollOffset = computeVerticalScrollOffset())) {
                scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset2);
            }
            resetSticky();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scrollChildContentToTop(View view) {
        int computeVerticalScrollOffset;
        do {
            int scrollTopOffset = GlScrollUtils.getScrollTopOffset(view);
            if (scrollTopOffset >= 0) {
                return;
            }
            computeVerticalScrollOffset = GlScrollUtils.computeVerticalScrollOffset(view);
            scrollChild(view, scrollTopOffset);
        } while (computeVerticalScrollOffset - GlScrollUtils.computeVerticalScrollOffset(view) != 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scrollChildContentToBottom(View view) {
        int computeVerticalScrollOffset;
        do {
            int scrollBottomOffset = GlScrollUtils.getScrollBottomOffset(view);
            if (scrollBottomOffset <= 0) {
                return;
            }
            computeVerticalScrollOffset = GlScrollUtils.computeVerticalScrollOffset(view);
            scrollChild(view, scrollBottomOffset);
        } while (computeVerticalScrollOffset - GlScrollUtils.computeVerticalScrollOffset(view) != 0);
    }

    private void computeOwnScrollOffset() {
        this.mSecondScrollY = computeVerticalScrollOffset();
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void initOrResetAdjustVelocityTracker() {
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker == null) {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initAdjustVelocityTrackerIfNotExists() {
        if (this.mAdjustVelocityTracker == null) {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleAdjustVelocityTracker() {
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mAdjustVelocityTracker = null;
        }
    }

    public void stopScroll() {
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
        if (this.mScrollToIndex == -1) {
            setScrollState(0);
        }
    }

    private View getBottomView() {
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return effectiveChildren.get(effectiveChildren.size() - 1);
    }

    private List<View> getNonGoneChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getEffectiveChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getStickyChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && isStickyView(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public boolean isStickyView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).isSticky;
        }
        return false;
    }

    public boolean isSink(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).isSink;
        }
        return false;
    }

    private void resetChildren() {
        Iterator<View> it = getNonGoneChildren().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(0.0f);
        }
    }

    private void resetSticky() {
        View view;
        View view2;
        List<View> stickyChildren = getStickyChildren();
        if (!stickyChildren.isEmpty()) {
            int size = stickyChildren.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                stickyChildren.get(i2).setTranslationY(0.0f);
            }
            if (this.isPermanent) {
                clearCurrentStickyView();
                permanentStickyChild(stickyChildren);
                return;
            }
            clearCurrentStickyViews();
            int i3 = size - 1;
            int i4 = i3;
            while (true) {
                if (i4 < 0) {
                    view2 = null;
                    break;
                }
                View view3 = stickyChildren.get(i4);
                if (view3.getTop() <= getStickyY()) {
                    view2 = i4 != i3 ? stickyChildren.get(i4 + 1) : null;
                    view = view3;
                } else {
                    i4--;
                }
            }
            View view4 = this.mCurrentStickyView;
            if (view != null) {
                if (view2 != null && !isSink(view)) {
                    i = Math.max(0, view.getHeight() - (view2.getTop() - getStickyY()));
                }
                stickyChild(view, i);
            }
            if (view4 != view) {
                this.mCurrentStickyView = view;
                stickyChange(view4, view);
                return;
            }
            return;
        }
        clearCurrentStickyView();
        clearCurrentStickyViews();
    }

    private void clearCurrentStickyView() {
        View view = this.mCurrentStickyView;
        if (view != null) {
            this.mCurrentStickyView = null;
            stickyChange(view, null);
        }
    }

    private void clearCurrentStickyViews() {
        if (this.mCurrentStickyViews.isEmpty()) {
            return;
        }
        this.mCurrentStickyViews.clear();
        permanentStickyChange(this.mCurrentStickyViews);
    }

    private void stickyChild(View view, int i) {
        view.setY(getStickyY() - i);
        view.setClickable(true);
    }

    private int getStickyY() {
        return getScrollY() + getPaddingTop() + this.mStickyOffset;
    }

    private void permanentStickyChild(List<View> list) {
        this.mTempStickyViews.clear();
        for (int i = 0; i < list.size(); i++) {
            View view = list.get(i);
            if (view.getTop() <= getStickyY() + getPermanentHeight(list, i)) {
                view.setY(getStickyY() + r2);
                view.setClickable(true);
                this.mTempStickyViews.add(view);
            }
        }
        if (isListEqual()) {
            return;
        }
        this.mCurrentStickyViews.clear();
        this.mCurrentStickyViews.addAll(this.mTempStickyViews);
        this.mTempStickyViews.clear();
        permanentStickyChange(this.mCurrentStickyViews);
    }

    private int getPermanentHeight(List<View> list, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View view = list.get(i3);
            if (!isSink(view)) {
                i2 += view.getMeasuredHeight();
            }
        }
        return i2;
    }

    private boolean isListEqual() {
        if (this.mTempStickyViews.size() != this.mCurrentStickyViews.size()) {
            return false;
        }
        int size = this.mTempStickyViews.size();
        for (int i = 0; i < size; i++) {
            if (this.mTempStickyViews.get(i) != this.mCurrentStickyViews.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset);
        onScrollStateChanged(i);
    }

    public int getOwnScrollY() {
        return computeVerticalScrollOffset();
    }

    public View findFirstVisibleView() {
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                return view;
            }
        }
        return null;
    }

    public View findLastVisibleView() {
        int height = (getHeight() - getPaddingBottom()) + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() < height && view.getBottom() >= height) {
                return view;
            }
        }
        return null;
    }

    public boolean isScrollTop() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() <= 0 && !GlScrollUtils.canScrollVertically(effectiveChildren.get(0), -1);
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                View view = effectiveChildren.get(i);
                if (GlScrollUtils.isCoordinateScrollerChild(view) && GlScrollUtils.canScrollVertically(view, -1)) {
                    return false;
                }
            }
        }
        return z;
    }

    public boolean isScrollBottom() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() >= this.mScrollRange && !GlScrollUtils.canScrollVertically(effectiveChildren.get(effectiveChildren.size() - 1), 1);
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                View view = effectiveChildren.get(i);
                if (GlScrollUtils.isCoordinateScrollerChild(view) && GlScrollUtils.canScrollVertically(view, 1)) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (i > 0) {
            return !isScrollBottom();
        }
        return !isScrollTop();
    }

    public void setOnVerticalScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    public OnScrollChangeListener getOnVerticalScrollChangeListener() {
        return this.mOnScrollChangeListener;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int height;
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = nonGoneChildren.get(i2);
            if (!GlScrollUtils.isCoordinateScrollerChild(view)) {
                height = view.getHeight();
            } else if (GlScrollUtils.canScrollVertically(view)) {
                View scrolledView = GlScrollUtils.getScrolledView(view);
                i += GlScrollUtils.computeVerticalScrollRange(scrolledView) + scrolledView.getPaddingTop() + scrolledView.getPaddingBottom();
            } else {
                height = view.getHeight();
            }
            i += height;
        }
        return i;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i = 0; i < size; i++) {
            View view = nonGoneChildren.get(i);
            if (GlScrollUtils.isCoordinateScrollerChild(view)) {
                scrollY += GlScrollUtils.computeVerticalScrollOffset(view);
            }
        }
        return scrollY;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private View getTouchTarget(int i, int i2) {
        for (View view : getNonGoneChildren()) {
            if (GlScrollUtils.isTouchPointInView(view, i, i2)) {
                return view;
            }
        }
        return null;
    }

    private boolean isIntercept(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (findPointerIndex < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        return isIntercept(GlScrollUtils.getRawX(this, motionEvent, findPointerIndex), GlScrollUtils.getRawY(this, motionEvent, findPointerIndex));
    }

    private boolean isIntercept(int i, int i2) {
        View touchTarget = getTouchTarget(i, i2);
        if (touchTarget != null) {
            return GlScrollUtils.isCoordinateScrollerChild(touchTarget);
        }
        return false;
    }

    /* loaded from: classes12.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public Align align;
        public boolean isCoordinate;
        public boolean isNestedScroll;
        public boolean isSink;
        public boolean isSticky;
        public boolean isTriggerScroll;
        public int scrollChild;

        /* loaded from: classes12.dex */
        public enum Align {
            LEFT(1),
            RIGHT(2),
            CENTER(3);

            int value;

            Align(int i) {
                this.value = i;
            }

            static Align get(int i) {
                if (i == 1) {
                    return LEFT;
                }
                if (i == 2) {
                    return RIGHT;
                }
                if (i == 3) {
                    return CENTER;
                }
                return LEFT;
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isCoordinate = true;
            this.isNestedScroll = true;
            this.isSticky = false;
            this.isTriggerScroll = false;
            this.isSink = false;
            this.align = Align.LEFT;
            TypedArray typedArray = null;
            try {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.GlNestedScrollView_Layout);
                    this.isCoordinate = typedArray.getBoolean(R.styleable.GlNestedScrollView_Layout_layout_isCoordinate, true);
                    this.isNestedScroll = typedArray.getBoolean(R.styleable.GlNestedScrollView_Layout_layout_isNestedScroll, true);
                    this.isSticky = typedArray.getBoolean(R.styleable.GlNestedScrollView_Layout_layout_isSticky, false);
                    this.isTriggerScroll = typedArray.getBoolean(R.styleable.GlNestedScrollView_Layout_layout_isTriggerScroll, false);
                    this.isSink = typedArray.getBoolean(R.styleable.GlNestedScrollView_Layout_layout_isSink, false);
                    this.align = Align.get(typedArray.getInt(R.styleable.GlNestedScrollView_Layout_layout_align, 1));
                    this.scrollChild = typedArray.getResourceId(R.styleable.GlNestedScrollView_Layout_layout_scrollChild, -1);
                    if (typedArray == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (typedArray == null) {
                        return;
                    }
                }
                typedArray.recycle();
            } catch (Throwable th) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isCoordinate = true;
            this.isNestedScroll = true;
            this.isSticky = false;
            this.isTriggerScroll = false;
            this.isSink = false;
            this.align = Align.LEFT;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.isCoordinate = true;
            this.isNestedScroll = true;
            this.isSticky = false;
            this.isTriggerScroll = false;
            this.isSink = false;
            this.align = Align.LEFT;
        }
    }

    public void scrollToChild(View view) {
        scrollToChildWithOffset(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (com.glority.widget.scrollview.GlScrollUtils.canScrollVertically(r7, -1) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (((getScrollY() + getPaddingTop()) + r7) < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void scrollToChildWithOffset(android.view.View r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.indexOfChild(r7)
            r1 = -1
            if (r0 == r1) goto L77
            int r2 = r7.getTop()
            int r2 = r2 - r8
            int r3 = r6.getAdjustHeightForChild(r7)
            int r2 = r2 - r3
            r3 = 1
            if (r8 < 0) goto L33
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            if (r4 <= r2) goto L20
            goto L43
        L20:
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            if (r4 >= r2) goto L2c
            goto L51
        L2c:
            boolean r7 = com.glority.widget.scrollview.GlScrollUtils.canScrollVertically(r7, r1)
            if (r7 == 0) goto L53
            goto L43
        L33:
            int r7 = r6.getViewsScrollOffset(r0)
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            int r4 = r4 + r7
            if (r4 <= r2) goto L45
        L43:
            r7 = r1
            goto L54
        L45:
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            int r4 = r4 + r7
            if (r4 >= r2) goto L53
        L51:
            r7 = r3
            goto L54
        L53:
            r7 = 0
        L54:
            if (r7 == 0) goto L77
            r6.mScrollToIndex = r0
            r6.stopScroll()
            r6.mScrollToIndexWithOffset = r8
            r8 = 2
            r6.setScrollState(r8)
        L61:
            if (r7 >= 0) goto L69
            r8 = -200(0xffffffffffffff38, float:NaN)
            r6.dispatchScroll(r8)
            goto L6e
        L69:
            r8 = 200(0xc8, float:2.8E-43)
            r6.dispatchScroll(r8)
        L6e:
            int r8 = r6.mCycleCount
            int r8 = r8 + r3
            r6.mCycleCount = r8
            int r8 = r6.mScrollToIndex
            if (r8 != r1) goto L61
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scrollview.GlNestedScrollView.scrollToChildWithOffset(android.view.View, int):void");
    }

    public void smoothScrollToChild(View view) {
        smoothScrollToChildWithOffset(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (com.glority.widget.scrollview.GlScrollUtils.canScrollVertically(r7, -1) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (((getScrollY() + getPaddingTop()) + r7) < r2) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void smoothScrollToChildWithOffset(android.view.View r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.indexOfChild(r7)
            r1 = -1
            if (r0 == r1) goto L6e
            int r2 = r7.getTop()
            int r2 = r2 - r8
            int r3 = r6.getAdjustHeightForChild(r7)
            int r2 = r2 - r3
            r3 = 1
            if (r8 < 0) goto L33
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            if (r4 <= r2) goto L20
            goto L53
        L20:
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            if (r4 >= r2) goto L2c
            goto L50
        L2c:
            boolean r7 = com.glority.widget.scrollview.GlScrollUtils.canScrollVertically(r7, r1)
            if (r7 == 0) goto L52
            goto L53
        L33:
            int r7 = r6.getViewsScrollOffset(r0)
            int r4 = r6.getScrollY()
            int r5 = r6.getPaddingTop()
            int r4 = r4 + r5
            int r4 = r4 + r7
            if (r4 <= r2) goto L44
            goto L53
        L44:
            int r1 = r6.getScrollY()
            int r4 = r6.getPaddingTop()
            int r1 = r1 + r4
            int r1 = r1 + r7
            if (r1 >= r2) goto L52
        L50:
            r1 = r3
            goto L53
        L52:
            r1 = 0
        L53:
            if (r1 == 0) goto L6e
            r6.mScrollToIndex = r0
            r6.stopScroll()
            r6.mScrollToIndexWithOffset = r8
            r7 = 2
            r6.setScrollState(r7)
            if (r1 >= 0) goto L67
            r7 = -50
            r6.mSmoothScrollOffset = r7
            goto L6b
        L67:
            r7 = 50
            r6.mSmoothScrollOffset = r7
        L6b:
            r6.invalidate()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scrollview.GlNestedScrollView.smoothScrollToChildWithOffset(android.view.View, int):void");
    }

    private int getViewsScrollOffset(int i) {
        int childCount = getChildCount();
        int i2 = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && GlScrollUtils.isCoordinateScrollerChild(childAt)) {
                i2 += GlScrollUtils.computeVerticalScrollOffset(childAt);
            }
            i++;
        }
        return i2;
    }

    public boolean isAutoAdjustHeightAtBottomView() {
        return this.mAutoAdjustHeightAtBottomView;
    }

    public void setAutoAdjustHeightAtBottomView(boolean z) {
        if (this.mAutoAdjustHeightAtBottomView != z) {
            this.mAutoAdjustHeightAtBottomView = z;
            requestLayout();
        }
    }

    public int getAdjustHeightOffset() {
        return this.mAdjustHeightOffset;
    }

    public void setAdjustHeightOffset(int i) {
        if (this.mAdjustHeightOffset != i) {
            this.mAdjustHeightOffset = i;
            requestLayout();
        }
    }

    public void setPermanent(boolean z) {
        if (this.isPermanent != z) {
            this.isPermanent = z;
            if (this.mAutoAdjustHeightAtBottomView) {
                requestLayout();
            } else {
                resetSticky();
            }
        }
    }

    public boolean isPermanent() {
        return this.isPermanent;
    }

    public boolean isDisableChildHorizontalScroll() {
        return this.disableChildHorizontalScroll;
    }

    public void setDisableChildHorizontalScroll(boolean z) {
        this.disableChildHorizontalScroll = z;
    }

    public void setStickyOffset(int i) {
        if (this.mStickyOffset != i) {
            this.mStickyOffset = i;
            resetSticky();
        }
    }

    public int getStickyOffset() {
        return this.mStickyOffset;
    }

    public View getCurrentStickyView() {
        return this.mCurrentStickyView;
    }

    public List<View> getCurrentStickyViews() {
        return this.mCurrentStickyViews;
    }

    public boolean theChildIsStick(View view) {
        boolean z = this.isPermanent;
        return (!z && this.mCurrentStickyView == view) || (z && this.mCurrentStickyViews.contains(view));
    }

    public OnStickyChangeListener getOnStickyChangeListener() {
        return this.mOnStickyChangeListener;
    }

    public void setOnStickyChangeListener(OnStickyChangeListener onStickyChangeListener) {
        this.mOnStickyChangeListener = onStickyChangeListener;
    }

    public OnPermanentStickyChangeListener getOnPermanentStickyChangeListener() {
        return this.mOnPermanentStickyChangeListener;
    }

    public void setOnPermanentStickyChangeListener(OnPermanentStickyChangeListener onPermanentStickyChangeListener) {
        this.mOnPermanentStickyChangeListener = onPermanentStickyChangeListener;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return this.mChildHelper.startNestedScroll(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        this.mChildHelper.stopNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return this.mChildHelper.hasNestedScrollingParent(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.mChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.mChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).isNestedScroll && (i & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        checkTargetsScroll(false, false);
        startNestedScroll(2, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.mParentHelper.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScrollInternal(i4, i5);
    }

    private void onNestedScrollInternal(int i, int i2) {
        int i3 = this.mSecondScrollY;
        dispatchScroll(i);
        int i4 = this.mSecondScrollY - i3;
        this.mChildHelper.dispatchNestedScroll(0, i4, 0, i - i4, null, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScrollInternal(i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        fling((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }
}
