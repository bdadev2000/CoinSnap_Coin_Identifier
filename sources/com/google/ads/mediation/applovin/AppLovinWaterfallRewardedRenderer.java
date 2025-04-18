package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public class AppLovinWaterfallRewardedRenderer extends AppLovinRewardedRenderer implements MediationRewardedAd {
    private static final String DEFAULT_ZONE = "";

    @VisibleForTesting
    protected static final HashMap<String, WeakReference<AppLovinWaterfallRewardedRenderer>> incentivizedAdsMap = new HashMap<>();
    private boolean enableMultipleAdLoading;
    private String zoneId;

    public AppLovinWaterfallRewardedRenderer(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull AppLovinInitializer appLovinInitializer, @NonNull AppLovinAdFactory appLovinAdFactory, @NonNull AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory, appLovinSdkUtilsWrapper);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(@NonNull AppLovinAd appLovinAd) {
        incentivizedAdsMap.remove(this.zoneId);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        if (this.enableMultipleAdLoading) {
            incentivizedAdsMap.remove(this.zoneId);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        incentivizedAdsMap.remove(this.zoneId);
        super.failedToReceiveAd(i2);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd() {
        final Context context = this.adConfiguration.getContext();
        final Bundle serverParameters = this.adConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(AppLovinRewardedRenderer.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled(serverParameters)) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(context, string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(@NonNull String str) {
                    AppLovinWaterfallRewardedRenderer.this.zoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                    AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = AppLovinWaterfallRewardedRenderer.this;
                    appLovinWaterfallRewardedRenderer.appLovinSdk = appLovinWaterfallRewardedRenderer.appLovinInitializer.retrieveSdk(serverParameters, context);
                    String format = String.format("Requesting rewarded video for zone '%s'", AppLovinWaterfallRewardedRenderer.this.zoneId);
                    String str2 = AppLovinRewardedRenderer.TAG;
                    Log.d(str2, format);
                    HashMap<String, WeakReference<AppLovinWaterfallRewardedRenderer>> hashMap = AppLovinWaterfallRewardedRenderer.incentivizedAdsMap;
                    if (hashMap.containsKey(AppLovinWaterfallRewardedRenderer.this.zoneId)) {
                        AdError adError2 = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                        Log.e(str2, adError2.toString());
                        AppLovinWaterfallRewardedRenderer.this.adLoadCallback.onFailure(adError2);
                        return;
                    }
                    hashMap.put(AppLovinWaterfallRewardedRenderer.this.zoneId, new WeakReference<>(AppLovinWaterfallRewardedRenderer.this));
                    if (Objects.equals(AppLovinWaterfallRewardedRenderer.this.zoneId, "")) {
                        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer2 = AppLovinWaterfallRewardedRenderer.this;
                        appLovinWaterfallRewardedRenderer2.incentivizedInterstitial = appLovinWaterfallRewardedRenderer2.appLovinAdFactory.createIncentivizedInterstitial(appLovinWaterfallRewardedRenderer2.appLovinSdk);
                    } else {
                        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer3 = AppLovinWaterfallRewardedRenderer.this;
                        appLovinWaterfallRewardedRenderer3.incentivizedInterstitial = appLovinWaterfallRewardedRenderer3.appLovinAdFactory.createIncentivizedInterstitial(appLovinWaterfallRewardedRenderer3.zoneId, AppLovinWaterfallRewardedRenderer.this.appLovinSdk);
                    }
                    AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer4 = AppLovinWaterfallRewardedRenderer.this;
                    appLovinWaterfallRewardedRenderer4.incentivizedInterstitial.preload(appLovinWaterfallRewardedRenderer4);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.zoneId;
        if (str != null) {
            Log.d(AppLovinRewardedRenderer.TAG, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(AppLovinRewardedRenderer.TAG, adError.toString());
        this.rewardedAdCallback.onAdFailedToShow(adError);
    }
}
