package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03256i {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, Utf8.REPLACEMENT_BYTE, 61, Utf8.REPLACEMENT_BYTE, 68, 65, 59, Utf8.REPLACEMENT_BYTE, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, 36, 25, 29, 21, 70, 67, 61};
    }

    static {
        A01();
        A09 = C03256i.class.getSimpleName();
        A05 = C8E.A0o;
        A06 = C8E.A0s;
        A02 = C8E.A0l;
        A01 = C8E.A0k;
        A03 = C8E.A0m;
        A00 = C8E.A0i;
        A04 = C8E.A0n;
        A07 = C8E.A0t;
    }

    public static void A02(C7j c7j, C6Y c6y, int i2, String str, long j2) {
        if (!A06(c7j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c6y.A01);
            jSONObject.put(A00(Opcodes.I2F, 13, 46), c6y.A02);
            if (j2 > 0) {
                jSONObject.put(A00(Opcodes.ATHROW, 9, 73), C0687Lu.A06(System.currentTimeMillis() - j2));
            }
            C8F c8f = new C8F(str);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i2, c8f);
        } catch (Throwable deLogException) {
            c7j.A07().A3y(deLogException);
        }
    }

    public static void A03(C7j c7j, C03206d c03206d, String str, int i2, String str2, Long l2, Long l3) {
        if (A06(c7j)) {
            A05(c7j, c03206d.A05, c03206d.A06, c03206d.A07, A00(Opcodes.INVOKEDYNAMIC, 5, 71), str, i2, str2, l2, l3, null);
        }
    }

    public static void A04(C7j c7j, C03246h c03246h, boolean z2) {
        if (!A06(c7j)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c03246h.A01);
            jSONObject.put(A00(Opcodes.I2F, 13, 46), c03246h.A03);
            jSONObject.put(A00(104, 16, 23), c03246h.A02);
            jSONObject.put(A00(Opcodes.IF_ICMPEQ, 13, Opcodes.LNEG), c03246h.A00);
            if (C0608Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), c03246h.A04);
            }
            String A002 = z2 ? A00(61, 10, 6) : A00(71, 11, 23);
            int i2 = z2 ? A05 : A06;
            C8F c8f = new C8F(A002);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i2, c8f);
        } catch (Throwable th) {
            c7j.A07().A3y(th);
        }
    }

    public static void A05(C7j c7j, String str, String str2, String str3, String str4, String str5, int i2, String str6, Long l2, Long l3, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(Opcodes.I2F, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(Opcodes.IRETURN, 14, 16), str6);
            }
            if (l2 != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l2));
            }
            if (l3 != null) {
                jSONObject.put(A00(Opcodes.ATHROW, 9, 73), String.valueOf(l3));
            }
            if (num != null) {
                jSONObject.put(A00(Opcodes.I2S, 7, Opcodes.LSHR), String.valueOf(num));
            }
            jSONObject.put(A00(Opcodes.IF_ICMPEQ, 13, Opcodes.LNEG), str5);
            if (C0608Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i2 == A03) {
                A002 = A00(38, 23, 79);
            } else if (i2 == A01) {
                A002 = A00(0, 19, 39);
            }
            C8F c8f = new C8F(A002);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i2, c8f);
        } catch (Throwable th) {
            c7j.A07().A3y(th);
        }
    }

    public static boolean A06(C7j c7j) {
        int A062;
        if (c7j.A04().A9O()) {
            A062 = 1;
        } else {
            A062 = Io.A06(c7j);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c7j.A08().A00() <= 1.0d / ((double) A062);
    }
}
