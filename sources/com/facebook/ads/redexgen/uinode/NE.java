package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public final /* synthetic */ NJ A00;

    public NE(NJ nj) {
        this.A00 = nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NI ni2;
        NI ni3;
        if (KL.A02(this)) {
            return;
        }
        try {
            ni2 = this.A00.A05;
            if (ni2 == null) {
                return;
            }
            ni3 = this.A00.A05;
            ni3.AB6();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
