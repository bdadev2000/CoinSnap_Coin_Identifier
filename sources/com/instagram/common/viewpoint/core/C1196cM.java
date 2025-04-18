package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1196cM extends KY {
    public static byte[] A01;
    public final /* synthetic */ C1195cL A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1196cM(C1195cL c1195cL) {
        this.A00 = c1195cL;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1045Zs c1045Zs;
        AbstractC0743Ny abstractC0743Ny;
        C1197cN c1197cN;
        c1045Zs = this.A00.A03;
        c1045Zs.A0E().AHX();
        abstractC0743Ny = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1197cN = this.A00.A00;
        abstractC0743Ny.loadUrl(append.append(c1197cN.A03()).toString());
    }
}
