package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C0676Jb A01;

    public ZD(ZA za2, C0676Jb c0676Jb) {
        this.A00 = za2;
        this.A01 = c0676Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        C03595m c03595m;
        C03595m c03595m2;
        c03595m = this.A00.A00;
        if (c03595m.A00() != null) {
            c03595m2 = this.A00.A00;
            c03595m2.A00().onAdError(L1.A00(this.A01));
        }
    }
}
