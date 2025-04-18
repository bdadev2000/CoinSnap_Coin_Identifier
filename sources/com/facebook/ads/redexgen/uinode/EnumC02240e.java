package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.0e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02240e {
    A0C(A00(169, 5, 108)),
    A0A(A00(156, 5, 19)),
    A03(A00(87, 8, 102)),
    A0B(A00(161, 8, 112)),
    A07(A00(128, 10, 80)),
    A09(A00(147, 9, 122)),
    A08(A00(138, 9, 102)),
    A04(A00(95, 7, 74)),
    A05(A00(102, 13, 13)),
    A06(A00(115, 13, 27));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 17, 2, Ascii.US, 5, 3, Ascii.NAK, Ascii.FS, Ascii.DLE, Ascii.ESC, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.ETB, 115, 120, 113, 121, 126, 117, 116, 111, 121, 125, 113, 119, 117, 17, Ascii.SUB, 19, Ascii.ESC, Ascii.FS, Ascii.ETB, Ascii.SYN, Ascii.CR, 4, Ascii.ESC, Ascii.SYN, Ascii.ETB, Ascii.GS, 104, Byte.MAX_VALUE, 96, 115, 100, 117, 110, 126, 101, 104, 90, 77, 82, 65, 87, 83, 95, 89, 91, 78, 89, 70, 85, 92, 67, 78, 79, 69, 109, 105, 101, 99, 97, 9, Ascii.NAK, Ascii.CAN, 0, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 92, 67, 78, 79, 69, 55, 53, 38, 59, 33, 39, 49, 56, Ascii.ESC, Ascii.DLE, Ascii.EM, 17, Ascii.SYN, Ascii.GS, Ascii.FS, 92, 87, 94, 86, 81, 90, 91, 96, 86, 82, 94, 88, 90, 74, 65, 72, 64, 71, 76, 77, 118, 95, 64, 77, 76, 70, 6, 17, Ascii.SO, Base64.padSymbol, 10, Ascii.ESC, 0, Ascii.DLE, Ascii.VT, 6, 48, 39, 56, Ascii.VT, Base64.padSymbol, 57, 53, 51, 49, 44, 59, 36, Ascii.ETB, 62, 33, 44, 45, 39, 72, 76, 64, 70, 68, 50, 46, 35, 59, 35, 32, 46, 39, 40, 55, 58, 59, 49};
    }

    static {
        A01();
    }

    EnumC02240e(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
