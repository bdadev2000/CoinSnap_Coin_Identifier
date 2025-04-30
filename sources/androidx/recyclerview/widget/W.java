package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class W {
    boolean mAutoMeasure;
    C0522d mChildHelper;
    private int mHeight;
    private int mHeightMode;
    B0 mHorizontalBoundCheck;
    private final A0 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;

    @Nullable
    k0 mSmoothScroller;
    B0 mVerticalBoundCheck;
    private final A0 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public W() {
        T t9 = new T(this, 0);
        this.mHorizontalBoundCheckCallback = t9;
        T t10 = new T(this, 1);
        this.mVerticalBoundCheckCallback = t10;
        this.mHorizontalBoundCheck = new B0(t9);
        this.mVerticalBoundCheck = new B0(t10);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i9) {
                return false;
            }
            return true;
        }
        if (size < i9) {
            return false;
        }
        return true;
    }

    public static int chooseSize(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r3 >= 0) goto L5;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L10
            if (r3 < 0) goto Le
        Lc:
            r2 = r0
            goto L1e
        Le:
            r3 = r2
            goto L1e
        L10:
            if (r3 < 0) goto L13
            goto Lc
        L13:
            r4 = -1
            if (r3 != r4) goto L18
            r3 = r1
            goto Lc
        L18:
            r4 = -2
            if (r3 != r4) goto Le
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.W.getChildMeasureSpec(int, int, int, boolean):int");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.V, java.lang.Object] */
    public static V getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9, int i10) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i9, i10);
        obj.f4944a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        obj.b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        obj.f4945c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        obj.f4946d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public final void a(View view, int i9, boolean z8) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!z8 && !childViewHolderInt.isRemoved()) {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        } else {
            x.l lVar = this.mRecyclerView.mViewInfoStore.f4932a;
            C0 c02 = (C0) lVar.getOrDefault(childViewHolderInt, null);
            if (c02 == null) {
                c02 = C0.a();
                lVar.put(childViewHolderInt, c02);
            }
            c02.f4927a |= 1;
        }
        X x9 = (X) view.getLayoutParams();
        if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
            if (view.getParent() == this.mRecyclerView) {
                int j7 = this.mChildHelper.j(view);
                if (i9 == -1) {
                    i9 = this.mChildHelper.e();
                }
                if (j7 != -1) {
                    if (j7 != i9) {
                        this.mRecyclerView.mLayout.moveView(j7, i9);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(Q7.n0.h(this.mRecyclerView, sb));
                }
            } else {
                this.mChildHelper.a(view, i9, false);
                x9.f4948c = true;
                k0 k0Var = this.mSmoothScroller;
                if (k0Var != null && k0Var.f5021e && k0Var.b.getChildLayoutPosition(view) == k0Var.f5018a) {
                    k0Var.f5022f = view;
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "smooth scroll target view has been attached");
                    }
                }
            }
        } else {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i9, view.getLayoutParams(), false);
        }
        if (x9.f4949d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + x9.f4947a);
            }
            childViewHolderInt.itemView.invalidate();
            x9.f4949d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(@NonNull View view, int i9, X x9) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            x.l lVar = this.mRecyclerView.mViewInfoStore.f4932a;
            C0 c02 = (C0) lVar.getOrDefault(childViewHolderInt, null);
            if (c02 == null) {
                c02 = C0.a();
                lVar.put(childViewHolderInt, c02);
            }
            c02.f4927a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i9, x9, childViewHolderInt.isRemoved());
    }

    public void c() {
        requestLayout();
    }

    public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(X x9) {
        return x9 != null;
    }

    public void collectAdjacentPrefetchPositions(int i9, int i10, l0 l0Var, U u8) {
    }

    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i9, U u8) {
    }

    public abstract int computeHorizontalScrollExtent(l0 l0Var);

    public abstract int computeHorizontalScrollOffset(l0 l0Var);

    public abstract int computeHorizontalScrollRange(l0 l0Var);

    public abstract int computeVerticalScrollExtent(l0 l0Var);

    public abstract int computeVerticalScrollOffset(l0 l0Var);

    public abstract int computeVerticalScrollRange(l0 l0Var);

    public final void d(C0525e0 c0525e0, int i9, View view) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                return;
            }
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i9);
            c0525e0.j(childViewHolderInt);
        } else {
            detachViewAt(i9);
            c0525e0.k(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
    }

    public void detachAndScrapAttachedViews(@NonNull C0525e0 c0525e0) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            d(c0525e0, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull C0525e0 c0525e0) {
        d(c0525e0, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i9, @NonNull C0525e0 c0525e0) {
        d(c0525e0, i9, getChildAt(i9));
    }

    public void detachView(@NonNull View view) {
        int j7 = this.mChildHelper.j(view);
        if (j7 >= 0) {
            this.mChildHelper.c(j7);
        }
    }

    public void detachViewAt(int i9) {
        getChildAt(i9);
        this.mChildHelper.c(i9);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, C0525e0 c0525e0) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, c0525e0);
    }

    public void e() {
        getItemCount();
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        Q q9 = this.mRecyclerView.mItemAnimator;
        if (q9 != null) {
            q9.d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        View findContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.k(findContainingItemView)) {
            return null;
        }
        return findContainingItemView;
    }

    @Nullable
    public View findViewByPosition(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i9 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f5031g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract X generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public X generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof X) {
            return new X((X) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new X((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new X(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((X) view.getLayoutParams()).b.bottom;
    }

    @Nullable
    public View getChildAt(int i9) {
        C0522d c0522d = this.mChildHelper;
        if (c0522d != null) {
            return c0522d.d(i9);
        }
        return null;
    }

    public int getChildCount() {
        C0522d c0522d = this.mChildHelper;
        if (c0522d != null) {
            return c0522d.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.mClipToPadding) {
            return true;
        }
        return false;
    }

    public int getColumnCountForAccessibility(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var) {
        return -1;
    }

    public int getDecoratedBottom(@NonNull View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(@NonNull View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(@NonNull View view) {
        Rect rect = ((X) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((X) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(@NonNull View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(@NonNull View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    @Nullable
    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        J j7;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            j7 = recyclerView.getAdapter();
        } else {
            j7 = null;
        }
        if (j7 != null) {
            return j7.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(@NonNull View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return ViewCompat.getLayoutDirection(this.mRecyclerView);
    }

    public int getLeftDecorationWidth(@NonNull View view) {
        return ((X) view.getLayoutParams()).b.left;
    }

    public int getMinimumHeight() {
        return ViewCompat.getMinimumHeight(this.mRecyclerView);
    }

    public int getMinimumWidth() {
        return ViewCompat.getMinimumWidth(this.mRecyclerView);
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return ViewCompat.getPaddingEnd(recyclerView);
        }
        return 0;
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return ViewCompat.getPaddingStart(recyclerView);
        }
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(@NonNull View view) {
        return ((X) view.getLayoutParams()).f4947a.getLayoutPosition();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((X) view.getLayoutParams()).b.right;
    }

    public int getRowCountForAccessibility(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((X) view.getLayoutParams()).b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z8, @NonNull Rect rect) {
        Matrix matrix;
        if (z8) {
            Rect rect2 = ((X) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i9).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.hasFocus()) {
            return true;
        }
        return false;
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
            return;
        }
        throw new IllegalArgumentException(Q7.n0.h(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        k0 k0Var = this.mSmoothScroller;
        if (k0Var != null && k0Var.f5021e) {
            return true;
        }
        return false;
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z8, boolean z9) {
        boolean z10;
        if (this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8) {
            return z10;
        }
        return !z10;
    }

    public void layoutDecorated(@NonNull View view, int i9, int i10, int i11, int i12) {
        Rect rect = ((X) view.getLayoutParams()).b;
        view.layout(i9 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i9, int i10, int i11, int i12) {
        X x9 = (X) view.getLayoutParams();
        Rect rect = x9.b;
        view.layout(i9 + rect.left + ((ViewGroup.MarginLayoutParams) x9).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) x9).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) x9).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) x9).bottomMargin);
    }

    public void measureChild(@NonNull View view, int i9, int i10) {
        X x9 = (X) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i9;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) x9).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) x9).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, x9)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i9, int i10) {
        X x9 = (X) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i9;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) x9).leftMargin + ((ViewGroup.MarginLayoutParams) x9).rightMargin + i11, ((ViewGroup.MarginLayoutParams) x9).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) x9).topMargin + ((ViewGroup.MarginLayoutParams) x9).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) x9).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, x9)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i9, int i10) {
        View childAt = getChildAt(i9);
        if (childAt != null) {
            detachViewAt(i9);
            attachView(childAt, i10);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i9 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i9) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i9);
        }
    }

    public void offsetChildrenVertical(int i9) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i9);
        }
    }

    public void onAdapterChanged(@Nullable J j7, @Nullable J j9) {
    }

    public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i9, int i10) {
        return false;
    }

    @CallSuper
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, C0525e0 c0525e0);

    public abstract View onFocusSearchFailed(View view, int i9, C0525e0 c0525e0, l0 l0Var);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(U.i iVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, iVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, U.i iVar) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.k(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, iVar);
    }

    @Nullable
    public View onInterceptFocusSearch(@NonNull View view, int i9) {
        return null;
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i9, int i10) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i9, int i10, int i11) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i9, int i10) {
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i9, int i10) {
    }

    public abstract void onLayoutChildren(C0525e0 c0525e0, l0 l0Var);

    public abstract void onLayoutCompleted(l0 l0Var);

    public void onMeasure(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, int i9, int i10) {
        this.mRecyclerView.defaultOnMeasure(i9, i10);
    }

    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i9) {
    }

    public void onSmoothScrollerStopped(k0 k0Var) {
        if (this.mSmoothScroller == k0Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i9, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i9, bundle);
    }

    public boolean performAccessibilityActionForItem(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, @NonNull View view, int i9, @Nullable Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            ViewCompat.postOnAnimation(recyclerView, runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.l(childCount);
        }
    }

    public void removeAndRecycleAllViews(@NonNull C0525e0 c0525e0) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c0525e0);
            }
        }
    }

    public void removeAndRecycleScrapInt(C0525e0 c0525e0) {
        ArrayList arrayList;
        int size = c0525e0.f4971a.size();
        int i9 = size - 1;
        while (true) {
            arrayList = c0525e0.f4971a;
            if (i9 < 0) {
                break;
            }
            View view = ((p0) arrayList.get(i9)).itemView;
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                Q q9 = this.mRecyclerView.mItemAnimator;
                if (q9 != null) {
                    q9.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                p0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                c0525e0.j(childViewHolderInt2);
            }
            i9--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0525e0.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull C0525e0 c0525e0) {
        removeView(view);
        c0525e0.i(view);
    }

    public void removeAndRecycleViewAt(int i9, @NonNull C0525e0 c0525e0) {
        View childAt = getChildAt(i9);
        removeViewAt(i9);
        c0525e0.i(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(@NonNull View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        C0522d c0522d = this.mChildHelper;
        H h6 = c0522d.f4963a;
        int i9 = c0522d.f4965d;
        if (i9 != 1) {
            if (i9 != 2) {
                try {
                    c0522d.f4965d = 1;
                    c0522d.f4966e = view;
                    int indexOfChild = h6.f4935a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (c0522d.b.f(indexOfChild)) {
                            c0522d.m(view);
                        }
                        h6.c(indexOfChild);
                    }
                    c0522d.f4965d = 0;
                    c0522d.f4966e = null;
                    return;
                } catch (Throwable th) {
                    c0522d.f4965d = 0;
                    c0522d.f4966e = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void removeViewAt(int i9) {
        if (getChildAt(i9) != null) {
            this.mChildHelper.l(i9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9, @androidx.annotation.NonNull android.view.View r10, @androidx.annotation.NonNull android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb6
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lbb
        L80:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.mTempRect
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lbb
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lbb
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lbb
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb6
            goto Lbb
        Lb6:
            if (r11 != 0) goto Lbc
            if (r10 == 0) goto Lbb
            goto Lbc
        Lbb:
            return r0
        Lbc:
            if (r12 == 0) goto Lc2
            r9.scrollBy(r11, r10)
            goto Lc5
        Lc2:
            r9.smoothScrollBy(r11, r10)
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.W.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i9, C0525e0 c0525e0, l0 l0Var);

    public abstract void scrollToPosition(int i9);

    public abstract int scrollVerticallyBy(int i9, C0525e0 c0525e0, l0 l0Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z8) {
        this.mAutoMeasure = z8;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z8) {
        if (z8 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z8;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.n();
            }
        }
    }

    public void setMeasureSpecs(int i9, int i10) {
        this.mWidth = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.mHeightMode = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mHeight = 0;
        }
    }

    public void setMeasuredDimension(Rect rect, int i9, int i10) {
        setMeasuredDimension(chooseSize(i9, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i9, int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i9, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i9, i10);
    }

    public void setMeasurementCacheEnabled(boolean z8) {
        this.mMeasurementCacheEnabled = z8;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i9, int i10, X x9) {
        if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) x9).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) x9).height)) {
            return false;
        }
        return true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i9, int i10, X x9) {
        if (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i9, ((ViewGroup.MarginLayoutParams) x9).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) x9).height)) {
            return false;
        }
        return true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, l0 l0Var, int i9);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(k0 k0Var) {
        k0 k0Var2 = this.mSmoothScroller;
        if (k0Var2 != null && k0Var != k0Var2 && k0Var2.f5021e) {
            k0Var2.d();
        }
        this.mSmoothScroller = k0Var;
        RecyclerView recyclerView = this.mRecyclerView;
        k0Var.getClass();
        o0 o0Var = recyclerView.mViewFlinger;
        o0Var.f5045i.removeCallbacks(o0Var);
        o0Var.f5041d.abortAnimation();
        if (k0Var.f5024h) {
            Log.w("RecyclerView", "An instance of " + k0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + k0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        k0Var.b = recyclerView;
        k0Var.f5019c = this;
        int i9 = k0Var.f5018a;
        if (i9 != -1) {
            recyclerView.mState.f5026a = i9;
            k0Var.f5021e = true;
            k0Var.f5020d = true;
            k0Var.f5022f = recyclerView.mLayout.findViewByPosition(i9);
            k0Var.b.mViewFlinger.b();
            k0Var.f5024h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void stopIgnoringView(@NonNull View view) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        k0 k0Var = this.mSmoothScroller;
        if (k0Var != null) {
            k0Var.d();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i9) {
        a(view, i9, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i9) {
        a(view, i9, false);
    }

    public void onInitializeAccessibilityEvent(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z8 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z8 = false;
        }
        accessibilityEvent.setScrollable(z8);
        J j7 = this.mRecyclerView.mAdapter;
        if (j7 != null) {
            accessibilityEvent.setItemCount(j7.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, @NonNull U.i iVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            iVar.a(FragmentTransaction.TRANSIT_EXIT_MASK);
            iVar.k(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            iVar.a(4096);
            iVar.k(true);
        }
        AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(c0525e0, l0Var), getColumnCountForAccessibility(c0525e0, l0Var), isLayoutHierarchical(c0525e0, l0Var), getSelectionModeForAccessibility(c0525e0, l0Var));
        iVar.getClass();
        iVar.f3098a.setCollectionInfo(obtain);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i9, int i10, @Nullable Object obj) {
        onItemsUpdated(recyclerView, i9, i10);
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull l0 l0Var, @NonNull View view, @Nullable View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public boolean performAccessibilityAction(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, int i9, @Nullable Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i10;
        int i11;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i9 == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i10 = paddingTop;
                i11 = paddingLeft;
            }
            i10 = paddingTop;
            i11 = 0;
        } else if (i9 != 8192) {
            i11 = 0;
            i10 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i10 = paddingTop;
                i11 = paddingLeft;
            }
            i10 = paddingTop;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i11, i10, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i9, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i9, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.W.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, @NonNull View view, @NonNull U.i iVar) {
    }

    @SuppressLint({"UnknownNullness"})
    public X generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new X(context, attributeSet);
    }

    public void setMeasuredDimension(int i9, int i10) {
        this.mRecyclerView.setMeasuredDimension(i9, i10);
    }

    public void attachView(@NonNull View view, int i9) {
        attachView(view, i9, (X) view.getLayoutParams());
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z8) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z8, false);
    }
}
