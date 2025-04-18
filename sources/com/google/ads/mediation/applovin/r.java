package com.google.ads.mediation.applovin;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class r extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f11470d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f11471b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11472c;

    public r(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, f fVar, a aVar, m mVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, fVar, aVar, mVar);
        this.f11472c = false;
    }

    @Override // com.google.ads.mediation.applovin.l, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        f11470d.remove(this.f11471b);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.l, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i10) {
        f11470d.remove(this.f11471b);
        super.failedToReceiveAd(i10);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.f11471b;
        if (str != null) {
            Log.d(l.TAG, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (!this.incentivizedInterstitial.isAdReadyToDisplay()) {
            AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(l.TAG, adError.toString());
            this.rewardedAdCallback.onAdFailedToShow(adError);
        } else {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            if (this.f11472c) {
                f11470d.remove(this.f11471b);
            }
        }
    }
}
