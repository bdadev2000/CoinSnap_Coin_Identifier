package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends W implements j0 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0543x mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0544y mLayoutChunkResult;
    private C0545z mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    A mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.g.b(l0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.g.c(l0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.g.d(l0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i9, C0525e0 c0525e0, l0 l0Var, boolean z8) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i9;
        if (endAfterPadding2 > 0) {
            int i10 = -scrollBy(-endAfterPadding2, c0525e0, l0Var);
            int i11 = i9 + i10;
            if (z8 && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i11) > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding);
                return endAfterPadding + i10;
            }
            return i10;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i9, C0525e0 c0525e0, l0 l0Var, boolean z8) {
        int startAfterPadding;
        int startAfterPadding2 = i9 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i10 = -scrollBy(startAfterPadding2, c0525e0, l0Var);
            int i11 = i9 + i10;
            if (z8 && (startAfterPadding = i11 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
                this.mOrientationHelper.offsetChildren(-startAfterPadding);
                return i10 - startAfterPadding;
            }
            return i10;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (this.mShouldReverseLayout) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int i9;
        if (this.mShouldReverseLayout) {
            i9 = getChildCount() - 1;
        } else {
            i9 = 0;
        }
        return getChildAt(i9);
    }

    private void layoutForPredictiveAnimations(C0525e0 c0525e0, l0 l0Var, int i9, int i10) {
        boolean z8;
        if (l0Var.f5035k && getChildCount() != 0 && !l0Var.f5031g && supportsPredictiveItemAnimations()) {
            List list = c0525e0.f4973d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                p0 p0Var = (p0) list.get(i13);
                if (!p0Var.isRemoved()) {
                    if (p0Var.getLayoutPosition() < position) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8 != this.mShouldReverseLayout) {
                        i11 += this.mOrientationHelper.getDecoratedMeasurement(p0Var.itemView);
                    } else {
                        i12 += this.mOrientationHelper.getDecoratedMeasurement(p0Var.itemView);
                    }
                }
            }
            this.mLayoutState.f5141k = list;
            if (i11 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i9);
                C0545z c0545z = this.mLayoutState;
                c0545z.f5138h = i11;
                c0545z.f5133c = 0;
                c0545z.a(null);
                fill(c0525e0, this.mLayoutState, l0Var, false);
            }
            if (i12 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i10);
                C0545z c0545z2 = this.mLayoutState;
                c0545z2.f5138h = i12;
                c0545z2.f5133c = 0;
                c0545z2.a(null);
                fill(c0525e0, this.mLayoutState, l0Var, false);
            }
            this.mLayoutState.f5141k = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(C0525e0 c0525e0, C0545z c0545z) {
        if (c0545z.f5132a && !c0545z.l) {
            int i9 = c0545z.f5137g;
            int i10 = c0545z.f5139i;
            if (c0545z.f5136f == -1) {
                recycleViewsFromEnd(c0525e0, i9, i10);
            } else {
                recycleViewsFromStart(c0525e0, i9, i10);
            }
        }
    }

    private void recycleChildren(C0525e0 c0525e0, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        if (i10 > i9) {
            for (int i11 = i10 - 1; i11 >= i9; i11--) {
                removeAndRecycleViewAt(i11, c0525e0);
            }
            return;
        }
        while (i9 > i10) {
            removeAndRecycleViewAt(i9, c0525e0);
            i9--;
        }
    }

    private void recycleViewsFromEnd(C0525e0 c0525e0, int i9, int i10) {
        int childCount = getChildCount();
        if (i9 < 0) {
            return;
        }
        int end = (this.mOrientationHelper.getEnd() - i9) + i10;
        if (this.mShouldReverseLayout) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                    recycleChildren(c0525e0, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = childCount - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                recycleChildren(c0525e0, i12, i13);
                return;
            }
        }
    }

    private void recycleViewsFromStart(C0525e0 c0525e0, int i9, int i10) {
        if (i9 < 0) {
            return;
        }
        int i11 = i9 - i10;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.getDecoratedEnd(childAt) > i11 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i11) {
                    recycleChildren(c0525e0, i12, i13);
                    return;
                }
            }
            return;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i11 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i11) {
                recycleChildren(c0525e0, 0, i14);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(C0525e0 c0525e0, l0 l0Var, C0543x c0543x) {
        View findReferenceChild;
        boolean z8;
        boolean z9 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            c0543x.getClass();
            X x9 = (X) focusedChild.getLayoutParams();
            if (!x9.f4947a.isRemoved() && x9.f4947a.getLayoutPosition() >= 0 && x9.f4947a.getLayoutPosition() < l0Var.b()) {
                c0543x.c(focusedChild, getPosition(focusedChild));
                return true;
            }
        }
        boolean z10 = this.mLastStackFromEnd;
        boolean z11 = this.mStackFromEnd;
        if (z10 != z11 || (findReferenceChild = findReferenceChild(c0525e0, l0Var, c0543x.f5114d, z11)) == null) {
            return false;
        }
        c0543x.b(findReferenceChild, getPosition(findReferenceChild));
        if (!l0Var.f5031g && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(findReferenceChild);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findReferenceChild);
            int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z9 = true;
            }
            if (z8 || z9) {
                if (c0543x.f5114d) {
                    startAfterPadding = endAfterPadding;
                }
                c0543x.f5113c = startAfterPadding;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(l0 l0Var, C0543x c0543x) {
        int i9;
        boolean z8;
        int decoratedStart;
        boolean z9 = false;
        if (!l0Var.f5031g && (i9 = this.mPendingScrollPosition) != -1) {
            if (i9 >= 0 && i9 < l0Var.b()) {
                int i10 = this.mPendingScrollPosition;
                c0543x.b = i10;
                A a6 = this.mPendingSavedState;
                if (a6 != null && a6.b >= 0) {
                    boolean z10 = a6.f4918d;
                    c0543x.f5114d = z10;
                    if (z10) {
                        c0543x.f5113c = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.f4917c;
                    } else {
                        c0543x.f5113c = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.f4917c;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i10);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            c0543x.a();
                            return true;
                        }
                        if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            c0543x.f5113c = this.mOrientationHelper.getStartAfterPadding();
                            c0543x.f5114d = false;
                            return true;
                        }
                        if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            c0543x.f5113c = this.mOrientationHelper.getEndAfterPadding();
                            c0543x.f5114d = true;
                            return true;
                        }
                        if (c0543x.f5114d) {
                            decoratedStart = this.mOrientationHelper.getTotalSpaceChange() + this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                        } else {
                            decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                        }
                        c0543x.f5113c = decoratedStart;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8 == this.mShouldReverseLayout) {
                                z9 = true;
                            }
                            c0543x.f5114d = z9;
                        }
                        c0543x.a();
                    }
                    return true;
                }
                boolean z11 = this.mShouldReverseLayout;
                c0543x.f5114d = z11;
                if (z11) {
                    c0543x.f5113c = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                } else {
                    c0543x.f5113c = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(C0525e0 c0525e0, l0 l0Var, C0543x c0543x) {
        int i9;
        if (updateAnchorFromPendingData(l0Var, c0543x) || updateAnchorFromChildren(c0525e0, l0Var, c0543x)) {
            return;
        }
        c0543x.a();
        if (this.mStackFromEnd) {
            i9 = l0Var.b() - 1;
        } else {
            i9 = 0;
        }
        c0543x.b = i9;
    }

    private void updateLayoutState(int i9, int i10, boolean z8, l0 l0Var) {
        int i11;
        int startAfterPadding;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f5136f = i9;
        int[] iArr = this.mReusableIntPair;
        boolean z9 = false;
        iArr[0] = 0;
        int i12 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(l0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i9 == 1) {
            z9 = true;
        }
        C0545z c0545z = this.mLayoutState;
        if (z9) {
            i11 = max2;
        } else {
            i11 = max;
        }
        c0545z.f5138h = i11;
        if (!z9) {
            max = max2;
        }
        c0545z.f5139i = max;
        if (z9) {
            c0545z.f5138h = this.mOrientationHelper.getEndPadding() + i11;
            View childClosestToEnd = getChildClosestToEnd();
            C0545z c0545z2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i12 = -1;
            }
            c0545z2.f5135e = i12;
            int position = getPosition(childClosestToEnd);
            C0545z c0545z3 = this.mLayoutState;
            c0545z2.f5134d = position + c0545z3.f5135e;
            c0545z3.b = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C0545z c0545z4 = this.mLayoutState;
            c0545z4.f5138h = this.mOrientationHelper.getStartAfterPadding() + c0545z4.f5138h;
            C0545z c0545z5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i12 = -1;
            }
            c0545z5.f5135e = i12;
            int position2 = getPosition(childClosestToStart);
            C0545z c0545z6 = this.mLayoutState;
            c0545z5.f5134d = position2 + c0545z6.f5135e;
            c0545z6.b = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        C0545z c0545z7 = this.mLayoutState;
        c0545z7.f5133c = i10;
        if (z8) {
            c0545z7.f5133c = i10 - startAfterPadding;
        }
        c0545z7.f5137g = startAfterPadding;
    }

    private void updateLayoutStateToFillEnd(C0543x c0543x) {
        updateLayoutStateToFillEnd(c0543x.b, c0543x.f5113c);
    }

    private void updateLayoutStateToFillStart(C0543x c0543x) {
        updateLayoutStateToFillStart(c0543x.b, c0543x.f5113c);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull l0 l0Var, @NonNull int[] iArr) {
        int i9;
        int extraLayoutSpace = getExtraLayoutSpace(l0Var);
        if (this.mLayoutState.f5136f == -1) {
            i9 = 0;
        } else {
            i9 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i9;
    }

    @Override // androidx.recyclerview.widget.W
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i9, int i10, l0 l0Var, U u8) {
        int i11;
        if (this.mOrientation != 0) {
            i9 = i10;
        }
        if (getChildCount() != 0 && i9 != 0) {
            ensureLayoutState();
            if (i9 > 0) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            updateLayoutState(i11, Math.abs(i9), true, l0Var);
            collectPrefetchPositionsForLayoutState(l0Var, this.mLayoutState, u8);
        }
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i9, U u8) {
        boolean z8;
        int i10;
        A a6 = this.mPendingSavedState;
        int i11 = -1;
        if (a6 != null && (i10 = a6.b) >= 0) {
            z8 = a6.f4918d;
        } else {
            resolveShouldLayoutReverse();
            z8 = this.mShouldReverseLayout;
            i10 = this.mPendingScrollPosition;
            if (i10 == -1) {
                i10 = z8 ? i9 - 1 : 0;
            }
        }
        if (!z8) {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i9; i12++) {
            ((C0537q) u8).a(i10, 0);
            i10 += i11;
        }
    }

    public void collectPrefetchPositionsForLayoutState(l0 l0Var, C0545z c0545z, U u8) {
        int i9 = c0545z.f5134d;
        if (i9 >= 0 && i9 < l0Var.b()) {
            ((C0537q) u8).a(i9, Math.max(0, c0545z.f5137g));
        }
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(l0 l0Var) {
        return computeScrollExtent(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(l0 l0Var) {
        return computeScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(l0 l0Var) {
        return computeScrollRange(l0Var);
    }

    @Override // androidx.recyclerview.widget.j0
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i9) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z8 = false;
        int i10 = 1;
        if (i9 < getPosition(getChildAt(0))) {
            z8 = true;
        }
        if (z8 != this.mShouldReverseLayout) {
            i10 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(l0 l0Var) {
        return computeScrollExtent(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(l0 l0Var) {
        return computeScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(l0 l0Var) {
        return computeScrollRange(l0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 17) {
                    if (i9 != 33) {
                        if (i9 != 66) {
                            if (i9 == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.mOrientation == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.mOrientation == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.z, java.lang.Object] */
    public C0545z createLayoutState() {
        ?? obj = new Object();
        obj.f5132a = true;
        obj.f5138h = 0;
        obj.f5139i = 0;
        obj.f5141k = null;
        return obj;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(C0525e0 c0525e0, C0545z c0545z, l0 l0Var, boolean z8) {
        int i9;
        int i10 = c0545z.f5133c;
        int i11 = c0545z.f5137g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c0545z.f5137g = i11 + i10;
            }
            recycleByLayoutState(c0525e0, c0545z);
        }
        int i12 = c0545z.f5133c + c0545z.f5138h;
        C0544y c0544y = this.mLayoutChunkResult;
        while (true) {
            if ((!c0545z.l && i12 <= 0) || (i9 = c0545z.f5134d) < 0 || i9 >= l0Var.b()) {
                break;
            }
            c0544y.f5124a = 0;
            c0544y.b = false;
            c0544y.f5125c = false;
            c0544y.f5126d = false;
            layoutChunk(c0525e0, l0Var, c0545z, c0544y);
            if (!c0544y.b) {
                int i13 = c0545z.b;
                int i14 = c0544y.f5124a;
                c0545z.b = (c0545z.f5136f * i14) + i13;
                if (!c0544y.f5125c || c0545z.f5141k != null || !l0Var.f5031g) {
                    c0545z.f5133c -= i14;
                    i12 -= i14;
                }
                int i15 = c0545z.f5137g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    c0545z.f5137g = i16;
                    int i17 = c0545z.f5133c;
                    if (i17 < 0) {
                        c0545z.f5137g = i16 + i17;
                    }
                    recycleByLayoutState(c0525e0, c0545z);
                }
                if (z8 && c0544y.f5126d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c0545z.f5133c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z8, boolean z9) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z8, z9);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z8, z9);
    }

    public View findFirstVisibleChildClosestToStart(boolean z8, boolean z9) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z8, z9);
        }
        return findOneVisibleChild(0, getChildCount(), z8, z9);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i9, int i10) {
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 > i9 || i10 < i9) {
            if (this.mOrientationHelper.getDecoratedStart(getChildAt(i9)) < this.mOrientationHelper.getStartAfterPadding()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            }
            if (this.mOrientation == 0) {
                return this.mHorizontalBoundCheck.a(i9, i10, i11, i12);
            }
            return this.mVerticalBoundCheck.a(i9, i10, i11, i12);
        }
        return getChildAt(i9);
    }

    public View findOneVisibleChild(int i9, int i10, boolean z8, boolean z9) {
        int i11;
        ensureLayoutState();
        int i12 = 320;
        if (z8) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z9) {
            i12 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i9, i10, i11, i12);
        }
        return this.mVerticalBoundCheck.a(i9, i10, i11, i12);
    }

    public View findReferenceChild(C0525e0 c0525e0, l0 l0Var, boolean z8, boolean z9) {
        int i9;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z9) {
            i10 = getChildCount() - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = childCount;
            i10 = 0;
            i11 = 1;
        }
        int b = l0Var.b();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i9) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (position >= 0 && position < b) {
                if (((X) childAt.getLayoutParams()).f4947a.isRemoved()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10 && !z11) {
                        return childAt;
                    }
                    if (z8) {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z10) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i10 += i11;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i9) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i9 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i9) {
                return childAt;
            }
        }
        return super.findViewByPosition(i9);
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public X generateDefaultLayoutParams() {
        return new X(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(l0 l0Var) {
        if (l0Var.f5026a != -1) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.W
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(C0525e0 c0525e0, l0 l0Var, C0545z c0545z, C0544y c0544y) {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        int decoratedMeasurementInOther;
        boolean z9;
        View b = c0545z.b(c0525e0);
        if (b == null) {
            c0544y.b = true;
            return;
        }
        X x9 = (X) b.getLayoutParams();
        if (c0545z.f5141k == null) {
            boolean z10 = this.mShouldReverseLayout;
            if (c0545z.f5136f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 == z9) {
                addView(b);
            } else {
                addView(b, 0);
            }
        } else {
            boolean z11 = this.mShouldReverseLayout;
            if (c0545z.f5136f == -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z11 == z8) {
                addDisappearingView(b);
            } else {
                addDisappearingView(b, 0);
            }
        }
        measureChildWithMargins(b, 0, 0);
        c0544y.f5124a = this.mOrientationHelper.getDecoratedMeasurement(b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i12 = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(b);
            } else {
                i12 = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(b) + i12;
            }
            if (c0545z.f5136f == -1) {
                int i13 = c0545z.b;
                i11 = i13;
                i10 = decoratedMeasurementInOther;
                i9 = i13 - c0544y.f5124a;
            } else {
                int i14 = c0545z.b;
                i9 = i14;
                i10 = decoratedMeasurementInOther;
                i11 = c0544y.f5124a + i14;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(b) + paddingTop;
            if (c0545z.f5136f == -1) {
                int i15 = c0545z.b;
                i10 = i15;
                i9 = paddingTop;
                i11 = decoratedMeasurementInOther2;
                i12 = i15 - c0544y.f5124a;
            } else {
                int i16 = c0545z.b;
                i9 = paddingTop;
                i10 = c0544y.f5124a + i16;
                i11 = decoratedMeasurementInOther2;
                i12 = i16;
            }
        }
        layoutDecoratedWithMargins(b, i12, i9, i10, i11);
        if (x9.f4947a.isRemoved() || x9.f4947a.isUpdated()) {
            c0544y.f5125c = true;
        }
        c0544y.f5126d = b.hasFocusable();
    }

    public void onAnchorReady(C0525e0 c0525e0, l0 l0Var, C0543x c0543x, int i9) {
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, C0525e0 c0525e0) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0525e0);
            c0525e0.f4971a.clear();
            c0525e0.g();
        }
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i9, C0525e0 c0525e0, l0 l0Var) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i9)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, l0Var);
        C0545z c0545z = this.mLayoutState;
        c0545z.f5137g = Integer.MIN_VALUE;
        c0545z.f5132a = false;
        fill(c0525e0, c0545z, l0Var, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(C0525e0 c0525e0, l0 l0Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int fixLayoutEndGap;
        int i14;
        View findViewByPosition;
        int decoratedStart;
        int i15;
        int i16;
        int i17 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && l0Var.b() == 0) {
            removeAndRecycleAllViews(c0525e0);
            return;
        }
        A a6 = this.mPendingSavedState;
        if (a6 != null && (i16 = a6.b) >= 0) {
            this.mPendingScrollPosition = i16;
        }
        ensureLayoutState();
        this.mLayoutState.f5132a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0543x c0543x = this.mAnchorInfo;
        if (c0543x.f5115e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
                this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
            }
        } else {
            c0543x.d();
            C0543x c0543x2 = this.mAnchorInfo;
            c0543x2.f5114d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c0525e0, l0Var, c0543x2);
            this.mAnchorInfo.f5115e = true;
        }
        C0545z c0545z = this.mLayoutState;
        if (c0545z.f5140j >= 0) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        c0545z.f5136f = i9;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(l0Var, iArr);
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding() + Math.max(0, this.mReusableIntPair[0]);
        int endPadding = this.mOrientationHelper.getEndPadding() + Math.max(0, this.mReusableIntPair[1]);
        if (l0Var.f5031g && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i18 = i15 - decoratedStart;
            if (i18 > 0) {
                startAfterPadding += i18;
            } else {
                endPadding -= i18;
            }
        }
        C0543x c0543x3 = this.mAnchorInfo;
        if (!c0543x3.f5114d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i17 = 1;
        }
        onAnchorReady(c0525e0, l0Var, c0543x3, i17);
        detachAndScrapAttachedViews(c0525e0);
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f5139i = 0;
        C0543x c0543x4 = this.mAnchorInfo;
        if (c0543x4.f5114d) {
            updateLayoutStateToFillStart(c0543x4);
            C0545z c0545z2 = this.mLayoutState;
            c0545z2.f5138h = startAfterPadding;
            fill(c0525e0, c0545z2, l0Var, false);
            C0545z c0545z3 = this.mLayoutState;
            i11 = c0545z3.b;
            int i19 = c0545z3.f5134d;
            int i20 = c0545z3.f5133c;
            if (i20 > 0) {
                endPadding += i20;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0545z c0545z4 = this.mLayoutState;
            c0545z4.f5138h = endPadding;
            c0545z4.f5134d += c0545z4.f5135e;
            fill(c0525e0, c0545z4, l0Var, false);
            C0545z c0545z5 = this.mLayoutState;
            i10 = c0545z5.b;
            int i21 = c0545z5.f5133c;
            if (i21 > 0) {
                updateLayoutStateToFillStart(i19, i11);
                C0545z c0545z6 = this.mLayoutState;
                c0545z6.f5138h = i21;
                fill(c0525e0, c0545z6, l0Var, false);
                i11 = this.mLayoutState.b;
            }
        } else {
            updateLayoutStateToFillEnd(c0543x4);
            C0545z c0545z7 = this.mLayoutState;
            c0545z7.f5138h = endPadding;
            fill(c0525e0, c0545z7, l0Var, false);
            C0545z c0545z8 = this.mLayoutState;
            i10 = c0545z8.b;
            int i22 = c0545z8.f5134d;
            int i23 = c0545z8.f5133c;
            if (i23 > 0) {
                startAfterPadding += i23;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0545z c0545z9 = this.mLayoutState;
            c0545z9.f5138h = startAfterPadding;
            c0545z9.f5134d += c0545z9.f5135e;
            fill(c0525e0, c0545z9, l0Var, false);
            C0545z c0545z10 = this.mLayoutState;
            int i24 = c0545z10.b;
            int i25 = c0545z10.f5133c;
            if (i25 > 0) {
                updateLayoutStateToFillEnd(i22, i10);
                C0545z c0545z11 = this.mLayoutState;
                c0545z11.f5138h = i25;
                fill(c0525e0, c0545z11, l0Var, false);
                i10 = this.mLayoutState.b;
            }
            i11 = i24;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i10, c0525e0, l0Var, true);
                i12 = i11 + fixLayoutEndGap2;
                i13 = i10 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i12, c0525e0, l0Var, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i11, c0525e0, l0Var, true);
                i12 = i11 + fixLayoutStartGap;
                i13 = i10 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i13, c0525e0, l0Var, false);
            }
            i11 = i12 + fixLayoutEndGap;
            i10 = i13 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c0525e0, l0Var, i11, i10);
        if (!l0Var.f5031g) {
            this.mOrientationHelper.onLayoutComplete();
        } else {
            this.mAnchorInfo.d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(l0 l0Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof A) {
            A a6 = (A) parcelable;
            this.mPendingSavedState = a6;
            if (this.mPendingScrollPosition != -1) {
                a6.b = -1;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.A] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, androidx.recyclerview.widget.A] */
    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        A a6 = this.mPendingSavedState;
        if (a6 != null) {
            ?? obj = new Object();
            obj.b = a6.b;
            obj.f4917c = a6.f4917c;
            obj.f4918d = a6.f4918d;
            return obj;
        }
        ?? obj2 = new Object();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z8 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            obj2.f4918d = z8;
            if (z8) {
                View childClosestToEnd = getChildClosestToEnd();
                obj2.f4917c = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                obj2.b = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                obj2.b = getPosition(childClosestToStart);
                obj2.f4917c = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
            }
        } else {
            obj2.b = -1;
        }
        return obj2;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i9, int i10) {
        char c9;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c9 = 1;
        } else {
            c9 = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c9 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedMeasurement(view) + this.mOrientationHelper.getDecoratedStart(view2)));
                return;
            }
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            return;
        }
        if (c9 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0) {
            return true;
        }
        return false;
    }

    public int scrollBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        int i10;
        if (getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f5132a = true;
        if (i9 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i9);
        updateLayoutState(i10, abs, true, l0Var);
        C0545z c0545z = this.mLayoutState;
        int fill = fill(c0525e0, c0545z, l0Var, false) + c0545z.f5137g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i9 = i10 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i9);
        this.mLayoutState.f5140j = i9;
        return i9;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i9, c0525e0, l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public void scrollToPosition(int i9) {
        this.mPendingScrollPosition = i9;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        A a6 = this.mPendingSavedState;
        if (a6 != null) {
            a6.b = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i9, int i10) {
        this.mPendingScrollPosition = i9;
        this.mPendingScrollPositionOffset = i10;
        A a6 = this.mPendingSavedState;
        if (a6 != null) {
            a6.b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i9, c0525e0, l0Var);
    }

    public void setInitialPrefetchItemCount(int i9) {
        this.mInitialPrefetchItemCount = i9;
    }

    public void setOrientation(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i9 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i9);
            this.mOrientationHelper = createOrientationHelper;
            this.mAnchorInfo.f5112a = createOrientationHelper;
            this.mOrientation = i9;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z8) {
        this.mRecycleChildrenOnDetach = z8;
    }

    public void setReverseLayout(boolean z8) {
        assertNotInLayoutOrScroll(null);
        if (z8 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z8;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z8) {
        this.mSmoothScrollbarEnabled = z8;
    }

    public void setStackFromEnd(boolean z8) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z8) {
            return;
        }
        this.mStackFromEnd = z8;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, l0 l0Var, int i9) {
        B b = new B(recyclerView.getContext());
        b.f5018a = i9;
        startSmoothScroll(b);
    }

    @Override // androidx.recyclerview.widget.W
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z8 = true;
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i9 = 1; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart2 >= decoratedStart) {
                        z8 = false;
                    }
                    sb.append(z8);
                    throw new RuntimeException(sb.toString());
                }
                if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                if (decoratedStart3 >= decoratedStart) {
                    z8 = false;
                }
                sb2.append(z8);
                throw new RuntimeException(sb2.toString());
            }
            if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.recyclerview.widget.y, java.lang.Object] */
    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i9, boolean z8) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0543x();
        this.mLayoutChunkResult = new Object();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i9);
        setReverseLayout(z8);
    }

    private void updateLayoutStateToFillEnd(int i9, int i10) {
        this.mLayoutState.f5133c = this.mOrientationHelper.getEndAfterPadding() - i10;
        C0545z c0545z = this.mLayoutState;
        c0545z.f5135e = this.mShouldReverseLayout ? -1 : 1;
        c0545z.f5134d = i9;
        c0545z.f5136f = 1;
        c0545z.b = i10;
        c0545z.f5137g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i9, int i10) {
        this.mLayoutState.f5133c = i10 - this.mOrientationHelper.getStartAfterPadding();
        C0545z c0545z = this.mLayoutState;
        c0545z.f5134d = i9;
        c0545z.f5135e = this.mShouldReverseLayout ? 1 : -1;
        c0545z.f5136f = -1;
        c0545z.b = i10;
        c0545z.f5137g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.y, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0543x();
        this.mLayoutChunkResult = new Object();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        V properties = W.getProperties(context, attributeSet, i9, i10);
        setOrientation(properties.f4944a);
        setReverseLayout(properties.f4945c);
        setStackFromEnd(properties.f4946d);
    }
}
