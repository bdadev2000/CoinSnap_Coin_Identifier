package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PS implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{116, 75, 70, 71, 77, 114, 78, 67, 91, 64, 67, 65, 73, 103, 80, 80, 77, 80};
    }

    public PS(A2 a22) {
        this.A00 = a22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1396Pd interfaceC1396Pd;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1396Pd = this.A00.A00.A0F;
            interfaceC1396Pd.ADX(A00(0, 18, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
