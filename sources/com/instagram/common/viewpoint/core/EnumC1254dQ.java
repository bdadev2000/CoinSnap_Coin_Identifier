package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1254dQ {
    A02,
    A05,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{14, 3, 24, 14, 22, 28, 88, 84, 76, 87, 80, 59, 48, 35, 48, 39, 109, 118, 115, 118, 119, 111, 118};
    }

    static {
        A01();
    }
}
