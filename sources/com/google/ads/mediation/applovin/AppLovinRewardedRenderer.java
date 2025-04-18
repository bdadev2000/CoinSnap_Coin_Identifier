package com.google.ads.mediation.applovin;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AppLovinRewardedRenderer implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {

    @VisibleForTesting
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";

    @VisibleForTesting
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.";
    protected static final String TAG = "AppLovinRewardedRenderer";
    protected final MediationRewardedAdConfiguration adConfiguration;
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected final AppLovinAdFactory appLovinAdFactory;
    protected final AppLovinInitializer appLovinInitializer;

    @Nullable
    protected AppLovinSdk appLovinSdk;
    protected final AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper;
    private boolean fullyWatched;

    @Nullable
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private AppLovinRewardItem rewardItem;

    @Nullable
    protected MediationRewardedAdCallback rewardedAdCallback;

    public AppLovinRewardedRenderer(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull AppLovinInitializer appLovinInitializer, @NonNull AppLovinAdFactory appLovinAdFactory, @NonNull AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
        this.appLovinSdkUtilsWrapper = appLovinSdkUtilsWrapper;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(@NonNull AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(@NonNull AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(@NonNull AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (this.fullyWatched) {
            mediationRewardedAdCallback.onUserEarnedReward(this.rewardItem);
        }
        this.rewardedAdCallback.onAdClosed();
    }

    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad.");
        this.appLovinSdkUtilsWrapper.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinRewardedRenderer appLovinRewardedRenderer = AppLovinRewardedRenderer.this;
                appLovinRewardedRenderer.rewardedAdCallback = appLovinRewardedRenderer.adLoadCallback.onSuccess(appLovinRewardedRenderer);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        final AdError adError = AppLovinUtils.getAdError(i2);
        Log.w(TAG, adError.toString());
        this.appLovinSdkUtilsWrapper.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                AppLovinRewardedRenderer.this.adLoadCallback.onFailure(adError);
            }
        });
    }

    public abstract void loadAd();

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get("currency");
        int parseDouble = (int) Double.parseDouble(map.get("amount"));
        Log.d(TAG, "Rewarded " + parseDouble + " " + str);
        this.rewardItem = new AppLovinRewardItem(parseDouble, str);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i2);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z2) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d + "%.");
        this.fullyWatched = z2;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null || !z2) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
    }
}
