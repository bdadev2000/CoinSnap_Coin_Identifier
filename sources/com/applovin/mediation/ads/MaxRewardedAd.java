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
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f28410b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f28411c = new Object();
    private static WeakReference d = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f28412a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f28412a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f28412a.logApiCall("destroy()");
        synchronized (f28411c) {
            f28410b.remove(this.f28412a.getAdUnitId());
        }
        this.f28412a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public Activity getActivity() {
        this.f28412a.logApiCall("getActivity()");
        return (Activity) d.get();
    }

    public String getAdUnitId() {
        return this.f28412a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f28412a.isReady();
        this.f28412a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f28412a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f28412a.logApiCall("loadAd()");
        this.f28412a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f28412a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f28412a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f28412a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f28412a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f28412a.logApiCall(a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f28412a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f28412a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f28412a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f28412a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f28412a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f28412a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f28412a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f28412a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f28412a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f28412a.logApiCall(a.m("showAd(placement=", str, ", customData=", str2, ")"));
        yp.b(str2, "MaxRewardedAd");
        this.f28412a.showAd(str, str2, getActivity());
    }

    public String toString() {
        return "" + this.f28412a;
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    d = new WeakReference((Activity) context);
                }
                synchronized (f28411c) {
                    try {
                        Map map = f28410b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28412a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", activity=");
        t2.append(activity);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        yp.b(str2, "MaxRewardedAd");
        this.f28412a.showAd(str, str2, activity);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28412a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", containerView=");
        t2.append(viewGroup);
        t2.append(", lifecycle=");
        t2.append(lifecycle);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        this.f28412a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f28412a;
        StringBuilder t2 = a.t("showAd(placement=", str, ", customData=", str2, ", containerView=");
        t2.append(viewGroup);
        t2.append(", lifecycle=");
        t2.append(lifecycle);
        t2.append(", activity=");
        t2.append(activity);
        t2.append(")");
        maxFullscreenAdImpl.logApiCall(t2.toString());
        this.f28412a.showAd(str, str2, viewGroup, lifecycle, activity);
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
