package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class P3 implements Runnable {
    public final /* synthetic */ UQ A00;

    public P3(UQ uq) {
        this.A00 = uq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0O;
            if (!z2) {
                return;
            }
            this.A00.A0N();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
