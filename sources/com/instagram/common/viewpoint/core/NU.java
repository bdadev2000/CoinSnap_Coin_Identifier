package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NU implements View.OnClickListener {
    public final /* synthetic */ NW A00;

    public NU(NW nw) {
        this.A00 = nw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NG ng;
        if (KQ.A02(this)) {
            return;
        }
        try {
            ng = this.A00.A02;
            ng.A8n();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
