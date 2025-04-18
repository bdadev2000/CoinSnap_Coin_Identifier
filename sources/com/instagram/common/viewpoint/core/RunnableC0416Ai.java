package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0416Ai implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0421An A02;
    public final /* synthetic */ String A03;

    public RunnableC0416Ai(C0421An c0421An, String str, long j2, long j3) {
        this.A02 = c0421An;
        this.A03 = str;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0422Ao interfaceC0422Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0422Ao = this.A02.A01;
            interfaceC0422Ao.ABE(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
