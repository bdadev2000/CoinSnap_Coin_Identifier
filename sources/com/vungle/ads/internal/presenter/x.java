package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.f1;

/* loaded from: classes3.dex */
public final class x extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.j, java.lang.Object] */
    @Override // F7.a
    public final com.vungle.ads.internal.signals.j invoke() {
        return f1.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.j.class);
    }
}
