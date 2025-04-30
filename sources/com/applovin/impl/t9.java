package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
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
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.sr;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class t9 extends n9 implements AppLovinCommunicatorSubscriber {

    /* renamed from: L */
    private final u9 f11321L;

    /* renamed from: M */
    private MediaPlayer f11322M;

    /* renamed from: N */
    protected final AppLovinVideoView f11323N;
    protected final C0730o O;

    /* renamed from: P */
    protected final com.applovin.impl.adview.g f11324P;

    /* renamed from: Q */
    protected C0696f3 f11325Q;

    /* renamed from: R */
    protected final ImageView f11326R;

    /* renamed from: S */
    protected com.applovin.impl.adview.l f11327S;

    /* renamed from: T */
    protected final ProgressBar f11328T;

    /* renamed from: U */
    protected ProgressBar f11329U;

    /* renamed from: V */
    protected ImageView f11330V;

    /* renamed from: W */
    private final e f11331W;

    /* renamed from: X */
    private final d f11332X;

    /* renamed from: Y */
    private final Handler f11333Y;

    /* renamed from: Z */
    private final Handler f11334Z;

    /* renamed from: a0 */
    protected final t4 f11335a0;

    /* renamed from: b0 */
    protected final t4 f11336b0;

    /* renamed from: c0 */
    private final boolean f11337c0;

    /* renamed from: d0 */
    protected boolean f11338d0;

    /* renamed from: e0 */
    protected long f11339e0;
    private int f0;

    /* renamed from: g0 */
    private int f11340g0;

    /* renamed from: h0 */
    protected boolean f11341h0;

    /* renamed from: i0 */
    private boolean f11342i0;

    /* renamed from: j0 */
    private final AtomicBoolean f11343j0;

    /* renamed from: k0 */
    private final AtomicBoolean f11344k0;

    /* renamed from: l0 */
    private long f11345l0;

    /* renamed from: m0 */
    private long f11346m0;

    /* loaded from: classes.dex */
    public class a implements t4.b {

        /* renamed from: a */
        final /* synthetic */ int f11347a;

        public a(int i9) {
            this.f11347a = i9;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            if (t9.this.f11325Q != null) {
                long seconds = this.f11347a - TimeUnit.MILLISECONDS.toSeconds(r0.f11323N.getCurrentPosition());
                if (seconds <= 0) {
                    t9.this.f9314v = true;
                } else if (t9.this.T()) {
                    t9.this.f11325Q.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return t9.this.T();
        }
    }

    /* loaded from: classes.dex */
    public class b implements t4.b {

        /* renamed from: a */
        final /* synthetic */ Integer f11348a;

        public b(Integer num) {
            this.f11348a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9 t9Var = t9.this;
            if (t9Var.f11341h0) {
                t9Var.f11328T.setVisibility(8);
            } else {
                t9.this.f11328T.setProgress((int) ((t9Var.f11323N.getCurrentPosition() / ((float) t9.this.f11339e0)) * this.f11348a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !t9.this.f11341h0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements t4.b {

        /* renamed from: a */
        final /* synthetic */ long f11349a;
        final /* synthetic */ Integer b;

        /* renamed from: c */
        final /* synthetic */ Long f11350c;

        public c(long j7, Integer num, Long l) {
            this.f11349a = j7;
            this.b = num;
            this.f11350c = l;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9.this.f11329U.setProgress((int) ((((float) t9.this.f9310r) / ((float) this.f11349a)) * this.b.intValue()));
            t9 t9Var = t9.this;
            t9Var.f9310r = this.f11350c.longValue() + t9Var.f9310r;
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            if (t9.this.f9310r < this.f11349a) {
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
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            t9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            t9.this.f9294I = true;
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            t9.this.Y();
        }

        public /* synthetic */ d(t9 t9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, t9.this.f9303i.getController().i(), t9.this.b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, t9.this.f9303i.getController(), t9.this.b);
        }
    }

    /* loaded from: classes.dex */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            t9.this.a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "Video completed");
            }
            t9.this.f11342i0 = true;
            t9 t9Var = t9.this;
            if (!t9Var.f9312t) {
                t9Var.X();
            } else if (t9Var.l()) {
                t9.this.V();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i9, int i10) {
            t9.this.d(AbstractC2914a.c(i9, i10, "Video view error (", ",", ")"));
            t9.this.f11323N.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i9, int i10) {
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", AbstractC2914a.c(i9, i10, "MediaPlayer Info: (", ", ", ")"));
            }
            if (i9 == 701) {
                t9.this.W();
                return false;
            }
            if (i9 == 3) {
                t9.this.f11335a0.b();
                t9 t9Var = t9.this;
                if (t9Var.f11324P != null) {
                    t9Var.S();
                }
                t9.this.G();
                if (t9.this.f9291F.b()) {
                    t9.this.z();
                    return false;
                }
                return false;
            }
            if (i9 == 702) {
                t9.this.G();
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            t9.this.f11322M = mediaPlayer;
            mediaPlayer.setOnInfoListener(t9.this.f11331W);
            mediaPlayer.setOnErrorListener(t9.this.f11331W);
            float f9 = !t9.this.f11338d0 ? 1 : 0;
            mediaPlayer.setVolume(f9, f9);
            t9.this.f9313u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            t9.this.c(mediaPlayer.getDuration());
            t9.this.R();
            com.applovin.impl.sdk.t tVar = t9.this.f9298c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + t9.this.f11322M);
            }
        }

        public /* synthetic */ e(t9 t9Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t9 t9Var = t9.this;
            if (view == t9Var.f11324P) {
                t9Var.Y();
                return;
            }
            if (view == t9Var.f11326R) {
                t9Var.Z();
            } else if (com.applovin.impl.sdk.t.a()) {
                t9.this.f9298c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(t9 t9Var, a aVar) {
            this();
        }
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f11321L = new u9(this.f9297a, this.f9299d, this.b);
        this.f11330V = null;
        e eVar = new e(this, null);
        this.f11331W = eVar;
        d dVar = new d(this, null);
        this.f11332X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f11333Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f11334Z = handler2;
        t4 t4Var = new t4(handler, this.b);
        this.f11335a0 = t4Var;
        this.f11336b0 = new t4(handler2, this.b);
        boolean G02 = this.f9297a.G0();
        this.f11337c0 = G02;
        this.f11338d0 = zp.e(this.b);
        this.f11340g0 = -1;
        this.f11343j0 = new AtomicBoolean();
        this.f11344k0 = new AtomicBoolean();
        this.f11345l0 = -2L;
        this.f11346m0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f9810n1, kVar)) {
                a(!G02);
            }
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.f11323N = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.f9547A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a(appLovinVideoView));
            f fVar = new f(this, null);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.f11324P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.f11324P = null;
            }
            if (a(this.f11338d0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.f11326R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f11338d0);
            } else {
                this.f11326R = null;
            }
            String g02 = bVar.g0();
            if (StringUtils.isValidString(g02)) {
                sr srVar = new sr(kVar);
                srVar.a(new WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.f0(), bVar, srVar, activity);
                this.f11327S = lVar;
                lVar.a(g02);
            } else {
                this.f11327S = null;
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
            if (this.f11325Q == null && z8) {
                this.f11325Q = new C0696f3(activity);
                int q9 = bVar.q();
                this.f11325Q.setTextColor(q9);
                this.f11325Q.setTextSize(((Integer) kVar.a(oj.m2)).intValue());
                this.f11325Q.setFinishedStrokeColor(q9);
                this.f11325Q.setFinishedStrokeWidth(((Integer) kVar.a(oj.l2)).intValue());
                this.f11325Q.setMax(g9);
                this.f11325Q.setProgress(g9);
                t4Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(g9));
            }
            if (bVar.r0()) {
                Long l = (Long) kVar.a(oj.f9564C2);
                Integer num = (Integer) kVar.a(oj.f9572D2);
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                this.f11328T = progressBar;
                a(progressBar, bVar.q0(), num.intValue());
                t4Var.a("PROGRESS_BAR", l.longValue(), new b(num));
                return;
            }
            this.f11328T = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    public /* synthetic */ void O() {
        this.f9309q = SystemClock.elapsedRealtime();
    }

    private void P() {
        com.applovin.impl.adview.l lVar;
        boolean z8;
        rq i02 = this.f9297a.i0();
        if (i02 != null && i02.j() && !this.f11341h0 && (lVar = this.f11327S) != null) {
            if (lVar.getVisibility() == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            AppLovinSdkUtils.runOnUiThread(new H2(this, z8, i02.h(), 2));
        }
    }

    public void Q() {
        if (this.f11341h0) {
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
        if (this.f11340g0 >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f11340g0 + "ms for MediaPlayer: " + this.f11322M);
            }
            this.f11323N.seekTo(this.f11340g0);
            this.f11323N.start();
            this.f11335a0.b();
            this.f11340g0 = -1;
            a(new J2(this, 6), 250L);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    public void S() {
        if (this.f11344k0.compareAndSet(false, true)) {
            a(this.f11324P, this.f9297a.k0(), new J2(this, 5));
        }
    }

    public void V() {
        this.f11321L.a(this.l);
        this.f9309q = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void e(String str) {
        ur.a(this.f11327S, str, "AppLovinFullscreenActivity", this.b);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void R() {
        long V8;
        long millis;
        long j7 = 0;
        if (this.f9297a.U() >= 0 || this.f9297a.V() >= 0) {
            if (this.f9297a.U() >= 0) {
                V8 = this.f9297a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9297a;
                long j9 = this.f11339e0;
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

    public boolean T() {
        if (!this.f9314v && !this.f11341h0 && this.f11323N.isPlaying()) {
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
        AppLovinSdkUtils.runOnUiThread(new J2(this, 0));
    }

    public void X() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f9297a.c1());
        long T2 = this.f9297a.T();
        if (T2 > 0) {
            this.f9310r = 0L;
            Long l = (Long) this.b.a(oj.f9625L2);
            Integer num = (Integer) this.b.a(oj.f9645O2);
            ProgressBar progressBar = new ProgressBar(this.f9299d, null, R.attr.progressBarStyleHorizontal);
            this.f11329U = progressBar;
            a(progressBar, this.f9297a.S(), num.intValue());
            this.f11336b0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(T2, num, l));
            this.f11336b0.b();
        }
        this.f11321L.a(this.f9305k, this.f9304j, this.f9303i, this.f11329U);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.f9317y);
        sb.append(",");
        a(AbstractC2914a.g(sb, this.f9318z, ");"), this.f9297a.D());
        if (this.f9305k != null) {
            if (this.f9297a.p() >= 0) {
                a(this.f9305k, this.f9297a.p(), new J2(this, 7));
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
        ProgressBar progressBar2 = this.f11329U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f9297a.getAdEventTracker().b(this.f9303i, arrayList);
        t();
        this.f11341h0 = true;
    }

    public void Y() {
        this.f11345l0 = SystemClock.elapsedRealtime() - this.f11346m0;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", Q7.n0.k(new StringBuilder("Attempting to skip video with skip time: "), this.f11345l0, "ms"));
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
        MediaPlayer mediaPlayer = this.f11322M;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f9 = this.f11338d0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f9, f9);
            boolean z8 = !this.f11338d0;
            this.f11338d0 = z8;
            e(z8);
            a(this.f11338d0, 0L);
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.f11335a0.a();
        this.f11336b0.a();
        this.f11333Y.removeCallbacksAndMessages(null);
        this.f11334Z.removeCallbacksAndMessages(null);
        q();
        super.f();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.n9
    public void i() {
        super.i();
        V();
    }

    @Override // com.applovin.impl.n9
    public void j() {
        super.j();
        this.f11321L.a(this.f11327S);
        this.f11321L.a((View) this.f11324P);
        if (!l() || this.f11341h0) {
            V();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f9297a.getAdIdNumber() && this.f11337c0) {
                int i9 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i9 < 200 || i9 >= 300) && !this.f11342i0 && !this.f11323N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i9 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a(E(), this.f11337c0, H(), this.f11345l0);
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.b.a(oj.f9783i6)).booleanValue()) {
                ur.b(this.f11327S);
                this.f11327S = null;
            }
            if (this.f11337c0) {
                AppLovinCommunicator.getInstance(this.f9299d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f11323N;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f11323N.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f11322M;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.v();
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f11340g0 = this.f11323N.getCurrentPosition();
        this.f11323N.pause();
        this.f11335a0.c();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f11340g0 + "ms");
        }
    }

    public /* synthetic */ void J() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.b();
        }
    }

    public /* synthetic */ void K() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.a();
            C0730o c0730o2 = this.O;
            Objects.requireNonNull(c0730o2);
            a(new F0(c0730o2, 17), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    public /* synthetic */ void L() {
        this.f11345l0 = -1L;
        this.f11346m0 = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void M() {
        a(250L);
    }

    public /* synthetic */ void N() {
        C0730o c0730o = this.O;
        if (c0730o != null) {
            c0730o.a();
        }
    }

    public /* synthetic */ void b(boolean z8, long j7) {
        if (z8) {
            ar.a(this.f11327S, j7, (Runnable) null);
        } else {
            ar.b(this.f11327S, j7, null);
        }
    }

    private void e(boolean z8) {
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9299d.getDrawable(z8 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f11326R.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f11326R.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f11326R, z8 ? this.f9297a.L() : this.f9297a.e0(), this.b);
    }

    public int E() {
        long currentPosition = this.f11323N.getCurrentPosition();
        if (this.f11342i0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f11339e0)) * 100.0f);
        }
        return this.f0;
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
        AppLovinSdkUtils.runOnUiThread(new J2(this, 2));
    }

    public boolean H() {
        return this.f9297a.W0() ? this.f9294I : I();
    }

    public boolean I() {
        return E() >= this.f9297a.m0();
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z8) {
        super.c(z8);
        if (z8) {
            a(0L);
            if (this.f11341h0) {
                this.f11336b0.b();
                return;
            }
            return;
        }
        if (this.f11341h0) {
            this.f11336b0.c();
        } else {
            z();
        }
    }

    public void d(String str) {
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9298c;
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Encountered media error: ", str, " for ad: ");
            n2.append(this.f9297a);
            tVar.b("AppLovinFullscreenActivity", n2.toString());
        }
        if (this.f11343j0.compareAndSet(false, true)) {
            if (zp.a(oj.f9786j1, this.b)) {
                this.b.D().d(this.f9297a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f9289D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.b.B().a(this.f9297a instanceof bq ? "handleVastVideoError" : "handleVideoError", str, this.f9297a);
            f();
        }
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
        P();
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    private void f(boolean z8) {
        this.f0 = E();
        if (z8) {
            this.f11323N.pause();
        } else {
            this.f11323N.stopPlayback();
        }
    }

    public void c(long j7) {
        this.f11339e0 = j7;
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
        if (this.f11327S == null || j7 < 0 || !StringUtils.isValidString(str) || !((Boolean) this.b.a(oj.f9665R2)).booleanValue()) {
            return;
        }
        a(new F(29, this, str), j7);
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
        String str;
        this.f11321L.a(this.f11326R, this.f11324P, this.f11327S, this.O, this.f11328T, this.f11325Q, this.f11323N, this.f9303i, this.f9304j, this.f11330V, viewGroup);
        if (x3.i() && (str = (String) Q7.n0.d(this.b, "audio_focus_request")) != null) {
            this.f11323N.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (!zp.a(oj.f9810n1, this.b)) {
            b(!this.f11337c0);
        }
        this.f11323N.setVideoURI(this.f9297a.s0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f9297a.Z0()) {
            this.f9291F.b(this.f9297a, new J2(this, 3));
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null) {
            kVar.b();
        }
        this.f11323N.start();
        if (this.f11337c0) {
            W();
        }
        this.f9303i.renderAd(this.f9297a);
        if (this.f11324P != null) {
            this.b.l0().a(new kn(this.b, "scheduleSkipButton", new J2(this, 4)), sm.b.TIMEOUT, this.f9297a.l0(), true);
        }
        super.d(this.f11338d0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j7) {
        a(new J2(this, 1), j7);
    }
}
