package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class XI implements InterfaceC1090Cl, C1 {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ XH A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        int A0B = IF.A0B(this.A02, this.A04.A04(j7), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C2 c22 = new C2(A03, this.A00 + this.A03[A0B]);
        if (A03 < j7) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new C0(c22, new C2(this.A04.A03(jArr[A0B + 1]), this.A00 + this.A03[A0B + 1]));
            }
        }
        return new C0(c22);
    }

    public XI(XH xh) {
        this.A04 = xh;
    }

    public final void A00(long j7) {
        this.A00 = j7;
    }

    public final void A01(C1217Hz c1217Hz) {
        c1217Hz.A0Z(1);
        int length = c1217Hz.A0G();
        int i9 = length / 18;
        this.A02 = new long[i9];
        this.A03 = new long[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.A02[i10] = c1217Hz.A0L();
            this.A03[i10] = c1217Hz.A0L();
            c1217Hz.A0Z(2);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    public final C1 A4m() {
        return this;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        C1204Hm c1204Hm;
        c1204Hm = this.A04.A01;
        return c1204Hm.A01();
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    public final long AEI(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        long j7 = this.A01;
        if (j7 < 0) {
            return -1L;
        }
        long j9 = -(j7 + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    public final long AGX(long j7) {
        long A04 = this.A04.A04(j7);
        long granule = this.A02[IF.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
