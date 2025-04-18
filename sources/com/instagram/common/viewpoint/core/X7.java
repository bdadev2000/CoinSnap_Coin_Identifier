package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC0562Gr {
    public static byte[] A08;
    public static String[] A09 = {"uCIHf2uPFSpN7s394GB", "bw9U9dL", "AAvtM4z7IZvGS3xiAGY", "RwMjBWFP3sqBY", "V8vFz2NVX1z2e3auyeYyWjFvf7xuik3z", "MjYG2pSQFtH7G", "DfS2nPoTWNflTHew7ejwtivrUd6Et1b1", "Z7pxnQFdOkAG9OVyKKW5ogdy9zcWk7rj"};
    public int A00;
    public int A01;
    public int A02;
    public C0561Gq[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0561Gq[] A07;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[0] = "UrFOZG2CNzDWALsIN7J";
            strArr[2] = "hMYy47mgqrPq4T1YTM5";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 42);
            i5++;
        }
    }

    public static void A01() {
        A08 = new byte[]{-60, -72, -61, -36, -45, -26, -34, -45, -47, -30, -45, -46, -114, -49, -38, -38, -35, -47, -49, -30, -41, -35, -36, -88, -114};
    }

    static {
        A01();
    }

    public X7(boolean z2, int i2) {
        this(z2, i2, 0);
    }

    public X7(boolean z2, int i2, int i3) {
        AbstractC0576Hf.A03(i2 > 0);
        AbstractC0576Hf.A03(i3 >= 0);
        this.A05 = z2;
        this.A04 = i2;
        this.A01 = i3;
        this.A03 = new C0561Gq[i3 + 100];
        if (i3 > 0) {
            this.A06 = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.A03[i4] = new C0561Gq(this.A06, i4 * i2);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0561Gq[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i2) {
        boolean targetBufferSizeReduced = i2 < this.A02;
        this.A02 = i2;
        if (targetBufferSizeReduced) {
            AHB();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0562Gr
    public final synchronized C0561Gq A3t() {
        C0561Gq c0561Gq;
        this.A00++;
        if (this.A01 > 0) {
            C0561Gq[] c0561GqArr = this.A03;
            int i2 = this.A01 - 1;
            this.A01 = i2;
            c0561Gq = c0561GqArr[i2];
            this.A03[this.A01] = null;
        } else {
            c0561Gq = new C0561Gq(new byte[this.A04], 0);
        }
        return c0561Gq;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0562Gr
    public final int A7b() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0562Gr
    public final synchronized void AEz(C0561Gq c0561Gq) {
        this.A07[0] = c0561Gq;
        AF0(this.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0562Gr
    public final synchronized void AF0(C0561Gq[] c0561GqArr) {
        if (this.A01 + c0561GqArr.length >= this.A03.length) {
            this.A03 = (C0561Gq[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + c0561GqArr.length));
        }
        for (C0561Gq c0561Gq : c0561GqArr) {
            if (c0561Gq.A01 == this.A06 || c0561Gq.A01.length == this.A04) {
                C0561Gq[] c0561GqArr2 = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                c0561GqArr2[i2] = c0561Gq;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 68) + System.identityHashCode(c0561Gq.A01) + A00(0, 2, 110) + System.identityHashCode(this.A06) + A00(0, 2, 110) + c0561Gq.A01.length + A00(0, 2, 110) + this.A04);
            }
        }
        this.A00 -= c0561GqArr.length;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0562Gr
    public final synchronized void AHB() {
        int A04 = IK.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A04 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C0561Gq highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0561Gq lowAllocation = this.A03[highIndex];
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C0561Gq[] c0561GqArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c0561GqArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
