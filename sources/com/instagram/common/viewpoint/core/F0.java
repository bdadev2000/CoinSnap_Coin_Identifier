package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class F0 implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F7 A01;
    public final /* synthetic */ F8 A02;
    public final /* synthetic */ F9 A03;

    public F0(F6 f6, F9 f9, F7 f7, F8 f8) {
        this.A00 = f6;
        this.A03 = f9;
        this.A01 = f7;
        this.A02 = f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACP(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
