package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1251cY {
    public InterfaceC1252cZ A00;

    public final void A00() {
        InterfaceC1252cZ interfaceC1252cZ = this.A00;
        if (interfaceC1252cZ != null) {
            interfaceC1252cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1252cZ interfaceC1252cZ = this.A00;
        if (interfaceC1252cZ != null) {
            interfaceC1252cZ.onStop();
        }
    }

    public final void A02(InterfaceC1252cZ interfaceC1252cZ) {
        this.A00 = interfaceC1252cZ;
    }
}
