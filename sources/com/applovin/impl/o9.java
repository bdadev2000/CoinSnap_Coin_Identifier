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

    /* renamed from: L, reason: collision with root package name */
    private final p9 f9388L;

    /* renamed from: M, reason: collision with root package name */
    private C0771w1 f9389M;

    /* renamed from: N, reason: collision with root package name */
    private long f9390N;
    private final AtomicBoolean O;

    public o9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f9388L = new p9(this.f9297a, this.f9299d, this.b);
        this.O = new AtomicBoolean();
        if (zp.a(oj.f9810n1, kVar)) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.O.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f9309q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f9305k;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9304j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f9297a.getAdEventTracker().b(this.f9303i, arrayList);
    }

    private void L() {
        this.f9388L.a(this.l);
        this.f9309q = SystemClock.elapsedRealtime();
        this.O.set(true);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void K() {
        long V8;
        long j7 = 0;
        if (this.f9297a.U() >= 0 || this.f9297a.V() >= 0) {
            if (this.f9297a.U() >= 0) {
                V8 = this.f9297a.U();
            } else {
                if (this.f9297a.T0()) {
                    int g12 = (int) ((com.applovin.impl.sdk.ad.a) this.f9297a).g1();
                    if (g12 > 0) {
                        j7 = TimeUnit.SECONDS.toMillis(g12);
                    } else {
                        int p2 = (int) this.f9297a.p();
                        if (p2 > 0) {
                            j7 = TimeUnit.SECONDS.toMillis(p2);
                        }
                    }
                }
                V8 = (long) ((this.f9297a.V() / 100.0d) * j7);
            }
            b(V8);
        }
    }

    @Override // com.applovin.impl.n9
    public void a(long j7) {
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
        C0771w1 c0771w1 = this.f9389M;
        if (c0771w1 != null) {
            c0771w1.a();
            this.f9389M = null;
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
        com.applovin.impl.sdk.ad.b bVar = this.f9297a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float g12 = ((com.applovin.impl.sdk.ad.a) bVar).g1();
        if (g12 <= 0.0f) {
            g12 = (float) this.f9297a.p();
        }
        return (long) ((this.f9297a.E() / 100.0d) * zp.c(g12));
    }

    private int F() {
        C0771w1 c0771w1;
        int i9 = 100;
        if (l()) {
            if (!G() && (c0771w1 = this.f9389M) != null) {
                i9 = (int) Math.min(100.0d, ((this.f9390N - c0771w1.b()) / this.f9390N) * 100.0d);
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Ad engaged at " + i9 + "%");
            }
        }
        return i9;
    }

    public boolean G() {
        if (this.f9297a.W0()) {
            return this.f9294I;
        }
        if (l()) {
            return this.O.get();
        }
        return true;
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.f9388L.a(this.f9305k, this.f9304j, this.f9303i, viewGroup);
        if (!zp.a(oj.f9810n1, this.b)) {
            b(false);
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null) {
            kVar.b();
        }
        this.f9303i.renderAd(this.f9297a);
        a("javascript:al_onPoststitialShow();", this.f9297a.D());
        if (l()) {
            long E8 = E();
            this.f9390N = E8;
            if (E8 > 0) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9298c.a("AppLovinFullscreenActivity", Q7.n0.k(new StringBuilder("Scheduling timer for ad fully watched in "), this.f9390N, "ms..."));
                }
                final int i9 = 0;
                this.f9389M = C0771w1.a(this.f9390N, this.b, new Runnable(this) { // from class: com.applovin.impl.Z0

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o9 f6534c;

                    {
                        this.f6534c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f6534c.H();
                                return;
                            case 1:
                                this.f6534c.I();
                                return;
                            default:
                                this.f6534c.J();
                                return;
                        }
                    }
                });
            }
        }
        if (this.f9305k != null) {
            if (this.f9297a.p() >= 0) {
                final int i10 = 1;
                a(this.f9305k, this.f9297a.p(), new Runnable(this) { // from class: com.applovin.impl.Z0

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ o9 f6534c;

                    {
                        this.f6534c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f6534c.H();
                                return;
                            case 1:
                                this.f6534c.I();
                                return;
                            default:
                                this.f6534c.J();
                                return;
                        }
                    }
                });
            } else {
                this.f9305k.setVisibility(0);
            }
        }
        K();
        final int i11 = 2;
        this.b.l0().a(new kn(this.b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.Z0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o9 f6534c;

            {
                this.f6534c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f6534c.H();
                        return;
                    case 1:
                        this.f6534c.I();
                        return;
                    default:
                        this.f6534c.J();
                        return;
                }
            }
        }), sm.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        t();
        super.d(zp.e(this.b));
    }
}
