package com.vungle.ads;

import com.vungle.ads.internal.AbstractC2115v;

/* loaded from: classes3.dex */
public final class M extends G7.k implements F7.a {
    final /* synthetic */ P this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p2) {
        super(0);
        this.this$0 = p2;
    }

    @Override // F7.a
    public final AbstractC2115v invoke() {
        P p2 = this.this$0;
        return p2.constructAdInternal$vungle_ads_release(p2.getContext());
    }
}
