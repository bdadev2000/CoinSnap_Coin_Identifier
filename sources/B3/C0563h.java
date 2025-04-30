package b3;

import a3.C0339a;
import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563h implements MediationInterstitialAd {
    public final MediationInterstitialAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f5295c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.f f5296d;

    /* renamed from: f, reason: collision with root package name */
    public final C0339a f5297f;

    /* renamed from: g, reason: collision with root package name */
    public MediationInterstitialAdCallback f5298g;

    /* renamed from: h, reason: collision with root package name */
    public PAGInterstitialAd f5299h;

    public C0563h(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a3.c cVar, a3.f fVar, C0339a c0339a, a3.e eVar) {
        this.b = mediationInterstitialAdConfiguration;
        this.f5295c = mediationAdLoadCallback;
        this.f5296d = fVar;
        this.f5297f = c0339a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f5299h.setAdInteractionListener(new E1.c(this, 27));
        if (context instanceof Activity) {
            this.f5299h.show((Activity) context);
        } else {
            this.f5299h.show(null);
        }
    }
}
