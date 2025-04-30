package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class T5 implements L8 {
    public final /* synthetic */ T4 A00;

    public T5(T4 t42) {
        this.A00 = t42;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        InterfaceC1396Pd interfaceC1396Pd;
        int i9;
        InterfaceC1396Pd interfaceC1396Pd2;
        interfaceC1396Pd = this.A00.A0F;
        i9 = this.A00.A0A;
        interfaceC1396Pd.ABH(i9);
        interfaceC1396Pd2 = this.A00.A0F;
        interfaceC1396Pd2.AAu();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
        int i9;
        boolean z8;
        SA sa;
        int duration;
        boolean z9;
        int i10;
        InterfaceC1396Pd interfaceC1396Pd;
        i9 = this.A00.A0A;
        float f10 = i9 - f9;
        z8 = this.A00.A0V;
        if (z8) {
            duration = 0;
        } else {
            sa = this.A00.A0I;
            duration = sa.getDuration();
        }
        float totalForce = f10 + duration;
        z9 = this.A00.A0V;
        if (z9) {
            i10 = this.A00.A0A;
        } else {
            i10 = this.A00.A09;
        }
        float seenTime = i10;
        float totalForce2 = totalForce / seenTime;
        interfaceC1396Pd = this.A00.A0F;
        interfaceC1396Pd.AGr(totalForce2);
    }
}
