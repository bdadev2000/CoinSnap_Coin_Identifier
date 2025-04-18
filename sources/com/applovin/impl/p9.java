package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.kb;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class p9 implements kb.a, AppLovinBroadcastManager.Receiver, a.b {
    protected boolean A;
    protected AppLovinAdClickListener B;
    protected AppLovinAdDisplayListener C;
    protected AppLovinAdVideoPlaybackListener D;
    protected final kb E;
    protected go F;
    protected go G;
    protected boolean H;
    private final j2 I;

    /* renamed from: a */
    protected final com.applovin.impl.sdk.ad.b f25976a;

    /* renamed from: b */
    protected final com.applovin.impl.sdk.j f25977b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.n f25978c;
    protected Activity d;

    /* renamed from: g */
    private final p f25980g;

    /* renamed from: h */
    private final f.a f25981h;

    /* renamed from: i */
    protected AppLovinAdView f25982i;

    /* renamed from: j */
    protected com.applovin.impl.adview.k f25983j;

    /* renamed from: k */
    protected final com.applovin.impl.adview.g f25984k;

    /* renamed from: l */
    protected final com.applovin.impl.adview.g f25985l;

    /* renamed from: q */
    protected long f25990q;

    /* renamed from: r */
    private boolean f25991r;

    /* renamed from: s */
    protected boolean f25992s;

    /* renamed from: t */
    protected int f25993t;

    /* renamed from: u */
    protected boolean f25994u;

    /* renamed from: f */
    private final Handler f25979f = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    protected final long f25986m = SystemClock.elapsedRealtime();

    /* renamed from: n */
    private final AtomicBoolean f25987n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f25988o = new AtomicBoolean();

    /* renamed from: p */
    protected long f25989p = -1;

    /* renamed from: v */
    private int f25995v = 0;
    private final ArrayList w = new ArrayList();
    protected int x = 0;

    /* renamed from: y */
    protected int f25996y = 0;

    /* renamed from: z */
    protected int f25997z = com.applovin.impl.sdk.f.f26614i;
    private boolean J = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                p9.this.f25978c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                p9.this.f25978c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            p9.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements f.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.f.a
        public void a(int i2) {
            p9 p9Var = p9.this;
            if (p9Var.f25997z != com.applovin.impl.sdk.f.f26614i) {
                p9Var.A = true;
            }
            com.applovin.impl.adview.b g2 = p9Var.f25982i.getController().g();
            if (g2 == null) {
                com.applovin.impl.sdk.n nVar = p9.this.f25978c;
                if (com.applovin.impl.sdk.n.a()) {
                    p9.this.f25978c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.f.a(i2) && !com.applovin.impl.sdk.f.a(p9.this.f25997z)) {
                g2.a("javascript:al_muteSwitchOn();");
            } else if (i2 == 2) {
                g2.a("javascript:al_muteSwitchOff();");
            }
            p9.this.f25997z = i2;
        }
    }

    /* loaded from: classes.dex */
    public class c extends p {
        public c() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!activity.getClass().getName().equals(yp.l(activity.getApplicationContext())) || p9.this.f25988o.get()) {
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
            try {
                p9.this.f();
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                try {
                    p9.this.n();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(p9 p9Var);

        void a(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                p9.this.f25978c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            gc.a(p9.this.B, appLovinAd);
            p9.this.f25996y++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p9 p9Var = p9.this;
            if (view != p9Var.f25984k || !((Boolean) p9Var.f25977b.a(sj.s2)).booleanValue()) {
                com.applovin.impl.sdk.n nVar = p9.this.f25978c;
                if (com.applovin.impl.sdk.n.a()) {
                    p9.this.f25978c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            p9.c(p9.this);
            if (p9.this.f25976a.U0()) {
                p9.this.c("javascript:al_onCloseButtonTapped(" + p9.this.f25995v + "," + p9.this.x + "," + p9.this.f25996y + ");");
            }
            List K = p9.this.f25976a.K();
            com.applovin.impl.sdk.n nVar2 = p9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                p9.this.f25978c.a("AppLovinFullscreenActivity", "Handling close button tap " + p9.this.f25995v + " with multi close delay: " + K);
            }
            if (K == null || K.size() <= p9.this.f25995v) {
                p9.this.f();
                return;
            }
            p9.this.w.add(Long.valueOf(SystemClock.elapsedRealtime() - p9.this.f25989p));
            List I = p9.this.f25976a.I();
            if (I != null && I.size() > p9.this.f25995v) {
                p9 p9Var2 = p9.this;
                p9Var2.f25984k.a((e.a) I.get(p9Var2.f25995v));
            }
            com.applovin.impl.sdk.n nVar3 = p9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                p9.this.f25978c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + K.get(p9.this.f25995v));
            }
            p9.this.f25984k.setVisibility(8);
            p9 p9Var3 = p9.this;
            p9Var3.a(p9Var3.f25984k, ((Integer) K.get(p9Var3.f25995v)).intValue(), new mt(this, 2));
        }

        public /* synthetic */ e(p9 p9Var, a aVar) {
            this();
        }

        public /* synthetic */ void a() {
            p9.this.f25989p = SystemClock.elapsedRealtime();
        }
    }

    public p9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f25976a = bVar;
        this.f25977b = jVar;
        this.f25978c = jVar.J();
        this.d = activity;
        this.B = appLovinAdClickListener;
        this.C = appLovinAdDisplayListener;
        this.D = appLovinAdVideoPlaybackListener;
        kb kbVar = new kb(activity, jVar);
        this.E = kbVar;
        kbVar.a(this);
        this.I = new j2(jVar);
        e eVar = new e(this, null);
        if (((Boolean) jVar.a(sj.O2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) jVar.a(sj.U2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        n9 n9Var = new n9(jVar.s0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f25982i = n9Var;
        n9Var.setAdClickListener(eVar);
        this.f25982i.setAdDisplayListener(new a());
        bVar.d().putString("ad_view_address", zq.a(this.f25982i));
        this.f25982i.getController().a(this);
        ea eaVar = new ea(map, jVar);
        if (eaVar.c()) {
            this.f25983j = new com.applovin.impl.adview.k(eaVar, activity);
        }
        jVar.i().trackImpression(bVar);
        List K = bVar.K();
        if (bVar.o() >= 0 || K != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.m(), activity);
            this.f25984k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.f25984k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f25985l = gVar2;
        gVar2.setOnClickListener(new ou(this, 0));
        if (bVar.W0()) {
            this.f25981h = new b();
        } else {
            this.f25981h = null;
        }
        this.f25980g = new c();
    }

    public static /* synthetic */ int c(p9 p9Var) {
        int i2 = p9Var.f25995v;
        p9Var.f25995v = i2 + 1;
        return i2;
    }

    public /* synthetic */ void m() {
        if (this.f25976a.F0().getAndSet(true)) {
            return;
        }
        this.f25977b.j0().a((yl) new en(this.f25976a, this.f25977b), tm.b.OTHER);
    }

    private void z() {
        if (this.f25981h != null) {
            this.f25977b.n().a(this.f25981h);
        }
        if (this.f25980g != null) {
            this.f25977b.e().a(this.f25980g);
        }
    }

    public abstract void a(long j2);

    public abstract void a(ViewGroup viewGroup);

    public boolean l() {
        return this.d instanceof AppLovinFullscreenActivity;
    }

    public void n() {
        if (this.f25988o.compareAndSet(false, true)) {
            gc.b(this.C, this.f25976a);
            this.f25977b.C().b(this.f25976a);
            this.f25977b.E().a(la.f25014l, this.f25976a);
        }
    }

    public abstract void o();

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f25992s) {
            i();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            h();
        }
    }

    public void p() {
        go goVar = this.F;
        if (goVar != null) {
            goVar.d();
        }
    }

    public void q() {
        go goVar = this.F;
        if (goVar != null) {
            goVar.e();
        }
    }

    public void r() {
        com.applovin.impl.adview.b g2;
        if (this.f25982i == null || !this.f25976a.y0() || (g2 = this.f25982i.getController().g()) == null) {
            return;
        }
        this.I.a(g2, new is(this, 11));
    }

    public void s() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.J) {
            f();
        }
        if (this.f25976a.U0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void t() {
        AppLovinAdView appLovinAdView = this.f25982i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f25982i.destroy();
            this.f25982i = null;
            if ((parent instanceof ViewGroup) && l()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        o();
        n();
        this.B = null;
        this.C = null;
        this.D = null;
        this.d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void u() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.E.b()) {
            this.E.a();
        }
        p();
    }

    public void v() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        q();
        if (this.E.b()) {
            this.E.a();
        }
    }

    public void w() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void x();

    public abstract void y();

    public /* synthetic */ void b(View view) {
        f();
    }

    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new nu(gVar, runnable, 1));
    }

    public void a(boolean z2) {
        List a2 = yp.a(z2, this.f25976a, this.f25977b, this.d);
        if (a2.isEmpty()) {
            return;
        }
        if (((Boolean) this.f25977b.a(sj.U5)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a2);
            }
            tb.a(this.f25976a, this.C, "Missing ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a2);
        }
        this.f25976a.L0();
    }

    public void f() {
        this.f25991r = true;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f25976a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f25979f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f25976a != null ? r0.B() : 0L);
        n();
        this.I.b();
        if (this.f25981h != null) {
            this.f25977b.n().b(this.f25981h);
        }
        if (this.f25980g != null) {
            this.f25977b.e().b(this.f25980g);
        }
        if (l()) {
            this.d.finish();
            return;
        }
        this.f25977b.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25977b.J().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        t();
    }

    public int g() {
        int q2 = this.f25976a.q();
        return (q2 <= 0 && ((Boolean) this.f25977b.a(sj.L2)).booleanValue()) ? this.f25993t + 1 : q2;
    }

    public void h() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f25992s = true;
    }

    public boolean j() {
        return this.f25991r;
    }

    public boolean k() {
        return AppLovinAdType.INCENTIVIZED == this.f25976a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f25976a.getType();
    }

    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        zq.a(gVar, 400L, new nu(gVar, runnable, 2));
    }

    public void c(String str) {
        a(str, 0L);
    }

    public void b(String str) {
        if (this.f25976a.C0()) {
            a(str, 0L);
        }
    }

    public void c(boolean z2) {
        a(z2, ((Long) this.f25977b.a(sj.M2)).longValue());
        gc.a(this.C, this.f25976a);
        this.f25977b.C().a(this.f25976a);
        if (this.f25976a.hasVideoUrl() || k()) {
            gc.a(this.D, this.f25976a);
        }
        new yg(this.d).a(this.f25976a);
        this.f25976a.setHasShown(true);
    }

    public void b(boolean z2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z2);
        }
        b("javascript:al_onWindowFocusChanged( " + z2 + " );");
        go goVar = this.G;
        if (goVar != null) {
            if (z2) {
                goVar.e();
            } else {
                goVar.d();
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.j jVar, Activity activity, d dVar) {
        p9 q9Var;
        boolean g12 = bVar.g1();
        if (bVar instanceof aq) {
            if (g12) {
                try {
                    q9Var = new s9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    jVar.E().a("AppLovinFullscreenActivity", "createVastVideoAdExoPlayerPresenter", th, ma.a(bVar));
                    try {
                        q9Var = new t9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + jVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    q9Var = new t9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + jVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (bVar.hasVideoUrl()) {
            if (bVar.K0()) {
                try {
                    q9Var = new x9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    dVar.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + jVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (g12) {
                try {
                    q9Var = new u9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    jVar.E().a("AppLovinFullscreenActivity", "createVideoAdExoPlayerPresenter", th5, ma.a(bVar));
                    try {
                        q9Var = new v9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th6) {
                        dVar.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + jVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    q9Var = new v9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + jVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                q9Var = new q9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + jVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        q9Var.z();
        dVar.a(q9Var);
    }

    public void b(long j2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j2) + " seconds...");
        }
        this.F = go.a(j2, this.f25977b, new mt(this, 12));
    }

    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b g2;
        AppLovinAdView appLovinAdView = this.f25982i;
        if (appLovinAdView == null || (g2 = appLovinAdView.getController().g()) == null) {
            return;
        }
        g2.a(str);
    }

    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(String str, long j2) {
        if (j2 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new ms(20, this, str), j2);
    }

    public void a(int i2, boolean z2, boolean z3, long j2) {
        if (this.f25987n.compareAndSet(false, true)) {
            if (this.f25976a.hasVideoUrl() || k()) {
                gc.a(this.D, this.f25976a, i2, z3);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25986m;
            this.f25977b.i().trackVideoEnd(this.f25976a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i2, z2);
            long elapsedRealtime2 = this.f25989p != -1 ? SystemClock.elapsedRealtime() - this.f25989p : -1L;
            this.f25977b.i().trackFullScreenAdClosed(this.f25976a, elapsedRealtime2, this.w, j2, this.A, this.f25997z);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f25978c;
                StringBuilder sb = new StringBuilder("Video ad ended at percent: ");
                sb.append(i2);
                sb.append("%, elapsedTime: ");
                sb.append(elapsedRealtime);
                sb.append("ms, skipTimeMillis: ");
                sb.append(j2);
                sb.append("ms, closeTimeMillis: ");
                nVar.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(sb, elapsedRealtime2, "ms"));
            }
        }
    }

    public void a(boolean z2, long j2) {
        if (this.f25976a.M0()) {
            a(z2 ? "javascript:al_mute();" : "javascript:al_unmute();", j2);
        }
    }

    public void a(int i2, KeyEvent keyEvent) {
        if (this.f25978c == null || !com.applovin.impl.sdk.n.a()) {
            return;
        }
        this.f25978c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i2 + ", " + keyEvent);
    }

    public void a(Runnable runnable, long j2) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j2, this.f25979f);
    }

    public void a(com.applovin.impl.adview.g gVar, long j2, Runnable runnable) {
        if (j2 >= ((Long) this.f25977b.a(sj.r2)).longValue()) {
            return;
        }
        nu nuVar = new nu(gVar, runnable, 0);
        if (((Boolean) this.f25977b.a(sj.V2)).booleanValue()) {
            this.G = go.a(TimeUnit.SECONDS.toMillis(j2), this.f25977b, nuVar);
        } else {
            this.f25977b.j0().a(new jn(this.f25977b, "fadeInCloseButton", nuVar), tm.b.OTHER, TimeUnit.SECONDS.toMillis(j2), true);
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.H = true;
    }

    public /* synthetic */ void a(View view) {
        com.applovin.impl.adview.g gVar;
        if (yp.a(sj.f26928j1, this.f25977b)) {
            this.f25977b.B().c(this.f25976a, com.applovin.impl.sdk.j.l());
        }
        this.f25977b.E().a(la.F, ma.a(this.f25976a));
        if (((Boolean) this.f25977b.a(sj.j6)).booleanValue()) {
            f();
            return;
        }
        this.J = ((Boolean) this.f25977b.a(sj.k6)).booleanValue();
        if (!((Boolean) this.f25977b.a(sj.l6)).booleanValue() || (gVar = this.f25984k) == null) {
            return;
        }
        gVar.setVisibility(0);
    }
}
