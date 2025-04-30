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
    AbstractC0541v mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new AbstractC0541v();
        this.mDecorInsets = new Rect();
        setSpanCount(W.getProperties(context, attributeSet, i9, i10).b);
    }

    private void assignSpans(C0525e0 c0525e0, l0 l0Var, int i9, boolean z8) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z8) {
            i12 = 1;
            i11 = i9;
            i10 = 0;
        } else {
            i10 = i9 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.mSet[i10];
            C0540u c0540u = (C0540u) view.getLayoutParams();
            int spanSize = getSpanSize(c0525e0, l0Var, getPosition(view));
            c0540u.f5097f = spanSize;
            c0540u.f5096e = i13;
            i13 += spanSize;
            i10 += i12;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            C0540u c0540u = (C0540u) getChildAt(i9).getLayoutParams();
            int layoutPosition = c0540u.f4947a.getLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(layoutPosition, c0540u.f5097f);
            this.mPreLayoutSpanIndexCache.put(layoutPosition, c0540u.f5096e);
        }
    }

    private void calculateItemBorders(int i9) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i9);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(l0 l0Var) {
        int max;
        if (getChildCount() != 0 && l0Var.b() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z8 = !isSmoothScrollbarEnabled;
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(z8, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(z8, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                AbstractC0541v abstractC0541v = this.mSpanSizeLookup;
                int position = getPosition(findFirstVisibleChildClosestToStart);
                int i9 = this.mSpanCount;
                abstractC0541v.getClass();
                int a6 = AbstractC0541v.a(position, i9);
                AbstractC0541v abstractC0541v2 = this.mSpanSizeLookup;
                int position2 = getPosition(findFirstVisibleChildClosestToEnd);
                int i10 = this.mSpanCount;
                abstractC0541v2.getClass();
                int a9 = AbstractC0541v.a(position2, i10);
                int min = Math.min(a6, a9);
                int max2 = Math.max(a6, a9);
                AbstractC0541v abstractC0541v3 = this.mSpanSizeLookup;
                int b = l0Var.b() - 1;
                int i11 = this.mSpanCount;
                abstractC0541v3.getClass();
                int a10 = AbstractC0541v.a(b, i11) + 1;
                if (this.mShouldReverseLayout) {
                    max = Math.max(0, (a10 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                int abs = Math.abs(this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart));
                AbstractC0541v abstractC0541v4 = this.mSpanSizeLookup;
                int position3 = getPosition(findFirstVisibleChildClosestToStart);
                int i12 = this.mSpanCount;
                abstractC0541v4.getClass();
                int a11 = AbstractC0541v.a(position3, i12);
                AbstractC0541v abstractC0541v5 = this.mSpanSizeLookup;
                int position4 = getPosition(findFirstVisibleChildClosestToEnd);
                int i13 = this.mSpanCount;
                abstractC0541v5.getClass();
                return Math.round((max * (abs / ((AbstractC0541v.a(position4, i13) - a11) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(l0 l0Var) {
        if (getChildCount() != 0 && l0Var.b() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    AbstractC0541v abstractC0541v = this.mSpanSizeLookup;
                    int b = l0Var.b() - 1;
                    int i9 = this.mSpanCount;
                    abstractC0541v.getClass();
                    return AbstractC0541v.a(b, i9) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(findFirstVisibleChildClosestToStart);
                AbstractC0541v abstractC0541v2 = this.mSpanSizeLookup;
                int position = getPosition(findFirstVisibleChildClosestToStart);
                int i10 = this.mSpanCount;
                abstractC0541v2.getClass();
                int a6 = AbstractC0541v.a(position, i10);
                AbstractC0541v abstractC0541v3 = this.mSpanSizeLookup;
                int position2 = getPosition(findFirstVisibleChildClosestToEnd);
                int i11 = this.mSpanCount;
                abstractC0541v3.getClass();
                int a9 = AbstractC0541v.a(position2, i11);
                AbstractC0541v abstractC0541v4 = this.mSpanSizeLookup;
                int b8 = l0Var.b() - 1;
                int i12 = this.mSpanCount;
                abstractC0541v4.getClass();
                return (int) ((decoratedEnd / ((a9 - a6) + 1)) * (AbstractC0541v.a(b8, i12) + 1));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(C0525e0 c0525e0, l0 l0Var, C0543x c0543x, int i9) {
        boolean z8;
        if (i9 == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int spanIndex = getSpanIndex(c0525e0, l0Var, c0543x.b);
        if (z8) {
            while (spanIndex > 0) {
                int i10 = c0543x.b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    c0543x.b = i11;
                    spanIndex = getSpanIndex(c0525e0, l0Var, i11);
                } else {
                    return;
                }
            }
            return;
        }
        int b = l0Var.b() - 1;
        int i12 = c0543x.b;
        while (i12 < b) {
            int i13 = i12 + 1;
            int spanIndex2 = getSpanIndex(c0525e0, l0Var, i13);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i12 = i13;
            spanIndex = spanIndex2;
        }
        c0543x.b = i12;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(C0525e0 c0525e0, l0 l0Var, int i9) {
        if (!l0Var.f5031g) {
            AbstractC0541v abstractC0541v = this.mSpanSizeLookup;
            int i10 = this.mSpanCount;
            abstractC0541v.getClass();
            return AbstractC0541v.a(i9, i10);
        }
        int b = c0525e0.b(i9);
        if (b == -1) {
            com.mbridge.msdk.foundation.entity.o.z(i9, "Cannot find span size for pre layout position. ", TAG);
            return 0;
        }
        AbstractC0541v abstractC0541v2 = this.mSpanSizeLookup;
        int i11 = this.mSpanCount;
        abstractC0541v2.getClass();
        return AbstractC0541v.a(b, i11);
    }

    private int getSpanIndex(C0525e0 c0525e0, l0 l0Var, int i9) {
        if (!l0Var.f5031g) {
            AbstractC0541v abstractC0541v = this.mSpanSizeLookup;
            int i10 = this.mSpanCount;
            abstractC0541v.getClass();
            return i9 % i10;
        }
        int i11 = this.mPreLayoutSpanIndexCache.get(i9, -1);
        if (i11 != -1) {
            return i11;
        }
        int b = c0525e0.b(i9);
        if (b == -1) {
            com.mbridge.msdk.foundation.entity.o.z(i9, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", TAG);
            return 0;
        }
        AbstractC0541v abstractC0541v2 = this.mSpanSizeLookup;
        int i12 = this.mSpanCount;
        abstractC0541v2.getClass();
        return b % i12;
    }

    private int getSpanSize(C0525e0 c0525e0, l0 l0Var, int i9) {
        if (!l0Var.f5031g) {
            this.mSpanSizeLookup.getClass();
            return 1;
        }
        int i10 = this.mPreLayoutSpanSizeCache.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        if (c0525e0.b(i9) == -1) {
            com.mbridge.msdk.foundation.entity.o.z(i9, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", TAG);
            return 1;
        }
        this.mSpanSizeLookup.getClass();
        return 1;
    }

    private void guessMeasurement(float f9, int i9) {
        calculateItemBorders(Math.max(Math.round(f9 * this.mSpanCount), i9));
    }

    private void measureChild(View view, int i9, boolean z8) {
        int i10;
        int i11;
        C0540u c0540u = (C0540u) view.getLayoutParams();
        Rect rect = c0540u.b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0540u).topMargin + ((ViewGroup.MarginLayoutParams) c0540u).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0540u).leftMargin + ((ViewGroup.MarginLayoutParams) c0540u).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(c0540u.f5096e, c0540u.f5097f);
        if (this.mOrientation == 1) {
            i11 = W.getChildMeasureSpec(spaceForSpanRange, i9, i13, ((ViewGroup.MarginLayoutParams) c0540u).width, false);
            i10 = W.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) c0540u).height, true);
        } else {
            int childMeasureSpec = W.getChildMeasureSpec(spaceForSpanRange, i9, i12, ((ViewGroup.MarginLayoutParams) c0540u).height, false);
            int childMeasureSpec2 = W.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) c0540u).width, true);
            i10 = childMeasureSpec;
            i11 = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i11, i10, z8);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i9, int i10, boolean z8) {
        boolean shouldMeasureChild;
        X x9 = (X) view.getLayoutParams();
        if (z8) {
            shouldMeasureChild = shouldReMeasureChild(view, i9, i10, x9);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i9, i10, x9);
        }
        if (shouldMeasureChild) {
            view.measure(i9, i10);
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

    @Override // androidx.recyclerview.widget.W
    public boolean checkLayoutParams(X x9) {
        return x9 instanceof C0540u;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(l0 l0Var, C0545z c0545z, U u8) {
        int i9;
        int i10 = this.mSpanCount;
        for (int i11 = 0; i11 < this.mSpanCount && (i9 = c0545z.f5134d) >= 0 && i9 < l0Var.b() && i10 > 0; i11++) {
            ((C0537q) u8).a(c0545z.f5134d, Math.max(0, c0545z.f5137g));
            this.mSpanSizeLookup.getClass();
            i10--;
            c0545z.f5134d += c0545z.f5135e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int computeHorizontalScrollOffset(l0 l0Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(l0Var);
        }
        return super.computeHorizontalScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int computeHorizontalScrollRange(l0 l0Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(l0Var);
        }
        return super.computeHorizontalScrollRange(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int computeVerticalScrollOffset(l0 l0Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(l0Var);
        }
        return super.computeVerticalScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int computeVerticalScrollRange(l0 l0Var) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(l0Var);
        }
        return super.computeVerticalScrollRange(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(C0525e0 c0525e0, l0 l0Var, boolean z8, boolean z9) {
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = 1;
        if (z9) {
            i10 = getChildCount() - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = childCount;
            i10 = 0;
        }
        int b = l0Var.b();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i10 != i9) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < b && getSpanIndex(c0525e0, l0Var, position) == 0) {
                if (((X) childAt.getLayoutParams()).f4947a.isRemoved()) {
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
            i10 += i11;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public X generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C0540u(-2, -1);
        }
        return new C0540u(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.X, androidx.recyclerview.widget.u] */
    @Override // androidx.recyclerview.widget.W
    public X generateLayoutParams(Context context, AttributeSet attributeSet) {
        ?? x9 = new X(context, attributeSet);
        x9.f5096e = -1;
        x9.f5097f = 0;
        return x9;
    }

    @Override // androidx.recyclerview.widget.W
    public int getColumnCountForAccessibility(C0525e0 c0525e0, l0 l0Var) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (l0Var.b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0525e0, l0Var, l0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.W
    public int getRowCountForAccessibility(C0525e0 c0525e0, l0 l0Var) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (l0Var.b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0525e0, l0Var, l0Var.b() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i9, int i10) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            int i11 = this.mSpanCount;
            return iArr[i11 - i9] - iArr[(i11 - i9) - i10];
        }
        int[] iArr2 = this.mCachedBorders;
        return iArr2[i10 + i9] - iArr2[i9];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public AbstractC0541v getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutChunk(androidx.recyclerview.widget.C0525e0 r18, androidx.recyclerview.widget.l0 r19, androidx.recyclerview.widget.C0545z r20, androidx.recyclerview.widget.C0544y r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.e0, androidx.recyclerview.widget.l0, androidx.recyclerview.widget.z, androidx.recyclerview.widget.y):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(C0525e0 c0525e0, l0 l0Var, C0543x c0543x, int i9) {
        super.onAnchorReady(c0525e0, l0Var, c0543x, i9);
        updateMeasurements();
        if (l0Var.b() > 0 && !l0Var.f5031g) {
            ensureAnchorIsInCorrectSpan(c0525e0, l0Var, c0543x, i9);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == r10) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.C0525e0 r26, androidx.recyclerview.widget.l0 r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.e0, androidx.recyclerview.widget.l0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.W
    public void onInitializeAccessibilityNodeInfo(@NonNull C0525e0 c0525e0, @NonNull l0 l0Var, @NonNull U.i iVar) {
        super.onInitializeAccessibilityNodeInfo(c0525e0, l0Var, iVar);
        iVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.W
    public void onInitializeAccessibilityNodeInfoForItem(C0525e0 c0525e0, l0 l0Var, View view, U.i iVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0540u)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, iVar);
            return;
        }
        C0540u c0540u = (C0540u) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(c0525e0, l0Var, c0540u.f4947a.getLayoutPosition());
        if (this.mOrientation == 0) {
            AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(c0540u.f5096e, c0540u.f5097f, spanGroupIndex, 1, false, false);
            iVar.getClass();
            iVar.f3098a.setCollectionItemInfo(obtain);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo obtain2 = AccessibilityNodeInfo.CollectionItemInfo.obtain(spanGroupIndex, 1, c0540u.f5096e, c0540u.f5097f, false, false);
            iVar.getClass();
            iVar.f3098a.setCollectionItemInfo(obtain2);
        }
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsAdded(RecyclerView recyclerView, int i9, int i10) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.b.clear();
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.b.clear();
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsMoved(RecyclerView recyclerView, int i9, int i10, int i11) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.b.clear();
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsRemoved(RecyclerView recyclerView, int i9, int i10) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.b.clear();
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsUpdated(RecyclerView recyclerView, int i9, int i10, Object obj) {
        this.mSpanSizeLookup.b();
        this.mSpanSizeLookup.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public void onLayoutChildren(C0525e0 c0525e0, l0 l0Var) {
        if (l0Var.f5031g) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(c0525e0, l0Var);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public void onLayoutCompleted(l0 l0Var) {
        super.onLayoutCompleted(l0Var);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int scrollHorizontallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i9, c0525e0, l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public int scrollVerticallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i9, c0525e0, l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public void setMeasuredDimension(Rect rect, int i9, int i10) {
        int chooseSize;
        int chooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i9, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = W.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            chooseSize = W.chooseSize(i9, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = W.chooseSize(i9, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize2 = W.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i9) {
        if (i9 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i9 >= 1) {
            this.mSpanCount = i9;
            this.mSpanSizeLookup.b();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Span count should be at least 1. Provided "));
    }

    public void setSpanSizeLookup(AbstractC0541v abstractC0541v) {
        this.mSpanSizeLookup = abstractC0541v;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z8) {
        if (!z8) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z8) {
        this.mUsingSpansToEstimateScrollBarDimensions = z8;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && !this.mPendingSpanCountChange) {
            return true;
        }
        return false;
    }

    public static int[] calculateItemBorders(int[] iArr, int i9, int i10) {
        int i11;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i9;
        int i14 = i10 % i9;
        int i15 = 0;
        for (int i16 = 1; i16 <= i9; i16++) {
            i12 += i14;
            if (i12 <= 0 || i9 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i9;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.X, androidx.recyclerview.widget.u] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.X, androidx.recyclerview.widget.u] */
    @Override // androidx.recyclerview.widget.W
    public X generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? x9 = new X((ViewGroup.MarginLayoutParams) layoutParams);
            x9.f5096e = -1;
            x9.f5097f = 0;
            return x9;
        }
        ?? x10 = new X(layoutParams);
        x10.f5096e = -1;
        x10.f5097f = 0;
        return x10;
    }

    public GridLayoutManager(Context context, int i9) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new AbstractC0541v();
        this.mDecorInsets = new Rect();
        setSpanCount(i9);
    }

    public GridLayoutManager(Context context, int i9, int i10, boolean z8) {
        super(context, i10, z8);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new AbstractC0541v();
        this.mDecorInsets = new Rect();
        setSpanCount(i9);
    }
}
