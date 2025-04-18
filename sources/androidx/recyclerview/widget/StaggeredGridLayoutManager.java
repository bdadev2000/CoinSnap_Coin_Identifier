package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends v0 implements i1 {
    static final boolean DEBUG = false;

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @NonNull
    private final w mLayoutState;
    private int mOrientation;
    private w1 mPendingSavedState;
    private int[] mPrefetchDistances;

    @NonNull
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;

    @NonNull
    OrientationHelper mSecondaryOrientation;
    private int mSizePerSpan;
    x1[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    v1 mLazySpanLookup = new v1();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final s1 mAnchorInfo = new s1(this);
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new l(this, 1);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        u0 properties = v0.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.a);
        setSpanCount(properties.f2042b);
        setReverseLayout(properties.f2043c);
        this.mLayoutState = new w();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i10 = this.mSpanCount - 1; i10 >= 0; i10--) {
            this.mSpans[i10].a(view);
        }
    }

    private void applyPendingSavedState(s1 s1Var) {
        int startAfterPadding;
        w1 w1Var = this.mPendingSavedState;
        int i10 = w1Var.f2064d;
        if (i10 > 0) {
            if (i10 == this.mSpanCount) {
                for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                    this.mSpans[i11].c();
                    w1 w1Var2 = this.mPendingSavedState;
                    int i12 = w1Var2.f2065f[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (w1Var2.f2070k) {
                            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        } else {
                            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        }
                        i12 += startAfterPadding;
                    }
                    x1 x1Var = this.mSpans[i11];
                    x1Var.f2076b = i12;
                    x1Var.f2077c = i12;
                }
            } else {
                w1Var.f2065f = null;
                w1Var.f2064d = 0;
                w1Var.f2066g = 0;
                w1Var.f2067h = null;
                w1Var.f2068i = null;
                w1Var.f2062b = w1Var.f2063c;
            }
        }
        w1 w1Var3 = this.mPendingSavedState;
        this.mLastLayoutRTL = w1Var3.f2071l;
        setReverseLayout(w1Var3.f2069j);
        resolveShouldLayoutReverse();
        w1 w1Var4 = this.mPendingSavedState;
        int i13 = w1Var4.f2062b;
        if (i13 != -1) {
            this.mPendingScrollPosition = i13;
            s1Var.f2034c = w1Var4.f2070k;
        } else {
            s1Var.f2034c = this.mShouldReverseLayout;
        }
        if (w1Var4.f2066g > 1) {
            v1 v1Var = this.mLazySpanLookup;
            v1Var.a = w1Var4.f2067h;
            v1Var.f2050b = w1Var4.f2068i;
        }
    }

    private void attachViewToSpans(View view, t1 t1Var, w wVar) {
        if (wVar.f2054e == 1) {
            t1Var.getClass();
            t1Var.f2039e.a(view);
        } else {
            t1Var.getClass();
            t1Var.f2039e.l(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i10) {
        boolean z10;
        if (getChildCount() == 0) {
            if (!this.mShouldReverseLayout) {
                return -1;
            }
            return 1;
        }
        if (i10 < getFirstChildPosition()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.mShouldReverseLayout) {
            return -1;
        }
        return 1;
    }

    private boolean checkSpanForGap(x1 x1Var) {
        if (this.mShouldReverseLayout) {
            int i10 = x1Var.f2077c;
            if (i10 == Integer.MIN_VALUE) {
                x1Var.b();
                i10 = x1Var.f2077c;
            }
            if (i10 < this.mPrimaryOrientation.getEndAfterPadding()) {
                ArrayList arrayList = x1Var.a;
                x1.j((View) arrayList.get(arrayList.size() - 1)).getClass();
                return true;
            }
        } else {
            int i11 = x1Var.f2076b;
            if (i11 == Integer.MIN_VALUE) {
                View view = (View) x1Var.a.get(0);
                t1 j3 = x1.j(view);
                x1Var.f2076b = x1Var.f2080f.mPrimaryOrientation.getDecoratedStart(view);
                j3.getClass();
                i11 = x1Var.f2076b;
            }
            if (i11 > this.mPrimaryOrientation.getStartAfterPadding()) {
                x1.j((View) x1Var.a.get(0)).getClass();
                return true;
            }
        }
        return false;
    }

    private int computeScrollExtent(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.o.b(k1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.o.c(k1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(k1 k1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.o.d(k1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
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

    private u1 createFullSpanItemFromEnd(int i10) {
        u1 u1Var = new u1();
        u1Var.f2047d = new int[this.mSpanCount];
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            u1Var.f2047d[i11] = i10 - this.mSpans[i11].h(i10);
        }
        return u1Var;
    }

    private u1 createFullSpanItemFromStart(int i10) {
        u1 u1Var = new u1();
        u1Var.f2047d = new int[this.mSpanCount];
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            u1Var.f2047d[i11] = this.mSpans[i11].k(i10) - i10;
        }
        return u1Var;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    private int fill(d1 d1Var, w wVar, k1 k1Var) {
        int i10;
        int startAfterPadding;
        boolean z10;
        int maxEnd;
        int i11;
        boolean z11;
        x1 x1Var;
        int i12;
        int decoratedMeasurement;
        int startAfterPadding2;
        int decoratedMeasurement2;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.f2058i) {
            if (wVar.f2054e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (wVar.f2054e == 1) {
            i10 = wVar.f2056g + wVar.f2051b;
        } else {
            i10 = wVar.f2055f - wVar.f2051b;
        }
        int i13 = i10;
        updateAllRemainingSpans(wVar.f2054e, i13);
        if (this.mShouldReverseLayout) {
            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        } else {
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        }
        int i14 = startAfterPadding;
        boolean z12 = false;
        while (true) {
            int i15 = wVar.f2052c;
            if (i15 >= 0 && i15 < k1Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.mLayoutState.f2058i && this.mRemainingSpans.isEmpty())) {
                break;
            }
            View d10 = d1Var.d(wVar.f2052c);
            wVar.f2052c += wVar.f2053d;
            t1 t1Var = (t1) d10.getLayoutParams();
            int a = t1Var.a();
            int[] iArr = this.mLazySpanLookup.a;
            if (iArr != null && a < iArr.length) {
                i11 = iArr[a];
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                x1Var = getNextSpan(wVar);
                v1 v1Var = this.mLazySpanLookup;
                v1Var.b(a);
                v1Var.a[a] = x1Var.f2079e;
            } else {
                x1Var = this.mSpans[i11];
            }
            x1 x1Var2 = x1Var;
            t1Var.f2039e = x1Var2;
            if (wVar.f2054e == 1) {
                addView(d10);
            } else {
                addView(d10, 0);
            }
            measureChildWithDecorationsAndMargin(d10, t1Var, false);
            if (wVar.f2054e == 1) {
                int h10 = x1Var2.h(i14);
                decoratedMeasurement = h10;
                i12 = this.mPrimaryOrientation.getDecoratedMeasurement(d10) + h10;
            } else {
                int k10 = x1Var2.k(i14);
                i12 = k10;
                decoratedMeasurement = k10 - this.mPrimaryOrientation.getDecoratedMeasurement(d10);
            }
            attachViewToSpans(d10, t1Var, wVar);
            if (isLayoutRTL() && this.mOrientation == 1) {
                decoratedMeasurement2 = this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - x1Var2.f2079e) * this.mSizePerSpan);
                startAfterPadding2 = decoratedMeasurement2 - this.mSecondaryOrientation.getDecoratedMeasurement(d10);
            } else {
                startAfterPadding2 = this.mSecondaryOrientation.getStartAfterPadding() + (x1Var2.f2079e * this.mSizePerSpan);
                decoratedMeasurement2 = this.mSecondaryOrientation.getDecoratedMeasurement(d10) + startAfterPadding2;
            }
            int i16 = decoratedMeasurement2;
            int i17 = startAfterPadding2;
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(d10, i17, decoratedMeasurement, i16, i12);
            } else {
                layoutDecoratedWithMargins(d10, decoratedMeasurement, i17, i12, i16);
            }
            updateRemainingSpans(x1Var2, this.mLayoutState.f2054e, i13);
            recycle(d1Var, this.mLayoutState);
            if (this.mLayoutState.f2057h && d10.hasFocusable()) {
                this.mRemainingSpans.set(x1Var2.f2079e, false);
            }
            z12 = true;
        }
        if (!z12) {
            recycle(d1Var, this.mLayoutState);
        }
        if (this.mLayoutState.f2054e == -1) {
            maxEnd = this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding());
        } else {
            maxEnd = getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        }
        if (maxEnd <= 0) {
            return 0;
        }
        return Math.min(wVar.f2051b, maxEnd);
    }

    private int findFirstReferenceChildPosition(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(d1 d1Var, k1 k1Var, boolean z10) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i10 = endAfterPadding - (-scrollBy(-endAfterPadding, d1Var, k1Var));
            if (z10 && i10 > 0) {
                this.mPrimaryOrientation.offsetChildren(i10);
            }
        }
    }

    private void fixStartGap(d1 d1Var, k1 k1Var, boolean z10) {
        int startAfterPadding;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int scrollBy = startAfterPadding - scrollBy(startAfterPadding, d1Var, k1Var);
            if (z10 && scrollBy > 0) {
                this.mPrimaryOrientation.offsetChildren(-scrollBy);
            }
        }
    }

    private int getMaxEnd(int i10) {
        int h10 = this.mSpans[0].h(i10);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int h11 = this.mSpans[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    private int getMaxStart(int i10) {
        int k10 = this.mSpans[0].k(i10);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int k11 = this.mSpans[i11].k(i10);
            if (k11 > k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    private int getMinEnd(int i10) {
        int h10 = this.mSpans[0].h(i10);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int h11 = this.mSpans[i11].h(i10);
            if (h11 < h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    private int getMinStart(int i10) {
        int k10 = this.mSpans[0].k(i10);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int k11 = this.mSpans[i11].k(i10);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    private x1 getNextSpan(w wVar) {
        int i10;
        int i11;
        int i12;
        if (preferLastSpan(wVar.f2054e)) {
            i11 = this.mSpanCount - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.mSpanCount;
            i11 = 0;
            i12 = 1;
        }
        x1 x1Var = null;
        if (wVar.f2054e == 1) {
            int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                x1 x1Var2 = this.mSpans[i11];
                int h10 = x1Var2.h(startAfterPadding);
                if (h10 < i13) {
                    x1Var = x1Var2;
                    i13 = h10;
                }
                i11 += i12;
            }
            return x1Var;
        }
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int i14 = Integer.MIN_VALUE;
        while (i11 != i10) {
            x1 x1Var3 = this.mSpans[i11];
            int k10 = x1Var3.k(endAfterPadding);
            if (k10 > i14) {
                x1Var = x1Var3;
                i14 = k10;
            }
            i11 += i12;
        }
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleUpdate(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r6.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r6.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.v1 r4 = r6.mLazySpanLookup
            r4.e(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.v1 r9 = r6.mLazySpanLookup
            r9.g(r7, r4)
            androidx.recyclerview.widget.v1 r7 = r6.mLazySpanLookup
            r7.f(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.v1 r9 = r6.mLazySpanLookup
            r9.g(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.v1 r9 = r6.mLazySpanLookup
            r9.f(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4d
            int r7 = r6.getFirstChildPosition()
            goto L51
        L4d:
            int r7 = r6.getLastChildPosition()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    private void measureChildWithDecorationsAndMargin(View view, t1 t1Var, boolean z10) {
        t1Var.getClass();
        if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, v0.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) t1Var).width, false), v0.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) t1Var).height, true), z10);
            return;
        }
        measureChildWithDecorationsAndMargin(view, v0.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) t1Var).width, true), v0.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) t1Var).height, false), z10);
    }

    private boolean preferLastSpan(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.mOrientation == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.mShouldReverseLayout) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.mShouldReverseLayout) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    private void prependViewToAllSpans(View view) {
        for (int i10 = this.mSpanCount - 1; i10 >= 0; i10--) {
            this.mSpans[i10].l(view);
        }
    }

    private void recycle(d1 d1Var, w wVar) {
        int min;
        int min2;
        if (wVar.a && !wVar.f2058i) {
            if (wVar.f2051b == 0) {
                if (wVar.f2054e == -1) {
                    recycleFromEnd(d1Var, wVar.f2056g);
                    return;
                } else {
                    recycleFromStart(d1Var, wVar.f2055f);
                    return;
                }
            }
            if (wVar.f2054e == -1) {
                int i10 = wVar.f2055f;
                int maxStart = i10 - getMaxStart(i10);
                if (maxStart < 0) {
                    min2 = wVar.f2056g;
                } else {
                    min2 = wVar.f2056g - Math.min(maxStart, wVar.f2051b);
                }
                recycleFromEnd(d1Var, min2);
                return;
            }
            int minEnd = getMinEnd(wVar.f2056g) - wVar.f2056g;
            if (minEnd < 0) {
                min = wVar.f2055f;
            } else {
                min = Math.min(minEnd, wVar.f2051b) + wVar.f2055f;
            }
            recycleFromStart(d1Var, min);
        }
    }

    private void recycleFromEnd(d1 d1Var, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) >= i10 && this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) >= i10) {
                t1 t1Var = (t1) childAt.getLayoutParams();
                t1Var.getClass();
                if (t1Var.f2039e.a.size() == 1) {
                    return;
                }
                x1 x1Var = t1Var.f2039e;
                ArrayList arrayList = x1Var.a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                t1 j3 = x1.j(view);
                j3.f2039e = null;
                if (j3.c() || j3.b()) {
                    x1Var.f2078d -= x1Var.f2080f.mPrimaryOrientation.getDecoratedMeasurement(view);
                }
                if (size == 1) {
                    x1Var.f2076b = Integer.MIN_VALUE;
                }
                x1Var.f2077c = Integer.MIN_VALUE;
                removeAndRecycleView(childAt, d1Var);
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(d1 d1Var, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) <= i10 && this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) <= i10) {
                t1 t1Var = (t1) childAt.getLayoutParams();
                t1Var.getClass();
                if (t1Var.f2039e.a.size() == 1) {
                    return;
                }
                x1 x1Var = t1Var.f2039e;
                ArrayList arrayList = x1Var.a;
                View view = (View) arrayList.remove(0);
                t1 j3 = x1.j(view);
                j3.f2039e = null;
                if (arrayList.size() == 0) {
                    x1Var.f2077c = Integer.MIN_VALUE;
                }
                if (j3.c() || j3.b()) {
                    x1Var.f2078d -= x1Var.f2080f.mPrimaryOrientation.getDecoratedMeasurement(view);
                }
                x1Var.f2076b = Integer.MIN_VALUE;
                removeAndRecycleView(childAt, d1Var);
            } else {
                return;
            }
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float decoratedMeasurement = this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= f10) {
                ((t1) childAt.getLayoutParams()).getClass();
                f10 = Math.max(f10, decoratedMeasurement);
            }
        }
        int i11 = this.mSizePerSpan;
        int round = Math.round(f10 * this.mSpanCount);
        if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            t1 t1Var = (t1) childAt2.getLayoutParams();
            t1Var.getClass();
            if (isLayoutRTL() && this.mOrientation == 1) {
                int i13 = this.mSpanCount;
                int i14 = t1Var.f2039e.f2079e;
                childAt2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.mSizePerSpan) - ((-((i13 - 1) - i14)) * i11));
            } else {
                int i15 = t1Var.f2039e.f2079e;
                int i16 = this.mSizePerSpan * i15;
                int i17 = i15 * i11;
                if (this.mOrientation == 1) {
                    childAt2.offsetLeftAndRight(i16 - i17);
                } else {
                    childAt2.offsetTopAndBottom(i16 - i17);
                }
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

    private void setLayoutStateDirection(int i10) {
        boolean z10;
        w wVar = this.mLayoutState;
        wVar.f2054e = i10;
        boolean z11 = this.mShouldReverseLayout;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        wVar.f2053d = i11;
    }

    private void updateAllRemainingSpans(int i10, int i11) {
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            if (!this.mSpans[i12].a.isEmpty()) {
                updateRemainingSpans(this.mSpans[i12], i10, i11);
            }
        }
    }

    private boolean updateAnchorFromChildren(k1 k1Var, s1 s1Var) {
        int findFirstReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findFirstReferenceChildPosition = findLastReferenceChildPosition(k1Var.b());
        } else {
            findFirstReferenceChildPosition = findFirstReferenceChildPosition(k1Var.b());
        }
        s1Var.a = findFirstReferenceChildPosition;
        s1Var.f2033b = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i10, k1 k1Var) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        w wVar = this.mLayoutState;
        boolean z11 = false;
        wVar.f2051b = 0;
        wVar.f2052c = i10;
        if (isSmoothScrolling() && (i13 = k1Var.a) != -1) {
            boolean z12 = this.mShouldReverseLayout;
            if (i13 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i11 = this.mPrimaryOrientation.getTotalSpace();
                i12 = 0;
            } else {
                i12 = this.mPrimaryOrientation.getTotalSpace();
                i11 = 0;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (getClipToPadding()) {
            this.mLayoutState.f2055f = this.mPrimaryOrientation.getStartAfterPadding() - i12;
            this.mLayoutState.f2056g = this.mPrimaryOrientation.getEndAfterPadding() + i11;
        } else {
            this.mLayoutState.f2056g = this.mPrimaryOrientation.getEnd() + i11;
            this.mLayoutState.f2055f = -i12;
        }
        w wVar2 = this.mLayoutState;
        wVar2.f2057h = false;
        wVar2.a = true;
        if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            z11 = true;
        }
        wVar2.f2058i = z11;
    }

    private void updateRemainingSpans(x1 x1Var, int i10, int i11) {
        int i12 = x1Var.f2078d;
        int i13 = x1Var.f2079e;
        if (i10 == -1) {
            int i14 = x1Var.f2076b;
            if (i14 == Integer.MIN_VALUE) {
                View view = (View) x1Var.a.get(0);
                t1 j3 = x1.j(view);
                x1Var.f2076b = x1Var.f2080f.mPrimaryOrientation.getDecoratedStart(view);
                j3.getClass();
                i14 = x1Var.f2076b;
            }
            if (i14 + i12 <= i11) {
                this.mRemainingSpans.set(i13, false);
                return;
            }
            return;
        }
        int i15 = x1Var.f2077c;
        if (i15 == Integer.MIN_VALUE) {
            x1Var.b();
            i15 = x1Var.f2077c;
        }
        if (i15 - i12 >= i11) {
            this.mRemainingSpans.set(i13, false);
        }
    }

    private int updateSpecWithExtra(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    public boolean areAllEndsEqual() {
        int h10 = this.mSpans[0].h(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            if (this.mSpans[i10].h(Integer.MIN_VALUE) != h10) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllStartsEqual() {
        int k10 = this.mSpans[0].k(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            if (this.mSpans[i10].k(Integer.MIN_VALUE) != k10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.v0
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        int i10;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.mLaidOutInvalidFullSpan) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int i11 = lastChildPosition + 1;
        u1 d10 = this.mLazySpanLookup.d(firstChildPosition, i11, i10);
        if (d10 == null) {
            this.mLaidOutInvalidFullSpan = false;
            this.mLazySpanLookup.c(i11);
            return false;
        }
        u1 d11 = this.mLazySpanLookup.d(firstChildPosition, d10.f2045b, i10 * (-1));
        if (d11 == null) {
            this.mLazySpanLookup.c(d10.f2045b);
        } else {
            this.mLazySpanLookup.c(d11.f2045b + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean checkLayoutParams(w0 w0Var) {
        return w0Var instanceof t1;
    }

    @Override // androidx.recyclerview.widget.v0
    public void collectAdjacentPrefetchPositions(int i10, int i11, k1 k1Var, t0 t0Var) {
        boolean z10;
        int h10;
        int i12;
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() != 0 && i10 != 0) {
            prepareLayoutStateForDelta(i10, k1Var);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.mSpanCount; i14++) {
                w wVar = this.mLayoutState;
                if (wVar.f2053d == -1) {
                    h10 = wVar.f2055f;
                    i12 = this.mSpans[i14].k(h10);
                } else {
                    h10 = this.mSpans[i14].h(wVar.f2056g);
                    i12 = this.mLayoutState.f2056g;
                }
                int i15 = h10 - i12;
                if (i15 >= 0) {
                    this.mPrefetchDistances[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i13);
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = this.mLayoutState.f2052c;
                if (i17 >= 0 && i17 < k1Var.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((q) t0Var).a(this.mLayoutState.f2052c, this.mPrefetchDistances[i16]);
                    w wVar2 = this.mLayoutState;
                    wVar2.f2052c += wVar2.f2053d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeHorizontalScrollExtent(k1 k1Var) {
        return computeScrollExtent(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeHorizontalScrollOffset(k1 k1Var) {
        return computeScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeHorizontalScrollRange(k1 k1Var) {
        return computeScrollRange(k1Var);
    }

    @Override // androidx.recyclerview.widget.i1
    public PointF computeScrollVectorForPosition(int i10) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i10);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = calculateScrollDirectionForPosition;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = calculateScrollDirectionForPosition;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeVerticalScrollExtent(k1 k1Var) {
        return computeScrollExtent(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeVerticalScrollOffset(k1 k1Var) {
        return computeScrollOffset(k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public int computeVerticalScrollRange(k1 k1Var) {
        return computeScrollRange(k1Var);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        int g10;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            x1 x1Var = this.mSpans[i10];
            boolean z10 = x1Var.f2080f.mReverseLayout;
            ArrayList arrayList = x1Var.a;
            if (z10) {
                g10 = x1Var.g(arrayList.size() - 1, -1, true);
            } else {
                g10 = x1Var.g(0, arrayList.size(), true);
            }
            iArr[i10] = g10;
        }
        return iArr;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z10) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd > endAfterPadding && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z10) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart < startAfterPadding && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToStart;
        if (this.mShouldReverseLayout) {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToEnd(true);
        } else {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(true);
        }
        if (findFirstVisibleItemClosestToStart == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToStart);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        int g10;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            x1 x1Var = this.mSpans[i10];
            boolean z10 = x1Var.f2080f.mReverseLayout;
            ArrayList arrayList = x1Var.a;
            if (z10) {
                g10 = x1Var.g(arrayList.size() - 1, -1, false);
            } else {
                g10 = x1Var.g(0, arrayList.size(), false);
            }
            iArr[i10] = g10;
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        int g10;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            x1 x1Var = this.mSpans[i10];
            boolean z10 = x1Var.f2080f.mReverseLayout;
            ArrayList arrayList = x1Var.a;
            if (z10) {
                g10 = x1Var.g(0, arrayList.size(), true);
            } else {
                g10 = x1Var.g(arrayList.size() - 1, -1, true);
            }
            iArr[i10] = g10;
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        int g10;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            x1 x1Var = this.mSpans[i10];
            boolean z10 = x1Var.f2080f.mReverseLayout;
            ArrayList arrayList = x1Var.a;
            if (z10) {
                g10 = x1Var.g(0, arrayList.size(), false);
            } else {
                g10 = x1Var.g(arrayList.size() - 1, -1, false);
            }
            iArr[i10] = g10;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.v0
    public w0 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new t1(-2, -1);
        }
        return new t1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.v0
    public w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new t1(context, attributeSet);
    }

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r10 == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        if (r10 == r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View hasGapsToFix() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.mOrientation
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.mShouldReverseLayout
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto La6
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.t1 r8 = (androidx.recyclerview.widget.t1) r8
            androidx.recyclerview.widget.x1 r9 = r8.f2039e
            int r9 = r9.f2079e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.x1 r9 = r8.f2039e
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.x1 r9 = r8.f2039e
            int r9 = r9.f2079e
            r2.clear(r9)
        L54:
            int r9 = r0 + r5
            if (r9 == r6) goto La4
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L72
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L6f
            return r7
        L6f:
            if (r10 != r11) goto L85
            goto L83
        L72:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L81
            return r7
        L81:
            if (r10 != r11) goto L85
        L83:
            r10 = r1
            goto L86
        L85:
            r10 = r4
        L86:
            if (r10 == 0) goto La4
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.t1 r9 = (androidx.recyclerview.widget.t1) r9
            androidx.recyclerview.widget.x1 r8 = r8.f2039e
            int r8 = r8.f2079e
            androidx.recyclerview.widget.x1 r9 = r9.f2039e
            int r9 = r9.f2079e
            int r8 = r8 - r9
            if (r8 >= 0) goto L9b
            r8 = r1
            goto L9c
        L9b:
            r8 = r4
        L9c:
            if (r3 >= 0) goto La0
            r9 = r1
            goto La1
        La0:
            r9 = r4
        La1:
            if (r8 == r9) goto La4
            return r7
        La4:
            int r0 = r0 + r5
            goto L2e
        La6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.v0
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            x1 x1Var = this.mSpans[i11];
            int i12 = x1Var.f2076b;
            if (i12 != Integer.MIN_VALUE) {
                x1Var.f2076b = i12 + i10;
            }
            int i13 = x1Var.f2077c;
            if (i13 != Integer.MIN_VALUE) {
                x1Var.f2077c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            x1 x1Var = this.mSpans[i11];
            int i12 = x1Var.f2076b;
            if (i12 != Integer.MIN_VALUE) {
                x1Var.f2076b = i12 + i10;
            }
            int i13 = x1Var.f2077c;
            if (i13 != Integer.MIN_VALUE) {
                x1Var.f2077c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void onAdapterChanged(@Nullable j0 j0Var, @Nullable j0 j0Var2) {
        this.mLazySpanLookup.a();
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            this.mSpans[i10].c();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void onDetachedFromWindow(RecyclerView recyclerView, d1 d1Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            this.mSpans[i10].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    @Nullable
    public View onFocusSearchFailed(View view, int i10, d1 d1Var, k1 k1Var) {
        View findContainingItemView;
        int firstChildPosition;
        boolean z10;
        boolean z11;
        int e2;
        int e10;
        int e11;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        t1 t1Var = (t1) findContainingItemView.getLayoutParams();
        t1Var.getClass();
        x1 x1Var = t1Var.f2039e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, k1Var);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        w wVar = this.mLayoutState;
        wVar.f2052c = wVar.f2053d + firstChildPosition;
        wVar.f2051b = (int) (this.mPrimaryOrientation.getTotalSpace() * MAX_SCROLL_FACTOR);
        w wVar2 = this.mLayoutState;
        wVar2.f2057h = true;
        wVar2.a = false;
        fill(d1Var, wVar2, k1Var);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        View i11 = x1Var.i(firstChildPosition, convertFocusDirectionToLayoutDirection);
        if (i11 != null && i11 != findContainingItemView) {
            return i11;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i12 = this.mSpanCount - 1; i12 >= 0; i12--) {
                View i13 = this.mSpans[i12].i(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (i13 != null && i13 != findContainingItemView) {
                    return i13;
                }
            }
        } else {
            for (int i14 = 0; i14 < this.mSpanCount; i14++) {
                View i15 = this.mSpans[i14].i(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (i15 != null && i15 != findContainingItemView) {
                    return i15;
                }
            }
        }
        boolean z12 = !this.mReverseLayout;
        if (convertFocusDirectionToLayoutDirection == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            e2 = x1Var.d();
        } else {
            e2 = x1Var.e();
        }
        View findViewByPosition = findViewByPosition(e2);
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i16 = this.mSpanCount - 1; i16 >= 0; i16--) {
                if (i16 != x1Var.f2079e) {
                    if (z11) {
                        e11 = this.mSpans[i16].d();
                    } else {
                        e11 = this.mSpans[i16].e();
                    }
                    View findViewByPosition2 = findViewByPosition(e11);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i17 = 0; i17 < this.mSpanCount; i17++) {
                if (z11) {
                    e10 = this.mSpans[i17].d();
                } else {
                    e10 = this.mSpans[i17].e();
                }
                View findViewByPosition3 = findViewByPosition(e10);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.v0
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        handleUpdate(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        handleUpdate(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        handleUpdate(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.v0
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        handleUpdate(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.v0
    public void onLayoutChildren(d1 d1Var, k1 k1Var) {
        onLayoutChildren(d1Var, k1Var, true);
    }

    @Override // androidx.recyclerview.widget.v0
    public void onLayoutCompleted(k1 k1Var) {
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.a();
    }

    @Override // androidx.recyclerview.widget.v0
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof w1) {
            w1 w1Var = (w1) parcelable;
            this.mPendingSavedState = w1Var;
            if (this.mPendingScrollPosition != -1) {
                w1Var.f2065f = null;
                w1Var.f2064d = 0;
                w1Var.f2062b = -1;
                w1Var.f2063c = -1;
                w1Var.f2065f = null;
                w1Var.f2064d = 0;
                w1Var.f2066g = 0;
                w1Var.f2067h = null;
                w1Var.f2068i = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public Parcelable onSaveInstanceState() {
        int firstChildPosition;
        int k10;
        int startAfterPadding;
        int[] iArr;
        w1 w1Var = this.mPendingSavedState;
        if (w1Var != null) {
            return new w1(w1Var);
        }
        w1 w1Var2 = new w1();
        w1Var2.f2069j = this.mReverseLayout;
        w1Var2.f2070k = this.mLastLayoutFromEnd;
        w1Var2.f2071l = this.mLastLayoutRTL;
        v1 v1Var = this.mLazySpanLookup;
        if (v1Var != null && (iArr = v1Var.a) != null) {
            w1Var2.f2067h = iArr;
            w1Var2.f2066g = iArr.length;
            w1Var2.f2068i = v1Var.f2050b;
        } else {
            w1Var2.f2066g = 0;
        }
        if (getChildCount() > 0) {
            if (this.mLastLayoutFromEnd) {
                firstChildPosition = getLastChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
            }
            w1Var2.f2062b = firstChildPosition;
            w1Var2.f2063c = findFirstVisibleItemPositionInt();
            int i10 = this.mSpanCount;
            w1Var2.f2064d = i10;
            w1Var2.f2065f = new int[i10];
            for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                if (this.mLastLayoutFromEnd) {
                    k10 = this.mSpans[i11].h(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        k10 -= startAfterPadding;
                        w1Var2.f2065f[i11] = k10;
                    } else {
                        w1Var2.f2065f[i11] = k10;
                    }
                } else {
                    k10 = this.mSpans[i11].k(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        k10 -= startAfterPadding;
                        w1Var2.f2065f[i11] = k10;
                    } else {
                        w1Var2.f2065f[i11] = k10;
                    }
                }
            }
        } else {
            w1Var2.f2062b = -1;
            w1Var2.f2063c = -1;
            w1Var2.f2064d = 0;
        }
        return w1Var2;
    }

    @Override // androidx.recyclerview.widget.v0
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            checkForGaps();
        }
    }

    public void prepareLayoutStateForDelta(int i10, k1 k1Var) {
        int firstChildPosition;
        int i11;
        if (i10 > 0) {
            firstChildPosition = getLastChildPosition();
            i11 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i11 = -1;
        }
        this.mLayoutState.a = true;
        updateLayoutState(firstChildPosition, k1Var);
        setLayoutStateDirection(i11);
        w wVar = this.mLayoutState;
        wVar.f2052c = firstChildPosition + wVar.f2053d;
        wVar.f2051b = Math.abs(i10);
    }

    public int scrollBy(int i10, d1 d1Var, k1 k1Var) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i10, k1Var);
        int fill = fill(d1Var, this.mLayoutState, k1Var);
        if (this.mLayoutState.f2051b >= fill) {
            if (i10 < 0) {
                i10 = -fill;
            } else {
                i10 = fill;
            }
        }
        this.mPrimaryOrientation.offsetChildren(-i10);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        w wVar = this.mLayoutState;
        wVar.f2051b = 0;
        recycle(d1Var, wVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.v0
    public int scrollHorizontallyBy(int i10, d1 d1Var, k1 k1Var) {
        return scrollBy(i10, d1Var, k1Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public void scrollToPosition(int i10) {
        w1 w1Var = this.mPendingSavedState;
        if (w1Var != null && w1Var.f2062b != i10) {
            w1Var.f2065f = null;
            w1Var.f2064d = 0;
            w1Var.f2062b = -1;
            w1Var.f2063c = -1;
        }
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        w1 w1Var = this.mPendingSavedState;
        if (w1Var != null) {
            w1Var.f2065f = null;
            w1Var.f2064d = 0;
            w1Var.f2062b = -1;
            w1Var.f2063c = -1;
        }
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public int scrollVerticallyBy(int i10, d1 d1Var, k1 k1Var) {
        return scrollBy(i10, d1Var, k1Var);
    }

    public void setGapStrategy(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 == this.mGapStrategy) {
            return;
        }
        if (i10 != 0 && i10 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.v0
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = v0.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = v0.chooseSize(i10, (this.mSizePerSpan * this.mSpanCount) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = v0.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = v0.chooseSize(i11, (this.mSizePerSpan * this.mSpanCount) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.mOrientation) {
            return;
        }
        this.mOrientation = i10;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        w1 w1Var = this.mPendingSavedState;
        if (w1Var != null && w1Var.f2069j != z10) {
            w1Var.f2069j = z10;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSpanCount(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i10;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new x1[this.mSpanCount];
            for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                this.mSpans[i11] = new x1(this, i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public void smoothScrollToPosition(RecyclerView recyclerView, k1 k1Var, int i10) {
        b0 b0Var = new b0(recyclerView.getContext());
        b0Var.a = i10;
        startSmoothScroll(b0Var);
    }

    @Override // androidx.recyclerview.widget.v0
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public boolean updateAnchorFromPendingData(k1 k1Var, s1 s1Var) {
        int i10;
        int startAfterPadding;
        int firstChildPosition;
        int startAfterPadding2;
        boolean z10 = false;
        if (!k1Var.f1965g && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < k1Var.b()) {
                w1 w1Var = this.mPendingSavedState;
                if (w1Var != null && w1Var.f2062b != -1 && w1Var.f2064d >= 1) {
                    s1Var.f2033b = Integer.MIN_VALUE;
                    s1Var.a = this.mPendingScrollPosition;
                } else {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mShouldReverseLayout) {
                            firstChildPosition = getLastChildPosition();
                        } else {
                            firstChildPosition = getFirstChildPosition();
                        }
                        s1Var.a = firstChildPosition;
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (s1Var.f2034c) {
                                s1Var.f2033b = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                            } else {
                                s1Var.f2033b = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                            if (s1Var.f2034c) {
                                startAfterPadding2 = this.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding2 = this.mPrimaryOrientation.getStartAfterPadding();
                            }
                            s1Var.f2033b = startAfterPadding2;
                            return true;
                        }
                        int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                        if (decoratedStart < 0) {
                            s1Var.f2033b = -decoratedStart;
                            return true;
                        }
                        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                        if (endAfterPadding < 0) {
                            s1Var.f2033b = endAfterPadding;
                            return true;
                        }
                        s1Var.f2033b = Integer.MIN_VALUE;
                    } else {
                        int i11 = this.mPendingScrollPosition;
                        s1Var.a = i11;
                        int i12 = this.mPendingScrollPositionOffset;
                        StaggeredGridLayoutManager staggeredGridLayoutManager = s1Var.f2038g;
                        if (i12 == Integer.MIN_VALUE) {
                            if (calculateScrollDirectionForPosition(i11) == 1) {
                                z10 = true;
                            }
                            s1Var.f2034c = z10;
                            if (z10) {
                                startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
                            }
                            s1Var.f2033b = startAfterPadding;
                        } else if (s1Var.f2034c) {
                            s1Var.f2033b = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding() - i12;
                        } else {
                            s1Var.f2033b = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding() + i12;
                        }
                        s1Var.f2035d = true;
                    }
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public void updateAnchorInfoForLayout(k1 k1Var, s1 s1Var) {
        int startAfterPadding;
        if (updateAnchorFromPendingData(k1Var, s1Var) || updateAnchorFromChildren(k1Var, s1Var)) {
            return;
        }
        boolean z10 = s1Var.f2034c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = s1Var.f2038g;
        if (z10) {
            startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
        } else {
            startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
        }
        s1Var.f2033b = startAfterPadding;
        s1Var.a = 0;
    }

    public void updateMeasureSpecs(int i10) {
        this.mSizePerSpan = i10 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i10, this.mSecondaryOrientation.getMode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a4, code lost:
    
        if (checkForGaps() != false) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onLayoutChildren(androidx.recyclerview.widget.d1 r13, androidx.recyclerview.widget.k1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.d1, androidx.recyclerview.widget.k1, boolean):void");
    }

    @Override // androidx.recyclerview.widget.v0
    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t1(layoutParams);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i10, int i11, boolean z10) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        t1 t1Var = (t1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) t1Var).leftMargin;
        Rect rect = this.mTmpRect;
        int updateSpecWithExtra = updateSpecWithExtra(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) t1Var).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) t1Var).topMargin;
        Rect rect2 = this.mTmpRect;
        int updateSpecWithExtra2 = updateSpecWithExtra(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) t1Var).bottomMargin + rect2.bottom);
        if (z10) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, t1Var);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, t1Var);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.mOrientation = i11;
        setSpanCount(i10);
        this.mLayoutState = new w();
        createOrientationHelpers();
    }
}
