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
public class v9 extends n9 implements InterfaceC0698g0 {

    /* renamed from: L */
    private final w9 f11701L;

    /* renamed from: M */
    private final com.applovin.impl.adview.g f11702M;

    /* renamed from: N */
    private final ImageView f11703N;
    private final C0730o O;

    /* renamed from: P */
    private final boolean f11704P;

    /* renamed from: Q */
    private double f11705Q;

    /* renamed from: R */
    private double f11706R;

    /* renamed from: S */
    private final AtomicBoolean f11707S;

    /* renamed from: T */
    private final AtomicBoolean f11708T;

    /* renamed from: U */
    private boolean f11709U;

    /* renamed from: V */
    private long f11710V;

    /* renamed from: W */
    private long f11711W;

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == v9.this.f11702M) {
                v9.this.O();
                return;
            }
            if (view == v9.this.f11703N) {
                v9.this.P();
                return;
            }
            com.applovin.impl.sdk.t tVar = v9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                v9.this.f9298c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ b(v9 v9Var, a aVar) {
            this();
        }
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f11701L = new w9(this.f9297a, this.f9299d, this.b);
        boolean G02 = this.f9297a.G0();
        this.f11704P = G02;
        this.f11707S = new AtomicBoolean();
        this.f11708T = new AtomicBoolean();
        this.f11709U = zp.e(this.b);
        this.f11710V = -2L;
        this.f11711W = 0L;
        if (zp.a(oj.f9810n1, kVar)) {
            a(false);
        }
        b bVar2 = new b();
        if (bVar.k0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
            this.f11702M = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.f11702M = null;
        }
        if (a(this.f11709U, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.f11703N = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            e(this.f11709U);
        } else {
            this.f11703N = null;
        }
        if (G02) {
            C0730o c0730o = new C0730o(activity, ((Integer) kVar.a(oj.f9588F2)).intValue(), R.attr.progressBarStyleLarge);
            this.O = c0730o;
            c0730o.setColor(Color.parseColor("#75FFFFFF"));
            c0730o.setBackgroundColor(Color.parseColor("#00000000"));
            c0730o.setVisibility(8);
            return;
        }
        this.O = null;
    }

    public /* synthetic */ void I() {
        this.f9309q = SystemClock.elapsedRealtime();
    }

    public void K() {
        if (this.f11708T.compareAndSet(false, true)) {
            a(this.f11702M, this.f9297a.k0(), new N2(this, 1));
        }
    }

    private void M() {
        this.f11701L.a(this.l);
        this.f9309q = SystemClock.elapsedRealtime();
        this.f11705Q = 100.0d;
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void J() {
        long V8;
        long millis;
        long j7 = 0;
        if (this.f9297a.U() >= 0 || this.f9297a.V() >= 0) {
            if (this.f9297a.U() >= 0) {
                V8 = this.f9297a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9297a;
                double d2 = this.f11706R;
                if (d2 > 0.0d) {
                    j7 = TimeUnit.SECONDS.toMillis((long) d2);
                }
                if (aVar.T0()) {
                    int g12 = (int) ((com.applovin.impl.sdk.ad.a) this.f9297a).g1();
                    if (g12 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(g12);
                    } else {
                        int p2 = (int) aVar.p();
                        if (p2 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(p2);
                        }
                    }
                    j7 += millis;
                }
                V8 = (long) ((this.f9297a.V() / 100.0d) * j7);
            }
            b(V8);
        }
    }

    public boolean L() {
        if (l() && !F()) {
            return true;
        }
        return false;
    }

    public void N() {
        if (this.f11707S.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            com.applovin.impl.adview.g gVar = this.f11702M;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            ImageView imageView = this.f11703N;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C0730o c0730o = this.O;
            if (c0730o != null) {
                c0730o.b();
            }
            if (this.f9305k != null) {
                if (this.f9297a.p() >= 0) {
                    a(this.f9305k, this.f9297a.p(), new N2(this, 0));
                } else {
                    this.f9305k.setVisibility(0);
                }
            }
            this.f9303i.getController().D();
            t();
        }
    }

    public void O() {
        this.f11710V = SystemClock.elapsedRealtime() - this.f11711W;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", Q7.n0.k(new StringBuilder("Attempting to skip video with skip time: "), this.f11710V, "ms"));
        }
        if (L()) {
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.f9291F.e();
            return;
        }
        E();
    }

    public void P() {
        this.f11709U = !this.f11709U;
        c("javascript:al_setVideoMuted(" + this.f11709U + ");");
        e(this.f11709U);
        a(this.f11709U, 0L);
    }

    @Override // com.applovin.impl.n9
    public void a(long j7) {
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.InterfaceC0698g0
    public void d() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.b();
        }
    }

    @Override // com.applovin.impl.InterfaceC0698g0
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
        super.a((int) this.f11705Q, this.f11704P, F(), this.f11710V);
    }

    @Override // com.applovin.impl.n9
    public void z() {
    }

    private void E() {
        this.f9317y++;
        if (this.f9297a.B()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
        } else {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            N();
        }
    }

    public /* synthetic */ void G() {
        this.f11710V = -1L;
        this.f11711W = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void H() {
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

    private void e(boolean z8) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9299d.getDrawable(z8 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f11703N.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f11703N.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f11703N, z8 ? this.f9297a.L() : this.f9297a.e0(), this.b);
    }

    public boolean F() {
        return this.f9297a.W0() ? this.f9294I : this.f11705Q >= ((double) this.f9297a.m0());
    }

    @Override // com.applovin.impl.InterfaceC0698g0
    public void b(double d2) {
        c("javascript:al_setVideoMuted(" + this.f11709U + ");");
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.b();
        }
        if (this.f11702M != null) {
            K();
        }
        this.f9303i.getController().C();
        this.f11706R = d2;
        J();
        if (this.f9297a.Z0()) {
            this.f9291F.b(this.f9297a, (Runnable) null);
        }
    }

    private static boolean a(boolean z8, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(oj.f9861u2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(oj.f9869v2)).booleanValue() || z8) {
            return true;
        }
        return ((Boolean) kVar.a(oj.f9882x2)).booleanValue();
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.f11701L.a(this.f11703N, this.f11702M, this.f9305k, this.O, this.f9304j, this.f9303i, viewGroup);
        this.f9303i.getController().a((InterfaceC0698g0) this);
        if (!zp.a(oj.f9810n1, this.b)) {
            b(false);
        }
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.a();
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null) {
            kVar.b();
        }
        this.f9303i.renderAd(this.f9297a);
        if (this.f11702M != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new N2(this, 2)), sm.b.TIMEOUT, this.f9297a.l0(), true);
        }
        this.b.l0().a(new kn(this.b, "updateMainViewOM", new N2(this, 3)), sm.b.OTHER, 500L);
        super.d(this.f11709U);
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        E();
    }

    @Override // com.applovin.impl.InterfaceC0698g0
    public void a(double d2) {
        this.f11705Q = d2;
    }

    @Override // com.applovin.impl.InterfaceC0698g0
    public void a() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.a();
        }
    }
}
