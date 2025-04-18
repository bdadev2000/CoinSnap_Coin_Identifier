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
public class LinearLayoutManager extends v0 implements i1 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final x mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final y mLayoutChunkResult;
    private z mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    a0 mPendingSavedState;
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

    private int computeScrollExtent(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.o.b(k1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.o.c(k1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return com.facebook.appevents.o.d(k1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
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

    private int fixLayoutEndGap(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i10;
        if (endAfterPadding2 > 0) {
            int i11 = -scrollBy(-endAfterPadding2, d1Var, k1Var);
            int i12 = i10 + i11;
            if (z10 && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i12) > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding);
                return endAfterPadding + i11;
            }
            return i11;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int startAfterPadding;
        int startAfterPadding2 = i10 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i11 = -scrollBy(startAfterPadding2, d1Var, k1Var);
            int i12 = i10 + i11;
            if (z10 && (startAfterPadding = i12 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
                this.mOrientationHelper.offsetChildren(-startAfterPadding);
                return i11 - startAfterPadding;
            }
            return i11;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(d1 d1Var, k1 k1Var, int i10, int i11) {
        boolean z10;
        if (k1Var.f1969k && getChildCount() != 0 && !k1Var.f1965g && supportsPredictiveItemAnimations()) {
            List list = d1Var.f1892d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                o1 o1Var = (o1) list.get(i14);
                if (!o1Var.isRemoved()) {
                    char c10 = 1;
                    if (o1Var.getLayoutPosition() < position) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.mShouldReverseLayout) {
                        c10 = 65535;
                    }
                    if (c10 == 65535) {
                        i12 += this.mOrientationHelper.getDecoratedMeasurement(o1Var.itemView);
                    } else {
                        i13 += this.mOrientationHelper.getDecoratedMeasurement(o1Var.itemView);
                    }
                }
            }
            this.mLayoutState.f2097k = list;
            if (i12 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i10);
                z zVar = this.mLayoutState;
                zVar.f2094h = i12;
                zVar.f2089c = 0;
                zVar.a(null);
                fill(d1Var, this.mLayoutState, k1Var, false);
            }
            if (i13 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i11);
                z zVar2 = this.mLayoutState;
                zVar2.f2094h = i13;
                zVar2.f2089c = 0;
                zVar2.a(null);
                fill(d1Var, this.mLayoutState, k1Var, false);
            }
            this.mLayoutState.f2097k = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(d1 d1Var, z zVar) {
        if (zVar.a && !zVar.f2098l) {
            int i10 = zVar.f2093g;
            int i11 = zVar.f2095i;
            if (zVar.f2092f == -1) {
                recycleViewsFromEnd(d1Var, i10, i11);
            } else {
                recycleViewsFromStart(d1Var, i10, i11);
            }
        }
    }

    private void recycleChildren(d1 d1Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, d1Var);
            }
            return;
        }
        while (i10 > i11) {
            removeAndRecycleViewAt(i10, d1Var);
            i10--;
        }
    }

    private void recycleViewsFromEnd(d1 d1Var, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int end = (this.mOrientationHelper.getEnd() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                    recycleChildren(d1Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                recycleChildren(d1Var, i13, i14);
                return;
            }
        }
    }

    private void recycleViewsFromStart(d1 d1Var, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i13 = childCount - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View childAt = getChildAt(i14);
                if (this.mOrientationHelper.getDecoratedEnd(childAt) > i12 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i12) {
                    recycleChildren(d1Var, i13, i14);
                    return;
                }
            }
            return;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i12 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i12) {
                recycleChildren(d1Var, 0, i15);
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

    private boolean updateAnchorFromChildren(d1 d1Var, k1 k1Var, x xVar) {
        View findReferenceChild;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            xVar.getClass();
            w0 w0Var = (w0) focusedChild.getLayoutParams();
            if (!w0Var.c() && w0Var.a() >= 0 && w0Var.a() < k1Var.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                xVar.c(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z13 = this.mLastStackFromEnd;
        boolean z14 = this.mStackFromEnd;
        if (z13 != z14 || (findReferenceChild = findReferenceChild(d1Var, k1Var, xVar.f2074d, z14)) == null) {
            return false;
        }
        xVar.b(getPosition(findReferenceChild), findReferenceChild);
        if (!k1Var.f1965g && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(findReferenceChild);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findReferenceChild);
            int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z12 = true;
            }
            if (z10 || z12) {
                if (xVar.f2074d) {
                    startAfterPadding = endAfterPadding;
                }
                xVar.f2073c = startAfterPadding;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(k1 k1Var, x xVar) {
        int i10;
        boolean z10;
        int decoratedStart;
        boolean z11;
        boolean z12 = false;
        if (!k1Var.f1965g && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < k1Var.b()) {
                int i11 = this.mPendingScrollPosition;
                xVar.f2072b = i11;
                a0 a0Var = this.mPendingSavedState;
                if (a0Var != null) {
                    if (a0Var.f1858b >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        boolean z13 = a0Var.f1860d;
                        xVar.f2074d = z13;
                        if (z13) {
                            xVar.f2073c = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.f1859c;
                        } else {
                            xVar.f2073c = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.f1859c;
                        }
                        return true;
                    }
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i11);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            xVar.a();
                            return true;
                        }
                        if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            xVar.f2073c = this.mOrientationHelper.getStartAfterPadding();
                            xVar.f2074d = false;
                            return true;
                        }
                        if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            xVar.f2073c = this.mOrientationHelper.getEndAfterPadding();
                            xVar.f2074d = true;
                            return true;
                        }
                        if (xVar.f2074d) {
                            decoratedStart = this.mOrientationHelper.getTotalSpaceChange() + this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                        } else {
                            decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                        }
                        xVar.f2073c = decoratedStart;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.mShouldReverseLayout) {
                                z12 = true;
                            }
                            xVar.f2074d = z12;
                        }
                        xVar.a();
                    }
                    return true;
                }
                boolean z14 = this.mShouldReverseLayout;
                xVar.f2074d = z14;
                if (z14) {
                    xVar.f2073c = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                } else {
                    xVar.f2073c = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(d1 d1Var, k1 k1Var, x xVar) {
        int i10;
        if (updateAnchorFromPendingData(k1Var, xVar) || updateAnchorFromChildren(d1Var, k1Var, xVar)) {
            return;
        }
        xVar.a();
        if (this.mStackFromEnd) {
            i10 = k1Var.b() - 1;
        } else {
            i10 = 0;
        }
        xVar.f2072b = i10;
    }

    private void updateLayoutState(int i10, int i11, boolean z10, k1 k1Var) {
        int i12;
        int startAfterPadding;
        this.mLayoutState.f2098l = resolveIsInfinite();
        this.mLayoutState.f2092f = i10;
        int[] iArr = this.mReusableIntPair;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(k1Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i10 == 1) {
            z11 = true;
        }
        z zVar = this.mLayoutState;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        zVar.f2094h = i12;
        if (!z11) {
            max = max2;
        }
        zVar.f2095i = max;
        if (z11) {
            zVar.f2094h = this.mOrientationHelper.getEndPadding() + i12;
            View childClosestToEnd = getChildClosestToEnd();
            z zVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i13 = -1;
            }
            zVar2.f2091e = i13;
            int position = getPosition(childClosestToEnd);
            z zVar3 = this.mLayoutState;
            zVar2.f2090d = position + zVar3.f2091e;
            zVar3.f2088b = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            z zVar4 = this.mLayoutState;
            zVar4.f2094h = this.mOrientationHelper.getStartAfterPadding() + zVar4.f2094h;
            z zVar5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i13 = -1;
            }
            zVar5.f2091e = i13;
            int position2 = getPosition(childClosestToStart);
            z zVar6 = this.mLayoutState;
            zVar5.f2090d = position2 + zVar6.f2091e;
            zVar6.f2088b = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        z zVar7 = this.mLayoutState;
        zVar7.f2089c = i11;
        if (z10) {
            zVar7.f2089c = i11 - startAfterPadding;
        }
        zVar7.f2093g = startAfterPadding;
    }

    private void updateLayoutStateToFillEnd(x xVar) {
        updateLayoutStateToFillEnd(xVar.f2072b, xVar.f2073c);
    }

    private void updateLayoutStateToFillStart(x xVar) {
        updateLayoutStateToFillStart(xVar.f2072b, xVar.f2073c);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull k1 k1Var, @NonNull int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(k1Var);
        if (this.mLayoutState.f2092f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i10, int i11, k1 k1Var, t0 t0Var) {
        int i12;
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() != 0 && i10 != 0) {
            ensureLayoutState();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            updateLayoutState(i12, Math.abs(i10), true, k1Var);
            collectPrefetchPositionsForLayoutState(k1Var, this.mLayoutState, t0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.v0
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void collectInitialPrefetchPositions(int r7, androidx.recyclerview.widget.t0 r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.a0 r0 = r6.mPendingSavedState
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f1858b
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f1860d
            goto L22
        L13:
            r6.resolveShouldLayoutReverse()
            boolean r0 = r6.mShouldReverseLayout
            int r4 = r6.mPendingScrollPosition
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.mInitialPrefetchItemCount
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.q r2 = (androidx.recyclerview.widget.q) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.collectInitialPrefetchPositions(int, androidx.recyclerview.widget.t0):void");
    }

    public void collectPrefetchPositionsForLayoutState(k1 k1Var, z zVar, t0 t0Var) {
        int i10 = zVar.f2090d;
        if (i10 >= 0 && i10 < k1Var.b()) {
            ((q) t0Var).a(i10, Math.max(0, zVar.f2093g));
        }
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(k1 k1Var) {
        return computeScrollExtent(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(k1 k1Var) {
        return computeScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(k1 k1Var) {
        return computeScrollRange(k1Var);
    }

    @Override // androidx.recyclerview.widget.i1
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < getPosition(getChildAt(0))) {
            z10 = true;
        }
        if (z10 != this.mShouldReverseLayout) {
            i11 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(k1 k1Var) {
        return computeScrollExtent(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(k1 k1Var) {
        return computeScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(k1 k1Var) {
        return computeScrollRange(k1Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.mOrientation == 1) {
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

    public z createLayoutState() {
        return new z();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(d1 d1Var, z zVar, k1 k1Var, boolean z10) {
        boolean z11;
        int i10 = zVar.f2089c;
        int i11 = zVar.f2093g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                zVar.f2093g = i11 + i10;
            }
            recycleByLayoutState(d1Var, zVar);
        }
        int i12 = zVar.f2089c + zVar.f2094h;
        y yVar = this.mLayoutChunkResult;
        while (true) {
            if (!zVar.f2098l && i12 <= 0) {
                break;
            }
            int i13 = zVar.f2090d;
            if (i13 >= 0 && i13 < k1Var.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            yVar.a = 0;
            yVar.f2081b = false;
            yVar.f2082c = false;
            yVar.f2083d = false;
            layoutChunk(d1Var, k1Var, zVar, yVar);
            if (!yVar.f2081b) {
                int i14 = zVar.f2088b;
                int i15 = yVar.a;
                zVar.f2088b = (zVar.f2092f * i15) + i14;
                if (!yVar.f2082c || zVar.f2097k != null || !k1Var.f1965g) {
                    zVar.f2089c -= i15;
                    i12 -= i15;
                }
                int i16 = zVar.f2093g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    zVar.f2093g = i17;
                    int i18 = zVar.f2089c;
                    if (i18 < 0) {
                        zVar.f2093g = i17 + i18;
                    }
                    recycleByLayoutState(d1Var, zVar);
                }
                if (z10 && yVar.f2083d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - zVar.f2089c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z10, z11);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
        }
        return findOneVisibleChild(0, getChildCount(), z10, z11);
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

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i10)) < this.mOrientationHelper.getStartAfterPadding()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i10, i11, i12, i13);
        }
        return this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        ensureLayoutState();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i10, i11, i12, i13);
        }
        return this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    public View findReferenceChild(d1 d1Var, k1 k1Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z11) {
            i11 = getChildCount() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = childCount;
            i11 = 0;
            i12 = 1;
        }
        int b3 = k1Var.b();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (position >= 0 && position < b3) {
                if (((w0) childAt.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public w0 generateDefaultLayoutParams() {
        return new w0(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(k1 k1Var) {
        boolean z10;
        if (k1Var.a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.mOrientationHelper.getTotalSpace();
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

    @Override // androidx.recyclerview.widget.v0
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(d1 d1Var, k1 k1Var, z zVar, y yVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int decoratedMeasurementInOther;
        boolean z11;
        View b3 = zVar.b(d1Var);
        if (b3 == null) {
            yVar.f2081b = true;
            return;
        }
        w0 w0Var = (w0) b3.getLayoutParams();
        if (zVar.f2097k == null) {
            boolean z12 = this.mShouldReverseLayout;
            if (zVar.f2092f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                addView(b3);
            } else {
                addView(b3, 0);
            }
        } else {
            boolean z13 = this.mShouldReverseLayout;
            if (zVar.f2092f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                addDisappearingView(b3);
            } else {
                addDisappearingView(b3, 0);
            }
        }
        measureChildWithMargins(b3, 0, 0);
        yVar.a = this.mOrientationHelper.getDecoratedMeasurement(b3);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i13 = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(b3);
            } else {
                i13 = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(b3) + i13;
            }
            if (zVar.f2092f == -1) {
                int i14 = zVar.f2088b;
                i12 = i14;
                i11 = decoratedMeasurementInOther;
                i10 = i14 - yVar.a;
            } else {
                int i15 = zVar.f2088b;
                i10 = i15;
                i11 = decoratedMeasurementInOther;
                i12 = yVar.a + i15;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(b3) + paddingTop;
            if (zVar.f2092f == -1) {
                int i16 = zVar.f2088b;
                i11 = i16;
                i10 = paddingTop;
                i12 = decoratedMeasurementInOther2;
                i13 = i16 - yVar.a;
            } else {
                int i17 = zVar.f2088b;
                i10 = paddingTop;
                i11 = yVar.a + i17;
                i12 = decoratedMeasurementInOther2;
                i13 = i17;
            }
        }
        layoutDecoratedWithMargins(b3, i13, i10, i11, i12);
        if (w0Var.c() || w0Var.b()) {
            yVar.f2082c = true;
        }
        yVar.f2083d = b3.hasFocusable();
    }

    public void onAnchorReady(d1 d1Var, k1 k1Var, x xVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, d1 d1Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(d1Var);
            d1Var.a.clear();
            d1Var.h();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i10, d1 d1Var, k1 k1Var) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, k1Var);
        z zVar = this.mLayoutState;
        zVar.f2093g = Integer.MIN_VALUE;
        zVar.a = false;
        fill(d1Var, zVar, k1Var, true);
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

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(d1 d1Var, k1 k1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int fixLayoutEndGap;
        int i15;
        View findViewByPosition;
        int decoratedStart;
        int i16;
        boolean z10;
        int i17 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && k1Var.b() == 0) {
            removeAndRecycleAllViews(d1Var);
            return;
        }
        a0 a0Var = this.mPendingSavedState;
        if (a0Var != null) {
            int i18 = a0Var.f1858b;
            if (i18 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.mPendingScrollPosition = i18;
            }
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        x xVar = this.mAnchorInfo;
        if (xVar.f2075e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
                this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
            }
        } else {
            xVar.d();
            x xVar2 = this.mAnchorInfo;
            xVar2.f2074d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(d1Var, k1Var, xVar2);
            this.mAnchorInfo.f2075e = true;
        }
        z zVar = this.mLayoutState;
        if (zVar.f2096j >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        zVar.f2092f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(k1Var, iArr);
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding() + Math.max(0, this.mReusableIntPair[0]);
        int endPadding = this.mOrientationHelper.getEndPadding() + Math.max(0, this.mReusableIntPair[1]);
        if (k1Var.f1965g && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i15)) != null) {
            if (this.mShouldReverseLayout) {
                i16 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i16 = this.mPendingScrollPositionOffset;
            }
            int i19 = i16 - decoratedStart;
            if (i19 > 0) {
                startAfterPadding += i19;
            } else {
                endPadding -= i19;
            }
        }
        x xVar3 = this.mAnchorInfo;
        if (!xVar3.f2074d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i17 = 1;
        }
        onAnchorReady(d1Var, k1Var, xVar3, i17);
        detachAndScrapAttachedViews(d1Var);
        this.mLayoutState.f2098l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f2095i = 0;
        x xVar4 = this.mAnchorInfo;
        if (xVar4.f2074d) {
            updateLayoutStateToFillStart(xVar4);
            z zVar2 = this.mLayoutState;
            zVar2.f2094h = startAfterPadding;
            fill(d1Var, zVar2, k1Var, false);
            z zVar3 = this.mLayoutState;
            i12 = zVar3.f2088b;
            int i20 = zVar3.f2090d;
            int i21 = zVar3.f2089c;
            if (i21 > 0) {
                endPadding += i21;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            z zVar4 = this.mLayoutState;
            zVar4.f2094h = endPadding;
            zVar4.f2090d += zVar4.f2091e;
            fill(d1Var, zVar4, k1Var, false);
            z zVar5 = this.mLayoutState;
            i11 = zVar5.f2088b;
            int i22 = zVar5.f2089c;
            if (i22 > 0) {
                updateLayoutStateToFillStart(i20, i12);
                z zVar6 = this.mLayoutState;
                zVar6.f2094h = i22;
                fill(d1Var, zVar6, k1Var, false);
                i12 = this.mLayoutState.f2088b;
            }
        } else {
            updateLayoutStateToFillEnd(xVar4);
            z zVar7 = this.mLayoutState;
            zVar7.f2094h = endPadding;
            fill(d1Var, zVar7, k1Var, false);
            z zVar8 = this.mLayoutState;
            int i23 = zVar8.f2088b;
            int i24 = zVar8.f2090d;
            int i25 = zVar8.f2089c;
            if (i25 > 0) {
                startAfterPadding += i25;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            z zVar9 = this.mLayoutState;
            zVar9.f2094h = startAfterPadding;
            zVar9.f2090d += zVar9.f2091e;
            fill(d1Var, zVar9, k1Var, false);
            z zVar10 = this.mLayoutState;
            int i26 = zVar10.f2088b;
            int i27 = zVar10.f2089c;
            if (i27 > 0) {
                updateLayoutStateToFillEnd(i24, i23);
                z zVar11 = this.mLayoutState;
                zVar11.f2094h = i27;
                fill(d1Var, zVar11, k1Var, false);
                i11 = this.mLayoutState.f2088b;
            } else {
                i11 = i23;
            }
            i12 = i26;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i11, d1Var, k1Var, true);
                i13 = i12 + fixLayoutEndGap2;
                i14 = i11 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i13, d1Var, k1Var, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i12, d1Var, k1Var, true);
                i13 = i12 + fixLayoutStartGap;
                i14 = i11 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i14, d1Var, k1Var, false);
            }
            i12 = i13 + fixLayoutEndGap;
            i11 = i14 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(d1Var, k1Var, i12, i11);
        if (!k1Var.f1965g) {
            this.mOrientationHelper.onLayoutComplete();
        } else {
            this.mAnchorInfo.d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(k1 k1Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a0) {
            a0 a0Var = (a0) parcelable;
            this.mPendingSavedState = a0Var;
            if (this.mPendingScrollPosition != -1) {
                a0Var.f1858b = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        a0 a0Var = this.mPendingSavedState;
        if (a0Var != null) {
            return new a0(a0Var);
        }
        a0 a0Var2 = new a0();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            a0Var2.f1860d = z10;
            if (z10) {
                View childClosestToEnd = getChildClosestToEnd();
                a0Var2.f1859c = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                a0Var2.f1858b = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                a0Var2.f1858b = getPosition(childClosestToStart);
                a0Var2.f1859c = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
            }
        } else {
            a0Var2.f1858b = -1;
        }
        return a0Var2;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        char c10;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedMeasurement(view) + this.mOrientationHelper.getDecoratedStart(view2)));
                return;
            }
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            return;
        }
        if (c10 == 65535) {
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

    public int scrollBy(int i10, d1 d1Var, k1 k1Var) {
        int i11;
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        updateLayoutState(i11, abs, true, k1Var);
        z zVar = this.mLayoutState;
        int fill = fill(d1Var, zVar, k1Var, false) + zVar.f2093g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i10 = i11 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i10);
        this.mLayoutState.f2096j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i10, d1 d1Var, k1 k1Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, d1Var, k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        a0 a0Var = this.mPendingSavedState;
        if (a0Var != null) {
            a0Var.f1858b = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        a0 a0Var = this.mPendingSavedState;
        if (a0Var != null) {
            a0Var.f1858b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i10, d1 d1Var, k1 k1Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, d1Var, k1Var);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(eb.j.i("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i10);
            this.mOrientationHelper = createOrientationHelper;
            this.mAnchorInfo.a = createOrientationHelper;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.v0
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, k1 k1Var, int i10) {
        b0 b0Var = new b0(recyclerView.getContext());
        b0Var.a = i10;
        startSmoothScroll(b0Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z10 = true;
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart2 >= decoratedStart) {
                        z10 = false;
                    }
                    sb2.append(z10);
                    throw new RuntimeException(sb2.toString());
                }
                if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                if (decoratedStart3 >= decoratedStart) {
                    z10 = false;
                }
                sb3.append(z10);
                throw new RuntimeException(sb3.toString());
            }
            if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new x();
        this.mLayoutChunkResult = new y();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    private void updateLayoutStateToFillEnd(int i10, int i11) {
        this.mLayoutState.f2089c = this.mOrientationHelper.getEndAfterPadding() - i11;
        z zVar = this.mLayoutState;
        zVar.f2091e = this.mShouldReverseLayout ? -1 : 1;
        zVar.f2090d = i10;
        zVar.f2092f = 1;
        zVar.f2088b = i11;
        zVar.f2093g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i10, int i11) {
        this.mLayoutState.f2089c = i11 - this.mOrientationHelper.getStartAfterPadding();
        z zVar = this.mLayoutState;
        zVar.f2090d = i10;
        zVar.f2091e = this.mShouldReverseLayout ? 1 : -1;
        zVar.f2092f = -1;
        zVar.f2088b = i11;
        zVar.f2093g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new x();
        this.mLayoutChunkResult = new y();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        u0 properties = v0.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.a);
        setReverseLayout(properties.f2043c);
        setStackFromEnd(properties.f2044d);
    }
}
