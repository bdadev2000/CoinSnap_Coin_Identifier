package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class d implements AudienceNetworkAds.InitResult {
    public final /* synthetic */ Throwable a;

    public d(Throwable th2) {
        this.a = th2;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        String createErrorMessage;
        createErrorMessage = DynamicLoaderFactory.createErrorMessage(this.a);
        return createErrorMessage;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
