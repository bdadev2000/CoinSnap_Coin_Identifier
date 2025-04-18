package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0842Pp {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1G A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, Ascii.FF, 10, Ascii.ESC, Ascii.CR, Ascii.DC2, Ascii.ETB, Ascii.CR};
    }

    public C0842Pp(int i10, int i11, C1G c1g) {
        this.A01 = i10;
        this.A00 = i11;
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
