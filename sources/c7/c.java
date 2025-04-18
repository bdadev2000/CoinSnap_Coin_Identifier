package c7;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.b0;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.ads.y;

/* loaded from: classes3.dex */
public final class c implements MediationBannerAd, b0 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f2676b;

    /* renamed from: c, reason: collision with root package name */
    public MediationBannerAdCallback f2677c;

    /* renamed from: d, reason: collision with root package name */
    public y f2678d;

    /* renamed from: f, reason: collision with root package name */
    public RelativeLayout f2679f;

    /* renamed from: g, reason: collision with root package name */
    public final a7.a f2680g;

    public c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a aVar) {
        this.f2676b = mediationAdLoadCallback;
        this.f2680g = aVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f2679f;
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f2677c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f2677c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f2676b.onFailure(adError);
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(n3Var).toString());
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f2677c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f2677c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        View bannerView = this.f2678d.getBannerView();
        MediationAdLoadCallback mediationAdLoadCallback = this.f2676b;
        if (bannerView == null) {
            AdError adError = new AdError(106, "Vungle SDK returned a successful load callback, but getBannerView() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            layoutParams.addRule(15, -1);
            bannerView.setLayoutParams(layoutParams);
            this.f2679f.addView(bannerView);
            this.f2677c = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
    }
}
