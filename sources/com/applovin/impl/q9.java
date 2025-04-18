package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class q9 extends p9 {
    private final r9 K;
    private x1 L;
    private long M;
    private final AtomicBoolean N;

    public q9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new r9(this.f25976a, this.d, this.f25977b);
        this.N = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.N.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.f25989p = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f25984k;
        if (gVar != null) {
            arrayList.add(new og(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f25983j;
            arrayList.add(new og(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f25976a.getAdEventTracker().b(this.f25982i, arrayList);
    }

    private void H() {
        this.K.a(this.f25985l);
        this.f25989p = SystemClock.elapsedRealtime();
        this.N.set(true);
    }

    public void G() {
        long V;
        long j2 = 0;
        if (this.f25976a.U() >= 0 || this.f25976a.V() >= 0) {
            if (this.f25976a.U() >= 0) {
                V = this.f25976a.U();
            } else {
                if (this.f25976a.X0()) {
                    int l12 = (int) ((com.applovin.impl.sdk.ad.a) this.f25976a).l1();
                    if (l12 > 0) {
                        j2 = TimeUnit.SECONDS.toMillis(l12);
                    } else {
                        int o2 = (int) this.f25976a.o();
                        if (o2 > 0) {
                            j2 = TimeUnit.SECONDS.toMillis(o2);
                        }
                    }
                }
                V = (long) ((this.f25976a.V() / 100.0d) * j2);
            }
            b(V);
        }
    }

    @Override // com.applovin.impl.p9
    public void a(long j2) {
    }

    @Override // com.applovin.impl.kb.a
    public void b() {
    }

    @Override // com.applovin.impl.kb.a
    public void c() {
    }

    @Override // com.applovin.impl.p9
    public void f() {
        o();
        x1 x1Var = this.L;
        if (x1Var != null) {
            x1Var.a();
            this.L = null;
        }
        super.f();
    }

    @Override // com.applovin.impl.p9
    public void h() {
        super.h();
        H();
    }

    @Override // com.applovin.impl.p9
    public void i() {
        super.i();
        H();
    }

    @Override // com.applovin.impl.p9
    public void o() {
        super.a(B(), false, C(), -2L);
    }

    @Override // com.applovin.impl.p9
    public void x() {
    }

    @Override // com.applovin.impl.p9
    public void y() {
        a((ViewGroup) null);
    }

    private long A() {
        com.applovin.impl.sdk.ad.b bVar = this.f25976a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float l12 = ((com.applovin.impl.sdk.ad.a) bVar).l1();
        if (l12 <= 0.0f) {
            l12 = (float) this.f25976a.o();
        }
        return (long) ((this.f25976a.D() / 100.0d) * yp.c(l12));
    }

    private int B() {
        x1 x1Var;
        int i2 = 100;
        if (k()) {
            if (!C() && (x1Var = this.L) != null) {
                i2 = (int) Math.min(100.0d, ((this.M - x1Var.b()) / this.M) * 100.0d);
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Ad engaged at " + i2 + "%");
            }
        }
        return i2;
    }

    public boolean C() {
        if (!(this.H && this.f25976a.a1()) && k()) {
            return this.N.get();
        }
        return true;
    }

    @Override // com.applovin.impl.p9
    public void a(ViewGroup viewGroup) {
        this.K.a(this.f25984k, this.f25983j, this.f25982i, viewGroup);
        final int i2 = 0;
        a(false);
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null) {
            kVar.b();
        }
        SpecialsBridge.appLovinAdViewRenderAd(this.f25982i, this.f25976a);
        a("javascript:al_onPoststitialShow();", this.f25976a.C());
        if (k()) {
            long A = A();
            this.M = A;
            if (A > 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(new StringBuilder("Scheduling timer for ad fully watched in "), this.M, "ms..."));
                }
                this.L = x1.a(this.M, this.f25977b, new Runnable(this) { // from class: com.applovin.impl.xu

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ q9 f28005b;

                    {
                        this.f28005b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        q9 q9Var = this.f28005b;
                        switch (i3) {
                            case 0:
                                q9Var.D();
                                return;
                            case 1:
                                q9Var.E();
                                return;
                            default:
                                q9Var.F();
                                return;
                        }
                    }
                });
            }
        }
        if (this.f25984k != null) {
            if (this.f25976a.o() >= 0) {
                final int i3 = 1;
                a(this.f25984k, this.f25976a.o(), new Runnable(this) { // from class: com.applovin.impl.xu

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ q9 f28005b;

                    {
                        this.f28005b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        q9 q9Var = this.f28005b;
                        switch (i32) {
                            case 0:
                                q9Var.D();
                                return;
                            case 1:
                                q9Var.E();
                                return;
                            default:
                                q9Var.F();
                                return;
                        }
                    }
                });
            } else {
                this.f25984k.setVisibility(0);
            }
        }
        G();
        final int i4 = 2;
        this.f25977b.j0().a(new jn(this.f25977b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.xu

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q9 f28005b;

            {
                this.f28005b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                q9 q9Var = this.f28005b;
                switch (i32) {
                    case 0:
                        q9Var.D();
                        return;
                    case 1:
                        q9Var.E();
                        return;
                    default:
                        q9Var.F();
                        return;
                }
            }
        }), tm.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        r();
        super.c(yp.e(this.f25977b));
    }
}
