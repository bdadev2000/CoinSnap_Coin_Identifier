package com.vungle.ads.internal.presenter;

import c7.C0665z;
import c7.p1;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h implements com.vungle.ads.internal.ui.k {
    final /* synthetic */ q this$0;

    public h(q qVar) {
        this.this$0 = qVar;
    }

    @Override // com.vungle.ads.internal.ui.k
    public void onDeeplinkClick(boolean z8) {
        C0665z c0665z;
        p1 p1Var;
        C0665z c0665z2;
        C0665z c0665z3;
        com.vungle.ads.internal.executor.a executors;
        com.vungle.ads.internal.util.x pathProvider;
        com.vungle.ads.internal.signals.j signalManager;
        Executor executor;
        c0665z = this.this$0.advertisement;
        List<String> tpatUrls$default = C0665z.getTpatUrls$default(c0665z, "deeplink.click", String.valueOf(z8), null, 4, null);
        com.vungle.ads.internal.network.y vungleApiClient$vungle_ads_release = this.this$0.getVungleApiClient$vungle_ads_release();
        p1Var = this.this$0.placement;
        String referenceId = p1Var.getReferenceId();
        c0665z2 = this.this$0.advertisement;
        String creativeId = c0665z2.getCreativeId();
        c0665z3 = this.this$0.advertisement;
        String eventId = c0665z3.eventId();
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
