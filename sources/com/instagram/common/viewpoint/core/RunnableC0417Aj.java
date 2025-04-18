package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0417Aj implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0421An A01;

    public RunnableC0417Aj(C0421An c0421An, Format format) {
        this.A01 = c0421An;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0422Ao interfaceC0422Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0422Ao = this.A01.A01;
            interfaceC0422Ao.ABH(this.A00);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
