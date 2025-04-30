package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class S implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f6474d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f6475f;

    public /* synthetic */ S(boolean z8, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i9) {
        this.b = i9;
        this.f6473c = z8;
        this.f6474d = maxNativeAdListener;
        this.f6475f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.a(this.f6473c, this.f6474d, this.f6475f);
                return;
            default:
                bc.b(this.f6473c, this.f6474d, this.f6475f);
                return;
        }
    }
}
