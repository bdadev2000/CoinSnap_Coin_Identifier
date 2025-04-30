package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C1220Ic A01;

    public IX(C1220Ic c1220Ic, Format format) {
        this.A01 = c1220Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1221Id interfaceC1221Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1221Id = this.A01.A01;
            interfaceC1221Id.ADa(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
