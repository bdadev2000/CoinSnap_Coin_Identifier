package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class EG implements Runnable {
    public final /* synthetic */ EI A00;
    public final /* synthetic */ Throwable A01;

    public EG(EI ei, Throwable th) {
        this.A00 = ei;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0I;
        boolean A0H;
        boolean A0H2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            A0I = this.A00.A0I(1, this.A01 != null ? 4 : 2, this.A01);
            if (A0I) {
                return;
            }
            A0H = this.A00.A0H(6, 3);
            if (A0H) {
                return;
            }
            A0H2 = this.A00.A0H(7, 0);
            if (!A0H2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
