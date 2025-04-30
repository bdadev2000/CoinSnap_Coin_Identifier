package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1494Sx A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, 63, -19, 61, 63, 50, 61, 46, 63, 50, 49};
    }

    public T0(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        InterfaceC1396Pd interfaceC1396Pd;
        z8 = this.A00.A0S;
        if (!z8) {
            interfaceC1396Pd = this.A00.A0X;
            interfaceC1396Pd.ADX(A00(0, 24, 79));
        }
    }
}
