package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0591Hu {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -68, 15, 5, 22, 1, -68, 5, 15, -68, 41, 78, 86, 65, 76, 73, 68, 0, 73, 78, 68, 69, 88, 0};
    }

    public C0591Hu() {
        this(32);
    }

    public C0591Hu(int i2) {
        this.A01 = new long[i2];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return this.A01[i2];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, Opcodes.LSHL) + i2 + A00(0, 10, 53) + this.A00);
    }

    public final void A04(long j2) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j2;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
