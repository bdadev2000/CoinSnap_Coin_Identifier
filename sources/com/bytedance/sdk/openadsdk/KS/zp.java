package com.bytedance.sdk.openadsdk.KS;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.ox;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
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
import com.bytedance.sdk.openadsdk.apiImpl.jU.lMd;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.nativeexpress.COT;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class zp implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.KS.zp.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                if (pAGBannerRequest.getAdSize() != null) {
                    codeId.setExpressViewAcceptedSize(r0.getWidth(), r0.getHeight());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.apiImpl.zp.zp zpVar = new com.bytedance.sdk.openadsdk.apiImpl.zp.zp(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(new ku("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.KS.zp.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!KVG.jU().woN() && YhE.pvr()) {
                            zpVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(zpVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            zpVar.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        build.setDurationSlotType(1);
                        COT.zp(KVG.zp()).zp(build, 1, zpVar, 5000);
                    }
                }, zpVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.KS.zp.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.apiImpl.lMd.zp zpVar = new com.bytedance.sdk.openadsdk.apiImpl.lMd.zp(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(new ku("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.KS.zp.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!KVG.jU().woN() && YhE.pvr()) {
                            zpVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!com.bytedance.sdk.openadsdk.utils.KVG.zp(com.bytedance.sdk.openadsdk.utils.KVG.zp, "load_interstitial_ad")) {
                            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                            if (pAGInterstitialAdLoadListener2 != null) {
                                pAGInterstitialAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(zpVar)) {
                            return;
                        }
                        if (build == null) {
                            zpVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method zp = ox.zp("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                            if (zp != null) {
                                zp.invoke(null, KVG.zp(), build, zpVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, zpVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.KS.zp.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                String str2;
                if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.apiImpl.feed.COT cot = new com.bytedance.sdk.openadsdk.apiImpl.feed.COT(pAGNativeAdLoadListener);
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (pAGNativeRequest != null) {
                    str2 = pAGNativeRequest.getAdString();
                } else {
                    str2 = null;
                }
                AdSlot.Builder withBid = codeId.withBid(str2);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(new ku("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.KS.zp.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!KVG.jU().woN() && YhE.pvr()) {
                            cot.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(cot)) {
                            return;
                        }
                        if (build == null) {
                            cot.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method zp = ox.zp("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                            if (zp != null) {
                                zp.invoke(null, KVG.zp(), build, cot);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, cot, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.KS.zp.1
            private int lMd;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.lMd = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.apiImpl.KS.zp zpVar = new com.bytedance.sdk.openadsdk.apiImpl.KS.zp(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(new ku("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.KS.zp.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!KVG.jU().woN() && YhE.pvr()) {
                                zpVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(zpVar)) {
                                return;
                            }
                            if (build == null) {
                                zpVar.onError(-4, "adslot is null");
                                return;
                            }
                            Method zp = ox.zp("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                            if (zp != null) {
                                zp.invoke(null, KVG.zp(), build, zpVar, Integer.valueOf(AnonymousClass1.this.lMd));
                            }
                        } catch (Throwable th) {
                            tG.zp("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, zpVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.KS.zp.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final lMd lmd = new lMd(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.zp.zp(new ku("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.KS.zp.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!KVG.jU().woN() && YhE.pvr()) {
                            lmd.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!com.bytedance.sdk.openadsdk.utils.KVG.zp(com.bytedance.sdk.openadsdk.utils.KVG.zp, "load_reward_ad")) {
                            PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                            if (pAGRewardedAdLoadListener2 != null) {
                                pAGRewardedAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.zp.zp(lmd)) {
                            return;
                        }
                        if (build == null) {
                            lmd.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method zp = ox.zp("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                            if (zp != null) {
                                zp.invoke(null, KVG.zp(), build, lmd);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, lmd, build);
            }
        };
    }
}
