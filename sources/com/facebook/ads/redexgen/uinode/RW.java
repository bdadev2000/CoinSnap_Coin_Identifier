package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class RW {
    public static byte[] A05;
    public RS A00;
    public RV A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public RW(String str, RY ry, RS rs) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (ry != null && !ry.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + ry.A06();
        }
        this.A00 = rs;
    }

    public final RS A02() {
        return this.A00;
    }

    public final RV A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
