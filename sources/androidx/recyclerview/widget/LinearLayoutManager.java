package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* loaded from: classes.dex */
    public static class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public OrientationHelper f21029a;

        /* renamed from: b, reason: collision with root package name */
        public int f21030b;

        /* renamed from: c, reason: collision with root package name */
        public int f21031c;
        public boolean d;
        public boolean e;

        public AnchorInfo() {
            d();
        }

        public final void a() {
            this.f21031c = this.d ? this.f21029a.g() : this.f21029a.k();
        }

        public final void b(int i2, View view) {
            if (this.d) {
                this.f21031c = this.f21029a.m() + this.f21029a.b(view);
            } else {
                this.f21031c = this.f21029a.e(view);
            }
            this.f21030b = i2;
        }

        public final void c(int i2, View view) {
            int m2 = this.f21029a.m();
            if (m2 >= 0) {
                b(i2, view);
                return;
            }
            this.f21030b = i2;
            if (!this.d) {
                int e = this.f21029a.e(view);
                int k2 = e - this.f21029a.k();
                this.f21031c = e;
                if (k2 > 0) {
                    int g2 = (this.f21029a.g() - Math.min(0, (this.f21029a.g() - m2) - this.f21029a.b(view))) - (this.f21029a.c(view) + e);
                    if (g2 < 0) {
                        this.f21031c -= Math.min(k2, -g2);
                        return;
                    }
                    return;
                }
                return;
            }
            int g3 = (this.f21029a.g() - m2) - this.f21029a.b(view);
            this.f21031c = this.f21029a.g() - g3;
            if (g3 > 0) {
                int c2 = this.f21031c - this.f21029a.c(view);
                int k3 = this.f21029a.k();
                int min = c2 - (Math.min(this.f21029a.e(view) - k3, 0) + k3);
                if (min < 0) {
                    this.f21031c = Math.min(g3, -min) + this.f21031c;
                }
            }
        }

        public final void d() {
            this.f21030b = -1;
            this.f21031c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f21030b);
            sb.append(", mCoordinate=");
            sb.append(this.f21031c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return d.s(sb, this.e, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutChunkResult {

        /* renamed from: a, reason: collision with root package name */
        public int f21032a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21033b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21034c;
        public boolean d;
    }

    /* loaded from: classes.dex */
    public static class LayoutState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21035a;

        /* renamed from: b, reason: collision with root package name */
        public int f21036b;

        /* renamed from: c, reason: collision with root package name */
        public int f21037c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f21038f;

        /* renamed from: g, reason: collision with root package name */
        public int f21039g;

        /* renamed from: h, reason: collision with root package name */
        public int f21040h;

        /* renamed from: i, reason: collision with root package name */
        public int f21041i;

        /* renamed from: j, reason: collision with root package name */
        public int f21042j;

        /* renamed from: k, reason: collision with root package name */
        public List f21043k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f21044l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f21043k.size();
            View view2 = null;
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((RecyclerView.ViewHolder) this.f21043k.get(i3)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.f21078a.isRemoved() && (layoutPosition = (layoutParams.f21078a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i2) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i2 = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f21078a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.Recycler recycler) {
            List list = this.f21043k;
            if (list == null) {
                View view = recycler.l(Long.MAX_VALUE, this.d).itemView;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = ((RecyclerView.ViewHolder) this.f21043k.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.f21078a.isRemoved() && this.d == layoutParams.f21078a.getLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f21045a;

        /* renamed from: b, reason: collision with root package name */
        public int f21046b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21047c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f21045a = parcel.readInt();
                obj.f21046b = parcel.readInt();
                obj.f21047c = parcel.readInt() == 1;
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f21045a);
            parcel.writeInt(this.f21046b);
            parcel.writeInt(this.f21047c ? 1 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult, java.lang.Object] */
    public LinearLayoutManager(int i2, boolean z2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new Object();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i2);
        setReverseLayout(z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i2;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.f21038f == -1) {
            i2 = 0;
        } else {
            i2 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        ensureLayoutState();
        m(i2 > 0 ? 1 : -1, Math.abs(i2), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z2;
        int i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i3 = savedState.f21045a) < 0) {
            l();
            z2 = this.mShouldReverseLayout;
            i3 = this.mPendingScrollPosition;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            z2 = savedState.f21047c;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.mInitialPrefetchItemCount && i3 >= 0 && i3 < i2; i5++) {
            layoutPrefetchRegistry.a(i3, 0);
            i3 += i4;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = layoutState.d;
        if (i2 < 0 || i2 >= state.b()) {
            return;
        }
        layoutPrefetchRegistry.a(i2, Math.max(0, layoutState.f21039g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = (i2 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    public int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.recyclerview.widget.LinearLayoutManager$LayoutState] */
    public LayoutState createLayoutState() {
        ?? obj = new Object();
        obj.f21035a = true;
        obj.f21040h = 0;
        obj.f21041i = 0;
        obj.f21043k = null;
        return obj;
    }

    public final int d(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.c(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z2) {
        int i2;
        int i3 = layoutState.f21037c;
        int i4 = layoutState.f21039g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                layoutState.f21039g = i4 + i3;
            }
            j(recycler, layoutState);
        }
        int i5 = layoutState.f21037c + layoutState.f21040h;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.f21044l && i5 <= 0) || (i2 = layoutState.d) < 0 || i2 >= state.b()) {
                break;
            }
            layoutChunkResult.f21032a = 0;
            layoutChunkResult.f21033b = false;
            layoutChunkResult.f21034c = false;
            layoutChunkResult.d = false;
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f21033b) {
                int i6 = layoutState.f21036b;
                int i7 = layoutChunkResult.f21032a;
                layoutState.f21036b = (layoutState.f21038f * i7) + i6;
                if (!layoutChunkResult.f21034c || layoutState.f21043k != null || !state.f21105g) {
                    layoutState.f21037c -= i7;
                    i5 -= i7;
                }
                int i8 = layoutState.f21039g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    layoutState.f21039g = i9;
                    int i10 = layoutState.f21037c;
                    if (i10 < 0) {
                        layoutState.f21039g = i9 + i10;
                    }
                    j(recycler, layoutState);
                }
                if (z2 && layoutChunkResult.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - layoutState.f21037c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z2, z3) : findOneVisibleChild(getChildCount() - 1, -1, z2, z3);
    }

    public View findFirstVisibleChildClosestToStart(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z2, z3) : findOneVisibleChild(0, getChildCount(), z2, z3);
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

    public View findOnePartiallyOrCompletelyInvisibleChild(int i2, int i3) {
        int i4;
        int i5;
        ensureLayoutState();
        if (i3 <= i2 && i3 >= i2) {
            return getChildAt(i2);
        }
        if (this.mOrientationHelper.e(getChildAt(i2)) < this.mOrientationHelper.k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i2, i3, i4, i5) : this.mVerticalBoundCheck.a(i2, i3, i4, i5);
    }

    public View findOneVisibleChild(int i2, int i3, boolean z2, boolean z3) {
        ensureLayoutState();
        int i4 = z2 ? 24579 : 320;
        int i5 = z3 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i2, i3, i4, i5) : this.mVerticalBoundCheck.a(i2, i3, i4, i5);
    }

    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i2;
        int i3;
        int i4;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z3) {
            i3 = getChildCount() - 1;
            i2 = -1;
            i4 = -1;
        } else {
            i2 = childCount;
            i3 = 0;
            i4 = 1;
        }
        int b2 = state.b();
        int k2 = this.mOrientationHelper.k();
        int g2 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int position = getPosition(childAt);
            int e = this.mOrientationHelper.e(childAt);
            int b3 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b2) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).f21078a.isRemoved()) {
                    boolean z4 = b3 <= k2 && e < k2;
                    boolean z5 = e >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return childAt;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i3 += i4;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i2 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i2) {
                return childAt;
            }
        }
        return super.findViewByPosition(i2);
    }

    public final int g(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int g2;
        int g3 = this.mOrientationHelper.g() - i2;
        if (g3 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(-g3, recycler, state);
        int i4 = i2 + i3;
        if (!z2 || (g2 = this.mOrientationHelper.g() - i4) <= 0) {
            return i3;
        }
        this.mOrientationHelper.p(g2);
        return g2 + i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.f21101a != -1) {
            return this.mOrientationHelper.l();
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

    public final int h(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int k2;
        int k3 = i2 - this.mOrientationHelper.k();
        if (k3 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(k3, recycler, state);
        int i4 = i2 + i3;
        if (!z2 || (k2 = i4 - this.mOrientationHelper.k()) <= 0) {
            return i3;
        }
        this.mOrientationHelper.p(-k2);
        return i3 - k2;
    }

    public final void i() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final void j(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f21035a || layoutState.f21044l) {
            return;
        }
        int i2 = layoutState.f21039g;
        int i3 = layoutState.f21041i;
        if (layoutState.f21038f == -1) {
            int childCount = getChildCount();
            if (i2 < 0) {
                return;
            }
            int f2 = (this.mOrientationHelper.f() - i2) + i3;
            if (this.mShouldReverseLayout) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (this.mOrientationHelper.e(childAt) < f2 || this.mOrientationHelper.o(childAt) < f2) {
                        k(recycler, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = childCount - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.e(childAt2) < f2 || this.mOrientationHelper.o(childAt2) < f2) {
                    k(recycler, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt3 = getChildAt(i8);
                if (this.mOrientationHelper.b(childAt3) > i7 || this.mOrientationHelper.n(childAt3) > i7) {
                    k(recycler, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = childCount2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View childAt4 = getChildAt(i10);
            if (this.mOrientationHelper.b(childAt4) > i7 || this.mOrientationHelper.n(childAt4) > i7) {
                k(recycler, i9, i10);
                return;
            }
        }
    }

    public final void k(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                removeAndRecycleViewAt(i2, recycler);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                removeAndRecycleViewAt(i4, recycler);
            }
        }
    }

    public final void l() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int i2;
        int i3;
        int i4;
        int i5;
        int d;
        View b2 = layoutState.b(recycler);
        if (b2 == null) {
            layoutChunkResult.f21033b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b2.getLayoutParams();
        if (layoutState.f21043k == null) {
            if (this.mShouldReverseLayout == (layoutState.f21038f == -1)) {
                addView(b2);
            } else {
                addView(b2, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (layoutState.f21038f == -1)) {
                addDisappearingView(b2);
            } else {
                addDisappearingView(b2, 0);
            }
        }
        measureChildWithMargins(b2, 0, 0);
        layoutChunkResult.f21032a = this.mOrientationHelper.c(b2);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                d = getWidth() - getPaddingRight();
                i5 = d - this.mOrientationHelper.d(b2);
            } else {
                i5 = getPaddingLeft();
                d = this.mOrientationHelper.d(b2) + i5;
            }
            if (layoutState.f21038f == -1) {
                int i6 = layoutState.f21036b;
                i4 = i6;
                i3 = d;
                i2 = i6 - layoutChunkResult.f21032a;
            } else {
                int i7 = layoutState.f21036b;
                i2 = i7;
                i3 = d;
                i4 = layoutChunkResult.f21032a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d2 = this.mOrientationHelper.d(b2) + paddingTop;
            if (layoutState.f21038f == -1) {
                int i8 = layoutState.f21036b;
                i3 = i8;
                i2 = paddingTop;
                i4 = d2;
                i5 = i8 - layoutChunkResult.f21032a;
            } else {
                int i9 = layoutState.f21036b;
                i2 = paddingTop;
                i3 = layoutChunkResult.f21032a + i9;
                i4 = d2;
                i5 = i9;
            }
        }
        layoutDecoratedWithMargins(b2, i5, i2, i3, i4);
        if (layoutParams.f21078a.isRemoved() || layoutParams.f21078a.isUpdated()) {
            layoutChunkResult.f21034c = true;
        }
        layoutChunkResult.d = b2.hasFocusable();
    }

    public final void m(int i2, int i3, boolean z2, RecyclerView.State state) {
        int k2;
        this.mLayoutState.f21044l = resolveIsInfinite();
        this.mLayoutState.f21038f = i2;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z3 = i2 == 1;
        LayoutState layoutState = this.mLayoutState;
        int i4 = z3 ? max2 : max;
        layoutState.f21040h = i4;
        if (!z3) {
            max = max2;
        }
        layoutState.f21041i = max;
        if (z3) {
            layoutState.f21040h = this.mOrientationHelper.h() + i4;
            View childClosestToEnd = getChildClosestToEnd();
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.d = position + layoutState3.e;
            layoutState3.f21036b = this.mOrientationHelper.b(childClosestToEnd);
            k2 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f21040h = this.mOrientationHelper.k() + layoutState4.f21040h;
            LayoutState layoutState5 = this.mLayoutState;
            layoutState5.e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            LayoutState layoutState6 = this.mLayoutState;
            layoutState5.d = position2 + layoutState6.e;
            layoutState6.f21036b = this.mOrientationHelper.e(childClosestToStart);
            k2 = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.f21037c = i3;
        if (z2) {
            layoutState7.f21037c = i3 - k2;
        }
        layoutState7.f21039g = k2;
    }

    public final void n(int i2, int i3) {
        this.mLayoutState.f21037c = this.mOrientationHelper.g() - i3;
        LayoutState layoutState = this.mLayoutState;
        layoutState.e = this.mShouldReverseLayout ? -1 : 1;
        layoutState.d = i2;
        layoutState.f21038f = 1;
        layoutState.f21036b = i3;
        layoutState.f21039g = Integer.MIN_VALUE;
    }

    public final void o(int i2, int i3) {
        this.mLayoutState.f21037c = i3 - this.mOrientationHelper.k();
        LayoutState layoutState = this.mLayoutState;
        layoutState.d = i2;
        layoutState.e = this.mShouldReverseLayout ? 1 : -1;
        layoutState.f21038f = -1;
        layoutState.f21036b = i3;
        layoutState.f21039g = Integer.MIN_VALUE;
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.f21087a.clear();
            recycler.g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        l();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.f21039g = Integer.MIN_VALUE;
        layoutState.f21035a = false;
        fill(recycler, layoutState, state, true);
        View findOnePartiallyOrCompletelyInvisibleChild = convertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
        View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return findOnePartiallyOrCompletelyInvisibleChild;
        }
        if (findOnePartiallyOrCompletelyInvisibleChild == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findReferenceChild;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int g2;
        int i7;
        View findViewByPosition;
        int e;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.b() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i9 = savedState.f21045a) >= 0) {
            this.mPendingScrollPosition = i9;
        }
        ensureLayoutState();
        this.mLayoutState.f21035a = false;
        l();
        View focusedChild = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!anchorInfo.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            anchorInfo.d();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (!state.f21105g && (i2 = this.mPendingScrollPosition) != -1) {
                if (i2 < 0 || i2 >= state.b()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    int i11 = this.mPendingScrollPosition;
                    anchorInfo2.f21030b = i11;
                    SavedState savedState2 = this.mPendingSavedState;
                    if (savedState2 != null && savedState2.f21045a >= 0) {
                        boolean z2 = savedState2.f21047c;
                        anchorInfo2.d = z2;
                        if (z2) {
                            anchorInfo2.f21031c = this.mOrientationHelper.g() - this.mPendingSavedState.f21046b;
                        } else {
                            anchorInfo2.f21031c = this.mOrientationHelper.k() + this.mPendingSavedState.f21046b;
                        }
                    } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View findViewByPosition2 = findViewByPosition(i11);
                        if (findViewByPosition2 == null) {
                            if (getChildCount() > 0) {
                                anchorInfo2.d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                            }
                            anchorInfo2.a();
                        } else if (this.mOrientationHelper.c(findViewByPosition2) > this.mOrientationHelper.l()) {
                            anchorInfo2.a();
                        } else if (this.mOrientationHelper.e(findViewByPosition2) - this.mOrientationHelper.k() < 0) {
                            anchorInfo2.f21031c = this.mOrientationHelper.k();
                            anchorInfo2.d = false;
                        } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition2) < 0) {
                            anchorInfo2.f21031c = this.mOrientationHelper.g();
                            anchorInfo2.d = true;
                        } else {
                            anchorInfo2.f21031c = anchorInfo2.d ? this.mOrientationHelper.m() + this.mOrientationHelper.b(findViewByPosition2) : this.mOrientationHelper.e(findViewByPosition2);
                        }
                    } else {
                        boolean z3 = this.mShouldReverseLayout;
                        anchorInfo2.d = z3;
                        if (z3) {
                            anchorInfo2.f21031c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                        } else {
                            anchorInfo2.f21031c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                        }
                    }
                    this.mAnchorInfo.e = true;
                }
            }
            if (getChildCount() != 0) {
                View focusedChild2 = getFocusedChild();
                if (focusedChild2 != null) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                    if (!layoutParams.f21078a.isRemoved() && layoutParams.f21078a.getLayoutPosition() >= 0 && layoutParams.f21078a.getLayoutPosition() < state.b()) {
                        anchorInfo2.c(getPosition(focusedChild2), focusedChild2);
                        this.mAnchorInfo.e = true;
                    }
                }
                boolean z4 = this.mLastStackFromEnd;
                boolean z5 = this.mStackFromEnd;
                if (z4 == z5 && (findReferenceChild = findReferenceChild(recycler, state, anchorInfo2.d, z5)) != null) {
                    anchorInfo2.b(getPosition(findReferenceChild), findReferenceChild);
                    if (!state.f21105g && supportsPredictiveItemAnimations()) {
                        int e2 = this.mOrientationHelper.e(findReferenceChild);
                        int b2 = this.mOrientationHelper.b(findReferenceChild);
                        int k2 = this.mOrientationHelper.k();
                        int g3 = this.mOrientationHelper.g();
                        boolean z6 = b2 <= k2 && e2 < k2;
                        boolean z7 = e2 >= g3 && b2 > g3;
                        if (z6 || z7) {
                            if (anchorInfo2.d) {
                                k2 = g3;
                            }
                            anchorInfo2.f21031c = k2;
                        }
                    }
                    this.mAnchorInfo.e = true;
                }
            }
            anchorInfo2.a();
            anchorInfo2.f21030b = this.mStackFromEnd ? state.b() - 1 : 0;
            this.mAnchorInfo.e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.f21038f = layoutState.f21042j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int k3 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h2 = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (state.f21105g && (i7 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i7)) != null) {
            if (this.mShouldReverseLayout) {
                i8 = this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition);
                e = this.mPendingScrollPositionOffset;
            } else {
                e = this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k();
                i8 = this.mPendingScrollPositionOffset;
            }
            int i12 = i8 - e;
            if (i12 > 0) {
                k3 += i12;
            } else {
                h2 -= i12;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        if (!anchorInfo3.d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i10 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i10);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.f21044l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f21041i = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.d) {
            o(anchorInfo4.f21030b, anchorInfo4.f21031c);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.f21040h = k3;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i4 = layoutState3.f21036b;
            int i13 = layoutState3.d;
            int i14 = layoutState3.f21037c;
            if (i14 > 0) {
                h2 += i14;
            }
            AnchorInfo anchorInfo5 = this.mAnchorInfo;
            n(anchorInfo5.f21030b, anchorInfo5.f21031c);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f21040h = h2;
            layoutState4.d += layoutState4.e;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i3 = layoutState5.f21036b;
            int i15 = layoutState5.f21037c;
            if (i15 > 0) {
                o(i13, i4);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.f21040h = i15;
                fill(recycler, layoutState6, state, false);
                i4 = this.mLayoutState.f21036b;
            }
        } else {
            n(anchorInfo4.f21030b, anchorInfo4.f21031c);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.f21040h = h2;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i3 = layoutState8.f21036b;
            int i16 = layoutState8.d;
            int i17 = layoutState8.f21037c;
            if (i17 > 0) {
                k3 += i17;
            }
            AnchorInfo anchorInfo6 = this.mAnchorInfo;
            o(anchorInfo6.f21030b, anchorInfo6.f21031c);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.f21040h = k3;
            layoutState9.d += layoutState9.e;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            int i18 = layoutState10.f21036b;
            int i19 = layoutState10.f21037c;
            if (i19 > 0) {
                n(i16, i3);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.f21040h = i19;
                fill(recycler, layoutState11, state, false);
                i3 = this.mLayoutState.f21036b;
            }
            i4 = i18;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int g4 = g(i3, recycler, state, true);
                i5 = i4 + g4;
                i6 = i3 + g4;
                g2 = h(i5, recycler, state, false);
            } else {
                int h3 = h(i4, recycler, state, true);
                i5 = i4 + h3;
                i6 = i3 + h3;
                g2 = g(i6, recycler, state, false);
            }
            i4 = i5 + g2;
            i3 = i6 + g2;
        }
        if (state.f21109k && getChildCount() != 0 && !state.f21105g && supportsPredictiveItemAnimations()) {
            List list = recycler.d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i22);
                if (!viewHolder.isRemoved()) {
                    if ((viewHolder.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        i20 += this.mOrientationHelper.c(viewHolder.itemView);
                    } else {
                        i21 += this.mOrientationHelper.c(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.f21043k = list;
            if (i20 > 0) {
                o(getPosition(getChildClosestToStart()), i4);
                LayoutState layoutState12 = this.mLayoutState;
                layoutState12.f21040h = i20;
                layoutState12.f21037c = 0;
                layoutState12.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i21 > 0) {
                n(getPosition(getChildClosestToEnd()), i3);
                LayoutState layoutState13 = this.mLayoutState;
                layoutState13.f21040h = i21;
                layoutState13.f21037c = 0;
                layoutState13.a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.f21043k = null;
        }
        if (state.f21105g) {
            this.mAnchorInfo.d();
        } else {
            OrientationHelper orientationHelper = this.mOrientationHelper;
            orientationHelper.f21053b = orientationHelper.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f21045a = -1;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            ?? obj = new Object();
            obj.f21045a = savedState.f21045a;
            obj.f21046b = savedState.f21046b;
            obj.f21047c = savedState.f21047c;
            return obj;
        }
        ?? obj2 = new Object();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z2 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            obj2.f21047c = z2;
            if (z2) {
                View childClosestToEnd = getChildClosestToEnd();
                obj2.f21046b = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
                obj2.f21045a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                obj2.f21045a = getPosition(childClosestToStart);
                obj2.f21046b = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
            }
        } else {
            obj2.f21045a = -1;
        }
        return obj2;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i2, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        l();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f21035a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        m(i3, abs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int fill = fill(recycler, layoutState, state, false) + layoutState.f21039g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i2 = i3 * fill;
        }
        this.mOrientationHelper.p(-i2);
        this.mLayoutState.f21042j = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i2) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f21045a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f21045a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i2, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i2) {
        this.mInitialPrefetchItemCount = i2;
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(d.i("invalid orientation:", i2));
        }
        assertNotInLayoutOrScroll(null);
        if (i2 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper a2 = OrientationHelper.a(this, i2);
            this.mOrientationHelper = a2;
            this.mAnchorInfo.f21029a = a2;
            this.mOrientation = i2;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z2) {
        this.mRecycleChildrenOnDetach = z2;
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (z2 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z2;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z2) {
        this.mSmoothScrollbarEnabled = z2;
    }

    public void setStackFromEnd(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z2) {
            return;
        }
        this.mStackFromEnd = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int e = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int position2 = getPosition(childAt);
                int e2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    i();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(e2 < e);
                    throw new RuntimeException(sb.toString());
                }
                if (e2 > e) {
                    i();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            int position3 = getPosition(childAt2);
            int e3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                i();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(e3 < e);
                throw new RuntimeException(sb2.toString());
            }
            if (e3 < e) {
                i();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new Object();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.f21075a);
        setReverseLayout(properties.f21077c);
        setStackFromEnd(properties.d);
    }
}
