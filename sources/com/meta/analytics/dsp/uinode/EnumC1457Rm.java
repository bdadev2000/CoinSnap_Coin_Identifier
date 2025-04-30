package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1457Rm {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-124, -115, -118, -122, -113, -107, -96, -112, -104, -113, -122, -123, -112, -126, -113, -109, -126, -113, -100, -116, -108, -117, -126, -127};
    }

    static {
        A01();
    }
}
