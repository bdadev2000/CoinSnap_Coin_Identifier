package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0471Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0472Ai A01;

    public RunnableC0471Ah(C0472Ai c0472Ai, int i10) {
        this.A01 = c0472Ai;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0473Aj interfaceC0473Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0473Aj = this.A01.A01;
            interfaceC0473Aj.AAs(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
