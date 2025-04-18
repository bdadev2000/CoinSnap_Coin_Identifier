package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1271dm {
    public InterfaceC1272dn A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A02(InterfaceC1272dn interfaceC1272dn) {
        this.A00 = interfaceC1272dn;
    }
}
