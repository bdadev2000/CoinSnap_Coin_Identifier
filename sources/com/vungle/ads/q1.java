package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class q1 extends Lambda implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.vungle.ads.internal.l0 invoke() {
        return new com.vungle.ads.internal.l0(this.$context);
    }
}
