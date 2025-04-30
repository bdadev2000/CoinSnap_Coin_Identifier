package com.applovin.mediation.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.k;
import com.google.ads.mediation.applovin.l;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes.dex */
public final class AppLovinRtbRewardedRenderer extends k {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull f fVar, @NonNull a aVar, @NonNull l lVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, fVar, aVar, lVar);
    }

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    public void loadAd() {
        AppLovinSdk c9 = this.appLovinInitializer.c(this.adConfiguration.getContext(), this.adConfiguration.getServerParameters());
        this.appLovinSdk = c9;
        this.appLovinAdFactory.getClass();
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(c9);
        this.incentivizedInterstitial = create;
        create.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, this.adConfiguration.getWatermark());
        this.appLovinSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
