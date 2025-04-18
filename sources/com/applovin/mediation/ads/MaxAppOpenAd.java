package com.applovin.mediation.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.input.a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.yp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes3.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f28407a;

    public MaxAppOpenAd(@NonNull String str, @NonNull Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f28407a.logApiCall("destroy()");
        this.f28407a.destroy();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f28407a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f28407a.isReady();
        this.f28407a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f28407a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f28407a.logApiCall("loadAd()");
        this.f28407a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f28407a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f28407a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f28407a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f28407a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(@NonNull String str, @Nullable String str2) {
        this.f28407a.logApiCall(a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f28407a.setExtraParameter(str, str2);
    }

    public void setListener(@Nullable MaxAdListener maxAdListener) {
        this.f28407a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f28407a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(@NonNull String str, @Nullable Object obj) {
        this.f28407a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f28407a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f28407a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f28407a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(@Nullable MaxAdRevenueListener maxAdRevenueListener) {
        this.f28407a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f28407a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(@Nullable String str, @Nullable String str2) {
        this.f28407a.logApiCall(a.m("showAd(placement=", str, ", customData=", str2, ")"));
        yp.b(str2, "MaxAppOpenAd");
        this.f28407a.showAd(str, str2, null);
    }

    @NonNull
    public String toString() {
        return "" + this.f28407a;
    }

    public MaxAppOpenAd(@NonNull String str, @NonNull AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, j.l());
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f28407a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(@Nullable String str) {
        showAd(str, null);
    }
}
