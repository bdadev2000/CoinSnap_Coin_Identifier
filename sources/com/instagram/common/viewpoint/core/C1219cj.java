package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1219cj extends KY {
    public final /* synthetic */ C01850w A00;

    public C1219cj(C01850w c01850w) {
        this.A00 = c01850w;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C01840v c01840v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c01840v = this.A00.A02;
        c01840v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
