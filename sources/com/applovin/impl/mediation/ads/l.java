package com.applovin.impl.mediation.ads;

import com.applovin.impl.ie;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25395c;

    public /* synthetic */ l(int i2, Object obj, Object obj2) {
        this.f25393a = i2;
        this.f25394b = obj;
        this.f25395c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25393a;
        Object obj = this.f25395c;
        Object obj2 = this.f25394b;
        switch (i2) {
            case 0:
                ((MaxFullscreenAdImpl.c) obj2).a((ie) obj);
                return;
            case 1:
                MaxNativeAdLoaderImpl.c.a((MaxNativeAdLoaderImpl.c) obj2, (MaxAd) obj);
                return;
            default:
                ((MaxFullscreenAdImpl) obj2).a((String) obj);
                return;
        }
    }
}
