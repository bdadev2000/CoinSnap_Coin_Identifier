package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04037m {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{2};
    }

    public C04037m(int i10, String str, String str2) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
    }

    public final String A02() {
        return this.A01 + A00(0, 1, 109) + this.A02;
    }
}
