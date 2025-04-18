package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1001Vt extends H4 {
    public static byte[] A01;
    public final String A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{120, -99, -91, -112, -101, -104, -109, 79, -110, -98, -99, -93, -108, -99, -93, 79, -93, -88, -97, -108, 105, 79};
    }

    public C1001Vt(String str, C0625Gy c0625Gy) {
        super(A00(0, 22, 24) + str, c0625Gy, 1);
        this.A00 = str;
    }
}
