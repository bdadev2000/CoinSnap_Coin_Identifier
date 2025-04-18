package com.vungle.ads.internal.network;

/* loaded from: classes4.dex */
public final class u implements b {
    final /* synthetic */ com.vungle.ads.o $requestListener;

    public u(com.vungle.ads.o oVar) {
        this.$requestListener = oVar;
    }

    @Override // com.vungle.ads.internal.network.b
    public void onFailure(a aVar, Throwable th2) {
        this.$requestListener.onFailure();
    }

    @Override // com.vungle.ads.internal.network.b
    public void onResponse(a aVar, j jVar) {
        this.$requestListener.onSuccess();
    }
}
