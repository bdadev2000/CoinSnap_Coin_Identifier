package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC10008u {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8w A00(C1635Ym c1635Ym) {
        try {
            return new YD(c1635Ym);
        } catch (IOException e4) {
            c1635Ym.A07().A9a(A02(0, 15, 89), C8A.A2K, new C8B(e4));
            return new YG();
        }
    }

    public static EN A01(C1635Ym c1635Ym) {
        return new EN(c1635Ym);
    }
}
