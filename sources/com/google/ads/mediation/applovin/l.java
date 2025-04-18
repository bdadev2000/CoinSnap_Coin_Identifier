package com.google.ads.mediation.applovin;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class l implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.";
    protected static final String TAG = "l";
    protected final MediationRewardedAdConfiguration adConfiguration;
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected final a appLovinAdFactory;
    protected final f appLovinInitializer;

    @Nullable
    protected AppLovinSdk appLovinSdk;
    protected final m appLovinSdkUtilsWrapper;
    private boolean fullyWatched;

    @Nullable
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private i rewardItem;

    @Nullable
    protected MediationRewardedAdCallback rewardedAdCallback;

    public l(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, f fVar, a aVar, m mVar) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = fVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkUtilsWrapper = mVar;
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

    public void adReceived(AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad: " + appLovinAd.getAdIdNumber());
        m mVar = this.appLovinSdkUtilsWrapper;
        j jVar = new j(this);
        mVar.getClass();
        AppLovinSdkUtils.runOnUiThread(jVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(TAG, adError.toString());
        m mVar = this.appLovinSdkUtilsWrapper;
        k kVar = new k(this, adError);
        mVar.getClass();
        AppLovinSdkUtils.runOnUiThread(kVar);
    }

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
        String str = map.get(AppLovinEventParameters.REVENUE_CURRENCY);
        int parseDouble = (int) Double.parseDouble(map.get("amount"));
        Log.d(TAG, "Rewarded " + parseDouble + " " + str);
        this.rewardItem = new i(parseDouble, str);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i10);
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
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d10 + "%.");
        this.fullyWatched = z10;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null && z10) {
            mediationRewardedAdCallback.onVideoComplete();
        }
    }
}
