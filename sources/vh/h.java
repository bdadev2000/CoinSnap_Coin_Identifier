package vh;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.Objects;
import net.premiumads.sdk.admob.PremiumRewardedAd;

/* loaded from: classes5.dex */
public final class h extends RewardedInterstitialAdLoadCallback {
    public final /* synthetic */ MediationAdLoadCallback a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PremiumRewardedAd f26541b;

    public h(PremiumRewardedAd premiumRewardedAd, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26541b = premiumRewardedAd;
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Objects.toString(loadAdError);
        this.f26541b.f22761c = null;
        this.a.onFailure(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        PremiumRewardedAd premiumRewardedAd = this.f26541b;
        premiumRewardedAd.f22761c = rewardedInterstitialAd;
        premiumRewardedAd.f22762d = (MediationRewardedAdCallback) this.a.onSuccess(premiumRewardedAd);
    }
}
