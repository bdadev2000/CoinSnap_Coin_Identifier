package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1081aS extends KY {
    public final /* synthetic */ C1080aR A00;
    public final /* synthetic */ BN A01;

    public C1081aS(C1080aR c1080aR, BN bn) {
        this.A00 = c1080aR;
        this.A01 = bn;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1e(true, true);
    }
}
