package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class ZC extends KG {
    public final /* synthetic */ ZB A00;

    public ZC(ZB zb) {
        this.A00 = zb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        C09255m c09255m;
        C09255m c09255m2;
        c09255m = this.A00.A01.A00;
        if (c09255m.A00() != null) {
            c09255m2 = this.A00.A01.A00;
            c09255m2.A00().onAdsLoaded();
        }
    }
}
