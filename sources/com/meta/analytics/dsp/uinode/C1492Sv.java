package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1492Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC1489Ss A02;

    public C1492Sv(AbstractC1489Ss abstractC1489Ss, int i9, KT kt) {
        this.A02 = abstractC1489Ss;
        this.A00 = i9;
        this.A01 = kt;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A01.run();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f9 / this.A00)));
    }
}
