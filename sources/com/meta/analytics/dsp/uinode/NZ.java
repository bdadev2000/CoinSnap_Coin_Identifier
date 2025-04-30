package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C1341Na A00;
    public final /* synthetic */ InterfaceC1342Nb A01;

    public NZ(C1341Na c1341Na, InterfaceC1342Nb interfaceC1342Nb) {
        this.A00 = c1341Na;
        this.A01 = interfaceC1342Nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
