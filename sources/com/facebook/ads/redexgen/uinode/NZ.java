package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C0775Na A00;
    public final /* synthetic */ InterfaceC0776Nb A01;

    public NZ(C0775Na c0775Na, InterfaceC0776Nb interfaceC0776Nb) {
        this.A00 = c0775Na;
        this.A01 = interfaceC0776Nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
