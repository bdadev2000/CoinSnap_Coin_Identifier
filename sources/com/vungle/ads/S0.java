package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class S0 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public com.vungle.ads.internal.util.x create() {
        Context context;
        context = this.this$0.ctx;
        return new com.vungle.ads.internal.util.x(context);
    }
}
