package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0876Tb extends KY {
    public static byte[] A01;
    public final /* synthetic */ C03839a A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{11, 52, 57, 56, 50, 125, 51, 56, 43, 56, 47, 125, 46, 41, 60, 47, 41, 56, 57, 125, 45, 49, 60, 36, 52, 51, 58};
    }

    public C0876Tb(C03839a c03839a) {
        this.A00 = c03839a;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        z2 = this.A00.A0E;
        if (!z2) {
            this.A00.A0M(A00(0, 27, 77));
        }
    }
}
