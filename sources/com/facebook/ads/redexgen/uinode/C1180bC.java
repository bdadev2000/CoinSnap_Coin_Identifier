package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1180bC extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1179bB A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1180bC(C1179bB c1179bB) {
        this.A00 = c1179bB;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1070Yn c1070Yn;
        NY ny;
        C1181bD c1181bD;
        c1070Yn = this.A00.A02;
        c1070Yn.A0E().AH4();
        ny = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c1181bD = this.A00.A00;
        ny.loadUrl(append.append(c1181bD.A03()).toString());
    }
}
