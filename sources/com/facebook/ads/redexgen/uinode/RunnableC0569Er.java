package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0569Er implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F4 A01;

    public RunnableC0569Er(F1 f12, F4 f42) {
        this.A00 = f12;
        this.A01 = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.ACG(this.A00.A00, this.A00.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
