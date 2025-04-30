package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1461Rq implements Runnable {
    public final /* synthetic */ C1203Hl A00;

    public RunnableC1461Rq(C1203Hl c1203Hl) {
        this.A00 = c1203Hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            C1203Hl.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
