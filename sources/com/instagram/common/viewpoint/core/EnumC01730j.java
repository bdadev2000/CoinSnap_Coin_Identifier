package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC01730j {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{68, 67, 94, 89, 76, 65, 65, 72, 73, 31, 30, 31, 20, 114, 115, 104, 99, 117, 114, 111, 104, 125, 112, 112, 121, 120};
    }

    static {
        A02();
    }

    public static EnumC01730j A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
