package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1473Sc implements InterfaceC1385Os {
    public final /* synthetic */ C1472Sb A00;

    public C1473Sc(C1472Sb c1472Sb) {
        this.A00 = c1472Sb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1385Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1385Os
    public final void ADd(View view) {
        TS ts = (TS) view;
        ts.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) ts.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
