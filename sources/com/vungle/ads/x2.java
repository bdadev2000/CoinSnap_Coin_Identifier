package com.vungle.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class x2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.network.y create() {
        Context context;
        Object orBuild;
        Object orBuild2;
        context = this.this$0.ctx;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.platform.d.class);
        orBuild2 = this.this$0.getOrBuild(eh.b.class);
        return new com.vungle.ads.internal.network.y(context, (com.vungle.ads.internal.platform.d) orBuild, (eh.b) orBuild2);
    }
}
