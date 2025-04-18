package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0854Qb implements View.OnClickListener {
    public final /* synthetic */ C0719Kw A00;

    public ViewOnClickListenerC0854Qb(C0719Kw c0719Kw) {
        this.A00 = c0719Kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JA ja2;
        C1070Yn c1070Yn;
        SA sa2;
        boolean A07;
        SA sa3;
        SA sa4;
        if (KL.A02(this)) {
            return;
        }
        try {
            ja2 = this.A00.A03;
            ja2.A04(J9.A0d, null);
            c1070Yn = this.A00.A02;
            c1070Yn.A0E().A3B();
            sa2 = this.A00.A00;
            if (sa2 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    sa4 = this.A00.A00;
                    sa4.setVolume(1.0f);
                } else {
                    sa3 = this.A00.A00;
                    sa3.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
