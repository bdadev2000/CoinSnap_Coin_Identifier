package com.vungle.ads;

/* loaded from: classes3.dex */
public final class X0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.task.j create() {
        Object orBuild;
        Object orBuild2;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.task.e.class);
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        return new com.vungle.ads.internal.task.w((com.vungle.ads.internal.task.e) orBuild, ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild2)).getJobExecutor(), new com.vungle.ads.internal.task.k());
    }
}
