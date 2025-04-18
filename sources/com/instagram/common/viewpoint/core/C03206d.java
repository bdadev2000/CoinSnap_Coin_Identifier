package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03206d {
    public static byte[] A08;
    public C6l A00;
    public String A01 = A00(0, 4, 75);
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{7, 10, -4, -1};
    }

    public C03206d(String str, int i2, int i3, String str2, String str3) {
        this.A07 = str;
        this.A03 = i2;
        this.A04 = i3;
        this.A06 = str2;
        this.A05 = str3;
    }
}
