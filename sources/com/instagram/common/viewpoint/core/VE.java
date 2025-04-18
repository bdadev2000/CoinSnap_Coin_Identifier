package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VE implements LG {
    public static byte[] A01;
    public final /* synthetic */ VA A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public VE(VA va) {
        this.A00 = va;
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        boolean z2;
        boolean z3;
        z2 = this.A00.A0C;
        if (!z2) {
            z3 = this.A00.A0B;
            if (!z3) {
                this.A00.A0U(false, A00(0, 9, 80));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
    }
}
