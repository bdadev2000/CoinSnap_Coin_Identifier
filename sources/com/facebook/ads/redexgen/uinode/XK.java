package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class XK implements C1 {
    public final /* synthetic */ XJ A00;

    public XK(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        AbstractC0527Co abstractC0527Co;
        long j3;
        abstractC0527Co = this.A00.A0B;
        j3 = this.A00.A07;
        return abstractC0527Co.A03(j3);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long granule) {
        AbstractC0527Co abstractC0527Co;
        long j3;
        long A00;
        long j10;
        if (granule == 0) {
            j10 = this.A00.A09;
            return new C0(new C2(0L, j10));
        }
        abstractC0527Co = this.A00.A0B;
        long A04 = abstractC0527Co.A04(granule);
        XJ xj = this.A00;
        j3 = xj.A09;
        A00 = xj.A00(j3, A04, 30000L);
        return new C0(new C2(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
