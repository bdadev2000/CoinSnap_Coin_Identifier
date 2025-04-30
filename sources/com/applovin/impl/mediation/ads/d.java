package com.applovin.impl.mediation.ads;

import com.applovin.impl.ce;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f9033d;

    public /* synthetic */ d(Object obj, MaxAd maxAd, int i9) {
        this.b = i9;
        this.f9032c = obj;
        this.f9033d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((MaxAdViewImpl) this.f9032c).b((ce) this.f9033d);
                return;
            case 1:
                ((MaxAdViewImpl) this.f9032c).a((ce) this.f9033d);
                return;
            default:
                MaxNativeAdLoaderImpl.c.a((MaxNativeAdLoaderImpl.c) this.f9032c, this.f9033d);
                return;
        }
    }
}
