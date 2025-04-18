package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.e3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class b0 extends Lambda implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final com.vungle.ads.internal.signals.j invoke() {
        return e3.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.j.class);
    }
}
