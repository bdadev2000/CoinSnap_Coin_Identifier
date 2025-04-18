package com.vungle.ads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class l0 extends Lambda implements Function0 {
    final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var) {
        super(0);
        this.this$0 = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.vungle.ads.internal.v invoke() {
        o0 o0Var = this.this$0;
        return o0Var.constructAdInternal$vungle_ads_release(o0Var.getContext());
    }
}
