package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0571Ha {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{36, 55, 46, 30, 43, 36, 45, -41, -22, -31, -47, -28, -41, -42, -37, -28};
    }

    public static long A00(HZ hz) {
        return hz.A6B(A02(0, 7, 127), -1L);
    }

    public static Uri A01(HZ hz) {
        String A6D = hz.A6D(A02(7, 9, 50), null);
        if (A6D == null) {
            return null;
        }
        return Uri.parse(A6D);
    }

    public static void A04(C0572Hb c0572Hb) {
        c0572Hb.A01(A02(7, 9, 50));
    }

    public static void A05(C0572Hb c0572Hb, long j2) {
        c0572Hb.A02(A02(0, 7, 127), j2);
    }

    public static void A06(C0572Hb c0572Hb, Uri uri) {
        c0572Hb.A03(A02(7, 9, 50), uri.toString());
    }
}
