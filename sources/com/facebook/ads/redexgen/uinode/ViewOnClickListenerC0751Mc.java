package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0751Mc implements View.OnClickListener {
    public final /* synthetic */ UA A00;

    public ViewOnClickListenerC0751Mc(UA ua2) {
        this.A00 = ua2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0753Me interfaceC0753Me;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0753Me = this.A00.A07;
            interfaceC0753Me.ABX();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
