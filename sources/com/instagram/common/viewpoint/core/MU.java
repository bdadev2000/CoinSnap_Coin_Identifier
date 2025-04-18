package com.instagram.common.viewpoint.core;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class MU implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ CI A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -125, -106, -121, -121, -122, -109, -122, -123, UnsignedBytes.MAX_POWER_OF_TWO, -124, -115, -118, -124, -116, UnsignedBytes.MAX_POWER_OF_TWO, -126, -121, -107, -122, -109, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -115, -126, -102};
    }

    public MU(CI ci) {
        this.A00 = ci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
