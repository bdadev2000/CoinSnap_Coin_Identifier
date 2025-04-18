package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PB implements View.OnClickListener {
    public final /* synthetic */ UP A00;

    public PB(UP up) {
        this.A00 = up;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QB qb;
        QB qb2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            qb = this.A00.A02;
            if (qb == null) {
                return;
            }
            qb2 = this.A00.A02;
            qb2.AGm();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
