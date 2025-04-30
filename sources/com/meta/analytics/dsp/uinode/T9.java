package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class T9 implements L8 {
    public final /* synthetic */ T8 A00;

    public T9(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        InterfaceC1396Pd interfaceC1396Pd;
        InterfaceC1396Pd interfaceC1396Pd2;
        int i9;
        interfaceC1396Pd = this.A00.A05;
        interfaceC1396Pd.AD7(false);
        interfaceC1396Pd2 = this.A00.A05;
        i9 = this.A00.A02;
        interfaceC1396Pd2.ABH(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
        InterfaceC1396Pd interfaceC1396Pd;
        int i9;
        interfaceC1396Pd = this.A00.A05;
        i9 = this.A00.A02;
        interfaceC1396Pd.ABY(i9 - f9);
    }
}
