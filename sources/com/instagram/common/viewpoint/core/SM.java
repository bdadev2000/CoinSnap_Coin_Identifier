package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class SM implements Runnable {
    public final /* synthetic */ C0641Jx A00;

    public SM(C0641Jx c0641Jx) {
        this.A00 = c0641Jx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            C0641Jx.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
