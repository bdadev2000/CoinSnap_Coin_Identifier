package c7;

import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.c0;
import com.vungle.ads.c1;
import com.vungle.ads.y;
import com.vungle.mediation.VungleInterstitialAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements a7.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2685f;

    public /* synthetic */ d(Object obj, Context context, String str, com.vungle.ads.d dVar, Object obj2, int i10) {
        this.a = i10;
        this.f2685f = obj;
        this.f2681b = context;
        this.f2682c = str;
        this.f2683d = dVar;
        this.f2684e = obj2;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        int i10 = this.a;
        Object obj = this.f2685f;
        switch (i10) {
            case 0:
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                ((e) obj).f2686b.onFailure(adError);
                return;
            case 1:
                ((MediationInterstitialListener) this.f2684e).onAdFailedToLoad((VungleInterstitialAdapter) obj, adError);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                return;
            default:
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) obj;
                if (VungleInterstitialAdapter.d(vungleInterstitialAdapter) != null) {
                    VungleInterstitialAdapter.d(vungleInterstitialAdapter).onAdFailedToLoad(vungleInterstitialAdapter, adError);
                    return;
                }
                return;
        }
    }

    @Override // a7.b
    public final void b() {
        int i10 = this.a;
        Object obj = this.f2684e;
        String placementId = this.f2682c;
        Context context = this.f2681b;
        Object obj2 = this.f2683d;
        Object obj3 = this.f2685f;
        switch (i10) {
            case 0:
                e eVar = (e) obj3;
                com.vungle.ads.d adConfig = (com.vungle.ads.d) obj2;
                eVar.f2689f.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adConfig, "adConfig");
                c1 c1Var = new c1(context, placementId, adConfig);
                eVar.f2688d = c1Var;
                c1Var.setAdListener(eVar);
                eVar.f2688d.load((String) obj);
                return;
            case 1:
                VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) obj3;
                VungleInterstitialAdapter.h(vungleInterstitialAdapter, new c1(context, placementId, (com.vungle.ads.d) obj2));
                VungleInterstitialAdapter.c(vungleInterstitialAdapter).setAdListener(new ih.b(vungleInterstitialAdapter));
                VungleInterstitialAdapter.c(vungleInterstitialAdapter).load(null);
                return;
            default:
                VungleInterstitialAdapter vungleInterstitialAdapter2 = (VungleInterstitialAdapter) obj3;
                VungleInterstitialAdapter.g(vungleInterstitialAdapter2, new RelativeLayout(context));
                AdSize adSize = (AdSize) obj;
                int heightInPixels = adSize.getHeightInPixels(context);
                if (heightInPixels <= 0) {
                    heightInPixels = Math.round(((c0) obj2).getHeight() * context.getResources().getDisplayMetrics().density);
                }
                VungleInterstitialAdapter.b(vungleInterstitialAdapter2).setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
                VungleInterstitialAdapter.f(vungleInterstitialAdapter2, new y(context, placementId, (c0) obj2));
                VungleInterstitialAdapter.a(vungleInterstitialAdapter2).setAdListener(new ih.a(vungleInterstitialAdapter2));
                VungleInterstitialAdapter.a(vungleInterstitialAdapter2).load(null);
                return;
        }
    }

    public d(VungleInterstitialAdapter vungleInterstitialAdapter, Context context, AdSize adSize, c0 c0Var, String str) {
        this.a = 2;
        this.f2685f = vungleInterstitialAdapter;
        this.f2681b = context;
        this.f2684e = adSize;
        this.f2683d = c0Var;
        this.f2682c = str;
    }
}
