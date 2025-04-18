package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0709Kk implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1070Yn A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public RunnableC0709Kk(C1070Yn c1070Yn) {
        this.A00 = c1070Yn;
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
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
