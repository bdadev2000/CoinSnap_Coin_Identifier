package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1222bs {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 4, 9, 1, -2, 3, -61, -1, Ascii.VT, 2, -61, -5, 10, 3, -8, 9, -2, 4, 3, 8, -61};
    }

    public final String A02(GL gl) {
        String obj = gl.getClass().getGenericInterfaces()[0].toString();
        String A002 = A00(0, 21, 47);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final String A03(AbstractC03856o abstractC03856o) {
        return A02(abstractC03856o);
    }
}
