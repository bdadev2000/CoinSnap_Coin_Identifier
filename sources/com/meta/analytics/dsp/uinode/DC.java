package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DC {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{Ascii.FF, Ascii.CAN, Ascii.SUB, 17, Ascii.SUB, Ascii.CR, Ascii.RS, Ascii.VT, Ascii.SUB, 49, Ascii.SUB, 8, 54, Ascii.ESC, 87, 86, 95, Ascii.DC2, 10, Ascii.FF, Ascii.VT, 95, Ascii.GS, Ascii.SUB, 95, Ascii.FS, Ascii.RS, 19, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.GS, Ascii.SUB, Ascii.EM, Ascii.DLE, Ascii.CR, Ascii.SUB, 95, Ascii.CR, Ascii.SUB, Ascii.VT, Ascii.CR, Ascii.SYN, Ascii.SUB, 9, Ascii.SYN, 17, Ascii.CAN, 95, Ascii.SYN, Ascii.ESC, Ascii.FF, 81};
    }

    public DC(int i9, int i10) {
        this(Integer.MIN_VALUE, i9, i10);
    }

    public DC(int i9, int i10, int i11) {
        this.A04 = i9 != Integer.MIN_VALUE ? i9 + A00(0, 1, 31) : A00(0, 0, 77);
        this.A02 = i10;
        this.A03 = i11;
        this.A00 = Integer.MIN_VALUE;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 67));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        int i9 = this.A00;
        this.A00 = i9 == Integer.MIN_VALUE ? this.A02 : i9 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
