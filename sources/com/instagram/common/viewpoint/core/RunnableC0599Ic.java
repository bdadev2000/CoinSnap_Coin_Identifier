package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0599Ic implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0604Ih A01;

    public RunnableC0599Ic(C0604Ih c0604Ih, Format format) {
        this.A01 = c0604Ih;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ii ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ii = this.A01.A01;
            ii.AE3(this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
