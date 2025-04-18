package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ei, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0560Ei implements Runnable {
    public final /* synthetic */ CD A00;

    public RunnableC0560Ei(CD cd2) {
        this.A00 = cd2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
