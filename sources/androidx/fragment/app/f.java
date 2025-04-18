package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import com.applovin.impl.hb;
import com.applovin.impl.r;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements j0.d, NativeAd.OnNativeAdLoadedListener, OnPaidEventListener, zb.a, r.b, o7.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1631d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1632f;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1629b = obj;
        this.f1630c = obj2;
        this.f1631d = obj3;
        this.f1632f = obj4;
    }

    @Override // com.applovin.impl.r.b
    public final void a(Activity activity) {
        com.applovin.impl.x.a((yb) this.f1629b, (com.applovin.impl.z) this.f1630c, (com.applovin.impl.a0) this.f1631d, (com.applovin.impl.sdk.k) this.f1632f, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // o7.h
    public final Object apply(Object obj) {
        o7.j jVar = (o7.j) this.f1629b;
        String str = (String) this.f1630c;
        Map map = (Map) this.f1631d;
        ic.t tVar = (ic.t) this.f1632f;
        f7.c cVar = o7.j.f23150h;
        jVar.getClass();
        return (l7.a) o7.j.s(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new f2.i(6, jVar, map, tVar));
    }

    @Override // j0.d
    public final void d() {
        View view = (View) this.f1629b;
        l this$0 = (l) this.f1630c;
        g animationInfo = (g) this.f1631d;
        c2 operation = (c2) this.f1632f;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.a.endViewTransition(view);
        animationInfo.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        c3.j jVar = (c3.j) this.f1629b;
        jb.g gVar = (jb.g) this.f1630c;
        Context context = (Context) this.f1631d;
        String str = (String) this.f1632f;
        jVar.getClass();
        gVar.x(nativeAd);
        nativeAd.setOnPaidEventListener(new f(jVar, context, str, nativeAd));
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        c3.j jVar = (c3.j) this.f1629b;
        Context context = (Context) this.f1630c;
        String str = (String) this.f1631d;
        NativeAd nativeAd = (NativeAd) this.f1632f;
        jVar.getClass();
        d6.g.v(context, adValue, str, nativeAd.getResponseInfo().getMediationAdapterClassName());
        String str2 = jVar.f2576l;
        if (str2 != null) {
            d6.g.w(adValue, str, str2);
        }
    }

    @Override // com.applovin.impl.zb.a
    public final void a(hb hbVar, yb ybVar) {
        ((com.applovin.impl.x) this.f1629b).a((com.applovin.impl.sdk.k) this.f1630c, (com.applovin.impl.z) this.f1631d, (com.applovin.impl.a0) this.f1632f, hbVar, ybVar);
    }
}
