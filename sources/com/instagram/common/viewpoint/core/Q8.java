package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class Q8 implements Runnable {
    public final /* synthetic */ C0879Te A00;

    public Q8(C0879Te c0879Te) {
        this.A00 = c0879Te;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0D(JE.A0Z);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
