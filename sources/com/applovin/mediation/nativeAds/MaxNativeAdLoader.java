package com.applovin.mediation.nativeAds;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f12719a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f12719a.logApiCall("a()");
        this.f12719a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f12719a.logApiCall("b()");
        this.f12719a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f12719a.logApiCall("destroy()");
        this.f12719a.destroy();
    }

    public String getAdUnitId() {
        return this.f12719a.getAdUnitId();
    }

    public String getPlacement() {
        this.f12719a.logApiCall("getPlacement()");
        return this.f12719a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f12719a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f12719a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f12719a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f12719a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f12719a.logApiCall("setCustomData(value=" + str + ")");
        this.f12719a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f12719a.logApiCall(n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f12719a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f12719a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f12719a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f12719a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f12719a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f12719a.logApiCall("setPlacement(placement=" + str + ")");
        this.f12719a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f12719a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f12719a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f12719a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f12719a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f12719a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        this.f12719a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f12719a.destroy(maxAd);
    }
}
