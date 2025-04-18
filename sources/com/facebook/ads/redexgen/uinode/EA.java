package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class EA implements Runnable {
    public final /* synthetic */ ED A00;

    public EA(ED ed2) {
        this.A00 = ed2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
