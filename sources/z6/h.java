package z6;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* loaded from: classes3.dex */
public final class h implements MediationInterstitialAd {

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f28542b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f28543c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.f f28544d;

    /* renamed from: f, reason: collision with root package name */
    public final y6.a f28545f;

    /* renamed from: g, reason: collision with root package name */
    public MediationInterstitialAdCallback f28546g;

    /* renamed from: h, reason: collision with root package name */
    public PAGInterstitialAd f28547h;

    public h(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, y6.c cVar, y6.f fVar, y6.a aVar, y6.e eVar) {
        this.f28542b = mediationInterstitialAdConfiguration;
        this.f28543c = mediationAdLoadCallback;
        this.f28544d = fVar;
        this.f28545f = aVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f28547h.setAdInteractionListener(new f.a(this, 27));
        if (context instanceof Activity) {
            this.f28547h.show((Activity) context);
        } else {
            this.f28547h.show(null);
        }
    }
}
