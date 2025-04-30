package com.vungle.ads;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.vungle.ads.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2134q implements InterfaceC2130o {
    final /* synthetic */ BlockingQueue<com.vungle.ads.internal.protos.k> $currentSendingMetrics;

    public C2134q(BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue) {
        this.$currentSendingMetrics = blockingQueue;
    }

    @Override // com.vungle.ads.InterfaceC2130o
    public void onFailure() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = C2137s.TAG;
        uVar.d(str, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
        C2137s.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
    }

    @Override // com.vungle.ads.InterfaceC2130o
    public void onSuccess() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = C2137s.TAG;
        uVar.d(str, "Sent " + this.$currentSendingMetrics.size() + " metrics");
    }
}
