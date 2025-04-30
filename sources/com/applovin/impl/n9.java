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
import com.applovin.impl.gb;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C0754f;
import com.applovin.impl.sdk.C0755g;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class n9 implements gb.a, AppLovinBroadcastManager.Receiver, zp.b, a.b {

    /* renamed from: B */
    protected boolean f9287B;

    /* renamed from: C */
    protected AppLovinAdClickListener f9288C;

    /* renamed from: D */
    protected AppLovinAdDisplayListener f9289D;

    /* renamed from: E */
    protected AppLovinAdVideoPlaybackListener f9290E;

    /* renamed from: F */
    protected final gb f9291F;

    /* renamed from: G */
    protected ho f9292G;

    /* renamed from: H */
    protected ho f9293H;

    /* renamed from: I */
    protected boolean f9294I;

    /* renamed from: J */
    private final C0755g f9295J;

    /* renamed from: a */
    protected final com.applovin.impl.sdk.ad.b f9297a;
    protected final com.applovin.impl.sdk.k b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.t f9298c;

    /* renamed from: d */
    protected Activity f9299d;

    /* renamed from: g */
    private final AbstractC0734p f9301g;

    /* renamed from: h */
    private final C0754f.a f9302h;

    /* renamed from: i */
    protected AppLovinAdView f9303i;

    /* renamed from: j */
    protected com.applovin.impl.adview.k f9304j;

    /* renamed from: k */
    protected final com.applovin.impl.adview.g f9305k;
    protected final com.applovin.impl.adview.g l;

    /* renamed from: r */
    protected long f9310r;

    /* renamed from: s */
    private boolean f9311s;

    /* renamed from: t */
    protected boolean f9312t;

    /* renamed from: u */
    protected int f9313u;

    /* renamed from: v */
    protected boolean f9314v;

    /* renamed from: f */
    private final Handler f9300f = new Handler(Looper.getMainLooper());
    protected final long m = SystemClock.elapsedRealtime();

    /* renamed from: n */
    private final AtomicBoolean f9306n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f9307o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f9308p = new AtomicBoolean();

    /* renamed from: q */
    protected long f9309q = -1;

    /* renamed from: w */
    private int f9315w = 0;

    /* renamed from: x */
    private final ArrayList f9316x = new ArrayList();

    /* renamed from: y */
    protected int f9317y = 0;

    /* renamed from: z */
    protected int f9318z = 0;

    /* renamed from: A */
    protected int f9286A = C0754f.f10796i;

    /* renamed from: K */
    private boolean f9296K = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f9298c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f9298c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            n9.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements C0754f.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.C0754f.a
        public void a(int i9) {
            n9 n9Var = n9.this;
            if (n9Var.f9286A != C0754f.f10796i) {
                n9Var.f9287B = true;
            }
            com.applovin.impl.adview.b g9 = n9Var.f9303i.getController().g();
            if (g9 == null) {
                com.applovin.impl.sdk.t tVar = n9.this.f9298c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.f9298c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (C0754f.a(i9) && !C0754f.a(n9.this.f9286A)) {
                g9.a("javascript:al_muteSwitchOn();");
            } else if (i9 == 2) {
                g9.a("javascript:al_muteSwitchOff();");
            }
            n9.this.f9286A = i9;
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractC0734p {
        public c() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass().getName().equals(zp.l(activity.getApplicationContext()))) {
                n9.this.h();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(n9 n9Var);

        void a(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f9298c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            bc.a(n9.this.f9288C, appLovinAd);
            n9.this.f9318z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n9 n9Var = n9.this;
            if (view == n9Var.f9305k && ((Boolean) n9Var.b.a(oj.f9832q2)).booleanValue()) {
                n9.c(n9.this);
                if (n9.this.f9297a.R0()) {
                    n9.this.c("javascript:al_onCloseButtonTapped(" + n9.this.f9315w + "," + n9.this.f9317y + "," + n9.this.f9318z + ");");
                }
                List K5 = n9.this.f9297a.K();
                com.applovin.impl.sdk.t tVar = n9.this.f9298c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.f9298c.a("AppLovinFullscreenActivity", "Handling close button tap " + n9.this.f9315w + " with multi close delay: " + K5);
                }
                if (K5 != null && K5.size() > n9.this.f9315w) {
                    n9.this.f9316x.add(Long.valueOf(SystemClock.elapsedRealtime() - n9.this.f9309q));
                    List I5 = n9.this.f9297a.I();
                    if (I5 != null && I5.size() > n9.this.f9315w) {
                        n9 n9Var2 = n9.this;
                        n9Var2.f9305k.a((e.a) I5.get(n9Var2.f9315w));
                    }
                    com.applovin.impl.sdk.t tVar2 = n9.this.f9298c;
                    if (com.applovin.impl.sdk.t.a()) {
                        n9.this.f9298c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + K5.get(n9.this.f9315w));
                    }
                    n9.this.f9305k.setVisibility(8);
                    n9 n9Var3 = n9.this;
                    n9Var3.a(n9Var3.f9305k, ((Integer) K5.get(n9Var3.f9315w)).intValue(), new F0(this, 2));
                    return;
                }
                n9.this.f();
                return;
            }
            com.applovin.impl.sdk.t tVar3 = n9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f9298c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ e(n9 n9Var, a aVar) {
            this();
        }

        public /* synthetic */ void a() {
            n9.this.f9309q = SystemClock.elapsedRealtime();
        }
    }

    public n9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f9297a = bVar;
        this.b = kVar;
        this.f9298c = kVar.L();
        this.f9299d = activity;
        this.f9288C = appLovinAdClickListener;
        this.f9289D = appLovinAdDisplayListener;
        this.f9290E = appLovinAdVideoPlaybackListener;
        gb gbVar = new gb(activity, kVar);
        this.f9291F = gbVar;
        gbVar.a(this);
        this.f9295J = new C0755g(kVar);
        e eVar = new e(this, null);
        if (((Boolean) kVar.a(oj.f9613J2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(oj.f9651P2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        l9 l9Var = new l9(kVar.v0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f9303i = l9Var;
        l9Var.setAdClickListener(eVar);
        this.f9303i.setAdDisplayListener(new a());
        bVar.e().putString("ad_view_address", ar.a(this.f9303i));
        this.f9303i.getController().a(this);
        ca caVar = new ca(map, kVar);
        if (caVar.c()) {
            this.f9304j = new com.applovin.impl.adview.k(caVar, activity);
        }
        kVar.i().trackImpression(bVar);
        List K5 = bVar.K();
        if (bVar.p() < 0 && K5 == null) {
            this.f9305k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.f9305k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new W0(this, 0));
        if (bVar.S0()) {
            this.f9302h = new b();
        } else {
            this.f9302h = null;
        }
        this.f9301g = new c();
    }

    private void C() {
        if (this.f9302h != null) {
            this.b.m().a(this.f9302h);
        }
        if (this.f9301g != null) {
            this.b.e().a(this.f9301g);
        }
    }

    private void D() {
        AppLovinSdkUtils.runOnUiThread(new Y0(this, 0));
    }

    public static /* synthetic */ int c(n9 n9Var) {
        int i9 = n9Var.f9315w;
        n9Var.f9315w = i9 + 1;
        return i9;
    }

    public /* synthetic */ void n() {
        if (!this.f9297a.D0().getAndSet(true)) {
            this.b.l0().a((xl) new fn(this.f9297a, this.b), sm.b.OTHER);
        }
    }

    public /* synthetic */ void o() {
        com.applovin.impl.sdk.t.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
        try {
            f();
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                p();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void A();

    public boolean B() {
        return this.f9308p.get();
    }

    public abstract void a(long j7);

    public abstract void a(ViewGroup viewGroup);

    public boolean l() {
        if (AppLovinAdType.INCENTIVIZED != this.f9297a.getType() && AppLovinAdType.AUTO_INCENTIVIZED != this.f9297a.getType()) {
            return false;
        }
        return true;
    }

    public boolean m() {
        return this.f9299d instanceof AppLovinFullscreenActivity;
    }

    @Override // com.applovin.impl.zp.b
    public void onCachedResourcesChecked(boolean z8) {
        if (z8) {
            return;
        }
        if (((Boolean) this.b.a(oj.f9654P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.b("AppLovinFullscreenActivity", "Dismissing ad due to unavailable resources");
            }
            ob.a(this.f9297a, this.f9289D, "Unavailable ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.b("AppLovinFullscreenActivity", "Streaming ad due to unavailable ad resources");
        }
        this.f9297a.J0();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f9312t) {
            j();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            i();
        }
    }

    public void p() {
        if (!B() && this.f9307o.compareAndSet(false, true)) {
            bc.b(this.f9289D, this.f9297a);
            this.b.E().b(this.f9297a);
        }
    }

    public abstract void q();

    public void r() {
        ho hoVar = this.f9292G;
        if (hoVar != null) {
            hoVar.d();
        }
    }

    public void s() {
        ho hoVar = this.f9292G;
        if (hoVar != null) {
            hoVar.e();
        }
    }

    public void t() {
        com.applovin.impl.adview.b g9;
        if (this.f9303i == null || !this.f9297a.x0() || (g9 = this.f9303i.getController().g()) == null) {
            return;
        }
        this.f9295J.a(g9, new C(this, 10));
    }

    public void u() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f9296K) {
            f();
        }
        if (this.f9297a.R0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void v() {
        AppLovinAdView appLovinAdView = this.f9303i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f9303i.destroy();
            this.f9303i = null;
            if ((parent instanceof ViewGroup) && m()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        q();
        p();
        this.f9288C = null;
        this.f9289D = null;
        this.f9290E = null;
        this.f9299d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void w() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.f9291F.b()) {
            this.f9291F.a();
        }
        r();
    }

    public void x() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        s();
        if (this.f9291F.b()) {
            this.f9291F.a();
        }
    }

    public void y() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void z();

    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new X0(gVar, runnable, 2));
    }

    public void h() {
        if (this.f9297a.d() >= 0) {
            this.f9308p.set(true);
        } else {
            if (this.f9307o.get()) {
                return;
            }
            D();
        }
    }

    public void a(boolean z8) {
        zp.a(z8, this.f9297a, this.b, com.applovin.impl.sdk.k.k(), this);
    }

    public void b(boolean z8) {
        List a6 = zp.a(z8, this.f9297a, this.b, this.f9299d);
        if (a6.isEmpty()) {
            return;
        }
        if (((Boolean) this.b.a(oj.f9654P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a6);
            }
            ob.a(this.f9297a, this.f9289D, "Missing ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a6);
        }
        this.f9297a.J0();
    }

    public void f() {
        this.f9311s = true;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f9297a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f9300f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f9297a != null ? r0.C() : 0L);
        p();
        this.f9295J.b();
        if (this.f9302h != null) {
            this.b.m().b(this.f9302h);
        }
        if (this.f9301g != null) {
            this.b.e().b(this.f9301g);
        }
        if (m()) {
            this.f9299d.finish();
            return;
        }
        this.b.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.b.L().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        v();
    }

    public int g() {
        int r9 = this.f9297a.r();
        return (r9 <= 0 && ((Boolean) this.b.a(oj.f9594G2)).booleanValue()) ? this.f9313u + 1 : r9;
    }

    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void j() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f9312t = true;
    }

    public boolean k() {
        return this.f9311s;
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, d dVar) {
        n9 o9Var;
        boolean b12 = bVar.b1();
        if (bVar instanceof bq) {
            if (b12) {
                try {
                    o9Var = new q9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    try {
                        o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (bVar.hasVideoUrl()) {
            if (bVar.I0()) {
                try {
                    o9Var = new v9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    dVar.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (b12) {
                try {
                    o9Var = new s9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    try {
                        o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th6) {
                        dVar.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + kVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                o9Var = new o9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        o9Var.C();
        dVar.a(o9Var);
    }

    public void c(String str) {
        a(str, 0L);
    }

    public void d(boolean z8) {
        a(z8, ((Long) this.b.a(oj.f9600H2)).longValue());
        bc.a(this.f9289D, this.f9297a);
        this.b.E().a(this.f9297a);
        if (this.f9297a.hasVideoUrl() || l()) {
            bc.a(this.f9290E, this.f9297a);
        }
        new vg(this.f9299d).a(this.f9297a);
        this.f9297a.setHasShown(true);
    }

    public void c(boolean z8) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z8);
        }
        b("javascript:al_onWindowFocusChanged( " + z8 + " );");
        ho hoVar = this.f9293H;
        if (hoVar != null) {
            if (z8) {
                hoVar.e();
            } else {
                hoVar.d();
            }
        }
    }

    public /* synthetic */ void b(View view) {
        f();
    }

    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        ar.a(gVar, 400L, new X0(gVar, runnable, 0));
    }

    public void b(String str) {
        if (this.f9297a.B0()) {
            a(str, 0L);
        }
    }

    public void b(long j7) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j7) + " seconds...");
        }
        this.f9292G = ho.a(j7, this.b, new Y0(this, 1));
    }

    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b g9;
        AppLovinAdView appLovinAdView = this.f9303i;
        if (appLovinAdView == null || (g9 = appLovinAdView.getController().g()) == null) {
            return;
        }
        g9.a(str);
    }

    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(String str, long j7) {
        if (j7 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new F(20, this, str), j7);
    }

    public void a(int i9, boolean z8, boolean z9, long j7) {
        if (this.f9306n.compareAndSet(false, true)) {
            if (this.f9297a.hasVideoUrl() || l()) {
                bc.a(this.f9290E, this.f9297a, i9, z9);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            this.b.i().trackVideoEnd(this.f9297a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i9, z8);
            long elapsedRealtime2 = this.f9309q != -1 ? SystemClock.elapsedRealtime() - this.f9309q : -1L;
            this.b.i().trackFullScreenAdClosed(this.f9297a, elapsedRealtime2, this.f9316x, j7, this.f9287B, this.f9286A);
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9298c;
                StringBuilder sb = new StringBuilder("Video ad ended at percent: ");
                sb.append(i9);
                sb.append("%, elapsedTime: ");
                sb.append(elapsedRealtime);
                sb.append("ms, skipTimeMillis: ");
                sb.append(j7);
                sb.append("ms, closeTimeMillis: ");
                tVar.a("AppLovinFullscreenActivity", Q7.n0.k(sb, elapsedRealtime2, "ms"));
            }
        }
    }

    public void a(boolean z8, long j7) {
        if (this.f9297a.K0()) {
            a(z8 ? "javascript:al_mute();" : "javascript:al_unmute();", j7);
        }
    }

    public void a(int i9, KeyEvent keyEvent) {
        if (this.f9298c == null || !com.applovin.impl.sdk.t.a()) {
            return;
        }
        this.f9298c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i9 + ", " + keyEvent);
    }

    public void a(Runnable runnable, long j7) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j7, this.f9300f);
    }

    public void a(com.applovin.impl.adview.g gVar, long j7, Runnable runnable) {
        if (j7 >= ((Long) this.b.a(oj.p2)).longValue()) {
            return;
        }
        X0 x02 = new X0(gVar, runnable, 1);
        if (((Boolean) this.b.a(oj.f9658Q2)).booleanValue()) {
            this.f9293H = ho.a(TimeUnit.SECONDS.toMillis(j7), this.b, x02);
        } else {
            this.b.l0().a(new kn(this.b, "fadeInCloseButton", x02), sm.b.OTHER, TimeUnit.SECONDS.toMillis(j7), true);
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f9294I = true;
    }

    public /* synthetic */ void a(View view) {
        com.applovin.impl.adview.g gVar;
        if (zp.a(oj.f9794k1, this.b)) {
            this.b.D().c(this.f9297a, com.applovin.impl.sdk.k.k());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_size", this.f9297a.getSize().getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(this.f9297a.getAdIdNumber()), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", this.f9297a.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("clcode", this.f9297a.getClCode(), hashMap);
        this.b.B().a(o.b.BLACK_VIEW, (Map) hashMap);
        if (((Boolean) this.b.a(oj.f9754e6)).booleanValue()) {
            f();
            return;
        }
        this.f9296K = ((Boolean) this.b.a(oj.f9761f6)).booleanValue();
        if (!((Boolean) this.b.a(oj.f9769g6)).booleanValue() || (gVar = this.f9305k) == null) {
            return;
        }
        gVar.setVisibility(0);
    }
}
