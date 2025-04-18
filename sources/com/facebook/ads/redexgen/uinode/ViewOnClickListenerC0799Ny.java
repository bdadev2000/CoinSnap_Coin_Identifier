package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ny, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0799Ny implements View.OnClickListener {
    public final /* synthetic */ O1 A00;

    public ViewOnClickListenerC0799Ny(O1 o12) {
        this.A00 = o12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O0 o02;
        MB mb2;
        View[] viewArr;
        SA sa2;
        SA sa3;
        SA sa4;
        MB mb3;
        if (KL.A02(this)) {
            return;
        }
        try {
            o02 = this.A00.A04;
            o02.ACB();
            mb2 = this.A00.A00;
            if (mb2 != null) {
                mb3 = this.A00.A00;
                AbstractC0737Lo.A0L(mb3);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                AbstractC0737Lo.A0N(view2, 0);
            }
            AbstractC0737Lo.A0J(this.A00);
            sa2 = this.A00.A05;
            if (sa2 == null) {
                return;
            }
            sa3 = this.A00.A05;
            AbstractC0737Lo.A0N(sa3, 0);
            sa4 = this.A00.A05;
            sa4.A0b(QM.A02, 14);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
