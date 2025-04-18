package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Q1 implements View.OnClickListener {
    public final /* synthetic */ A6 A00;

    public Q1(A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        boolean z3;
        AbstractC01710h abstractC01710h;
        Handler handler;
        Runnable runnable;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A0K;
            if (!z2) {
                this.A00.A0L = true;
                A6 a6 = this.A00;
                abstractC01710h = this.A00.A0T;
                a6.A0e(((C0547Ga) abstractC01710h).A0G().toString());
                if (((U6) this.A00).A05.A0U() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((U6) this.A00).A05.A0U());
                }
            }
            A6 a62 = this.A00;
            z3 = this.A00.A0K;
            a62.A0h(z3 ? false : true);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
