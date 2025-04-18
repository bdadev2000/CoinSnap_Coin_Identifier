package com.vungle.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class o2 extends Lambda implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e3 serviceLocator$Companion = e3.Companion.getInstance(this.$context);
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return serviceLocator$Companion.getService(Object.class);
    }
}
