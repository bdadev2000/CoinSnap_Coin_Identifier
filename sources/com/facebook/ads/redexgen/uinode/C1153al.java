package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1153al extends KT {
    public final /* synthetic */ C1190bM A00;
    public final /* synthetic */ C02661v A01;
    public final /* synthetic */ FQ A02;

    public C1153al(FQ fq, C02661v c02661v, C1190bM c1190bM) {
        this.A02 = fq;
        this.A01 = c02661v;
        this.A00 = c1190bM;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C0676Jb A00 = C0676Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
