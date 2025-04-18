package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1161bn extends KY {
    public final /* synthetic */ C0538Fq A00;
    public final /* synthetic */ C02091u A01;
    public final /* synthetic */ C0527Fe A02;

    public C1161bn(C0527Fe c0527Fe, C02091u c02091u, C0538Fq c0538Fq) {
        this.A02 = c0527Fe;
        this.A01 = c02091u;
        this.A00 = c0538Fq;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A5F(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C0625Jg(adErrorType, ""));
    }
}
