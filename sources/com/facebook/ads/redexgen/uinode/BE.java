package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class BE extends Thread {
    public final /* synthetic */ AbstractC1046Xp A00;

    public BE(AbstractC1046Xp abstractC1046Xp) {
        this.A00 = abstractC1046Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
