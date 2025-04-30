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

    /* renamed from: a */
    private static boolean f6843a = true;
    private static boolean b = true;

    public static /* synthetic */ void Q(boolean z8, MaxAdRequestListener maxAdRequestListener, String str) {
        a(z8, maxAdRequestListener, str);
    }

    public static void a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new F(11, appLovinAdClickListener, appLovinAd));
    }

    public static void b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new O(appLovinAdDisplayListener, appLovinAd, 0));
    }

    public static void c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new U(appLovinAdRewardListener, appLovinAd, map, 1));
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

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false);
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void k(boolean z8, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(z8, maxAdRevenueListener, maxAd);
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new O(appLovinAdDisplayListener, appLovinAd, 1));
    }

    public static void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new U(appLovinAdRewardListener, appLovinAd, map, 2));
    }

    public static void c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new T(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 1));
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 7));
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 5));
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 6));
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 4));
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 2));
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new U(appLovinAdRewardListener, appLovinAd, map, 0));
    }

    public static void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new T(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 2));
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    public static /* synthetic */ void f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i9) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new I2(i9, appLovinAdRewardListener, appLovinAd, 2));
    }

    public static void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new V(appLovinBidTokenCollectionListener, str, 0));
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 1));
    }

    public static /* synthetic */ void d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            c("adHidden", th);
        }
    }

    public static /* synthetic */ void g(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                return;
            } catch (Throwable th) {
                a("onRewardedVideoCompleted", th, z8);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
    }

    public static /* synthetic */ void h(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                return;
            } catch (Throwable th) {
                a("onRewardedVideoStarted", th, z8);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new F(14, appLovinAdVideoPlaybackListener, appLovinAd));
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            c("adDisplayed", th);
        }
    }

    public static /* synthetic */ void e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    public static /* synthetic */ void f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d2, final boolean z8) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.W
            @Override // java.lang.Runnable
            public final void run() {
                bc.b(AppLovinAdVideoPlaybackListener.this, appLovinAd, d2, z8);
            }
        });
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 3));
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new T(appLovinAdViewEventListener, appLovinAd, appLovinAdView, 0));
    }

    public static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    public static /* synthetic */ void e(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxAdListener.onAdHidden(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdHidden", th, z8);
                c("maxAdHidden", th);
                return;
            }
        }
        maxAdListener.onAdHidden(maxAd);
    }

    public static /* synthetic */ void f(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdLoaded", th, z8);
                c("maxAdLoaded", th);
                return;
            }
        }
        maxAdListener.onAdLoaded(maxAd);
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new I2.f(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode, 2));
    }

    public static void b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new S(z8, maxNativeAdListener, maxAd, 1));
    }

    public static /* synthetic */ void c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            c("onBidTokenCollected", th);
        }
    }

    public static void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new V(appLovinBidTokenCollectionListener, str, 1));
        }
    }

    public static /* synthetic */ void b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            c("adClicked", th);
        }
    }

    public static /* synthetic */ void d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof lb) {
            AppLovinSdkUtils.runOnUiThread(new F(13, appLovinAdDisplayListener, str));
        }
    }

    public static /* synthetic */ void c(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdDisplayed", th, z8);
                c("maxAdDisplayed", th);
                return;
            }
        }
        maxAdListener.onAdDisplayed(maxAd);
    }

    public static /* synthetic */ void d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            c("onBidTokenCollectionFailed", th);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static /* synthetic */ void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i9) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i9);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new Q(z8, maxAdListener, maxAd, 0));
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    public static /* synthetic */ void d(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdExpanded", th, z8);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z8) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxAdListener, maxAd, maxError, 3));
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d2, boolean z8) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d2, z8);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    private static boolean c(boolean z8) {
        return z8 ? f6843a : b;
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z8) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxAdListener, str, maxError, 4));
    }

    private static void c(String str, Throwable th) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f10832A0;
        if (kVar != null) {
            kVar.B().a("ListenerCallbackInvoker", str, th);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    public static /* synthetic */ void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str, boolean z8) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new U4.v(1, maxAdRequestListener, str, z8));
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static /* synthetic */ void b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new U4.v(2, maxAdRevenueListener, maxAd, z8));
    }

    public static /* synthetic */ void b(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdCollapsed", th, z8);
                return;
            }
        }
        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
    }

    public static void a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z8) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxAdExpirationListener, maxAd, maxAd2, 0));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new S(z8, maxNativeAdListener, maxAd, 0));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z8) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxNativeAdListener, str, maxError, 5));
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z8) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxNativeAdListener, maxNativeAdView, maxAd));
    }

    public static /* synthetic */ void b(boolean z8, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdExpired", th, z8);
                c("maxNativeAdExpired", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdExpired(maxAd);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z8) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z8, new P(z8, maxAdListener, maxAd, maxReward, 1));
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str, int i9) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new I2(i9, appLovinPostbackListener, str, 1));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new F(12, appLovinPostbackListener, str));
        }
    }

    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str, int i9) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i9);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i9 + "):", th);
        }
    }

    public static /* synthetic */ void a(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxAdListener.onAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdClicked", th, z8);
                c("maxAdClicked", th);
                return;
            }
        }
        maxAdListener.onAdClicked(maxAd);
    }

    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    public static void b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new F(10, appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    public static /* synthetic */ void a(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (c(z8)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
                return;
            } catch (Throwable th) {
                a("onAdDisplayFailed", th, z8);
                c("maxAdDisplayFailed", th);
                return;
            }
        }
        maxAdListener.onAdDisplayFailed(maxAd, maxError);
    }

    public static void b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new F(9, appLovinNativeAdLoadListener, appLovinError));
        }
    }

    public static void b(boolean z8) {
        f6843a = z8;
    }

    private static void b(String str, Throwable th) {
        com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    public static /* synthetic */ void a(boolean z8, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (c(z8)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                a("onAdLoadFailed", th, z8);
                c("maxAdLoadFailed", th);
                return;
            }
        }
        maxAdListener.onAdLoadFailed(str, maxError);
    }

    public static /* synthetic */ void a(boolean z8, MaxAdRequestListener maxAdRequestListener, String str) {
        if (c(z8)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
                return;
            } catch (Throwable th) {
                a("onAdRequestStarted", th, z8);
                c("maxAdRequestStarted", th);
                return;
            }
        }
        maxAdRequestListener.onAdRequestStarted(str);
    }

    public static /* synthetic */ void a(boolean z8, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
                return;
            } catch (Throwable th) {
                a("onAdRevenuePaid", th, z8);
                c("maxAdPaidRevenue", th);
                return;
            }
        }
        maxAdRevenueListener.onAdRevenuePaid(maxAd);
    }

    public static /* synthetic */ void a(boolean z8, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (c(z8)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
                return;
            } catch (Throwable th) {
                a("onExpiredAdReloaded", th, z8);
                c("maxExpiredAdReloaded", th);
                return;
            }
        }
        maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
    }

    public static /* synthetic */ void a(boolean z8, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdClicked", th, z8);
                c("maxNativeAdClicked", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdClicked(maxAd);
    }

    public static /* synthetic */ void a(boolean z8, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (c(z8)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                return;
            } catch (Throwable th) {
                a("onNativeAdLoadFailed", th, z8);
                c("maxNativeAdLoadFailed", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
    }

    public static /* synthetic */ void a(boolean z8, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (c(z8)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                return;
            } catch (Throwable th) {
                a("onNativeAdLoaded", th, z8);
                c("maxNativeAdLoaded", th);
                return;
            }
        }
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
    }

    public static /* synthetic */ void a(boolean z8, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (c(z8)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                return;
            } catch (Throwable th) {
                a("onUserRewarded", th, z8);
                c("maxRewardedUser", th);
                return;
            }
        }
        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
    }

    public static /* synthetic */ void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            c("adReviewCreativeIdGenerated", th);
        }
    }

    public static /* synthetic */ void a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            c("nativeAdClicked", th);
        }
    }

    public static /* synthetic */ void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            c("nativeAdLoadFailed", th);
        }
    }

    private static void a(String str, Throwable th, boolean z8) {
        if (z8) {
            b(str, th);
        } else {
            a(str, th);
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z8) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z8, new O2(maxAdReviewListener, str, maxAd, 3));
        }
    }

    private static AppLovinAd a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void a(boolean z8) {
        b = z8;
    }

    private static void a(String str, Throwable th) {
        com.applovin.impl.sdk.t.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }
}
