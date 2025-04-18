package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0577Ez implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F3 A01;
    public final /* synthetic */ F4 A02;

    public RunnableC0577Ez(F1 f12, F4 f42, F3 f32) {
        this.A00 = f12;
        this.A02 = f42;
        this.A01 = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.ABM(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
