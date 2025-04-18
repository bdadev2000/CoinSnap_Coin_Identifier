package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02260g {
    A08,
    A03,
    A04,
    A09,
    A02,
    A07,
    A06,
    A05;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-27, -12, -12, 3, -9, -8, -13, -10, -23, -6, -8, 5, 5, 6, Ascii.VT, Ascii.SYN, 6, 7, -4, 5, -7, -9, 4, 4, 5, 10, Ascii.NAK, 10, 8, -9, -7, 1, -60, -46, -49, -48, -48, -59, -60, 7, Ascii.SUB, Ascii.SYN, 7, Ascii.DC4, Ascii.DLE, 3, Ascii.SO, 33, 4, Ascii.DC4, 17, Ascii.EM, Ascii.NAK, 7, Ascii.DC4, Ascii.DLE, 8, 9, 5, 6, 5, -4, -56, -69, -70, -65, -56, -69, -71, -54, -43, -54, -59, -43, -73, -58, -58};
    }

    static {
        A01();
    }

    public static boolean A02(EnumC02260g enumC02260g) {
        return A03.equals(enumC02260g) || A04.equals(enumC02260g);
    }
}
