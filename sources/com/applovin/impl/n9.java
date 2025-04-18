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
import com.applovin.impl.sdk.f;
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
    protected boolean B;
    protected AppLovinAdClickListener C;
    protected AppLovinAdDisplayListener D;
    protected AppLovinAdVideoPlaybackListener E;
    protected final gb F;
    protected ho G;
    protected ho H;
    protected boolean I;
    private final com.applovin.impl.sdk.g J;
    protected final com.applovin.impl.sdk.ad.b a;

    /* renamed from: b */
    protected final com.applovin.impl.sdk.k f6364b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.t f6365c;

    /* renamed from: d */
    protected Activity f6366d;

    /* renamed from: g */
    private final p f6368g;

    /* renamed from: h */
    private final f.a f6369h;

    /* renamed from: i */
    protected AppLovinAdView f6370i;

    /* renamed from: j */
    protected com.applovin.impl.adview.k f6371j;

    /* renamed from: k */
    protected final com.applovin.impl.adview.g f6372k;

    /* renamed from: l */
    protected final com.applovin.impl.adview.g f6373l;

    /* renamed from: r */
    protected long f6379r;

    /* renamed from: s */
    private boolean f6380s;

    /* renamed from: t */
    protected boolean f6381t;
    protected int u;

    /* renamed from: v */
    protected boolean f6382v;

    /* renamed from: f */
    private final Handler f6367f = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    protected final long f6374m = SystemClock.elapsedRealtime();

    /* renamed from: n */
    private final AtomicBoolean f6375n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f6376o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f6377p = new AtomicBoolean();

    /* renamed from: q */
    protected long f6378q = -1;

    /* renamed from: w */
    private int f6383w = 0;

    /* renamed from: x */
    private final ArrayList f6384x = new ArrayList();

    /* renamed from: y */
    protected int f6385y = 0;

    /* renamed from: z */
    protected int f6386z = 0;
    protected int A = com.applovin.impl.sdk.f.f7660i;
    private boolean K = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f6365c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f6365c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            n9.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements f.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.f.a
        public void a(int i10) {
            n9 n9Var = n9.this;
            if (n9Var.A != com.applovin.impl.sdk.f.f7660i) {
                n9Var.B = true;
            }
            com.applovin.impl.adview.b g10 = n9Var.f6370i.getController().g();
            if (g10 == null) {
                com.applovin.impl.sdk.t tVar = n9.this.f6365c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.f6365c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.f.a(i10) && !com.applovin.impl.sdk.f.a(n9.this.A)) {
                g10.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                g10.a("javascript:al_muteSwitchOff();");
            }
            n9.this.A = i10;
        }
    }

    /* loaded from: classes.dex */
    public class c extends p {
        public c() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass().getName().equals(zp.l(activity.getApplicationContext()))) {
                n9.this.h();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(n9 n9Var);

        void a(String str, Throwable th2);
    }

    /* loaded from: classes.dex */
    public class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        public static /* synthetic */ void a(e eVar) {
            eVar.a();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.t tVar = n9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f6365c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            bc.a(n9.this.C, appLovinAd);
            n9.this.f6386z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n9 n9Var = n9.this;
            if (view == n9Var.f6372k && ((Boolean) n9Var.f6364b.a(oj.f6738q2)).booleanValue()) {
                n9.c(n9.this);
                if (n9.this.a.R0()) {
                    n9.this.c("javascript:al_onCloseButtonTapped(" + n9.this.f6383w + "," + n9.this.f6385y + "," + n9.this.f6386z + ");");
                }
                List K = n9.this.a.K();
                com.applovin.impl.sdk.t tVar = n9.this.f6365c;
                if (com.applovin.impl.sdk.t.a()) {
                    n9.this.f6365c.a("AppLovinFullscreenActivity", "Handling close button tap " + n9.this.f6383w + " with multi close delay: " + K);
                }
                if (K != null && K.size() > n9.this.f6383w) {
                    n9.this.f6384x.add(Long.valueOf(SystemClock.elapsedRealtime() - n9.this.f6378q));
                    List I = n9.this.a.I();
                    if (I != null && I.size() > n9.this.f6383w) {
                        n9 n9Var2 = n9.this;
                        n9Var2.f6372k.a((e.a) I.get(n9Var2.f6383w));
                    }
                    com.applovin.impl.sdk.t tVar2 = n9.this.f6365c;
                    if (com.applovin.impl.sdk.t.a()) {
                        n9.this.f6365c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + K.get(n9.this.f6383w));
                    }
                    n9.this.f6372k.setVisibility(8);
                    n9 n9Var3 = n9.this;
                    n9Var3.a(n9Var3.f6372k, ((Integer) K.get(n9Var3.f6383w)).intValue(), new nt(this, 2));
                    return;
                }
                n9.this.f();
                return;
            }
            com.applovin.impl.sdk.t tVar3 = n9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                n9.this.f6365c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ e(n9 n9Var, a aVar) {
            this();
        }

        public /* synthetic */ void a() {
            n9.this.f6378q = SystemClock.elapsedRealtime();
        }
    }

    public n9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = 0;
        this.a = bVar;
        this.f6364b = kVar;
        this.f6365c = kVar.L();
        this.f6366d = activity;
        this.C = appLovinAdClickListener;
        this.D = appLovinAdDisplayListener;
        this.E = appLovinAdVideoPlaybackListener;
        gb gbVar = new gb(activity, kVar);
        this.F = gbVar;
        gbVar.a(this);
        this.J = new com.applovin.impl.sdk.g(kVar);
        e eVar = new e(this, null);
        if (((Boolean) kVar.a(oj.J2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(oj.P2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        l9 l9Var = new l9(kVar.v0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f6370i = l9Var;
        l9Var.setAdClickListener(eVar);
        this.f6370i.setAdDisplayListener(new a());
        bVar.e().putString("ad_view_address", ar.a(this.f6370i));
        this.f6370i.getController().a(this);
        ca caVar = new ca(map, kVar);
        if (caVar.c()) {
            this.f6371j = new com.applovin.impl.adview.k(caVar, activity);
        }
        kVar.i().trackImpression(bVar);
        List K = bVar.K();
        if (bVar.p() < 0 && K == null) {
            this.f6372k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.f6372k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f6373l = gVar2;
        gVar2.setOnClickListener(new gu(this, i10));
        if (bVar.S0()) {
            this.f6369h = new b();
        } else {
            this.f6369h = null;
        }
        this.f6368g = new c();
    }

    private void C() {
        if (this.f6369h != null) {
            this.f6364b.m().a(this.f6369h);
        }
        if (this.f6368g != null) {
            this.f6364b.e().a(this.f6368g);
        }
    }

    private void D() {
        AppLovinSdkUtils.runOnUiThread(new fu(this, 1));
    }

    public static /* synthetic */ int c(n9 n9Var) {
        int i10 = n9Var.f6383w;
        n9Var.f6383w = i10 + 1;
        return i10;
    }

    public /* synthetic */ void n() {
        if (!this.a.D0().getAndSet(true)) {
            this.f6364b.l0().a((xl) new fn(this.a, this.f6364b), sm.b.OTHER);
        }
    }

    public /* synthetic */ void o() {
        com.applovin.impl.sdk.t.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
        try {
            f();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                p();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void A();

    public boolean B() {
        return this.f6377p.get();
    }

    public abstract void a(long j3);

    public abstract void a(ViewGroup viewGroup);

    public void j() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f6381t = true;
    }

    public boolean k() {
        return this.f6380s;
    }

    public boolean l() {
        return AppLovinAdType.INCENTIVIZED == this.a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.a.getType();
    }

    public boolean m() {
        return this.f6366d instanceof AppLovinFullscreenActivity;
    }

    @Override // com.applovin.impl.zp.b
    public void onCachedResourcesChecked(boolean z10) {
        if (z10) {
            return;
        }
        if (((Boolean) this.f6364b.a(oj.P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.b("AppLovinFullscreenActivity", "Dismissing ad due to unavailable resources");
            }
            ob.a(this.a, this.D, "Unavailable ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.b("AppLovinFullscreenActivity", "Streaming ad due to unavailable ad resources");
        }
        this.a.J0();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f6381t) {
            j();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            i();
        }
    }

    public void p() {
        if (!B() && this.f6376o.compareAndSet(false, true)) {
            bc.b(this.D, this.a);
            this.f6364b.E().b(this.a);
        }
    }

    public abstract void q();

    public void r() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.d();
        }
    }

    public void s() {
        ho hoVar = this.G;
        if (hoVar != null) {
            hoVar.e();
        }
    }

    public void t() {
        com.applovin.impl.adview.b g10;
        if (this.f6370i == null || !this.a.x0() || (g10 = this.f6370i.getController().g()) == null) {
            return;
        }
        this.J.a(g10, new js(this, 10));
    }

    public void u() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.K) {
            f();
        }
        if (this.a.R0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void v() {
        AppLovinAdView appLovinAdView = this.f6370i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f6370i.destroy();
            this.f6370i = null;
            if ((parent instanceof ViewGroup) && m()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        q();
        p();
        this.C = null;
        this.D = null;
        this.E = null;
        this.f6366d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void w() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.F.b()) {
            this.F.a();
        }
        r();
    }

    public void x() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        s();
        if (this.F.b()) {
            this.F.a();
        }
    }

    public void y() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void z();

    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new eu(gVar, runnable, 0));
    }

    public void h() {
        if (this.a.d() >= 0) {
            this.f6377p.set(true);
        } else {
            if (this.f6376o.get()) {
                return;
            }
            D();
        }
    }

    public void f() {
        this.f6380s = true;
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f6367f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.a != null ? r0.C() : 0L);
        p();
        this.J.b();
        if (this.f6369h != null) {
            this.f6364b.m().b(this.f6369h);
        }
        if (this.f6368g != null) {
            this.f6364b.e().b(this.f6368g);
        }
        if (m()) {
            this.f6366d.finish();
            return;
        }
        this.f6364b.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6364b.L().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        v();
    }

    public int g() {
        int r6 = this.a.r();
        return (r6 <= 0 && ((Boolean) this.f6364b.a(oj.G2)).booleanValue()) ? this.u + 1 : r6;
    }

    public void i() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void a(boolean z10) {
        zp.a(z10, this.a, this.f6364b, com.applovin.impl.sdk.k.k(), this);
    }

    public void b(boolean z10) {
        List a10 = zp.a(z10, this.a, this.f6364b, this.f6366d);
        if (a10.isEmpty()) {
            return;
        }
        if (((Boolean) this.f6364b.a(oj.P5)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a10);
            }
            ob.a(this.a, this.D, "Missing ad resources", null, null);
            f();
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a10);
        }
        this.a.J0();
    }

    public void c(String str) {
        a(str, 0L);
    }

    public void d(boolean z10) {
        a(z10, ((Long) this.f6364b.a(oj.H2)).longValue());
        bc.a(this.D, this.a);
        this.f6364b.E().a(this.a);
        if (this.a.hasVideoUrl() || l()) {
            bc.a(this.E, this.a);
        }
        new vg(this.f6366d).a(this.a);
        this.a.setHasShown(true);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, d dVar) {
        n9 o9Var;
        boolean b12 = bVar.b1();
        if (bVar instanceof bq) {
            if (b12) {
                try {
                    o9Var = new q9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th2) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th2);
                    }
                    try {
                        o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th3) {
                        dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new r9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            }
        } else if (bVar.hasVideoUrl()) {
            if (bVar.I0()) {
                try {
                    o9Var = new v9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    dVar.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + kVar + " and throwable: " + th5.getMessage(), th5);
                    return;
                }
            } else if (b12) {
                try {
                    o9Var = new s9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th6) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th6);
                    }
                    try {
                        o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th7) {
                        dVar.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + kVar + " and throwable: " + th7.getMessage(), th7);
                        return;
                    }
                }
            } else {
                try {
                    o9Var = new t9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th8) {
                    dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th8.getMessage(), th8);
                    return;
                }
            }
        } else {
            try {
                o9Var = new o9(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th9) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th9.getMessage(), th9);
                return;
            }
        }
        o9Var.C();
        dVar.a(o9Var);
    }

    public void c(boolean z10) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
        ho hoVar = this.H;
        if (hoVar != null) {
            if (z10) {
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
        ar.a(gVar, 400L, new eu(gVar, runnable, 1));
    }

    public void b(String str) {
        if (this.a.B0()) {
            a(str, 0L);
        }
    }

    public void b(long j3) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j3) + " seconds...");
        }
        this.G = ho.a(j3, this.f6364b, new fu(this, 0));
    }

    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b g10;
        AppLovinAdView appLovinAdView = this.f6370i;
        if (appLovinAdView == null || (g10 = appLovinAdView.getController().g()) == null) {
            return;
        }
        g10.a(str);
    }

    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(String str, long j3) {
        if (j3 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new rs(20, this, str), j3);
    }

    public void a(int i10, boolean z10, boolean z11, long j3) {
        if (this.f6375n.compareAndSet(false, true)) {
            if (this.a.hasVideoUrl() || l()) {
                bc.a(this.E, this.a, i10, z11);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6374m;
            this.f6364b.i().trackVideoEnd(this.a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i10, z10);
            long elapsedRealtime2 = this.f6378q != -1 ? SystemClock.elapsedRealtime() - this.f6378q : -1L;
            this.f6364b.i().trackFullScreenAdClosed(this.a, elapsedRealtime2, this.f6384x, j3, this.B, this.A);
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f6365c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i10);
                sb2.append("%, elapsedTime: ");
                sb2.append(elapsedRealtime);
                sb2.append("ms, skipTimeMillis: ");
                sb2.append(j3);
                sb2.append("ms, closeTimeMillis: ");
                tVar.a("AppLovinFullscreenActivity", a4.j.j(sb2, elapsedRealtime2, "ms"));
            }
        }
    }

    public void a(boolean z10, long j3) {
        if (this.a.K0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j3);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f6365c == null || !com.applovin.impl.sdk.t.a()) {
            return;
        }
        this.f6365c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(Runnable runnable, long j3) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j3, this.f6367f);
    }

    public void a(com.applovin.impl.adview.g gVar, long j3, Runnable runnable) {
        if (j3 >= ((Long) this.f6364b.a(oj.f6730p2)).longValue()) {
            return;
        }
        eu euVar = new eu(gVar, runnable, 2);
        if (((Boolean) this.f6364b.a(oj.Q2)).booleanValue()) {
            this.H = ho.a(TimeUnit.SECONDS.toMillis(j3), this.f6364b, euVar);
        } else {
            this.f6364b.l0().a(new kn(this.f6364b, "fadeInCloseButton", euVar), sm.b.OTHER, TimeUnit.SECONDS.toMillis(j3), true);
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.I = true;
    }

    public /* synthetic */ void a(View view) {
        com.applovin.impl.adview.g gVar;
        if (zp.a(oj.f6689k1, this.f6364b)) {
            this.f6364b.D().c(this.a, com.applovin.impl.sdk.k.k());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_size", this.a.getSize().getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(this.a.getAdIdNumber()), hashMap);
        CollectionUtils.putStringIfValid("dsp_name", this.a.getDspName(), hashMap);
        CollectionUtils.putStringIfValid("clcode", this.a.getClCode(), hashMap);
        this.f6364b.B().a(o.b.BLACK_VIEW, (Map) hashMap);
        if (((Boolean) this.f6364b.a(oj.f6647e6)).booleanValue()) {
            f();
            return;
        }
        this.K = ((Boolean) this.f6364b.a(oj.f6655f6)).booleanValue();
        if (!((Boolean) this.f6364b.a(oj.f6663g6)).booleanValue() || (gVar = this.f6372k) == null) {
            return;
        }
        gVar.setVisibility(0);
    }
}
