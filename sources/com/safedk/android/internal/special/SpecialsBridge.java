package com.safedk.android.internal.special;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;

/* loaded from: classes.dex */
public class SpecialsBridge {
    /* JADX WARN: Multi-variable type inference failed */
    public static void appLovinAdViewRenderAd(AppLovinAdView targetInstance, AppLovinAd appLovinAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewRenderAd(Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/sdk/AppLovinAd;)V");
        if (SafeDK.Y()) {
            Logger.d("SafeDK-Special", "appLovinAdViewRenderAd started, ad: " + appLovinAd);
            try {
                if (AppLovinAdSize.INTERSTITIAL.equals(appLovinAd.getSize())) {
                    String clCode = ((AppLovinAdBase) appLovinAd).getClCode();
                    BrandSafetyEvent.AdFormatType adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                    Logger.d("SafeDK-Special", "appLovinAdViewRenderAd clcode:" + clCode + " ad: " + appLovinAd + " formatType: " + adFormatType);
                    CreativeInfoManager.a(g.f30048a, "clcode=" + clCode + "&", adFormatType, targetInstance);
                }
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewRenderAd failed");
            }
        }
        targetInstance.renderAd(appLovinAd);
    }

    public static void maxAdViewDestroy(MaxAdView targetInstance) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxAdViewDestroy(Lcom/applovin/mediation/ads/MaxAdView;)V");
        if (SafeDK.Y()) {
            try {
                Logger.d("SafeDK-Special", "maxAdViewDestroy started , isOnUiThread = " + k.c());
                CreativeInfoManager.a(targetInstance);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxAdViewDestroy failed");
            }
        }
        targetInstance.destroy();
    }

    public static void maxNativeAdListenerOnNativeAdLoaded(MaxNativeAdListener targetInstance, MaxNativeAdView nativeAdView, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxNativeAdListenerOnNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V");
        targetInstance.onNativeAdLoaded(nativeAdView, ad);
        if (SafeDK.Y()) {
            try {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded Impl started, nativeAdView: " + nativeAdView + ", ad: " + ad + ", isOnUiThread = " + k.c());
                CreativeInfoManager.onMaxNativeAdLoaded(nativeAdView, ad);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded failed", th);
            }
        }
    }

    public static void appLovinAdViewEventListenerAdOpenedFullscreen(AppLovinAdViewEventListener targetInstance, AppLovinAd ad, AppLovinAdView adView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewEventListenerAdOpenedFullscreen(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;)V");
        if (SafeDK.Y()) {
            try {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen started, ad: " + ad + ", adView: " + adView + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.a(g.f30048a, (String) null, (String) null, RedirectEvent.f29829i);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen failed", th);
            }
        }
        targetInstance.adOpenedFullscreen(ad, adView);
    }

    public static void appLovinMaxAdViewAdListenerOnAdExpanded(MaxAdViewAdListener targetInstance, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinMaxAdViewAdListenerOnAdExpanded(Lcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V");
        if (SafeDK.Y()) {
            try {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded started, ad: " + ad + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.f();
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded failed", th);
            }
        }
        targetInstance.onAdExpanded(ad);
    }
}
