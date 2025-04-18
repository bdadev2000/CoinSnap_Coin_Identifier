package vh;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.Adapter;
import net.premiumads.sdk.admob.PremiumAppOpenAd;
import net.premiumads.sdk.admob.PremiumInterstitialAd;

/* loaded from: classes5.dex */
public final class c extends FullScreenContentCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Adapter f26535b;

    public /* synthetic */ c(Adapter adapter, int i10) {
        this.a = i10;
        this.f26535b = adapter;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i10 = this.a;
        Adapter adapter = this.f26535b;
        switch (i10) {
            case 0:
                PremiumAppOpenAd premiumAppOpenAd = (PremiumAppOpenAd) adapter;
                if (PremiumAppOpenAd.access$300(premiumAppOpenAd) != null) {
                    PremiumAppOpenAd.access$300(premiumAppOpenAd).onAdClosed();
                }
                PremiumAppOpenAd.access$302(premiumAppOpenAd, null);
                return;
            default:
                PremiumInterstitialAd premiumInterstitialAd = (PremiumInterstitialAd) adapter;
                if (PremiumInterstitialAd.access$100(premiumInterstitialAd) != null) {
                    PremiumInterstitialAd.access$100(premiumInterstitialAd).onAdClosed();
                }
                PremiumInterstitialAd.access$002(premiumInterstitialAd, null);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        int i10 = this.a;
        Adapter adapter = this.f26535b;
        switch (i10) {
            case 0:
                PremiumAppOpenAd premiumAppOpenAd = (PremiumAppOpenAd) adapter;
                if (PremiumAppOpenAd.access$300(premiumAppOpenAd) != null) {
                    PremiumAppOpenAd.access$300(premiumAppOpenAd).onAdFailedToShow(adError);
                }
                PremiumAppOpenAd.access$302(premiumAppOpenAd, null);
                return;
            default:
                PremiumInterstitialAd premiumInterstitialAd = (PremiumInterstitialAd) adapter;
                if (PremiumInterstitialAd.access$100(premiumInterstitialAd) != null) {
                    PremiumInterstitialAd.access$100(premiumInterstitialAd).onAdFailedToShow(adError);
                }
                PremiumInterstitialAd.access$002(premiumInterstitialAd, null);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        int i10 = this.a;
        Adapter adapter = this.f26535b;
        switch (i10) {
            case 0:
                PremiumAppOpenAd premiumAppOpenAd = (PremiumAppOpenAd) adapter;
                if (PremiumAppOpenAd.access$300(premiumAppOpenAd) != null) {
                    PremiumAppOpenAd.access$300(premiumAppOpenAd).reportAdImpression();
                    return;
                }
                return;
            default:
                PremiumInterstitialAd premiumInterstitialAd = (PremiumInterstitialAd) adapter;
                if (PremiumInterstitialAd.access$100(premiumInterstitialAd) != null) {
                    PremiumInterstitialAd.access$100(premiumInterstitialAd).reportAdImpression();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i10 = this.a;
        Adapter adapter = this.f26535b;
        switch (i10) {
            case 0:
                PremiumAppOpenAd premiumAppOpenAd = (PremiumAppOpenAd) adapter;
                if (PremiumAppOpenAd.access$300(premiumAppOpenAd) != null) {
                    PremiumAppOpenAd.access$300(premiumAppOpenAd).onAdOpened();
                    return;
                }
                return;
            default:
                PremiumInterstitialAd premiumInterstitialAd = (PremiumInterstitialAd) adapter;
                if (PremiumInterstitialAd.access$100(premiumInterstitialAd) != null) {
                    PremiumInterstitialAd.access$100(premiumInterstitialAd).onAdOpened();
                    return;
                }
                return;
        }
    }
}
