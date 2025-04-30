package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1376Oj implements View.OnClickListener {
    public final /* synthetic */ TT A00;

    public ViewOnClickListenerC1376Oj(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        boolean z9;
        AbstractC07930h abstractC07930h;
        AbstractC1739b5 abstractC1739b5;
        Handler handler;
        Runnable runnable;
        AbstractC1739b5 abstractC1739b52;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0O;
            if (!z8) {
                this.A00.A0P = true;
                TT tt = this.A00;
                abstractC07930h = tt.A0c;
                tt.A0d(((C1149Ff) abstractC07930h).A0G().toString());
                abstractC1739b5 = this.A00.A0G;
                if (abstractC1739b5.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC1739b52 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1739b52.A0H());
                }
            }
            TT tt2 = this.A00;
            z9 = tt2.A0O;
            tt2.A0g(z9 ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
