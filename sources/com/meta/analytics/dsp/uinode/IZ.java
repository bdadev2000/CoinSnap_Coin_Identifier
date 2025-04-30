package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C1220Ic A04;

    public IZ(C1220Ic c1220Ic, int i9, int i10, int i11, float f9) {
        this.A04 = c1220Ic;
        this.A03 = i9;
        this.A01 = i10;
        this.A02 = i11;
        this.A00 = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1221Id = this.A04.A01;
            interfaceC1221Id.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
