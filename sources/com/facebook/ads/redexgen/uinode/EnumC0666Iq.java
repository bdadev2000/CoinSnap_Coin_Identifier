package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0666Iq {
    A02,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 101, 92, 90, 92, 97, 84, 95, -49, -47, -66, -49, -63, -51, -47, -63, -54, -48, 122, 109, 105, 123, 101, 102, 109, 112, 109, 120, 125};
    }

    static {
        A01();
    }
}
