package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1032Ac implements Runnable {
    public final /* synthetic */ C1038Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC1032Ac(C1038Ai c1038Ai, BC bc) {
        this.A00 = c1038Ai;
        this.A01 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1039Aj interfaceC1039Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1039Aj = this.A00.A01;
            interfaceC1039Aj.AAq(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
