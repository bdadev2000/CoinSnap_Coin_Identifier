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
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class x9 extends p9 implements g0 {
    private final y9 K;
    private final com.applovin.impl.adview.g L;
    private final ImageView M;
    private final o N;
    private final boolean O;
    private double P;
    private double Q;
    private final AtomicBoolean R;
    private final AtomicBoolean S;
    private boolean T;
    private long U;
    private long V;

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == x9.this.L) {
                x9.this.K();
                return;
            }
            if (view == x9.this.M) {
                x9.this.L();
                return;
            }
            com.applovin.impl.sdk.n nVar = x9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                x9.this.f25978c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ b(x9 x9Var, a aVar) {
            this();
        }
    }

    public x9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new y9(this.f25976a, this.d, this.f25977b);
        boolean I0 = this.f25976a.I0();
        this.O = I0;
        this.R = new AtomicBoolean();
        this.S = new AtomicBoolean();
        this.T = yp.e(this.f25977b);
        this.U = -2L;
        this.V = 0L;
        b bVar2 = new b();
        if (bVar.l0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.c0(), activity);
            this.L = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.L = null;
        }
        if (a(this.T, jVar)) {
            ImageView imageView = new ImageView(activity);
            this.M = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            d(this.T);
        } else {
            this.M = null;
        }
        if (!I0) {
            this.N = null;
            return;
        }
        o oVar = new o(activity, ((Integer) jVar.a(sj.K2)).intValue(), R.attr.progressBarStyleLarge);
        this.N = oVar;
        oVar.setColor(Color.parseColor("#75FFFFFF"));
        oVar.setBackgroundColor(Color.parseColor("#00000000"));
        oVar.setVisibility(8);
    }

    public /* synthetic */ void E() {
        this.f25989p = SystemClock.elapsedRealtime();
    }

    public void G() {
        if (this.S.compareAndSet(false, true)) {
            a(this.L, this.f25976a.l0(), new ow(this, 0));
        }
    }

    private void I() {
        this.K.a(this.f25985l);
        this.f25989p = SystemClock.elapsedRealtime();
        this.P = 100.0d;
    }

    public void F() {
        long V;
        long millis;
        if (this.f25976a.U() >= 0 || this.f25976a.V() >= 0) {
            if (this.f25976a.U() >= 0) {
                V = this.f25976a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f25976a;
                double d = this.Q;
                long millis2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? TimeUnit.SECONDS.toMillis((long) d) : 0L;
                if (aVar.X0()) {
                    int l12 = (int) ((com.applovin.impl.sdk.ad.a) this.f25976a).l1();
                    if (l12 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l12);
                    } else {
                        int o2 = (int) aVar.o();
                        if (o2 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(o2);
                        }
                    }
                    millis2 += millis;
                }
                V = (long) ((this.f25976a.V() / 100.0d) * millis2);
            }
            b(V);
        }
    }

    public boolean H() {
        return k() && !B();
    }

    public void J() {
        if (this.R.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            com.applovin.impl.adview.g gVar = this.L;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            ImageView imageView = this.M;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            o oVar = this.N;
            if (oVar != null) {
                oVar.b();
            }
            if (this.f25984k != null) {
                if (this.f25976a.o() >= 0) {
                    a(this.f25984k, this.f25976a.o(), new ow(this, 3));
                } else {
                    this.f25984k.setVisibility(0);
                }
            }
            this.f25982i.getController().E();
            r();
        }
    }

    public void K() {
        this.U = SystemClock.elapsedRealtime() - this.V;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(new StringBuilder("Attempting to skip video with skip time: "), this.U, "ms"));
        }
        if (!H()) {
            A();
            return;
        }
        p();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
        }
        this.E.e();
    }

    public void L() {
        this.T = !this.T;
        c("javascript:al_setVideoMuted(" + this.T + ");");
        d(this.T);
        a(this.T, 0L);
    }

    @Override // com.applovin.impl.g0
    public void a(double d) {
        this.P = d;
    }

    @Override // com.applovin.impl.kb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.g0
    public void d() {
        o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.applovin.impl.g0
    public void e() {
        J();
    }

    @Override // com.applovin.impl.p9
    public void f() {
        o();
        super.f();
    }

    @Override // com.applovin.impl.p9
    public void h() {
        super.h();
        I();
    }

    @Override // com.applovin.impl.p9
    public void i() {
        super.i();
        I();
    }

    @Override // com.applovin.impl.p9
    public void o() {
        super.a((int) this.P, this.O, B(), this.U);
    }

    @Override // com.applovin.impl.p9
    public void x() {
    }

    @Override // com.applovin.impl.p9
    public void y() {
        a((ViewGroup) null);
    }

    private void A() {
        this.x++;
        if (this.f25976a.A()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            J();
        }
    }

    public /* synthetic */ void C() {
        this.U = -1L;
        this.V = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void D() {
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

    private void d(boolean z2) {
        if (z3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z2 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.M.setScaleType(ImageView.ScaleType.FIT_XY);
                this.M.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.M, z2 ? this.f25976a.L() : this.f25976a.f0(), this.f25977b);
    }

    public boolean B() {
        return (this.H && this.f25976a.a1()) || this.P >= ((double) this.f25976a.n0());
    }

    @Override // com.applovin.impl.p9
    public void a(long j2) {
    }

    @Override // com.applovin.impl.g0
    public void b(double d) {
        c("javascript:al_setVideoMuted(" + this.T + ");");
        o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
        if (this.L != null) {
            G();
        }
        this.f25982i.getController().D();
        this.Q = d;
        F();
        if (this.f25976a.d1()) {
            this.E.b(this.f25976a, (Runnable) null);
        }
    }

    private static boolean a(boolean z2, com.applovin.impl.sdk.j jVar) {
        if (!((Boolean) jVar.a(sj.z2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) jVar.a(sj.A2)).booleanValue() || z2) {
            return true;
        }
        return ((Boolean) jVar.a(sj.C2)).booleanValue();
    }

    @Override // com.applovin.impl.p9
    public void a(ViewGroup viewGroup) {
        this.K.a(this.M, this.L, this.f25984k, this.N, this.f25983j, this.f25982i, viewGroup);
        this.f25982i.getController().a((g0) this);
        a(false);
        o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null) {
            kVar.b();
        }
        SpecialsBridge.appLovinAdViewRenderAd(this.f25982i, this.f25976a);
        if (this.L != null) {
            this.f25977b.j0().a(new jn(this.f25977b, "scheduleSkipButton", new ow(this, 1)), tm.b.TIMEOUT, this.f25976a.m0(), true);
        }
        this.f25977b.j0().a(new jn(this.f25977b, "updateMainViewOM", new ow(this, 2)), tm.b.OTHER, 500L);
        super.c(this.T);
    }

    @Override // com.applovin.impl.kb.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        A();
    }

    @Override // com.applovin.impl.g0
    public void a() {
        o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }
}
