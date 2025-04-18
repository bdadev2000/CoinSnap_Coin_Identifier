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

/* loaded from: classes.dex */
public class t9 extends n9 implements AppLovinCommunicatorSubscriber {
    private final u9 L;
    private MediaPlayer M;
    protected final AppLovinVideoView N;
    protected final o O;
    protected final com.applovin.impl.adview.g P;
    protected f3 Q;
    protected final ImageView R;
    protected com.applovin.impl.adview.l S;
    protected final ProgressBar T;
    protected ProgressBar U;
    protected ImageView V;
    private final e W;
    private final d X;
    private final Handler Y;
    private final Handler Z;

    /* renamed from: a0 */
    protected final t4 f8169a0;

    /* renamed from: b0 */
    protected final t4 f8170b0;

    /* renamed from: c0 */
    private final boolean f8171c0;

    /* renamed from: d0 */
    protected boolean f8172d0;

    /* renamed from: e0 */
    protected long f8173e0;

    /* renamed from: f0 */
    private int f8174f0;

    /* renamed from: g0 */
    private int f8175g0;

    /* renamed from: h0 */
    protected boolean f8176h0;

    /* renamed from: i0 */
    private boolean f8177i0;

    /* renamed from: j0 */
    private final AtomicBoolean f8178j0;

    /* renamed from: k0 */
    private final AtomicBoolean f8179k0;

    /* renamed from: l0 */
    private long f8180l0;

    /* renamed from: m0 */
    private long f8181m0;

    /* loaded from: classes.dex */
    public class a implements t4.b {
        final /* synthetic */ int a;

