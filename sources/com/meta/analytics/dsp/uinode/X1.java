package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X1 implements InterfaceC1100Cy {
    public static byte[] A0E;
    public static String[] A0F = {"FmtBUqGmzQvxm47AtoGl5GE", "5iXLyJPyDLcaPMUjk1v5bxBpoPhfo", "hif1Xiw3z0OLVixA8K1yUZiszA96", "VzETX2BwbL5Y", "rXQDE7FzOjIY2cTlxG1EbFIaNFkq3NBz", "hyxBaGmEw9nsGl9VO3HFyZpkQthqrgGl", "hfnp76HvDzKR", "cXQxcUyRSwddwq1B1B5vUbLw26Cn"};
    public long A00;
    public long A01;
    public C4 A02;
    public D2 A03;
    public String A04;
    public boolean A05;
    public final D7 A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final D4 A08 = new D4(7, 128);
    public final D4 A06 = new D4(8, 128);
    public final D4 A07 = new D4(6, 128);
    public final C1217Hz A0A = new C1217Hz();

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    static {
        A01();
    }

    public X1(D7 d72, boolean z8, boolean z9) {
        this.A09 = d72;
        this.A0B = z8;
        this.A0C = z9;
    }

    private void A02(long j7, int i9, int i10, long j9) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i10);
            this.A06.A04(i10);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C1212Hu spsData = AbstractC1213Hv.A06(this.A08.A01, 3, this.A08.A00);
                    C1211Ht A05 = AbstractC1213Hv.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5n(Format.A03(this.A04, A00(0, 9, 18), null, -1, -1, spsData.A06, spsData.A02, -1.0f, arrayList, -1, spsData.A00, null));
                    this.A05 = true;
                    this.A03.A05(spsData);
                    this.A03.A04(A05);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(AbstractC1213Hv.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(AbstractC1213Hv.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i10)) {
            D4 d42 = this.A07;
            String[] strArr = A0F;
            if (strArr[4].charAt(26) == strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "MYiVFEqyRoVR8PpaQvBVtWO0d80axIUe";
            strArr2[5] = "WESehlM6UD3i8IXgr5ZdByrcv93bSxFf";
            int unescapedLength = AbstractC1213Hv.A02(d42.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j9, this.A0A);
        }
        this.A03.A02(j7, i9);
    }

    private void A03(long j7, int i9, long j9) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i9);
            this.A06.A01(i9);
        }
        this.A07.A01(i9);
        this.A03.A03(j7, i9, j9);
    }

    private void A04(byte[] bArr, int i9, int i10) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i9, i10);
            this.A06.A02(bArr, i9, i10);
        }
        this.A07.A02(bArr, i9, i10);
        this.A03.A06(bArr, i9, i10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4R(C1217Hz c1217Hz) {
        int offset;
        int A06 = c1217Hz.A06();
        int A07 = c1217Hz.A07();
        byte[] bArr = c1217Hz.A00;
        long j7 = this.A01;
        int offset2 = c1217Hz.A04();
        this.A01 = j7 + offset2;
        C4 c42 = this.A02;
        int offset3 = c1217Hz.A04();
        c42.AFR(c1217Hz, offset3);
        while (true) {
            int A04 = AbstractC1213Hv.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = AbstractC1213Hv.A01(bArr, A04);
            int i9 = A04 - A06;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "lQl99M6qnQlq";
            strArr2[6] = "jJKIbaSVKHql";
            if (i9 > 0) {
                A04(bArr, A06, A04);
            }
            int i10 = A07 - A04;
            long j9 = this.A01 - i10;
            if (i9 < 0) {
                offset = -i9;
                String[] strArr3 = A0F;
                if (strArr3[7].length() != strArr3[2].length()) {
                    String[] strArr4 = A0F;
                    strArr4[7] = "CFaupTF247UissJwn80OFqAOj9Vx";
                    strArr4[2] = "5OzpI30ijAeJlsq8Y1OyIdlDADpj";
                } else {
                    String[] strArr5 = A0F;
                    strArr5[1] = "eqTKDwhJaRXE4qM7uaf5ert1lQX8N";
                    strArr5[0] = "XXULpdZ36j09HmRAAM7fCX7";
                }
            } else {
                offset = 0;
            }
            A02(j9, i10, offset, this.A00);
            A03(j9, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4p(InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        dc.A05();
        this.A04 = dc.A04();
        C4 AGi = interfaceC1076Bu.AGi(dc.A03(), 2);
        this.A02 = AGi;
        this.A03 = new D2(AGi, this.A0B, this.A0C);
        this.A09.A03(interfaceC1076Bu, dc);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADt(long j7, boolean z8) {
        this.A00 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void AFg() {
        AbstractC1213Hv.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
