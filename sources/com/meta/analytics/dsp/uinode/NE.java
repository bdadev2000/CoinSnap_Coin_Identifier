package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public final /* synthetic */ NJ A00;

    public NE(NJ nj) {
        this.A00 = nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NI ni;
        NI ni2;
        if (KL.A02(this)) {
            return;
        }
        try {
            ni = this.A00.A05;
            if (ni == null) {
                return;
            }
            ni2 = this.A00.A05;
            ni2.AB6();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
