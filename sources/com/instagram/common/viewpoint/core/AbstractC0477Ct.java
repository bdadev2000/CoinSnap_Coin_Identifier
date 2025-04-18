package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0477Ct {
    public static String[] A0D = {"4sB", "4D1DWBgJZiBViwZnGmt2ByWkRprHhpuN", "gQxDIdQCIY8vfaa60xk6NebO", "KlEKQoHUYHnVYbWdbbrUbqdXanEvwJey", "Vgi", "EjA", "c6RE6lR1BbmyrfXfshORHVWXlBaSCNUD", "Oj5QC3LAwof"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC0457Bz A06;
    public C9 A07;
    public InterfaceC0474Cq A08;
    public C0476Cs A09;
    public boolean A0A;
    public boolean A0B;
    public final C0472Co A0C = new C0472Co();

    public abstract long A07(I4 i4);

    public abstract boolean A0A(I4 i4, long j2, C0476Cs c0476Cs) throws IOException, InterruptedException;

    private int A00(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        boolean z2 = true;
        while (z2) {
            boolean readingHeaders = this.A0C.A05(interfaceC0456By);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC0456By.A86() - this.A04;
            z2 = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z2) {
                this.A04 = interfaceC0456By.A86();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A69(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (interfaceC0456By.A7g() == -1) {
            this.A08 = new YI();
        } else {
            C0473Cp firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new YO(this.A04, interfaceC0456By.A7g(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        long AEl = this.A08.AEl(interfaceC0456By);
        if (AEl >= 0) {
            c4.A00 = AEl;
            return 1;
        }
        if (AEl < -1) {
            A08(-(2 + AEl));
        }
        if (!this.A0B) {
            this.A06.AG8(this.A08.A58());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC0456By)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        I4 A02 = this.A0C.A02();
        long granulesInPacket = A07(A02);
        if (granulesInPacket >= 0) {
            long j2 = this.A02 + granulesInPacket;
            long position = this.A05;
            String[] strArr = A0D;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0D[2] = "tkdh02BFbCmE16kBlmpbWsReDLdmp4";
            if (j2 >= position) {
                long position2 = this.A02;
                long A03 = A03(position2);
                this.A07.AFv(A02, A02.A07());
                this.A07.AFw(A03, 1, A02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += granulesInPacket;
        return 0;
    }

    public final int A02(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        switch (this.A01) {
            case 0:
                return A00(interfaceC0456By);
            case 1:
                interfaceC0456By.AGq((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC0456By, c4);
            default:
                throw new IllegalStateException();
        }
    }

    public final long A03(long j2) {
        return (1000000 * j2) / this.A00;
    }

    public final long A04(long j2) {
        return (this.A00 * j2) / 1000000;
    }

    public final void A05(long j2, long j3) {
        this.A0C.A03();
        if (j2 == 0) {
            A09(!this.A0B);
            return;
        }
        int i2 = this.A01;
        if (A0D[3].charAt(0) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[6] = "vHhb77yLnULgrCT5zUPvEHWgwFYyoY87";
        strArr[1] = "aks3HGgyr08vyLjUiSSy9kWjl3bsOMrH";
        if (i2 == 0) {
            return;
        }
        this.A05 = this.A08.AGy(j3);
        this.A01 = 2;
    }

    public final void A06(InterfaceC0457Bz interfaceC0457Bz, C9 c9) {
        this.A06 = interfaceC0457Bz;
        this.A07 = c9;
        A09(true);
    }

    public void A08(long j2) {
        this.A02 = j2;
    }

    public void A09(boolean z2) {
        if (z2) {
            this.A09 = new C0476Cs();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
        String[] strArr = A0D;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0D[2] = "W7PBNvrcPf";
    }
}
