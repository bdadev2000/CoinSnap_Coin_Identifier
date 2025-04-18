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

/* loaded from: classes.dex */
public class s9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L;
    protected final com.applovin.exoplayer2.ui.e M;
    protected final zj N;
    protected final o O;
    protected final com.applovin.impl.adview.g P;
    protected f3 Q;
    protected final ImageView R;
    protected com.applovin.impl.adview.l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    private final d V;
    private final Handler W;
    private final Handler X;
    protected final t4 Y;
    protected final t4 Z;

    /* renamed from: a0 */
    private final boolean f7454a0;

    /* renamed from: b0 */
    protected boolean f7455b0;

    /* renamed from: c0 */
    protected long f7456c0;

    /* renamed from: d0 */
    protected int f7457d0;

    /* renamed from: e0 */
    protected boolean f7458e0;

    /* renamed from: f0 */
    protected boolean f7459f0;

    /* renamed from: g0 */
    private long f7460g0;

    /* renamed from: h0 */
    private final AtomicBoolean f7461h0;

    /* renamed from: i0 */
    private final AtomicBoolean f7462i0;

    /* renamed from: j0 */
    private long f7463j0;

    /* renamed from: k0 */
    private long f7464k0;

    /* loaded from: classes.dex */
    public class a implements t4.b {
        final /* synthetic */ int a;

        public a(int i10) {
            this.a = i10;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.Q != null) {
                long seconds = this.a - TimeUnit.MILLISECONDS.toSeconds(s9Var.M.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    s9.this.f6382v = true;
                } else if (s9.this.T()) {
                    s9.this.Q.setProgress((int) seconds);
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
        final /* synthetic */ Integer a;

        public b(Integer num) {
            this.a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.f7458e0) {
                s9Var.T.setVisibility(8);
            } else {
                s9.this.T.setProgress((int) ((((float) s9Var.N.getCurrentPosition()) / ((float) s9.this.f7456c0)) * this.a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !s9.this.f7458e0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements t4.b {
        final /* synthetic */ long a;

        /* renamed from: b */
        final /* synthetic */ Integer f7467b;

        /* renamed from: c */
        final /* synthetic */ Long f7468c;

        public c(long j3, Integer num, Long l10) {
            this.a = j3;
            this.f7467b = num;
            this.f7468c = l10;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            s9.this.U.setProgress((int) ((((float) s9.this.f6379r) / ((float) this.a)) * this.f7467b.intValue()));
            s9 s9Var = s9.this;
            s9Var.f6379r = this.f7468c.longValue() + s9Var.f6379r;
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return s9.this.f6379r < this.a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements sr.a {
        private d() {
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            s9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            s9.this.I = true;
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            s9.this.Y();
        }

        public /* synthetic */ d(s9 s9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            s9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, s9.this.f6370i.getController().i(), s9.this.f6364b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, s9.this.f6370i.getController(), s9.this.f6364b);
        }
    }

    /* loaded from: classes.dex */
    public class e implements nh.c, d.e, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.nh.c
        public void a(kh khVar) {
            s9.this.d("Video view error (" + zp.a(khVar, s9.this.f6364b) + ")");
            s9.this.f();
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i10) {
            com.applovin.impl.sdk.t tVar = s9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar2 = s9.this.f6365c;
                StringBuilder m10 = a4.j.m("Player state changed to state ", i10, " and will play when ready: ");
                m10.append(s9.this.N.l());
                tVar2.a("AppLovinFullscreenActivity", m10.toString());
            }
            if (i10 == 2) {
                s9.this.W();
                return;
            }
            if (i10 == 3) {
                s9 s9Var = s9.this;
                s9Var.N.a(!s9Var.f7455b0 ? 1 : 0);
                s9 s9Var2 = s9.this;
                s9Var2.u = (int) TimeUnit.MILLISECONDS.toSeconds(s9Var2.N.getDuration());
                s9 s9Var3 = s9.this;
                s9Var3.c(s9Var3.N.getDuration());
                s9.this.Q();
                com.applovin.impl.sdk.t tVar3 = s9.this.f6365c;
                if (com.applovin.impl.sdk.t.a()) {
                    s9.this.f6365c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + s9.this.N);
                }
                s9.this.Y.b();
                s9 s9Var4 = s9.this;
                if (s9Var4.P != null) {
                    s9Var4.R();
                }
                s9.this.G();
                if (s9.this.F.b()) {
                    s9.this.z();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                com.applovin.impl.sdk.t tVar4 = s9.this.f6365c;
                if (com.applovin.impl.sdk.t.a()) {
                    s9.this.f6365c.a("AppLovinFullscreenActivity", "Video completed");
                }
                s9 s9Var5 = s9.this;
                s9Var5.f7459f0 = true;
                if (!s9Var5.f6381t) {
                    s9Var5.X();
                } else if (s9Var5.l()) {
                    s9.this.V();
                }
            }
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i10) {
            if (i10 == 0) {
                s9.this.M.c();
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
            if (view == s9Var.P) {
                s9Var.Y();
                return;
            }
            if (view == s9Var.R) {
                s9Var.a0();
            } else if (com.applovin.impl.sdk.t.a()) {
                s9.this.f6365c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(s9 s9Var, a aVar) {
            this();
        }
    }

    public s9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new u9(this.a, this.f6366d, this.f6364b);
        d dVar = new d(this, null);
        this.V = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.W = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.X = handler2;
        t4 t4Var = new t4(handler, this.f6364b);
        this.Y = t4Var;
        this.Z = new t4(handler2, this.f6364b);
        boolean G0 = this.a.G0();
        this.f7454a0 = G0;
        this.f7455b0 = zp.e(this.f6364b);
        this.f7460g0 = -1L;
        this.f7461h0 = new AtomicBoolean();
        this.f7462i0 = new AtomicBoolean();
        this.f7463j0 = -2L;
        this.f7464k0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f6713n1, kVar)) {
                a(!G0);
            }
            f fVar = new f(this, null);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.P = null;
            }
            if (a(this.f7455b0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f7455b0);
            } else {
                this.R = null;
            }
            String g02 = bVar.g0();
            if (StringUtils.isValidString(g02)) {
                sr srVar = new sr(kVar);
                srVar.a(new WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.f0(), bVar, srVar, activity);
                this.S = lVar;
                lVar.a(g02);
            } else {
                this.S = null;
            }
            if (G0) {
                o oVar = new o(activity, ((Integer) kVar.a(oj.F2)).intValue(), R.attr.progressBarStyleLarge);
                this.O = oVar;
                oVar.setColor(Color.parseColor("#75FFFFFF"));
                oVar.setBackgroundColor(Color.parseColor("#00000000"));
                oVar.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.O = null;
            }
            int g10 = g();
            boolean z10 = ((Boolean) kVar.a(oj.f6714n2)).booleanValue() && g10 > 0;
            if (this.Q == null && z10) {
                this.Q = new f3(activity);
                int q10 = bVar.q();
                this.Q.setTextColor(q10);
                this.Q.setTextSize(((Integer) kVar.a(oj.f6706m2)).intValue());
                this.Q.setFinishedStrokeColor(q10);
                this.Q.setFinishedStrokeWidth(((Integer) kVar.a(oj.f6698l2)).intValue());
                this.Q.setMax(g10);
                this.Q.setProgress(g10);
                t4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(g10));
            }
            if (bVar.r0()) {
                Long l10 = (Long) kVar.a(oj.C2);
                Integer num = (Integer) kVar.a(oj.D2);
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.T = progressBar;
                a(progressBar, bVar.q0(), num.intValue());
                t4Var.a("PROGRESS_BAR", l10.longValue(), new b(num));
            } else {
                this.T = null;
            }
            zj a10 = new zj.b(activity).a();
            this.N = a10;
            e eVar = new e(this, null);
            a10.a((nh.c) eVar);
            a10.a(0);
            com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
            this.M = eVar2;
            eVar2.c();
            eVar2.setControllerVisibilityListener(eVar);
            eVar2.setPlayer(a10);
            eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
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
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    public /* synthetic */ void N() {
        this.f6378q = SystemClock.elapsedRealtime();
    }

    private void O() {
        com.applovin.impl.adview.l lVar;
        boolean z10;
        rq i02 = this.a.i0();
        if (i02 != null && i02.j() && !this.f7458e0 && (lVar = this.S) != null) {
            if (lVar.getVisibility() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            AppLovinSdkUtils.runOnUiThread(new rv(this, z10, i02.h(), 0));
        }
    }

    public void V() {
        this.L.a(this.f6373l);
        this.f6378q = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void b(boolean z10, long j3) {
        if (z10) {
            ar.a(this.S, j3, (Runnable) null);
        } else {
            ar.b(this.S, j3, null);
        }
    }

    public /* synthetic */ void e(String str) {
        ur.a(this.S, str, "AppLovinFullscreenActivity", this.f6364b);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void P() {
        if (this.f7458e0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f6364b.f0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j3 = this.f7460g0;
        if (j3 >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f6365c;
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Resuming video at position ", j3, "ms for MediaPlayer: ");
                o10.append(this.N);
                tVar.a("AppLovinFullscreenActivity", o10.toString());
            }
            this.N.a(true);
            this.Y.b();
            this.f7460g0 = -1L;
            if (!this.N.isPlaying()) {
                W();
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.N.isPlaying());
        }
    }

    public void Q() {
        long V;
        long millis;
        long j3 = 0;
        if (this.a.U() >= 0 || this.a.V() >= 0) {
            if (this.a.U() >= 0) {
                V = this.a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.a;
                long j10 = this.f7456c0;
                if (j10 > 0) {
                    j3 = j10;
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

    public void R() {
        if (this.f7462i0.compareAndSet(false, true)) {
            a(this.P, this.a.k0(), new qv(this, 3));
        }
    }

    public void S() {
        if (!zp.a(oj.f6713n1, this.f6364b)) {
            b(!this.f7454a0);
        }
        Activity activity = this.f6366d;
        yh a10 = new yh.b(new u5(activity, yp.a((Context) activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(od.a(this.a.s0()));
        this.N.a(!this.f7455b0 ? 1 : 0);
        this.N.a((wd) a10);
        this.N.b();
        this.N.a(false);
    }

    public boolean T() {
        return (this.f6382v || this.f7458e0 || !this.M.getPlayer().isPlaying()) ? false : true;
    }

    public boolean U() {
        return l() && !H();
    }

    public void W() {
        AppLovinSdkUtils.runOnUiThread(new qv(this, 4));
    }

    public void X() {
        Z();
        long T = this.a.T();
        if (T > 0) {
            this.f6379r = 0L;
            Long l10 = (Long) this.f6364b.a(oj.L2);
            Integer num = (Integer) this.f6364b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.f6366d, null, R.attr.progressBarStyleHorizontal);
            this.U = progressBar;
            a(progressBar, this.a.S(), num.intValue());
            this.Z.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new c(T, num, l10));
            this.Z.b();
        }
        this.L.a(this.f6372k, this.f6371j, this.f6370i, this.U);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(this.f6385y);
        sb2.append(",");
        a(vd.e.g(sb2, this.f6386z, ");"), this.a.D());
        if (this.f6372k != null) {
            int i10 = 0;
            if (this.a.p() >= 0) {
                a(this.f6372k, this.a.p(), new qv(this, i10));
            } else {
                this.f6372k.setVisibility(0);
            }
        }
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
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.a.getAdEventTracker().b(this.f6370i, arrayList);
        t();
        this.f7458e0 = true;
    }

    public void Y() {
        this.f7463j0 = SystemClock.elapsedRealtime() - this.f7464k0;
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", a4.j.j(new StringBuilder("Attempting to skip video with skip time: "), this.f7463j0, "ms"));
        }
        if (U()) {
            z();
            r();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.F.e();
            return;
        }
        F();
    }

    public void Z() {
        this.f7457d0 = E();
        this.N.a(false);
    }

    public void a0() {
        boolean z10 = this.f7455b0;
        this.f7455b0 = !z10;
        this.N.a(z10 ? 1.0f : 0.0f);
        e(this.f7455b0);
        a(this.f7455b0, 0L);
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0L);
            if (this.f7458e0) {
                this.Z.b();
                return;
            }
            return;
        }
        if (this.f7458e0) {
            this.Z.c();
        } else {
            z();
        }
    }

    public void d(String str) {
        String str2;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f6365c;
            StringBuilder o10 = a4.j.o("Encountered media error: ", str, " for ad: ");
            o10.append(this.a);
            tVar.b("AppLovinFullscreenActivity", o10.toString());
        }
        if (this.f7461h0.compareAndSet(false, true)) {
            if (zp.a(oj.f6682j1, this.f6364b)) {
                this.f6364b.D().d(this.a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            if (this.a instanceof bq) {
                str2 = "handleVastExoPlayerError";
            } else {
                str2 = "handleExoPlayerError";
            }
            this.f6364b.B().a(str2, str, this.a);
            f();
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.Y.a();
        this.Z.a();
        this.W.removeCallbacksAndMessages(null);
        this.X.removeCallbacksAndMessages(null);
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
        this.L.a(this.S);
        this.L.a((View) this.P);
        if (!l() || this.f7458e0) {
            V();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.a.getAdIdNumber() && this.f7454a0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.f7459f0 && !this.N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a(E(), this.f7454a0, H(), this.f7463j0);
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (((Boolean) this.f6364b.a(oj.f6679i6)).booleanValue()) {
            ur.b(this.S);
            this.S = null;
        }
        this.N.V();
        if (this.f7454a0) {
            AppLovinCommunicator.getInstance(this.f6366d).unsubscribe(this, "video_caching_failed");
        }
        super.v();
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.N.isPlaying()) {
            this.f7460g0 = this.N.getCurrentPosition();
            this.N.a(false);
            this.Y.c();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", a4.j.j(new StringBuilder("Paused video at position "), this.f7460g0, "ms"));
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Nothing to pause");
        }
    }

    public /* synthetic */ void J() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    public /* synthetic */ void K() {
        this.f7463j0 = -1L;
        this.f7464k0 = SystemClock.elapsedRealtime();
    }

    public int E() {
        zj zjVar = this.N;
        if (zjVar == null) {
            return 0;
        }
        long currentPosition = zjVar.getCurrentPosition();
        if (this.f7459f0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f7456c0)) * 100.0f);
        }
        return this.f7457d0;
    }

    public void F() {
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
            X();
        }
    }

    public void G() {
        AppLovinSdkUtils.runOnUiThread(new qv(this, 1));
    }

    public boolean H() {
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar == null) {
            return false;
        }
        return bVar.W0() ? this.I : I();
    }

    public boolean I() {
        return E() >= this.a.m0();
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.a.F0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri j02 = this.a.j0();
            if (j02 != null) {
                if (!((Boolean) this.f6364b.a(oj.N)).booleanValue() || (context = this.f6366d) == null) {
                    AppLovinAdView appLovinAdView = this.f6370i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.k.k();
                }
                this.f6364b.i().trackAndLaunchVideoClick(this.a, j02, motionEvent, bundle, this, context);
                bc.a(this.C, this.a);
                this.f6386z++;
                return;
            }
            return;
        }
        O();
    }

    public void e(boolean z10) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6366d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.R.setScaleType(ImageView.ScaleType.FIT_XY);
                this.R.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.R, z10 ? this.a.L() : this.a.e0(), this.f6364b);
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    public void c(long j3) {
        this.f7456c0 = j3;
    }

    @Override // com.applovin.impl.gb.a
    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
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
    public void a(String str, long j3) {
        super.a(str, j3);
        if (this.S == null || j3 < 0 || !StringUtils.isValidString(str) || !((Boolean) this.f6364b.a(oj.R2)).booleanValue()) {
            return;
        }
        a(new rs(28, this, str), j3);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (x3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.M, this.f6370i, this.f6371j, null, viewGroup);
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.a(true);
        if (this.a.Z0()) {
            this.F.b(this.a, new qv(this, 5));
        }
        if (this.f7454a0) {
            W();
        }
        this.f6370i.renderAd(this.a);
        if (this.P != null) {
            this.f6364b.l0().a(new kn(this.f6364b, "scheduleSkipButton", new qv(this, 6)), sm.b.TIMEOUT, this.a.l0(), true);
        }
        super.d(this.f7455b0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j3) {
        a(new qv(this, 2), j3);
    }
}
