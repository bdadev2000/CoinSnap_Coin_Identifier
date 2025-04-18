package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0907Sc implements InterfaceC0819Os {
    public final /* synthetic */ C0906Sb A00;

    public C0907Sc(C0906Sb c0906Sb) {
        this.A00 = c0906Sb;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0819Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0819Os
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
