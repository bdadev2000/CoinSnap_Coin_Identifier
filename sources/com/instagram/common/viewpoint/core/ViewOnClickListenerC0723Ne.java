package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0723Ne implements View.OnClickListener {
    public final /* synthetic */ C0728Nj A00;

    public ViewOnClickListenerC0723Ne(C0728Nj c0728Nj) {
        this.A00 = c0728Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0727Ni interfaceC0727Ni;
        InterfaceC0727Ni interfaceC0727Ni2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0727Ni = this.A00.A05;
            if (interfaceC0727Ni == null) {
                return;
            }
            interfaceC0727Ni2 = this.A00.A05;
            interfaceC0727Ni2.ABX();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
