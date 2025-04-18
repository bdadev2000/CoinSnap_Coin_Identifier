package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* loaded from: classes4.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f28431a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f28431a.logApiCall("a()");
        this.f28431a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f28431a.logApiCall("b()");
        this.f28431a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f28431a.logApiCall("destroy()");
        this.f28431a.destroy();
    }

    public String getAdUnitId() {
        return this.f28431a.getAdUnitId();
    }

    public String getPlacement() {
        this.f28431a.logApiCall("getPlacement()");
        return this.f28431a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z");
        CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
        return safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(maxNativeAdView, maxAd);
    }

    public boolean safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(MaxNativeAdView p02, MaxAd p12) {
        this.f28431a.logApiCall("render(adView=" + p02 + ", ad=" + p12 + ")");
        return this.f28431a.render(p02, p12);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f28431a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f28431a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f28431a.logApiCall("setCustomData(value=" + str + ")");
        this.f28431a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f28431a.logApiCall(androidx.compose.foundation.text.input.a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f28431a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f28431a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f28431a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f28431a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f28431a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f28431a.logApiCall("setPlacement(placement=" + str + ")");
        this.f28431a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f28431a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f28431a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f28431a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f28431a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f28431a.loadAd(maxNativeAdView);
    }

    public void destroy(MaxAd maxAd) {
        this.f28431a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f28431a.destroy(maxAd);
    }
}
