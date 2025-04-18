package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.d;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import y6.a;
import y6.c;
import y6.e;
import y6.f;
import z6.b;
import z6.h;
import z6.k;
import z6.m;

/* loaded from: classes3.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: g, reason: collision with root package name */
    public static int f11481g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f11482h = -1;

    /* renamed from: b, reason: collision with root package name */
    public final c f11483b;

    /* renamed from: c, reason: collision with root package name */
    public final f f11484c;

    /* renamed from: d, reason: collision with root package name */
    public final a f11485d;

    /* renamed from: f, reason: collision with root package name */
    public final e f11486f;

    public PangleMediationAdapter() {
        if (c.f27931f == null) {
            c.f27931f = new c();
        }
        this.f11483b = c.f27931f;
        f fVar = new f();
        this.f11484c = fVar;
        this.f11485d = new a();
        this.f11486f = new e(fVar);
    }

    public static int getDoNotSell() {
        return f11482h;
    }

    public static int getGDPRConsent() {
        return f11481g;
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
        if (i10 != 0 && i10 != 1 && i10 != -1) {
            Log.w(TAG, "Invalid CCPA value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            PAGConfig.setDoNotSell(i10);
        }
        f11482h = i10;
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        if (i10 != 1 && i10 != 0 && i10 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            PAGConfig.setGDPRConsent(i10);
        }
        f11481g = i10;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        f fVar = this.f11484c;
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            String string = networkExtras.getString("user_data", "");
            fVar.getClass();
            PAGConfig.setUserData(string);
        }
        r4.c cVar = new r4.c(5, this, signalCallbacks);
        fVar.getClass();
        PAGSdk.getBiddingToken(cVar);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.f11484c.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length >= 3) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[2]);
            if (split.length >= 4) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[3]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "6.3.0.4.0".split("\\.");
        if (split.length >= 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "6.3.0.4.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError i10 = d.i(101, "Missing or invalid App ID.");
            Log.w(TAG, i10.toString());
            initializationCompleteCallback.onInitializationFailed(i10.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.f11486f.a(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            this.f11483b.a(context, str, new y6.d(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        c cVar = this.f11483b;
        f fVar = this.f11484c;
        e eVar = this.f11486f;
        a aVar = this.f11485d;
        aVar.getClass();
        z6.c cVar2 = new z6.c(mediationAppOpenAdConfiguration, mediationAdLoadCallback, cVar, fVar, aVar, eVar);
        eVar.a(mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError i10 = d.i(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, i10.toString());
            mediationAdLoadCallback.onFailure(i10);
        } else {
            cVar.a(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new b(mediationAppOpenAdConfiguration.getBidResponse(), 0, string, cVar2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        c cVar = this.f11483b;
        f fVar = this.f11484c;
        e eVar = this.f11486f;
        a aVar = this.f11485d;
        aVar.getClass();
        z6.f fVar2 = new z6.f(mediationBannerAdConfiguration, mediationAdLoadCallback, cVar, fVar, aVar, eVar);
        eVar.a(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError i10 = d.i(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, i10.toString());
            mediationAdLoadCallback.onFailure(i10);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            cVar.a(context, serverParameters.getString("appid"), new z6.e(fVar2, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        c cVar = this.f11483b;
        f fVar = this.f11484c;
        e eVar = this.f11486f;
        a aVar = this.f11485d;
        aVar.getClass();
        h hVar = new h(mediationInterstitialAdConfiguration, mediationAdLoadCallback, cVar, fVar, aVar, eVar);
        eVar.a(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError i10 = d.i(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, i10.toString());
            mediationAdLoadCallback.onFailure(i10);
        } else {
            cVar.a(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new b(mediationInterstitialAdConfiguration.getBidResponse(), 1, string, hVar));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        c cVar = this.f11483b;
        f fVar = this.f11484c;
        e eVar = this.f11486f;
        a aVar = this.f11485d;
        aVar.getClass();
        k kVar = new k(mediationNativeAdConfiguration, mediationAdLoadCallback, cVar, fVar, aVar, eVar);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = kVar.f28550b;
        kVar.f28555h.a(mediationNativeAdConfiguration2.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationNativeAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError i10 = d.i(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, i10.toString());
            kVar.f28551c.onFailure(i10);
        } else {
            String bidResponse = mediationNativeAdConfiguration2.getBidResponse();
            kVar.f28552d.a(mediationNativeAdConfiguration2.getContext(), serverParameters.getString("appid"), new b(bidResponse, 2, string, kVar));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        c cVar = this.f11483b;
        f fVar = this.f11484c;
        e eVar = this.f11486f;
        a aVar = this.f11485d;
        aVar.getClass();
        m mVar = new m(mediationRewardedAdConfiguration, mediationAdLoadCallback, cVar, fVar, aVar, eVar);
        eVar.a(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError i10 = d.i(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, i10.toString());
            mediationAdLoadCallback.onFailure(i10);
        } else {
            cVar.a(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new b(mediationRewardedAdConfiguration.getBidResponse(), 3, string, mVar));
        }
    }
}
