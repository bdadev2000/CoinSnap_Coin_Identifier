package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0719Na implements View.OnClickListener {
    public final /* synthetic */ NI A00;
    public final /* synthetic */ V1 A01;

    public ViewOnClickListenerC0719Na(V1 v1, NI ni) {
        this.A01 = v1;
        this.A00 = ni;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A9n();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
