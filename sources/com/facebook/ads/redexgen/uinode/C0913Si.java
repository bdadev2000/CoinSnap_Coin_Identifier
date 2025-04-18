package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0913Si extends KT {
    public static byte[] A02;
    public final /* synthetic */ C9Q A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C0913Si(C9Q c9q, AnonymousClass93 anonymousClass93) {
        this.A00 = c9q;
        this.A01 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        SA sa2;
        SA sa3;
        sa2 = this.A00.A0B;
        if (sa2.getState() == RB.A02) {
            sa3 = this.A00.A0B;
            if (sa3.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
