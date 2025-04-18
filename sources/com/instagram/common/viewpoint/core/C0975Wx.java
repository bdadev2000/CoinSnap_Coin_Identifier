package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0975Wx extends H9 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 34, 52, 55, 40, 41, 52, 34, 103, 36, 40, 35, 34, 125, 103};
    }

    public C0975Wx(int i2, Map<String, List<String>> map, H3 h3) {
        super(A00(0, 15, 77) + i2, h3, 1);
        this.A00 = i2;
        this.A01 = map;
    }
}
