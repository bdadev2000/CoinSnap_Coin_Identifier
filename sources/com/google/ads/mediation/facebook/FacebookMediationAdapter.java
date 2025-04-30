package com.google.ads.mediation.facebook;

import R3.e;
import U2.a;
import U2.b;
import U2.c;
import V2.d;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";
    public final e b = new e(11);

    @NonNull
    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    @Nullable
    public static String getPlacementID(@NonNull Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        if (string == null) {
            return bundle.getString("pubid");
        }
        return string;
    }

    public static void setMixedAudience(@NonNull MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] split = "6.17.0".split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, "Unexpected SDK version format: 6.17.0.Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "6.17.0.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, "Unexpected adapter version format: 6.17.0.0.Returning 0.0.0 for adapter version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
            return;
        }
        if (a.f3126d == null) {
            a.f3126d = new a();
        }
        a aVar = a.f3126d;
        b bVar = new b(initializationCompleteCallback);
        if (aVar.f3127a) {
            aVar.f3128c.add(bVar);
            return;
        }
        if (aVar.b) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        aVar.f3127a = true;
        if (aVar == null) {
            a.f3126d = new a();
        }
        a.f3126d.f3128c.add(bVar);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.17.0.0").withPlacementIds(arrayList).withInitListener(aVar).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        e eVar = this.b;
        V2.a aVar = new V2.a(mediationBannerAdConfiguration, mediationAdLoadCallback, eVar);
        String placementID = getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationBannerAdConfiguration);
        try {
            Context context = mediationBannerAdConfiguration.getContext();
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            eVar.getClass();
            aVar.f3448c = new AdView(context, placementID, bidResponse);
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                aVar.f3448c.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context2 = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context2), -2);
            aVar.f3449d = new FrameLayout(context2);
            aVar.f3448c.setLayoutParams(layoutParams);
            aVar.f3449d.addView(aVar.f3448c);
            AdView adView = aVar.f3448c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(aVar).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e4) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e4.getMessage(), ERROR_DOMAIN);
            Log.e(TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        V2.b bVar = new V2.b(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.b);
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration2 = bVar.b;
        String placementID = getPlacementID(mediationInterstitialAdConfiguration2.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            bVar.f3451c.onFailure(adError);
            return;
        }
        setMixedAudience(mediationInterstitialAdConfiguration2);
        Context context = mediationInterstitialAdConfiguration2.getContext();
        bVar.f3456i.getClass();
        bVar.f3452d = new InterstitialAd(context, placementID);
        if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration2.getWatermark())) {
            bVar.f3452d.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration2.getWatermark()).build());
        }
        InterstitialAd interstitialAd = bVar.f3452d;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration2.getBidResponse()).withAdListener(bVar).build());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        V2.e eVar = new V2.e(mediationNativeAdConfiguration, mediationAdLoadCallback, this.b);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = eVar.b;
        String placementID = getPlacementID(mediationNativeAdConfiguration2.getServerParameters());
        boolean isEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback mediationAdLoadCallback2 = eVar.f3460c;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback2.onFailure(adError);
            return;
        }
        setMixedAudience(mediationNativeAdConfiguration2);
        Context context = mediationNativeAdConfiguration2.getContext();
        eVar.f3464h.getClass();
        eVar.f3463g = new MediaView(context);
        try {
            eVar.f3461d = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration2.getContext(), placementID, mediationNativeAdConfiguration2.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration2.getWatermark())) {
                eVar.f3461d.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration2.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = eVar.f3461d;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(eVar, mediationNativeAdConfiguration2.getContext(), eVar.f3461d)).withBid(mediationNativeAdConfiguration2.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e4) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e4.getMessage(), ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new c(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.b).b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new c(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.b).b();
    }
}
