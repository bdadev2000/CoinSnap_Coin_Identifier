package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1234Is {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{39, 54, 34, 36, 50, 51, 46, 50, 63, 39, 55, 48, 57};
    }

    static {
        A01();
    }
}
