package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum QM {
    A03,
    A04,
    A02;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, Ascii.RS, Ascii.US, 4, Ascii.DC4, Ascii.CAN, Ascii.US, 10, Ascii.EM, Ascii.US, Ascii.SO, Ascii.SI, 66, 67, 88, 83, 95, 88, 77, 94, 88, 73, 72, Ascii.DC2, Ascii.DC4, 2, Ascii.NAK, Ascii.CAN, Ascii.DC4, 19, 6, Ascii.NAK, 19, 2, 3};
    }

    static {
        A01();
    }
}
