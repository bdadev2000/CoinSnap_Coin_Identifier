package b3;

import a3.C0339a;
import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* renamed from: b3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568m implements MediationRewardedAd {
    public final MediationRewardedAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f5311c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.f f5312d;

    /* renamed from: f, reason: collision with root package name */
    public final C0339a f5313f;

    /* renamed from: g, reason: collision with root package name */
    public MediationRewardedAdCallback f5314g;

    /* renamed from: h, reason: collision with root package name */
    public PAGRewardedAd f5315h;

    public C0568m(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a3.c cVar, a3.f fVar, C0339a c0339a, a3.e eVar) {
        this.b = mediationRewardedAdConfiguration;
        this.f5311c = mediationAdLoadCallback;
        this.f5312d = fVar;
        this.f5313f = c0339a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.f5315h.setAdInteractionListener(new E1.c(this, 28));
        if (context instanceof Activity) {
            this.f5315h.show((Activity) context);
        } else {
            this.f5315h.show(null);
        }
    }
}
