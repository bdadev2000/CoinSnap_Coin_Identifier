package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public enum QP {
    A06(A00(425, 41, 50)),
    A07(A00(466, 56, 61)),
    A08(A00(522, 44, 29)),
    A09(A00(566, 37, 13)),
    A04(A00(302, 40, 62)),
    A0A(A00(342, 45, 88)),
    A05(A00(387, 38, 60)),
    A0C(A00(655, 53, 121)),
    A0B(A00(603, 52, 10)),
    A03(A00(252, 50, 8));

    public static byte[] A01;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, -4, -17, 1, -21, -4, -18, -17, -18, 9, 0, -13, -18, -17, -7, 9, -21, -19, -2, -13, 0, -13, -2, 3, 9, -18, -17, -3, -2, -4, -7, 3, -17, -18, Ascii.EM, Ascii.FF, Ascii.RS, 8, Ascii.EM, Ascii.VT, Ascii.FF, Ascii.VT, 38, Ascii.GS, Ascii.DLE, Ascii.VT, Ascii.FF, Ascii.SYN, 38, 8, Ascii.VT, 38, 10, 19, Ascii.DLE, 10, Ascii.DC2, 10, -3, Ascii.SI, -7, 10, -4, -3, -4, Ascii.ETB, Ascii.SO, 1, -4, -3, 7, Ascii.ETB, -5, 4, 7, Ascii.VT, -3, -4, 44, Ascii.US, 49, Ascii.ESC, 44, Ascii.RS, Ascii.US, Ascii.RS, 57, 48, 35, Ascii.RS, Ascii.US, 41, 57, Ascii.GS, 41, 39, 42, 38, Ascii.US, 46, Ascii.US, 39, Ascii.SUB, 44, Ascii.SYN, 39, Ascii.EM, Ascii.SUB, Ascii.EM, 52, 43, Ascii.RS, Ascii.EM, Ascii.SUB, 36, 52, Ascii.CAN, 36, 34, 37, 33, Ascii.SUB, 41, Ascii.SUB, 52, 44, Ascii.RS, 41, Ascii.GS, 36, 42, 41, 52, 39, Ascii.SUB, 44, Ascii.SYN, 39, Ascii.EM, Ascii.FS, Ascii.SI, 33, Ascii.VT, Ascii.FS, Ascii.SO, Ascii.SI, Ascii.SO, 41, 32, 19, Ascii.SO, Ascii.SI, Ascii.EM, 41, Ascii.SI, Ascii.CAN, Ascii.SO, 41, Ascii.VT, Ascii.CR, Ascii.RS, 19, 32, 19, Ascii.RS, 35, 4, -9, 9, -13, 4, -10, -9, -10, 17, 8, -5, -10, -9, 1, 17, -9, 4, 4, 1, 4, 60, 47, 65, 43, 60, 46, 47, 46, 73, 64, 51, 46, 47, 57, 73, 51, 55, 58, 60, 47, Base64.padSymbol, Base64.padSymbol, 51, 57, 56, 45, 32, 50, Ascii.FS, 45, Ascii.US, 58, 46, 32, 45, 49, 32, 45, 58, 33, Ascii.FS, 36, 39, 32, Ascii.US, 33, Ascii.DC4, 38, Ascii.DLE, 33, 19, 46, 34, Ascii.DC4, 33, 37, Ascii.DC4, 33, 46, 34, 36, Ascii.DC2, Ascii.DC2, Ascii.DC4, 34, 34, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -32, -29, -14, -83, -15, -28, -10, -32, -15, -29, -28, -29, -34, -11, -24, -29, -28, -18, -83, -32, -30, -13, -24, -11, -24, -13, -8, -34, -29, -28, -14, -13, -15, -18, -8, -28, -29, Ascii.CAN, 36, 34, -29, Ascii.ESC, Ascii.SYN, Ascii.CAN, Ascii.SUB, Ascii.ETB, 36, 36, 32, -29, Ascii.SYN, Ascii.EM, 40, -29, 39, Ascii.SUB, 44, Ascii.SYN, 39, Ascii.EM, Ascii.SUB, Ascii.EM, Ascii.DC4, 43, Ascii.RS, Ascii.EM, Ascii.SUB, 36, -29, Ascii.SYN, Ascii.EM, Ascii.DC4, Ascii.CAN, 33, Ascii.RS, Ascii.CAN, 32, 50, 62, 60, -3, 53, 48, 50, 52, 49, 62, 62, 58, -3, 48, 51, 66, -3, 65, 52, 70, 48, 65, 51, 52, 51, 46, 69, 56, 51, 52, 62, -3, 48, 51, 46, 56, 60, 63, 65, 52, 66, 66, 56, 62, Base64.padSymbol, Ascii.SYN, 34, 32, -31, Ascii.EM, Ascii.DC4, Ascii.SYN, Ascii.CAN, Ascii.NAK, 34, 34, Ascii.RS, -31, Ascii.DC4, Ascii.ETB, 38, -31, 37, Ascii.CAN, 42, Ascii.DC4, 37, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.DC2, 41, Ascii.FS, Ascii.ETB, Ascii.CAN, 34, -31, Ascii.SYN, Ascii.US, 34, 38, Ascii.CAN, Ascii.ETB, Ascii.FF, Ascii.CAN, Ascii.SYN, -41, Ascii.SI, 10, Ascii.FF, Ascii.SO, Ascii.VT, Ascii.CAN, Ascii.CAN, Ascii.DC4, -41, 10, Ascii.CR, Ascii.FS, -41, Ascii.ESC, Ascii.SO, 32, 10, Ascii.ESC, Ascii.CR, Ascii.SO, Ascii.CR, 8, Ascii.US, Ascii.DC2, Ascii.CR, Ascii.SO, Ascii.CAN, -41, Ascii.FF, Ascii.CAN, Ascii.SYN, Ascii.EM, Ascii.NAK, Ascii.SO, Ascii.GS, Ascii.SO, Ascii.CR, Ascii.ETB, 35, 33, -30, Ascii.SUB, Ascii.NAK, Ascii.ETB, Ascii.EM, Ascii.SYN, 35, 35, Ascii.US, -30, Ascii.NAK, Ascii.CAN, 39, -30, 38, Ascii.EM, 43, Ascii.NAK, 38, Ascii.CAN, Ascii.EM, Ascii.CAN, 19, 42, Ascii.GS, Ascii.CAN, Ascii.EM, 35, -30, Ascii.ETB, 35, 33, 36, 32, Ascii.EM, 40, Ascii.EM, Ascii.CAN, -30, 43, Ascii.GS, 40, Ascii.FS, 35, 41, 40, -30, 38, Ascii.EM, 43, Ascii.NAK, 38, Ascii.CAN, -9, 3, 1, -62, -6, -11, -9, -7, -10, 3, 3, -1, -62, -11, -8, 7, -62, 6, -7, Ascii.VT, -11, 6, -8, -7, -8, -13, 10, -3, -8, -7, 3, -62, -7, 2, -8, -13, -11, -9, 8, -3, 10, -3, 8, Ascii.CR, -25, -13, -15, -78, -22, -27, -25, -23, -26, -13, -13, -17, -78, -27, -24, -9, -78, -10, -23, -5, -27, -10, -24, -23, -24, -29, -6, -19, -24, -23, -13, -78, -23, -10, -10, -13, -10, -28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -13, -26, -8, -30, -13, -27, -26, -27, -32, -9, -22, -27, -26, -16, -81, -12, -26, -13, -9, -26, -13, -32, -13, -26, -8, -30, -13, -27, -32, -25, -30, -22, -19, -26, -27, 83, 95, 93, Ascii.RS, 86, 81, 83, 85, 82, 95, 95, 91, Ascii.RS, 81, 84, 99, Ascii.RS, 98, 85, 103, 81, 98, 84, 85, 84, 79, 102, 89, 84, 85, 95, Ascii.RS, 99, 85, 98, 102, 85, 98, 79, 98, 85, 103, 81, 98, 84, 79, 99, 101, 83, 83, 85, 99, 99};
    }

    static {
        A01();
    }

    QP(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }

    public final String A03(String str) {
        return this.A00 + A00(0, 1, 123) + str;
    }
}
