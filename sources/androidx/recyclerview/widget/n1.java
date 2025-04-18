package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public int f1976b;

    /* renamed from: c, reason: collision with root package name */
    public int f1977c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f1978d;

    /* renamed from: f, reason: collision with root package name */
    public Interpolator f1979f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1980g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1982i;

    public n1(RecyclerView recyclerView) {
        this.f1982i = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f1979f = interpolator;
        this.f1980g = false;
        this.f1981h = false;
        this.f1978d = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f1982i;
        recyclerView.setScrollState(2);
        this.f1977c = 0;
        this.f1976b = 0;
        Interpolator interpolator = this.f1979f;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f1979f = interpolator2;
            this.f1978d = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f1978d.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f1980g) {
            this.f1981h = true;
            return;
        }
        RecyclerView recyclerView = this.f1982i;
        recyclerView.removeCallbacks(this);
        ViewCompat.postOnAnimation(recyclerView, this);
    }

    public final void c(int i10, int i11, Interpolator interpolator, int i12) {
        boolean z10;
        int height;
        RecyclerView recyclerView = this.f1982i;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f1979f != interpolator) {
            this.f1979f = interpolator;
            this.f1978d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1977c = 0;
        this.f1976b = 0;
        recyclerView.setScrollState(2);
        this.f1978d.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        RecyclerView recyclerView = this.f1982i;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f1978d.abortAnimation();
            return;
        }
        this.f1981h = false;
        this.f1980g = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f1978d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f1976b;
            int i16 = currY - this.f1977c;
            this.f1976b = currX;
            this.f1977c = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i15);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i16);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                consumeFlingInHorizontalStretch -= iArr2[0];
                consumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i17 = iArr4[0];
                int i18 = iArr4[1];
                int i19 = consumeFlingInHorizontalStretch - i17;
                int i20 = consumeFlingInVerticalStretch - i18;
                j1 j1Var = recyclerView.mLayout.mSmoothScroller;
                if (j1Var != null && !j1Var.f1942d && j1Var.f1943e) {
                    int b3 = recyclerView.mState.b();
                    if (b3 == 0) {
                        j1Var.d();
                    } else if (j1Var.a >= b3) {
                        j1Var.a = b3 - 1;
                        j1Var.b(i17, i18);
                    } else {
                        j1Var.b(i17, i18);
                    }
                }
                i12 = i18;
                i13 = i17;
                i10 = i19;
                i11 = i20;
            } else {
                i10 = consumeFlingInHorizontalStretch;
                i11 = consumeFlingInVerticalStretch;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i13, i12, i10, i11, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i21 = i10 - iArr6[0];
            int i22 = i11 - iArr6[1];
            if (i13 != 0 || i12 != 0) {
                recyclerView.dispatchOnScrolled(i13, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i21 == 0) || (!z11 && i22 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            j1 j1Var2 = recyclerView.mLayout.mSmoothScroller;
            if (j1Var2 != null && j1Var2.f1942d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i21 < 0) {
                        i14 = -currVelocity;
                    } else if (i21 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i22 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i22 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i14, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    q qVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = qVar.f2011c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    qVar.f2012d = 0;
                }
            } else {
                b();
                s sVar = recyclerView.mGapWorker;
                if (sVar != null) {
                    sVar.a(recyclerView, i13, i12);
                }
            }
        }
        j1 j1Var3 = recyclerView.mLayout.mSmoothScroller;
        if (j1Var3 != null && j1Var3.f1942d) {
            j1Var3.b(0, 0);
        }
        this.f1980g = false;
        if (this.f1981h) {
            recyclerView.removeCallbacks(this);
            ViewCompat.postOnAnimation(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        }
    }
}
