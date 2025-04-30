package e3;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import c3.C0603a;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.B;
import com.vungle.ads.C2149y;
import com.vungle.ads.P;
import com.vungle.ads.o1;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219c implements MediationBannerAd, B {
    public final MediationAdLoadCallback b;

    /* renamed from: c, reason: collision with root package name */
    public MediationBannerAdCallback f20078c;

    /* renamed from: d, reason: collision with root package name */
    public C2149y f20079d;

    /* renamed from: f, reason: collision with root package name */
    public RelativeLayout f20080f;

    /* renamed from: g, reason: collision with root package name */
    public final C0603a f20081g;

    public C2219c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, C0603a c0603a) {
        this.b = mediationAdLoadCallback;
        this.f20081g = c0603a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f20080f;
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdClicked(P p2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f20078c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f20078c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdFailedToLoad(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.b.onFailure(adError);
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdFailedToPlay(P p2, o1 o1Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(o1Var).toString());
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdImpression(P p2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f20078c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdLeftApplication(P p2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f20078c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdLoaded(P p2) {
        View bannerView = this.f20079d.getBannerView();
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (bannerView == null) {
            AdError adError = new AdError(106, "Vungle SDK returned a successful load callback, but getBannerView() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            layoutParams.addRule(15, -1);
            bannerView.setLayoutParams(layoutParams);
            this.f20080f.addView(bannerView);
            this.f20078c = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdEnd(P p2) {
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public final void onAdStart(P p2) {
    }
}
