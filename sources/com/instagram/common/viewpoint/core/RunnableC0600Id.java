package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Id, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0600Id implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0604Ih A02;

    public RunnableC0600Id(C0604Ih c0604Ih, int i2, long j2) {
        this.A02 = c0604Ih;
        this.A00 = i2;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ii ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ii = this.A02.A01;
            ii.ABo(this.A00, this.A01);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
