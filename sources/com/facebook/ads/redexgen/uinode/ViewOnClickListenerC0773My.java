package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0773My implements View.OnClickListener {
    public final /* synthetic */ C0767Ms A00;
    public final /* synthetic */ U5 A01;

    public ViewOnClickListenerC0773My(U5 u52, C0767Ms c0767Ms) {
        this.A01 = u52;
        this.A00 = c0767Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(C2U.A03);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
