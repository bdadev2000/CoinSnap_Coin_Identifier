package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public enum S6 {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));

    public static byte[] A01;
    public String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, Ascii.SI, Ascii.ETB, 2, Ascii.CR, 10, 5, -63, Ascii.DC4, 6, 19, Ascii.ETB, 6, 19, -63, 19, 6, Ascii.DC4, 17, Ascii.DLE, Ascii.SI, Ascii.DC4, 6, -37, -63, -58, Ascii.DC4, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    S6(String str) {
        this.A00 = str;
    }

    public static S6 A00(String str) {
        for (S6 s62 : values()) {
            if (s62.A00.equals(str)) {
                return s62;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
