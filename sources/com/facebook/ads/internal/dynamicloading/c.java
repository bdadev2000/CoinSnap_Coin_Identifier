package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ AudienceNetworkAds.InitListener b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f13457c;

    public c(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.b = initListener;
        this.f13457c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f13457c);
        this.b.onInitialized(createErrorInitResult);
    }
}
