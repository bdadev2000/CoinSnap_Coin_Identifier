package com.vungle.ads;

/* loaded from: classes4.dex */
public final class c3 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public eh.b create() {
        Object orBuild;
        Object orBuild2;
        eh.a aVar = eh.b.Companion;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        com.vungle.ads.internal.executor.l ioExecutor = ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getIoExecutor();
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return eh.a.get$default(aVar, ioExecutor, (com.vungle.ads.internal.util.x) orBuild2, null, 4, null);
    }
}
