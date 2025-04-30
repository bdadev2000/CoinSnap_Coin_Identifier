package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TG extends KT {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -59, -64, -63, -53, 124, -45, -67, -49, 124, -54, -63, -46, -63, -50, 124, -52, -50, -63, -52, -67, -50, -63, -64};
    }

    public TG(P3 p32) {
        this.A00 = p32;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        z8 = this.A00.A03;
        if (!z8) {
            this.A00.A0I(A00(0, 24, 12));
        }
    }
}
