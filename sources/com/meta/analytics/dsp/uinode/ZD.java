package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C1242Jb A01;

    public ZD(ZA za, C1242Jb c1242Jb) {
        this.A00 = za;
        this.A01 = c1242Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        C09255m c09255m;
        C09255m c09255m2;
        c09255m = this.A00.A00;
        if (c09255m.A00() != null) {
            c09255m2 = this.A00.A00;
            c09255m2.A00().onAdError(L1.A00(this.A01));
        }
    }
}
