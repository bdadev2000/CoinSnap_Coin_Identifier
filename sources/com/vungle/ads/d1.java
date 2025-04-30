package com.vungle.ads;

import f7.C2274a;
import f7.C2275b;

/* loaded from: classes3.dex */
public final class d1 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public C2275b create() {
        Object orBuild;
        Object orBuild2;
        C2274a c2274a = C2275b.Companion;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        com.vungle.ads.internal.executor.l ioExecutor = ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getIoExecutor();
        orBuild2 = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return C2274a.get$default(c2274a, ioExecutor, (com.vungle.ads.internal.util.x) orBuild2, null, 4, null);
    }
}
