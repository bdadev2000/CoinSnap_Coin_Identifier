package t6;

import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.internal.m;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes3.dex */
public final class a implements MediationBannerAd, AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f25266b;

    /* renamed from: c, reason: collision with root package name */
    public AdView f25267c;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f25268d;

    /* renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f25269f;

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, m mVar) {
        this.f25266b = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f25268d;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f25269f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f25269f.onAdOpened();
            this.f25269f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f25269f = (MediationBannerAdCallback) this.f25266b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f25266b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f25269f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
