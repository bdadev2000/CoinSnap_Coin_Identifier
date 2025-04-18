package com.google.ads.mediation.mintegral;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import r4.c;
import w5.d;
import w6.b;
import w6.e;
import x6.a;

/* loaded from: classes3.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";

    /* renamed from: b, reason: collision with root package name */
    public static MBridgeSDKImpl f11480b;

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        boolean z10 = d.a;
        String[] split = MBConfiguration.SDK_VERSION.split("_");
        if (split.length > 1) {
            String[] split2 = split[1].split("\\.");
            if (split2.length >= 3) {
                return new VersionInfo(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]));
            }
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", MBConfiguration.SDK_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        boolean z10 = d.a;
        String[] split = "16.7.71.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "16.7.71.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString(MBridgeConstans.APP_ID);
            String string2 = serverParameters.getString(MBridgeConstans.APP_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size > 0 && size2 > 0) {
            String str = (String) hashSet.iterator().next();
            String str2 = (String) hashSet2.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str));
            }
            if (size2 > 1) {
                Log.w(TAG, String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2));
            }
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            f11480b = mBridgeSDK;
            f11480b.init(mBridgeSDK.getMBConfigurationMap(str, str2), context, new c(3, this, initializationCompleteCallback));
            return;
        }
        AdError g10 = c6.c.g(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
        Log.e(TAG, g10.toString());
        initializationCompleteCallback.onInitializationFailed(g10.toString());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        a listener = new a(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = listener.f26042b;
        listener.f26046g = (Activity) mediationAppOpenAdConfiguration2.getContext();
        Bundle serverParameters = mediationAppOpenAdConfiguration2.getServerParameters();
        String adUnitId = serverParameters.getString("ad_unit_id");
        String placementId = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError h10 = d.h(adUnitId, placementId);
        if (h10 != null) {
            listener.f26043c.onFailure(h10);
            return;
        }
        u6.c cVar = new u6.c();
        listener.f26045f = cVar;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        cVar.a = new MBSplashHandler(placementId, adUnitId, true, 5);
        u6.c cVar2 = listener.f26045f;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        MBSplashHandler mBSplashHandler = cVar2.a;
        if (mBSplashHandler != null) {
            mBSplashHandler.setSplashLoadListener(listener);
        }
        u6.c cVar3 = listener.f26045f;
        cVar3.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        MBSplashHandler mBSplashHandler2 = cVar3.a;
        if (mBSplashHandler2 != null) {
            mBSplashHandler2.setSplashShowListener(listener);
        }
        MBSplashHandler mBSplashHandler3 = listener.f26045f.a;
        if (mBSplashHandler3 != null) {
            mBSplashHandler3.preLoad();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new b(mediationBannerAdConfiguration, mediationAdLoadCallback, 1).b();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new w6.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, 1).a();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        x6.b bVar = new x6.b(mediationNativeAdConfiguration, mediationAdLoadCallback);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = bVar.f26057c;
        String string = mediationNativeAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError h10 = d.h(string, string2);
        if (h10 != null) {
            bVar.f26058d.onFailure(h10);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, mediationNativeAdConfiguration2.getContext());
        bVar.f27409g = mBNativeHandler;
        mBNativeHandler.setAdListener(bVar.f26059f);
        bVar.f27409g.load();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, 1).a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        w6.a listener = new w6.a(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = listener.f26042b;
        listener.f26046g = (Activity) mediationAppOpenAdConfiguration2.getContext();
        Bundle serverParameters = mediationAppOpenAdConfiguration2.getServerParameters();
        String adUnitId = serverParameters.getString("ad_unit_id");
        String placementId = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration2.getBidResponse();
        listener.f26859h = bidResponse;
        AdError i10 = d.i(adUnitId, placementId, bidResponse);
        if (i10 != null) {
            listener.f26043c.onFailure(i10);
            return;
        }
        listener.f26045f = new u6.c();
        String watermark = mediationAppOpenAdConfiguration2.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            try {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put(MBridgeConstans.EXTRA_KEY_WM, watermark);
                u6.c cVar = listener.f26045f;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBSplashHandler mBSplashHandler = cVar.a;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setExtraInfo(jsonObject);
                }
            } catch (JSONException e2) {
                Log.w(TAG, "Failed to apply watermark to Mintegral bidding app open ad.", e2);
            }
        }
        u6.c cVar2 = listener.f26045f;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        cVar2.a = new MBSplashHandler(placementId, adUnitId, true, 5);
        u6.c cVar3 = listener.f26045f;
        cVar3.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        MBSplashHandler mBSplashHandler2 = cVar3.a;
        if (mBSplashHandler2 != null) {
            mBSplashHandler2.setSplashLoadListener(listener);
        }
        u6.c cVar4 = listener.f26045f;
        cVar4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        MBSplashHandler mBSplashHandler3 = cVar4.a;
        if (mBSplashHandler3 != null) {
            mBSplashHandler3.setSplashShowListener(listener);
        }
        u6.c cVar5 = listener.f26045f;
        String token = listener.f26859h;
        cVar5.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        MBSplashHandler mBSplashHandler4 = cVar5.a;
        if (mBSplashHandler4 != null) {
            mBSplashHandler4.preLoadByToken(token);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new b(mediationBannerAdConfiguration, mediationAdLoadCallback, 0).b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new w6.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, 0).a();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        w6.d dVar = new w6.d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = dVar.f26057c;
        String string = mediationNativeAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration2.getBidResponse();
        AdError i10 = d.i(string, string2, bidResponse);
        if (i10 != null) {
            dVar.f26058d.onFailure(i10);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        dVar.f26863g = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration2.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration2.getWatermark());
            dVar.f26863g.setExtraInfo(jSONObject);
        } catch (JSONException e2) {
            Log.w(TAG, "Failed to apply watermark to Mintegral bidding native ad.", e2);
        }
        dVar.f26863g.setAdListener(dVar.f26059f);
        dVar.f26863g.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, 0).a();
    }
}
