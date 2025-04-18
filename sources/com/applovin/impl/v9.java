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
import com.applovin.impl.rr;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v9 extends p9 implements AppLovinCommunicatorSubscriber {
    private final w9 K;
    private MediaPlayer L;
    protected final AppLovinVideoView M;
    protected final o N;
    protected final com.applovin.impl.adview.g O;
    protected h3 P;
    protected final ImageView Q;
    protected com.applovin.impl.adview.l R;
    protected final ProgressBar S;
    protected ProgressBar T;
    protected ImageView U;
    private final e V;
    private final d W;
    private final Handler X;
    private final Handler Y;
    protected final v4 Z;

    /* renamed from: a0 */
    protected final v4 f27490a0;

    /* renamed from: b0 */
    private final boolean f27491b0;

    /* renamed from: c0 */
    protected boolean f27492c0;

    /* renamed from: d0 */
    protected long f27493d0;

    /* renamed from: e0 */
    private int f27494e0;

    /* renamed from: f0 */
    private int f27495f0;

    /* renamed from: g0 */
    protected boolean f27496g0;

    /* renamed from: h0 */
    private boolean f27497h0;

    /* renamed from: i0 */
    private final AtomicBoolean f27498i0;

    /* renamed from: j0 */
    private final AtomicBoolean f27499j0;

    /* renamed from: k0 */
    private long f27500k0;

    /* renamed from: l0 */
    private long f27501l0;

    /* loaded from: classes.dex */
    public class a implements v4.b {

        /* renamed from: a */
        final /* synthetic */ int f27502a;

        public a(int i2) {
            this.f27502a = i2;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            if (v9.this.P != null) {
                long seconds = this.f27502a - TimeUnit.MILLISECONDS.toSeconds(r0.M.getCurrentPosition());
                if (seconds <= 0) {
                    v9.this.f25994u = true;
                } else if (v9.this.P()) {
                    v9.this.P.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return v9.this.P();
        }
    }

    /* loaded from: classes.dex */
    public class b implements v4.b {

        /* renamed from: a */
        final /* synthetic */ Integer f27504a;

        public b(Integer num) {
            this.f27504a = num;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            v9 v9Var = v9.this;
            if (v9Var.f27496g0) {
                v9Var.S.setVisibility(8);
            } else {
                v9.this.S.setProgress((int) ((v9Var.M.getCurrentPosition() / ((float) v9.this.f27493d0)) * this.f27504a.intValue()));
            }
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return !v9.this.f27496g0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements v4.b {

        /* renamed from: a */
        final /* synthetic */ long f27506a;

        /* renamed from: b */
        final /* synthetic */ Integer f27507b;

        /* renamed from: c */
        final /* synthetic */ Long f27508c;

        public c(long j2, Integer num, Long l2) {
            this.f27506a = j2;
            this.f27507b = num;
            this.f27508c = l2;
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            v9.this.T.setProgress((int) ((((float) v9.this.f25990q) / ((float) this.f27506a)) * this.f27507b.intValue()));
            v9 v9Var = v9.this;
            v9Var.f25990q = this.f27508c.longValue() + v9Var.f25990q;
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return v9.this.f25990q < this.f27506a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements rr.a {
        private d() {
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            v9.this.f();
        }

        @Override // com.applovin.impl.rr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            v9.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.rr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            v9.this.H = true;
        }

        @Override // com.applovin.impl.rr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            v9.this.U();
        }

        public /* synthetic */ d(v9 v9Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            v9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.rr.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            tp.b(uri, v9.this.f25982i.getController().i(), v9.this.f25977b);
        }

        @Override // com.applovin.impl.rr.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            tp.a(uri, v9.this.f25982i.getController(), v9.this.f25977b);
        }
    }

    /* loaded from: classes.dex */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            v9.this.a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/v9$e;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f30048a, mediaPlayer);
            safedk_v9$e_onCompletion_fcfad168ca5da533af3e6e4aa6447615(mediaPlayer);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            v9.this.d(android.support.v4.media.d.l("Video view error (", i2, ",", i3, ")"));
            AppLovinVideoBridge.VideoViewPlay(v9.this.M);
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.l("MediaPlayer Info: (", i2, ", ", i3, ")"));
            }
            if (i2 == 701) {
                v9.this.S();
                return false;
            }
            if (i2 != 3) {
                if (i2 != 702) {
                    return false;
                }
                v9.this.C();
                return false;
            }
            v9.this.Z.b();
            v9 v9Var = v9.this;
            if (v9Var.O != null) {
                v9Var.O();
            }
            v9.this.C();
            if (!v9.this.E.b()) {
                return false;
            }
            v9.this.x();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            v9.this.L = mediaPlayer;
            mediaPlayer.setOnInfoListener(v9.this.V);
            mediaPlayer.setOnErrorListener(v9.this.V);
            float f2 = !v9.this.f27492c0 ? 1 : 0;
            mediaPlayer.setVolume(f2, f2);
            v9.this.f25993t = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            v9.this.c(mediaPlayer.getDuration());
            v9.this.N();
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + v9.this.L);
            }
        }

        public void safedk_v9$e_onCompletion_fcfad168ca5da533af3e6e4aa6447615(MediaPlayer p02) {
            com.applovin.impl.sdk.n nVar = v9.this.f25978c;
            if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.a("AppLovinFullscreenActivity", "Video completed");
            }
            v9.this.f27497h0 = true;
            v9 v9Var = v9.this;
            if (!v9Var.f25992s) {
                v9Var.T();
            } else if (v9Var.k()) {
                v9.this.R();
            }
        }

        public /* synthetic */ e(v9 v9Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v9 v9Var = v9.this;
            if (view == v9Var.O) {
                v9Var.U();
                return;
            }
            if (view == v9Var.Q) {
                v9Var.V();
            } else if (com.applovin.impl.sdk.n.a()) {
                v9.this.f25978c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(v9 v9Var, a aVar) {
            this();
        }
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new w9(this.f25976a, this.d, this.f25977b);
        this.U = null;
        e eVar = new e(this, null);
        this.V = eVar;
        d dVar = new d(this, null);
        this.W = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.X = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Y = handler2;
        v4 v4Var = new v4(handler, this.f25977b);
        this.Z = v4Var;
        this.f27490a0 = new v4(handler2, this.f25977b);
        boolean I0 = this.f25976a.I0();
        this.f27491b0 = I0;
        this.f27492c0 = yp.e(this.f25977b);
        this.f27495f0 = -1;
        this.f27498i0 = new AtomicBoolean();
        this.f27499j0 = new AtomicBoolean();
        this.f27500k0 = -2L;
        this.f27501l0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.M = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(jVar, sj.D0, activity, eVar));
        bVar.d().putString("video_view_address", zq.a(appLovinVideoView));
        f fVar = new f(this, null);
        if (bVar.l0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.c0(), activity);
            this.O = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.O = null;
        }
        if (a(this.f27492c0, jVar)) {
            ImageView imageView = new ImageView(activity);
            this.Q = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            d(this.f27492c0);
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
        if (!bVar.s0()) {
            this.S = null;
            return;
        }
        Long l2 = (Long) jVar.a(sj.H2);
        Integer num = (Integer) jVar.a(sj.I2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.S = progressBar;
        a(progressBar, bVar.r0(), num.intValue());
        v4Var.a("PROGRESS_BAR", l2.longValue(), new b(num));
    }

    public /* synthetic */ void K() {
        this.f25989p = SystemClock.elapsedRealtime();
    }

    private void L() {
        com.applovin.impl.adview.l lVar;
        qq j02 = this.f25976a.j0();
        if (j02 == null || !j02.j() || this.f27496g0 || (lVar = this.R) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.sdk.c0(this, lVar.getVisibility() == 4, j02.h(), 2));
    }

    public void M() {
        if (this.f27496g0) {
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
        if (this.f27495f0 < 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f27495f0 + "ms for MediaPlayer: " + this.L);
        }
        this.M.seekTo(this.f27495f0);
        AppLovinVideoBridge.VideoViewPlay(this.M);
        this.Z.b();
        this.f27495f0 = -1;
        a(new hw(this, 1), 250L);
    }

    public void O() {
        if (this.f27499j0.compareAndSet(false, true)) {
            a(this.O, this.f25976a.l0(), new hw(this, 7));
        }
    }

    public void R() {
        this.K.a(this.f25985l);
        this.f25989p = SystemClock.elapsedRealtime();
    }

    private void e(boolean z2) {
        this.f27494e0 = A();
        if (z2) {
            this.M.pause();
        } else {
            AppLovinVideoBridge.VideoViewStop(this.M);
        }
    }

    public void N() {
        long V;
        long millis;
        if (this.f25976a.U() >= 0 || this.f25976a.V() >= 0) {
            if (this.f25976a.U() >= 0) {
                V = this.f25976a.U();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f25976a;
                long j2 = this.f27493d0;
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

    public boolean P() {
        return (this.f25994u || this.f27496g0 || !this.M.isPlaying()) ? false : true;
    }

    public boolean Q() {
        return k() && !D();
    }

    public void S() {
        AppLovinSdkUtils.runOnUiThread(new hw(this, 0));
    }

    public void T() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        e(this.f25976a.h1());
        long T = this.f25976a.T();
        if (T > 0) {
            this.f25990q = 0L;
            Long l2 = (Long) this.f25977b.a(sj.Q2);
            Integer num = (Integer) this.f25977b.a(sj.T2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.T = progressBar;
            a(progressBar, this.f25976a.S(), num.intValue());
            this.f27490a0.a("POSTITIAL_PROGRESS_BAR", l2.longValue(), new c(T, num, l2));
            this.f27490a0.b();
        }
        this.K.a(this.f25984k, this.f25983j, this.f25982i, this.T);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(this.x);
        sb.append(",");
        a(androidx.compose.foundation.text.input.a.n(sb, this.f25996y, ");"), this.f25976a.C());
        if (this.f25984k != null) {
            if (this.f25976a.o() >= 0) {
                a(this.f25984k, this.f25976a.o(), new hw(this, 2));
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
        this.f27496g0 = true;
    }

    public void U() {
        this.f27500k0 = SystemClock.elapsedRealtime() - this.f27501l0;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", android.support.v4.media.d.p(new StringBuilder("Attempting to skip video with skip time: "), this.f27500k0, "ms"));
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
        MediaPlayer mediaPlayer = this.L;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = this.f27492c0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            boolean z2 = !this.f27492c0;
            this.f27492c0 = z2;
            d(z2);
            a(this.f27492c0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void c(long j2) {
        this.f27493d0 = j2;
    }

    @Override // com.applovin.impl.p9
    public void f() {
        this.Z.a();
        this.f27490a0.a();
        this.X.removeCallbacksAndMessages(null);
        this.Y.removeCallbacksAndMessages(null);
        o();
        super.f();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
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
        if (!k() || this.f27496g0) {
            R();
        }
    }

    @Override // com.applovin.impl.p9
    public void o() {
        super.a(A(), this.f27491b0, D(), this.f27500k0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong(CreativeInfo.f29617c) == this.f25976a.getAdIdNumber() && this.f27491b0) {
                int i2 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i2 >= 200 && i2 < 300) || this.f27497h0 || this.M.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i2 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.p9
    public void t() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f25977b.a(sj.n6)).booleanValue()) {
                tr.d(this.R);
                this.R = null;
            }
            if (this.f27491b0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.M;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                AppLovinVideoBridge.VideoViewStop(this.M);
            }
            MediaPlayer mediaPlayer = this.L;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.t();
    }

    @Override // com.applovin.impl.p9
    public void x() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f27495f0 = this.M.getCurrentPosition();
        this.M.pause();
        this.Z.c();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f27495f0 + "ms");
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
        o oVar = this.N;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.N;
            Objects.requireNonNull(oVar2);
            a(new mt(oVar2, 17), 2000L);
        }
    }

    public /* synthetic */ void H() {
        this.f27500k0 = -1L;
        this.f27501l0 = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ void I() {
        a(250L);
    }

    public /* synthetic */ void J() {
        o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }

    public /* synthetic */ void b(boolean z2, long j2) {
        if (z2) {
            zq.a(this.R, j2, (Runnable) null);
        } else {
            zq.b(this.R, j2, null);
        }
    }

    public int A() {
        long currentPosition = this.M.getCurrentPosition();
        if (this.f27497h0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f27493d0)) * 100.0f) : this.f27494e0;
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
        AppLovinSdkUtils.runOnUiThread(new hw(this, 3));
    }

    public boolean D() {
        if (this.H && this.f25976a.a1()) {
            return true;
        }
        return E();
    }

    public boolean E() {
        return A() >= this.f25976a.n0();
    }

    public void d(String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f25978c;
            StringBuilder v2 = android.support.v4.media.d.v("Encountered media error: ", str, " for ad: ");
            v2.append(this.f25976a);
            nVar.b("AppLovinFullscreenActivity", v2.toString());
        }
        if (this.f27498i0.compareAndSet(false, true)) {
            if (yp.a(sj.f26925i1, this.f25977b)) {
                this.f25977b.B().d(this.f25976a, com.applovin.impl.sdk.j.l());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.C;
            if (appLovinAdDisplayListener instanceof qb) {
                ((qb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.f25977b.E().a(this.f25976a instanceof aq ? "handleVastVideoError" : "handleVideoError", str, this.f25976a);
            f();
        }
    }

    @Override // com.applovin.impl.kb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
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
        L();
    }

    @Override // com.applovin.impl.p9
    public void b(boolean z2) {
        super.b(z2);
        if (z2) {
            a(0L);
            if (this.f27496g0) {
                this.f27490a0.b();
                return;
            }
            return;
        }
        if (this.f27496g0) {
            this.f27490a0.c();
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
        a(new ms(29, this, str), j2);
    }

    private void d(boolean z2) {
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

    private void a(ProgressBar progressBar, int i2, int i3) {
        progressBar.setMax(i3);
        progressBar.setPadding(0, 0, 0, 0);
        if (z3.f()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // com.applovin.impl.p9
    public void a(ViewGroup viewGroup) {
        String str;
        this.K.a(this.Q, this.O, this.R, this.N, this.S, this.P, this.M, this.f25982i, this.f25983j, this.U, viewGroup);
        if (z3.i() && (str = this.f25977b.g0().getExtraParameters().get("audio_focus_request")) != null) {
            this.M.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.f27491b0);
        AppLovinVideoBridge.VideoViewSetVideoUri(this.M, this.f25976a.t0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f25976a.d1()) {
            this.E.b(this.f25976a, new hw(this, 4));
        }
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null) {
            kVar.b();
        }
        AppLovinVideoBridge.VideoViewPlay(this.M);
        if (this.f27491b0) {
            S();
        }
        SpecialsBridge.appLovinAdViewRenderAd(this.f25982i, this.f25976a);
        if (this.O != null) {
            this.f25977b.j0().a(new jn(this.f25977b, "scheduleSkipButton", new hw(this, 5)), tm.b.TIMEOUT, this.f25976a.m0(), true);
        }
        super.c(this.f27492c0);
    }

    @Override // com.applovin.impl.p9
    public void a(long j2) {
        a(new hw(this, 6), j2);
    }
}
