package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0910Sf extends KT {
    public static byte[] A01;
    public final /* synthetic */ C9Q A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 87, 68, 87, 64, Ascii.DC2, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C0910Sf(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        z10 = this.A00.A07;
        if (!z10) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
