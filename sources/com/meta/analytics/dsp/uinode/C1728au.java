package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1728au implements InterfaceC08271q {
    public final /* synthetic */ C08191i A00;

    public C1728au(C08191i c08191i) {
        this.A00 = c08191i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08271q
    public final void ACZ(AdError adError) {
        InterfaceC08181h interfaceC08181h;
        interfaceC08181h = this.A00.A04;
        interfaceC08181h.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08271q
    public final void ACa() {
        InterfaceC08181h interfaceC08181h;
        interfaceC08181h = this.A00.A04;
        interfaceC08181h.AAf();
    }
}
