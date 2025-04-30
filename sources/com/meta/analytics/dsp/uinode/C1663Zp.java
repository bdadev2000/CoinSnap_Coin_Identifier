package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1663Zp implements InterfaceC09004m {
    public static byte[] A04;
    public static String[] A05 = {"yYJ6SOT3uDFyj2TBTti7WWfRsn28EaA0", "ibfMp1J9gSZsYrxVf4NvaZx8D9JO1QBg", "rjgnGVcZwB7yGoiyculy9B4zYqmoHpCR", "", "BFeMqfRovMahqpkErO60kJAdny9RRdno", "ZwvbtEc0kmFFJCTTqnK3GQ6ySyfI7Whf", "3RaP0tr92GxZHPCEm9", "lHI5DV8"};
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-87, -66, -42, -52, -46, -47, 125, -51, -52, -48, -58, -47, -58, -52, -53, -48, 125, -54, -46, -48, -47, 125, -65, -62, 125, -53, -52, -53, -118, -53, -62, -60, -66, -47, -58, -45, -62, -60, -35, -20, -39, -32, -108, -40, -35, -25, -24, -43, -30, -41, -39, -108, -31, -23, -25, -24, -108, -42, -39, -108, -30, -29, -30, -95, -30, -39, -37, -43, -24, -35, -22, -39};
    }

    static {
        A01();
    }

    public final void A02() {
        int[] iArr = this.A03;
        if (iArr != null) {
            if (A05[7].length() != 7) {
                throw new RuntimeException();
            }
            A05[7] = "V5jR13F";
            Arrays.fill(iArr, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i9, int i10) {
        this.A01 = i9;
        this.A02 = i10;
    }

    public final void A04(C1119Eb c1119Eb, boolean z8) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC09024o abstractC09024o = c1119Eb.A06;
        if (c1119Eb.A04 != null && abstractC09024o != null && abstractC09024o.A1U()) {
            if (z8) {
                boolean A0B = c1119Eb.A00.A0B();
                String[] strArr = A05;
                if (strArr[0].charAt(30) != strArr[5].charAt(30)) {
                    A05[7] = "b5aEeD0";
                    if (!A0B) {
                        abstractC09024o.A1r(c1119Eb.A04.A0E(), this);
                    }
                }
                throw new RuntimeException();
            }
            if (!c1119Eb.A1p()) {
                abstractC09024o.A1q(this.A01, this.A02, c1119Eb.A0s, this);
            }
            int i9 = this.A00;
            int i10 = abstractC09024o.A00;
            String[] strArr2 = A05;
            if (strArr2[3].length() != strArr2[6].length()) {
                A05[7] = "TjVTm35";
                if (i9 > i10) {
                    abstractC09024o.A00 = this.A00;
                    abstractC09024o.A08 = z8;
                    c1119Eb.A0r.A0O();
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A05(int i9) {
        if (this.A03 != null) {
            int i10 = this.A00 * 2;
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int count = this.A03[i11];
                if (count == i9) {
                    String[] strArr = A05;
                    String str = strArr[0];
                    String str2 = strArr[5];
                    int i12 = str.charAt(30);
                    int count2 = str2.charAt(30);
                    if (i12 == count2) {
                        throw new RuntimeException();
                    }
                    A05[2] = "SVfMGWcG5IEJEA83X9P3956xbutBXkdM";
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09004m
    public final void A3S(int i9, int i10) {
        if (i9 >= 0) {
            if (i10 >= 0) {
                int i11 = this.A00 * 2;
                int[] iArr = this.A03;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.A03 = iArr2;
                    Arrays.fill(iArr2, -1);
                } else {
                    int storagePosition = iArr.length;
                    if (i11 >= storagePosition) {
                        int[] iArr3 = this.A03;
                        int storagePosition2 = i11 * 2;
                        int[] iArr4 = new int[storagePosition2];
                        this.A03 = iArr4;
                        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                    }
                }
                int[] iArr5 = this.A03;
                iArr5[i11] = i9;
                int storagePosition3 = i11 + 1;
                iArr5[storagePosition3] = i10;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 33));
        }
        throw new IllegalArgumentException(A00(0, 37, 10));
    }
}
