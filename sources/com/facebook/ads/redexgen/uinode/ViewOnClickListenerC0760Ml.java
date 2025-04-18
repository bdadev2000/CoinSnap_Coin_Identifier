package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0760Ml implements View.OnClickListener {
    public final /* synthetic */ C0762Mn A00;

    public ViewOnClickListenerC0760Ml(C0762Mn c0762Mn) {
        this.A00 = c0762Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0765Mq interfaceC0765Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0765Mq = this.A00.A04;
            interfaceC0765Mq.A9N();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
