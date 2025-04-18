package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class QK {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1F A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{89, 91, 72, 94, 89, 84, 78, 7, 5, 22, 0, 13, 10, 0};
    }

    public QK(int i2, int i3, C1F c1f) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = c1f;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1F A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap hashMap = new HashMap();
        StringBuilder append = new StringBuilder().append(this.A01);
        String A00 = A00(0, 0, 41);
        hashMap.put(A00(7, 7, 20), append.append(A00).toString());
        hashMap.put(A00(0, 7, 74), this.A00 + A00);
        return hashMap;
    }
}
