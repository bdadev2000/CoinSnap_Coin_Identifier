package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0466Ac implements Runnable {
    public final /* synthetic */ C0472Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0466Ac(C0472Ai c0472Ai, BC bc2) {
        this.A00 = c0472Ai;
        this.A01 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0473Aj interfaceC0473Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0473Aj = this.A00.A01;
            interfaceC0473Aj.AAq(this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
