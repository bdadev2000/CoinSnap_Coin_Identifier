package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1169bv extends KY {
    public final /* synthetic */ AbstractC1168bu A00;
    public final /* synthetic */ C0625Jg A01;

    public C1169bv(AbstractC1168bu abstractC1168bu, C0625Jg c0625Jg) {
        this.A00 = abstractC1168bu;
        this.A01 = c0625Jg;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        this.A00.A0B.A0E().A5F(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
