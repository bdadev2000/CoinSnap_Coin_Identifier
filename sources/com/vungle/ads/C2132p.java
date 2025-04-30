package com.vungle.ads;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.vungle.ads.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2132p implements InterfaceC2130o {
    final /* synthetic */ BlockingQueue<com.vungle.ads.internal.protos.d> $currentSendingErrors;

    public C2132p(BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue) {
        this.$currentSendingErrors = blockingQueue;
    }

    @Override // com.vungle.ads.InterfaceC2130o
    public void onFailure() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = C2137s.TAG;
        uVar.d(str, "Failed to send " + this.$currentSendingErrors.size() + " errors");
        C2137s.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
    }

    @Override // com.vungle.ads.InterfaceC2130o
    public void onSuccess() {
        String str;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        str = C2137s.TAG;
        uVar.d(str, "Sent " + this.$currentSendingErrors.size() + " errors");
    }
}
