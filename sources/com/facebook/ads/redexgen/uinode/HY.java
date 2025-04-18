package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class HY implements RL {
    public final /* synthetic */ C03916x A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public HY(C03916x c03916x, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c03916x;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.uinode.RL
    public final void AB9(RJ rj) {
        C03916x.A06(rj.A69(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.uinode.RL
    public final void ABS(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
