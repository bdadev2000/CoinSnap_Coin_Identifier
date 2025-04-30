package com.google.ads.mediation.applovin;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.ads.AdError;
import java.util.HashMap;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f13870d = new HashMap();
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13871c;

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        f13870d.remove(this.b);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i9) {
        f13870d.remove(this.b);
        super.failedToReceiveAd(i9);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.b;
        if (str != null) {
            Log.d(k.TAG, AbstractC2914a.e("Showing rewarded video for zone '", str, "'"));
        }
        if (!this.incentivizedInterstitial.isAdReadyToDisplay()) {
            AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(k.TAG, adError.toString());
            this.rewardedAdCallback.onAdFailedToShow(adError);
        } else {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            if (this.f13871c) {
                f13870d.remove(this.b);
            }
        }
    }
}
