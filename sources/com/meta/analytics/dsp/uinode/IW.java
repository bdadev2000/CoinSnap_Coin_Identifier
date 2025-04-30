package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1220Ic A02;
    public final /* synthetic */ String A03;

    public IW(C1220Ic c1220Ic, String str, long j7, long j9) {
        this.A02 = c1220Ic;
        this.A03 = str;
        this.A01 = j7;
        this.A00 = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1221Id = this.A02.A01;
            interfaceC1221Id.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
