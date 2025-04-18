package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC0850Sb {
    public static byte[] A01;
    public static String[] A02 = {"4MR", "ox3", "IUsSI7rcrCx1ERgKd0rYF5wqQshT9MFY", "XMpLbdKCI8ptDt9BVBTjCKDwrbbZ39Yk", "reDnu4iC6gOf", "58W6JAylc1sA", "T5hdxNMEH3a8tXz2YdYKh9bF2ZTD6zRG", "CM8HCV1eVyulF3snUIL5CjajvzNLA86A"};
    public static final /* synthetic */ EnumC0850Sb[] A03;
    public static final EnumC0850Sb A04;
    public static final EnumC0850Sb A05;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "zM61rMpjrvDScug74JUjCxPutIg5FxhC";
            strArr2[7] = "TMGBJitMUu1pxt90KbWrvOLR2BVfJ6J0";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 11);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-86, -83, -80, -80, -104, -109, -121, -124, -105, -120, -116, -113, -110, -110, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
        A04 = new EnumC0850Sb(A00(0, 4, 89), 0, A00(10, 4, 27));
        A05 = new EnumC0850Sb(A00(4, 6, 56), 1, A00(14, 6, 40));
        A03 = A02();
    }

    public EnumC0850Sb(String str, int i2, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC0850Sb[] A02() {
        EnumC0850Sb[] enumC0850SbArr = new EnumC0850Sb[2];
        enumC0850SbArr[0] = A04;
        EnumC0850Sb enumC0850Sb = A05;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "lJSENTz9psORZi9A2zDcPU2PQxg7yytN";
        enumC0850SbArr[1] = enumC0850Sb;
        return enumC0850SbArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC0850Sb valueOf(String str) {
        return (EnumC0850Sb) Enum.valueOf(EnumC0850Sb.class, str);
    }

    public static EnumC0850Sb[] values() {
        return (EnumC0850Sb[]) A03.clone();
    }
}
