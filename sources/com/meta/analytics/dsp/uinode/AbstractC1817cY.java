package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1817cY {
    public InterfaceC1818cZ A00;

    public final void A00() {
        InterfaceC1818cZ interfaceC1818cZ = this.A00;
        if (interfaceC1818cZ != null) {
            interfaceC1818cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1818cZ interfaceC1818cZ = this.A00;
        if (interfaceC1818cZ != null) {
            interfaceC1818cZ.onStop();
        }
    }

    public final void A02(InterfaceC1818cZ interfaceC1818cZ) {
        this.A00 = interfaceC1818cZ;
    }
}
