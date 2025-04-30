package com.google.ads.mediation.mintegral;

import G7.j;
import Y2.b;
import Y2.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
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
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import j5.C2400c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.C2475f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";
    public static MBridgeSDKImpl b;

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] split = MBConfiguration.SDK_VERSION.split("_");
        if (split.length > 1) {
            String[] split2 = split[1].split("\\.");
            if (split2.length >= 3) {
                return new VersionInfo(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]));
            }
        }
        Log.w(TAG, "Unexpected SDK version format: MAL_16.7.71. Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "16.7.71.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, "Unexpected adapter version format: 16.7.71.0. Returning 0.0.0 for adapter version.");
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
            b = mBridgeSDK;
            b.init(mBridgeSDK.getMBConfigurationMap(str, str2), context, new C2475f(initializationCompleteCallback, 19));
            return;
        }
        AdError g9 = a.g(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
        Log.e(TAG, g9.toString());
        initializationCompleteCallback.onInitializationFailed(g9.toString());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        X2.a aVar = new X2.a(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = aVar.b;
        aVar.f3659g = (Activity) mediationAppOpenAdConfiguration2.getContext();
        Bundle serverParameters = mediationAppOpenAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError U8 = c.U(string, string2);
        if (U8 != null) {
            aVar.f3656c.onFailure(U8);
            return;
        }
        C2400c c2400c = new C2400c(22, false);
        aVar.f3658f = c2400c;
        j.e(string2, "placementId");
        j.e(string, "adUnitId");
        c2400c.f21107c = new MBSplashHandler(string2, string, true, 5);
        MBSplashHandler mBSplashHandler = (MBSplashHandler) aVar.f3658f.f21107c;
        if (mBSplashHandler != null) {
            mBSplashHandler.setSplashLoadListener(aVar);
        }
        MBSplashHandler mBSplashHandler2 = (MBSplashHandler) aVar.f3658f.f21107c;
        if (mBSplashHandler2 != null) {
            mBSplashHandler2.setSplashShowListener(aVar);
        }
        MBSplashHandler mBSplashHandler3 = (MBSplashHandler) aVar.f3658f.f21107c;
        if (mBSplashHandler3 != null) {
            mBSplashHandler3.preLoad();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        b bVar = new b(mediationBannerAdConfiguration, mediationAdLoadCallback);
        MediationBannerAdConfiguration mediationBannerAdConfiguration2 = bVar.b;
        BannerSize a6 = b.a(mediationBannerAdConfiguration2.getContext(), mediationBannerAdConfiguration2.getAdSize());
        MediationAdLoadCallback mediationAdLoadCallback2 = bVar.f3759c;
        if (a6 == null) {
            AdError g9 = a.g(102, "The requested banner size: " + mediationBannerAdConfiguration2.getAdSize() + " is not supported by Mintegral SDK.");
            Log.e(TAG, g9.toString());
            mediationAdLoadCallback2.onFailure(g9);
            return;
        }
        String string = mediationBannerAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError U8 = c.U(string, string2);
        if (U8 != null) {
            mediationAdLoadCallback2.onFailure(U8);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration2.getContext());
        bVar.f3760d = mBBannerView;
        mBBannerView.init(a6, string2, string);
        bVar.f3760d.setLayoutParams(new FrameLayout.LayoutParams(c.G(mediationBannerAdConfiguration2.getContext(), a6.getWidth()), c.G(mediationBannerAdConfiguration2.getContext(), a6.getHeight())));
        bVar.f3760d.setBannerAdListener(bVar);
        bVar.f3760d.load();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Y2.c cVar = new Y2.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, 1);
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration2 = cVar.b;
        String string = mediationInterstitialAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError U8 = c.U(string, string2);
        if (U8 != null) {
            cVar.f3762c.onFailure(U8);
            return;
        }
        E1.c cVar2 = new E1.c(22, false);
        cVar.f3765g = cVar2;
        Context context = mediationInterstitialAdConfiguration2.getContext();
        j.e(context, "context");
        j.e(string2, "placementId");
        j.e(string, "adUnitId");
        cVar2.f972c = new MBNewInterstitialHandler(context, string2, string);
        E1.c cVar3 = (E1.c) cVar.f3765g;
        cVar3.getClass();
        MBNewInterstitialHandler mBNewInterstitialHandler = (MBNewInterstitialHandler) cVar3.f972c;
        if (mBNewInterstitialHandler != null) {
            mBNewInterstitialHandler.setInterstitialVideoListener(cVar);
        }
        MBNewInterstitialHandler mBNewInterstitialHandler2 = (MBNewInterstitialHandler) ((E1.c) cVar.f3765g).f972c;
        if (mBNewInterstitialHandler2 != null) {
            mBNewInterstitialHandler2.load();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z2.b, X2.c] */
    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        ?? cVar = new X2.c(mediationNativeAdConfiguration, mediationAdLoadCallback);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = cVar.f3662c;
        String string = mediationNativeAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError U8 = c.U(string, string2);
        if (U8 != null) {
            cVar.f3663d.onFailure(U8);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, mediationNativeAdConfiguration2.getContext());
        cVar.f3878g = mBNativeHandler;
        mBNativeHandler.setAdListener(cVar.f3664f);
        cVar.f3878g.load();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        e eVar = new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, 1);
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = eVar.b;
        String string = mediationRewardedAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError U8 = c.U(string, string2);
        if (U8 != null) {
            eVar.f3767c.onFailure(U8);
            return;
        }
        MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(mediationRewardedAdConfiguration2.getContext(), string2, string);
        eVar.f3770g = mBRewardVideoHandler;
        mBRewardVideoHandler.setRewardVideoListener(eVar);
        ((MBRewardVideoHandler) eVar.f3770g).load();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mbridge.msdk.out.MBSplashLoadListener, X2.a, Y2.a, com.mbridge.msdk.out.MBSplashShowListener] */
    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        ?? aVar = new X2.a(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = aVar.b;
        aVar.f3659g = (Activity) mediationAppOpenAdConfiguration2.getContext();
        Bundle serverParameters = mediationAppOpenAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration2.getBidResponse();
        aVar.f3758h = bidResponse;
        AdError V8 = c.V(string, string2, bidResponse);
        if (V8 != null) {
            aVar.f3656c.onFailure(V8);
            return;
        }
        aVar.f3658f = new C2400c(22, false);
        String watermark = mediationAppOpenAdConfiguration2.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, watermark);
                C2400c c2400c = aVar.f3658f;
                c2400c.getClass();
                MBSplashHandler mBSplashHandler = (MBSplashHandler) c2400c.f21107c;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setExtraInfo(jSONObject);
                }
            } catch (JSONException e4) {
                Log.w(TAG, "Failed to apply watermark to Mintegral bidding app open ad.", e4);
            }
        }
        C2400c c2400c2 = aVar.f3658f;
        c2400c2.getClass();
        j.e(string2, "placementId");
        j.e(string, "adUnitId");
        c2400c2.f21107c = new MBSplashHandler(string2, string, true, 5);
        MBSplashHandler mBSplashHandler2 = (MBSplashHandler) aVar.f3658f.f21107c;
        if (mBSplashHandler2 != 0) {
            mBSplashHandler2.setSplashLoadListener(aVar);
        }
        MBSplashHandler mBSplashHandler3 = (MBSplashHandler) aVar.f3658f.f21107c;
        if (mBSplashHandler3 != 0) {
            mBSplashHandler3.setSplashShowListener(aVar);
        }
        C2400c c2400c3 = aVar.f3658f;
        String str = aVar.f3758h;
        c2400c3.getClass();
        j.e(str, BidResponsed.KEY_TOKEN);
        MBSplashHandler mBSplashHandler4 = (MBSplashHandler) c2400c3.f21107c;
        if (mBSplashHandler4 != null) {
            mBSplashHandler4.preLoadByToken(str);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        b bVar = new b(mediationBannerAdConfiguration, mediationAdLoadCallback);
        MediationBannerAdConfiguration mediationBannerAdConfiguration2 = bVar.b;
        BannerSize a6 = b.a(mediationBannerAdConfiguration2.getContext(), mediationBannerAdConfiguration2.getAdSize());
        MediationAdLoadCallback mediationAdLoadCallback2 = bVar.f3759c;
        if (a6 == null) {
            AdError g9 = a.g(102, "The requested banner size: " + mediationBannerAdConfiguration2.getAdSize() + " is not supported by Mintegral SDK.");
            Log.e(TAG, g9.toString());
            mediationAdLoadCallback2.onFailure(g9);
            return;
        }
        String string = mediationBannerAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationBannerAdConfiguration2.getBidResponse();
        AdError V8 = c.V(string, string2, bidResponse);
        if (V8 != null) {
            mediationAdLoadCallback2.onFailure(V8);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration2.getContext());
        bVar.f3760d = mBBannerView;
        mBBannerView.init(a6, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration2.getWatermark());
            bVar.f3760d.setExtraInfo(jSONObject);
        } catch (JSONException e4) {
            Log.w(TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e4);
        }
        bVar.f3760d.setLayoutParams(new FrameLayout.LayoutParams(c.G(mediationBannerAdConfiguration2.getContext(), a6.getWidth()), c.G(mediationBannerAdConfiguration2.getContext(), a6.getHeight())));
        bVar.f3760d.setBannerAdListener(bVar);
        bVar.f3760d.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Y2.c cVar = new Y2.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, 0);
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration2 = cVar.b;
        String string = mediationInterstitialAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration2.getBidResponse();
        AdError V8 = c.V(string, string2, bidResponse);
        if (V8 != null) {
            cVar.f3762c.onFailure(V8);
            return;
        }
        C2475f c2475f = new C2475f(18, false);
        cVar.f3765g = c2475f;
        Context context = mediationInterstitialAdConfiguration2.getContext();
        j.e(context, "context");
        j.e(string2, "placementId");
        j.e(string, "adUnitId");
        c2475f.f21833c = new MBBidNewInterstitialHandler(context, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration2.getWatermark());
            C2475f c2475f2 = (C2475f) cVar.f3765g;
            c2475f2.getClass();
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = (MBBidNewInterstitialHandler) c2475f2.f21833c;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jSONObject);
            }
        } catch (JSONException e4) {
            Log.w(TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e4);
        }
        C2475f c2475f3 = (C2475f) cVar.f3765g;
        c2475f3.getClass();
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = (MBBidNewInterstitialHandler) c2475f3.f21833c;
        if (mBBidNewInterstitialHandler2 != null) {
            mBBidNewInterstitialHandler2.setInterstitialVideoListener(cVar);
        }
        C2475f c2475f4 = (C2475f) cVar.f3765g;
        c2475f4.getClass();
        j.e(bidResponse, "bidToken");
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler3 = (MBBidNewInterstitialHandler) c2475f4.f21833c;
        if (mBBidNewInterstitialHandler3 != null) {
            mBBidNewInterstitialHandler3.loadFromBid(bidResponse);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y2.d, X2.c] */
    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        ?? cVar = new X2.c(mediationNativeAdConfiguration, mediationAdLoadCallback);
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = cVar.f3662c;
        String string = mediationNativeAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationNativeAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration2.getBidResponse();
        AdError V8 = c.V(string, string2, bidResponse);
        if (V8 != null) {
            cVar.f3663d.onFailure(V8);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        cVar.f3766g = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration2.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration2.getWatermark());
            cVar.f3766g.setExtraInfo(jSONObject);
        } catch (JSONException e4) {
            Log.w(TAG, "Failed to apply watermark to Mintegral bidding native ad.", e4);
        }
        cVar.f3766g.setAdListener(cVar.f3664f);
        cVar.f3766g.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        e eVar = new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, 0);
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = eVar.b;
        String string = mediationRewardedAdConfiguration2.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration2.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationRewardedAdConfiguration2.getBidResponse();
        AdError V8 = c.V(string, string2, bidResponse);
        if (V8 != null) {
            eVar.f3767c.onFailure(V8);
            return;
        }
        eVar.f3770g = new MBBidRewardVideoHandler(mediationRewardedAdConfiguration2.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration2.getWatermark());
            ((MBBidRewardVideoHandler) eVar.f3770g).setExtraInfo(jSONObject);
        } catch (JSONException e4) {
            Log.w(TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e4);
        }
        ((MBBidRewardVideoHandler) eVar.f3770g).setRewardVideoListener(eVar);
        ((MBBidRewardVideoHandler) eVar.f3770g).loadFromBid(bidResponse);
    }
}
