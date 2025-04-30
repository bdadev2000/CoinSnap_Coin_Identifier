package com.vungle.ads.internal.downloader;

/* loaded from: classes3.dex */
public final class k extends com.vungle.ads.internal.task.l {
    final /* synthetic */ i $downloadListener;
    final /* synthetic */ n $downloadRequest;
    final /* synthetic */ l this$0;

    public k(l lVar, n nVar, i iVar) {
        this.this$0 = lVar;
        this.$downloadRequest = nVar;
        this.$downloadListener = iVar;
    }

    @Override // com.vungle.ads.internal.task.l
    public int getPriority() {
        return this.$downloadRequest.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.this$0.launchRequest(this.$downloadRequest, this.$downloadListener);
    }
}
