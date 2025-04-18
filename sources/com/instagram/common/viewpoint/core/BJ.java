package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class BJ extends Thread {
    public final /* synthetic */ AbstractC1021Yu A00;

    public BJ(AbstractC1021Yu abstractC1021Yu) {
        this.A00 = abstractC1021Yu;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
