package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.input.a;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.yp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f28408b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f28409a;

    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f28409a.logApiCall("destroy()");
        this.f28409a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public Activity getActivity() {
        this.f28409a.logApiCall("getActivity()");
        return (Activity) f28408b.get();
    }

    public String getAdUnitId() {
        return this.f28409a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f28409a.isReady();
        this.f28409a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f28409a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f28409a.logApiCall("loadAd()");
        this.f28409a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f28409a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f28409a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f28409a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f28409a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f28409a.logApiCall(a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f28409a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f28409a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f28409a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f28409a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f28409a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f28409a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f28409a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f28409a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f28409a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f28409a.logApiCall(a.m("showAd(placement=", str, ", customData=", str2, ")"));
        yp.b(str2, "MaxInterstitialAd");
        this.f28409a.showAd(str, str2, getActivity());
    }

    public String toString() {
        return "" + this.f28409a;
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f28408b = new WeakReference((Activity) context);
                }
                this.f28409a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28409a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", activity=");
        t2.append(activity);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        yp.b(str2, "MaxInterstitialAd");
        this.f28409a.showAd(str, str2, activity);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28409a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", containerView=");
        t2.append(viewGroup);
        t2.append(", lifecycle=");
        t2.append(lifecycle);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        this.f28409a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28409a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", containerView=");
        t2.append(viewGroup);
        t2.append(", lifecycle=");
        t2.append(lifecycle);
        t2.append(", activity=");
        t2.append(activity);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        this.f28409a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd((String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, (String) null, viewGroup, lifecycle);
    }
}
