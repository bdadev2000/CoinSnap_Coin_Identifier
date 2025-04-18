package com.vungle.ads.internal.presenter;

import bh.o3;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h implements com.vungle.ads.internal.ui.k {
    final /* synthetic */ q this$0;

    public h(q qVar) {
        this.this$0 = qVar;
    }

    @Override // com.vungle.ads.internal.ui.k
    public void onDeeplinkClick(boolean z10) {
        bh.z zVar;
        o3 o3Var;
        bh.z zVar2;
        bh.z zVar3;
        com.vungle.ads.internal.executor.a executors;
        com.vungle.ads.internal.util.x pathProvider;
        com.vungle.ads.internal.signals.j signalManager;
        Executor executor;
        zVar = this.this$0.advertisement;
        List<String> tpatUrls$default = bh.z.getTpatUrls$default(zVar, "deeplink.click", String.valueOf(z10), null, 4, null);
        com.vungle.ads.internal.network.y vungleApiClient$vungle_ads_release = this.this$0.getVungleApiClient$vungle_ads_release();
        o3Var = this.this$0.placement;
        String referenceId = o3Var.getReferenceId();
        zVar2 = this.this$0.advertisement;
        String creativeId = zVar2.getCreativeId();
        zVar3 = this.this$0.advertisement;
        String eventId = zVar3.eventId();
        executors = this.this$0.getExecutors();
        com.vungle.ads.internal.executor.l ioExecutor = ((com.vungle.ads.internal.executor.f) executors).getIoExecutor();
        pathProvider = this.this$0.getPathProvider();
        signalManager = this.this$0.getSignalManager();
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient$vungle_ads_release, referenceId, creativeId, eventId, ioExecutor, pathProvider, signalManager);
        if (tpatUrls$default != null) {
            q qVar = this.this$0;
            for (String str : tpatUrls$default) {
                executor = qVar.executor;
                lVar.sendTpat(str, executor);
            }
        }
    }
}
