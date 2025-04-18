package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03628f {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{6, 6, 19, 7, -7, 6, 10, -3, -9, -7, 19, -7, 12, 8, 6, -11, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -4, -19, -12, 8, -1, -18, -5, -4, -14, -8, -9};
    }

    public static String A01(C1044Zr c1044Zr) {
        return KJ.A00(c1044Zr).getString(A00(0, 17, 75), null);
    }

    public static String A02(C1044Zr c1044Zr) {
        return KJ.A00(c1044Zr).getString(A00(17, 22, 64), null);
    }

    public static void A04(C1044Zr c1044Zr) {
        KJ.A00(c1044Zr).edit().remove(A00(17, 22, 64)).apply();
    }

    public static void A05(C1044Zr c1044Zr, String str, String str2) {
        KJ.A00(c1044Zr).edit().putString(A00(17, 22, 64), str).putString(A00(0, 17, 75), str2).apply();
    }
}
