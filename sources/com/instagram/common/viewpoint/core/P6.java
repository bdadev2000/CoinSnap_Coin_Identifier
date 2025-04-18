package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P6 implements View.OnClickListener {
    public final /* synthetic */ UQ A00;

    public P6(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        boolean z3;
        AbstractC01710h abstractC01710h;
        AbstractC1187cD abstractC1187cD;
        Handler handler;
        Runnable runnable;
        AbstractC1187cD abstractC1187cD2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0O;
            if (!z2) {
                this.A00.A0P = true;
                UQ uq = this.A00;
                abstractC01710h = this.A00.A0c;
                uq.A0d(((C0547Ga) abstractC01710h).A0G().toString());
                abstractC1187cD = this.A00.A0G;
                if (abstractC1187cD.A0U() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC1187cD2 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1187cD2.A0U());
                }
            }
            UQ uq2 = this.A00;
            z3 = this.A00.A0O;
            uq2.A0g(z3 ? false : true);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
