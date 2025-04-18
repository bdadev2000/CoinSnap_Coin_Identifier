package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HH extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-59, -85, -44, -19, -28, -9, -17, -28, -30, -13, -28, -29, -97};
    }

    public HH(Throwable th) {
        super(A00(2, 11, 104) + th.getClass().getSimpleName() + A00(0, 2, 116) + th.getMessage(), th);
    }
}
