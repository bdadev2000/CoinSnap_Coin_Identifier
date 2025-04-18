package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TA implements InterfaceC0782Nh {
    public final /* synthetic */ T8 A00;

    public TA(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0782Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z10);
        this.A00.A07();
    }
}
