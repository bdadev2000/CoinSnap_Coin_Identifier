package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class TD extends KY {
    public final /* synthetic */ TC A00;

    public TD(TC tc) {
        this.A00 = tc;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C0805Qi c0805Qi;
        T7 t7;
        AbstractC0852Sd abstractC0852Sd;
        AbstractC0858Sj abstractC0858Sj;
        c0805Qi = this.A00.A02;
        c0805Qi.A06();
        t7 = this.A00.A03;
        C03798w<AbstractC03808x, C03788v> eventBus = t7.getEventBus();
        abstractC0852Sd = this.A00.A05;
        abstractC0858Sj = this.A00.A04;
        eventBus.A04(abstractC0852Sd, abstractC0858Sj);
    }
}
