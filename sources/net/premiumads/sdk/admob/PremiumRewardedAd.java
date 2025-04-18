package net.premiumads.sdk.admob;

import a8.b;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import gb.d;
import java.util.List;
import ka.f;
import vh.a;
import vh.g;
import vh.h;
import vh.i;

/* loaded from: classes5.dex */
public class PremiumRewardedAd extends Adapter implements MediationRewardedAd {

    /* renamed from: b */
    public RewardedAd f22760b;

    /* renamed from: c */
    public RewardedInterstitialAd f22761c;

    /* renamed from: d */
    public MediationRewardedAdCallback f22762d;

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        a.b().getClass();
        RewardedAd.load(mediationRewardedAdConfiguration.getContext(), string, a.a(mediationRewardedAdConfiguration), new i(this, mediationAdLoadCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        a.b().getClass();
        RewardedInterstitialAd.load(mediationRewardedAdConfiguration.getContext(), string, a.a(mediationRewardedAdConfiguration), new h(this, mediationAdLoadCallback));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        RewardedAd rewardedAd = this.f22760b;
        if (rewardedAd != null) {
            if (rewardedAd == null) {
                MediationRewardedAdCallback mediationRewardedAdCallback = this.f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdFailedToShow(new AdError(88, "PremiumAds isn't initialized yet", "net.premiumads.sdk.admob"));
                    return;
                }
                return;
            }
            rewardedAd.setFullScreenContentCallback(new g(this, 1));
            this.f22760b.show((Activity) context, new d(this, 15));
            return;
        }
        RewardedInterstitialAd rewardedInterstitialAd = this.f22761c;
        if (rewardedInterstitialAd != null) {
            if (rewardedInterstitialAd == null) {
                MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f22762d;
                if (mediationRewardedAdCallback2 != null) {
                    mediationRewardedAdCallback2.onAdFailedToShow(new AdError(88, "PremiumAds isn't initialized yet", "net.premiumads.sdk.admob"));
                    return;
                }
                return;
            }
            rewardedInterstitialAd.setFullScreenContentCallback(new g(this, 0));
            this.f22761c.show((Activity) context, new f(this));
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback3 = this.f22762d;
        if (mediationRewardedAdCallback3 != null) {
            mediationRewardedAdCallback3.onAdFailedToShow(new AdError(88, "PremiumAds isn't initialized yet", "net.premiumads.sdk.admob"));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        com.google.android.gms.ads.VersionInfo version = MobileAds.getVersion();
        return new VersionInfo(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        int i10 = 2;
        b bVar = new b(i10, i10, 5);
        return new VersionInfo(bVar.a, bVar.f310b, bVar.f311c);
    }
}
