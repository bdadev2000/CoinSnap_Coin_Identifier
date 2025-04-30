package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1483Sm implements InterfaceC1348Nh {
    public final /* synthetic */ C9Y A00;

    public C1483Sm(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1348Nh
    public final void ABh(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z8);
        this.A00.A05();
    }
}
