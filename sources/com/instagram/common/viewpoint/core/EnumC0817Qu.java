package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Qu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0817Qu {
    A04(A00(Opcodes.I2S, 33, 22)),
    A05(A00(Opcodes.GETFIELD, 36, 110)),
    A06(A00(216, 29, 107)),
    A03(A00(78, 32, 92)),
    A07(A00(110, 37, 90));

    public static byte[] A01;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 7, 26, 15, 28, 11, 37, 7, 10, 37, 9, 18, 15, 9, 17, -63, -76, -57, -68, -55, -72, -46, -74, -62, -64, -61, -65, -72, -57, -72, -35, -48, -29, -40, -27, -44, -18, -44, -35, -45, -18, -48, -46, -29, -40, -27, -40, -29, -24, -35, -48, -29, -40, -27, -44, -18, -44, -31, -31, -34, -31, -39, -52, -33, -44, -31, -48, -22, -44, -40, -37, -35, -48, -34, -34, -44, -38, -39, 41, 53, 51, -12, 44, 39, 41, 43, 40, 53, 53, 49, -12, 39, 42, 57, -12, 52, 39, 58, 47, 60, 43, -12, 39, 42, 37, 41, 50, 47, 41, 49, 39, 51, 49, -14, 42, 37, 39, 41, 38, 51, 51, 47, -14, 37, 40, 55, -14, 50, 37, 56, 45, 58, 41, -14, 37, 40, 35, 45, 49, 52, 54, 41, 55, 55, 45, 51, 50, -29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -18, -31, -12, -23, -10, -27, -82, -29, -17, -19, -16, -20, -27, -12, -27, -28, 59, 71, 69, 6, 62, 57, 59, 61, 58, 71, 71, 67, 6, 57, 60, 75, 6, 70, 57, 76, 65, 78, 61, 6, 61, 70, 60, 55, 57, 59, 76, 65, 78, 65, 76, 81, 56, 68, 66, 3, 59, 54, 56, 58, 55, 68, 68, 64, 3, 54, 57, 72, 3, 67, 54, 73, 62, 75, 58, 3, 58, 71, 71, 68, 71};
    }

    static {
        A01();
    }

    EnumC0817Qu(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}
