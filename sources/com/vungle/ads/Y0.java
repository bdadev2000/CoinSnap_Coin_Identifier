package com.vungle.ads;

import android.content.Context;
import f7.C2275b;

/* loaded from: classes3.dex */
public final class Y0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.network.y create() {
        Context context;
        Object orBuild;
        Object orBuild2;
        context = this.this$0.ctx;
        orBuild = this.this$0.getOrBuild(com.vungle.ads.internal.platform.d.class);
        orBuild2 = this.this$0.getOrBuild(C2275b.class);
        return new com.vungle.ads.internal.network.y(context, (com.vungle.ads.internal.platform.d) orBuild, (C2275b) orBuild2);
    }
}
