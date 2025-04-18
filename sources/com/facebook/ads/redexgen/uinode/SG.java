package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class SG extends KT {
    public final /* synthetic */ SF A00;

    public SG(SF sf2) {
        this.A00 = sf2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        SA sa2;
        AbstractC0838Pl abstractC0838Pl;
        AbstractC0814On abstractC0814On;
        AbstractC0847Pu abstractC0847Pu;
        sa2 = this.A00.A04;
        C04318r<AbstractC04328s, C04308q> eventBus = sa2.getEventBus();
        abstractC0838Pl = this.A00.A06;
        abstractC0814On = this.A00.A07;
        abstractC0847Pu = this.A00.A05;
        eventBus.A04(abstractC0838Pl, abstractC0814On, abstractC0847Pu);
    }
}
