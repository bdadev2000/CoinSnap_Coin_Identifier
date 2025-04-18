package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PS implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
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
        InterfaceC0830Pd interfaceC0830Pd;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0830Pd = this.A00.A00.A0F;
            interfaceC0830Pd.ADX(A00(0, 18, 116));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
