package com.applovin.impl;

import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6451d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6453g;

    public /* synthetic */ P(EventServiceImpl eventServiceImpl, t7 t7Var, Map map, boolean z8) {
        this.b = 6;
        this.f6452f = eventServiceImpl;
        this.f6451d = t7Var;
        this.f6453g = map;
        this.f6450c = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bc.a(this.f6450c, (MaxAdExpirationListener) this.f6452f, (MaxAd) this.f6451d, (MaxAd) this.f6453g);
                return;
            case 1:
                bc.a(this.f6450c, (MaxAdListener) this.f6452f, (MaxAd) this.f6451d, (MaxReward) this.f6453g);
                return;
            case 2:
                bc.a(this.f6450c, (MaxNativeAdListener) this.f6452f, (MaxNativeAdView) this.f6453g, (MaxAd) this.f6451d);
                return;
            case 3:
                bc.a(this.f6450c, (MaxAdListener) this.f6452f, (MaxAd) this.f6451d, (MaxError) this.f6453g);
                return;
            case 4:
                bc.a(this.f6450c, (MaxAdListener) this.f6452f, (String) this.f6451d, (MaxError) this.f6453g);
                return;
            case 5:
                bc.a(this.f6450c, (MaxNativeAdListener) this.f6452f, (String) this.f6451d, (MaxError) this.f6453g);
                return;
            case 6:
                ((EventServiceImpl) this.f6452f).a((t7) this.f6451d, (Map) this.f6453g, this.f6450c);
                return;
            default:
                com.vungle.ads.internal.presenter.q.m73processCommand$lambda9((com.vungle.ads.internal.presenter.q) this.f6452f, this.f6450c, (String) this.f6451d, (String) this.f6453g);
                return;
        }
    }

    public /* synthetic */ P(com.vungle.ads.internal.presenter.q qVar, boolean z8, String str, String str2) {
        this.b = 7;
        this.f6452f = qVar;
        this.f6450c = z8;
        this.f6451d = str;
        this.f6453g = str2;
    }

    public /* synthetic */ P(boolean z8, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.b = 2;
        this.f6450c = z8;
        this.f6452f = maxNativeAdListener;
        this.f6453g = maxNativeAdView;
        this.f6451d = maxAd;
    }

    public /* synthetic */ P(boolean z8, Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f6450c = z8;
        this.f6452f = obj;
        this.f6451d = obj2;
        this.f6453g = obj3;
    }
}
