package com.vungle.ads;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.vungle.ads.internal.AbstractC2115v;

/* renamed from: com.vungle.ads.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2068a0 extends AbstractC2115v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2068a0(Context context) {
        super(context);
        G7.j.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public String getAdSizeForAdRequest() {
        return AppLovinMediationProvider.UNKNOWN;
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdSize(String str) {
        G7.j.e(str, "adSize");
        return true;
    }
}
