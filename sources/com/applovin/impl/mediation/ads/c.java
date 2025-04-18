package com.applovin.impl.mediation.ads;

import com.applovin.impl.ce;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f6076d;

    public /* synthetic */ c(Object obj, MaxAd maxAd, int i10) {
        this.f6074b = i10;
        this.f6075c = obj;
        this.f6076d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6074b;
        MaxAd maxAd = this.f6076d;
        Object obj = this.f6075c;
        switch (i10) {
            case 0:
                ((MaxAdViewImpl) obj).a((ce) maxAd);
                return;
            case 1:
                ((MaxAdViewImpl) obj).b((ce) maxAd);
                return;
            default:
                MaxNativeAdLoaderImpl.c.a((MaxNativeAdLoaderImpl.c) obj, maxAd);
                return;
        }
    }
}
