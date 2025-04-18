package com.vungle.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class y2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.platform.d create() {
        Object orBuild;
        Context context;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        context = this.this$0.ctx;
        return new com.vungle.ads.internal.platform.b(context, ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getUaExecutor());
    }
}
