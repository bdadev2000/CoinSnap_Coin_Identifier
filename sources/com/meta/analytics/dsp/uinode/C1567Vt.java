package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1567Vt extends H4 {
    public static byte[] A01;
    public final String A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{120, -99, -91, -112, -101, -104, -109, 79, -110, -98, -99, -93, -108, -99, -93, 79, -93, -88, -97, -108, 105, 79};
    }

    public C1567Vt(String str, C1191Gy c1191Gy) {
        super(A00(0, 22, 24) + str, c1191Gy, 1);
        this.A00 = str;
    }
}
