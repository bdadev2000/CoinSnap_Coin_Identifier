package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ W1 A03;

    public Gz(W1 w1, int i9, long j7, long j9) {
        this.A03 = w1;
        this.A00 = i9;
        this.A02 = j7;
        this.A01 = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1181Go interfaceC1181Go;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1181Go = this.A03.A07;
            interfaceC1181Go.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
