package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0415Ah implements Runnable {
    public final /* synthetic */ C0421An A00;
    public final /* synthetic */ BH A01;

    public RunnableC0415Ah(C0421An c0421An, BH bh) {
        this.A00 = c0421An;
        this.A01 = bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0422Ao interfaceC0422Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0422Ao = this.A00.A01;
            interfaceC0422Ao.ABG(this.A01);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
