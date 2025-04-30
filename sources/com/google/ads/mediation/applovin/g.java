package com.google.ads.mediation.applovin;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* loaded from: classes.dex */
public abstract class g implements MediationInterstitialAd, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener, AppLovinAdLoadListener {
    public static final String ERROR_MSG_MULTIPLE_INTERSTITIAL_AD = " Cannot load multiple interstitial ads with the same Zone ID. Display one ad before attempting to load another. ";
    protected static final String TAG = "g";
    protected final a appLovinAdFactory;
    protected final f appLovinInitializer;

    @Nullable
    protected AppLovinAd appLovinInterstitialAd;

    @Nullable
    private MediationInterstitialAdCallback interstitialAdCallback;
    protected final MediationInterstitialAdConfiguration interstitialAdConfiguration;
    protected final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> interstitialAdLoadCallback;

    @Nullable
    protected String zoneId;

    public g(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, f fVar, a aVar) {
        this.interstitialAdConfiguration = mediationInterstitialAdConfiguration;
        this.interstitialAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = fVar;
        this.appLovinAdFactory = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial clicked.");
        this.interstitialAdCallback.reportAdClicked();
        this.interstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial displayed.");
        this.interstitialAdCallback.onAdOpened();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial dismissed.");
        this.interstitialAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + this.zoneId);
        this.appLovinInterstitialAd = appLovinAd;
        this.interstitialAdCallback = this.interstitialAdLoadCallback.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i9) {
        AdError adError = AppLovinUtils.getAdError(i9);
        Log.w(TAG, adError.getMessage());
        this.interstitialAdLoadCallback.onFailure(adError);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial video playback began.");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z8) {
        Log.d(TAG, "Interstitial video playback ended at playback percent: " + d2 + "%.");
    }
}
