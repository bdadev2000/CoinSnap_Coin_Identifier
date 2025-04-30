package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1339My implements View.OnClickListener {
    public final /* synthetic */ C1333Ms A00;
    public final /* synthetic */ U5 A01;

    public ViewOnClickListenerC1339My(U5 u52, C1333Ms c1333Ms) {
        this.A01 = u52;
        this.A00 = c1333Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(C2U.A03);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
