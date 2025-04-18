package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1147af extends KT {
    public final /* synthetic */ FY A00;
    public final /* synthetic */ C02661v A01;
    public final /* synthetic */ FG A02;

    public C1147af(FG fg2, C02661v c02661v, FY fy) {
        this.A02 = fg2;
        this.A01 = c02661v;
        this.A00 = fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A4t(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new C0676Jb(adErrorType, ""));
    }
}
