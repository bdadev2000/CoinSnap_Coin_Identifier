package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1366Nz implements View.OnClickListener {
    public final /* synthetic */ O1 A00;

    public ViewOnClickListenerC1366Nz(O1 o12) {
        this.A00 = o12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
