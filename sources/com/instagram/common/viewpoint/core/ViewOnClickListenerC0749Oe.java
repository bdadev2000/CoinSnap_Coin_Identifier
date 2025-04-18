package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0749Oe implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC0909Ui A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC0749Oe(ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui, String str) {
        this.A00 = viewOnClickListenerC0909Ui;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
