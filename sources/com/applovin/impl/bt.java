package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class bt implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f3959d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f3960f;

    public /* synthetic */ bt(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i10) {
        this.f3957b = i10;
        this.f3958c = z10;
        this.f3959d = maxNativeAdListener;
        this.f3960f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3957b;
        boolean z10 = this.f3958c;
        MaxAd maxAd = this.f3960f;
        MaxNativeAdListener maxNativeAdListener = this.f3959d;
        switch (i10) {
            case 0:
                bc.a(z10, maxNativeAdListener, maxAd);
                return;
            default:
                bc.b(z10, maxNativeAdListener, maxAd);
                return;
        }
    }
}