        public a(int i10) {
            this.a = i10;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            if (t9.this.Q != null) {
                long seconds = this.a - TimeUnit.MILLISECONDS.toSeconds(r0.N.getCurrentPosition());
                if (seconds <= 0) {
                    t9.this.f6382v = true;
                } else if (t9.this.T()) {
                    t9.this.Q.setProgress((int) seconds);
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
        final /* synthetic */ Integer a;

        public b(Integer num) {
            this.a = num;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9 t9Var = t9.this;
            if (t9Var.f8176h0) {
                t9Var.T.setVisibility(8);
            } else {
                t9.this.T.setProgress((int) ((t9Var.N.getCurrentPosition() / ((float) t9.this.f8173e0)) * this.a.intValue()));
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !t9.this.f8176h0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements t4.b {
        final /* synthetic */ long a;

        /* renamed from: b */
        final /* synthetic */ Integer f8184b;

        /* renamed from: c */
        final /* synthetic */ Long f8185c;

        public c(long j3, Integer num, Long l10) {
            this.a = j3;
            this.f8184b = num;
            this.f8185c = l10;
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            t9.this.U.setProgress((int) ((((float) t9.this.f6379r) / ((float) this.a)) * this.f8184b.intValue()));
            t9 t9Var = t9.this;
            t9Var.f6379r = this.f8185c.longValue() + t9Var.f6379r;
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return t9.this.f6379r < this.a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements sr.a {
        private d() {
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            t9.this.f();
        }

        @Override // com.applovin.impl.sr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.sr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            t9.this.I = true;
        }

        @Override // com.applovin.impl.sr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            t9.this.Y();
        }

        public /* synthetic */ d(t9 t9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.sr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            t9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.sr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            up.b(uri, t9.this.f6370i.getController().i(), t9.this.f6364b);
        }

        @Override // com.applovin.impl.sr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            up.a(uri, t9.this.f6370i.getController(), t9.this.f6364b);
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
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "Video completed");
            }
            t9.this.f8177i0 = true;
            t9 t9Var = t9.this;
            if (!t9Var.f6381t) {
                t9Var.X();
            } else if (t9Var.l()) {
                t9.this.V();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            t9.this.d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Video view error (", i10, ",", i11, ")"));
            t9.this.N.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("MediaPlayer Info: (", i10, ", ", i11, ")"));
            }
            if (i10 == 701) {
                t9.this.W();
                return false;
            }
            if (i10 == 3) {
                t9.this.f8169a0.b();
                t9 t9Var = t9.this;
                if (t9Var.P != null) {
                    t9Var.S();
                }
                t9.this.G();
                if (t9.this.F.b()) {
                    t9.this.z();
                    return false;
                }
                return false;
            }
            if (i10 == 702) {
                t9.this.G();
                return false;
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            t9.this.M = mediaPlayer;
            mediaPlayer.setOnInfoListener(t9.this.W);
            mediaPlayer.setOnErrorListener(t9.this.W);
            float f10 = !t9.this.f8172d0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            t9.this.u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            t9.this.c(mediaPlayer.getDuration());
            t9.this.R();
            com.applovin.impl.sdk.t tVar = t9.this.f6365c;
            if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + t9.this.M);
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
            if (view == t9Var.P) {
                t9Var.Y();
                return;
            }
            if (view == t9Var.R) {
                t9Var.Z();
            } else if (com.applovin.impl.sdk.t.a()) {
                t9.this.f6365c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(t9 t9Var, a aVar) {
            this();
        }
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.L = new u9(this.a, this.f6366d, this.f6364b);
        this.V = null;
        e eVar = new e(this, null);
        this.W = eVar;
        d dVar = new d(this, null);
        this.X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Z = handler2;
        t4 t4Var = new t4(handler, this.f6364b);
        this.f8169a0 = t4Var;
        this.f8170b0 = new t4(handler2, this.f6364b);
        boolean G0 = this.a.G0();
        this.f8171c0 = G0;
        this.f8172d0 = zp.e(this.f6364b);
        this.f8175g0 = -1;
        this.f8178j0 = new AtomicBoolean();
        this.f8179k0 = new AtomicBoolean();
        this.f8180l0 = -2L;
        this.f8181m0 = 0L;
        if (bVar.hasVideoUrl()) {
            if (zp.a(oj.f6713n1, kVar)) {
                a(!G0);
            }
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.N = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.A0, activity, eVar));
            bVar.e().putString("video_view_address", ar.a(appLovinVideoView));
            f fVar = new f(this, null);
            if (bVar.k0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.b0(), activity);
                this.P = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.P = null;
            }
            if (a(this.f8172d0, kVar)) {
                ImageView imageView = new ImageView(activity);
                this.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                e(this.f8172d0);
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
                return;
            }
            this.T = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    public /* synthetic */ void O() {
        this.f6378q = SystemClock.elapsedRealtime();
    }

    private void P() {
        com.applovin.impl.adview.l lVar;
        boolean z10;
        rq i02 = this.a.i0();
        if (i02 != null && i02.j() && !this.f8176h0 && (lVar = this.S) != null) {
            if (lVar.getVisibility() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            AppLovinSdkUtils.runOnUiThread(new rv(this, z10, i02.h(), 2));
        }
    }

    public void Q() {
        if (this.f8176h0) {
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
        if (this.f8175g0 >= 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f8175g0 + "ms for MediaPlayer: " + this.M);
            }
            this.N.seekTo(this.f8175g0);
            this.N.start();
            this.f8169a0.b();
            this.f8175g0 = -1;
            a(new tv(this, 6), 250L);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    public void S() {
        int i10 = 0;
        if (this.f8179k0.compareAndSet(false, true)) {
            a(this.P, this.a.k0(), new tv(this, i10));
        }
    }

    public void V() {
        this.L.a(this.f6373l);
        this.f6378q = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void e(String str) {
        ur.a(this.S, str, "AppLovinFullscreenActivity", this.f6364b);
    }

    @Override // com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    public void R() {
        long V;
        long millis;
        long j3 = 0;
        if (this.a.U() >= 0 || this.a.V() >= 0) {
            if (this.a.U() >= 0) {
                V = this.a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.a;
                long j10 = this.f8173e0;
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

    public boolean T() {
        return (this.f6382v || this.f8176h0 || !this.N.isPlaying()) ? false : true;
    }

    public boolean U() {
        return l() && !H();
    }

    public void W() {
        AppLovinSdkUtils.runOnUiThread(new tv(this, 3));
    }

    public void X() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.a.c1());
        long T = this.a.T();
        if (T > 0) {
            this.f6379r = 0L;
            Long l10 = (Long) this.f6364b.a(oj.L2);
            Integer num = (Integer) this.f6364b.a(oj.O2);
            ProgressBar progressBar = new ProgressBar(this.f6366d, null, R.attr.progressBarStyleHorizontal);
            this.U = progressBar;
            a(progressBar, this.a.S(), num.intValue());
            this.f8170b0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new c(T, num, l10));
            this.f8170b0.b();
        }
        this.L.a(this.f6372k, this.f6371j, this.f6370i, this.U);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(this.f6385y);
        sb2.append(",");
        a(vd.e.g(sb2, this.f6386z, ");"), this.a.D());
        if (this.f6372k != null) {
            if (this.a.p() >= 0) {
                a(this.f6372k, this.a.p(), new tv(this, 4));
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
        this.f8176h0 = true;
    }

    public void Y() {
        this.f8180l0 = SystemClock.elapsedRealtime() - this.f8181m0;
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", a4.j.j(new StringBuilder("Attempting to skip video with skip time: "), this.f8180l0, "ms"));
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
        MediaPlayer mediaPlayer = this.M;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f8172d0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f8172d0;
            this.f8172d0 = z10;
            e(z10);
            a(this.f8172d0, 0L);
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.impl.n9
    public void f() {
        this.f8169a0.a();
        this.f8170b0.a();
        this.Y.removeCallbacksAndMessages(null);
        this.Z.removeCallbacksAndMessages(null);
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
        this.L.a(this.S);
        this.L.a((View) this.P);
        if (!l() || this.f8176h0) {
            V();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.a.getAdIdNumber() && this.f8171c0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i10 < 200 || i10 >= 300) && !this.f8177i0 && !this.N.isPlaying()) {
                    d("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.n9
    public void q() {
        super.a(E(), this.f8171c0, H(), this.f8180l0);
    }

    @Override // com.applovin.impl.n9
    public void v() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f6364b.a(oj.f6679i6)).booleanValue()) {
                ur.b(this.S);
                this.S = null;
            }
            if (this.f8171c0) {
                AppLovinCommunicator.getInstance(this.f6366d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.N;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.N.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.M;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th2);
        }
        super.v();
    }

    @Override // com.applovin.impl.n9
    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f8175g0 = this.N.getCurrentPosition();
        this.N.pause();
        this.f8169a0.c();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f8175g0 + "ms");
        }
    }

    public /* synthetic */ void J() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.b();
        }
    }

    public /* synthetic */ void K() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.O;
            Objects.requireNonNull(oVar2);
            a(new nt(oVar2, 17), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    public /* synthetic */ void L() {
        this.f8180l0 = -1L;
        this.f8181m0 = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void M() {
        a(250L);
    }

    public /* synthetic */ void N() {
        o oVar = this.O;
        if (oVar != null) {
            oVar.a();
        }
    }

    public /* synthetic */ void b(boolean z10, long j3) {
        if (z10) {
            ar.a(this.S, j3, (Runnable) null);
        } else {
            ar.b(this.S, j3, null);
        }
    }

    private void e(boolean z10) {
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

    public int E() {
        long currentPosition = this.N.getCurrentPosition();
        if (this.f8177i0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((((float) currentPosition) / ((float) this.f8173e0)) * 100.0f);
        }
        return this.f8174f0;
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
        AppLovinSdkUtils.runOnUiThread(new tv(this, 7));
    }

    public boolean H() {
        return this.a.W0() ? this.I : I();
    }

    public boolean I() {
        return E() >= this.a.m0();
    }

    @Override // com.applovin.impl.n9
    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0L);
            if (this.f8176h0) {
                this.f8170b0.b();
                return;
            }
            return;
        }
        if (this.f8176h0) {
            this.f8170b0.c();
        } else {
            z();
        }
    }

    public void d(String str) {
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f6365c;
            StringBuilder o10 = a4.j.o("Encountered media error: ", str, " for ad: ");
            o10.append(this.a);
            tVar.b("AppLovinFullscreenActivity", o10.toString());
        }
        if (this.f8178j0.compareAndSet(false, true)) {
            if (zp.a(oj.f6682j1, this.f6364b)) {
                this.f6364b.D().d(this.a, com.applovin.impl.sdk.k.k());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.D;
            if (appLovinAdDisplayListener instanceof lb) {
                ((lb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f6364b.B().a(this.a instanceof bq ? "handleVastVideoError" : "handleVideoError", str, this.a);
            f();
        }
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
        P();
    }

    @Override // com.applovin.impl.gb.a
    public void b() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        F();
    }

    private void f(boolean z10) {
        this.f8174f0 = E();
        if (z10) {
            this.N.pause();
        } else {
            this.N.stopPlayback();
        }
    }

    public void c(long j3) {
        this.f8173e0 = j3;
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
        a(new rs(29, this, str), j3);
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
        String str;
        this.L.a(this.R, this.P, this.S, this.O, this.T, this.Q, this.N, this.f6370i, this.f6371j, this.V, viewGroup);
        if (x3.i() && (str = (String) a4.j.b(this.f6364b, "audio_focus_request")) != null) {
            this.N.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        int i10 = 1;
        if (!zp.a(oj.f6713n1, this.f6364b)) {
            b(!this.f8171c0);
        }
        this.N.setVideoURI(this.a.s0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.a.Z0()) {
            this.F.b(this.a, new tv(this, i10));
        }
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null) {
            kVar.b();
        }
        this.N.start();
        if (this.f8171c0) {
            W();
        }
        this.f6370i.renderAd(this.a);
        if (this.P != null) {
            this.f6364b.l0().a(new kn(this.f6364b, "scheduleSkipButton", new tv(this, 2)), sm.b.TIMEOUT, this.a.l0(), true);
        }
        super.d(this.f8172d0);
    }

    @Override // com.applovin.impl.n9
    public void a(long j3) {
        a(new tv(this, 5), j3);
    }
}
