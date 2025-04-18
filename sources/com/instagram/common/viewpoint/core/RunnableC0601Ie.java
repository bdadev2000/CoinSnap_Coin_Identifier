package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ie, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0601Ie implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0604Ih A04;

    public RunnableC0601Ie(C0604Ih c0604Ih, int i2, int i3, int i4, float f2) {
        this.A04 = c0604Ih;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ii ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ii = this.A04.A01;
            ii.AE8(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
