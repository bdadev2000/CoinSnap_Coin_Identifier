package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1219Ib implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C1220Ic A01;

    public RunnableC1219Ib(C1220Ic c1220Ic, BC bc) {
        this.A01 = c1220Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC1221Id = this.A01.A01;
            interfaceC1221Id.ADV(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
