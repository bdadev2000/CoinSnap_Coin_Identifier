package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1719al extends KT {
    public final /* synthetic */ C1756bM A00;
    public final /* synthetic */ C08321v A01;
    public final /* synthetic */ FQ A02;

    public C1719al(FQ fq, C08321v c08321v, C1756bM c1756bM) {
        this.A02 = fq;
        this.A01 = c08321v;
        this.A00 = c1756bM;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C1242Jb A00 = C1242Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
