package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TG extends KT {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -59, -64, -63, -53, 124, -45, -67, -49, 124, -54, -63, -46, -63, -50, 124, -52, -50, -63, -52, -67, -50, -63, -64};
    }

    public TG(P3 p32) {
        this.A00 = p32;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        z10 = this.A00.A03;
        if (!z10) {
            this.A00.A0I(A00(0, 24, 12));
        }
    }
}
