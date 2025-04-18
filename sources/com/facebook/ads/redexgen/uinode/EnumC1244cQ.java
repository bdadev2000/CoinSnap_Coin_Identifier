package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1244cQ {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 49);
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
