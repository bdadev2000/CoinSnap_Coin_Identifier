package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class XK implements C1 {
    public final /* synthetic */ XJ A00;

    public XK(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        AbstractC1093Co abstractC1093Co;
        long j7;
        abstractC1093Co = this.A00.A0B;
        j7 = this.A00.A07;
        return abstractC1093Co.A03(j7);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long granule) {
        AbstractC1093Co abstractC1093Co;
        long j7;
        long A00;
        long j9;
        if (granule == 0) {
            j9 = this.A00.A09;
            return new C0(new C2(0L, j9));
        }
        abstractC1093Co = this.A00.A0B;
        long A04 = abstractC1093Co.A04(granule);
        XJ xj = this.A00;
        j7 = xj.A09;
        A00 = xj.A00(j7, A04, 30000L);
        return new C0(new C2(granule, A00));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
