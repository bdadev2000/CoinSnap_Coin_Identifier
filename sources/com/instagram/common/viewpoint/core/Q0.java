package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Q0 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A7 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public Q0(A7 a7) {
        this.A00 = a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q4 q4;
        if (KQ.A02(this)) {
            return;
        }
        try {
            q4 = this.A00.A00.A0X;
            q4.AE0(A00(0, 18, 75));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
