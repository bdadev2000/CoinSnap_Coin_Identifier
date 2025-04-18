package b7;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.c1;
import com.vungle.ads.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements a7.b {
    public final /* synthetic */ b a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2318d;

    public a(b bVar, Bundle bundle, Context context, String str) {
        this.a = bVar;
        this.f2316b = bundle;
        this.f2317c = context;
        this.f2318d = str;
    }

    @Override // a7.b
    public final void a(AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w(VungleMediationAdapter.TAG, error.toString());
        this.a.f2320c.onFailure(error);
    }

    @Override // a7.b
    public final void b() {
        b bVar = this.a;
        bVar.f2321d.getClass();
        d adConfig = new d();
        Bundle bundle = this.f2316b;
        if (bundle.containsKey("adOrientation")) {
            adConfig.setAdOrientation(bundle.getInt("adOrientation", 2));
        }
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = bVar.f2319b;
        bVar.b(adConfig, mediationAppOpenAdConfiguration);
        String placementId = this.f2318d;
        Intrinsics.checkNotNull(placementId);
        bVar.f2321d.getClass();
        Context context = this.f2317c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        c1 c1Var = new c1(context, placementId, adConfig);
        bVar.f2322f = c1Var;
        c1Var.setAdListener(bVar);
        c1 c1Var2 = bVar.f2322f;
        if (c1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appOpenAd");
            c1Var2 = null;
        }
        c1Var2.load(bVar.a(mediationAppOpenAdConfiguration));
    }
}
