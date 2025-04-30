package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09818b {
    public static byte[] A00;
    public static String[] A01 = {"y8PCDKtn8ucpWGHfqNdB7sz1AvxWDZl3", "5Uq5Tef01e5KR7nT6LwcHl3Vg4tg40ar", "x9FTdDf00FrCnddkCjcdWeA", "gJiYN9ifTBNONuuvPUf8ziVgoR00vK3d", "v3Miu0NURb4uLk241XhX4ihrJ8pIqCRx", "uSiAXhU6isZ", "cMhUI2Br8Brps1bGyIGx9oWkH3OZduaS", "WInOHqHvpegDLpa6TzR108vL1QbKC1c7"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] ^ i11) ^ 31;
            if (A01[0].charAt(17) == 'S') {
                throw new RuntimeException();
            }
            A01[0] = "5vWxIODTobtAshUzPXWGHOLgD2JZewLd";
            copyOfRange[i12] = (byte) i13;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{105, 105, 100, 104, 126, 105, 109, 114, 120, 126, 100, 126, 99, 111, 105, 122, 104, 46, 46, 35, 47, 57, 46, 42, 53, 63, 57, 35, 47, 56, 55, 35, 42, 57, 46, 47, 53, 51, 50};
    }

    static {
        A03();
    }

    public static String A01(C1635Ym c1635Ym) {
        return KE.A00(c1635Ym).getString(A00(0, 17, 36), null);
    }

    public static String A02(C1635Ym c1635Ym) {
        return KE.A00(c1635Ym).getString(A00(17, 22, 99), null);
    }

    public static void A04(C1635Ym c1635Ym) {
        KE.A00(c1635Ym).edit().remove(A00(17, 22, 99)).apply();
    }

    public static void A05(C1635Ym c1635Ym, String str, String str2) {
        KE.A00(c1635Ym).edit().putString(A00(17, 22, 99), str).putString(A00(0, 17, 36), str2).apply();
    }
}
