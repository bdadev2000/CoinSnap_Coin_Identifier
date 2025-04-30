package com.meta.analytics.dsp.uinode;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1766bW extends KT {
    public final /* synthetic */ C08070w A00;

    public C1766bW(C08070w c08070w) {
        this.A00 = c08070w;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C08060v c08060v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c08060v = this.A00.A02;
        c08060v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
