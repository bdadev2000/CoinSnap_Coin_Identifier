package com.bytedance.sdk.openadsdk.wN;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.VOe;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.YFl.Sg.wN;
import com.bytedance.sdk.openadsdk.YFl.wN.Sg;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.qsH.DSW;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class YFl implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.wN.YFl.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                if (pAGBannerRequest.getAdSize() != null) {
                    codeId.setExpressViewAcceptedSize(r0.getWidth(), r0.getHeight());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.YFl.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.YFl.YFl.YFl(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(new qsH("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.wN.YFl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lG.AlY().rkt() && Sco.qO()) {
                            yFl.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(yFl)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            yFl.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        build.setDurationSlotType(1);
                        DSW.YFl(lG.YFl()).YFl(build, 1, yFl, 5000);
                    }
                }, yFl, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.wN.YFl.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.YFl.tN.YFl yFl = new com.bytedance.sdk.openadsdk.YFl.tN.YFl(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(new qsH("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.wN.YFl.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lG.AlY().rkt() && Sco.qO()) {
                            yFl.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(yFl)) {
                            return;
                        }
                        if (build == null) {
                            yFl.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method YFl = VOe.YFl("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                            if (YFl != null) {
                                YFl.invoke(null, lG.YFl(), build, yFl);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, yFl, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.wN.YFl.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                String str2;
                if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final wN wNVar = new wN(pAGNativeAdLoadListener);
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (pAGNativeRequest != null) {
                    str2 = pAGNativeRequest.getAdString();
                } else {
                    str2 = null;
                }
                AdSlot.Builder withBid = codeId.withBid(str2);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(new qsH("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.wN.YFl.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lG.AlY().rkt() && Sco.qO()) {
                            wNVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(wNVar)) {
                            return;
                        }
                        if (build == null) {
                            wNVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method YFl = VOe.YFl("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                            if (YFl != null) {
                                YFl.invoke(null, lG.YFl(), build, wNVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, wNVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.wN.YFl.1
            private int Sg;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.Sg = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.YFl.AlY.YFl yFl = new com.bytedance.sdk.openadsdk.YFl.AlY.YFl(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(new qsH("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.wN.YFl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!lG.AlY().rkt() && Sco.qO()) {
                                yFl.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(yFl)) {
                                return;
                            }
                            if (build == null) {
                                yFl.onError(-4, "adslot is null");
                                return;
                            }
                            Method YFl = VOe.YFl("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                            if (YFl != null) {
                                YFl.invoke(null, lG.YFl(), build, yFl, Integer.valueOf(AnonymousClass1.this.Sg));
                            }
                        } catch (Throwable th2) {
                            YoT.YFl("ADNFactory", "open component maybe not exist, please check", th2);
                        }
                    }
                }, yFl, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.wN.YFl.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final Sg sg2 = new Sg(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.YFl.YFl.YFl(new qsH("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.wN.YFl.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lG.AlY().rkt() && Sco.qO()) {
                            sg2.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.YFl.YFl.YFl(sg2)) {
                            return;
                        }
                        if (build == null) {
                            sg2.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method YFl = VOe.YFl("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                            if (YFl != null) {
                                YFl.invoke(null, lG.YFl(), build, sg2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, sg2, build);
            }
        };
    }
}
