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
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.b {
    private static WeakReference b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f12700a;

    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f12700a.logApiCall("destroy()");
        this.f12700a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public Activity getActivity() {
        this.f12700a.logApiCall("getActivity()");
        return (Activity) b.get();
    }

    public String getAdUnitId() {
        return this.f12700a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f12700a.isReady();
        this.f12700a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f12700a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f12700a.logApiCall("loadAd()");
        this.f12700a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f12700a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f12700a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f12700a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f12700a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f12700a.logApiCall(n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f12700a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f12700a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f12700a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f12700a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f12700a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f12700a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f12700a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f12700a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f12700a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f12700a;
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
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
                this.f12700a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12700a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", activity=");
        o3.append(activity);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        zp.b(str2, "MaxInterstitialAd");
        this.f12700a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        showAd((String) null, viewGroup, abstractC0505o, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        showAd(str, null, viewGroup, abstractC0505o, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12700a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o3.append(viewGroup);
        o3.append(", lifecycle=");
        o3.append(abstractC0505o);
        o3.append(", activity=");
        o3.append(activity);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        this.f12700a.showAd(str, str2, viewGroup, abstractC0505o, activity);
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
        this.f12700a.logApiCall(n0.j("showAd(placement=", str, ", customData=", str2, ")"));
        zp.b(str2, "MaxInterstitialAd");
        this.f12700a.showAd(str, str2, getActivity());
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f12700a;
        StringBuilder o3 = o.o("showAd(placement=", str, ", customData=", str2, ", containerView=");
        o3.append(viewGroup);
        o3.append(", lifecycle=");
        o3.append(abstractC0505o);
        o3.append(")");
        maxFullscreenAdImpl.logApiCall(o3.toString());
        this.f12700a.showAd(str, str2, viewGroup, abstractC0505o, getActivity());
    }
}
