package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class W0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.task.e create() {
        Context context;
        Object orBuild;
        context = this.this$0.ctx;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return new com.vungle.ads.internal.task.s(context, (com.vungle.ads.internal.util.x) orBuild);
    }
}
