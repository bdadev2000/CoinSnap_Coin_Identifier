package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class Q9 implements Runnable {
    public final /* synthetic */ C03839a A00;

    public Q9(C03839a c03839a) {
        this.A00 = c03839a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            ((AbstractC0891Tq) this.A00).A08.A4P(((AbstractC0891Tq) this.A00).A09.A7I());
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
