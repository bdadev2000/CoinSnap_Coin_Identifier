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
public class StaggeredGridLayoutManager extends W implements j0 {
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
    private final C0542w mLayoutState;
    private int mOrientation;
    private x0 mPendingSavedState;
    private int[] mPrefetchDistances;

    @NonNull
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;

    @NonNull
    OrientationHelper mSecondaryOrientation;
    private int mSizePerSpan;
    y0[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    w0 mLazySpanLookup = new Object();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final t0 mAnchorInfo = new t0(this);
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new RunnableC0532l(this, 1);

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.w0, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        V properties = W.getProperties(context, attributeSet, i9, i10);
        setOrientation(properties.f4944a);
        setSpanCount(properties.b);
        setReverseLayout(properties.f4945c);
        this.mLayoutState = new C0542w();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i9 = this.mSpanCount - 1; i9 >= 0; i9--) {
            this.mSpans[i9].a(view);
        }
    }

    private void applyPendingSavedState(t0 t0Var) {
        int startAfterPadding;
        x0 x0Var = this.mPendingSavedState;
        int i9 = x0Var.f5117d;
        if (i9 > 0) {
            if (i9 == this.mSpanCount) {
                for (int i10 = 0; i10 < this.mSpanCount; i10++) {
                    this.mSpans[i10].c();
                    x0 x0Var2 = this.mPendingSavedState;
                    int i11 = x0Var2.f5118f[i10];
                    if (i11 != Integer.MIN_VALUE) {
                        if (x0Var2.f5123k) {
                            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        } else {
                            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        }
                        i11 += startAfterPadding;
                    }
                    y0 y0Var = this.mSpans[i10];
                    y0Var.b = i11;
                    y0Var.f5128c = i11;
                }
            } else {
                x0Var.f5118f = null;
                x0Var.f5117d = 0;
                x0Var.f5119g = 0;
                x0Var.f5120h = null;
                x0Var.f5121i = null;
                x0Var.b = x0Var.f5116c;
            }
        }
        x0 x0Var3 = this.mPendingSavedState;
        this.mLastLayoutRTL = x0Var3.l;
        setReverseLayout(x0Var3.f5122j);
        resolveShouldLayoutReverse();
        x0 x0Var4 = this.mPendingSavedState;
        int i12 = x0Var4.b;
        if (i12 != -1) {
            this.mPendingScrollPosition = i12;
            t0Var.f5091c = x0Var4.f5123k;
        } else {
            t0Var.f5091c = this.mShouldReverseLayout;
        }
        if (x0Var4.f5119g > 1) {
            w0 w0Var = this.mLazySpanLookup;
            w0Var.f5111a = x0Var4.f5120h;
            w0Var.b = x0Var4.f5121i;
        }
    }

    private void attachViewToSpans(View view, u0 u0Var, C0542w c0542w) {
        if (c0542w.f5106e == 1) {
            u0Var.getClass();
            u0Var.f5098e.a(view);
        } else {
            u0Var.getClass();
            u0Var.f5098e.j(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i9) {
        boolean z8;
        if (getChildCount() == 0) {
            if (!this.mShouldReverseLayout) {
                return -1;
            }
            return 1;
        }
        if (i9 < getFirstChildPosition()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != this.mShouldReverseLayout) {
            return -1;
        }
        return 1;
    }

    private boolean checkSpanForGap(y0 y0Var) {
        if (this.mShouldReverseLayout) {
            int i9 = y0Var.f5128c;
            if (i9 == Integer.MIN_VALUE) {
                y0Var.b();
                i9 = y0Var.f5128c;
            }
            if (i9 < this.mPrimaryOrientation.getEndAfterPadding()) {
                ((u0) ((View) com.mbridge.msdk.foundation.entity.o.g(y0Var.f5127a, 1)).getLayoutParams()).getClass();
                return true;
            }
        } else {
            int i10 = y0Var.b;
            if (i10 == Integer.MIN_VALUE) {
                View view = (View) y0Var.f5127a.get(0);
                u0 u0Var = (u0) view.getLayoutParams();
                y0Var.b = y0Var.f5131f.mPrimaryOrientation.getDecoratedStart(view);
                u0Var.getClass();
                i10 = y0Var.b;
            }
            if (i10 > this.mPrimaryOrientation.getStartAfterPadding()) {
                ((u0) ((View) y0Var.f5127a.get(0)).getLayoutParams()).getClass();
                return true;
            }
        }
        return false;
    }

    private int computeScrollExtent(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.g.b(l0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.g.c(l0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(l0 l0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return com.facebook.appevents.g.d(l0Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i9) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.v0, java.lang.Object] */
    private v0 createFullSpanItemFromEnd(int i9) {
        ?? obj = new Object();
        obj.f5101d = new int[this.mSpanCount];
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            obj.f5101d[i10] = i9 - this.mSpans[i10].g(i9);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.v0, java.lang.Object] */
    private v0 createFullSpanItemFromStart(int i9) {
        ?? obj = new Object();
        obj.f5101d = new int[this.mSpanCount];
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            obj.f5101d[i10] = this.mSpans[i10].i(i9) - i9;
        }
        return obj;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    private int fill(C0525e0 c0525e0, C0542w c0542w, l0 l0Var) {
        int i9;
        int startAfterPadding;
        boolean z8;
        int maxEnd;
        int i10;
        y0 y0Var;
        int i11;
        int decoratedMeasurement;
        int startAfterPadding2;
        int decoratedMeasurement2;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.f5110i) {
            if (c0542w.f5106e == 1) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = Integer.MIN_VALUE;
            }
        } else if (c0542w.f5106e == 1) {
            i9 = c0542w.f5108g + c0542w.b;
        } else {
            i9 = c0542w.f5107f - c0542w.b;
        }
        int i12 = i9;
        updateAllRemainingSpans(c0542w.f5106e, i12);
        if (this.mShouldReverseLayout) {
            startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        } else {
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        }
        int i13 = startAfterPadding;
        boolean z9 = false;
        while (true) {
            int i14 = c0542w.f5104c;
            if (i14 >= 0 && i14 < l0Var.b()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8 || (!this.mLayoutState.f5110i && this.mRemainingSpans.isEmpty())) {
                break;
            }
            View view = c0525e0.l(c0542w.f5104c, Long.MAX_VALUE).itemView;
            c0542w.f5104c += c0542w.f5105d;
            u0 u0Var = (u0) view.getLayoutParams();
            int layoutPosition = u0Var.f4947a.getLayoutPosition();
            int[] iArr = this.mLazySpanLookup.f5111a;
            if (iArr != null && layoutPosition < iArr.length) {
                i10 = iArr[layoutPosition];
            } else {
                i10 = -1;
            }
            if (i10 == -1) {
                y0Var = getNextSpan(c0542w);
                w0 w0Var = this.mLazySpanLookup;
                w0Var.b(layoutPosition);
                w0Var.f5111a[layoutPosition] = y0Var.f5130e;
            } else {
                y0Var = this.mSpans[i10];
            }
            y0 y0Var2 = y0Var;
            u0Var.f5098e = y0Var2;
            if (c0542w.f5106e == 1) {
                addView(view);
            } else {
                addView(view, 0);
            }
            measureChildWithDecorationsAndMargin(view, u0Var, false);
            if (c0542w.f5106e == 1) {
                int g9 = y0Var2.g(i13);
                decoratedMeasurement = g9;
                i11 = this.mPrimaryOrientation.getDecoratedMeasurement(view) + g9;
            } else {
                int i15 = y0Var2.i(i13);
                i11 = i15;
                decoratedMeasurement = i15 - this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            attachViewToSpans(view, u0Var, c0542w);
            if (isLayoutRTL() && this.mOrientation == 1) {
                decoratedMeasurement2 = this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - y0Var2.f5130e) * this.mSizePerSpan);
                startAfterPadding2 = decoratedMeasurement2 - this.mSecondaryOrientation.getDecoratedMeasurement(view);
            } else {
                startAfterPadding2 = this.mSecondaryOrientation.getStartAfterPadding() + (y0Var2.f5130e * this.mSizePerSpan);
                decoratedMeasurement2 = this.mSecondaryOrientation.getDecoratedMeasurement(view) + startAfterPadding2;
            }
            int i16 = decoratedMeasurement2;
            int i17 = startAfterPadding2;
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(view, i17, decoratedMeasurement, i16, i11);
            } else {
                layoutDecoratedWithMargins(view, decoratedMeasurement, i17, i11, i16);
            }
            updateRemainingSpans(y0Var2, this.mLayoutState.f5106e, i12);
            recycle(c0525e0, this.mLayoutState);
            if (this.mLayoutState.f5109h && view.hasFocusable()) {
                this.mRemainingSpans.set(y0Var2.f5130e, false);
            }
            z9 = true;
        }
        if (!z9) {
            recycle(c0525e0, this.mLayoutState);
        }
        if (this.mLayoutState.f5106e == -1) {
            maxEnd = this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding());
        } else {
            maxEnd = getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        }
        if (maxEnd <= 0) {
            return 0;
        }
        return Math.min(c0542w.b, maxEnd);
    }

    private int findFirstReferenceChildPosition(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            int position = getPosition(getChildAt(i10));
            if (position >= 0 && position < i9) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i9) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i9) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(C0525e0 c0525e0, l0 l0Var, boolean z8) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i9 = endAfterPadding - (-scrollBy(-endAfterPadding, c0525e0, l0Var));
            if (z8 && i9 > 0) {
                this.mPrimaryOrientation.offsetChildren(i9);
            }
        }
    }

    private void fixStartGap(C0525e0 c0525e0, l0 l0Var, boolean z8) {
        int startAfterPadding;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int scrollBy = startAfterPadding - scrollBy(startAfterPadding, c0525e0, l0Var);
            if (z8 && scrollBy > 0) {
                this.mPrimaryOrientation.offsetChildren(-scrollBy);
            }
        }
    }

    private int getMaxEnd(int i9) {
        int g9 = this.mSpans[0].g(i9);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            int g10 = this.mSpans[i10].g(i9);
            if (g10 > g9) {
                g9 = g10;
            }
        }
        return g9;
    }

    private int getMaxStart(int i9) {
        int i10 = this.mSpans[0].i(i9);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int i12 = this.mSpans[i11].i(i9);
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    private int getMinEnd(int i9) {
        int g9 = this.mSpans[0].g(i9);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            int g10 = this.mSpans[i10].g(i9);
            if (g10 < g9) {
                g9 = g10;
            }
        }
        return g9;
    }

    private int getMinStart(int i9) {
        int i10 = this.mSpans[0].i(i9);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            int i12 = this.mSpans[i11].i(i9);
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    private y0 getNextSpan(C0542w c0542w) {
        int i9;
        int i10;
        int i11;
        if (preferLastSpan(c0542w.f5106e)) {
            i10 = this.mSpanCount - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = this.mSpanCount;
            i10 = 0;
            i11 = 1;
        }
        y0 y0Var = null;
        if (c0542w.f5106e == 1) {
            int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            int i12 = Integer.MAX_VALUE;
            while (i10 != i9) {
                y0 y0Var2 = this.mSpans[i10];
                int g9 = y0Var2.g(startAfterPadding);
                if (g9 < i12) {
                    y0Var = y0Var2;
                    i12 = g9;
                }
                i10 += i11;
            }
            return y0Var;
        }
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int i13 = Integer.MIN_VALUE;
        while (i10 != i9) {
            y0 y0Var3 = this.mSpans[i10];
            int i14 = y0Var3.i(endAfterPadding);
            if (i14 > i13) {
                y0Var = y0Var3;
                i13 = i14;
            }
            i10 += i11;
        }
        return y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
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
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.w0 r4 = r6.mLazySpanLookup
            r4.e(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.w0 r9 = r6.mLazySpanLookup
            r9.g(r7, r4)
            androidx.recyclerview.widget.w0 r7 = r6.mLazySpanLookup
            r7.f(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.w0 r9 = r6.mLazySpanLookup
            r9.g(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.w0 r9 = r6.mLazySpanLookup
            r9.f(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4e
            int r7 = r6.getFirstChildPosition()
            goto L52
        L4e:
            int r7 = r6.getLastChildPosition()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    private void measureChildWithDecorationsAndMargin(View view, u0 u0Var, boolean z8) {
        u0Var.getClass();
        if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, W.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) u0Var).width, false), W.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) u0Var).height, true), z8);
            return;
        }
        measureChildWithDecorationsAndMargin(view, W.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) u0Var).width, true), W.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) u0Var).height, false), z8);
    }

    private boolean preferLastSpan(int i9) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.mOrientation == 0) {
            if (i9 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 == this.mShouldReverseLayout) {
                return false;
            }
            return true;
        }
        if (i9 == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 == this.mShouldReverseLayout) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != isLayoutRTL()) {
            return false;
        }
        return true;
    }

    private void prependViewToAllSpans(View view) {
        for (int i9 = this.mSpanCount - 1; i9 >= 0; i9--) {
            this.mSpans[i9].j(view);
        }
    }

    private void recycle(C0525e0 c0525e0, C0542w c0542w) {
        int min;
        int min2;
        if (c0542w.f5103a && !c0542w.f5110i) {
            if (c0542w.b == 0) {
                if (c0542w.f5106e == -1) {
                    recycleFromEnd(c0525e0, c0542w.f5108g);
                    return;
                } else {
                    recycleFromStart(c0525e0, c0542w.f5107f);
                    return;
                }
            }
            if (c0542w.f5106e == -1) {
                int i9 = c0542w.f5107f;
                int maxStart = i9 - getMaxStart(i9);
                if (maxStart < 0) {
                    min2 = c0542w.f5108g;
                } else {
                    min2 = c0542w.f5108g - Math.min(maxStart, c0542w.b);
                }
                recycleFromEnd(c0525e0, min2);
                return;
            }
            int minEnd = getMinEnd(c0542w.f5108g) - c0542w.f5108g;
            if (minEnd < 0) {
                min = c0542w.f5107f;
            } else {
                min = Math.min(minEnd, c0542w.b) + c0542w.f5107f;
            }
            recycleFromStart(c0525e0, min);
        }
    }

    private void recycleFromEnd(C0525e0 c0525e0, int i9) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) >= i9 && this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) >= i9) {
                u0 u0Var = (u0) childAt.getLayoutParams();
                u0Var.getClass();
                if (u0Var.f5098e.f5127a.size() == 1) {
                    return;
                }
                y0 y0Var = u0Var.f5098e;
                ArrayList arrayList = y0Var.f5127a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                u0 u0Var2 = (u0) view.getLayoutParams();
                u0Var2.f5098e = null;
                if (u0Var2.f4947a.isRemoved() || u0Var2.f4947a.isUpdated()) {
                    y0Var.f5129d -= y0Var.f5131f.mPrimaryOrientation.getDecoratedMeasurement(view);
                }
                if (size == 1) {
                    y0Var.b = Integer.MIN_VALUE;
                }
                y0Var.f5128c = Integer.MIN_VALUE;
                removeAndRecycleView(childAt, c0525e0);
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(C0525e0 c0525e0, int i9) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) <= i9 && this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) <= i9) {
                u0 u0Var = (u0) childAt.getLayoutParams();
                u0Var.getClass();
                if (u0Var.f5098e.f5127a.size() == 1) {
                    return;
                }
                y0 y0Var = u0Var.f5098e;
                ArrayList arrayList = y0Var.f5127a;
                View view = (View) arrayList.remove(0);
                u0 u0Var2 = (u0) view.getLayoutParams();
                u0Var2.f5098e = null;
                if (arrayList.size() == 0) {
                    y0Var.f5128c = Integer.MIN_VALUE;
                }
                if (u0Var2.f4947a.isRemoved() || u0Var2.f4947a.isUpdated()) {
                    y0Var.f5129d -= y0Var.f5131f.mPrimaryOrientation.getDecoratedMeasurement(view);
                }
                y0Var.b = Integer.MIN_VALUE;
                removeAndRecycleView(childAt, c0525e0);
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
        float f9 = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            float decoratedMeasurement = this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= f9) {
                ((u0) childAt.getLayoutParams()).getClass();
                f9 = Math.max(f9, decoratedMeasurement);
            }
        }
        int i10 = this.mSizePerSpan;
        int round = Math.round(f9 * this.mSpanCount);
        if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i10) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            u0 u0Var = (u0) childAt2.getLayoutParams();
            u0Var.getClass();
            if (isLayoutRTL() && this.mOrientation == 1) {
                int i12 = this.mSpanCount;
                int i13 = u0Var.f5098e.f5130e;
                childAt2.offsetLeftAndRight(((-((i12 - 1) - i13)) * this.mSizePerSpan) - ((-((i12 - 1) - i13)) * i10));
            } else {
                int i14 = u0Var.f5098e.f5130e;
                int i15 = this.mSizePerSpan * i14;
                int i16 = i14 * i10;
                if (this.mOrientation == 1) {
                    childAt2.offsetLeftAndRight(i15 - i16);
                } else {
                    childAt2.offsetTopAndBottom(i15 - i16);
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

    private void setLayoutStateDirection(int i9) {
        boolean z8;
        C0542w c0542w = this.mLayoutState;
        c0542w.f5106e = i9;
        boolean z9 = this.mShouldReverseLayout;
        int i10 = 1;
        if (i9 == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z9 != z8) {
            i10 = -1;
        }
        c0542w.f5105d = i10;
    }

    private void updateAllRemainingSpans(int i9, int i10) {
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            if (!this.mSpans[i11].f5127a.isEmpty()) {
                updateRemainingSpans(this.mSpans[i11], i9, i10);
            }
        }
    }

    private boolean updateAnchorFromChildren(l0 l0Var, t0 t0Var) {
        int findFirstReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findFirstReferenceChildPosition = findLastReferenceChildPosition(l0Var.b());
        } else {
            findFirstReferenceChildPosition = findFirstReferenceChildPosition(l0Var.b());
        }
        t0Var.f5090a = findFirstReferenceChildPosition;
        t0Var.b = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i9, l0 l0Var) {
        int i10;
        int i11;
        int i12;
        boolean z8;
        C0542w c0542w = this.mLayoutState;
        boolean z9 = false;
        c0542w.b = 0;
        c0542w.f5104c = i9;
        if (isSmoothScrolling() && (i12 = l0Var.f5026a) != -1) {
            boolean z10 = this.mShouldReverseLayout;
            if (i12 < i9) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z10 == z8) {
                i10 = this.mPrimaryOrientation.getTotalSpace();
                i11 = 0;
            } else {
                i11 = this.mPrimaryOrientation.getTotalSpace();
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (getClipToPadding()) {
            this.mLayoutState.f5107f = this.mPrimaryOrientation.getStartAfterPadding() - i11;
            this.mLayoutState.f5108g = this.mPrimaryOrientation.getEndAfterPadding() + i10;
        } else {
            this.mLayoutState.f5108g = this.mPrimaryOrientation.getEnd() + i10;
            this.mLayoutState.f5107f = -i11;
        }
        C0542w c0542w2 = this.mLayoutState;
        c0542w2.f5109h = false;
        c0542w2.f5103a = true;
        if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            z9 = true;
        }
        c0542w2.f5110i = z9;
    }

    private void updateRemainingSpans(y0 y0Var, int i9, int i10) {
        int i11 = y0Var.f5129d;
        int i12 = y0Var.f5130e;
        if (i9 == -1) {
            int i13 = y0Var.b;
            if (i13 == Integer.MIN_VALUE) {
                View view = (View) y0Var.f5127a.get(0);
                u0 u0Var = (u0) view.getLayoutParams();
                y0Var.b = y0Var.f5131f.mPrimaryOrientation.getDecoratedStart(view);
                u0Var.getClass();
                i13 = y0Var.b;
            }
            if (i13 + i11 <= i10) {
                this.mRemainingSpans.set(i12, false);
                return;
            }
            return;
        }
        int i14 = y0Var.f5128c;
        if (i14 == Integer.MIN_VALUE) {
            y0Var.b();
            i14 = y0Var.f5128c;
        }
        if (i14 - i11 >= i10) {
            this.mRemainingSpans.set(i12, false);
        }
    }

    private int updateSpecWithExtra(int i9, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i9;
        }
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i9;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - i10) - i11), mode);
    }

    public boolean areAllEndsEqual() {
        int g9 = this.mSpans[0].g(Integer.MIN_VALUE);
        for (int i9 = 1; i9 < this.mSpanCount; i9++) {
            if (this.mSpans[i9].g(Integer.MIN_VALUE) != g9) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllStartsEqual() {
        int i9 = this.mSpans[0].i(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            if (this.mSpans[i10].i(Integer.MIN_VALUE) != i9) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.W
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
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

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        int i9;
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
            i9 = -1;
        } else {
            i9 = 1;
        }
        int i10 = lastChildPosition + 1;
        v0 d2 = this.mLazySpanLookup.d(firstChildPosition, i10, i9);
        if (d2 == null) {
            this.mLaidOutInvalidFullSpan = false;
            this.mLazySpanLookup.c(i10);
            return false;
        }
        v0 d9 = this.mLazySpanLookup.d(firstChildPosition, d2.b, i9 * (-1));
        if (d9 == null) {
            this.mLazySpanLookup.c(d2.b);
        } else {
            this.mLazySpanLookup.c(d9.b + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.W
    public boolean checkLayoutParams(X x9) {
        return x9 instanceof u0;
    }

    @Override // androidx.recyclerview.widget.W
    public void collectAdjacentPrefetchPositions(int i9, int i10, l0 l0Var, U u8) {
        int g9;
        int i11;
        if (this.mOrientation != 0) {
            i9 = i10;
        }
        if (getChildCount() != 0 && i9 != 0) {
            prepareLayoutStateForDelta(i9, l0Var);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                C0542w c0542w = this.mLayoutState;
                if (c0542w.f5105d == -1) {
                    g9 = c0542w.f5107f;
                    i11 = this.mSpans[i13].i(g9);
                } else {
                    g9 = this.mSpans[i13].g(c0542w.f5108g);
                    i11 = this.mLayoutState.f5108g;
                }
                int i14 = g9 - i11;
                if (i14 >= 0) {
                    this.mPrefetchDistances[i12] = i14;
                    i12++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i12);
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = this.mLayoutState.f5104c;
                if (i16 >= 0 && i16 < l0Var.b()) {
                    ((C0537q) u8).a(this.mLayoutState.f5104c, this.mPrefetchDistances[i15]);
                    C0542w c0542w2 = this.mLayoutState;
                    c0542w2.f5104c += c0542w2.f5105d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.W
    public int computeHorizontalScrollExtent(l0 l0Var) {
        return computeScrollExtent(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public int computeHorizontalScrollOffset(l0 l0Var) {
        return computeScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public int computeHorizontalScrollRange(l0 l0Var) {
        return computeScrollRange(l0Var);
    }

    @Override // androidx.recyclerview.widget.j0
    public PointF computeScrollVectorForPosition(int i9) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i9);
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

    @Override // androidx.recyclerview.widget.W
    public int computeVerticalScrollExtent(l0 l0Var) {
        return computeScrollExtent(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public int computeVerticalScrollOffset(l0 l0Var) {
        return computeScrollOffset(l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public int computeVerticalScrollRange(l0 l0Var) {
        return computeScrollRange(l0Var);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        int f9;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            y0 y0Var = this.mSpans[i9];
            boolean z8 = y0Var.f5131f.mReverseLayout;
            ArrayList arrayList = y0Var.f5127a;
            if (z8) {
                f9 = y0Var.f(arrayList.size() - 1, -1, true, true, false);
            } else {
                f9 = y0Var.f(0, arrayList.size(), true, true, false);
            }
            iArr[i9] = f9;
        }
        return iArr;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z8) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd > endAfterPadding && z8) {
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

    public View findFirstVisibleItemClosestToStart(boolean z8) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart < startAfterPadding && z8) {
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
        int f9;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            y0 y0Var = this.mSpans[i9];
            boolean z8 = y0Var.f5131f.mReverseLayout;
            ArrayList arrayList = y0Var.f5127a;
            if (z8) {
                f9 = y0Var.f(arrayList.size() - 1, -1, false, true, false);
            } else {
                f9 = y0Var.f(0, arrayList.size(), false, true, false);
            }
            iArr[i9] = f9;
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        int f9;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            y0 y0Var = this.mSpans[i9];
            boolean z8 = y0Var.f5131f.mReverseLayout;
            ArrayList arrayList = y0Var.f5127a;
            if (z8) {
                f9 = y0Var.f(0, arrayList.size(), true, true, false);
            } else {
                f9 = y0Var.f(arrayList.size() - 1, -1, true, true, false);
            }
            iArr[i9] = f9;
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        int f9;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            y0 y0Var = this.mSpans[i9];
            boolean z8 = y0Var.f5131f.mReverseLayout;
            ArrayList arrayList = y0Var.f5127a;
            if (z8) {
                f9 = y0Var.f(0, arrayList.size(), false, true, false);
            } else {
                f9 = y0Var.f(arrayList.size() - 1, -1, false, true, false);
            }
            iArr[i9] = f9;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.W
    public X generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new X(-2, -1);
        }
        return new X(-1, -2);
    }

    @Override // androidx.recyclerview.widget.W
    public X generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new X(context, attributeSet);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View hasGapsToFix() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.mOrientation
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.mShouldReverseLayout
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto L9f
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.u0 r8 = (androidx.recyclerview.widget.u0) r8
            androidx.recyclerview.widget.y0 r9 = r8.f5098e
            int r9 = r9.f5130e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.y0 r9 = r8.f5098e
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.y0 r9 = r8.f5098e
            int r9 = r9.f5130e
            r2.clear(r9)
        L52:
            int r9 = r1 + r6
            if (r9 == r0) goto L9d
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L70
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L6d
            return r7
        L6d:
            if (r10 != r11) goto L9d
            goto L81
        L70:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L7f
            return r7
        L7f:
            if (r10 != r11) goto L9d
        L81:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.u0 r9 = (androidx.recyclerview.widget.u0) r9
            androidx.recyclerview.widget.y0 r8 = r8.f5098e
            int r8 = r8.f5130e
            androidx.recyclerview.widget.y0 r9 = r9.f5098e
            int r9 = r9.f5130e
            int r8 = r8 - r9
            if (r8 >= 0) goto L94
            r8 = r5
            goto L95
        L94:
            r8 = r4
        L95:
            if (r3 >= 0) goto L99
            r9 = r5
            goto L9a
        L99:
            r9 = r4
        L9a:
            if (r8 == r9) goto L9d
            return r7
        L9d:
            int r1 = r1 + r6
            goto L2c
        L9f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    public boolean isAutoMeasureEnabled() {
        if (this.mGapStrategy != 0) {
            return true;
        }
        return false;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.W
    public void offsetChildrenHorizontal(int i9) {
        super.offsetChildrenHorizontal(i9);
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            y0 y0Var = this.mSpans[i10];
            int i11 = y0Var.b;
            if (i11 != Integer.MIN_VALUE) {
                y0Var.b = i11 + i9;
            }
            int i12 = y0Var.f5128c;
            if (i12 != Integer.MIN_VALUE) {
                y0Var.f5128c = i12 + i9;
            }
        }
    }

    @Override // androidx.recyclerview.widget.W
    public void offsetChildrenVertical(int i9) {
        super.offsetChildrenVertical(i9);
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            y0 y0Var = this.mSpans[i10];
            int i11 = y0Var.b;
            if (i11 != Integer.MIN_VALUE) {
                y0Var.b = i11 + i9;
            }
            int i12 = y0Var.f5128c;
            if (i12 != Integer.MIN_VALUE) {
                y0Var.f5128c = i12 + i9;
            }
        }
    }

    @Override // androidx.recyclerview.widget.W
    public void onAdapterChanged(@Nullable J j7, @Nullable J j9) {
        this.mLazySpanLookup.a();
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            this.mSpans[i9].c();
        }
    }

    @Override // androidx.recyclerview.widget.W
    public void onDetachedFromWindow(RecyclerView recyclerView, C0525e0 c0525e0) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i9 = 0; i9 < this.mSpanCount; i9++) {
            this.mSpans[i9].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    @Nullable
    public View onFocusSearchFailed(View view, int i9, C0525e0 c0525e0, l0 l0Var) {
        View findContainingItemView;
        int firstChildPosition;
        boolean z8;
        boolean z9;
        int e4;
        int e9;
        int e10;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i9);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        u0 u0Var = (u0) findContainingItemView.getLayoutParams();
        u0Var.getClass();
        y0 y0Var = u0Var.f5098e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, l0Var);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        C0542w c0542w = this.mLayoutState;
        c0542w.f5104c = c0542w.f5105d + firstChildPosition;
        c0542w.b = (int) (this.mPrimaryOrientation.getTotalSpace() * MAX_SCROLL_FACTOR);
        C0542w c0542w2 = this.mLayoutState;
        c0542w2.f5109h = true;
        c0542w2.f5103a = false;
        fill(c0525e0, c0542w2, l0Var);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        View h6 = y0Var.h(firstChildPosition, convertFocusDirectionToLayoutDirection);
        if (h6 != null && h6 != findContainingItemView) {
            return h6;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i10 = this.mSpanCount - 1; i10 >= 0; i10--) {
                View h9 = this.mSpans[i10].h(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (h9 != null && h9 != findContainingItemView) {
                    return h9;
                }
            }
        } else {
            for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                View h10 = this.mSpans[i11].h(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (h10 != null && h10 != findContainingItemView) {
                    return h10;
                }
            }
        }
        boolean z10 = !this.mReverseLayout;
        if (convertFocusDirectionToLayoutDirection == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z10 == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            e4 = y0Var.d();
        } else {
            e4 = y0Var.e();
        }
        View findViewByPosition = findViewByPosition(e4);
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i12 = this.mSpanCount - 1; i12 >= 0; i12--) {
                if (i12 != y0Var.f5130e) {
                    if (z9) {
                        e10 = this.mSpans[i12].d();
                    } else {
                        e10 = this.mSpans[i12].e();
                    }
                    View findViewByPosition2 = findViewByPosition(e10);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                if (z9) {
                    e9 = this.mSpans[i13].d();
                } else {
                    e9 = this.mSpans[i13].e();
                }
                View findViewByPosition3 = findViewByPosition(e9);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.W
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

    @Override // androidx.recyclerview.widget.W
    public void onItemsAdded(RecyclerView recyclerView, int i9, int i10) {
        handleUpdate(i9, i10, 1);
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsMoved(RecyclerView recyclerView, int i9, int i10, int i11) {
        handleUpdate(i9, i10, 8);
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsRemoved(RecyclerView recyclerView, int i9, int i10) {
        handleUpdate(i9, i10, 2);
    }

    @Override // androidx.recyclerview.widget.W
    public void onItemsUpdated(RecyclerView recyclerView, int i9, int i10, Object obj) {
        handleUpdate(i9, i10, 4);
    }

    @Override // androidx.recyclerview.widget.W
    public void onLayoutChildren(C0525e0 c0525e0, l0 l0Var) {
        onLayoutChildren(c0525e0, l0Var, true);
    }

    @Override // androidx.recyclerview.widget.W
    public void onLayoutCompleted(l0 l0Var) {
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.a();
    }

    @Override // androidx.recyclerview.widget.W
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof x0) {
            x0 x0Var = (x0) parcelable;
            this.mPendingSavedState = x0Var;
            if (this.mPendingScrollPosition != -1) {
                x0Var.f5118f = null;
                x0Var.f5117d = 0;
                x0Var.b = -1;
                x0Var.f5116c = -1;
                x0Var.f5118f = null;
                x0Var.f5117d = 0;
                x0Var.f5119g = 0;
                x0Var.f5120h = null;
                x0Var.f5121i = null;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, androidx.recyclerview.widget.x0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.os.Parcelable, androidx.recyclerview.widget.x0, java.lang.Object] */
    @Override // androidx.recyclerview.widget.W
    public Parcelable onSaveInstanceState() {
        int firstChildPosition;
        int i9;
        int startAfterPadding;
        int[] iArr;
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null) {
            ?? obj = new Object();
            obj.f5117d = x0Var.f5117d;
            obj.b = x0Var.b;
            obj.f5116c = x0Var.f5116c;
            obj.f5118f = x0Var.f5118f;
            obj.f5119g = x0Var.f5119g;
            obj.f5120h = x0Var.f5120h;
            obj.f5122j = x0Var.f5122j;
            obj.f5123k = x0Var.f5123k;
            obj.l = x0Var.l;
            obj.f5121i = x0Var.f5121i;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f5122j = this.mReverseLayout;
        obj2.f5123k = this.mLastLayoutFromEnd;
        obj2.l = this.mLastLayoutRTL;
        w0 w0Var = this.mLazySpanLookup;
        if (w0Var != null && (iArr = w0Var.f5111a) != null) {
            obj2.f5120h = iArr;
            obj2.f5119g = iArr.length;
            obj2.f5121i = w0Var.b;
        } else {
            obj2.f5119g = 0;
        }
        if (getChildCount() > 0) {
            if (this.mLastLayoutFromEnd) {
                firstChildPosition = getLastChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
            }
            obj2.b = firstChildPosition;
            obj2.f5116c = findFirstVisibleItemPositionInt();
            int i10 = this.mSpanCount;
            obj2.f5117d = i10;
            obj2.f5118f = new int[i10];
            for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                if (this.mLastLayoutFromEnd) {
                    i9 = this.mSpans[i11].g(Integer.MIN_VALUE);
                    if (i9 != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                        i9 -= startAfterPadding;
                        obj2.f5118f[i11] = i9;
                    } else {
                        obj2.f5118f[i11] = i9;
                    }
                } else {
                    i9 = this.mSpans[i11].i(Integer.MIN_VALUE);
                    if (i9 != Integer.MIN_VALUE) {
                        startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                        i9 -= startAfterPadding;
                        obj2.f5118f[i11] = i9;
                    } else {
                        obj2.f5118f[i11] = i9;
                    }
                }
            }
        } else {
            obj2.b = -1;
            obj2.f5116c = -1;
            obj2.f5117d = 0;
        }
        return obj2;
    }

    @Override // androidx.recyclerview.widget.W
    public void onScrollStateChanged(int i9) {
        if (i9 == 0) {
            checkForGaps();
        }
    }

    public void prepareLayoutStateForDelta(int i9, l0 l0Var) {
        int firstChildPosition;
        int i10;
        if (i9 > 0) {
            firstChildPosition = getLastChildPosition();
            i10 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i10 = -1;
        }
        this.mLayoutState.f5103a = true;
        updateLayoutState(firstChildPosition, l0Var);
        setLayoutStateDirection(i10);
        C0542w c0542w = this.mLayoutState;
        c0542w.f5104c = firstChildPosition + c0542w.f5105d;
        c0542w.b = Math.abs(i9);
    }

    public int scrollBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        if (getChildCount() == 0 || i9 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i9, l0Var);
        int fill = fill(c0525e0, this.mLayoutState, l0Var);
        if (this.mLayoutState.b >= fill) {
            if (i9 < 0) {
                i9 = -fill;
            } else {
                i9 = fill;
            }
        }
        this.mPrimaryOrientation.offsetChildren(-i9);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        C0542w c0542w = this.mLayoutState;
        c0542w.b = 0;
        recycle(c0525e0, c0542w);
        return i9;
    }

    @Override // androidx.recyclerview.widget.W
    public int scrollHorizontallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        return scrollBy(i9, c0525e0, l0Var);
    }

    @Override // androidx.recyclerview.widget.W
    public void scrollToPosition(int i9) {
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null && x0Var.b != i9) {
            x0Var.f5118f = null;
            x0Var.f5117d = 0;
            x0Var.b = -1;
            x0Var.f5116c = -1;
        }
        this.mPendingScrollPosition = i9;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i9, int i10) {
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null) {
            x0Var.f5118f = null;
            x0Var.f5117d = 0;
            x0Var.b = -1;
            x0Var.f5116c = -1;
        }
        this.mPendingScrollPosition = i9;
        this.mPendingScrollPositionOffset = i10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    public int scrollVerticallyBy(int i9, C0525e0 c0525e0, l0 l0Var) {
        return scrollBy(i9, c0525e0, l0Var);
    }

    public void setGapStrategy(int i9) {
        assertNotInLayoutOrScroll(null);
        if (i9 == this.mGapStrategy) {
            return;
        }
        if (i9 != 0 && i9 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i9;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.W
    public void setMeasuredDimension(Rect rect, int i9, int i10) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = W.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = W.chooseSize(i9, (this.mSizePerSpan * this.mSpanCount) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = W.chooseSize(i9, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = W.chooseSize(i10, (this.mSizePerSpan * this.mSpanCount) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i9 == this.mOrientation) {
            return;
        }
        this.mOrientation = i9;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z8) {
        assertNotInLayoutOrScroll(null);
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null && x0Var.f5122j != z8) {
            x0Var.f5122j = z8;
        }
        this.mReverseLayout = z8;
        requestLayout();
    }

    public void setSpanCount(int i9) {
        assertNotInLayoutOrScroll(null);
        if (i9 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i9;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new y0[this.mSpanCount];
            for (int i10 = 0; i10 < this.mSpanCount; i10++) {
                this.mSpans[i10] = new y0(this, i10);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.W
    public void smoothScrollToPosition(RecyclerView recyclerView, l0 l0Var, int i9) {
        B b = new B(recyclerView.getContext());
        b.f5018a = i9;
        startSmoothScroll(b);
    }

    @Override // androidx.recyclerview.widget.W
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null) {
            return true;
        }
        return false;
    }

    public boolean updateAnchorFromPendingData(l0 l0Var, t0 t0Var) {
        int i9;
        int startAfterPadding;
        int firstChildPosition;
        int startAfterPadding2;
        boolean z8 = false;
        if (!l0Var.f5031g && (i9 = this.mPendingScrollPosition) != -1) {
            if (i9 >= 0 && i9 < l0Var.b()) {
                x0 x0Var = this.mPendingSavedState;
                if (x0Var != null && x0Var.b != -1 && x0Var.f5117d >= 1) {
                    t0Var.b = Integer.MIN_VALUE;
                    t0Var.f5090a = this.mPendingScrollPosition;
                } else {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mShouldReverseLayout) {
                            firstChildPosition = getLastChildPosition();
                        } else {
                            firstChildPosition = getFirstChildPosition();
                        }
                        t0Var.f5090a = firstChildPosition;
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (t0Var.f5091c) {
                                t0Var.b = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                            } else {
                                t0Var.b = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                            if (t0Var.f5091c) {
                                startAfterPadding2 = this.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding2 = this.mPrimaryOrientation.getStartAfterPadding();
                            }
                            t0Var.b = startAfterPadding2;
                            return true;
                        }
                        int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                        if (decoratedStart < 0) {
                            t0Var.b = -decoratedStart;
                            return true;
                        }
                        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                        if (endAfterPadding < 0) {
                            t0Var.b = endAfterPadding;
                            return true;
                        }
                        t0Var.b = Integer.MIN_VALUE;
                    } else {
                        int i10 = this.mPendingScrollPosition;
                        t0Var.f5090a = i10;
                        int i11 = this.mPendingScrollPositionOffset;
                        StaggeredGridLayoutManager staggeredGridLayoutManager = t0Var.f5095g;
                        if (i11 == Integer.MIN_VALUE) {
                            if (calculateScrollDirectionForPosition(i10) == 1) {
                                z8 = true;
                            }
                            t0Var.f5091c = z8;
                            if (z8) {
                                startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
                            }
                            t0Var.b = startAfterPadding;
                        } else if (t0Var.f5091c) {
                            t0Var.b = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding() - i11;
                        } else {
                            t0Var.b = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding() + i11;
                        }
                        t0Var.f5092d = true;
                    }
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public void updateAnchorInfoForLayout(l0 l0Var, t0 t0Var) {
        int startAfterPadding;
        if (updateAnchorFromPendingData(l0Var, t0Var) || updateAnchorFromChildren(l0Var, t0Var)) {
            return;
        }
        boolean z8 = t0Var.f5091c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = t0Var.f5095g;
        if (z8) {
            startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
        } else {
            startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
        }
        t0Var.b = startAfterPadding;
        t0Var.f5090a = 0;
    }

    public void updateMeasureSpecs(int i9) {
        this.mSizePerSpan = i9 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i9, this.mSecondaryOrientation.getMode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x019f, code lost:
    
        if (checkForGaps() != false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onLayoutChildren(androidx.recyclerview.widget.C0525e0 r13, androidx.recyclerview.widget.l0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.e0, androidx.recyclerview.widget.l0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.W
    public X generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new X((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new X(layoutParams);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i9, int i10, boolean z8) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        u0 u0Var = (u0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) u0Var).leftMargin;
        Rect rect = this.mTmpRect;
        int updateSpecWithExtra = updateSpecWithExtra(i9, i11 + rect.left, ((ViewGroup.MarginLayoutParams) u0Var).rightMargin + rect.right);
        int i12 = ((ViewGroup.MarginLayoutParams) u0Var).topMargin;
        Rect rect2 = this.mTmpRect;
        int updateSpecWithExtra2 = updateSpecWithExtra(i10, i12 + rect2.top, ((ViewGroup.MarginLayoutParams) u0Var).bottomMargin + rect2.bottom);
        if (z8) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, u0Var);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, u0Var);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.w0, java.lang.Object] */
    public StaggeredGridLayoutManager(int i9, int i10) {
        this.mOrientation = i10;
        setSpanCount(i9);
        this.mLayoutState = new C0542w();
        createOrientationHelpers();
    }
}
