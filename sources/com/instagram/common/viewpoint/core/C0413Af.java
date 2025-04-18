package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0413Af extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"UWlpQQTiEDwOX7IrpEHWYNMuR1ZHkPvn", "oPg19ZETYULsNUg5O8QefgKam9gehu", "UM9JT6B", "seJxVbuvrp", "iD9akPgxjmJ1fdcDGVkD2Xrn4fmgc2oX", "GCLVfP1zfZau8msNy1BVLwfXpwZzSt58", "1BDf1JBwZX13Qoaiu6bzE", "X7ABsvepXICTkHYCTs3hwoQ4GB6A1sZ"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[6].length() != 21) {
                throw new RuntimeException();
            }
            A01[3] = "df";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 73);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{40, 64, 114, 36, 40, 82, 17, 26, 19, 28, 28, 23, 30, 1, 82, 27, 28, 82, 23, 28, 17, 29, 22, 27, 28, 21, 82, 125, 70, 64, 73, 70, 76, 68, 77, 76, 8, 78, 71, 90, 69, 73, 92, 18, 8};
    }

    static {
        A01();
    }

    public C0413Af(int i2, int i3, int i4) {
        super(A00(27, 18, 97) + i2 + A00(0, 5, 65) + i3 + A00(5, 22, 59) + i4);
    }
}
