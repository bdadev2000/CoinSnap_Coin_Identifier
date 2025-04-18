package vh;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import net.premiumads.sdk.admob.PremiumRewardedAd;

/* loaded from: classes5.dex */
public final class g extends FullScreenContentCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PremiumRewardedAd f26540b;

    public /* synthetic */ g(PremiumRewardedAd premiumRewardedAd, int i10) {
        this.a = i10;
        this.f26540b = premiumRewardedAd;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        MediationRewardedAdCallback mediationRewardedAdCallback2;
        MediationRewardedAdCallback mediationRewardedAdCallback3;
        MediationRewardedAdCallback mediationRewardedAdCallback4;
        int i10 = this.a;
        PremiumRewardedAd premiumRewardedAd = this.f26540b;
        switch (i10) {
            case 0:
                mediationRewardedAdCallback3 = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback3 != null) {
                    mediationRewardedAdCallback4 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback4.onAdClosed();
                }
                premiumRewardedAd.f22761c = null;
                return;
            default:
                mediationRewardedAdCallback = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback2 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback2.onAdClosed();
                }
                premiumRewardedAd.f22760b = null;
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        MediationRewardedAdCallback mediationRewardedAdCallback2;
        MediationRewardedAdCallback mediationRewardedAdCallback3;
        MediationRewardedAdCallback mediationRewardedAdCallback4;
        int i10 = this.a;
        PremiumRewardedAd premiumRewardedAd = this.f26540b;
        switch (i10) {
            case 0:
                mediationRewardedAdCallback3 = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback3 != null) {
                    mediationRewardedAdCallback4 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback4.onAdFailedToShow(adError);
                }
                premiumRewardedAd.f22761c = null;
                return;
            default:
                mediationRewardedAdCallback = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback2 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback2.onAdFailedToShow(adError);
                }
                premiumRewardedAd.f22760b = null;
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        MediationRewardedAdCallback mediationRewardedAdCallback2;
        MediationRewardedAdCallback mediationRewardedAdCallback3;
        MediationRewardedAdCallback mediationRewardedAdCallback4;
        int i10 = this.a;
        PremiumRewardedAd premiumRewardedAd = this.f26540b;
        switch (i10) {
            case 0:
                mediationRewardedAdCallback3 = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback3 != null) {
                    mediationRewardedAdCallback4 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback4.reportAdImpression();
                    return;
                }
                return;
            default:
                mediationRewardedAdCallback = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback2 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback2.reportAdImpression();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        MediationRewardedAdCallback mediationRewardedAdCallback2;
        MediationRewardedAdCallback mediationRewardedAdCallback3;
        MediationRewardedAdCallback mediationRewardedAdCallback4;
        int i10 = this.a;
        PremiumRewardedAd premiumRewardedAd = this.f26540b;
        switch (i10) {
            case 0:
                mediationRewardedAdCallback3 = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback3 != null) {
                    mediationRewardedAdCallback4 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback4.onAdOpened();
                    return;
                }
                return;
            default:
                mediationRewardedAdCallback = premiumRewardedAd.f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback2 = premiumRewardedAd.f22762d;
                    mediationRewardedAdCallback2.onAdOpened();
                    return;
                }
                return;
        }
    }
}
