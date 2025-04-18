package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1167bt extends KY {
    public final /* synthetic */ C1209cZ A00;
    public final /* synthetic */ C02091u A01;
    public final /* synthetic */ C0531Fi A02;

    public C1167bt(C0531Fi c0531Fi, C02091u c02091u, C1209cZ c1209cZ) {
        this.A02 = c0531Fi;
        this.A01 = c02091u;
        this.A00 = c1209cZ;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        C0625Jg A00 = C0625Jg.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A5F(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
