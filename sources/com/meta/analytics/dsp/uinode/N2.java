package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N2 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C1333Ms A01;
    public final /* synthetic */ U5 A02;

    public N2(U5 u52, C1333Ms c1333Ms, C2W c2w) {
        this.A02 = u52;
        this.A01 = c1333Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACS(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
