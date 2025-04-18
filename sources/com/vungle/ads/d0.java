package com.vungle.ads;

/* loaded from: classes4.dex */
public final class d0 implements hh.a {
    final /* synthetic */ k0 this$0;

    public d0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override // hh.a
    public void close() {
        this.this$0.finishAdInternal(false);
    }
}
