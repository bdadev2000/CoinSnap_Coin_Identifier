package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1161at implements AnonymousClass61 {
    public final /* synthetic */ C02531i A00;

    public C1161at(C02531i c02531i) {
        this.A00 = c02531i;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        InterfaceC02521h interfaceC02521h;
        interfaceC02521h = this.A00.A04;
        interfaceC02521h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC02521h interfaceC02521h;
        interfaceC02521h = this.A00.A04;
        interfaceC02521h.AAe(AdError.CACHE_ERROR);
    }
}
