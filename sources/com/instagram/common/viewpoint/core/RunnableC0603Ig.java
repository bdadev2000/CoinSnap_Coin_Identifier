package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ig, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0603Ig implements Runnable {
    public final /* synthetic */ BH A00;
    public final /* synthetic */ C0604Ih A01;

    public RunnableC0603Ig(C0604Ih c0604Ih, BH bh) {
        this.A01 = c0604Ih;
        this.A00 = bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ii ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            ii = this.A01.A01;
            ii.ADy(this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
