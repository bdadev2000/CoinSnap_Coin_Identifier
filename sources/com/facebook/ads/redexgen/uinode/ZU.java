package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdListener;

/* loaded from: assets/audience_network.dex */
public class ZU extends KG {
    public final /* synthetic */ ZQ A00;
    public final /* synthetic */ C0676Jb A01;

    public ZU(ZQ zq, C0676Jb c0676Jb) {
        this.A00 = zq;
        this.A01 = c0676Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.KG
    public final void A01() {
        C5P c5p;
        C5P c5p2;
        C5P c5p3;
        c5p = this.A00.A01;
        if (c5p.A06() != null) {
            c5p2 = this.A00.A01;
            AdListener A06 = c5p2.A06();
            c5p3 = this.A00.A01;
            A06.onError(c5p3.A07(), L1.A00(this.A01));
        }
    }
}
