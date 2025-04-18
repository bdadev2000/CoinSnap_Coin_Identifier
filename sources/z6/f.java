package z6;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes3.dex */
public final class f implements MediationBannerAd, PAGBannerAdInteractionListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationBannerAdConfiguration f28536b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f28537c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.f f28538d;

    /* renamed from: f, reason: collision with root package name */
    public final y6.a f28539f;

    /* renamed from: g, reason: collision with root package name */
    public MediationBannerAdCallback f28540g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f28541h;

    public f(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, y6.c cVar, y6.f fVar, y6.a aVar, y6.e eVar) {
        this.f28536b = mediationBannerAdConfiguration;
        this.f28537c = mediationAdLoadCallback;
        this.f28538d = fVar;
        this.f28539f = aVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f28541h;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f28540g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f28540g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
