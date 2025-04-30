package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class UJ implements O0 {
    public final /* synthetic */ UD A00;

    public UJ(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void AAh() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0W.setToolbarActionMessage("");
            this.A00.A0W.setToolbarActionMode(0);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void ACB() {
        L9 l9;
        this.A00.A0C = false;
        l9 = this.A00.A0L;
        l9.A07();
    }

    @Override // com.meta.analytics.dsp.uinode.O0
    public final void ACC() {
        L9 l9;
        this.A00.A0C = true;
        l9 = this.A00.A0L;
        l9.A06();
    }
}
