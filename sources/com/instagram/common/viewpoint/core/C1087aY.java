package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1087aY extends KL {
    public final /* synthetic */ C1084aV A00;

    public C1087aY(C1084aV c1084aV) {
        this.A00 = c1084aV;
    }

    @Override // com.instagram.common.viewpoint.core.KL
    public final void A01() {
        C5P c5p;
        C5P c5p2;
        C5P c5p3;
        c5p = this.A00.A01;
        if (c5p.A06() != null) {
            c5p2 = this.A00.A01;
            AdListener A06 = c5p2.A06();
            c5p3 = this.A00.A01;
            A06.onAdLoaded(c5p3.A07());
        }
    }
}
