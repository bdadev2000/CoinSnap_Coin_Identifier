package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1420Qb implements View.OnClickListener {
    public final /* synthetic */ C1285Kw A00;

    public ViewOnClickListenerC1420Qb(C1285Kw c1285Kw) {
        this.A00 = c1285Kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JA ja;
        C1636Yn c1636Yn;
        SA sa;
        boolean A07;
        SA sa2;
        SA sa3;
        if (KL.A02(this)) {
            return;
        }
        try {
            ja = this.A00.A03;
            ja.A04(J9.A0d, null);
            c1636Yn = this.A00.A02;
            c1636Yn.A0E().A3B();
            sa = this.A00.A00;
            if (sa != null) {
                A07 = this.A00.A07();
                if (A07) {
                    sa3 = this.A00.A00;
                    sa3.setVolume(1.0f);
                } else {
                    sa2 = this.A00.A00;
                    sa2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
