package com.applovin.mediation.ads;

import Q7.n0;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f12699a;

    public MaxAppOpenAd(@NonNull String str, @NonNull Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f12699a.logApiCall("destroy()");
        this.f12699a.destroy();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f12699a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f12699a.isReady();
        this.f12699a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f12699a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f12699a.logApiCall("loadAd()");
        this.f12699a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f12699a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f12699a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f12699a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f12699a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(@NonNull String str, @Nullable String str2) {
        this.f12699a.logApiCall(n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f12699a.setExtraParameter(str, str2);
    }

    public void setListener(@Nullable MaxAdListener maxAdListener) {
        this.f12699a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f12699a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(@NonNull String str, @Nullable Object obj) {
        this.f12699a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f12699a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f12699a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f12699a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(@Nullable MaxAdRevenueListener maxAdRevenueListener) {
        this.f12699a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f12699a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    @NonNull
    public String toString() {
        return "" + this.f12699a;
    }

    public MaxAppOpenAd(@NonNull String str, @NonNull AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.k());
    }

    public void showAd(@Nullable String str) {
        showAd(str, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f12699a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }

    public void showAd(@Nullable String str, @Nullable String str2) {
        this.f12699a.logApiCall(n0.j("showAd(placement=", str, ", customData=", str2, ")"));
        zp.b(str2, "MaxAppOpenAd");
        this.f12699a.showAd(str, str2, null);
    }
}
