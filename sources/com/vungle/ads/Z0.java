package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Z0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.platform.d create() {
        Object orBuild;
        Context context;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.executor.a.class);
        context = this.this$0.ctx;
        return new com.vungle.ads.internal.platform.b(context, ((com.vungle.ads.internal.executor.f) ((com.vungle.ads.internal.executor.a) orBuild)).getUaExecutor());
    }
}
