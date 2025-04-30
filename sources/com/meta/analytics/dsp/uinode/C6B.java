package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6B {
    A09,
    A05,
    A03,
    A07,
    A08,
    A06,
    A04,
    A0A;

    public static byte[] A00;
    public static String[] A01 = {"BGUY0sC2OmxA2doDHn0327", "P6odxXFdazI3wRxxaautCDOJnE5IXOEL", "YpgtdpkYY", "Rp0aJS5Umkn5PDWDdKEfRtTObnscQr7T", "72Qmn9vtGlfGU4IOG4pO1VGPznnZLp8H", "vlDJQFOxj", "KU9ywI5o6izvQy", "g1Go6XqGfOZw81oZCaqZo9FmGWFOGKat"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-32, -27, -18, -31, -33, -16, 33, Ascii.SO, 33, 59, 48, 33, 47, 48, 38, 34, Ascii.DC4, 33, -40, -39, -23, -47, -41, -35, 51, 38, 39, 45, 38, 36, 53, 42, 48, 47, 17, 3, Ascii.DLE, Ascii.DC4, 7, 1, 3, -45, -56, -63, -46, -59, -60, -33, -48, -46, -59, -58, -45, -20, -35, -21, -20};
        if (A01[2].length() == 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "DvjmlCDZrG7ugg1eBxWx0Q";
        strArr[5] = "Ich4sOWHv";
    }

    static {
        A01();
    }
}
