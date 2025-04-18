package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7872c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f7871b = i10;
        this.f7872c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7871b;
        Object obj = this.f7872c;
        switch (i10) {
            case 0:
                AppLovinVastMediaView.e.a((AppLovinVastMediaView.e) obj);
                return;
            default:
                AppLovinVastMediaView.f.a((AppLovinVastMediaView.f) obj);
                return;
        }
    }
}
