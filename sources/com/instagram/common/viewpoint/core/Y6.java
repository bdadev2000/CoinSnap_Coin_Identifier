package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class Y6 implements D3 {
    public static byte[] A0E;
    public long A00;
    public long A01;
    public C9 A02;
    public D7 A03;
    public String A04;
    public boolean A05;
    public final DC A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final D9 A08 = new D9(7, 128);
    public final D9 A06 = new D9(8, 128);
    public final D9 A07 = new D9(6, 128);
    public final I4 A0A = new I4();

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{54, 41, 36, 37, 47, 111, 33, 54, 35};
    }

    public Y6(DC dc, boolean z2, boolean z3) {
        this.A09 = dc;
        this.A0B = z2;
        this.A0C = z3;
    }

    private void A02(long j2, int i2, int i3, long j3) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i3);
            this.A06.A04(i3);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C0596Hz A06 = I0.A06(this.A08.A01, 3, this.A08.A00);
                    C0595Hy ppsData = I0.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A69(Format.A03(this.A04, A00(0, 9, Opcodes.LSHL), null, -1, -1, A06.A06, A06.A02, -1.0f, arrayList, -1, A06.A00, null));
                    this.A05 = true;
                    this.A03.A05(A06);
                    this.A03.A04(ppsData);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(I0.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(I0.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i3)) {
            int unescapedLength = I0.A02(this.A07.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j3, this.A0A);
        }
        this.A03.A02(j2, i2);
    }

    private void A03(long j2, int i2, long j3) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i2);
            this.A06.A01(i2);
        }
        this.A07.A01(i2);
        this.A03.A03(j2, i2, j3);
    }

    private void A04(byte[] bArr, int i2, int i3) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i2, i3);
            this.A06.A02(bArr, i2, i3);
        }
        this.A07.A02(bArr, i2, i3);
        this.A03.A06(bArr, i2, i3);
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A4n(I4 i4) {
        int A06 = i4.A06();
        int A07 = i4.A07();
        byte[] bArr = i4.A00;
        long j2 = this.A01;
        int offset = i4.A04();
        this.A01 = j2 + offset;
        C9 c9 = this.A02;
        int offset2 = i4.A04();
        c9.AFv(i4, offset2);
        while (true) {
            int A04 = I0.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = I0.A01(bArr, A04);
            int i2 = A04 - A06;
            if (i2 > 0) {
                A04(bArr, A06, A04);
            }
            int i3 = A07 - A04;
            long j3 = this.A01 - i3;
            int offset3 = i2 < 0 ? -i2 : 0;
            A02(j3, i3, offset3, this.A00);
            A03(j3, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A5B(InterfaceC0457Bz interfaceC0457Bz, DH dh) {
        dh.A05();
        this.A04 = dh.A04();
        this.A02 = interfaceC0457Bz.AHA(dh.A03(), 2);
        this.A03 = new D7(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC0457Bz, dh);
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEL() {
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEM(long j2, boolean z2) {
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AG6() {
        I0.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
