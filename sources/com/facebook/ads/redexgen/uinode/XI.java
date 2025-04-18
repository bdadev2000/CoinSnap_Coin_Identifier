package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class XI implements InterfaceC0524Cl, C1 {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ XH A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j3) {
        int A0B = IF.A0B(this.A02, this.A04.A04(j3), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C2 c22 = new C2(A03, this.A00 + this.A03[A0B]);
        if (A03 < j3) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new C0(c22, new C2(this.A04.A03(jArr[A0B + 1]), this.A00 + this.A03[A0B + 1]));
            }
        }
        return new C0(c22);
    }

    public XI(XH xh2) {
        this.A04 = xh2;
    }

    public final void A00(long j3) {
        this.A00 = j3;
    }

    public final void A01(C0651Hz c0651Hz) {
        c0651Hz.A0Z(1);
        int length = c0651Hz.A0G();
        int i10 = length / 18;
        this.A02 = new long[i10];
        this.A03 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A02[i11] = c0651Hz.A0L();
            this.A03[i11] = c0651Hz.A0L();
            c0651Hz.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0524Cl
    public final C1 A4m() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        C0638Hm c0638Hm;
        c0638Hm = this.A04.A01;
        return c0638Hm.A01();
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0524Cl
    public final long AEI(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        long j3 = this.A01;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0524Cl
    public final long AGX(long j3) {
        long A04 = this.A04.A04(j3);
        long granule = this.A02[IF.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
