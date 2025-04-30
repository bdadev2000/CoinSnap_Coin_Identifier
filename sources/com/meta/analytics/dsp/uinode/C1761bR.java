package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1761bR extends KT {
    public final /* synthetic */ C1760bQ A00;
    public final /* synthetic */ B0 A01;

    public C1761bR(C1760bQ c1760bQ, B0 b02) {
        this.A00 = c1760bQ;
        this.A01 = b02;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        RE re;
        RE re2;
        RE re3;
        this.A00.A00.A0A();
        re = this.A00.A00.A0B;
        if (re != null) {
            B0 b02 = this.A01;
            re2 = this.A00.A00.A0B;
            b02.setAdViewabilityChecker(re2);
            re3 = this.A00.A00.A0B;
            re3.A0U();
        }
    }
}
