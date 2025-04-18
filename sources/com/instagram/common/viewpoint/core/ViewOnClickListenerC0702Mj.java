package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0702Mj implements View.OnClickListener {
    public final /* synthetic */ C0705Mm A00;

    public ViewOnClickListenerC0702Mj(C0705Mm c0705Mm) {
        this.A00 = c0705Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
