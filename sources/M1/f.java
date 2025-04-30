package m1;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import k.AbstractActivityC2417f;
import n1.C2471b;
import o1.C2492a;

/* loaded from: classes.dex */
public final class f extends F2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F2.h f21725d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f21727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21728g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21724c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21726e = true;

    public f(F2.h hVar, Context context, C2492a c2492a) {
        this.f21725d = hVar;
        this.f21727f = context;
        this.f21728g = c2492a;
    }

    @Override // F2.h
    public void E() {
        switch (this.f21724c) {
            case 1:
                this.f21725d.E();
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void F() {
        switch (this.f21724c) {
            case 1:
                this.f21725d.F();
                boolean z8 = this.f21726e;
                C2492a c2492a = (C2492a) this.f21728g;
                if (z8) {
                    g.b().c(this.f21727f, c2492a.b.getAdUnitId(), new C2471b(this, 0));
                    return;
                }
                c2492a.f(null);
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void G(LoadAdError loadAdError) {
        F2.h hVar;
        e eVar;
        switch (this.f21724c) {
            case 0:
                g gVar = (g) this.f21728g;
                if (!gVar.f21732e && (hVar = this.f21725d) != null) {
                    hVar.N();
                    Handler handler = gVar.b;
                    if (handler != null && (eVar = gVar.f21730c) != null) {
                        handler.removeCallbacks(eVar);
                    }
                    hVar.G(loadAdError);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public final void H(AdError adError) {
        switch (this.f21724c) {
            case 0:
                F2.h hVar = this.f21725d;
                if (hVar != null) {
                    hVar.H(adError);
                    hVar.N();
                    return;
                }
                return;
            default:
                this.f21725d.H(adError);
                boolean z8 = this.f21726e;
                C2492a c2492a = (C2492a) this.f21728g;
                if (z8) {
                    g.b().c(this.f21727f, c2492a.b.getAdUnitId(), new C2471b(this, 1));
                    return;
                }
                c2492a.f(null);
                return;
        }
    }

    @Override // F2.h
    public void K(InterstitialAd interstitialAd) {
        switch (this.f21724c) {
            case 0:
                g gVar = (g) this.f21728g;
                if (!gVar.f21732e && interstitialAd != null) {
                    gVar.f21738k = interstitialAd;
                    if (gVar.f21735h) {
                        boolean z8 = this.f21726e;
                        F2.h hVar = this.f21725d;
                        if (z8) {
                            gVar.e((AbstractActivityC2417f) this.f21727f, hVar);
                            return;
                        } else {
                            hVar.getClass();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void L() {
        switch (this.f21724c) {
            case 1:
                this.f21725d.L();
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void N() {
        switch (this.f21724c) {
            case 1:
                this.f21725d.N();
                return;
            default:
                return;
        }
    }

    public f(g gVar, Context context, W6.c cVar) {
        this.f21728g = gVar;
        this.f21727f = context;
        this.f21725d = cVar;
    }
}
