package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1037Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1038Ai A01;

    public RunnableC1037Ah(C1038Ai c1038Ai, int i9) {
        this.A01 = c1038Ai;
        this.A00 = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1039Aj interfaceC1039Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1039Aj = this.A01.A01;
            interfaceC1039Aj.AAs(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
