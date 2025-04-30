package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC07950j {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{37, 34, 63, 56, 45, 32, 32, 41, 40, 37, 36, 37, 46, 101, 100, Ascii.DEL, 116, 98, 101, 120, Ascii.DEL, 106, 103, 103, 110, 111};
    }

    static {
        A02();
    }

    public static EnumC07950j A00(String str) {
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
