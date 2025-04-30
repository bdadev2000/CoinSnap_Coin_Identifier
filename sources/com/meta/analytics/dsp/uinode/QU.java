package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class QU extends C2P {
    public final /* synthetic */ QS A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QU(QS qs, double d2, double d9, double d10, boolean z8) {
        super(d2, d9, d10, z8);
        this.A00 = qs;
    }

    @Override // com.meta.analytics.dsp.uinode.C2P
    public final void A00(boolean z8, boolean z9, C2R c2r) {
        String str;
        Map A0I;
        if (z9) {
            QS qs = this.A00;
            str = qs.A0C;
            A0I = this.A00.A0I(QG.A03);
            qs.A0Q(str, A0I);
        }
    }
}
