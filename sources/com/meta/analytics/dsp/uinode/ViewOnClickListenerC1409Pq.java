package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1409Pq implements View.OnClickListener {
    public final /* synthetic */ C1410Pr A00;

    public ViewOnClickListenerC1409Pq(C1410Pr c1410Pr) {
        this.A00 = c1410Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7C c7c;
        if (KL.A02(this)) {
            return;
        }
        try {
            c7c = this.A00.A05;
            c7c.performClick();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
