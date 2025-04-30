package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class b1 extends Q0 {
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var) {
        super(f1Var, false, 1, null);
        this.this$0 = f1Var;
    }

    @Override // com.vungle.ads.Q0
    public e7.d create() {
        Context context;
        context = this.this$0.ctx;
        return new e7.d(context);
    }
}
