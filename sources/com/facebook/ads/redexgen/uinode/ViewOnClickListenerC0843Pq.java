package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0843Pq implements View.OnClickListener {
    public final /* synthetic */ C0844Pr A00;

    public ViewOnClickListenerC0843Pq(C0844Pr c0844Pr) {
        this.A00 = c0844Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7C c7c;
        if (KL.A02(this)) {
            return;
        }
        try {
            c7c = this.A00.A05;
            c7c.performClick();
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
