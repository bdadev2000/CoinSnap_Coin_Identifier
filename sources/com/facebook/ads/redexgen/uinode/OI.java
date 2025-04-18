package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class OI {
    public static float A00(C1G c1g) {
        int height = c1g.A0D().A01();
        int width = c1g.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((LC.A00().widthPixels - (OL.A07 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC0737Lo.A01(16);
        int ctaTextHeight = AbstractC0796Nv.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = OL.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = LC.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static OH A03(ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl, String str) {
        return new OH(viewOnClickListenerC0942Tl, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
