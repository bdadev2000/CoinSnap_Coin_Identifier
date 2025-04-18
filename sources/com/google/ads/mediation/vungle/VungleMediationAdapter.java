package com.google.ads.mediation.vungle;

import a4.k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import c7.a;
import c7.b;
import c7.c;
import c7.e;
import c7.h;
import c7.j;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
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
import com.vungle.ads.c0;
import com.vungle.ads.d;
import com.vungle.ads.h2;
import com.vungle.ads.j2;
import com.vungle.ads.l3;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.mediation.VungleInterstitialAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, j2 {
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_VUNGLE_BANNER_NULL = 106;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private d adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private h2 rewardedAd;
    private a rtbAppOpenAd;
    private c rtbBannerAd;
    private e rtbInterstitialAd;
    private h rtbNativeAd;
    private j rtbRewardedAd;
    private j rtbRewardedInterstitialAd;
    private String userId;
    private final a7.a vungleFactory = new a7.a();
    private d7.a waterfallAppOpenAd;

    @NonNull
    public static AdError getAdError(@NonNull n3 n3Var) {
        return new AdError(n3Var.getCode(), n3Var.getErrorMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    public static String getAdapterVersion() {
        return "7.3.2.0";
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Context context = rtbSignalData.getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        String biddingToken = l3.Companion.getBiddingToken(context);
        if (TextUtils.isEmpty(biddingToken)) {
            AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            signalCallbacks.onFailure(adError);
        } else {
            Log.d(TAG, "Liftoff Monetize bidding token=" + biddingToken);
            signalCallbacks.onSuccess(biddingToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = l3.Companion.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String adapterVersion = getAdapterVersion();
        String[] split = adapterVersion.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (l3.Companion.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
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
            if (initializationCompleteCallback != null) {
                AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
                Log.w(TAG, adError.toString());
                initializationCompleteCallback.onInitializationFailed(adError.toString());
                return;
            }
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str));
        }
        a7.c.f306c.a(str, context, new a7.d(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        d7.a aVar = new d7.a(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.waterfallAppOpenAd = aVar;
        aVar.c();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadNativeAd()...");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        h hVar = new h(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = hVar;
        hVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.vungleFactory.getClass();
        this.adConfig = new d();
        if (mediationExtras != null && mediationExtras.containsKey("adOrientation")) {
            this.adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        Context context = mediationRewardedAdConfiguration.getContext();
        cVar.a(string, context, new a7.e(this, context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        a aVar = new a(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbAppOpenAd = aVar;
        aVar.c();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbBannerAd()...");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationBannerAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        c cVar2 = new c(mediationBannerAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = cVar2;
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.e(str, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.e(str, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        c0 vungleBannerAdSizeFromGoogleAdSize = VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, String.format("The requested banner size: %s is not supported by Vungle SDK.", adSize), ERROR_DOMAIN);
            Log.e(str, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        cVar.a(string, context, new b(cVar2, context, string2, adSize, vungleBannerAdSizeFromGoogleAdSize, mediationBannerAdConfiguration.getBidResponse(), mediationBannerAdConfiguration.getWatermark()));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbInterstitialAd()...");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        a7.a aVar = this.vungleFactory;
        e eVar = new e(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
        this.rtbInterstitialAd = eVar;
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(str, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            Log.w(str, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        aVar.getClass();
        d dVar = new d();
        if (mediationExtras.containsKey("adOrientation")) {
            dVar.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            dVar.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        cVar.a(string, context, new c7.d(eVar, context, string2, dVar, bidResponse, 0));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbNativeAd()...");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        h hVar = new h(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = hVar;
        hVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        j jVar = new j(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = jVar;
        jVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        a7.c cVar = a7.c.f306c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        cVar.getClass();
        a7.c.b(taggedForChildDirectedTreatment);
        j jVar = new j(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = jVar;
        jVar.a();
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdClicked(@NonNull o0 o0Var) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad was clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdEnd(@NonNull o0 o0Var) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has ended.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdFailedToLoad(@NonNull o0 o0Var, @NonNull n3 n3Var) {
        AdError adError = getAdError(n3Var);
        Log.w(TAG, "Failed to load waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdFailedToPlay(@NonNull o0 o0Var, @NonNull n3 n3Var) {
        AdError adError = getAdError(n3Var);
        Log.w(TAG, "Failed to play waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdImpression(@NonNull o0 o0Var) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdLeftApplication(@NonNull o0 o0Var) {
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdLoaded(@NonNull o0 o0Var) {
        Log.d(TAG, "Loaded waterfall rewarded ad from Liftoff Monetize.");
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.j2
    public void onAdRewarded(@NonNull o0 o0Var) {
        Log.d(TAG, "Received reward from Liftoff Monetize waterfall rewarded ad.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward(new k((Object) null));
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public void onAdStart(@NonNull o0 o0Var) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has started.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        h2 h2Var = this.rewardedAd;
        if (h2Var != null) {
            h2Var.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
