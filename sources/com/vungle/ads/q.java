package com.vungle.ads;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class q implements o {
    final /* synthetic */ BlockingQueue<com.vungle.ads.internal.protos.k> $currentSendingMetrics;

    public q(BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue) {
        this.$currentSendingMetrics = blockingQueue;
    }

    @Override // com.vungle.ads.o
    public void onFailure() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = s.TAG;
        uVar.d(str, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
        s.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
    }

    @Override // com.vungle.ads.o
    public void onSuccess() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = s.TAG;
        uVar.d(str, "Sent " + this.$currentSendingMetrics.size() + " metrics");
    }
}
