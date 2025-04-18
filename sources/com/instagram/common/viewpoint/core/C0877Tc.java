package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0877Tc implements QB {
    public final /* synthetic */ C03839a A00;

    public C0877Tc(C03839a c03839a) {
        this.A00 = c03839a;
    }

    @Override // com.instagram.common.viewpoint.core.QB
    public final void A8w() {
        AbstractC0753Oi abstractC0753Oi;
        AbstractC0753Oi abstractC0753Oi2;
        abstractC0753Oi = this.A00.A02;
        if (abstractC0753Oi instanceof BX) {
            abstractC0753Oi2 = this.A00.A02;
            ((BX) abstractC0753Oi2).A16();
            JF.A02(JE.A0c, null, ((AbstractC0891Tq) this.A00).A01.A1U(), ((AbstractC0891Tq) this.A00).A03.A09());
        }
    }

    @Override // com.instagram.common.viewpoint.core.QB
    public final void AGm() {
        AbstractC0753Oi abstractC0753Oi;
        AbstractC0753Oi abstractC0753Oi2;
        C9S c9s;
        abstractC0753Oi = this.A00.A02;
        if (abstractC0753Oi instanceof BX) {
            abstractC0753Oi2 = this.A00.A02;
            c9s = this.A00.A0K;
            ((BX) abstractC0753Oi2).A18(c9s);
            JF.A02(JE.A0c, null, ((AbstractC0891Tq) this.A00).A01.A1U(), ((AbstractC0891Tq) this.A00).A03.A09());
        }
        this.A00.A0a();
    }

    @Override // com.instagram.common.viewpoint.core.QB
    public final void AH0() {
        AbstractC0753Oi abstractC0753Oi;
        AbstractC0753Oi abstractC0753Oi2;
        this.A00.A0V();
        abstractC0753Oi = this.A00.A02;
        if (abstractC0753Oi instanceof BX) {
            abstractC0753Oi2 = this.A00.A02;
            ((BX) abstractC0753Oi2).getAdDetailsView().setVisibility(8);
        }
    }
}
