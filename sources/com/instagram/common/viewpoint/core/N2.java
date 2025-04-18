package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N2 implements View.OnClickListener {
    public final /* synthetic */ V7 A00;

    public N2(V7 v7) {
        this.A00 = v7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        N4 n4;
        if (KQ.A02(this)) {
            return;
        }
        try {
            n4 = this.A00.A07;
            n4.ABy();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
