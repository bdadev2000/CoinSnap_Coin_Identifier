package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.As, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0426As extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9pRqtqi3B", "JLdBJvINcDpXAJRy2UXokirsyAm3AHdF", "frFBuXumqsQze9gDO0obsB6cGwssnn2k", "1OAjkxxII3AJpjsq4Owj5COwKU2yEoCn", "nSdrqNcbm", "RxwVmVtKL", "mcWlkz1DsHXHGDaAhVJHp1I", "BOAhRTYtJ"};
    public final int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {81, 101, 116, 121, Byte.MAX_VALUE, 68, 98, 113, 115, 123, 48, 103, 98, 121, 100, 117, 48, 118, 113, 121, 124, 117, 116, 42, 48};
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "fnY9AWebU";
        strArr2[5] = "pcBma8CYl";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C0426As(int i2) {
        super(A00(0, 25, Opcodes.DNEG) + i2);
        this.A00 = i2;
    }
}
