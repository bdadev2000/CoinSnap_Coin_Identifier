package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class Eo implements Runnable {
    public final /* synthetic */ C0489Dg A00;

    public Eo(C0489Dg c0489Dg) {
        this.A00 = c0489Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        XV xv;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0G;
            if (!z2) {
                xv = this.A00.A08;
                xv.ABd(this.A00);
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
