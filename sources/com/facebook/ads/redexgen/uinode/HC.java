package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HC extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{94, 68, -86, -61, -70, -51, -59, -70, -72, -55, -70, -71, 117};
    }

    public HC(Throwable th2) {
        super(A00(2, 11, 64) + th2.getClass().getSimpleName() + A00(0, 2, 15) + th2.getMessage(), th2);
    }
}
