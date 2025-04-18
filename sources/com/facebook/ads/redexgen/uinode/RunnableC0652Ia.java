package com.facebook.ads.redexgen.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0652Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0654Ic A01;

    public RunnableC0652Ia(C0654Ic c0654Ic, Surface surface) {
        this.A01 = c0654Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0655Id interfaceC0655Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0655Id = this.A01.A01;
            interfaceC0655Id.ACt(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
