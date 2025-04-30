package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1500Td implements L8 {
    public final /* synthetic */ BI A00;

    public C1500Td(BI bi) {
        this.A00 = bi;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        MB mb;
        MB mb2;
        this.A00.A07 = false;
        mb = this.A00.A04;
        if (mb != null) {
            mb2 = this.A00.A04;
            mb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
        MB mb;
        MB mb2;
        mb = this.A00.A04;
        if (mb != null) {
            float A00 = 1.0f - (f9 / ((float) this.A00.getAdInfo().A0G().A00()));
            mb2 = this.A00.A04;
            mb2.setProgressImmediate(100.0f * A00);
        }
    }
}
