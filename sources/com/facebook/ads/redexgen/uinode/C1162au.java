package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1162au implements InterfaceC02611q {
    public final /* synthetic */ C02531i A00;

    public C1162au(C02531i c02531i) {
        this.A00 = c02531i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02611q
    public final void ACZ(AdError adError) {
        InterfaceC02521h interfaceC02521h;
        interfaceC02521h = this.A00.A04;
        interfaceC02521h.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02611q
    public final void ACa() {
        InterfaceC02521h interfaceC02521h;
        interfaceC02521h = this.A00.A04;
        interfaceC02521h.AAf();
    }
}
