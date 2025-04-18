package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class TH extends KT {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{5, 58, 55, 54, 60, 115, Base64.padSymbol, 54, 37, 54, 33, 115, 32, 39, 50, 33, 39, 54, 55, 115, 35, 63, 50, 42, 58, Base64.padSymbol, 52};
    }

    public TH(P3 p32) {
        this.A00 = p32;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        z10 = this.A00.A04;
        if (!z10) {
            this.A00.A0I(A00(0, 27, 122));
        }
    }
}
