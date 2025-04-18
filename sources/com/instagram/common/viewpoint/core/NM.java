package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NM implements View.OnClickListener {
    public final /* synthetic */ V3 A00;

    public NM(V3 v3) {
        this.A00 = v3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9n();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
