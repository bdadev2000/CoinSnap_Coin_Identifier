package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f10906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f10907c;

    public c(AudienceNetworkAds.InitListener initListener, Throwable th2) {
        this.f10906b = initListener;
        this.f10907c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f10907c);
        this.f10906b.onInitialized(createErrorInitResult);
    }
}
