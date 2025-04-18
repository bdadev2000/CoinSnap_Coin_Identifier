package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1200bW extends KT {
    public final /* synthetic */ C02410w A00;

    public C1200bW(C02410w c02410w) {
        this.A00 = c02410w;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C02400v c02400v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c02400v = this.A00.A02;
        c02400v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
