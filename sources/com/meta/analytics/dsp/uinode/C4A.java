package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4A {
    public static byte[] A02;
    public static String[] A03 = {"bULQ32o9JJN83aCucFVWf9xMaMFfdsau", "BEVDZxUetTHXZyMQk8onv0fPj1ZBZ1Qa", "0vYpub5LBkfCpAgXclsnPo1", "vVWBcEJQjEsfNalmzVe1r7miASaPIW1B", "LFkzDQh", "g5RhG8eWHWtWI7ENz9qYtKd", "50dEOoYhOQRa91fvkd77j3svvS12NHRj", "eQbNRdF"};
    public long A00 = 0;
    public C4A A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 5);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -34};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C4A();
        }
    }

    public final int A03(int i9) {
        C4A c4a = this.A01;
        if (c4a == null) {
            if (i9 >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i9) - 1));
        }
        if (i9 < 64) {
            return Long.bitCount(this.A00 & ((1 << i9) - 1));
        }
        return c4a.A03(i9 - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        C4A c4a = this.A01;
        if (c4a != null) {
            c4a.A04();
        }
    }

    public final void A05(int i9) {
        if (i9 >= 64) {
            C4A c4a = this.A01;
            if (c4a != null) {
                c4a.A05(i9 - 64);
                return;
            }
            return;
        }
        long j7 = this.A00 & ((1 << i9) ^ (-1));
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "FQtQPqX5zshXn4VmNwTVsnzPJS3Krcw4";
        strArr[3] = "mEVd87EgPvtBoIzzDeJnjIPIOSUL2jIs";
        this.A00 = j7;
    }

    public final void A06(int i9) {
        if (i9 >= 64) {
            A01();
            this.A01.A06(i9 - 64);
        } else {
            this.A00 |= 1 << i9;
        }
    }

    public final void A07(int i9, boolean z8) {
        if (i9 >= 64) {
            A01();
            this.A01.A07(i9 - 64, z8);
            return;
        }
        long j7 = this.A00;
        boolean z9 = (Long.MIN_VALUE & j7) != 0;
        long j9 = (1 << i9) - 1;
        this.A00 = (j7 & j9) | ((j7 & ((-1) ^ j9)) << 1);
        if (z8) {
            A06(i9);
        } else {
            A05(i9);
        }
        if (!z9 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z9);
    }

    public final boolean A08(int i9) {
        if (i9 < 64) {
            return (this.A00 & (1 << i9)) != 0;
        }
        A01();
        return this.A01.A08(i9 - 64);
    }

    public final boolean A09(int i9) {
        if (i9 >= 64) {
            A01();
            return this.A01.A09(i9 - 64);
        }
        long j7 = 1 << i9;
        long j9 = this.A00;
        boolean z8 = (j9 & j7) != 0;
        long j10 = j9 & (j7 ^ (-1));
        this.A00 = j10;
        long j11 = j7 - 1;
        long mask = j10 & j11;
        long before = Long.rotateRight(j10 & ((-1) ^ j11), 1);
        this.A00 = mask | before;
        C4A c4a = this.A01;
        if (c4a != null) {
            if (c4a.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z8;
    }

    public final String toString() {
        if (this.A01 != null) {
            return this.A01.toString() + A00(0, 2, 97) + Long.toBinaryString(this.A00);
        }
        long j7 = this.A00;
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "hJ9KUEYMHtIt6rT1Ez0KfdL";
        strArr[5] = "B6CHA8tZa8vt0H5l4hWvu9Y";
        return Long.toBinaryString(j7);
    }
}
