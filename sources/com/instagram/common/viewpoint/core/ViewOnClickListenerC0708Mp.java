package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0708Mp implements View.OnClickListener {
    public final /* synthetic */ VA A00;

    public ViewOnClickListenerC0708Mp(VA va) {
        this.A00 = va;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JF jf;
        MR mr;
        N9 n9;
        if (KQ.A02(this)) {
            return;
        }
        try {
            jf = this.A00.A0N;
            jf.A04(JE.A07, null);
            mr = this.A00.A0Q;
            n9 = this.A00.A0R;
            mr.A4P(n9.A7I());
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
