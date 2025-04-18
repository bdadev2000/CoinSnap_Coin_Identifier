package vh;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import net.premiumads.sdk.admob.PremiumInterstitialAd;

/* loaded from: classes5.dex */
public final class e extends InterstitialAdLoadCallback {
    public final /* synthetic */ MediationAdLoadCallback a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PremiumInterstitialAd f26539b;

    public e(PremiumInterstitialAd premiumInterstitialAd, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26539b = premiumInterstitialAd;
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getCode();
        this.f26539b.f22757b = null;
        this.a.onFailure(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        PremiumInterstitialAd premiumInterstitialAd = this.f26539b;
        premiumInterstitialAd.f22757b = interstitialAd;
        premiumInterstitialAd.f22758c = (MediationInterstitialAdCallback) this.a.onSuccess(premiumInterstitialAd);
    }
}
