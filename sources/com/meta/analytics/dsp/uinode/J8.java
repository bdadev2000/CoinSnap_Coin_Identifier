package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC1465Ru {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1465Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1465Ru
    public final void AGQ(Object obj, long j7) throws InterruptedException {
        obj.wait(j7);
    }
}
