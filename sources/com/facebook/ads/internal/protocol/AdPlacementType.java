package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(58, 6, 15)),
    INTERSTITIAL(A00(64, 12, 17)),
    NATIVE(A00(76, 6, 77)),
    NATIVE_BANNER(A00(82, 13, 15)),
    REWARDED_VIDEO(A00(95, 14, 100)),
    UNKNOWN(A00(109, 7, 15));

    public static byte[] A01;
    public String A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC4, 19, 32, 32, Ascii.ETB, 36, 35, 40, 46, Ascii.US, 44, 45, 46, 35, 46, 35, Ascii.ESC, 38, 38, Ascii.EM, 44, 33, 46, Ascii.GS, 4, -9, 10, -1, Ascii.FF, -5, Ascii.NAK, -8, -9, 4, 4, -5, 8, -40, -53, -35, -57, -40, -54, -53, -54, -27, -36, -49, -54, -53, -43, Ascii.SYN, Ascii.SI, Ascii.FF, Ascii.SI, Ascii.DLE, Ascii.CAN, Ascii.SI, -44, -45, -32, -32, -41, -28, -35, -30, -24, -39, -26, -25, -24, -35, -24, -35, -43, -32, Ascii.RS, 17, 36, Ascii.EM, 38, Ascii.NAK, -32, -45, -26, -37, -24, -41, -47, -44, -45, -32, -32, -41, -28, 57, 44, 62, 40, 57, 43, 44, 43, 38, 61, 48, 43, 44, 54, -25, -32, -35, -32, -31, -23, -32};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
