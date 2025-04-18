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
import androidx.recyclerview.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v0 {
    boolean mAutoMeasure;
    d mChildHelper;
    private int mHeight;
    private int mHeightMode;
    a2 mHorizontalBoundCheck;
    private final z1 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;

    @Nullable
    j1 mSmoothScroller;
    a2 mVerticalBoundCheck;
    private final z1 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public v0() {
        s0 s0Var = new s0(this, 0);
        this.mHorizontalBoundCheckCallback = s0Var;
        s0 s0Var2 = new s0(this, 1);
        this.mVerticalBoundCheckCallback = s0Var2;
        this.mHorizontalBoundCheck = new a2(s0Var);
        this.mVerticalBoundCheck = new a2(s0Var2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    public static int chooseSize(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r3 >= 0) goto L8;
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
            if (r4 == 0) goto Lf
            if (r3 < 0) goto Ld
            goto L11
        Ld:
            r3 = r2
            goto L1e
        Lf:
            if (r3 < 0) goto L13
        L11:
            r2 = r0
            goto L1e
        L13:
            r4 = -1
            if (r3 != r4) goto L18
            r3 = r1
            goto L11
        L18:
            r4 = -2
            if (r3 != r4) goto Ld
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v0.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public static u0 getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        u0 u0Var = new u0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i10, i11);
        u0Var.a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        u0Var.f2042b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        u0Var.f2043c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        u0Var.f2044d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return u0Var;
    }

    public final void a(View view, int i10, boolean z10) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!z10 && !childViewHolderInt.isRemoved()) {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        } else {
            r.k kVar = this.mRecyclerView.mViewInfoStore.a;
            b2 b2Var = (b2) kVar.getOrDefault(childViewHolderInt, null);
            if (b2Var == null) {
                b2Var = b2.a();
                kVar.put(childViewHolderInt, b2Var);
            }
            b2Var.a |= 1;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
            if (view.getParent() == this.mRecyclerView) {
                int j3 = this.mChildHelper.j(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.e();
                }
                if (j3 != -1) {
                    if (j3 != i10) {
                        this.mRecyclerView.mLayout.moveView(j3, i10);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(a4.j.d(this.mRecyclerView, sb2));
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                w0Var.f2060c = true;
                j1 j1Var = this.mSmoothScroller;
                if (j1Var != null && j1Var.f1943e && j1Var.f1940b.getChildLayoutPosition(view) == j1Var.a) {
                    j1Var.f1944f = view;
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
            this.mChildHelper.b(view, i10, view.getLayoutParams(), false);
        }
        if (w0Var.f2061d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + w0Var.a);
            }
            childViewHolderInt.itemView.invalidate();
            w0Var.f2061d = false;
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

    public void attachView(@NonNull View view, int i10, w0 w0Var) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            r.k kVar = this.mRecyclerView.mViewInfoStore.a;
            b2 b2Var = (b2) kVar.getOrDefault(childViewHolderInt, null);
            if (b2Var == null) {
                b2Var = b2.a();
                kVar.put(childViewHolderInt, b2Var);
            }
            b2Var.a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i10, w0Var, childViewHolderInt.isRemoved());
    }

    public final void c(d1 d1Var, int i10, View view) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                return;
            }
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i10);
            d1Var.k(childViewHolderInt);
        } else {
            detachViewAt(i10);
            d1Var.l(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
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

    public boolean checkLayoutParams(w0 w0Var) {
        return w0Var != null;
    }

    public void collectAdjacentPrefetchPositions(int i10, int i11, k1 k1Var, t0 t0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i10, t0 t0Var) {
    }

    public abstract int computeHorizontalScrollExtent(k1 k1Var);

    public abstract int computeHorizontalScrollOffset(k1 k1Var);

    public abstract int computeHorizontalScrollRange(k1 k1Var);

    public abstract int computeVerticalScrollExtent(k1 k1Var);

    public abstract int computeVerticalScrollOffset(k1 k1Var);

    public abstract int computeVerticalScrollRange(k1 k1Var);

    public void detachAndScrapAttachedViews(@NonNull d1 d1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(d1Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull d1 d1Var) {
        c(d1Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i10, @NonNull d1 d1Var) {
        c(d1Var, i10, getChildAt(i10));
    }

    public void detachView(@NonNull View view) {
        int j3 = this.mChildHelper.j(view);
        if (j3 >= 0) {
            this.mChildHelper.c(j3);
        }
    }

    public void detachViewAt(int i10) {
        getChildAt(i10);
        this.mChildHelper.c(i10);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, d1 d1Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, d1Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        q0 q0Var = this.mRecyclerView.mItemAnimator;
        if (q0Var != null) {
            q0Var.d(RecyclerView.getChildViewHolderInt(view));
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
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f1965g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract w0 generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof w0) {
            return new w0((w0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new w0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new w0(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((w0) view.getLayoutParams()).f2059b.bottom;
    }

    @Nullable
    public View getChildAt(int i10) {
        d dVar = this.mChildHelper;
        if (dVar != null) {
            return dVar.d(i10);
        }
        return null;
    }

    public int getChildCount() {
        d dVar = this.mChildHelper;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(@NonNull d1 d1Var, @NonNull k1 k1Var) {
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
        Rect rect = ((w0) view.getLayoutParams()).f2059b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((w0) view.getLayoutParams()).f2059b;
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
        j0 j0Var;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            j0Var = recyclerView.getAdapter();
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            return j0Var.getItemCount();
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
        return ((w0) view.getLayoutParams()).f2059b.left;
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
        return ((w0) view.getLayoutParams()).a();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((w0) view.getLayoutParams()).f2059b.right;
    }

    public int getRowCountForAccessibility(@NonNull d1 d1Var, @NonNull k1 k1Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(@NonNull d1 d1Var, @NonNull k1 k1Var) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((w0) view.getLayoutParams()).f2059b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z10, @NonNull Rect rect) {
        Matrix matrix;
        if (z10) {
            Rect rect2 = ((w0) view.getLayoutParams()).f2059b;
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
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
            return;
        }
        throw new IllegalArgumentException(a4.j.d(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(@NonNull d1 d1Var, @NonNull k1 k1Var) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        j1 j1Var = this.mSmoothScroller;
        if (j1Var != null && j1Var.f1943e) {
            return true;
        }
        return false;
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z10, boolean z11) {
        boolean z12;
        if (this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            return z12;
        }
        return !z12;
    }

    public void layoutDecorated(@NonNull View view, int i10, int i11, int i12, int i13) {
        Rect rect = ((w0) view.getLayoutParams()).f2059b;
        view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i10, int i11, int i12, int i13) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect = w0Var.f2059b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) w0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    public void measureChild(@NonNull View view, int i10, int i11) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
        int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i12, ((ViewGroup.MarginLayoutParams) w0Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i13, ((ViewGroup.MarginLayoutParams) w0Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, w0Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i10;
        int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i11;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin + i12, ((ViewGroup.MarginLayoutParams) w0Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) w0Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, w0Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i10, int i11) {
        View childAt = getChildAt(i10);
        if (childAt != null) {
            detachViewAt(i10);
            attachView(childAt, i11);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i10) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i10);
        }
    }

    public void onAdapterChanged(@Nullable j0 j0Var, @Nullable j0 j0Var2) {
    }

    public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
        return false;
    }

    @CallSuper
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, d1 d1Var);

    public abstract View onFocusSearchFailed(View view, int i10, d1 d1Var, k1 k1Var);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(o0.j jVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, jVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull d1 d1Var, @NonNull k1 k1Var, @NonNull View view, @NonNull o0.j jVar) {
    }

    @Nullable
    public View onInterceptFocusSearch(@NonNull View view, int i10) {
        return null;
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11) {
    }

    public abstract void onLayoutChildren(d1 d1Var, k1 k1Var);

    public abstract void onLayoutCompleted(k1 k1Var);

    public void onMeasure(@NonNull d1 d1Var, @NonNull k1 k1Var, int i10, int i11) {
        this.mRecyclerView.defaultOnMeasure(i10, i11);
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

    public void onScrollStateChanged(int i10) {
    }

    public void onSmoothScrollerStopped(j1 j1Var) {
        if (this.mSmoothScroller == j1Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i10, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
    }

    public boolean performAccessibilityActionForItem(@NonNull d1 d1Var, @NonNull k1 k1Var, @NonNull View view, int i10, @Nullable Bundle bundle) {
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

    public void removeAndRecycleAllViews(@NonNull d1 d1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, d1Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(d1 d1Var) {
        ArrayList arrayList;
        int size = d1Var.a.size();
        int i10 = size - 1;
        while (true) {
            arrayList = d1Var.a;
            if (i10 < 0) {
                break;
            }
            View view = ((o1) arrayList.get(i10)).itemView;
            o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                q0 q0Var = this.mRecyclerView.mItemAnimator;
                if (q0Var != null) {
                    q0Var.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                o1 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                d1Var.k(childViewHolderInt2);
            }
            i10--;
        }
        arrayList.clear();
        ArrayList arrayList2 = d1Var.f1890b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull d1 d1Var) {
        removeView(view);
        d1Var.j(view);
    }

    public void removeAndRecycleViewAt(int i10, @NonNull d1 d1Var) {
        View childAt = getChildAt(i10);
        removeViewAt(i10);
        d1Var.j(childAt);
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
        d dVar = this.mChildHelper;
        h0 h0Var = dVar.a;
        int i10 = dVar.f1888d;
        if (i10 != 1) {
            if (i10 != 2) {
                try {
                    dVar.f1888d = 1;
                    dVar.f1889e = view;
                    int indexOfChild = h0Var.a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (dVar.f1886b.k(indexOfChild)) {
                            dVar.m(view);
                        }
                        h0Var.d(indexOfChild);
                    }
                    return;
                } finally {
                    dVar.f1888d = 0;
                    dVar.f1889e = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void removeViewAt(int i10) {
        if (getChildAt(i10) != null) {
            this.mChildHelper.l(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b0, code lost:
    
        if (r10 == false) goto L32;
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
            if (r13 == 0) goto Lb2
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L79
        L77:
            r10 = r0
            goto Lb0
        L79:
            int r11 = r8.getPaddingLeft()
            int r13 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.mTempRect
            r8.getDecoratedBoundsWithMargins(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto L77
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto L77
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto L77
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto Laf
            goto L77
        Laf:
            r10 = r7
        Lb0:
            if (r10 == 0) goto Lb7
        Lb2:
            if (r2 != 0) goto Lb8
            if (r1 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r2, r1)
            goto Lc1
        Lbe:
            r9.smoothScrollBy(r2, r1)
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v0.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
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

    public abstract int scrollHorizontallyBy(int i10, d1 d1Var, k1 k1Var);

    public abstract void scrollToPosition(int i10);

    public abstract int scrollVerticallyBy(int i10, d1 d1Var, k1 k1Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z10) {
        this.mAutoMeasure = z10;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z10) {
        if (z10 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z10;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.o();
            }
        }
    }

    public void setMeasureSpecs(int i10, int i11) {
        this.mWidth = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.mHeightMode = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mHeight = 0;
        }
    }

    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        setMeasuredDimension(chooseSize(i10, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i11, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i10, int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.mRecyclerView.mTempRect.set(i15, i13, i12, i14);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i10, i11);
    }

    public void setMeasurementCacheEnabled(boolean z10) {
        this.mMeasurementCacheEnabled = z10;
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

    public boolean shouldMeasureChild(View view, int i10, int i11, w0 w0Var) {
        if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) w0Var).width) && b(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) w0Var).height)) {
            return false;
        }
        return true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i10, int i11, w0 w0Var) {
        if (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) w0Var).width) && b(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) w0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, k1 k1Var, int i10);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(j1 j1Var) {
        j1 j1Var2 = this.mSmoothScroller;
        if (j1Var2 != null && j1Var != j1Var2 && j1Var2.f1943e) {
            j1Var2.d();
        }
        this.mSmoothScroller = j1Var;
        RecyclerView recyclerView = this.mRecyclerView;
        j1Var.getClass();
        n1 n1Var = recyclerView.mViewFlinger;
        n1Var.f1982i.removeCallbacks(n1Var);
        n1Var.f1978d.abortAnimation();
        if (j1Var.f1946h) {
            Log.w("RecyclerView", "An instance of " + j1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + j1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        j1Var.f1940b = recyclerView;
        j1Var.f1941c = this;
        int i10 = j1Var.a;
        if (i10 != -1) {
            recyclerView.mState.a = i10;
            j1Var.f1943e = true;
            j1Var.f1942d = true;
            j1Var.f1944f = recyclerView.mLayout.findViewByPosition(i10);
            j1Var.f1940b.mViewFlinger.b();
            j1Var.f1946h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void stopIgnoringView(@NonNull View view) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        j1 j1Var = this.mSmoothScroller;
        if (j1Var != null) {
            j1Var.d();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i10) {
        a(view, i10, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i10) {
        a(view, i10, false);
    }

    public void onInitializeAccessibilityEvent(@NonNull d1 d1Var, @NonNull k1 k1Var, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        j0 j0Var = this.mRecyclerView.mAdapter;
        if (j0Var != null) {
            accessibilityEvent.setItemCount(j0Var.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull d1 d1Var, @NonNull k1 k1Var, @NonNull o0.j jVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            jVar.a(8192);
            jVar.m(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            jVar.a(4096);
            jVar.m(true);
        }
        jVar.j(new o0.h(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(d1Var, k1Var), getColumnCountForAccessibility(d1Var, k1Var), isLayoutHierarchical(d1Var, k1Var), getSelectionModeForAccessibility(d1Var, k1Var))));
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, o0.j jVar) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.k(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, jVar);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11, @Nullable Object obj) {
        onItemsUpdated(recyclerView, i10, i11);
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull k1 k1Var, @NonNull View view, @Nullable View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public boolean performAccessibilityAction(@NonNull d1 d1Var, @NonNull k1 k1Var, int i10, @Nullable Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i11;
        int i12;
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
        if (i10 == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i11 = paddingTop;
                i12 = paddingLeft;
            }
            i11 = paddingTop;
            i12 = 0;
        } else if (i10 != 8192) {
            i12 = 0;
            i11 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i11 = paddingTop;
                i12 = paddingLeft;
            }
            i11 = paddingTop;
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i12, i11, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i10, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
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
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1a:
            if (r7 < 0) goto L1e
        L1c:
            r5 = r3
            goto L31
        L1e:
            if (r7 != r1) goto L22
        L20:
            r7 = r4
            goto L31
        L22:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L29
            goto L2c
        L29:
            r7 = r4
            r5 = r6
            goto L31
        L2c:
            r7 = r4
            r5 = r2
            goto L31
        L2f:
            r5 = r6
            r7 = r5
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v0.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    @SuppressLint({"UnknownNullness"})
    public w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new w0(context, attributeSet);
    }

    public void setMeasuredDimension(int i10, int i11) {
        this.mRecyclerView.setMeasuredDimension(i10, i11);
    }

    public void attachView(@NonNull View view, int i10) {
        attachView(view, i10, (w0) view.getLayoutParams());
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
    }
}
