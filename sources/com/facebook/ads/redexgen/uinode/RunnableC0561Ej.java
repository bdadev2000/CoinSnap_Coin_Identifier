package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ej, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0561Ej implements Runnable {
    public final /* synthetic */ CD A00;

    public RunnableC0561Ej(CD cd2) {
        this.A00 = cd2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        WQ wq;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0G;
            if (!z10) {
                wq = this.A00.A08;
                wq.ABC(this.A00);
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
