package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class UT extends KY {
    public final /* synthetic */ UQ A00;

    public UT(UQ uq) {
        this.A00 = uq;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        PD pd;
        z2 = this.A00.A0Z;
        if (!z2) {
            pd = this.A00.A0M;
            M3.A0F(1000, pd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
