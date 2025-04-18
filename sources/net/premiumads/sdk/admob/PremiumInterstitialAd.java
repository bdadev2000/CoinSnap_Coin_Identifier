package net.premiumads.sdk.admob;

import a8.b;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.List;
import vh.a;
import vh.c;
import vh.e;

/* loaded from: classes5.dex */
public class PremiumInterstitialAd extends Adapter implements MediationInterstitialAd {

    /* renamed from: b */
    public InterstitialAd f22757b;

    /* renamed from: c */
    public MediationInterstitialAdCallback f22758c;

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        a.b().getClass();
        InterstitialAd.load(mediationInterstitialAdConfiguration.getContext(), string, a.a(mediationInterstitialAdConfiguration), new e(this, mediationAdLoadCallback));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        InterstitialAd interstitialAd = this.f22757b;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new c(this, 1));
            this.f22757b.show((Activity) context);
        } else {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f22758c;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(new AdError(88, "PremiumAds isn't initialized yet", "net.premiumads.sdk.admob"));
            }
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
