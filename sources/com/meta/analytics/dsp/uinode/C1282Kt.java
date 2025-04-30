package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1282Kt extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-44, -4, -4, -12, -7, -14, -83, -35, -7, -18, 6, -83, -10, 0, -83, -5, -4, 1, -83, -10, -5, 0, 1, -18, -7, -7, -14, -15};
    }

    public C1282Kt() {
        super(A00(0, 28, 37));
    }
}
