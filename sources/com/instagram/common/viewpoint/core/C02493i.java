package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02493i {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{81, 80, 48, 71, 85, 86, 71, 70, 40, 78, 75, 80, 73, 31, 30, -2, 21, 35, 36, 21, 20, 0, 34, 21, -10, 28, 25, 30, 23, 2, 1, -31, -8, 6, 7, -8, -9, -29, 5, -8, -26, -10, 5, 2, -1, -1, 16, 15, -17, 6, 20, 21, 6, 5, -12, 4, 19, 16, 13, 13, 36, 35, 3, 26, 40, 41, 26, 25, 8, 24, 39, 36, 33, 33, -10, 24, 24, 26, 37, 41, 26, 25, 30, 29, 2, 35, 16, 33, 35, -3, 20, 34, 35, 20, 19, 2, 18, 33, 30, 27, 27, 9, 8, -19, 14, 9, 10, -24, -1, 13, 14, -1, -2, -19, -3, 12, 9, 6, 6};
    }

    public void A03(ViewParent viewParent, View view) {
        if (0 != 0) {
            throw new NullPointerException(A00(101, 18, 40));
        }
    }

    public void A04(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        if (0 != 0) {
            throw new NullPointerException(A00(46, 14, 47));
        }
    }

    public void A05(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        if (0 != 0) {
            throw new NullPointerException(A00(29, 17, 33));
        }
    }

    public void A06(ViewParent viewParent, View view, View view2, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(60, 22, 67));
        }
    }

    public boolean A07(ViewParent viewParent, View view, float f2, float f3) {
        if (0 != 0) {
            throw new NullPointerException(A00(13, 16, 62));
        }
        return false;
    }

    public boolean A08(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 13, 112));
        }
        return false;
    }

    public boolean A09(ViewParent viewParent, View view, View view2, int i2) {
        if (0 != 0) {
            throw new NullPointerException(A00(82, 19, 61));
        }
        return false;
    }
}
