package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1464Rt {
    A04(A01(37, 3, 86)),
    A05(A01(40, 7, 117));

    public static byte[] A01;
    public static String[] A02 = {"kIaQKGqX2ZTqEjvfJkZOl1WwOBoH9uFY", "x", "Fa9eXDyIy4elyWfec912IKE0nqoR5HQV", "", "DfNaQJeOEpNPwVx", "9", "0vF5Kqqkw0y14nBhXHX4F0aBgr7OScbz", ""};
    public String A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.NAK, Ascii.ETB, Ascii.US, -34, 3, Ascii.VT, -10, 1, -2, -7, -75, 8, -6, 7, Ascii.VT, -6, 7, -75, 7, -6, 8, 5, 4, 3, 8, -6, -49, -75, -70, 8, -6, -13, -16, -13, -12, -4, -13, Ascii.GS, Ascii.US, 39, 80, 73, 70, 73, 74, 82, 73};
    }

    static {
        A02();
    }

    EnumC1464Rt(String str) {
        this.A00 = str;
    }

    public static EnumC1464Rt A00(String str) {
        for (EnumC1464Rt enumC1464Rt : valuesCustom()) {
            if (enumC1464Rt.A00.equals(str)) {
                return enumC1464Rt;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 47), str));
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1464Rt[] valuesCustom() {
        EnumC1464Rt[] enumC1464RtArr = (EnumC1464Rt[]) values().clone();
        String[] strArr = A02;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "";
        strArr2[3] = "";
        return enumC1464RtArr;
    }
}
