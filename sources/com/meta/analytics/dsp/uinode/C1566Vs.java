package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1566Vs extends H4 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, Ascii.DC2, Ascii.CR, Ascii.FF, 17, 7, 66, 1, Ascii.CR, 6, 7, 88, 66};
    }

    public C1566Vs(int i9, Map<String, List<String>> map, C1191Gy c1191Gy) {
        super(A00(0, 15, 121) + i9, c1191Gy, 1);
        this.A00 = i9;
        this.A01 = map;
    }
}
