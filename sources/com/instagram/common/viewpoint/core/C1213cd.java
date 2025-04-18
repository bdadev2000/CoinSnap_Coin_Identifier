package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1213cd extends KY {
    public final /* synthetic */ C1212cc A00;
    public final /* synthetic */ BN A01;

    public C1213cd(C1212cc c1212cc, BN bn) {
        this.A00 = c1212cc;
        this.A01 = bn;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C0833Rk c0833Rk;
        C0833Rk c0833Rk2;
        C0833Rk c0833Rk3;
        this.A00.A00.A0A();
        c0833Rk = this.A00.A00.A0C;
        if (c0833Rk != null) {
            BN bn = this.A01;
            c0833Rk2 = this.A00.A00.A0C;
            bn.setAdViewabilityChecker(c0833Rk2);
            c0833Rk3 = this.A00.A00.A0C;
            c0833Rk3.A0U();
        }
    }
}
