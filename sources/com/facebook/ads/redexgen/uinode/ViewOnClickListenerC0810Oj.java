package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0810Oj implements View.OnClickListener {
    public final /* synthetic */ TT A00;

    public ViewOnClickListenerC0810Oj(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC02270h abstractC02270h;
        AbstractC1173b5 abstractC1173b5;
        Handler handler;
        Runnable runnable;
        AbstractC1173b5 abstractC1173b52;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                this.A00.A0P = true;
                TT tt = this.A00;
                abstractC02270h = tt.A0c;
                tt.A0d(((C0583Ff) abstractC02270h).A0G().toString());
                abstractC1173b5 = this.A00.A0G;
                if (abstractC1173b5.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC1173b52 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1173b52.A0H());
                }
            }
            TT tt2 = this.A00;
            z11 = tt2.A0O;
            tt2.A0g(z11 ? false : true);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
