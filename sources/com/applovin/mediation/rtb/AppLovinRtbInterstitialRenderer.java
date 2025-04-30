package com.applovin.mediation.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* loaded from: classes.dex */
public final class AppLovinRtbInterstitialRenderer extends g implements MediationInterstitialAd {

    @Nullable
    private AppLovinInterstitialAdDialog interstitialAd;
    private final AppLovinSdk sdk;

    public AppLovinRtbInterstitialRenderer(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull f fVar, @NonNull a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, fVar, aVar);
        this.sdk = fVar.c(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getServerParameters());
    }

    public void loadAd() {
        a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.sdk;
        Context context = this.interstitialAdConfiguration.getContext();
        aVar.getClass();
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(appLovinSdk, context);
        this.interstitialAd = create;
        create.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, this.interstitialAdConfiguration.getWatermark());
        this.sdk.getAdService().loadNextAdForAdToken(this.interstitialAdConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.interstitialAdConfiguration.getMediationExtras()));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }
}
