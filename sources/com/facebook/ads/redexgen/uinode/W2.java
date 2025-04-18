package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0613Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0612Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0612Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, Ascii.CAN, 5, Ascii.CR, Ascii.CAN, Ascii.RS, 9, Ascii.CAN, Ascii.EM, 93, Ascii.FS, 17, 17, Ascii.DC2, Ascii.RS, Ascii.FS, 9, Ascii.DC4, Ascii.DC2, 19, 71, 93};
    }

    public W2(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public W2(boolean z10, int i10, int i11) {
        AbstractC0626Ha.A03(i10 > 0);
        AbstractC0626Ha.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C0612Gl[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C0612Gl(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0612Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0613Gm
    public final synchronized C0612Gl A3X() {
        C0612Gl c0612Gl;
        this.A00++;
        int i10 = this.A01;
        if (i10 > 0) {
            C0612Gl[] c0612GlArr = this.A03;
            int i11 = i10 - 1;
            this.A01 = i11;
            c0612Gl = c0612GlArr[i11];
            c0612GlArr[i11] = null;
        } else {
            c0612Gl = new C0612Gl(new byte[this.A04], 0);
        }
        return c0612Gl;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0613Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0613Gm
    public final synchronized void AEW(C0612Gl c0612Gl) {
        C0612Gl[] c0612GlArr = this.A07;
        c0612GlArr[0] = c0612Gl;
        AEX(c0612GlArr);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0613Gm
    public final synchronized void AEX(C0612Gl[] c0612GlArr) {
        int i10 = this.A01;
        int length = c0612GlArr.length + i10;
        C0612Gl[] c0612GlArr2 = this.A03;
        if (length >= c0612GlArr2.length) {
            this.A03 = (C0612Gl[]) Arrays.copyOf(c0612GlArr2, Math.max(c0612GlArr2.length * 2, i10 + c0612GlArr.length));
        }
        for (C0612Gl c0612Gl : c0612GlArr) {
            if (c0612Gl.A01 == this.A06 || c0612Gl.A01.length == this.A04) {
                C0612Gl[] c0612GlArr3 = this.A03;
                int i11 = this.A01;
                this.A01 = i11 + 1;
                c0612GlArr3[i11] = c0612Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0612Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0612Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0612GlArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0613Gm
    public final synchronized void AGj() {
        int A04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, A04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i10 = targetAvailableCount - 1;
            while (lowIndex <= i10) {
                C0612Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0612Gl lowAllocation = this.A03[i10];
                    if (lowAllocation.A01 != this.A06) {
                        i10--;
                    } else {
                        C0612Gl[] c0612GlArr = this.A03;
                        c0612GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i10 - 1;
                        c0612GlArr[i10] = highAllocation;
                        i10 = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
