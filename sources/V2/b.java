package V2;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements MediationInterstitialAd, InterstitialAdExtendedListener {
    public final MediationInterstitialAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3451c;

    /* renamed from: d, reason: collision with root package name */
    public InterstitialAd f3452d;

    /* renamed from: f, reason: collision with root package name */
    public MediationInterstitialAdCallback f3453f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f3454g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f3455h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final R3.e f3456i;

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, R3.e eVar) {
        this.b = mediationInterstitialAdConfiguration;
        this.f3451c = mediationAdLoadCallback;
        this.f3456i = eVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3453f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f3453f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.f3453f = (MediationInterstitialAdCallback) this.f3451c.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.f3454g.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3453f;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError2);
                return;
            }
            return;
        }
        this.f3451c.onFailure(adError2);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f3455h.getAndSet(true) && (mediationInterstitialAdCallback = this.f3453f) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f3455h.getAndSet(true) && (mediationInterstitialAdCallback = this.f3453f) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3453f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3453f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f3454g.set(true);
        if (!this.f3452d.show()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.toString());
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3453f;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError);
            }
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
