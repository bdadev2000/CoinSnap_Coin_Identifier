package c7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.c0;
import com.vungle.ads.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements a7.b {
    public final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSize f2671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f2672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f2675g;

    public b(c cVar, Context context, String str, AdSize adSize, c0 c0Var, String str2, String str3) {
        this.f2675g = cVar;
        this.a = context;
        this.f2670b = str;
        this.f2671c = adSize;
        this.f2672d = c0Var;
        this.f2673e = str2;
        this.f2674f = str3;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f2675g.f2676b.onFailure(adError);
    }

    @Override // a7.b
    public final void b() {
        c cVar = this.f2675g;
        cVar.getClass();
        Context context = this.a;
        cVar.f2679f = new RelativeLayout(context);
        AdSize adSize = this.f2671c;
        int heightInPixels = adSize.getHeightInPixels(context);
        c0 adSize2 = this.f2672d;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(adSize2.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        cVar.f2679f.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        cVar.f2680g.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        String placementId = this.f2670b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize2, "adSize");
        y yVar = new y(context, placementId, adSize2);
        cVar.f2678d = yVar;
        yVar.setAdListener(cVar);
        String str = this.f2674f;
        if (!TextUtils.isEmpty(str)) {
            cVar.f2678d.getAdConfig().setWatermark(str);
        }
        cVar.f2678d.load(this.f2673e);
    }
}
