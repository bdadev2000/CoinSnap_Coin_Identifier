package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1741b7 implements InterfaceC1348Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1740b6 A01;
    public final /* synthetic */ V2 A02;

    public C1741b7(AbstractC1740b6 abstractC1740b6, int i9, V2 v22) {
        this.A01 = abstractC1740b6;
        this.A00 = i9;
        this.A02 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1348Nh
    public final void ABh(boolean z8) {
        RD rd;
        if (this.A00 == 0) {
            V2 v22 = this.A02;
            rd = this.A01.A04;
            v22.A1Z(rd);
        }
        this.A02.A1c(z8, true);
    }
}
