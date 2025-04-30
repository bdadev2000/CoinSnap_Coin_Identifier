package b3;

import a3.C0339a;
import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import n1.C2475f;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558c implements MediationAppOpenAd {
    public final MediationAppOpenAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f5280c;

    /* renamed from: d, reason: collision with root package name */
    public final a3.f f5281d;

    /* renamed from: f, reason: collision with root package name */
    public final C0339a f5282f;

    /* renamed from: g, reason: collision with root package name */
    public MediationAppOpenAdCallback f5283g;

    /* renamed from: h, reason: collision with root package name */
    public PAGAppOpenAd f5284h;

    public C0558c(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a3.c cVar, a3.f fVar, C0339a c0339a, a3.e eVar) {
        this.b = mediationAppOpenAdConfiguration;
        this.f5280c = mediationAdLoadCallback;
        this.f5281d = fVar;
        this.f5282f = c0339a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        this.f5284h.setAdInteractionListener(new C2475f(this, 24));
        if (context instanceof Activity) {
            this.f5284h.show((Activity) context);
        } else {
            this.f5284h.show(null);
        }
    }
}
