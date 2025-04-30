package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1035Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1038Ai A03;

    public RunnableC1035Af(C1038Ai c1038Ai, int i9, long j7, long j9) {
        this.A03 = c1038Ai;
        this.A00 = i9;
        this.A01 = j7;
        this.A02 = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1039Aj interfaceC1039Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1039Aj = this.A03.A01;
            interfaceC1039Aj.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
