package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC0899Ru {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0899Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0899Ru
    public final void AGQ(Object obj, long j3) throws InterruptedException {
        obj.wait(j3);
    }
}
