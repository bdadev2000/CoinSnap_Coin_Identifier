package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0418Ak implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0421An A03;

    public RunnableC0418Ak(C0421An c0421An, int i2, long j2, long j3) {
        this.A03 = c0421An;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0422Ao interfaceC0422Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0422Ao = this.A03.A01;
            interfaceC0422Ao.ABJ(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
