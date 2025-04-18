package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ W1 A03;

    public Gz(W1 w12, int i10, long j3, long j10) {
        this.A03 = w12;
        this.A00 = i10;
        this.A02 = j3;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0615Go interfaceC0615Go;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0615Go = this.A03.A07;
            interfaceC0615Go.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
