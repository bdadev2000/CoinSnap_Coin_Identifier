package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1810cQ {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-54, -45, -39, -54, -41, -38, -19, -34, -23, -15, -20, -32, -35, -16, -31};
    }

    static {
        A01();
    }
}
