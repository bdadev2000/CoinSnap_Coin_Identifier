package vh;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Objects;
import net.premiumads.sdk.admob.PremiumRewardedAd;

/* loaded from: classes5.dex */
public final class i extends RewardedAdLoadCallback {
    public final /* synthetic */ MediationAdLoadCallback a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PremiumRewardedAd f26542b;

    public i(PremiumRewardedAd premiumRewardedAd, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26542b = premiumRewardedAd;
        this.a = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Objects.toString(loadAdError);
        this.f26542b.f22760b = null;
        this.a.onFailure(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        PremiumRewardedAd premiumRewardedAd = this.f26542b;
        premiumRewardedAd.f22760b = rewardedAd;
        premiumRewardedAd.f22762d = (MediationRewardedAdCallback) this.a.onSuccess(premiumRewardedAd);
    }
}
