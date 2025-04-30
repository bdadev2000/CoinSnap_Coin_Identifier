package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 implements Runnable {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5040c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f5041d;

    /* renamed from: f, reason: collision with root package name */
    public Interpolator f5042f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5043g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5045i;

    public o0(RecyclerView recyclerView) {
        this.f5045i = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f5042f = interpolator;
        this.f5043g = false;
        this.f5044h = false;
        this.f5041d = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i9, int i10) {
        RecyclerView recyclerView = this.f5045i;
        recyclerView.setScrollState(2);
        this.f5040c = 0;
        this.b = 0;
        Interpolator interpolator = this.f5042f;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f5042f = interpolator2;
            this.f5041d = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f5041d.fling(0, 0, i9, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f5043g) {
            this.f5044h = true;
            return;
        }
        RecyclerView recyclerView = this.f5045i;
        recyclerView.removeCallbacks(this);
        ViewCompat.postOnAnimation(recyclerView, this);
    }

    public final void c(int i9, int i10, Interpolator interpolator, int i11) {
        boolean z8;
        int height;
        RecyclerView recyclerView = this.f5045i;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i9);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z8) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f5042f != interpolator) {
            this.f5042f = interpolator;
            this.f5041d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5040c = 0;
        this.b = 0;
        recyclerView.setScrollState(2);
        this.f5041d.startScroll(0, 0, i9, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z8;
        boolean z9;
        boolean z10;
        int i13;
        RecyclerView recyclerView = this.f5045i;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f5041d.abortAnimation();
            return;
        }
        this.f5044h = false;
        this.f5043g = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f5041d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.b;
            int i15 = currY - this.f5040c;
            this.b = currX;
            this.f5040c = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i14);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i15);
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
                int i16 = iArr4[0];
                int i17 = iArr4[1];
                int i18 = consumeFlingInHorizontalStretch - i16;
                int i19 = consumeFlingInVerticalStretch - i17;
                k0 k0Var = recyclerView.mLayout.mSmoothScroller;
                if (k0Var != null && !k0Var.f5020d && k0Var.f5021e) {
                    int b = recyclerView.mState.b();
                    if (b == 0) {
                        k0Var.d();
                    } else if (k0Var.f5018a >= b) {
                        k0Var.f5018a = b - 1;
                        k0Var.b(i16, i17);
                    } else {
                        k0Var.b(i16, i17);
                    }
                }
                i11 = i17;
                i12 = i16;
                i9 = i18;
                i10 = i19;
            } else {
                i9 = consumeFlingInHorizontalStretch;
                i10 = consumeFlingInVerticalStretch;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i12, i11, i9, i10, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i20 = i9 - iArr6[0];
            int i21 = i10 - iArr6[1];
            if (i12 != 0 || i11 != 0) {
                recyclerView.dispatchOnScrolled(i12, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!overScroller.isFinished() && ((!z8 && i20 == 0) || (!z9 && i21 == 0))) {
                z10 = false;
            } else {
                z10 = true;
            }
            k0 k0Var2 = recyclerView.mLayout.mSmoothScroller;
            if ((k0Var2 == null || !k0Var2.f5020d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i20 < 0) {
                        i13 = -currVelocity;
                    } else if (i20 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i13, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C0537q c0537q = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = c0537q.f5074c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c0537q.f5075d = 0;
                }
            } else {
                b();
                RunnableC0538s runnableC0538s = recyclerView.mGapWorker;
                if (runnableC0538s != null) {
                    runnableC0538s.a(recyclerView, i12, i11);
                }
            }
        }
        k0 k0Var3 = recyclerView.mLayout.mSmoothScroller;
        if (k0Var3 != null && k0Var3.f5020d) {
            k0Var3.b(0, 0);
        }
        this.f5043g = false;
        if (this.f5044h) {
            recyclerView.removeCallbacks(this);
            ViewCompat.postOnAnimation(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        }
    }
}
