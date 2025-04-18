package z6;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes3.dex */
public final class m implements MediationRewardedAd {

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f28558b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f28559c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.f f28560d;

    /* renamed from: f, reason: collision with root package name */
    public final y6.a f28561f;

    /* renamed from: g, reason: collision with root package name */
    public MediationRewardedAdCallback f28562g;

    /* renamed from: h, reason: collision with root package name */
    public PAGRewardedAd f28563h;

    public m(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, y6.c cVar, y6.f fVar, y6.a aVar, y6.e eVar) {
        this.f28558b = mediationRewardedAdConfiguration;
        this.f28559c = mediationAdLoadCallback;
        this.f28560d = fVar;
        this.f28561f = aVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.f28563h.setAdInteractionListener(new fb.c(this, 22));
        if (context instanceof Activity) {
            this.f28563h.show((Activity) context);
        } else {
            this.f28563h.show(null);
        }
    }
}
