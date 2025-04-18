package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class En implements Runnable {
    public final /* synthetic */ C0489Dg A00;

    public En(C0489Dg c0489Dg) {
        this.A00 = c0489Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
