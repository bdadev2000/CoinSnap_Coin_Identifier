package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class QU extends C2P {
    public final /* synthetic */ QS A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QU(QS qs, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = qs;
    }

    @Override // com.facebook.ads.redexgen.uinode.C2P
    public final void A00(boolean z10, boolean z11, C2R c2r) {
        String str;
        Map A0I;
        if (z11) {
            QS qs = this.A00;
            str = qs.A0C;
            A0I = this.A00.A0I(QG.A03);
            qs.A0Q(str, A0I);
        }
    }
}
