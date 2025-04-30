package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C1494Sx A00;

    public PZ(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0K;
            if (!z8) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
