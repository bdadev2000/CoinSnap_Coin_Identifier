package com.applovin.mediation.ads;

import Q7.n0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.b {
    private static WeakReference b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f12704a;

    public MaxRewardedInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f12704a.logApiCall("destroy()");
        this.f12704a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public Activity getActivity() {
        this.f12704a.logApiCall("getActivity()");
        return (Activity) b.get();
    }

    public boolean isReady() {
        boolean isReady = this.f12704a.isReady();
        this.f12704a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f12704a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f12704a.logApiCall("loadAd()");
        this.f12704a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f12704a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f12704a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f12704a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f12704a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f12704a.logApiCall(n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f12704a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f12704a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f12704a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f12704a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f12704a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f12704a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f12704a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f12704a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f12704a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f12704a;
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    b = new WeakReference((Activity) context);
                }
                this.f12704a = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12704a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", activity=");
        o3.append(activity);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        this.f12704a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        showAd((String) null, viewGroup, abstractC0505o, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        showAd(str, null, viewGroup, abstractC0505o, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12704a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o3.append(viewGroup);
        o3.append(", lifecycle=");
        o3.append(abstractC0505o);
        o3.append(", activity=");
        o3.append(activity);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        this.f12704a.showAd(str, str2, viewGroup, abstractC0505o, activity);
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
    public void showAd(String str, String str2) {
        this.f12704a.logApiCall(n0.j("showAd(placement=", str, ", customData=", str2, ")"));
        this.f12704a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, AbstractC0505o abstractC0505o) {
        showAd((String) null, viewGroup, abstractC0505o);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, AbstractC0505o abstractC0505o) {
        showAd(str, (String) null, viewGroup, abstractC0505o);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC0505o abstractC0505o) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12704a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o3.append(viewGroup);
        o3.append(", lifecycle=");
        o3.append(abstractC0505o);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        this.f12704a.showAd(str, str2, viewGroup, abstractC0505o, getActivity());
    }
}
