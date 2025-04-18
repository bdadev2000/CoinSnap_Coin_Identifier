package t6;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.internal.m;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f25270b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f25271c;

    /* renamed from: d, reason: collision with root package name */
    public InterstitialAd f25272d;

    /* renamed from: f, reason: collision with root package name */
    public MediationInterstitialAdCallback f25273f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25274g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f25275h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final m f25276i;

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, m mVar) {
        this.f25270b = mediationInterstitialAdConfiguration;
        this.f25271c = mediationAdLoadCallback;
        this.f25276i = mVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f25273f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f25273f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f25273f = (MediationInterstitialAdCallback) this.f25271c.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.f25274g.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f25273f;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError2);
                return;
            }
            return;
        }
        this.f25271c.onFailure(adError2);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f25275h.getAndSet(true) && (mediationInterstitialAdCallback = this.f25273f) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f25275h.getAndSet(true) && (mediationInterstitialAdCallback = this.f25273f) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f25273f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f25273f;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
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

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f25274g.set(true);
        if (!this.f25272d.show()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.toString());
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f25273f;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError);
            }
        }
    }
}
