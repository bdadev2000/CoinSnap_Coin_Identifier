package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class TV implements O0 {
    public final /* synthetic */ TT A00;

    public TV(TT tt) {
        this.A00 = tt;
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void AAh() {
        OP op;
        OP op2;
        op = this.A00.A0L;
        AbstractC1739b5 A04 = op.A04();
        op2 = this.A00.A0L;
        A04.A15(op2.A09());
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void ACB() {
        this.A00.A0Z = false;
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void ACC() {
        this.A00.A0Z = true;
    }
}
