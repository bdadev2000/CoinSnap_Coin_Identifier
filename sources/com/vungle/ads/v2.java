package com.vungle.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class v2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.task.e create() {
        Context context;
        Object orBuild;
        context = this.this$0.ctx;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.util.x.class);
        return new com.vungle.ads.internal.task.s(context, (com.vungle.ads.internal.util.x) orBuild);
    }
}
