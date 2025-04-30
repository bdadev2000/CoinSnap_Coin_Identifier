package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ej, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1127Ej implements Runnable {
    public final /* synthetic */ CD A00;

    public RunnableC1127Ej(CD cd) {
        this.A00 = cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        WQ wq;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0G;
            if (!z8) {
                wq = this.A00.A08;
                wq.ABC(this.A00);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
