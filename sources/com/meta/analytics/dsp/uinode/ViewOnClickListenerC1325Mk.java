package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1325Mk implements View.OnClickListener {
    public final /* synthetic */ C1328Mn A00;

    public ViewOnClickListenerC1325Mk(C1328Mn c1328Mn) {
        this.A00 = c1328Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        InterfaceC1331Mq interfaceC1331Mq;
        InterfaceC1331Mq interfaceC1331Mq2;
        if (KL.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A05;
            if (z8) {
                interfaceC1331Mq2 = this.A00.A04;
                interfaceC1331Mq2.A4L();
            } else {
                interfaceC1331Mq = this.A00.A04;
                interfaceC1331Mq.A4M();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
