package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
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
public class v9 extends n9 implements g0 {
    private final w9 L;
    private final com.applovin.impl.adview.g M;
    private final ImageView N;
    private final o O;
    private final boolean P;
    private double Q;
    private double R;
    private final AtomicBoolean S;
    private final AtomicBoolean T;
    private boolean U;
    private long V;
    private long W;

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == v9.this.M) {
                v9.this.O();
                return;
            }
            if (view == v9.this.N) {
                v9.this.P();
                return;
            }
            com.applovin.impl.sdk.t tVar = v9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                v9.this.f6365c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new w9(this.a, this.f6366d, this.f6364b);
        boolean G0 = this.a.G0();
        this.P = G0;
        this.S = new AtomicBoolean();
        this.T = new AtomicBoolean();
        this.U = zp.e(this.f6364b);
        this.V = -2L;
        this.W = 0L;
        if (zp.a(oj.f6713n1, kVar)) {
            a(false);
        }
        b bVar2 = new b();
        if (bVar.k0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
            this.M = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.M = null;
        }
        if (a(this.U, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.N = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            e(this.U);
        } else {
            this.N = null;
        }
        if (G0) {
            o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), R.attr.progressBarStyleLarge);
            this.O = oVar;
            oVar.setColor(Color.parseColor("#75FFFFFF"));
            oVar.setBackgroundColor(Color.parseColor("#00000000"));
            oVar.setVisibility(8);
            return;
        }
        this.O = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f6378q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        int i10 = 0;
        if (this.T.compareAndSet(false, true)) {
            a(this.M, this.a.k0(), new xv(this, i10));
        }
    }

    private void M() {
        this.L.a(this.f6373l);
        this.f6378q = SystemClock.elapsedRealtime();
        this.Q = 100.0d;
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void J() {
        long V;
        long millis;
        long j3 = 0;
        if (this.a.U() >= 0 || this.a.V() >= 0) {
            if (this.a.U() >= 0) {
                V = this.a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.a;
                double d10 = this.R;
                if (d10 > 0.0d) {
                    j3 = TimeUnit.SECONDS.toMillis((long) d10);
                }
                if (aVar.T0()) {
                    int g12 = (int) ((com.applovin.impl.sdk.ad.a) this.a).g1();
                    if (g12 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(g12);
                    } else {
                        int p10 = (int) aVar.p();
                        if (p10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(p10);
                        }
                    }
                    j3 += millis;
                }
                V = (long) ((this.a.V() / 100.0d) * j3);
            }
            b(V);
        }
    }

    public boolean L() {
        return l() && !F();
    }

    public void N() {
        int i10 = 1;
        if (this.S.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            com.applovin.impl.adview.g gVar = this.M;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            ImageView imageView = this.N;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            o oVar = this.O;
            if (oVar != null) {
                oVar.b();
            }
            if (this.f6372k != null) {
                if (this.a.p() >= 0) {
                    a(this.f6372k, this.a.p(), new xv(this, i10));
                } else {
                    this.f6372k.setVisibility(0);
                }
            }
            this.f6370i.getController().D();
            t();
        }
    }

    public void O() {
        this.V = SystemClock.elapsedRealtime() - this.W;
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", a4.j.j(new StringBuilder("Attempting to skip video with skip time: "), this.V, "ms"));
        }
        if (L()) {
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        E();
    }

    public void P() {
        this.U = !this.U;
        c("javascript:al_setVideoMuted(" + this.U + ");");
        e(this.U);
        a(this.U, 0L);
    }

    @Override // com.applovin.impl.n9
    public void a(long j3) {
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.g0
    public void d() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.applovin.impl.g0
    public void e() {
        N();
    }

    @Override // com.applovin.impl.n9
    public void f() {
        q();
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        M();
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        M();
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a((int) this.Q, this.P, F(), this.V);
    }

    @Override // com.applovin.impl.n9
    public void z() {
    }

    private void E() {
        this.f6385y++;
        if (this.a.B()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.V = -1L;
        this.W = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
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

    private void e(boolean z10) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6366d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.N.setScaleType(ImageView.ScaleType.FIT_XY);
                this.N.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.N, z10 ? this.a.L() : this.a.e0(), this.f6364b);
    }

    public boolean F() {
        return this.a.W0() ? this.I : this.Q >= ((double) this.a.m0());
    }

    @Override // com.applovin.impl.g0
    public void b(double d10) {
        c("javascript:al_setVideoMuted(" + this.U + ");");
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
        if (this.M != null) {
            K();
        }
        this.f6370i.getController().C();
        this.R = d10;
        J();
        if (this.a.Z0()) {
            this.F.b(this.a, (Runnable) null);
        }
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(oj.f6766u2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(oj.f6773v2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) kVar.a(oj.f6789x2)).booleanValue();
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.N, this.M, this.f6372k, this.O, this.f6371j, this.f6370i, viewGroup);
        this.f6370i.getController().a((g0) this);
        if (!zp.a(oj.f6713n1, this.f6364b)) {
            b(false);
        }
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null) {
            kVar.b();
        }
        this.f6370i.renderAd(this.a);
        if (this.M != null) {
            this.f6364b.l0().a(new kn(this.f6364b, "scheduleSkipButton", new xv(this, 2)), sm.b.TIMEOUT, this.a.l0(), true);
        }
        this.f6364b.l0().a(new kn(this.f6364b, "updateMainViewOM", new xv(this, 3)), sm.b.OTHER, 500L);
        super.d(this.U);
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        E();
    }

    @Override // com.applovin.impl.g0
    public void a(double d10) {
        this.Q = d10;
    }

    @Override // com.applovin.impl.g0
    public void a() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }
}
