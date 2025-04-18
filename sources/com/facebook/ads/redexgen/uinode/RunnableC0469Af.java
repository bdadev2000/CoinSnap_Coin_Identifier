package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0469Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0472Ai A03;

    public RunnableC0469Af(C0472Ai c0472Ai, int i10, long j3, long j10) {
        this.A03 = c0472Ai;
        this.A00 = i10;
        this.A01 = j3;
        this.A02 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0473Aj interfaceC0473Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0473Aj = this.A03.A01;
            interfaceC0473Aj.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
