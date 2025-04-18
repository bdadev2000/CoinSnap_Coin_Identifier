package c7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements a7.b {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.d f2702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f2705f;

    public i(j jVar, Context context, String str, com.vungle.ads.d dVar, String str2, String str3) {
        this.f2705f = jVar;
        this.a = context;
        this.f2701b = str;
        this.f2702c = dVar;
        this.f2703d = str2;
        this.f2704e = str3;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f2705f.f2707c.onFailure(adError);
    }

    @Override // a7.b
    public final void b() {
        j jVar = this.f2705f;
        jVar.f2710g.getClass();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        String placementId = this.f2701b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        com.vungle.ads.d adConfig = this.f2702c;
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        h2 h2Var = new h2(context, placementId, adConfig);
        jVar.f2709f = h2Var;
        h2Var.setAdListener(jVar);
        String str = this.f2703d;
        if (!TextUtils.isEmpty(str)) {
            jVar.f2709f.setUserId(str);
        }
        jVar.f2709f.load(this.f2704e);
    }
}
