package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.nh;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
import com.applovin.impl.yh;
import com.applovin.impl.zj;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class s9 extends n9 implements AppLovinCommunicatorSubscriber {

    /* renamed from: L */
    private final u9 f10579L;

    /* renamed from: M */
    protected final com.applovin.exoplayer2.ui.e f10580M;

    /* renamed from: N */
    protected final zj f10581N;
    protected final C0730o O;

    /* renamed from: P */
    protected final com.applovin.impl.adview.g f10582P;

    /* renamed from: Q */
    protected C0696f3 f10583Q;

    /* renamed from: R */
    protected final ImageView f10584R;

    /* renamed from: S */
    protected com.applovin.impl.adview.l f10585S;

    /* renamed from: T */
    protected final ProgressBar f10586T;

    /* renamed from: U */
    protected ProgressBar f10587U;

    /* renamed from: V */
    private final d f10588V;

    /* renamed from: W */
    private final Handler f10589W;

    /* renamed from: X */
    private final Handler f10590X;

    /* renamed from: Y */
    protected final t4 f10591Y;

    /* renamed from: Z */
    protected final t4 f10592Z;

    /* renamed from: a0 */
    private final boolean f10593a0;

    /* renamed from: b0 */
    protected boolean f10594b0;

    /* renamed from: c0 */
    protected long f10595c0;

    /* renamed from: d0 */
    protected int f10596d0;

    /* renamed from: e0 */
    protected boolean f10597e0;
    protected boolean f0;

    /* renamed from: g0 */
    private long f10598g0;

    /* renamed from: h0 */
    private final AtomicBoolean f10599h0;

    /* renamed from: i0 */
    private final AtomicBoolean f10600i0;

    /* renamed from: j0 */
    private long f10601j0;

    /* renamed from: k0 */
    private long f10602k0;

    /* loaded from: classes.dex */
    public class a implements t4.b {

        /* renamed from: a */
        final /* synthetic */ int f10603a;

        public a(int i9) {
            this.f10603a = i9;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.f10583Q != null) {
                long seconds = this.f10603a - TimeUnit.MILLISECONDS.toSeconds(s9Var.f10580M.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    s9.this.f9314v = true;
                } else if (s9.this.T()) {
                    s9.this.f10583Q.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return s9.this.T();
        }
    }

    /* loaded from: classes.dex */
    public class b implements t4.b {

        /* renamed from: a */
        final /* synthetic */ Integer f10604a;

        public b(Integer num) {
            this.f10604a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.f10597e0) {
                s9Var.f10586T.setVisibility(8);
            } else {
                s9.this.f10586T.setProgress((int) ((((float) s9Var.f10581N.getCurrentPosition()) / ((float) s9.this.f10595c0)) * this.f10604a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !s9.this.f10597e0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements t4.b {

        /* renamed from: a */
        final /* synthetic */ long f10605a;
        final /* synthetic */ Integer b;

        /* renamed from: c */
        final /* synthetic */ Long f10606c;

        public c(long j7, Integer num, Long l) {
            this.f10605a = j7;
            this.b = num;
            this.f10606c = l;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9.this.f10587U.setProgress((int) ((((float) s9.this.f9310r) / ((float) this.f10605a)) * this.b.intValue()));
            s9 s9Var = s9.this;
            s9Var.f9310r = this.f10606c.longValue() + s9Var.f9310r;
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            if (s9.this.f9310r < this.f10605a) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements sr.a {
        private d() {
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            s9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            s9.this.f9294I = true;
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            s9.this.Y();
        }

        public /* synthetic */ d(s9 s9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, s9.this.f9303i.getController().i(), s9.this.b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, s9.this.f9303i.getController(), s9.this.b);
        }
    }

    /* loaded from: classes.dex */
    public class e implements nh.c, d.e, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.nh.c
        public void a(kh khVar) {
            s9.this.d("Video view error (" + zp.a(khVar, s9.this.b) + ")");
            s9.this.f();
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i9) {
            com.applovin.impl.sdk.t tVar = s9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar2 = s9.this.f9298c;
                StringBuilder p2 = Q7.n0.p(i9, "Player state changed to state ", " and will play when ready: ");
                p2.append(s9.this.f10581N.l());
                tVar2.a("AppLovinFullscreenActivity", p2.toString());
            }
            if (i9 == 2) {
                s9.this.W();
                return;
            }
            if (i9 == 3) {
                s9 s9Var = s9.this;
                s9Var.f10581N.a(!s9Var.f10594b0 ? 1 : 0);
                s9 s9Var2 = s9.this;
                s9Var2.f9313u = (int) TimeUnit.MILLISECONDS.toSeconds(s9Var2.f10581N.getDuration());
                s9 s9Var3 = s9.this;
                s9Var3.c(s9Var3.f10581N.getDuration());
                s9.this.Q();
                com.applovin.impl.sdk.t tVar3 = s9.this.f9298c;
                if (com.applovin.impl.sdk.t.a()) {
                    s9.this.f9298c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + s9.this.f10581N);
                }
                s9.this.f10591Y.b();
                s9 s9Var4 = s9.this;
                if (s9Var4.f10582P != null) {
                    s9Var4.R();
                }
                s9.this.G();
                if (s9.this.f9291F.b()) {
                    s9.this.z();
                    return;
                }
                return;
            }
            if (i9 == 4) {
                com.applovin.impl.sdk.t tVar4 = s9.this.f9298c;
                if (com.applovin.impl.sdk.t.a()) {
                    s9.this.f9298c.a("AppLovinFullscreenActivity", "Video completed");
                }
                s9 s9Var5 = s9.this;
                s9Var5.f0 = true;
                if (!s9Var5.f9312t) {
                    s9Var5.X();
                } else if (s9Var5.l()) {
                    s9.this.V();
                }
            }
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i9) {
            if (i9 == 0) {
                s9.this.f10580M.c();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            s9.this.a(motionEvent, (Bundle) null);
        }

        public /* synthetic */ e(s9 s9Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s9 s9Var = s9.this;
            if (view == s9Var.f10582P) {
                s9Var.Y();
                return;
            }
            if (view == s9Var.f10584R) {
                s9Var.a0();
            } else if (com.applovin.impl.sdk.t.a()) {
                s9.this.f9298c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(s9 s9Var, a aVar) {
            this();
        }
    }

    public s9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f10579L = new u9(this.f9297a, this.f9299d, this.b);
        d dVar = new d(this, null);
        this.f10588V = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10589W = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10590X = handler2;
        t4 t4Var = new t4(handler, this.b);
        this.f10591Y = t4Var;
        this.f10592Z = new t4(handler2, this.b);
        boolean G02 = this.f9297a.G0();
        this.f10593a0 = G02;
        this.f10594b0 = zp.e(this.b);
        this.f10598g0 = -1L;
        this.f10599h0 = new AtomicBoolean();
        this.f10600i0 = new AtomicBoolean();
        this.f10601j0 = -2L;
        this.f10602k0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f9810n1, kVar)) {
                a(!G02);
            }
            f fVar = new f(this, null);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.f10582P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.f10582P = null;
            }
            if (a(this.f10594b0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.f10584R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f10594b0);
            } else {
                this.f10584R = null;
            }
            String g02 = bVar.g0();
            if (StringUtils.isValidString(g02)) {
                sr srVar = new sr(kVar);
                srVar.a(new WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.f0(), bVar, srVar, activity);
                this.f10585S = lVar;
                lVar.a(g02);
            } else {
                this.f10585S = null;
            }
            if (G02) {
                C0730o c0730o = new C0730o(activity, ((Integer) kVar.a(oj.f9588F2)).intValue(), R.attr.progressBarStyleLarge);
                this.O = c0730o;
                c0730o.setColor(Color.parseColor("#75FFFFFF"));
                c0730o.setBackgroundColor(Color.parseColor("#00000000"));
                c0730o.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.O = null;
            }
            int g9 = g();
            boolean z8 = ((Boolean) kVar.a(oj.n2)).booleanValue() && g9 > 0;
            if (this.f10583Q == null && z8) {
                this.f10583Q = new C0696f3(activity);
                int q9 = bVar.q();
                this.f10583Q.setTextColor(q9);
                this.f10583Q.setTextSize(((Integer) kVar.a(oj.m2)).intValue());
                this.f10583Q.setFinishedStrokeColor(q9);
                this.f10583Q.setFinishedStrokeWidth(((Integer) kVar.a(oj.l2)).intValue());
                this.f10583Q.setMax(g9);
                this.f10583Q.setProgress(g9);
                t4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(g9));
            }
            if (bVar.r0()) {
                Long l = (Long) kVar.a(oj.f9564C2);
                Integer num = (Integer) kVar.a(oj.f9572D2);
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.f10586T = progressBar;
                a(progressBar, bVar.q0(), num.intValue());
                t4Var.a("PROGRESS_BAR", l.longValue(), new b(num));
            } else {
                this.f10586T = null;
            }
            zj a6 = new zj.b(activity).a();
            this.f10581N = a6;
            e eVar = new e(this, null);
            a6.a((nh.c) eVar);
            a6.a(0);
            com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
            this.f10580M = eVar2;
            eVar2.c();
            eVar2.setControllerVisibilityListener(eVar);
            eVar2.setPlayer(a6);
            eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.f9547A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a(eVar2));
            S();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    public /* synthetic */ void L() {
        a(250L);
    }

    public /* synthetic */ void M() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.a();
        }
    }

    public /* synthetic */ void N() {
        this.f9309q = SystemClock.elapsedRealtime();
    }

    private void O() {
        com.applovin.impl.adview.l lVar;
        boolean z8;
        rq i02 = this.f9297a.i0();
        if (i02 != null && i02.j() && !this.f10597e0 && (lVar = this.f10585S) != null) {
            if (lVar.getVisibility() == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            AppLovinSdkUtils.runOnUiThread(new H2(this, z8, i02.h(), 0));
        }
    }

    public void V() {
        this.f10579L.a(this.l);
        this.f9309q = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void b(boolean z8, long j7) {
        if (z8) {
            ar.a(this.f10585S, j7, (Runnable) null);
        } else {
            ar.b(this.f10585S, j7, null);
        }
    }

    public /* synthetic */ void e(String str) {
        ur.a(this.f10585S, str, "AppLovinFullscreenActivity", this.b);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void P() {
        if (this.f10597e0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.f0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j7 = this.f10598g0;
        if (j7 >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9298c;
                StringBuilder a6 = AbstractC2933a.a("Resuming video at position ", j7, "ms for MediaPlayer: ");
                a6.append(this.f10581N);
                tVar.a("AppLovinFullscreenActivity", a6.toString());
            }
            this.f10581N.a(true);
            this.f10591Y.b();
            this.f10598g0 = -1L;
            if (!this.f10581N.isPlaying()) {
                W();
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f10581N.isPlaying());
        }
    }

    public void Q() {
        long V8;
        long millis;
        long j7 = 0;
        if (this.f9297a.U() >= 0 || this.f9297a.V() >= 0) {
            if (this.f9297a.U() >= 0) {
                V8 = this.f9297a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9297a;
                long j9 = this.f10595c0;
                if (j9 > 0) {
                    j7 = j9;
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

    public void R() {
        if (this.f10600i0.compareAndSet(false, true)) {
            a(this.f10582P, this.f9297a.k0(), new G2(this, 5));
        }
    }

    public void S() {
        if (!zp.a(oj.f9810n1, this.b)) {
            b(!this.f10593a0);
        }
        Activity activity = this.f9299d;
        yh a6 = new yh.b(new u5(activity, yp.a((Context) activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(od.a(this.f9297a.s0()));
        this.f10581N.a(!this.f10594b0 ? 1 : 0);
        this.f10581N.a((wd) a6);
        this.f10581N.b();
        this.f10581N.a(false);
    }

    public boolean T() {
        if (!this.f9314v && !this.f10597e0 && this.f10580M.getPlayer().isPlaying()) {
            return true;
        }
        return false;
    }

    public boolean U() {
        if (l() && !H()) {
            return true;
        }
        return false;
    }

    public void W() {
        AppLovinSdkUtils.runOnUiThread(new G2(this, 1));
    }

    public void X() {
        Z();
        long T2 = this.f9297a.T();
        if (T2 > 0) {
            this.f9310r = 0L;
            Long l = (Long) this.b.a(oj.f9625L2);
            Integer num = (Integer) this.b.a(oj.f9645O2);
            ProgressBar progressBar = new ProgressBar(this.f9299d, null, R.attr.progressBarStyleHorizontal);
            this.f10587U = progressBar;
            a(progressBar, this.f9297a.S(), num.intValue());
            this.f10592Z.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(T2, num, l));
            this.f10592Z.b();
        }
        this.f10579L.a(this.f9305k, this.f9304j, this.f9303i, this.f10587U);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.f9317y);
        sb.append(",");
        a(AbstractC2914a.g(sb, this.f9318z, ");"), this.f9297a.D());
        if (this.f9305k != null) {
            if (this.f9297a.p() >= 0) {
                a(this.f9305k, this.f9297a.p(), new G2(this, 6));
            } else {
                this.f9305k.setVisibility(0);
            }
        }
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
        ProgressBar progressBar2 = this.f10587U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f9297a.getAdEventTracker().b(this.f9303i, arrayList);
        t();
        this.f10597e0 = true;
    }

    public void Y() {
        this.f10601j0 = SystemClock.elapsedRealtime() - this.f10602k0;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", Q7.n0.k(new StringBuilder("Attempting to skip video with skip time: "), this.f10601j0, "ms"));
        }
        if (U()) {
            z();
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.f9291F.e();
            return;
        }
        F();
    }

    public void Z() {
        this.f10596d0 = E();
        this.f10581N.a(false);
    }

    public void a0() {
        boolean z8 = this.f10594b0;
        this.f10594b0 = !z8;
        this.f10581N.a(z8 ? 1.0f : 0.0f);
        e(this.f10594b0);
        a(this.f10594b0, 0L);
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z8) {
        super.c(z8);
        if (z8) {
            a(0L);
            if (this.f10597e0) {
                this.f10592Z.b();
                return;
            }
            return;
        }
        if (this.f10597e0) {
            this.f10592Z.c();
        } else {
            z();
        }
    }

    public void d(String str) {
        String str2;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9298c;
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Encountered media error: ", str, " for ad: ");
            n2.append(this.f9297a);
            tVar.b("AppLovinFullscreenActivity", n2.toString());
        }
        if (this.f10599h0.compareAndSet(false, true)) {
            if (zp.a(oj.f9786j1, this.b)) {
                this.b.D().d(this.f9297a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f9289D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            if (this.f9297a instanceof bq) {
                str2 = "handleVastExoPlayerError";
            } else {
                str2 = "handleExoPlayerError";
            }
            this.b.B().a(str2, str, this.f9297a);
            f();
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.f10591Y.a();
        this.f10592Z.a();
        this.f10589W.removeCallbacksAndMessages(null);
        this.f10590X.removeCallbacksAndMessages(null);
        q();
        super.f();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        V();
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        this.f10579L.a(this.f10585S);
        this.f10579L.a((View) this.f10582P);
        if (!l() || this.f10597e0) {
            V();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f9297a.getAdIdNumber() && this.f10593a0) {
                int i9 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i9 < 200 || i9 >= 300) && !this.f0 && !this.f10581N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i9 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a(E(), this.f10593a0, H(), this.f10601j0);
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (((Boolean) this.b.a(oj.f9783i6)).booleanValue()) {
            ur.b(this.f10585S);
            this.f10585S = null;
        }
        this.f10581N.V();
        if (this.f10593a0) {
            AppLovinCommunicator.getInstance(this.f9299d).unsubscribe(this, "video_caching_failed");
        }
        super.v();
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f10581N.isPlaying()) {
            this.f10598g0 = this.f10581N.getCurrentPosition();
            this.f10581N.a(false);
            this.f10591Y.c();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", Q7.n0.k(new StringBuilder("Paused video at position "), this.f10598g0, "ms"));
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Nothing to pause");
        }
    }

    public /* synthetic */ void J() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.b();
        }
    }

    public /* synthetic */ void K() {
        this.f10601j0 = -1L;
        this.f10602k0 = SystemClock.elapsedRealtime();
    }

    public int E() {
        zj zjVar = this.f10581N;
        if (zjVar == null) {
            return 0;
        }
        long currentPosition = zjVar.getCurrentPosition();
        if (this.f0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f10595c0)) * 100.0f);
        }
        return this.f10596d0;
    }

    public void F() {
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
            X();
        }
    }

    public void G() {
        AppLovinSdkUtils.runOnUiThread(new G2(this, 4));
    }

    public boolean H() {
        com.applovin.impl.sdk.ad.b bVar = this.f9297a;
        if (bVar == null) {
            return false;
        }
        return bVar.W0() ? this.f9294I : I();
    }

    public boolean I() {
        return E() >= this.f9297a.m0();
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f9297a.F0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri j02 = this.f9297a.j0();
            if (j02 != null) {
                if (!((Boolean) this.b.a(oj.f9636N)).booleanValue() || (context = this.f9299d) == null) {
                    AppLovinAdView appLovinAdView = this.f9303i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.k.k();
                }
                this.b.i().trackAndLaunchVideoClick(this.f9297a, j02, motionEvent, bundle, this, context);
                bc.a(this.f9288C, this.f9297a);
                this.f9318z++;
                return;
            }
            return;
        }
        O();
    }

    public void e(boolean z8) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9299d.getDrawable(z8 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f10584R.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f10584R.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f10584R, z8 ? this.f9297a.L() : this.f9297a.e0(), this.b);
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    public void c(long j7) {
        this.f10595c0 = j7;
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
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
    public void a(String str, long j7) {
        super.a(str, j7);
        if (this.f10585S == null || j7 < 0 || !StringUtils.isValidString(str) || !((Boolean) this.b.a(oj.f9665R2)).booleanValue()) {
            return;
        }
        a(new F(28, this, str), j7);
    }

    private void a(ProgressBar progressBar, int i9, int i10) {
        progressBar.setMax(i10);
        progressBar.setPadding(0, 0, 0, 0);
        if (x3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i9));
        }
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.f10579L.a(this.f10584R, this.f10582P, this.f10585S, this.O, this.f10586T, this.f10583Q, this.f10580M, this.f9303i, this.f9304j, null, viewGroup);
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null) {
            kVar.b();
        }
        this.f10581N.a(true);
        if (this.f9297a.Z0()) {
            this.f9291F.b(this.f9297a, new G2(this, 2));
        }
        if (this.f10593a0) {
            W();
        }
        this.f9303i.renderAd(this.f9297a);
        if (this.f10582P != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new G2(this, 3)), sm.b.TIMEOUT, this.f9297a.l0(), true);
        }
        super.d(this.f10594b0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j7) {
        a(new G2(this, 0), j7);
    }
}
