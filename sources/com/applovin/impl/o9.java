package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class o9 extends n9 {
    private final p9 L;
    private w1 M;
    private long N;
    private final AtomicBoolean O;

    public o9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new p9(this.a, this.f6366d, this.f6364b);
        this.O = new AtomicBoolean();
        if (zp.a(oj.f6713n1, kVar)) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.O.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f6378q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f6372k;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f6371j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.a.getAdEventTracker().b(this.f6370i, arrayList);
    }

    private void L() {
        this.L.a(this.f6373l);
        this.f6378q = SystemClock.elapsedRealtime();
        this.O.set(true);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void K() {
        long V;
        long j3 = 0;
        if (this.a.U() >= 0 || this.a.V() >= 0) {
            if (this.a.U() >= 0) {
                V = this.a.U();
            } else {
                if (this.a.T0()) {
                    int g12 = (int) ((com.applovin.impl.sdk.ad.a) this.a).g1();
                    if (g12 > 0) {
                        j3 = TimeUnit.SECONDS.toMillis(g12);
                    } else {
                        int p10 = (int) this.a.p();
                        if (p10 > 0) {
                            j3 = TimeUnit.SECONDS.toMillis(p10);
                        }
                    }
                }
                V = (long) ((this.a.V() / 100.0d) * j3);
            }
            b(V);
        }
    }

    @Override // com.applovin.impl.n9
    public void a(long j3) {
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
    }

    @Override // com.applovin.impl.n9
    public void f() {
        q();
        w1 w1Var = this.M;
        if (w1Var != null) {
            w1Var.a();
            this.M = null;
        }
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        L();
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        L();
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a(F(), false, G(), -2L);
    }

    @Override // com.applovin.impl.n9
    public void z() {
    }

    private long E() {
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float g12 = ((com.applovin.impl.sdk.ad.a) bVar).g1();
        if (g12 <= 0.0f) {
            g12 = (float) this.a.p();
        }
        return (long) ((this.a.E() / 100.0d) * zp.c(g12));
    }

    private int F() {
        w1 w1Var;
        int i10 = 100;
        if (l()) {
            if (!G() && (w1Var = this.M) != null) {
                i10 = (int) Math.min(100.0d, ((this.N - w1Var.b()) / this.N) * 100.0d);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Ad engaged at " + i10 + "%");
            }
        }
        return i10;
    }

    public boolean G() {
        if (this.a.W0()) {
            return this.I;
        }
        if (l()) {
            return this.O.get();
        }
        return true;
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.f6372k, this.f6371j, this.f6370i, viewGroup);
        final int i10 = 0;
        if (!zp.a(oj.f6713n1, this.f6364b)) {
            b(false);
        }
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null) {
            kVar.b();
        }
        this.f6370i.renderAd(this.a);
        a("javascript:al_onPoststitialShow();", this.a.D());
        if (l()) {
            long E = E();
            this.N = E;
            if (E > 0) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f6365c.a("AppLovinFullscreenActivity", a4.j.j(new StringBuilder("Scheduling timer for ad fully watched in "), this.N, "ms..."));
                }
                this.M = w1.a(this.N, this.f6364b, new Runnable(this) { // from class: com.applovin.impl.hu

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o9 f5205c;

                    {
                        this.f5205c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        o9 o9Var = this.f5205c;
                        switch (i11) {
                            case 0:
                                o9Var.H();
                                return;
                            case 1:
                                o9Var.I();
                                return;
                            default:
                                o9Var.J();
                                return;
                        }
                    }
                });
            }
        }
        if (this.f6372k != null) {
            if (this.a.p() >= 0) {
                final int i11 = 1;
                a(this.f6372k, this.a.p(), new Runnable(this) { // from class: com.applovin.impl.hu

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o9 f5205c;

                    {
                        this.f5205c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        o9 o9Var = this.f5205c;
                        switch (i112) {
                            case 0:
                                o9Var.H();
                                return;
                            case 1:
                                o9Var.I();
                                return;
                            default:
                                o9Var.J();
                                return;
                        }
                    }
                });
            } else {
                this.f6372k.setVisibility(0);
            }
        }
        K();
        final int i12 = 2;
        this.f6364b.l0().a(new kn(this.f6364b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.hu

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o9 f5205c;

            {
                this.f5205c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i12;
                o9 o9Var = this.f5205c;
                switch (i112) {
                    case 0:
                        o9Var.H();
                        return;
                    case 1:
                        o9Var.I();
                        return;
                    default:
                        o9Var.J();
                        return;
                }
            }
        }), sm.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        t();
        super.d(zp.e(this.f6364b));
    }
}
