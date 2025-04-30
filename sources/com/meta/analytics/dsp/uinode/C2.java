package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C2 {
    public static byte[] A02;
    public static final C2 A03;
    public final long A00;
    public final long A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 126, 46, 49, 45, 55, 42, 55, 49, 48, 99, 50, Ascii.GS, 0, 4, Ascii.FF, 60, Ascii.SUB, 84, 102};
    }

    static {
        A01();
        A03 = new C2(0L, 0L);
    }

    public C2(long j7, long j9) {
        this.A01 = j7;
        this.A00 = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2 c22 = (C2) obj;
        return this.A01 == c22.A01 && this.A00 == c22.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 83) + this.A01 + A00(0, 11, 100) + this.A00 + A00(19, 1, 1);
    }
}
