package com.vungle.ads.internal.signals;

import android.content.Context;
import com.vungle.ads.e3;
import com.vungle.ads.internal.util.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class i extends Lambda implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.util.x] */
    @Override // kotlin.jvm.functions.Function0
    public final x invoke() {
        return e3.Companion.getInstance(this.$context).getService(x.class);
    }
}
