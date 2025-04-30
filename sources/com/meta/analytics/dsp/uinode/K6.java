package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum K6 {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-6, -3, Ascii.FF, -95, -82, -82, -85, -82, -77, -84, -87, -84, -83, -75, -84};
    }

    static {
        A01();
    }
}
