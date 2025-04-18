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
import com.applovin.impl.bi;
import com.applovin.impl.ck;
import com.applovin.impl.qh;
import com.applovin.impl.rr;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.special.SpecialsBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class u9 extends p9 implements AppLovinCommunicatorSubscriber {
    private final w9 K;
    protected final com.applovin.exoplayer2.ui.e L;
    protected final ck M;
    protected final o N;
    protected final com.applovin.impl.adview.g O;
    protected h3 P;
    protected final ImageView Q;
    protected com.applovin.impl.adview.l R;
    protected final ProgressBar S;
    protected ProgressBar T;
    private final d U;
    private final Handler V;
    private final Handler W;
    protected final v4 X;
    protected final v4 Y;
    private final boolean Z;

    /* renamed from: a0 */
    protected boolean f27286a0;

    /* renamed from: b0 */
    protected long f27287b0;

    /* renamed from: c0 */
    protected int f27288c0;

    /* renamed from: d0 */
    protected boolean f27289d0;

    /* renamed from: e0 */
    protected boolean f27290e0;

    /* renamed from: f0 */
    private long f27291f0;

    /* renamed from: g0 */
    private final AtomicBoolean f27292g0;

    /* renamed from: h0 */
    private final AtomicBoolean f27293h0;

    /* renamed from: i0 */
    private long f27294i0;

    /* renamed from: j0 */
    private long f27295j0;

    /* loaded from: classes.dex */
    public class a implements v4.b {

        /* renamed from: a */
        final /* synthetic */ int f27296a;

        public a(int i2) {
            this.f27296a = i2;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            u9 u9Var = u9.this;
            if (u9Var.P != null) {
                long seconds = this.f27296a - TimeUnit.MILLISECONDS.toSeconds(u9Var.L.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    u9.this.f25994u = true;
                } else if (u9.this.P()) {
                    u9.this.P.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return u9.this.P();
        }
    }

    /* loaded from: classes.dex */
    public class b implements v4.b {

        /* renamed from: a */
        final /* synthetic */ Integer f27298a;

        public b(Integer num) {
            this.f27298a = num;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            u9 u9Var = u9.this;
            if (u9Var.f27289d0) {
                u9Var.S.setVisibility(8);
            } else {
                u9.this.S.setProgress((int) ((((float) u9Var.M.getCurrentPosition()) / ((float) u9.this.f27287b0)) * this.f27298a.intValue()));
            }
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return !u9.this.f27289d0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements v4.b {

        /* renamed from: a */
        final /* synthetic */ long f27300a;

        /* renamed from: b */
        final /* synthetic */ Integer f27301b;

        /* renamed from: c */
        final /* synthetic */ Long f27302c;

        public c(long j2, Integer num, Long l2) {
            this.f27300a = j2;
            this.f27301b = num;
            this.f27302c = l2;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            u9.this.T.setProgress((int) ((((float) u9.this.f25990q) / ((float) this.f27300a)) * this.f27301b.intValue()));
            u9 u9Var = u9.this;
            u9Var.f25990q = this.f27302c.longValue() + u9Var.f25990q;
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return u9.this.f25990q < this.f27300a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements rr.a {
        private d() {
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            u9.this.f();
        }

        @Override // com.applovin.impl.rr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            u9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.rr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            u9.this.H = true;
        }

        @Override // com.applovin.impl.rr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            u9.this.U();
        }

        public /* synthetic */ d(u9 u9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            u9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.rr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            tp.b(uri, u9.this.f25982i.getController().i(), u9.this.f25977b);
        }

        @Override // com.applovin.impl.rr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            tp.a(uri, u9.this.f25982i.getController(), u9.this.f25977b);
        }
    }

    /* loaded from: classes.dex */
    public class e implements qh.c, d.e, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.qh.c
        public void a(nh nhVar) {
            u9.this.d("Video view error (" + yp.a(nhVar) + ")");
            u9.this.f();
        }

        @Override // com.applovin.impl.qh.c
        public void b(int i2) {
            com.applovin.impl.sdk.n nVar = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = u9.this.f25978c;
                StringBuilder t2 = android.support.v4.media.d.t("Player state changed to state ", i2, " and will play when ready: ");
                t2.append(u9.this.M.l());
                nVar2.a("AppLovinFullscreenActivity", t2.toString());
            }
            if (i2 == 2) {
                u9.this.S();
                return;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    com.applovin.impl.sdk.n nVar3 = u9.this.f25978c;
                    if (com.applovin.impl.sdk.n.a()) {
                        u9.this.f25978c.a("AppLovinFullscreenActivity", "Video completed");
                    }
                    u9 u9Var = u9.this;
                    u9Var.f27290e0 = true;
                    if (!u9Var.f25992s) {
                        u9Var.T();
                        return;
                    } else {
                        if (u9Var.k()) {
                            u9.this.R();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            u9 u9Var2 = u9.this;
            u9Var2.M.a(!u9Var2.f27286a0 ? 1 : 0);
            u9 u9Var3 = u9.this;
            u9Var3.f25993t = (int) TimeUnit.MILLISECONDS.toSeconds(u9Var3.M.getDuration());
            u9 u9Var4 = u9.this;
            u9Var4.c(u9Var4.M.getDuration());
            u9.this.M();
            com.applovin.impl.sdk.n nVar4 = u9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + u9.this.M);
            }
            u9.this.X.b();
            u9 u9Var5 = u9.this;
            if (u9Var5.O != null) {
                u9Var5.N();
            }
            u9.this.C();
            if (u9.this.E.b()) {
                u9.this.x();
            }
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i2) {
            if (i2 == 0) {
                u9.this.L.c();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            u9.this.a(motionEvent, (Bundle) null);
        }

        public /* synthetic */ e(u9 u9Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u9 u9Var = u9.this;
            if (view == u9Var.O) {
                u9Var.U();
                return;
            }
            if (view == u9Var.Q) {
                u9Var.W();
            } else if (com.applovin.impl.sdk.n.a()) {
                u9.this.f25978c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(u9 u9Var, a aVar) {
            this();
        }
    }

    public u9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new w9(this.f25976a, this.d, this.f25977b);
        d dVar = new d(this, null);
        this.U = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.V = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.W = handler2;
        v4 v4Var = new v4(handler, this.f25977b);
        this.X = v4Var;
        this.Y = new v4(handler2, this.f25977b);
        boolean I0 = this.f25976a.I0();
        this.Z = I0;
        this.f27286a0 = yp.e(this.f25977b);
        this.f27291f0 = -1L;
        this.f27292g0 = new AtomicBoolean();
        this.f27293h0 = new AtomicBoolean();
        this.f27294i0 = -2L;
        this.f27295j0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        f fVar = new f(this, null);
        if (bVar.l0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.c0(), activity);
            this.O = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.O = null;
        }
        if (a(this.f27286a0, jVar)) {
            ImageView imageView = new ImageView(activity);
            this.Q = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            d(this.f27286a0);
        } else {
            this.Q = null;
        }
        String h02 = bVar.h0();
        if (StringUtils.isValidString(h02)) {
            rr rrVar = new rr(jVar);
            rrVar.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.g0(), bVar, rrVar, activity);
            this.R = lVar;
            lVar.a(h02);
        } else {
            this.R = null;
        }
        if (I0) {
            o oVar = new o(activity, ((Integer) jVar.a(sj.K2)).intValue(), R.attr.progressBarStyleLarge);
            this.N = oVar;
            oVar.setColor(Color.parseColor("#75FFFFFF"));
            oVar.setBackgroundColor(Color.parseColor("#00000000"));
            oVar.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.N = null;
        }
        int g2 = g();
        boolean z2 = ((Boolean) jVar.a(sj.p2)).booleanValue() && g2 > 0;
        if (this.P == null && z2) {
            this.P = new h3(activity);
            int p2 = bVar.p();
            this.P.setTextColor(p2);
            this.P.setTextSize(((Integer) jVar.a(sj.o2)).intValue());
            this.P.setFinishedStrokeColor(p2);
            this.P.setFinishedStrokeWidth(((Integer) jVar.a(sj.n2)).intValue());
            this.P.setMax(g2);
            this.P.setProgress(g2);
            v4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(g2));
        }
        if (bVar.s0()) {
            Long l2 = (Long) jVar.a(sj.H2);
            Integer num = (Integer) jVar.a(sj.I2);
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            this.S = progressBar;
            a(progressBar, bVar.r0(), num.intValue());
            v4Var.a("PROGRESS_BAR", l2.longValue(), new b(num));
        } else {
            this.S = null;
        }
        ck a2 = new ck.b(activity).a();
        this.M = a2;
        e eVar = new e(this, null);
        a2.a((qh.c) eVar);
        a2.a(0);
        com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
        this.L = eVar2;
        eVar2.c();
        eVar2.setControllerVisibilityListener(eVar);
        eVar2.setPlayer(a2);
        eVar2.setOnTouchListener(new AppLovinTouchToClickListener(jVar, sj.D0, activity, eVar));
        bVar.d().putString("video_view_address", zq.a(eVar2));
        O();
    }

    public /* synthetic */ void H() {
        a(250L);
    }

    public /* synthetic */ void I() {
        o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }

    public /* synthetic */ void J() {
        this.f25989p = SystemClock.elapsedRealtime();
    }

    private void K() {
        com.applovin.impl.adview.l lVar;
        qq j02 = this.f25976a.j0();
        if (j02 == null || !j02.j() || this.f27289d0 || (lVar = this.R) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.sdk.c0(this, lVar.getVisibility() == 4, j02.h(), 1));
    }

    public void R() {
        this.K.a(this.f25985l);
        this.f25989p = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void b(boolean z2, long j2) {
        if (z2) {
            zq.a(this.R, j2, (Runnable) null);
        } else {
            zq.b(this.R, j2, null);
        }
    }

    public void L() {
        if (this.f27289d0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f25977b.f0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j2 = this.f27291f0;
        if (j2 < 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.M.isPlaying());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f25978c;
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Resuming video at position ", j2, "ms for MediaPlayer: ");
            r2.append(this.M);
            nVar.a("AppLovinFullscreenActivity", r2.toString());
        }
        this.M.a(true);
        this.X.b();
        this.f27291f0 = -1L;
        if (this.M.isPlaying()) {
            return;
        }
        S();
    }

    public void M() {
        long V;
        long millis;
        if (this.f25976a.U() >= 0 || this.f25976a.V() >= 0) {
            if (this.f25976a.U() >= 0) {
                V = this.f25976a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f25976a;
                long j2 = this.f27287b0;
                long j3 = j2 > 0 ? j2 : 0L;
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
                    j3 += millis;
                }
                V = (long) ((this.f25976a.V() / 100.0d) * j3);
            }
            b(V);
        }
    }

    public void N() {
        if (this.f27293h0.compareAndSet(false, true)) {
            a(this.O, this.f25976a.l0(), new ew(this, 1));
        }
    }

    public void O() {
        a(!this.Z);
        Activity activity = this.d;
        bi a2 = new bi.b(new w5(activity, xp.a((Context) activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(td.a(this.f25976a.t0()));
        this.M.a(!this.f27286a0 ? 1 : 0);
        this.M.a((be) a2);
        this.M.b();
        this.M.a(false);
    }

    public boolean P() {
        return (this.f25994u || this.f27289d0 || !this.L.getPlayer().isPlaying()) ? false : true;
    }

    public boolean Q() {
        return k() && !D();
    }

    public void S() {
        AppLovinSdkUtils.runOnUiThread(new ew(this, 2));
    }

    public void T() {
        V();
        long T = this.f25976a.T();
        if (T > 0) {
            this.f25990q = 0L;
            Long l2 = (Long) this.f25977b.a(sj.Q2);
            Integer num = (Integer) this.f25977b.a(sj.T2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.T = progressBar;
            a(progressBar, this.f25976a.S(), num.intValue());
            this.Y.a("POSTITIAL_PROGRESS_BAR", l2.longValue(), new c(T, num, l2));
            this.Y.b();
        }
        this.K.a(this.f25984k, this.f25983j, this.f25982i, this.T);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.x);
        sb.append(",");
        a(androidx.compose.foundation.text.input.a.n(sb, this.f25996y, ");"), this.f25976a.C());
        if (this.f25984k != null) {
            if (this.f25976a.o() >= 0) {
                a(this.f25984k, this.f25976a.o(), new ew(this, 3));
            } else {
                this.f25984k.setVisibility(0);
            }
        }
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
        ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new og(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f25976a.getAdEventTracker().b(this.f25982i, arrayList);
        r();
        this.f27289d0 = true;
    }

    public void U() {
        this.f27294i0 = SystemClock.elapsedRealtime() - this.f27295j0;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(new StringBuilder("Attempting to skip video with skip time: "), this.f27294i0, "ms"));
        }
        if (!Q()) {
            B();
            return;
        }
        x();
        p();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
        }
        this.E.e();
    }

    public void V() {
        this.f27288c0 = A();
        this.M.a(false);
    }

    public void W() {
        boolean z2 = this.f27286a0;
        this.f27286a0 = !z2;
        this.M.a(z2 ? 1.0f : 0.0f);
        d(this.f27286a0);
        a(this.f27286a0, 0L);
    }

    public void c(long j2) {
        this.f27287b0 = j2;
    }

    public void d(String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f25978c;
            StringBuilder v2 = android.support.v4.media.d.v("Encountered media error: ", str, " for ad: ");
            v2.append(this.f25976a);
            nVar.b("AppLovinFullscreenActivity", v2.toString());
        }
        if (StringUtils.containsAtLeastOneSubstring(str, this.f25977b.c(sj.X2))) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Ignoring media error: ", str, this.f25978c, "AppLovinFullscreenActivity");
            }
        } else if (this.f27292g0.compareAndSet(false, true)) {
            if (yp.a(sj.f26925i1, this.f25977b)) {
                this.f25977b.B().d(this.f25976a, com.applovin.impl.sdk.j.l());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.C;
            if (appLovinAdDisplayListener instanceof qb) {
                ((qb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f25977b.E().a(this.f25976a instanceof aq ? "handleVastExoPlayerError" : "handleExoPlayerError", str, this.f25976a);
            f();
        }
    }

    @Override // com.applovin.impl.p9
    public void f() {
        this.X.a();
        this.Y.a();
        this.V.removeCallbacksAndMessages(null);
        this.W.removeCallbacksAndMessages(null);
        o();
        super.f();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.p9
    public void h() {
        super.h();
        R();
    }

    @Override // com.applovin.impl.p9
    public void i() {
        super.i();
        this.K.a(this.R);
        this.K.a((View) this.O);
        if (!k() || this.f27289d0) {
            R();
        }
    }

    @Override // com.applovin.impl.p9
    public void o() {
        super.a(A(), this.Z, D(), this.f27294i0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong(CreativeInfo.f29617c) == this.f25976a.getAdIdNumber() && this.Z) {
                int i2 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i2 >= 200 && i2 < 300) || this.f27290e0 || this.M.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i2 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.p9
    public void t() {
        if (((Boolean) this.f25977b.a(sj.n6)).booleanValue()) {
            tr.d(this.R);
            this.R = null;
        }
        this.M.V();
        if (this.Z) {
            AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
        }
        super.t();
    }

    @Override // com.applovin.impl.p9
    public void x() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (!this.M.isPlaying()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Nothing to pause");
            }
        } else {
            this.f27291f0 = this.M.getCurrentPosition();
            this.M.a(false);
            this.X.c();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(new StringBuilder("Paused video at position "), this.f27291f0, "ms"));
            }
        }
    }

    @Override // com.applovin.impl.p9
    public void y() {
        a((ViewGroup) null);
    }

    public /* synthetic */ void F() {
        o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
    }

    public /* synthetic */ void G() {
        this.f27294i0 = -1L;
        this.f27295j0 = SystemClock.elapsedRealtime();
    }

    public int A() {
        ck ckVar = this.M;
        if (ckVar == null) {
            return 0;
        }
        long currentPosition = ckVar.getCurrentPosition();
        if (this.f27290e0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f27287b0)) * 100.0f) : this.f27288c0;
    }

    public void B() {
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
            T();
        }
    }

    public void C() {
        AppLovinSdkUtils.runOnUiThread(new ew(this, 0));
    }

    public boolean D() {
        com.applovin.impl.sdk.ad.b bVar = this.f25976a;
        if (bVar == null) {
            return false;
        }
        if (this.H && bVar.a1()) {
            return true;
        }
        return E();
    }

    public boolean E() {
        return A() >= this.f25976a.n0();
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f25976a.H0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k02 = this.f25976a.k0();
            if (k02 != null) {
                if (!((Boolean) this.f25977b.a(sj.F)).booleanValue() || (context = this.d) == null) {
                    AppLovinAdView appLovinAdView = this.f25982i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.j.l();
                }
                this.f25977b.i().trackAndLaunchVideoClick(this.f25976a, k02, motionEvent, bundle, this, context);
                gc.a(this.B, this.f25976a);
                this.f25996y++;
                return;
            }
            return;
        }
        K();
    }

    @Override // com.applovin.impl.kb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.p9
    public void b(boolean z2) {
        super.b(z2);
        if (z2) {
            a(0L);
            if (this.f27289d0) {
                this.Y.b();
                return;
            }
            return;
        }
        if (this.f27289d0) {
            this.Y.c();
        } else {
            x();
        }
    }

    @Override // com.applovin.impl.kb.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        B();
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

    public /* synthetic */ void a(String str) {
        tr.a(this.R, str, "AppLovinFullscreenActivity", this.f25977b);
    }

    @Override // com.applovin.impl.p9
    public void a(String str, long j2) {
        super.a(str, j2);
        if (this.R == null || j2 < 0 || !StringUtils.isValidString(str) || !((Boolean) this.f25977b.a(sj.W2)).booleanValue()) {
            return;
        }
        a(new ms(28, this, str), j2);
    }

    private void a(ProgressBar progressBar, int i2, int i3) {
        progressBar.setMax(i3);
        progressBar.setPadding(0, 0, 0, 0);
        if (z3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // com.applovin.impl.p9
    public void a(ViewGroup viewGroup) {
        this.K.a(this.Q, this.O, this.R, this.N, this.S, this.P, this.L, this.f25982i, this.f25983j, null, viewGroup);
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null) {
            kVar.b();
        }
        this.M.a(true);
        if (this.f25976a.d1()) {
            this.E.b(this.f25976a, new ew(this, 4));
        }
        if (this.Z) {
            S();
        }
        SpecialsBridge.appLovinAdViewRenderAd(this.f25982i, this.f25976a);
        if (this.O != null) {
            this.f25977b.j0().a(new jn(this.f25977b, "scheduleSkipButton", new ew(this, 5)), tm.b.TIMEOUT, this.f25976a.m0(), true);
        }
        super.c(this.f27286a0);
    }

    public void d(boolean z2) {
        if (z3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z2 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.Q.setScaleType(ImageView.ScaleType.FIT_XY);
                this.Q.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.Q, z2 ? this.f25976a.L() : this.f25976a.f0(), this.f25977b);
    }

    @Override // com.applovin.impl.p9
    public void a(long j2) {
        a(new ew(this, 6), j2);
    }
}
