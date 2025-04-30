package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class MF implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC1064Bi A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 56, 46, 57, Ascii.DC4, 41, 62, 45, 45, 46, 57, 46, 47, Ascii.DC4, 40, 39, 34, 40, 32, Ascii.DC4, 42, 45, 63, 46, 57, Ascii.DC4, 47, 46, 39, 42, 50};
    }

    public MF(ViewOnClickListenerC1064Bi viewOnClickListenerC1064Bi) {
        this.A00 = viewOnClickListenerC1064Bi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 125));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
