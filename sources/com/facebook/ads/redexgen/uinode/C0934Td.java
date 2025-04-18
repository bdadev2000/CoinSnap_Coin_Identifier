package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0934Td implements L8 {
    public final /* synthetic */ BI A00;

    public C0934Td(BI bi2) {
        this.A00 = bi2;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        MB mb2;
        MB mb3;
        this.A00.A07 = false;
        mb2 = this.A00.A04;
        if (mb2 != null) {
            mb3 = this.A00.A04;
            mb3.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f10) {
        MB mb2;
        MB mb3;
        mb2 = this.A00.A04;
        if (mb2 != null) {
            float A00 = 1.0f - (f10 / ((float) this.A00.getAdInfo().A0G().A00()));
            mb3 = this.A00.A04;
            mb3.setProgressImmediate(100.0f * A00);
        }
    }
}
