package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09787y {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-119, -77, -55, -57, -37, -51, -50, -38, -59, -53, -34, -55, -53, -42, -38, -49, -43, -44, 59, 60, 41, 43, 51, 60, 58, 41, 43, 45};
    }

    public C09787y(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public C09787y(String str, Map<String, String> map, boolean z8) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z8 ? A00(1, 1, 50) : A00(0, 1, 9);
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(18, 10, 120), this.A01);
        hashMap.put(A00(2, 16, 22), this.A00);
        Map<String, String> data = this.A02;
        hashMap.putAll(data);
        return hashMap;
    }
}
