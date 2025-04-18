package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21011a;

    /* renamed from: b, reason: collision with root package name */
    public int f21012b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f21013c;
    public View[] d;
    public final SparseIntArray e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f21014f;

    /* renamed from: g, reason: collision with root package name */
    public final DefaultSpanSizeLookup f21015g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f21016h;

    /* loaded from: classes2.dex */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final void b() {
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f21017f;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.e = -1;
            this.f21017f = 0;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class SpanSizeLookup {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f21018a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f21019b = new SparseIntArray();

        public final int a(int i2, int i3) {
            b();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                b();
                i4++;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i3 ? i5 + 1 : i5;
        }

        public abstract void b();

        public final void c() {
            this.f21018a.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup, androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup] */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f21011a = false;
        this.f21012b = -1;
        this.e = new SparseIntArray();
        this.f21014f = new SparseIntArray();
        this.f21015g = new SpanSizeLookup();
        this.f21016h = new Rect();
        w(RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3).f21076b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2;
        int i3 = this.f21012b;
        for (int i4 = 0; i4 < this.f21012b && (i2 = layoutState.d) >= 0 && i2 < state.b() && i3 > 0; i4++) {
            layoutPrefetchRegistry.a(layoutState.d, Math.max(0, layoutState.f21039g));
            this.f21015g.getClass();
            i3--;
            layoutState.d += layoutState.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = 1;
        if (z3) {
            i3 = getChildCount() - 1;
            i2 = -1;
            i4 = -1;
        } else {
            i2 = childCount;
            i3 = 0;
        }
        int b2 = state.b();
        ensureLayoutState();
        int k2 = this.mOrientationHelper.k();
        int g2 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int position = getPosition(childAt);
            if (position >= 0 && position < b2 && t(position, recycler, state) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).f21078a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < g2 && this.mOrientationHelper.b(childAt) >= k2) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i3 += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.GridLayoutManager$LayoutParams, androidx.recyclerview.widget.RecyclerView$LayoutParams] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ?? layoutParams = new RecyclerView.LayoutParams(context, attributeSet);
        layoutParams.e = -1;
        layoutParams.f21017f = 0;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.f21012b;
        }
        if (state.b() < 1) {
            return 0;
        }
        return s(state.b() - 1, recycler, state) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.f21012b;
        }
        if (state.b() < 1) {
            return 0;
        }
        return s(state.b() - 1, recycler, state) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r21.f21033b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$LayoutState, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        super.onAnchorReady(recycler, state, anchorInfo, i2);
        x();
        if (state.b() > 0 && !state.f21105g) {
            boolean z2 = i2 == 1;
            int t2 = t(anchorInfo.f21030b, recycler, state);
            if (z2) {
                while (t2 > 0) {
                    int i3 = anchorInfo.f21030b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    anchorInfo.f21030b = i4;
                    t2 = t(i4, recycler, state);
                }
            } else {
                int b2 = state.b() - 1;
                int i5 = anchorInfo.f21030b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int t3 = t(i6, recycler, state);
                    if (t3 <= t2) {
                        break;
                    }
                    i5 = i6;
                    t2 = t3;
                }
                anchorInfo.f21030b = i5;
            }
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == (r2 > r7)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.k(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int s2 = s(layoutParams2.f21078a.getLayoutPosition(), recycler, state);
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(layoutParams2.e, layoutParams2.f21017f, s2, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(s2, 1, layoutParams2.e, layoutParams2.f21017f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        defaultSpanSizeLookup.c();
        defaultSpanSizeLookup.f21019b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        defaultSpanSizeLookup.c();
        defaultSpanSizeLookup.f21019b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        defaultSpanSizeLookup.c();
        defaultSpanSizeLookup.f21019b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        defaultSpanSizeLookup.c();
        defaultSpanSizeLookup.f21019b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        defaultSpanSizeLookup.c();
        defaultSpanSizeLookup.f21019b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2 = state.f21105g;
        SparseIntArray sparseIntArray = this.f21014f;
        SparseIntArray sparseIntArray2 = this.e;
        if (z2) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                int layoutPosition = layoutParams.f21078a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, layoutParams.f21017f);
                sparseIntArray.put(layoutPosition, layoutParams.e);
            }
        }
        super.onLayoutChildren(recycler, state);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f21011a = false;
    }

    public final void p(int i2) {
        int i3;
        int[] iArr = this.f21013c;
        int i4 = this.f21012b;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f21013c = iArr;
    }

    public final void q() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.f21012b) {
            this.d = new View[this.f21012b];
        }
    }

    public final int r(int i2, int i3) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f21013c;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f21013c;
        int i4 = this.f21012b;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int s(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2 = state.f21105g;
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        if (!z2) {
            return defaultSpanSizeLookup.a(i2, this.f21012b);
        }
        int b2 = recycler.b(i2);
        if (b2 != -1) {
            return defaultSpanSizeLookup.a(b2, this.f21012b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        x();
        q();
        return super.scrollHorizontallyBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        x();
        q();
        return super.scrollVerticallyBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i2, int i3) {
        int chooseSize;
        int chooseSize2;
        if (this.f21013c == null) {
            super.setMeasuredDimension(rect, i2, i3);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f21013c;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i2, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i2, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f21013c;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i3, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f21011a;
    }

    public final int t(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2 = state.f21105g;
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        if (!z2) {
            int i3 = this.f21012b;
            defaultSpanSizeLookup.getClass();
            return i2 % i3;
        }
        int i4 = this.f21014f.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int b2 = recycler.b(i2);
        if (b2 != -1) {
            int i5 = this.f21012b;
            defaultSpanSizeLookup.getClass();
            return b2 % i5;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    public final int u(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2 = state.f21105g;
        DefaultSpanSizeLookup defaultSpanSizeLookup = this.f21015g;
        if (!z2) {
            defaultSpanSizeLookup.getClass();
            return 1;
        }
        int i3 = this.e.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (recycler.b(i2) != -1) {
            defaultSpanSizeLookup.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    public final void v(View view, int i2, boolean z2) {
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f21079b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int r2 = r(layoutParams.e, layoutParams.f21017f);
        if (this.mOrientation == 1) {
            i4 = RecyclerView.LayoutManager.getChildMeasureSpec(r2, i2, i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(r2, i2, i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i3 = childMeasureSpec;
            i4 = childMeasureSpec2;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z2 ? shouldReMeasureChild(view, i4, i3, layoutParams2) : shouldMeasureChild(view, i4, i3, layoutParams2)) {
            view.measure(i4, i3);
        }
    }

    public final void w(int i2) {
        if (i2 == this.f21012b) {
            return;
        }
        this.f21011a = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(d.i("Span count should be at least 1. Provided ", i2));
        }
        this.f21012b = i2;
        this.f21015g.c();
        requestLayout();
    }

    public final void x() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        p(height - paddingTop);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.GridLayoutManager$LayoutParams, androidx.recyclerview.widget.RecyclerView$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.GridLayoutManager$LayoutParams, androidx.recyclerview.widget.RecyclerView$LayoutParams] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams2 = new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.e = -1;
            layoutParams2.f21017f = 0;
            return layoutParams2;
        }
        ?? layoutParams3 = new RecyclerView.LayoutParams(layoutParams);
        layoutParams3.e = -1;
        layoutParams3.f21017f = 0;
        return layoutParams3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup, androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup] */
    public GridLayoutManager(int i2) {
        super(1, false);
        this.f21011a = false;
        this.f21012b = -1;
        this.e = new SparseIntArray();
        this.f21014f = new SparseIntArray();
        this.f21015g = new SpanSizeLookup();
        this.f21016h = new Rect();
        w(i2);
    }
}
