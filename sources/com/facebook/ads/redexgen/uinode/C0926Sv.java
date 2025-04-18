package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0926Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC0923Ss A02;

    public C0926Sv(AbstractC0923Ss abstractC0923Ss, int i10, KT kt) {
        this.A02 = abstractC0923Ss;
        this.A00 = i10;
        this.A01 = kt;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f10) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
