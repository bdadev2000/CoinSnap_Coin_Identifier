package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0668Is {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
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
