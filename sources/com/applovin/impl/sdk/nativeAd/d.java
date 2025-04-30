package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11043c;

    public /* synthetic */ d(Object obj, int i9) {
        this.b = i9;
        this.f11043c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AppLovinVastMediaView.e.a((AppLovinVastMediaView.e) this.f11043c);
                return;
            default:
                AppLovinVastMediaView.f.a((AppLovinVastMediaView.f) this.f11043c);
                return;
        }
    }
}
