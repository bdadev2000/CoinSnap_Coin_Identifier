package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0750Of {
    public static float A00(C1F c1f) {
        int height = c1f.A0E().A01();
        int width = c1f.A0E().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) ((LO.A00().widthPixels - (AbstractC0753Oi.A07 * 2)) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = M3.A01(16);
        int ctaTextHeight = OL.A0B;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC0753Oi.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = LO.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC0749Oe A03(ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui, String str) {
        return new ViewOnClickListenerC0749Oe(viewOnClickListenerC0909Ui, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i2) {
        return A02(i2) < A01(d);
    }

    public static boolean A06(int i2, int i3, double d) {
        return i2 == 2 || A05(d, i3);
    }
}
