package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class H2 implements InterfaceC1252cZ {
    public final C1245cR A00;

    public H2(C1245cR c1245cR) {
        this.A00 = c1245cR;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1252cZ
    public final void onStart() {
        this.A00.A08();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1252cZ
    public final void onStop() {
        this.A00.A07();
    }
}
