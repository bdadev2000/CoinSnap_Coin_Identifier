package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class zc extends MaxNativeAdListener implements MaxAdRevenueListener {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f9365b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f9366c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9367d = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f9368f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private a f9369g;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public zc(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f9369g = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f9365b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void a() {
        synchronized (this.f9368f) {
            Iterator it = this.f9366c.iterator();
            while (it.hasNext()) {
                a((MaxAd) it.next());
            }
            this.f9366c.clear();
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f9368f) {
            maxAd = null;
            while (!this.f9366c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f9366c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f9369g = null;
        a();
        this.f9365b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f9368f) {
            z10 = !this.f9366c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f9368f) {
            if (!this.f9367d && this.f9366c.size() < this.a) {
                this.f9367d = true;
                this.f9365b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f9369g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f9369g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f9369g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f9368f) {
            this.f9366c.add(maxAd);
            this.f9367d = false;
            e();
        }
        a aVar = this.f9369g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a(MaxAd maxAd) {
        this.f9365b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f9365b.render(maxNativeAdView, maxAd);
    }
}
