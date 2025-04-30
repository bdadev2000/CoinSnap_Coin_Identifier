package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1275Kk implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1636Yn A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public RunnableC1275Kk(C1636Yn c1636Yn) {
        this.A00 = c1636Yn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            C8B otsl = new C8B(A00(0, 4, 88));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A07().A9b(A00(4, 7, 112), C8A.A1Y, otsl);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
