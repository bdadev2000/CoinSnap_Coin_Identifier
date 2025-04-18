package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C0767Ms A01;
    public final /* synthetic */ N6 A02;

    public N5(N6 n62, C0767Ms c0767Ms, C2W c2w) {
        this.A02 = n62;
        this.A01 = c0767Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0765Mq interfaceC0765Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC0765Mq = this.A02.A02;
            interfaceC0765Mq.ACS(this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
