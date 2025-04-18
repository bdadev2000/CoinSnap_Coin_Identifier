package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NA implements View.OnClickListener {
    public final /* synthetic */ ND A00;

    public NA(ND nd) {
        this.A00 = nd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z2;
        NG ng;
        NG ng2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z2 = this.A00.A05;
            if (z2) {
                ng2 = this.A00.A04;
                ng2.A4h();
            } else {
                ng = this.A00.A04;
                ng.A4i();
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
