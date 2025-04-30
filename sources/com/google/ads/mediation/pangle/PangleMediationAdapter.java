package com.google.ads.mediation.pangle;

import a3.C0339a;
import a3.c;
import a3.d;
import a3.e;
import a3.f;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import b3.C0557b;
import b3.C0558c;
import b3.C0560e;
import b3.C0561f;
import b3.C0563h;
import b3.C0566k;
import b3.C0568m;
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
import n1.C2475f;
import w4.v0;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: g, reason: collision with root package name */
    public static int f13877g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f13878h = -1;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final f f13879c;

    /* renamed from: d, reason: collision with root package name */
    public final C0339a f13880d;

    /* renamed from: f, reason: collision with root package name */
    public final e f13881f;

    /* JADX WARN: Type inference failed for: r0v2, types: [a3.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [a3.a, java.lang.Object] */
    public PangleMediationAdapter() {
        if (c.f3952f == null) {
            c.f3952f = new c();
        }
        this.b = c.f3952f;
        ?? obj = new Object();
        this.f13879c = obj;
        this.f13880d = new Object();
        this.f13881f = new e(obj);
    }

    public static int getDoNotSell() {
        return f13878h;
    }

    public static int getGDPRConsent() {
        return f13877g;
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i9) {
        if (i9 != 0 && i9 != 1 && i9 != -1) {
            Log.w(TAG, "Invalid CCPA value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            PAGConfig.setDoNotSell(i9);
        }
        f13878h = i9;
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i9) {
        if (i9 != 1 && i9 != 0 && i9 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            PAGConfig.setGDPRConsent(i9);
        }
        f13877g = i9;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        f fVar = this.f13879c;
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            String string = networkExtras.getString("user_data", "");
            fVar.getClass();
            PAGConfig.setUserData(string);
        }
        C2475f c2475f = new C2475f(signalCallbacks, 22);
        fVar.getClass();
        PAGSdk.getBiddingToken(c2475f);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.f13879c.getClass();
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
        Log.w(TAG, AbstractC2914a.e("Unexpected SDK version format: ", sDKVersion, ". Returning 0.0.0 for SDK version."));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "6.0.0.3.0".split("\\.");
        if (split.length >= 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(TAG, "Unexpected adapter version format: 6.0.0.3.0. Returning 0.0.0 for adapter version.");
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
            AdError h6 = v0.h(101, "Missing or invalid App ID.");
            Log.w(TAG, h6.toString());
            initializationCompleteCallback.onInitializationFailed(h6.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
        }
        this.f13881f.a(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        this.b.a(context, str, new d(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        C0339a c0339a = this.f13880d;
        c0339a.getClass();
        c cVar = this.b;
        f fVar = this.f13879c;
        e eVar = this.f13881f;
        C0558c c0558c = new C0558c(mediationAppOpenAdConfiguration, mediationAdLoadCallback, cVar, fVar, c0339a, eVar);
        eVar.a(mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError h6 = v0.h(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, h6.toString());
            mediationAdLoadCallback.onFailure(h6);
        } else {
            cVar.a(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C0557b(mediationAppOpenAdConfiguration.getBidResponse(), 0, string, c0558c));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        C0339a c0339a = this.f13880d;
        c0339a.getClass();
        c cVar = this.b;
        f fVar = this.f13879c;
        e eVar = this.f13881f;
        C0561f c0561f = new C0561f(mediationBannerAdConfiguration, mediationAdLoadCallback, cVar, fVar, c0339a, eVar);
        eVar.a(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError h6 = v0.h(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, h6.toString());
            mediationAdLoadCallback.onFailure(h6);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            cVar.a(context, serverParameters.getString("appid"), new C0560e(c0561f, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C0339a c0339a = this.f13880d;
        c0339a.getClass();
        c cVar = this.b;
        f fVar = this.f13879c;
        e eVar = this.f13881f;
        C0563h c0563h = new C0563h(mediationInterstitialAdConfiguration, mediationAdLoadCallback, cVar, fVar, c0339a, eVar);
        eVar.a(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError h6 = v0.h(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, h6.toString());
            mediationAdLoadCallback.onFailure(h6);
        } else {
            cVar.a(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new C0557b(mediationInterstitialAdConfiguration.getBidResponse(), 1, string, c0563h));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        C0339a c0339a = this.f13880d;
        c0339a.getClass();
        C0566k c0566k = new C0566k(mediationNativeAdConfiguration, mediationAdLoadCallback, this.b, this.f13879c, c0339a, this.f13881f);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = c0566k.b;
        c0566k.f5307h.a(mediationNativeAdConfiguration2.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationNativeAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError h6 = v0.h(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, h6.toString());
            c0566k.f5303c.onFailure(h6);
        } else {
            String bidResponse = mediationNativeAdConfiguration2.getBidResponse();
            c0566k.f5304d.a(mediationNativeAdConfiguration2.getContext(), serverParameters.getString("appid"), new C0557b(bidResponse, 2, string, c0566k));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C0339a c0339a = this.f13880d;
        c0339a.getClass();
        c cVar = this.b;
        f fVar = this.f13879c;
        e eVar = this.f13881f;
        C0568m c0568m = new C0568m(mediationRewardedAdConfiguration, mediationAdLoadCallback, cVar, fVar, c0339a, eVar);
        eVar.a(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError h6 = v0.h(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, h6.toString());
            mediationAdLoadCallback.onFailure(h6);
        } else {
            cVar.a(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new C0557b(mediationRewardedAdConfiguration.getBidResponse(), 3, string, c0568m));
        }
    }
}
