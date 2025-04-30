package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1727at implements AnonymousClass61 {
    public final /* synthetic */ C08191i A00;

    public C1727at(C08191i c08191i) {
        this.A00 = c08191i;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        InterfaceC08181h interfaceC08181h;
        interfaceC08181h = this.A00.A04;
        interfaceC08181h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC08181h interfaceC08181h;
        interfaceC08181h = this.A00.A04;
        interfaceC08181h.AAe(AdError.CACHE_ERROR);
    }
}
