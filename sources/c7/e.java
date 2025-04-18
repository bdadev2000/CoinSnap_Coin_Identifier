package c7;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.c1;
import com.vungle.ads.e1;
import com.vungle.ads.n3;
import com.vungle.ads.o0;

/* loaded from: classes3.dex */
public final class e implements MediationInterstitialAd, e1 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f2686b;

    /* renamed from: c, reason: collision with root package name */
    public MediationInterstitialAdCallback f2687c;

    /* renamed from: d, reason: collision with root package name */
    public c1 f2688d;

    /* renamed from: f, reason: collision with root package name */
    public final a7.a f2689f;

    public e(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a aVar) {
        this.f2686b = mediationAdLoadCallback;
        this.f2689f = aVar;
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f2686b.onFailure(adError);
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        this.f2687c = (MediationInterstitialAdCallback) this.f2686b.onSuccess(this);
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f2687c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        c1 c1Var = this.f2688d;
        if (c1Var != null) {
            c1Var.play(context);
        } else if (this.f2687c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f2687c.onAdFailedToShow(adError);
        }
    }
}
