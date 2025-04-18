package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class vt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f27643c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ vt(boolean z2, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i2) {
        this.f27641a = i2;
        this.f27642b = z2;
        this.f27643c = maxNativeAdListener;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f27641a;
        boolean z2 = this.f27642b;
        MaxAd maxAd = this.d;
        MaxNativeAdListener maxNativeAdListener = this.f27643c;
        switch (i2) {
            case 0:
                gc.a(z2, maxNativeAdListener, maxAd);
                return;
            default:
                gc.b(z2, maxNativeAdListener, maxAd);
                return;
        }
    }
}
