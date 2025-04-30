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

    /* renamed from: a, reason: collision with root package name */
    private final int f12548a;
    private final MaxNativeAdLoader b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f12549c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f12550d = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f12551f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private a f12552g;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public zc(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f12548a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f12552g = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void a() {
        synchronized (this.f12551f) {
            try {
                Iterator it = this.f12549c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f12549c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f12551f) {
            maxAd = null;
            while (!this.f12549c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f12549c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f12552g = null;
        a();
        this.b.destroy();
    }

    public boolean d() {
        boolean z8;
        synchronized (this.f12551f) {
            z8 = !this.f12549c.isEmpty();
        }
        return z8;
    }

    public void e() {
        synchronized (this.f12551f) {
            try {
                if (!this.f12550d && this.f12549c.size() < this.f12548a) {
                    this.f12550d = true;
                    this.b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f12552g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f12552g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f12552g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f12551f) {
            this.f12549c.add(maxAd);
            this.f12550d = false;
            e();
        }
        a aVar = this.f12552g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a(MaxAd maxAd) {
        this.b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.b.render(maxNativeAdView, maxAd);
    }
}
