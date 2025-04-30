package com.meta.analytics.dsp.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1218Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C1220Ic A01;

    public RunnableC1218Ia(C1220Ic c1220Ic, Surface surface) {
        this.A01 = c1220Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1221Id = this.A01.A01;
            interfaceC1221Id.ACt(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
