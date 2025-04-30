package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.applovin.e;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ApplovinAdapter extends AppLovinMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, OnContextChangedListener {
    private static final boolean LOGGING_ENABLED = true;
    private static final HashMap<String, WeakReference<ApplovinAdapter>> appLovinInterstitialAds = new HashMap<>();
    private AppLovinAdView adView;
    private AppLovinAd appLovinInterstitialAd;
    private Context context;
    private boolean enableMultipleAdLoading = false;
    private MediationInterstitialListener mediationInterstitialListener;
    private Bundle networkExtras;
    private AppLovinSdk sdk;
    private String zoneId;

    /* renamed from: com.applovin.mediation.ApplovinAdapter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements e {
        final /* synthetic */ Context val$context;
        final /* synthetic */ MediationInterstitialListener val$interstitialListener;
        final /* synthetic */ Bundle val$networkExtras;
        final /* synthetic */ Bundle val$serverParameters;

        public AnonymousClass1(Bundle bundle, MediationInterstitialListener mediationInterstitialListener, Context context, Bundle bundle2) {
            this.val$serverParameters = bundle;
            this.val$interstitialListener = mediationInterstitialListener;
            this.val$context = context;
            this.val$networkExtras = bundle2;
        }

        @Override // com.google.ads.mediation.applovin.e
        public void onInitializeSuccess(@NonNull String str) {
            ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(this.val$serverParameters);
            if (ApplovinAdapter.appLovinInterstitialAds.containsKey(ApplovinAdapter.this.zoneId) && ((WeakReference) ApplovinAdapter.appLovinInterstitialAds.get(ApplovinAdapter.this.zoneId)).get() != null) {
                AdError adError = new AdError(105, g.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                ApplovinAdapter.log(6, adError.getMessage());
                this.val$interstitialListener.onAdFailedToLoad(ApplovinAdapter.this, adError);
                return;
            }
            ApplovinAdapter.appLovinInterstitialAds.put(ApplovinAdapter.this.zoneId, new WeakReference(ApplovinAdapter.this));
            ApplovinAdapter.this.sdk = f.a().c(this.val$context, this.val$serverParameters);
            ApplovinAdapter.this.context = this.val$context;
            ApplovinAdapter.this.networkExtras = this.val$networkExtras;
            ApplovinAdapter.this.mediationInterstitialListener = this.val$interstitialListener;
            ApplovinAdapter.log(3, "Requesting interstitial for zone: " + ApplovinAdapter.this.zoneId);
            AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.ApplovinAdapter.1.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(AppLovinAd appLovinAd) {
                    ApplovinAdapter.log(3, "Interstitial did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + ApplovinAdapter.this.zoneId);
                    ApplovinAdapter.this.appLovinInterstitialAd = appLovinAd;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ApplovinAdapter.this.mediationInterstitialListener.onAdLoaded(ApplovinAdapter.this);
                        }
                    });
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i9) {
                    final AdError adError2 = AppLovinUtils.getAdError(i9);
                    ApplovinAdapter.log(5, adError2.getMessage());
                    ApplovinAdapter.this.unregister();
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ApplovinAdapter.this.mediationInterstitialListener.onAdFailedToLoad(ApplovinAdapter.this, adError2);
                        }
                    });
                }
            };
            if (!TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinAdLoadListener);
            } else {
                ApplovinAdapter.this.sdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
            }
        }
    }

    public static void log(int i9, String str) {
        Log.println(i9, "AppLovinAdapter", str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.adView;
    }

    @Override // com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(@NonNull Context context) {
        log(3, "Context changed: " + context);
        this.context = context;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull final Context context, @NonNull final MediationBannerListener mediationBannerListener, @NonNull final Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final AppLovinAdSize appLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeFromAdMobAdSize == null) {
            AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError2.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        f.a().b(context, string, new e() { // from class: com.applovin.mediation.ApplovinAdapter.2
            @Override // com.google.ads.mediation.applovin.e
            public void onInitializeSuccess(@NonNull String str) {
                ApplovinAdapter.this.sdk = f.a().c(context, bundle);
                ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(bundle);
                ApplovinAdapter.log(3, "Requesting banner of size " + appLovinAdSizeFromAdMobAdSize + " for zone: " + ApplovinAdapter.this.zoneId);
                ApplovinAdapter.this.adView = new AppLovinAdView(ApplovinAdapter.this.sdk, appLovinAdSizeFromAdMobAdSize, context);
                AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(ApplovinAdapter.this.zoneId, ApplovinAdapter.this.adView, ApplovinAdapter.this, mediationBannerListener);
                ApplovinAdapter.this.adView.setAdDisplayListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdClickListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdViewEventListener(appLovinBannerAdListener);
                if (!TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinBannerAdListener);
                } else {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAd(appLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(bundle)) {
                this.enableMultipleAdLoading = true;
            }
            f.a().b(context, string, new AnonymousClass1(bundle, mediationInterstitialListener, context, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.sdk, this.context);
        AppLovinInterstitialAdListener appLovinInterstitialAdListener = new AppLovinInterstitialAdListener(this, this.mediationInterstitialListener);
        create.setAdDisplayListener(appLovinInterstitialAdListener);
        create.setAdClickListener(appLovinInterstitialAdListener);
        create.setAdVideoPlaybackListener(appLovinInterstitialAdListener);
        if (this.appLovinInterstitialAd == null) {
            log(3, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                log(3, "Showing interstitial preloaded by SDK.");
                create.show();
                return;
            } else {
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
        }
        log(3, "Showing interstitial for zone: " + this.zoneId);
        create.showAndRender(this.appLovinInterstitialAd);
        if (this.enableMultipleAdLoading) {
            unregister();
        }
    }

    public void unregister() {
        if (!TextUtils.isEmpty(this.zoneId)) {
            HashMap<String, WeakReference<ApplovinAdapter>> hashMap = appLovinInterstitialAds;
            if (hashMap.containsKey(this.zoneId) && equals(hashMap.get(this.zoneId).get())) {
                hashMap.remove(this.zoneId);
            }
        }
    }
}
