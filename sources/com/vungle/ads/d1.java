package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 extends y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdTypeForPlacement(bh.o3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isInterstitial();
    }
}
