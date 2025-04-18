package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.c2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1176c2 implements InterfaceC02041p {
    public final /* synthetic */ C01961h A00;

    public C1176c2(C01961h c01961h) {
        this.A00 = c01961h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02041p
    public final void AD2(AdError adError) {
        InterfaceC01951g interfaceC01951g;
        interfaceC01951g = this.A00.A04;
        interfaceC01951g.AB4(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02041p
    public final void AD3() {
        InterfaceC01951g interfaceC01951g;
        interfaceC01951g = this.A00.A04;
        interfaceC01951g.AB5();
    }
}
