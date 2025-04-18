package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0876Qx implements Runnable {
    public final /* synthetic */ R0 A00;

    public RunnableC0876Qx(R0 r02) {
        this.A00 = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
