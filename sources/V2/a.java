package V2;

import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public final class a implements MediationBannerAd, AdListener {
    public final MediationAdLoadCallback b;

    /* renamed from: c, reason: collision with root package name */
    public AdView f3448c;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f3449d;

    /* renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f3450f;

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, R3.e eVar) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f3449d;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f3450f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f3450f.onAdOpened();
            this.f3450f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.f3450f = (MediationBannerAdCallback) this.b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f3450f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
