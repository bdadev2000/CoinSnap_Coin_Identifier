package com.applovin.mediation.ads;

import a4.j;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.p;
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
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f9519b = new WeakReference(null);
    private final MaxFullscreenAdImpl a;

    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.a.logApiCall("destroy()");
        this.a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public Activity getActivity() {
        this.a.logApiCall("getActivity()");
        return (Activity) f9519b.get();
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.a.isReady();
        this.a.logApiCall("isReady() " + isReady + " for ad unit id " + this.a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.a.logApiCall("loadAd()");
        this.a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.a.logApiCall(j.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.a;
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
                    f9519b = new WeakReference((Activity) context);
                }
                this.a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.a;
        StringBuilder p10 = j.p("showAd(placement=", str, ", customData=", str2, ", activity=");
        p10.append(activity);
        p10.append(")");
        maxFullscreenAdImpl.logApiCall(p10.toString());
        zp.b(str2, "MaxInterstitialAd");
        this.a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, p pVar, Activity activity) {
        showAd((String) null, viewGroup, pVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, p pVar, Activity activity) {
        showAd(str, null, viewGroup, pVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, p pVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.a;
        StringBuilder p10 = j.p("showAd(placement=", str, ", customData=", str2, ", containerView=");
        p10.append(viewGroup);
        p10.append(", lifecycle=");
        p10.append(pVar);
        p10.append(", activity=");
        p10.append(activity);
        p10.append(")");
        maxFullscreenAdImpl.logApiCall(p10.toString());
        this.a.showAd(str, str2, viewGroup, pVar, activity);
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
        this.a.logApiCall(j.h("showAd(placement=", str, ", customData=", str2, ")"));
        zp.b(str2, "MaxInterstitialAd");
        this.a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, p pVar) {
        showAd((String) null, viewGroup, pVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, p pVar) {
        showAd(str, (String) null, viewGroup, pVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, p pVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.a;
        StringBuilder p10 = j.p("showAd(placement=", str, ", customData=", str2, ", containerView=");
        p10.append(viewGroup);
        p10.append(", lifecycle=");
        p10.append(pVar);
        p10.append(")");
        maxFullscreenAdImpl.logApiCall(p10.toString());
        this.a.showAd(str, str2, viewGroup, pVar, getActivity());
    }
}
