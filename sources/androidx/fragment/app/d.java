package androidx.fragment.app;

import com.applovin.impl.bc;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.t7;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import mb.o2;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1602c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1603d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1605g;

    public /* synthetic */ d(c2 c2Var, c2 c2Var2, boolean z10, r.b bVar) {
        this.f1601b = 0;
        this.f1603d = c2Var;
        this.f1604f = c2Var2;
        this.f1602c = z10;
        this.f1605g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1601b;
        boolean z10 = this.f1602c;
        Object obj = this.f1605g;
        Object obj2 = this.f1604f;
        Object obj3 = this.f1603d;
        switch (i10) {
            case 0:
                r.b sharedElements = (r.b) obj;
                Intrinsics.checkNotNullParameter(sharedElements, "$lastInViews");
                Fragment inFragment = ((c2) obj3).f1596c;
                Fragment outFragment = ((c2) obj2).f1596c;
                s1 s1Var = n1.a;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (z10) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 1:
                bc.a(z10, (MaxNativeAdListener) obj3, (MaxNativeAdView) obj2, (MaxAd) obj);
                return;
            case 2:
                bc.a(z10, (MaxNativeAdListener) obj3, (String) obj2, (MaxError) obj);
                return;
            case 3:
                bc.a(z10, (MaxAdListener) obj3, (MaxAd) obj2, (MaxError) obj);
                return;
            case 4:
                bc.a(z10, (MaxAdExpirationListener) obj3, (MaxAd) obj2, (MaxAd) obj);
                return;
            case 5:
                bc.a(z10, (MaxAdListener) obj3, (MaxAd) obj2, (MaxReward) obj);
                return;
            case 6:
                bc.a(z10, (MaxAdListener) obj3, (String) obj2, (MaxError) obj);
                return;
            case 7:
                EventServiceImpl.a((EventServiceImpl) obj3, (t7) obj2, (Map) obj, z10);
                return;
            case 8:
                ob.c cVar = (ob.c) obj3;
                cVar.getClass();
                b6.a.f2288f.d("disk worker: log non-fatal event to persistence", null);
                ((ob.a) cVar.f23292b).c((o2) obj2, (String) obj, z10);
                return;
            default:
                com.vungle.ads.internal.presenter.q.m53processCommand$lambda9((com.vungle.ads.internal.presenter.q) obj3, z10, (String) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ d(com.vungle.ads.internal.presenter.q qVar, boolean z10, String str, String str2) {
        this.f1601b = 9;
        this.f1603d = qVar;
        this.f1602c = z10;
        this.f1604f = str;
        this.f1605g = str2;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f1601b = i10;
        this.f1603d = obj;
        this.f1604f = obj2;
        this.f1605g = obj3;
        this.f1602c = z10;
    }

    public /* synthetic */ d(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f1601b = i10;
        this.f1602c = z10;
        this.f1603d = obj;
        this.f1604f = obj2;
        this.f1605g = obj3;
    }
}
