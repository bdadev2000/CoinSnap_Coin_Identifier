package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class AppLovinWaterfallInterstitialAd extends AppLovinInterstitialRenderer implements MediationInterstitialAd {

    @VisibleForTesting
    protected static final HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> appLovinWaterfallInterstitialAds = new HashMap<>();
    private Context context;
    private boolean enableMultipleAdLoading;
    private Bundle networkExtras;
    private AppLovinSdk sdk;

    public AppLovinWaterfallInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull AppLovinInitializer appLovinInitializer, @NonNull AppLovinAdFactory appLovinAdFactory) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        unregister();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.enableMultipleAdLoading) {
            unregister();
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        unregister();
        super.failedToReceiveAd(i2);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void loadAd() {
        this.context = this.interstitialAdConfiguration.getContext();
        final Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(AppLovinInterstitialRenderer.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(this.context, string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(@NonNull String str) {
                    AppLovinWaterfallInterstitialAd.this.zoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                    HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> hashMap = AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds;
                    if (hashMap.containsKey(AppLovinWaterfallInterstitialAd.this.zoneId) && hashMap.get(AppLovinWaterfallInterstitialAd.this.zoneId).get() != null) {
                        AdError adError2 = new AdError(105, AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                        Log.e(AppLovinInterstitialRenderer.TAG, adError2.getMessage());
                        AppLovinWaterfallInterstitialAd.this.interstitialAdLoadCallback.onFailure(adError2);
                        return;
                    }
                    hashMap.put(AppLovinWaterfallInterstitialAd.this.zoneId, new WeakReference<>(AppLovinWaterfallInterstitialAd.this));
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd.sdk = appLovinWaterfallInterstitialAd.appLovinInitializer.retrieveSdk(serverParameters, appLovinWaterfallInterstitialAd.context);
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd2 = AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd2.networkExtras = appLovinWaterfallInterstitialAd2.networkExtras;
                    Log.d(AppLovinInterstitialRenderer.TAG, "Requesting interstitial for zone: " + AppLovinWaterfallInterstitialAd.this.zoneId);
                    if (TextUtils.isEmpty(AppLovinWaterfallInterstitialAd.this.zoneId)) {
                        AppLovinWaterfallInterstitialAd.this.sdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, AppLovinWaterfallInterstitialAd.this);
                        return;
                    }
                    AppLovinAdService adService = AppLovinWaterfallInterstitialAd.this.sdk.getAdService();
                    AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd3 = AppLovinWaterfallInterstitialAd.this;
                    adService.loadNextAdForZoneId(appLovinWaterfallInterstitialAd3.zoneId, appLovinWaterfallInterstitialAd3);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog createInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.sdk, context);
        createInterstitialAdDialog.setAdDisplayListener(this);
        createInterstitialAdDialog.setAdClickListener(this);
        createInterstitialAdDialog.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd != null) {
            Log.d(AppLovinInterstitialRenderer.TAG, "Showing interstitial for zone: " + this.zoneId);
            createInterstitialAdDialog.showAndRender(this.appLovinInterstitialAd);
            return;
        }
        String str = AppLovinInterstitialRenderer.TAG;
        Log.d(str, "Attempting to show interstitial before one was loaded.");
        if (TextUtils.isEmpty(this.zoneId)) {
            Log.d(str, "Showing interstitial preloaded by SDK.");
            createInterstitialAdDialog.show();
        }
    }

    public void unregister() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> hashMap = appLovinWaterfallInterstitialAds;
        if (hashMap.containsKey(this.zoneId) && equals(hashMap.get(this.zoneId).get())) {
            hashMap.remove(this.zoneId);
        }
    }
}
