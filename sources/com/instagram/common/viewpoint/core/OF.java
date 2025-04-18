package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OF implements View.OnClickListener {
    public final /* synthetic */ C0911Uk A00;

    public OF(C0911Uk c0911Uk) {
        this.A00 = c0911Uk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
