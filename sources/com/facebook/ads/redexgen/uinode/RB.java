package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum RB {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-68, -49, -64, -64, -65, -52, -61, -56, -63, -65, -52, -52, -55, -52, 110, 105, 113, 106, -74, -89, -69, -71, -85, -86, -95, -99, -110, -86, -109, -110, -108, -100, -80, -108, -96, -98, -95, -99, -106, -91, -106, -107, -107, -105, -118, -107, -122, -105, -118, -119, -73, -71, -84, -73, -88, -71, -80, -75, -82, -124, 124, 122, -127, -127, 118, 117, 100, 101, 82, 99, 101, 86, 85};
    }

    static {
        A01();
    }
}
