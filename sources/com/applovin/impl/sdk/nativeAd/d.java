package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26754b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f26753a = i2;
        this.f26754b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26753a;
        Object obj = this.f26754b;
        switch (i2) {
            case 0:
                AppLovinVastMediaView.e.a((AppLovinVastMediaView.e) obj);
                return;
            case 1:
                AppLovinVastMediaView.f.a((AppLovinVastMediaView.f) obj);
                return;
            default:
                AppLovinNativeAdImpl.b((AppLovinNativeAdImpl) obj);
                return;
        }
    }
}
