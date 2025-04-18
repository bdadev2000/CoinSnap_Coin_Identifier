package com.applovin.mediation.nativeAds;

import a4.j;
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
    private final MaxNativeAdLoaderImpl a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.a.logApiCall("a()");
        this.a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.a.logApiCall("b()");
        this.a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.a.logApiCall("destroy()");
        this.a.destroy();
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public String getPlacement() {
        this.a.logApiCall("getPlacement()");
        return this.a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.a.logApiCall("setCustomData(value=" + str + ")");
        this.a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.a.logApiCall(j.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.a.logApiCall("setPlacement(placement=" + str + ")");
        this.a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
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
                this.a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        this.a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.a.destroy(maxAd);
    }
}
