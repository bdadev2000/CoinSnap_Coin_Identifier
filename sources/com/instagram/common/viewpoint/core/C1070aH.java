package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1070aH extends KL {
    public final /* synthetic */ C1069aG A00;

    public C1070aH(C1069aG c1069aG) {
        this.A00 = c1069aG;
    }

    @Override // com.instagram.common.viewpoint.core.KL
    public final void A01() {
        C03055o c03055o;
        C03055o c03055o2;
        c03055o = this.A00.A01.A00;
        if (c03055o.A00() != null) {
            c03055o2 = this.A00.A01.A00;
            c03055o2.A00().onAdsLoaded();
        }
    }
}
