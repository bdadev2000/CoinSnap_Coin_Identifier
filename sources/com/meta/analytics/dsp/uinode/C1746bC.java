package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1746bC extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1745bB A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1746bC(C1745bB c1745bB) {
        this.A00 = c1745bB;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1636Yn c1636Yn;
        NY ny;
        C1747bD c1747bD;
        c1636Yn = this.A00.A02;
        c1636Yn.A0E().AH4();
        ny = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c1747bD = this.A00.A00;
        ny.loadUrl(append.append(c1747bD.A03()).toString());
    }
}
