package com.instagram.common.viewpoint.core;

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
public final class N5 extends RelativeLayout implements InterfaceC0816Qt {
    public static byte[] A08;
    public static String[] A09 = {"QrML4Ecz92sfYCeCtaSnFCosFmipGlTz", "VhmrcYjsqpOA7Iy", "ZK9HRS350jRidth", "ZjYoflRzQYTDfI0m0JAvuVl9vp7GlkSu", "MmC", "ZvQ3uBw3DQ7M1xesozkO3pU9", "XD5i8EmzP8U96tjWoOsk6YaJBmNCgDM7", "cjtQcAKtxYCLU"};
    public static final int A0A;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC03808x A03;
    public AbstractC03808x A04;
    public AbstractC03808x A05;
    public AbstractC03808x A06;
    public T7 A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A09;
        if (strArr[0].charAt(7) != strArr[6].charAt(7)) {
            throw new RuntimeException();
        }
        A09[4] = "F3xM2b87YXaGRbor1WnSFNsn05JfW";
        A08 = new byte[]{-5, -3, -6, -14, -3, -16, -2, -2};
    }

    static {
        A03();
        A0A = (int) (LP.A02 * 6.0f);
    }

    public N5(C1045Zs c1045Zs) {
        this(c1045Zs, A0A, -12549889, 0);
    }

    public N5(C1045Zs c1045Zs, int i2, int i3, int i4) {
        super(c1045Zs);
        this.A00 = -1;
        this.A06 = new R8() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9O c9o) {
                T7 t7;
                t7 = N5.this.A07;
                if (t7 != null) {
                    N5.this.A07(true);
                }
            }
        };
        this.A04 = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9P c9p) {
                N5.this.A02();
            }
        };
        this.A05 = new AbstractC0836Rn() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(SZ sz) {
                T7 t7;
                t7 = N5.this.A07;
                if (t7 != null) {
                    N5.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.7C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9R c9r) {
                T7 t7;
                t7 = N5.this.A07;
                if (t7 != null) {
                    N5.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1045Zs, null, R.attr.progressBarStyleHorizontal);
        A06(i3, i4);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 56), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i2, int i3) {
        ColorDrawable colorDrawable = new ColorDrawable(i3);
        ColorDrawable colorDrawable2 = new ColorDrawable(i3);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i2), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z2) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i2 = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int position = this.A00;
        if (position >= i2 || duration <= currentPositionInMillis) {
            return;
        }
        if (z2) {
            ProgressBar progressBar = this.A02;
            int position2 = this.A00;
            this.A01 = ObjectAnimator.ofInt(progressBar, A01(0, 8, 56), position2, i2);
            ObjectAnimator objectAnimator = this.A01;
            int position3 = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(position3);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i2);
        }
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void A9r(T7 t7) {
        this.A07 = t7;
        t7.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void AHD(T7 t7) {
        t7.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
