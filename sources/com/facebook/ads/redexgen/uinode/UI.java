package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UI implements InterfaceC0832Pf {
    public final /* synthetic */ UD A00;

    public UI(UD ud2) {
        this.A00 = ud2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0832Pf
    public final void ABu() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0T;
        atomicBoolean.set(true);
        this.A00.A0M();
    }
}
