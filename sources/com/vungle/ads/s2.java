package com.vungle.ads;

/* loaded from: classes4.dex */
public final class s2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(e3 e3Var) {
        super(e3Var, false);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.downloader.p create() {
        Object orBuild;
        Object orBuild2;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        com.vungle.ads.internal.executor.l downloaderExecutor = ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getDownloaderExecutor();
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return new com.vungle.ads.internal.downloader.l(downloaderExecutor, (com.vungle.ads.internal.util.x) orBuild2);
    }
}
