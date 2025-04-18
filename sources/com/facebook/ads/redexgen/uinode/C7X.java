package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C7X {
    A04,
    A05,
    A0J,
    A0C,
    A0E,
    A06,
    A0B,
    A08,
    A0M,
    A0F,
    A0G,
    A03,
    A07,
    A09,
    A0K,
    A0N,
    A0I,
    A0A,
    A0H,
    A0L,
    A0D;

    public static byte[] A00;
    public static String[] A01 = {"SXlbL1CY1HnlFue4Epuvc3q4430g41ka", "Q7EHaqXEYxiQEOiIyqjopxzkHRhZVKtw", "xNF", "uYQgnyI7xn5N5GOR4jmA1ry4yxIflSMQ", "rwtSlkdLuH5KaJR0oY6wYi8G8Rc4X5Yb", "KhrHqa8env5LHobs7dTfjp4HGZPf1i5f", "07o3NElFbIdfTqORF47AUY47", "YWtiaLPvBkX5SyS9ALyLBNGqlxgBLMMn"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(11) == strArr[7].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "W4gBMubxKiZM5LLivtLPs396PBqN8ReM";
            strArr2[0] = "lPif8zo0BCGymIa9nsJJXRn9Vdfcrwfz";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 99);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {103, 116, 116, 103, Byte.MAX_VALUE, Ascii.DC4, Ascii.EM, Ascii.EM, Ascii.SUB, 19, Ascii.ETB, Ascii.CAN, 64, 91, 86, 71, 122, 113, 120, 107, 84, 85, 83, 92, 81, 66, 85, 84, 48, 59, 33, 54, 56, 49, Ascii.NAK, 2, 2, Ascii.US, 2, Ascii.SI, Ascii.DC2, Ascii.SI, 9, Ascii.US, Ascii.RS, Ascii.VT, 8, 6, Ascii.SI, 73, 67, 64, 78, 91, Ascii.VT, Ascii.FF, Ascii.SYN, 100, 99, 121, 104, Byte.MAX_VALUE, 126, 104, 110, 121, 100, 98, 99, 102, 101, 100, 109, 78, 79, 78, 69, 84, 79, 86, 86, 95, 68, 88, 85, 66, Ascii.FS, Ascii.CR, Ascii.SI, 7, Ascii.CR, Ascii.VT, 9, 55, 44, 43, 54, 48, Ascii.DC4, Ascii.EM, Ascii.DLE, 5, Ascii.SYN, 1, Ascii.DC2, 97, 122, 125, 123, 122, 64, 89, 95, 82, 90, 68, 65, 73, 78, 76, 95, 73};
        String[] strArr = A01;
        if (strArr[4].charAt(5) == strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        A01[6] = "Uq";
        A00 = bArr;
    }

    static {
        A01();
    }
}
