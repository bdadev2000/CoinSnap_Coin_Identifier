package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.e3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class u extends Lambda implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.y, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final com.vungle.ads.internal.network.y invoke() {
        return e3.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.y.class);
    }
}
