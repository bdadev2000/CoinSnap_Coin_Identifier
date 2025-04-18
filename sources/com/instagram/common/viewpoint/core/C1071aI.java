package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1071aI extends KL {
    public final /* synthetic */ C1068aF A00;
    public final /* synthetic */ C0625Jg A01;

    public C1071aI(C1068aF c1068aF, C0625Jg c0625Jg) {
        this.A00 = c1068aF;
        this.A01 = c0625Jg;
    }

    @Override // com.instagram.common.viewpoint.core.KL
    public final void A01() {
        C03055o c03055o;
        C03055o c03055o2;
        c03055o = this.A00.A00;
        if (c03055o.A00() != null) {
            c03055o2 = this.A00.A00;
            c03055o2.A00().onAdError(L8.A00(this.A01));
        }
    }
}
