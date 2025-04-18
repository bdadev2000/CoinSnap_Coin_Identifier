package com.vungle.ads;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class y0 extends com.vungle.ads.internal.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.v
    public String getAdSizeForAdRequest() {
        return AppLovinMediationProvider.UNKNOWN;
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdSize(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return true;
    }
}
