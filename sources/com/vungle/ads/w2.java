package com.vungle.ads;

/* loaded from: classes4.dex */
public final class w2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.task.j create() {
        Object orBuild;
        Object orBuild2;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.task.e.class);
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        return new com.vungle.ads.internal.task.w((com.vungle.ads.internal.task.e) orBuild, ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild2)).getJobExecutor(), new com.vungle.ads.internal.task.k());
    }
}
