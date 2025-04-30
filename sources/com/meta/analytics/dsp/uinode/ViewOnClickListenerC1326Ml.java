package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1326Ml implements View.OnClickListener {
    public final /* synthetic */ C1328Mn A00;

    public ViewOnClickListenerC1326Ml(C1328Mn c1328Mn) {
        this.A00 = c1328Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1331Mq interfaceC1331Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1331Mq = this.A00.A04;
            interfaceC1331Mq.A9N();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
