package com.facebook.ads.redexgen.uinode;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KP extends RelativeLayout implements QN {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC04328s A03;
    public AbstractC04328s A04;
    public AbstractC04328s A05;
    public AbstractC04328s A06;
    public SA A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (LD.A02 * 6.0f);
    }

    public KP(C1070Yn c1070Yn) {
        this(c1070Yn, A09, -12549889, 0);
    }

    public KP(C1070Yn c1070Yn, int i10, int i11, int i12) {
        super(c1070Yn);
        this.A00 = -1;
        this.A06 = new NQ() { // from class: com.facebook.ads.redexgen.X.7B
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass93 anonymousClass93) {
                SA sa2;
                sa2 = KP.this.A07;
                if (sa2 != null) {
                    KP kp = KP.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    kp.A07(true);
                }
            }
        };
        this.A04 = new AbstractC0814On() { // from class: com.facebook.ads.redexgen.X.7A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                KP.this.A02();
            }
        };
        this.A05 = new O7() { // from class: com.facebook.ads.redexgen.X.79
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                SA sa2;
                sa2 = KP.this.A07;
                if (sa2 != null) {
                    KP.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC0847Pu() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                SA sa2;
                sa2 = KP.this.A07;
                if (sa2 != null) {
                    KP.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1070Yn, null, R.attr.progressBarStyleHorizontal);
        A06(i11, i12);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01 = ofInt;
        ofInt.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i10, int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i11);
        ColorDrawable colorDrawable2 = new ColorDrawable(i11);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i10), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i10 = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int i11 = this.A00;
        if (i11 >= i10 || duration <= currentPositionInMillis) {
            return;
        }
        if (z10) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i11, i10);
            this.A01 = ofInt;
            int position = Math.min(250, duration - currentPositionInMillis);
            ofInt.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i10);
        }
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa2) {
        this.A07 = sa2;
        sa2.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa2) {
        sa2.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
