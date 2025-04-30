package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class UU implements NS {
    public final /* synthetic */ UT A00;

    public UU(UT ut) {
        this.A00 = ut;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACT(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACV(String str) {
        this.A00.A05 = true;
        this.A00.A0B.setUrl(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACn(int i9) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACq(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACs() {
        this.A00.A0A.AB0(14);
    }
}
