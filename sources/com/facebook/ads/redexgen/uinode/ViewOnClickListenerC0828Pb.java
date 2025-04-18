package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0828Pb implements View.OnClickListener {
    public final /* synthetic */ C0928Sx A00;

    public ViewOnClickListenerC0828Pb(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC02270h abstractC02270h;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                this.A00.A0L = true;
                C0928Sx c0928Sx = this.A00;
                abstractC02270h = c0928Sx.A0T;
                c0928Sx.A0h(((C0583Ff) abstractC02270h).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((PQ) this.A00).A05.A0H());
                }
            }
            C0928Sx c0928Sx2 = this.A00;
            z11 = c0928Sx2.A0K;
            c0928Sx2.A0k(z11 ? false : true);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
