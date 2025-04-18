package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 110;
    static final String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    static final String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATON_AD_NOT_READY = 106;
    private static final String TAG = "AppLovinMediationAdapter";

    @Nullable
    public static AppLovinSdkSettings appLovinSdkSettings;
    private c bannerAd;
    private r rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private p waterfallInterstitialAd;
    private final f appLovinInitializer = f.a();
    private final a appLovinAdFactory = new a();
    private final n appLovinSdkWrapper = new n();
    private final m appLovinSdkUtilsWrapper = new m();

    @NonNull
    public static AppLovinSdkSettings getSdkSettings(@NonNull Context context) {
        if (appLovinSdkSettings == null) {
            appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        return appLovinSdkSettings;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        MediationConfiguration configuration = rtbSignalData.getConfiguration();
        if (configuration.getFormat() == AdFormat.NATIVE) {
            AdError adError = new AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            signalCallbacks.onFailure(adError);
            return;
        }
        String str = TAG;
        Log.i(str, "Extras for signal collection: " + rtbSignalData.getNetworkExtras());
        String bidToken = this.appLovinInitializer.c(rtbSignalData.getContext(), configuration.getServerParameters()).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            AdError adError2 = new AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
            Log.e(str, adError2.getMessage());
            signalCallbacks.onFailure(adError2);
        } else {
            Log.i(str, "Generated bid token: " + bidToken);
            signalCallbacks.onSuccess(bidToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.appLovinSdkWrapper.getClass();
        String str = AppLovinSdk.VERSION;
        String[] split = str.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            HashSet hashSet2 = new HashSet();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.appLovinInitializer.b(context, (String) it2.next(), new h(hashSet2, hashSet, initializationCompleteCallback));
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        f fVar = this.appLovinInitializer;
        c cVar = new c(mediationBannerAdConfiguration, mediationAdLoadCallback, fVar, this.appLovinAdFactory);
        this.bannerAd = cVar;
        cVar.f11444d = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
            Log.e(com.mbridge.msdk.foundation.controller.a.a, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(cVar.f11444d, adSize);
        if (appLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, ERROR_MSG_BANNER_SIZE_MISMATCH, ERROR_DOMAIN);
            Log.e(com.mbridge.msdk.foundation.controller.a.a, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        fVar.b(cVar.f11444d, string, new q(cVar, serverParameters, appLovinAdSizeFromAdMobAdSize, 1));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        p pVar = new p(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.waterfallInterstitialAd = pVar;
        pVar.f11464c = pVar.interstitialAdConfiguration.getContext();
        Bundle serverParameters = pVar.interstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(g.TAG, adError.getMessage());
            pVar.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                pVar.f11466f = true;
            }
            pVar.appLovinInitializer.b(pVar.f11464c, string, new o(pVar, serverParameters));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        r rVar = new r(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rewardedRenderer = rVar;
        Context context = rVar.adConfiguration.getContext();
        Bundle serverParameters = rVar.adConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(l.TAG, adError.toString());
            rVar.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                rVar.f11472c = true;
            }
            rVar.appLovinInitializer.b(context, string, new q(rVar, serverParameters, context, 0));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd();
    }

    @NonNull
    VersionInfo getVersionInfo(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new VersionInfo(0, 0, 0);
    }
}
