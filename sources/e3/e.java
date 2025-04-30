package e3;

import android.content.Context;
import android.util.Log;
import c3.C0603a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.C2076e0;
import com.vungle.ads.InterfaceC2080g0;
import com.vungle.ads.P;
import com.vungle.ads.o1;

/* loaded from: classes.dex */
public final class e implements MediationInterstitialAd, InterfaceC2080g0 {
    public final MediationAdLoadCallback b;

    /* renamed from: c, reason: collision with root package name */
    public MediationInterstitialAdCallback f20087c;

    /* renamed from: d, reason: collision with root package name */
    public C2076e0 f20088d;

    /* renamed from: f, reason: collision with root package name */
    public final C0603a f20089f;

    public e(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, C0603a c0603a) {
        this.b = mediationAdLoadCallback;
        this.f20089f = c0603a;
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdClicked(P p2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdEnd(P p2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToLoad(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.b.onFailure(adError);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToPlay(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdImpression(P p2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLeftApplication(P p2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLoaded(P p2) {
        this.f20087c = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdStart(P p2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f20087c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        C2076e0 c2076e0 = this.f20088d;
        if (c2076e0 != null) {
            c2076e0.play(context);
        } else if (this.f20087c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f20087c.onAdFailedToShow(adError);
        }
    }
}
