package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.90, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass90 {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 57, 40, 63, 52, 57, 56, 35, 46, 57, 63, 51, 46, 56, 47, 67, 64, 81, 70, 77, 90, 71, 80, 67, 67, 64, 87, 90, 81, 74, 74, 90, 86, 72, 68, 73, 73, 77, 76, 92, 81, 70, 64, 76, 81, 71, 80, 92, 87, 76, 92, 69, 70, 87, 64, 75};
    }

    static {
        A01();
    }
}
