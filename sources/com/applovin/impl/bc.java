package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class bc {
    private static boolean a = true;

    /* renamed from: b */
    private static boolean f3861b = true;

    public static void a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new rs(9, appLovinAdClickListener, appLovinAd));
    }

    public static void b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ct(appLovinAdDisplayListener, appLovinAd, 0));
    }

    public static void c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new zs(appLovinAdRewardListener, appLovinAd, map, 1));
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void o(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd);
    }

    public static /* synthetic */ void s(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        b(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode);
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new ct(appLovinAdDisplayListener, appLovinAd, 1));
    }

    public static void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new zs(appLovinAdRewardListener, appLovinAd, map, 2));
    }

    public static void c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new xs(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 1));
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 7));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 2));
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 6));
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false);
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false);
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new zs(appLovinAdRewardListener, appLovinAd, map, 0));
    }

    public static void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new xs(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 2));
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th2);
        }
    }

    public static /* synthetic */ void f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th2);
        }
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 1));
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 0));
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i10) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new sv(appLovinAdRewardListener, appLovinAd, i10, 1));
    }

    public static void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new at(appLovinBidTokenCollectionListener, str, 1));
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 5));
    }

    public static /* synthetic */ void d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th2);
            c("adHidden", th2);
        }
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new rs(11, appLovinAdVideoPlaybackListener, appLovinAd));
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th2);
            c("adDisplayed", th2);
        }
    }

    public static /* synthetic */ void e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th2);
        }
    }

    public static /* synthetic */ void f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th2);
        }
    }

    public static /* synthetic */ void g(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                return;
            } catch (Throwable th2) {
                a("onRewardedVideoCompleted", th2, z10);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
    }

    public static /* synthetic */ void h(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                return;
            } catch (Throwable th2) {
                a("onRewardedVideoStarted", th2, z10);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d10, final boolean z10) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.dt
            @Override // java.lang.Runnable
            public final void run() {
                bc.b(AppLovinAdVideoPlaybackListener.this, appLovinAd, d10, z10);
            }
        });
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 4));
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new xs(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 0));
    }

    public static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th2);
        }
    }

    public static /* synthetic */ void e(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdHidden", th2, z10);
                c("maxAdHidden", th2);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    public static /* synthetic */ void f(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdLoaded", th2, z10);
                c("maxAdLoaded", th2);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new c3.b(2, appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode));
    }

    public static void b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new bt(z10, maxNativeAdListener, maxAd, 1));
    }

    public static /* synthetic */ void c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th2);
            c("onBidTokenCollected", th2);
        }
    }

    public static void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new at(appLovinBidTokenCollectionListener, str, 0));
        }
    }

    public static /* synthetic */ void b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th2);
            c("adClicked", th2);
        }
    }

    public static /* synthetic */ void d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th2);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof lb) {
            AppLovinSdkUtils.runOnUiThread(new rs(12, appLovinAdDisplayListener, str));
        }
    }

    public static /* synthetic */ void c(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdDisplayed", th2, z10);
                c("maxAdDisplayed", th2);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    public static /* synthetic */ void d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th2);
            c("onBidTokenCollectionFailed", th2);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i10) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i10);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th2);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ws(z10, maxAdListener, maxAd, 3));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th2);
        }
    }

    public static /* synthetic */ void d(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdExpanded", th2, z10);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z10) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxAdListener, maxAd, maxError, 3));
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d10, boolean z10) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d10, z10);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th2);
        }
    }

    private static boolean c(boolean z10) {
        return z10 ? a : f3861b;
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z10) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxAdListener, str, maxError, 6));
    }

    private static void c(String str, Throwable th2) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.A0;
        if (kVar != null) {
            kVar.B().a("ListenerCallbackInvoker", str, th2);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    public static /* synthetic */ void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th2);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str, boolean z10) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ys(z10, maxAdRequestListener, str, 0));
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static /* synthetic */ void b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new ys(z10, maxAdRevenueListener, maxAd, 1));
    }

    public static /* synthetic */ void b(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdCollapsed", th2, z10);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    public static void a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z10) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxAdExpirationListener, maxAd, maxAd2, 4));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new bt(z10, maxNativeAdListener, maxAd, 0));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z10) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxNativeAdListener, str, maxError, 2));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z10) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxNativeAdListener, maxNativeAdView, maxAd, 1));
    }

    public static /* synthetic */ void b(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdExpired", th2, z10);
                c("maxNativeAdExpired", th2);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z10) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z10, new androidx.fragment.app.d(z10, maxAdListener, maxAd, maxReward, 5));
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str, int i10) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new sv(appLovinPostbackListener, str, i10, 2));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new rs(13, appLovinPostbackListener, str));
        }
    }

    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str, int i10) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i10);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i10 + "):", th2);
        }
    }

    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdClicked", th2, z10);
                c("maxAdClicked", th2);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th2);
        }
    }

    public static void b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new rs(10, appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (c(z10)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (Throwable th2) {
                a("onAdDisplayFailed", th2, z10);
                c("maxAdDisplayFailed", th2);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    public static void b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new rs(14, appLovinNativeAdLoadListener, appLovinError));
        }
    }

    public static void b(boolean z10) {
        a = z10;
    }

    private static void b(String str, Throwable th2) {
        com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th2);
    }

    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (c(z10)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th2) {
                a("onAdLoadFailed", th2, z10);
                c("maxAdLoadFailed", th2);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    public static /* synthetic */ void a(boolean z10, MaxAdRequestListener maxAdRequestListener, String str) {
        if (c(z10)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (Throwable th2) {
                a("onAdRequestStarted", th2, z10);
                c("maxAdRequestStarted", th2);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    public static /* synthetic */ void a(boolean z10, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (Throwable th2) {
                a("onAdRevenuePaid", th2, z10);
                c("maxAdPaidRevenue", th2);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    public static /* synthetic */ void a(boolean z10, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (c(z10)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (Throwable th2) {
                a("onExpiredAdReloaded", th2, z10);
                c("maxExpiredAdReloaded", th2);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdClicked", th2, z10);
                c("maxNativeAdClicked", th2);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th2) {
                a("onNativeAdLoadFailed", th2, z10);
                c("maxNativeAdLoadFailed", th2);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (Throwable th2) {
                a("onNativeAdLoaded", th2, z10);
                c("maxNativeAdLoaded", th2);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (Throwable th2) {
                a("onUserRewarded", th2, z10);
                c("maxRewardedUser", th2);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    public static /* synthetic */ void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th2);
            c("adReviewCreativeIdGenerated", th2);
        }
    }

    public static /* synthetic */ void a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th2);
            c("nativeAdClicked", th2);
        }
    }

    public static /* synthetic */ void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th2);
            c("nativeAdLoadFailed", th2);
        }
    }

    private static void a(String str, Throwable th2, boolean z10) {
        if (z10) {
            b(str, th2);
        } else {
            a(str, th2);
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z10) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new yv(3, maxAdReviewListener, str, maxAd));
        }
    }

    private static AppLovinAd a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void a(boolean z10) {
        f3861b = z10;
    }

    private static void a(String str, Throwable th2) {
        com.applovin.impl.sdk.t.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th2);
    }
}
