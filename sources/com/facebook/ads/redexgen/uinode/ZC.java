package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZC extends KG {
    public final /* synthetic */ ZB A00;

    public ZC(ZB zb2) {
        this.A00 = zb2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        C03595m c03595m;
        C03595m c03595m2;
        c03595m = this.A00.A01.A00;
        if (c03595m.A00() != null) {
            c03595m2 = this.A00.A01.A00;
            c03595m2.A00().onAdsLoaded();
        }
    }
}
