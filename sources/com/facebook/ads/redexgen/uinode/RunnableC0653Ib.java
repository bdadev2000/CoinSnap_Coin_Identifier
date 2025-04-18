package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0653Ib implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0654Ic A01;

    public RunnableC0653Ib(C0654Ic c0654Ic, BC bc2) {
        this.A01 = c0654Ic;
        this.A00 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0655Id interfaceC0655Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC0655Id = this.A01.A01;
            interfaceC0655Id.ADV(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
