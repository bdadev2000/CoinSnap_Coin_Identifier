package vh;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import net.premiumads.sdk.admob.PremiumBannerAd;

/* loaded from: classes5.dex */
public final class d extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdView f26536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediationAdLoadCallback f26537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PremiumBannerAd f26538d;

    public d(PremiumBannerAd premiumBannerAd, AdView adView, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26538d = premiumBannerAd;
        this.f26536b = adView;
        this.f26537c = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback;
        MediationBannerAdCallback mediationBannerAdCallback2;
        PremiumBannerAd premiumBannerAd = this.f26538d;
        mediationBannerAdCallback = premiumBannerAd.f22756c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback2 = premiumBannerAd.f22756c;
            mediationBannerAdCallback2.reportAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getCode();
        this.f26537c.onFailure(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        MediationBannerAdCallback mediationBannerAdCallback;
        MediationBannerAdCallback mediationBannerAdCallback2;
        PremiumBannerAd premiumBannerAd = this.f26538d;
        mediationBannerAdCallback = premiumBannerAd.f22756c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback2 = premiumBannerAd.f22756c;
            mediationBannerAdCallback2.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        AdView adView = this.f26536b;
        PremiumBannerAd premiumBannerAd = this.f26538d;
        premiumBannerAd.f22755b = adView;
        premiumBannerAd.f22756c = (MediationBannerAdCallback) this.f26537c.onSuccess(premiumBannerAd);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        MediationBannerAdCallback mediationBannerAdCallback;
        MediationBannerAdCallback mediationBannerAdCallback2;
        PremiumBannerAd premiumBannerAd = this.f26538d;
        mediationBannerAdCallback = premiumBannerAd.f22756c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback2 = premiumBannerAd.f22756c;
            mediationBannerAdCallback2.onAdOpened();
        }
    }
}
