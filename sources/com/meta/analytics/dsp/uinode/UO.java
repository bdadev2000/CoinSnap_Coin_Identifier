package com.meta.analytics.dsp.uinode;

import android.R;

/* loaded from: assets/audience_network.dex */
public class UO extends KT {
    public final /* synthetic */ MO A00;

    public UO(MO mo) {
        this.A00 = mo;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0J().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
