package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public abstract class K5 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, Byte.MAX_VALUE, 96, 54, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, Byte.MAX_VALUE, 96, 33, 80, 81, 83, 83, 3, 0, 85, 85, 11, 45, 55, 48, 57, 126, 50, Utf8.REPLACEMENT_BYTE, 45, 42, 126, Utf8.REPLACEMENT_BYTE, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC0629Jl enumC0629Jl) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC0629Jl) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(K6 k6) {
        AbstractC0638Ju.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(k6));
    }

    public static String A03(K6 k6) {
        return String.format(Locale.US, A01(0, 14, 29), k6.A09(), k6.A07(), Integer.valueOf(k6.A08() == null ? 0 : k6.A08().A00()), Integer.valueOf(k6.A08() == null ? 0 : k6.A08().A01()), Integer.valueOf(k6.A04()));
    }

    public static void A05(long j2, K6 k6) {
        A01.put(A03(k6), Long.valueOf(j2));
    }

    public static void A06(K6 k6) {
        A00.put(A03(k6), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, K6 k6) {
        A02.put(A03(k6), str);
    }

    public static boolean A08(K6 k6) {
        if (A03) {
            return false;
        }
        String A032 = A03(k6);
        if (A00.containsKey(A032)) {
            return System.currentTimeMillis() - A00.get(A032).longValue() < A00(A032, k6.A07());
        }
        return false;
    }
}
