package com.meta.analytics.dsp.uinode;

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

    public static int A01(double d2) {
        int availableWidth = (int) ((LC.A00().widthPixels - (OL.A07 * 2)) / d2);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC1303Lo.A01(16);
        int ctaTextHeight = AbstractC1362Nv.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = OL.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = LC.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static OH A03(ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl, String str) {
        return new OH(viewOnClickListenerC1508Tl, str);
    }

    public static boolean A04(double d2) {
        return d2 < 0.9d;
    }

    public static boolean A05(double d2, int i9) {
        return A02(i9) < A01(d2);
    }

    public static boolean A06(int i9, int i10, double d2) {
        return i9 == 2 || A05(d2, i10);
    }
}
