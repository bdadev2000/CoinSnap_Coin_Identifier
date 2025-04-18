package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0420Am implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0421An A01;

    public RunnableC0420Am(C0421An c0421An, int i2) {
        this.A01 = c0421An;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0422Ao interfaceC0422Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0422Ao = this.A01.A01;
            interfaceC0422Ao.ABI(this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
