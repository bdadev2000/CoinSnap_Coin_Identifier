package com.vungle.ads;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public final class p implements o {
    final /* synthetic */ BlockingQueue<com.vungle.ads.internal.protos.d> $currentSendingErrors;

    public p(BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue) {
        this.$currentSendingErrors = blockingQueue;
    }

    @Override // com.vungle.ads.o
    public void onFailure() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = s.TAG;
        uVar.d(str, "Failed to send " + this.$currentSendingErrors.size() + " errors");
        s.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
    }

    @Override // com.vungle.ads.o
    public void onSuccess() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = s.TAG;
        uVar.d(str, "Sent " + this.$currentSendingErrors.size() + " errors");
    }
}
