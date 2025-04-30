package com.vungle.ads;

/* loaded from: classes3.dex */
public final class T0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(f1 f1Var) {
        super(f1Var, false);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.downloader.p create() {
        Object orBuild;
        Object orBuild2;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        com.vungle.ads.internal.executor.l downloaderExecutor = ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getDownloaderExecutor();
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return new com.vungle.ads.internal.downloader.l(downloaderExecutor, (com.vungle.ads.internal.util.x) orBuild2);
    }
}
