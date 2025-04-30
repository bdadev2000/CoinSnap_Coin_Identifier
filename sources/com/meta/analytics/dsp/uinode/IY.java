package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1220Ic A02;

    public IY(C1220Ic c1220Ic, int i9, long j7) {
        this.A02 = c1220Ic;
        this.A00 = i9;
        this.A01 = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1221Id = this.A02.A01;
            interfaceC1221Id.ABN(this.A00, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
