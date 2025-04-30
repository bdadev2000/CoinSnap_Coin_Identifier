package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TA implements InterfaceC1348Nh {
    public final /* synthetic */ T8 A00;

    public TA(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1348Nh
    public final void ABh(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z8);
        this.A00.A07();
    }
}
