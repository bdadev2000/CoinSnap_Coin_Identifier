package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.13, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass13 {
    A03(A00(37, 9, 98)),
    A05(A00(65, 9, 87)),
    A04(A00(46, 19, 70));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 85, 66, 74, 79, 66, 65, 79, 70, 95, 94, 78, 95, 80, 69, 88, 71, 84, 78, 80, 85, 78, 93, 80, 72, 94, 68, 69, 8, 19, 19, 3, 15, 17, 29, 16, 16, 65, 86, 65, 73, 76, 65, 66, 76, 69, 106, 107, 91, 106, 101, 112, 109, 114, 97, 91, 101, 96, 91, 104, 101, 125, 107, 113, 112, 97, 122, 122, 74, 102, 120, 116, 121, 121};
    }

    static {
        A01();
    }

    AnonymousClass13(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
