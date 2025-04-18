package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0520Ex implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F9 A01;

    public RunnableC0520Ex(F6 f6, F9 f9) {
        this.A00 = f6;
        this.A01 = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ACi(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
