package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.f1;

/* loaded from: classes3.dex */
public final class l extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.executor.a] */
    @Override // F7.a
    public final com.vungle.ads.internal.executor.a invoke() {
        return f1.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
    }
}
