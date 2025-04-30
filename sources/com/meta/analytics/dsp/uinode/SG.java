package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SG extends KT {
    public final /* synthetic */ SF A00;

    public SG(SF sf) {
        this.A00 = sf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA sa;
        AbstractC1404Pl abstractC1404Pl;
        AbstractC1380On abstractC1380On;
        AbstractC1413Pu abstractC1413Pu;
        sa = this.A00.A04;
        C09978r<AbstractC09988s, C09968q> eventBus = sa.getEventBus();
        abstractC1404Pl = this.A00.A06;
        abstractC1380On = this.A00.A07;
        abstractC1413Pu = this.A00.A05;
        eventBus.A04(abstractC1404Pl, abstractC1380On, abstractC1413Pu);
    }
}
