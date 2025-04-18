package com.vungle.ads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class p1 extends Lambda implements Function0 {
    final /* synthetic */ t1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(t1 t1Var) {
        super(0);
        this.this$0 = t1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.vungle.ads.internal.util.r invoke() {
        com.vungle.ads.internal.executor.a executors;
        com.vungle.ads.internal.util.r qVar = com.vungle.ads.internal.util.r.Companion.getInstance();
        executors = this.this$0.getExecutors();
        qVar.init(((com.vungle.ads.internal.executor.f) executors).getIoExecutor());
        return qVar;
    }
}
