package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0895Rq implements Runnable {
    public final /* synthetic */ C0637Hl A00;

    public RunnableC0895Rq(C0637Hl c0637Hl) {
        this.A00 = c0637Hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            C0637Hl.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
