package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0668Lb {
    public static byte[] A02;
    public long A00;
    public long A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-52, -15, -7, -28, -17, -20, -25, -93, -15, -8, -16, -27, -24, -11, -93, -14, -23, -93, -15, -28, -15, -14, -10, -24, -26, -14, -15, -25, -10, -93, -23, -14, -11, -93, -9, -21, -24, -93, -9, -20, -16, -24, -11, -67, -93, -88, -25};
    }

    public C0668Lb(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(0, 47, Opcodes.DREM), Long.valueOf(j2)));
        }
        this.A01 = j2;
        this.A00 = System.nanoTime() + j2;
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03() {
        this.A00 = System.nanoTime() + this.A01;
    }

    public final synchronized void A04() throws InterruptedException {
        while (!A05()) {
            long max = Math.max(this.A00 - System.nanoTime(), 1L);
            wait(max / 1000000, (int) (max % 1000000));
        }
    }

    public final synchronized boolean A05() {
        return System.nanoTime() >= this.A00;
    }
}
