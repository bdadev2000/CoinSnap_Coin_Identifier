package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0654Ic A02;
    public final /* synthetic */ String A03;

    public IW(C0654Ic c0654Ic, String str, long j3, long j10) {
        this.A02 = c0654Ic;
        this.A03 = str;
        this.A01 = j3;
        this.A00 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0655Id interfaceC0655Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0655Id = this.A02.A01;
            interfaceC0655Id.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
