package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10179m {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-15, -7, -7, -15, -72, -17, 2, -7, -72, -19, -7, -4, -17};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 88);
    }

    public static synchronized String A00() {
        String str;
        synchronized (C10179m.class) {
            str = A00;
        }
        return str;
    }
}
