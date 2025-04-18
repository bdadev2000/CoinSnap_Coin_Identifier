package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0894Tt implements LG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KY A01;
    public final /* synthetic */ AbstractC0891Tq A02;

    public C0894Tt(AbstractC0891Tq abstractC0891Tq, int i2, KY ky) {
        this.A02 = abstractC0891Tq;
        this.A00 = i2;
        this.A01 = ky;
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
