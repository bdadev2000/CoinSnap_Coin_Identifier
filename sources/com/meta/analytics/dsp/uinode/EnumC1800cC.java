package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1800cC {
    A02,
    A05,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, 113, 106, 124, 100, 110, Ascii.NAK, Ascii.EM, 1, Ascii.SUB, Ascii.GS, 116, Ascii.DEL, 108, Ascii.DEL, 104, 116, 111, 106, 111, 110, 118, 111};
    }

    static {
        A01();
    }
}
