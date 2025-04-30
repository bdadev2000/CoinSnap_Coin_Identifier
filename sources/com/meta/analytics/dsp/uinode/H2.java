package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class H2 implements InterfaceC1818cZ {
    public final C1811cR A00;

    public H2(C1811cR c1811cR) {
        this.A00 = c1811cR;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1818cZ
    public final void onStart() {
        this.A00.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1818cZ
    public final void onStop() {
        this.A00.A07();
    }
}
