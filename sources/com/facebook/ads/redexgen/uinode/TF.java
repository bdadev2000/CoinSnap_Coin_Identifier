package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TF extends KT {
    public static byte[] A02;
    public final /* synthetic */ P3 A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public TF(P3 p32, AnonymousClass93 anonymousClass93) {
        this.A00 = p32;
        this.A01 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        SA sa2;
        SA sa3;
        sa2 = this.A00.A0D;
        if (sa2.getState() == RB.A02) {
            sa3 = this.A00.A0D;
            if (sa3.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
