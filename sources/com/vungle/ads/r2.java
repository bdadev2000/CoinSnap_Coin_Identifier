package com.vungle.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class r2 extends p2 {
    final /* synthetic */ e3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(e3 e3Var) {
        super(e3Var, false, 1, null);
        this.this$0 = e3Var;
    }

    @Override // com.vungle.ads.p2
    public com.vungle.ads.internal.util.x create() {
        Context context;
        context = this.this$0.ctx;
        return new com.vungle.ads.internal.util.x(context);
    }
}
