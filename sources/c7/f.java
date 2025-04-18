package c7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.t1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements a7.b {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2693e;

    public f(h hVar, Context context, String str, int i10, String str2) {
        this.f2693e = hVar;
        this.a = context;
        this.f2690b = str;
        this.f2691c = i10;
        this.f2692d = str2;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        Log.d(VungleMediationAdapter.TAG, adError.toString());
        this.f2693e.f2695c.onFailure(adError);
    }

    @Override // a7.b
    public final void b() {
        h hVar = this.f2693e;
        hVar.f2700i.getClass();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        String placementId = this.f2690b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        hVar.f2697f = new t1(context, placementId);
        hVar.f2697f.setAdOptionsPosition(this.f2691c);
        hVar.f2697f.setAdListener(hVar);
        hVar.f2698g = new hh.g(context);
        String str = this.f2692d;
        if (!TextUtils.isEmpty(str)) {
            hVar.f2697f.getAdConfig().setWatermark(str);
        }
        hVar.f2697f.load(hVar.f2699h);
    }
}
