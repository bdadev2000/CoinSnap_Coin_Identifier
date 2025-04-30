package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UH implements L8 {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public UH(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        boolean z8;
        boolean z9;
        z8 = this.A00.A0A;
        if (!z8) {
            z9 = this.A00.A09;
            if (!z9) {
                this.A00.A0U(false, A00(0, 9, 108));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
    }
}
