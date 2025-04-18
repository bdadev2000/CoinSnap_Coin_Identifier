package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    v mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new t();
        this.mDecorInsets = new Rect();
        setSpanCount(v0.getProperties(context, attributeSet, i10, i11).f2042b);
    }

    private void assignSpans(d1 d1Var, k1 k1Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.mSet[i11];
            u uVar = (u) view.getLayoutParams();
            int spanSize = getSpanSize(d1Var, k1Var, getPosition(view));
            uVar.f2041f = spanSize;
            uVar.f2040e = i14;
            i14 += spanSize;
            i11 += i13;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            u uVar = (u) getChildAt(i10).getLayoutParams();
            int a = uVar.a();
            this.mPreLayoutSpanSizeCache.put(a, uVar.f2041f);
            this.mPreLayoutSpanIndexCache.put(a, uVar.f2040e);
        }
    }

    private void calculateItemBorders(int i10) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i10);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(k1 k1Var) {
        int max;
        if (getChildCount() != 0 && k1Var.b() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z10 = !isSmoothScrollbarEnabled;
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(z10, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(z10, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                v vVar = this.mSpanSizeLookup;
                int position = getPosition(findFirstVisibleChildClosestToStart);
                int i10 = this.mSpanCount;
                vVar.getClass();
                int a = v.a(position, i10);
                v vVar2 = this.mSpanSizeLookup;
                int position2 = getPosition(findFirstVisibleChildClosestToEnd);
                int i11 = this.mSpanCount;
                vVar2.getClass();
                int a10 = v.a(position2, i11);
                int min = Math.min(a, a10);
                int max2 = Math.max(a, a10);
                v vVar3 = this.mSpanSizeLookup;
                int b3 = k1Var.b() - 1;
                int i12 = this.mSpanCount;
                vVar3.getClass();
                int a11 = v.a(b3, i12) + 1;
                if (this.mShouldReverseLayout) {
                    max = Math.max(0, (a11 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                int abs = Math.abs(this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart));
                v vVar4 = this.mSpanSizeLookup;
                int position3 = getPosition(findFirstVisibleChildClosestToStart);
                int i13 = this.mSpanCount;
                vVar4.getClass();
                int a12 = v.a(position3, i13);
                v vVar5 = this.mSpanSizeLookup;
                int position4 = getPosition(findFirstVisibleChildClosestToEnd);
                int i14 = this.mSpanCount;
                vVar5.getClass();
                return Math.round((max * (abs / ((v.a(position4, i14) - a12) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(k1 k1Var) {
        if (getChildCount() != 0 && k1Var.b() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    v vVar = this.mSpanSizeLookup;
                    int b3 = k1Var.b() - 1;
                    int i10 = this.mSpanCount;
                    vVar.getClass();
                    return v.a(b3, i10) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart);
                v vVar2 = this.mSpanSizeLookup;
                int position = getPosition(findFirstVisibleChildClosestToStart);
                int i11 = this.mSpanCount;
                vVar2.getClass();
                int a = v.a(position, i11);
                v vVar3 = this.mSpanSizeLookup;
                int position2 = getPosition(findFirstVisibleChildClosestToEnd);
                int i12 = this.mSpanCount;
                vVar3.getClass();
                int a10 = v.a(position2, i12);
                v vVar4 = this.mSpanSizeLookup;
                int b10 = k1Var.b() - 1;
                int i13 = this.mSpanCount;
                vVar4.getClass();
                return (int) ((decoratedEnd / ((a10 - a) + 1)) * (v.a(b10, i13) + 1));
            }
            return 0;
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(d1 d1Var, k1 k1Var, x xVar, int i10) {
        boolean z10;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int spanIndex = getSpanIndex(d1Var, k1Var, xVar.f2072b);
        if (z10) {
            while (spanIndex > 0) {
                int i11 = xVar.f2072b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    xVar.f2072b = i12;
                    spanIndex = getSpanIndex(d1Var, k1Var, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b3 = k1Var.b() - 1;
        int i13 = xVar.f2072b;
        while (i13 < b3) {
            int i14 = i13 + 1;
            int spanIndex2 = getSpanIndex(d1Var, k1Var, i14);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i13 = i14;
            spanIndex = spanIndex2;
        }
        xVar.f2072b = i13;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(d1 d1Var, k1 k1Var, int i10) {
        if (!k1Var.f1965g) {
            v vVar = this.mSpanSizeLookup;
            int i11 = this.mSpanCount;
            vVar.getClass();
            return v.a(i10, i11);
        }
        int b3 = d1Var.b(i10);
        if (b3 == -1) {
            eb.j.v("Cannot find span size for pre layout position. ", i10, TAG);
            return 0;
        }
        v vVar2 = this.mSpanSizeLookup;
        int i12 = this.mSpanCount;
        vVar2.getClass();
        return v.a(b3, i12);
    }

    private int getSpanIndex(d1 d1Var, k1 k1Var, int i10) {
        if (!k1Var.f1965g) {
            v vVar = this.mSpanSizeLookup;
            int i11 = this.mSpanCount;
            vVar.getClass();
            return i10 % i11;
        }
        int i12 = this.mPreLayoutSpanIndexCache.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int b3 = d1Var.b(i10);
        if (b3 == -1) {
            eb.j.v("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i10, TAG);
            return 0;
        }
        v vVar2 = this.mSpanSizeLookup;
        int i13 = this.mSpanCount;
        vVar2.getClass();
        return b3 % i13;
    }

    private int getSpanSize(d1 d1Var, k1 k1Var, int i10) {
        if (!k1Var.f1965g) {
            this.mSpanSizeLookup.getClass();
            return 1;
        }
        int i11 = this.mPreLayoutSpanSizeCache.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (d1Var.b(i10) == -1) {
            eb.j.v("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i10, TAG);
            return 1;
        }
        this.mSpanSizeLookup.getClass();
        return 1;
    }

    private void guessMeasurement(float f10, int i10) {
        calculateItemBorders(Math.max(Math.round(f10 * this.mSpanCount), i10));
    }

    private void measureChild(View view, int i10, boolean z10) {
        int i11;
        int i12;
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f2059b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(uVar.f2040e, uVar.f2041f);
        if (this.mOrientation == 1) {
            i12 = v0.getChildMeasureSpec(spaceForSpanRange, i10, i14, ((ViewGroup.MarginLayoutParams) uVar).width, false);
            i11 = v0.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i13, ((ViewGroup.MarginLayoutParams) uVar).height, true);
        } else {
            int childMeasureSpec = v0.getChildMeasureSpec(spaceForSpanRange, i10, i13, ((ViewGroup.MarginLayoutParams) uVar).height, false);
            int childMeasureSpec2 = v0.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i14, ((ViewGroup.MarginLayoutParams) uVar).width, true);
            i11 = childMeasureSpec;
            i12 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i12, i11, z10);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i10, int i11, boolean z10) {
        boolean shouldMeasureChild;
        w0 w0Var = (w0) view.getLayoutParams();
        if (z10) {
            shouldMeasureChild = shouldReMeasureChild(view, i10, i11, w0Var);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i10, i11, w0Var);
        }
        if (shouldMeasureChild) {
            view.measure(i10, i11);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean checkLayoutParams(w0 w0Var) {
        return w0Var instanceof u;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(k1 k1Var, z zVar, t0 t0Var) {
        boolean z10;
        int i10 = this.mSpanCount;
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            int i12 = zVar.f2090d;
            if (i12 >= 0 && i12 < k1Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i10 > 0) {
                ((q) t0Var).a(zVar.f2090d, Math.max(0, zVar.f2093g));
                this.mSpanSizeLookup.getClass();
                i10--;
                zVar.f2090d += zVar.f2091e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int computeHorizontalScrollOffset(k1 k1Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(k1Var);
        }
        return super.computeHorizontalScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int computeHorizontalScrollRange(k1 k1Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(k1Var);
        }
        return super.computeHorizontalScrollRange(k1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int computeVerticalScrollOffset(k1 k1Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(k1Var);
        }
        return super.computeVerticalScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int computeVerticalScrollRange(k1 k1Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(k1Var);
        }
        return super.computeVerticalScrollRange(k1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(d1 d1Var, k1 k1Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int childCount = getChildCount();
        int i12 = 1;
        if (z11) {
            i11 = getChildCount() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = childCount;
            i11 = 0;
        }
        int b3 = k1Var.b();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < b3 && getSpanIndex(d1Var, k1Var, position) == 0) {
                if (((w0) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public w0 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new u(-2, -1);
        }
        return new u(-1, -2);
    }

    @Override // androidx.recyclerview.widget.v0
    public w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.v0
    public int getColumnCountForAccessibility(d1 d1Var, k1 k1Var) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (k1Var.b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(d1Var, k1Var, k1Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.v0
    public int getRowCountForAccessibility(d1 d1Var, k1 k1Var) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (k1Var.b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(d1Var, k1Var, k1Var.b() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i10, int i11) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            int i12 = this.mSpanCount;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.mCachedBorders;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public v getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(d1 d1Var, k1 k1Var, z zVar, y yVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int decoratedMeasurementInOther;
        int paddingLeft;
        int decoratedMeasurementInOther2;
        int i20;
        int childMeasureSpec;
        int i21;
        boolean z12;
        View b3;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        if (modeInOther != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getChildCount() > 0) {
            i10 = this.mCachedBorders[this.mSpanCount];
        } else {
            i10 = 0;
        }
        if (z10) {
            updateMeasurements();
        }
        if (zVar.f2091e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i22 = this.mSpanCount;
        if (!z11) {
            i22 = getSpanIndex(d1Var, k1Var, zVar.f2090d) + getSpanSize(d1Var, k1Var, zVar.f2090d);
        }
        int i23 = 0;
        while (i23 < this.mSpanCount) {
            int i24 = zVar.f2090d;
            if (i24 >= 0 && i24 < k1Var.b()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 || i22 <= 0) {
                break;
            }
            int i25 = zVar.f2090d;
            int spanSize = getSpanSize(d1Var, k1Var, i25);
            if (spanSize <= this.mSpanCount) {
                i22 -= spanSize;
                if (i22 < 0 || (b3 = zVar.b(d1Var)) == null) {
                    break;
                }
                this.mSet[i23] = b3;
                i23++;
            } else {
                throw new IllegalArgumentException(vd.e.g(a4.j.n("Item at position ", i25, " requires ", spanSize, " spans but GridLayoutManager has only "), this.mSpanCount, " spans."));
            }
        }
        if (i23 == 0) {
            yVar.f2081b = true;
            return;
        }
        assignSpans(d1Var, k1Var, i23, z11);
        float f10 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i23; i27++) {
            View view = this.mSet[i27];
            if (zVar.f2097k == null) {
                if (z11) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z11) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, false);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i26) {
                i26 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther3 = (this.mOrientationHelper.getDecoratedMeasurementInOther(view) * 1.0f) / ((u) view.getLayoutParams()).f2041f;
            if (decoratedMeasurementInOther3 > f10) {
                f10 = decoratedMeasurementInOther3;
            }
        }
        if (z10) {
            guessMeasurement(f10, i10);
            i26 = 0;
            for (int i28 = 0; i28 < i23; i28++) {
                View view2 = this.mSet[i28];
                measureChild(view2, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i26) {
                    i26 = decoratedMeasurement2;
                }
            }
        }
        for (int i29 = 0; i29 < i23; i29++) {
            View view3 = this.mSet[i29];
            if (this.mOrientationHelper.getDecoratedMeasurement(view3) != i26) {
                u uVar = (u) view3.getLayoutParams();
                Rect rect = uVar.f2059b;
                int i30 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
                int i31 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(uVar.f2040e, uVar.f2041f);
                if (this.mOrientation == 1) {
                    i21 = v0.getChildMeasureSpec(spaceForSpanRange, 1073741824, i31, ((ViewGroup.MarginLayoutParams) uVar).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i30, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i31, 1073741824);
                    childMeasureSpec = v0.getChildMeasureSpec(spaceForSpanRange, 1073741824, i30, ((ViewGroup.MarginLayoutParams) uVar).height, false);
                    i21 = makeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, i21, childMeasureSpec, true);
            }
        }
        yVar.a = i26;
        if (this.mOrientation == 1) {
            if (zVar.f2092f == -1) {
                i16 = zVar.f2088b;
                i20 = i16 - i26;
            } else {
                i20 = zVar.f2088b;
                i16 = i20 + i26;
            }
            i14 = i20;
            i15 = 0;
            i13 = 0;
        } else {
            if (zVar.f2092f == -1) {
                i12 = zVar.f2088b;
                i11 = i12 - i26;
            } else {
                i11 = zVar.f2088b;
                i12 = i11 + i26;
            }
            i13 = i11;
            i14 = 0;
            i15 = i12;
            i16 = 0;
        }
        int i32 = 0;
        while (i32 < i23) {
            View view4 = this.mSet[i32];
            u uVar2 = (u) view4.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    decoratedMeasurementInOther2 = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - uVar2.f2040e];
                    paddingLeft = decoratedMeasurementInOther2 - this.mOrientationHelper.getDecoratedMeasurementInOther(view4);
                } else {
                    paddingLeft = this.mCachedBorders[uVar2.f2040e] + getPaddingLeft();
                    decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingLeft;
                }
                decoratedMeasurementInOther = i16;
                i18 = decoratedMeasurementInOther2;
                i19 = paddingLeft;
                i17 = i14;
            } else {
                int paddingTop = getPaddingTop() + this.mCachedBorders[uVar2.f2040e];
                i17 = paddingTop;
                i18 = i15;
                i19 = i13;
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, i19, i17, i18, decoratedMeasurementInOther);
            if (uVar2.c() || uVar2.b()) {
                yVar.f2082c = true;
            }
            yVar.f2083d |= view4.hasFocusable();
            i32++;
            i16 = decoratedMeasurementInOther;
            i15 = i18;
            i13 = i19;
            i14 = i17;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(d1 d1Var, k1 k1Var, x xVar, int i10) {
        super.onAnchorReady(d1Var, k1Var, xVar, i10);
        updateMeasurements();
        if (k1Var.b() > 0 && !k1Var.f1965g) {
            ensureAnchorIsInCorrectSpan(d1Var, k1Var, xVar, i10);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.d1 r26, androidx.recyclerview.widget.k1 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.d1, androidx.recyclerview.widget.k1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.v0
    public void onInitializeAccessibilityNodeInfo(@NonNull d1 d1Var, @NonNull k1 k1Var, @NonNull o0.j jVar) {
        super.onInitializeAccessibilityNodeInfo(d1Var, k1Var, jVar);
        jVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.v0
    public void onInitializeAccessibilityNodeInfoForItem(d1 d1Var, k1 k1Var, View view, o0.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, jVar);
            return;
        }
        u uVar = (u) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(d1Var, k1Var, uVar.a());
        if (this.mOrientation == 0) {
            jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(uVar.f2040e, uVar.f2041f, spanGroupIndex, 1, false, false)));
        } else {
            jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(spanGroupIndex, 1, uVar.f2040e, uVar.f2041f, false, false)));
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.f2049b.clear();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.f2049b.clear();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.f2049b.clear();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.f2049b.clear();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.f2049b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public void onLayoutChildren(d1 d1Var, k1 k1Var) {
        if (k1Var.f1965g) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(d1Var, k1Var);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public void onLayoutCompleted(k1 k1Var) {
        super.onLayoutCompleted(k1Var);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int scrollHorizontallyBy(int i10, d1 d1Var, k1 k1Var) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i10, d1Var, k1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public int scrollVerticallyBy(int i10, d1 d1Var, k1 k1Var) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i10, d1Var, k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int chooseSize;
        int chooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = v0.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            chooseSize = v0.chooseSize(i10, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = v0.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize2 = v0.chooseSize(i11, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i10) {
        if (i10 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i10 >= 1) {
            this.mSpanCount = i10;
            this.mSpanSizeLookup.b();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(eb.j.i("Span count should be at least 1. Provided ", i10));
    }

    public void setSpanSizeLookup(v vVar) {
        this.mSpanSizeLookup = vVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (!z10) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z10) {
        this.mUsingSpansToEstimateScrollBarDimensions = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public static int[] calculateItemBorders(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.v0
    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u(layoutParams);
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new t();
        this.mDecorInsets = new Rect();
        setSpanCount(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new t();
        this.mDecorInsets = new Rect();
        setSpanCount(i10);
    }
}
