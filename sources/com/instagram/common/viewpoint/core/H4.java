package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class H4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ X6 A03;

    public H4(X6 x6, int i2, long j2, long j3) {
        this.A03 = x6;
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0564Gt interfaceC0564Gt;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0564Gt = this.A03.A07;
            interfaceC0564Gt.ABM(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
