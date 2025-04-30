package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09697m {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{2};
    }

    public C09697m(int i9, String str, String str2) {
        this.A00 = i9;
        this.A01 = str;
        this.A02 = str2;
    }

    public final String A02() {
        return this.A01 + A00(0, 1, 109) + this.A02;
    }
}
