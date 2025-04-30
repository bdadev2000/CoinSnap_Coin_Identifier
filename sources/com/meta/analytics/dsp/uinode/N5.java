package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C1333Ms A01;
    public final /* synthetic */ N6 A02;

    public N5(N6 n62, C1333Ms c1333Ms, C2W c2w) {
        this.A02 = n62;
        this.A01 = c1333Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1331Mq interfaceC1331Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC1331Mq = this.A02.A02;
            interfaceC1331Mq.ACS(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
