package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Aa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1030Aa extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, 75, 121, 47, 35, 68, 7, Ascii.FF, 5, 10, 10, 1, 8, Ascii.ETB, 68, Ascii.CR, 10, 68, 1, 10, 7, Ascii.VT, 0, Ascii.CR, 10, 3, 68, Ascii.DC2, 41, 47, 38, 41, 35, 43, 34, 35, 103, 33, 40, 53, 42, 38, 51, 125, 103};
    }

    public C1030Aa(int i9, int i10, int i11) {
        super(A00(27, 18, 32) + i9 + A00(0, 5, 100) + i10 + A00(5, 22, 3) + i11);
    }
}
