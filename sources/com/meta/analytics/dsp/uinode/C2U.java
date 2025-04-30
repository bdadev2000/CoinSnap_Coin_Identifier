package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C2U {
    A05(A00(22, 6, 6)),
    A03(A00(14, 4, 124)),
    A04(A00(18, 4, 24));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 67, 78, 79, Ascii.SI, Ascii.SO, Ascii.SI, 4, 91, 76, 89, 70, 91, 93, 119, 118, 123, 122, Ascii.NAK, Ascii.DC4, Ascii.NAK, Ascii.RS, Ascii.ETB, 0, Ascii.NAK, 10, Ascii.ETB, 17};
    }

    static {
        A01();
    }

    C2U(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
