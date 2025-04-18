package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 extends s0 {
    public /* synthetic */ c1(Context context, String str, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new d() : dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, String placementId, d adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.o0
    public d1 constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new d1(context);
    }
}
