package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import c3.C0603a;
import c3.C0605c;
import c3.C0606d;
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
import com.vungle.ads.C;
import com.vungle.ads.C2073d;
import com.vungle.ads.J0;
import com.vungle.ads.L0;
import com.vungle.ads.P;
import com.vungle.ads.m1;
import com.vungle.ads.o1;
import com.vungle.mediation.VungleInterstitialAdapter;
import d3.AbstractC2171b;
import e3.C2217a;
import e3.C2218b;
import e3.C2219c;
import e3.C2220d;
import e3.e;
import e3.h;
import e3.j;
import f3.C2271a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, L0 {
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
    private C2073d adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private J0 rewardedAd;
    private C2217a rtbAppOpenAd;
    private C2219c rtbBannerAd;
    private e rtbInterstitialAd;
    private h rtbNativeAd;
    private j rtbRewardedAd;
    private j rtbRewardedInterstitialAd;
    private String userId;
    private final C0603a vungleFactory = new Object();
    private C2271a waterfallAppOpenAd;

    @NonNull
    public static AdError getAdError(@NonNull o1 o1Var) {
        return new AdError(o1Var.getCode(), o1Var.getErrorMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    public static String getAdapterVersion() {
        return "7.3.2.0";
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Context context = rtbSignalData.getContext();
        G7.j.e(context, "context");
        String biddingToken = m1.Companion.getBiddingToken(context);
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
        String sdkVersion = m1.Companion.getSdkVersion();
        String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, AbstractC2914a.e("Unexpected SDK version format: ", sdkVersion, ". Returning 0.0.0 for SDK version."));
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
        Log.w(TAG, AbstractC2914a.e("Unexpected adapter version format: ", adapterVersion, ". Returning 0.0.0 for adapter version."));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (m1.Companion.isInitialized()) {
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
        C0605c.f5405c.a(str, context, new C0606d(initializationCompleteCallback));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d3.b, f3.a] */
    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        C0603a c0603a = this.vungleFactory;
        G7.j.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        G7.j.e(c0603a, "vungleFactory");
        ?? abstractC2171b = new AbstractC2171b(mediationAppOpenAdConfiguration, mediationAdLoadCallback, c0603a);
        this.waterfallAppOpenAd = abstractC2171b;
        abstractC2171b.c();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadNativeAd()...");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
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
        this.adConfig = new C2073d();
        if (mediationExtras != null && mediationExtras.containsKey("adOrientation")) {
            this.adConfig.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        Context context = mediationRewardedAdConfiguration.getContext();
        c0605c.a(string, context, new c3.e(this, context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d3.b, e3.a] */
    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        C0603a c0603a = this.vungleFactory;
        G7.j.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        G7.j.e(c0603a, "vungleFactory");
        ?? abstractC2171b = new AbstractC2171b(mediationAppOpenAdConfiguration, mediationAdLoadCallback, c0603a);
        this.rtbAppOpenAd = abstractC2171b;
        abstractC2171b.c();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbBannerAd()...");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationBannerAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        C2219c c2219c = new C2219c(mediationBannerAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = c2219c;
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
        C vungleBannerAdSizeFromGoogleAdSize = VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, "The requested banner size: " + adSize + " is not supported by Vungle SDK.", ERROR_DOMAIN);
            Log.e(str, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        c0605c.a(string, context, new C2218b(c2219c, context, string2, adSize, vungleBannerAdSizeFromGoogleAdSize, mediationBannerAdConfiguration.getBidResponse(), mediationBannerAdConfiguration.getWatermark()));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbInterstitialAd()...");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        C0603a c0603a = this.vungleFactory;
        e eVar = new e(mediationInterstitialAdConfiguration, mediationAdLoadCallback, c0603a);
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
        c0603a.getClass();
        C2073d c2073d = new C2073d();
        if (mediationExtras.containsKey("adOrientation")) {
            c2073d.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c2073d.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        c0605c.a(string, context, new C2220d(eVar, context, string2, c2073d, bidResponse, 0));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbNativeAd()...");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationNativeAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        h hVar = new h(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = hVar;
        hVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        j jVar = new j(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = jVar;
        jVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbRewardedInterstitialAd()...");
        Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        j jVar = new j(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = jVar;
        jVar.a();
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdClicked(@NonNull P p2) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad was clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdEnd(@NonNull P p2) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has ended.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdFailedToLoad(@NonNull P p2, @NonNull o1 o1Var) {
        AdError adError = getAdError(o1Var);
        Log.w(TAG, "Failed to load waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdFailedToPlay(@NonNull P p2, @NonNull o1 o1Var) {
        AdError adError = getAdError(o1Var);
        Log.w(TAG, "Failed to play waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdImpression(@NonNull P p2) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdLeftApplication(@NonNull P p2) {
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdLoaded(@NonNull P p2) {
        Log.d(TAG, "Loaded waterfall rewarded ad from Liftoff Monetize.");
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.L0
    public void onAdRewarded(@NonNull P p2) {
        Log.d(TAG, "Received reward from Liftoff Monetize waterfall rewarded ad.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward(new R3.e(18));
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdStart(@NonNull P p2) {
        Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has started.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        J0 j02 = this.rewardedAd;
        if (j02 != null) {
            j02.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
