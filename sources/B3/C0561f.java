package b3;

import a3.C0339a;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561f implements MediationBannerAd, PAGBannerAdInteractionListener {
    public final MediationBannerAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f5289c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.f f5290d;

    /* renamed from: f, reason: collision with root package name */
    public final C0339a f5291f;

    /* renamed from: g, reason: collision with root package name */
    public MediationBannerAdCallback f5292g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f5293h;

    public C0561f(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a3.c cVar, a3.f fVar, C0339a c0339a, a3.e eVar) {
        this.b = mediationBannerAdConfiguration;
        this.f5289c = mediationAdLoadCallback;
        this.f5290d = fVar;
        this.f5291f = c0339a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f5293h;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f5292g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f5292g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
    }
}
