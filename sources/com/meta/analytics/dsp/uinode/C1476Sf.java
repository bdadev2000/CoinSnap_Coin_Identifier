package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1476Sf extends KT {
    public static byte[] A01;
    public final /* synthetic */ C9Q A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 87, 68, 87, 64, Ascii.DC2, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C1476Sf(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        z8 = this.A00.A07;
        if (!z8) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
