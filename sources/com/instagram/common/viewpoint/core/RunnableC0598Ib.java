package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0598Ib implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0604Ih A02;
    public final /* synthetic */ String A03;

    public RunnableC0598Ib(C0604Ih c0604Ih, String str, long j2, long j3) {
        this.A02 = c0604Ih;
        this.A03 = str;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ii ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ii = this.A02.A01;
            ii.ADx(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
