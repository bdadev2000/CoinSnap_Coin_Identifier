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
public class ed extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f23679a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f23680b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f23681c = new LinkedList();
    private boolean d = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f23682f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private a f23683g;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public ed(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f23679a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f23683g = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f23680b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void a() {
        synchronized (this.f23682f) {
            try {
                Iterator it = this.f23681c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f23681c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f23682f) {
            maxAd = null;
            while (!this.f23681c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f23681c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f23683g = null;
        a();
        this.f23680b.destroy();
    }

    public boolean d() {
        boolean z2;
        synchronized (this.f23682f) {
            z2 = !this.f23681c.isEmpty();
        }
        return z2;
    }

    public void e() {
        synchronized (this.f23682f) {
            try {
                if (!this.d && this.f23681c.size() < this.f23679a) {
                    this.d = true;
                    this.f23680b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f23683g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f23683g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f23683g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f23682f) {
            this.f23681c.add(maxAd);
            this.d = false;
            e();
        }
        a aVar = this.f23683g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a(MaxAd maxAd) {
        this.f23680b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f23680b.render(maxNativeAdView, maxAd);
    }
}
