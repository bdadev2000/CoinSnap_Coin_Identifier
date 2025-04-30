package com.vungle.ads;

/* renamed from: com.vungle.ads.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2136r0 extends G7.k implements F7.a {
    final /* synthetic */ C2144v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136r0(C2144v0 c2144v0) {
        super(0);
        this.this$0 = c2144v0;
    }

    @Override // F7.a
    public final com.vungle.ads.internal.util.r invoke() {
        com.vungle.ads.internal.executor.a executors;
        com.vungle.ads.internal.util.r qVar = com.vungle.ads.internal.util.r.Companion.getInstance();
        executors = this.this$0.getExecutors();
        qVar.init(((com.vungle.ads.internal.executor.f) executors).getIoExecutor());
        return qVar;
    }
}
