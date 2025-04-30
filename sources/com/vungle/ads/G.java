package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class G extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // F7.a
    public final com.vungle.ads.internal.L invoke() {
        return new com.vungle.ads.internal.L(this.$context);
    }
}
