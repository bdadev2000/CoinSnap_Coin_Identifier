package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1721an extends KT {
    public final /* synthetic */ AbstractC1720am A00;
    public final /* synthetic */ C1242Jb A01;

    public C1721an(AbstractC1720am abstractC1720am, C1242Jb c1242Jb) {
        this.A00 = abstractC1720am;
        this.A01 = c1242Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A0B.A0E().A4t(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
