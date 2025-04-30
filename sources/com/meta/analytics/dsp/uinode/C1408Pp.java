package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1408Pp {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1G A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, Ascii.FF, 10, Ascii.ESC, Ascii.CR, Ascii.DC2, Ascii.ETB, Ascii.CR};
    }

    public C1408Pp(int i9, int i10, C1G c1g) {
        this.A01 = i9;
        this.A00 = i10;
        this.A02 = c1g;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1G A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap hashMap = new HashMap();
        StringBuilder append = new StringBuilder().append(this.A01);
        String A00 = A00(0, 0, 12);
        hashMap.put(A00(7, 7, 94), append.append(A00).toString());
        hashMap.put(A00(0, 7, 55), this.A00 + A00);
        return hashMap;
    }
}
