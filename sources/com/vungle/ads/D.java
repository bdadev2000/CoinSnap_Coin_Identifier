package com.vungle.ads;

/* loaded from: classes3.dex */
public final class D implements i7.a {
    final /* synthetic */ K this$0;

    public D(K k6) {
        this.this$0 = k6;
    }

    @Override // i7.a
    public void close() {
        this.this$0.finishAdInternal(false);
    }
}
