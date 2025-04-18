package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0759Mk implements View.OnClickListener {
    public final /* synthetic */ C0762Mn A00;

    public ViewOnClickListenerC0759Mk(C0762Mn c0762Mn) {
        this.A00 = c0762Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        InterfaceC0765Mq interfaceC0765Mq;
        InterfaceC0765Mq interfaceC0765Mq2;
        if (KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A05;
            if (z10) {
                interfaceC0765Mq2 = this.A00.A04;
                interfaceC0765Mq2.A4L();
            } else {
                interfaceC0765Mq = this.A00.A04;
                interfaceC0765Mq.A4M();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
