package z6;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* loaded from: classes3.dex */
public final class c implements MediationAppOpenAd {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f28527b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f28528c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.f f28529d;

    /* renamed from: f, reason: collision with root package name */
    public final y6.a f28530f;

    /* renamed from: g, reason: collision with root package name */
    public MediationAppOpenAdCallback f28531g;

    /* renamed from: h, reason: collision with root package name */
    public PAGAppOpenAd f28532h;

    public c(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, y6.c cVar, y6.f fVar, y6.a aVar, y6.e eVar) {
        this.f28527b = mediationAppOpenAdConfiguration;
        this.f28528c = mediationAdLoadCallback;
        this.f28529d = fVar;
        this.f28530f = aVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        this.f28532h.setAdInteractionListener(new kc.c(this, 27));
        if (context instanceof Activity) {
            this.f28532h.show((Activity) context);
        } else {
            this.f28532h.show(null);
        }
    }
}
