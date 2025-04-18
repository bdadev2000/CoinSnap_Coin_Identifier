package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0881Tg extends KY {
    public static byte[] A01;
    public final /* synthetic */ C03839a A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{103, 88, 85, 84, 94, 17, 70, 80, 66, 17, 95, 84, 71, 84, 67, 17, 65, 67, 84, 65, 80, 67, 84, 85};
    }

    public C0881Tg(C03839a c03839a) {
        this.A00 = c03839a;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        z2 = this.A00.A0D;
        if (!z2) {
            this.A00.A0M(A00(0, 24, 24));
        }
    }
}
