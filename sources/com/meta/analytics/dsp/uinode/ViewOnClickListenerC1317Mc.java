package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1317Mc implements View.OnClickListener {
    public final /* synthetic */ UA A00;

    public ViewOnClickListenerC1317Mc(UA ua) {
        this.A00 = ua;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1319Me interfaceC1319Me;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1319Me = this.A00.A07;
            interfaceC1319Me.ABX();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
