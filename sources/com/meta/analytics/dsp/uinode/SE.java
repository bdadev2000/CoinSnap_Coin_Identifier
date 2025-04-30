package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa) {
        this.A00 = sa;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        C09978r c09978r;
        Handler handler;
        int i9;
        z8 = this.A00.A03;
        if (!z8) {
            c09978r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c09978r.A02(new AbstractC1414Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            handler = this.A00.A07;
            i9 = this.A00.A00;
            handler.postDelayed(this, i9);
        }
    }
}
