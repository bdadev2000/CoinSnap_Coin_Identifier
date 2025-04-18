package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0654Ic A02;

    public IY(C0654Ic c0654Ic, int i10, long j3) {
        this.A02 = c0654Ic;
        this.A00 = i10;
        this.A01 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0655Id interfaceC0655Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0655Id = this.A02.A01;
            interfaceC0655Id.ABN(this.A00, this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
