package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1394Pb implements View.OnClickListener {
    public final /* synthetic */ C1494Sx A00;

    public ViewOnClickListenerC1394Pb(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        boolean z9;
        AbstractC07930h abstractC07930h;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0K;
            if (!z8) {
                this.A00.A0L = true;
                C1494Sx c1494Sx = this.A00;
                abstractC07930h = c1494Sx.A0T;
                c1494Sx.A0h(((C1149Ff) abstractC07930h).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((PQ) this.A00).A05.A0H());
                }
            }
            C1494Sx c1494Sx2 = this.A00;
            z9 = c1494Sx2.A0K;
            c1494Sx2.A0k(z9 ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
