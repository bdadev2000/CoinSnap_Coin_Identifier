package com.applovin.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.c6;
import com.applovin.impl.fl;
import com.applovin.impl.l1;
import com.applovin.impl.n1;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.ok;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zj extends c2 {
    private int A;
    private int B;
    private l5 C;
    private l5 D;
    private int E;
    private k1 F;
    private float G;
    private boolean H;
    private List I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private p6 N;
    private yq O;

    /* renamed from: b, reason: collision with root package name */
    protected final li[] f9416b;

    /* renamed from: c, reason: collision with root package name */
    private final a4 f9417c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9418d;

    /* renamed from: e, reason: collision with root package name */
    private final a8 f9419e;

    /* renamed from: f, reason: collision with root package name */
    private final c f9420f;

    /* renamed from: g, reason: collision with root package name */
    private final d f9421g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f9422h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f9423i;

    /* renamed from: j, reason: collision with root package name */
    private final l1 f9424j;

    /* renamed from: k, reason: collision with root package name */
    private final n1 f9425k;

    /* renamed from: l, reason: collision with root package name */
    private final fl f9426l;

    /* renamed from: m, reason: collision with root package name */
    private final hr f9427m;

    /* renamed from: n, reason: collision with root package name */
    private final ds f9428n;

    /* renamed from: o, reason: collision with root package name */
    private final long f9429o;

    /* renamed from: p, reason: collision with root package name */
    private d9 f9430p;

    /* renamed from: q, reason: collision with root package name */
    private d9 f9431q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f9432r;

    /* renamed from: s, reason: collision with root package name */
    private Object f9433s;

    /* renamed from: t, reason: collision with root package name */
    private Surface f9434t;
    private SurfaceHolder u;

    /* renamed from: v, reason: collision with root package name */
    private ok f9435v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f9436w;

    /* renamed from: x, reason: collision with root package name */
    private TextureView f9437x;

    /* renamed from: y, reason: collision with root package name */
    private int f9438y;

    /* renamed from: z, reason: collision with root package name */
    private int f9439z;

    /* loaded from: classes.dex */
    public static final class b {
        private final Context a;

        /* renamed from: b, reason: collision with root package name */
        private final oi f9440b;

        /* renamed from: c, reason: collision with root package name */
        private j3 f9441c;

        /* renamed from: d, reason: collision with root package name */
        private long f9442d;

        /* renamed from: e, reason: collision with root package name */
        private wo f9443e;

        /* renamed from: f, reason: collision with root package name */
        private yd f9444f;

        /* renamed from: g, reason: collision with root package name */
        private gc f9445g;

        /* renamed from: h, reason: collision with root package name */
        private x1 f9446h;

        /* renamed from: i, reason: collision with root package name */
        private r0 f9447i;

        /* renamed from: j, reason: collision with root package name */
        private Looper f9448j;

        /* renamed from: k, reason: collision with root package name */
        private k1 f9449k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f9450l;

        /* renamed from: m, reason: collision with root package name */
        private int f9451m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f9452n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9453o;

        /* renamed from: p, reason: collision with root package name */
        private int f9454p;

        /* renamed from: q, reason: collision with root package name */
        private int f9455q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f9456r;

        /* renamed from: s, reason: collision with root package name */
        private fj f9457s;

        /* renamed from: t, reason: collision with root package name */
        private long f9458t;
        private long u;

        /* renamed from: v, reason: collision with root package name */
        private fc f9459v;

        /* renamed from: w, reason: collision with root package name */
        private long f9460w;

        /* renamed from: x, reason: collision with root package name */
        private long f9461x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f9462y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f9463z;

        public b(Context context) {
            this(context, new i6(context), new a6());
        }

        public static /* synthetic */ rh m(b bVar) {
            bVar.getClass();
            return null;
        }

        public b(Context context, oi oiVar, m8 m8Var) {
            this(context, oiVar, new k6(context), new g6(context, m8Var), new d6(), r5.a(context), new r0(j3.a));
        }

        public zj a() {
            a1.b(!this.f9463z);
            this.f9463z = true;
            return new zj(this);
        }

        public b(Context context, oi oiVar, wo woVar, yd ydVar, gc gcVar, x1 x1Var, r0 r0Var) {
            this.a = context;
            this.f9440b = oiVar;
            this.f9443e = woVar;
            this.f9444f = ydVar;
            this.f9445g = gcVar;
            this.f9446h = x1Var;
            this.f9447i = r0Var;
            this.f9448j = yp.d();
            this.f9449k = k1.f5582g;
            this.f9451m = 0;
            this.f9454p = 1;
            this.f9455q = 0;
            this.f9456r = true;
            this.f9457s = fj.f4759g;
            this.f9458t = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
            this.u = 15000L;
            this.f9459v = new c6.b().a();
            this.f9441c = j3.a;
            this.f9460w = 500L;
            this.f9461x = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements xq, p1, bo, af, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ok.b, n1.b, l1.b, fl.b, nh.c, z7 {
        private c() {
        }

        @Override // com.applovin.impl.p1
        public void a(String str, long j3, long j10) {
            zj.this.f9423i.a(str, j3, j10);
        }

        @Override // com.applovin.impl.p1
        public void b(String str) {
            zj.this.f9423i.b(str);
        }

        @Override // com.applovin.impl.l1.b
        public void c() {
            zj.this.a(false, -1, 3);
        }

        @Override // com.applovin.impl.fl.b
        public void d(int i10) {
            p6 b3 = zj.b(zj.this.f9426l);
            if (b3.equals(zj.this.N)) {
                return;
            }
            zj.this.N = b3;
            Iterator it = zj.this.f9422h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(b3);
            }
        }

        @Override // com.applovin.impl.n1.b
        public void f(int i10) {
            boolean l10 = zj.this.l();
            zj.this.a(l10, i10, zj.b(l10, i10));
        }

        @Override // com.applovin.impl.z7
        public void g(boolean z10) {
            zj.this.Y();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            zj.this.a(surfaceTexture);
            zj.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            zj.this.a((Object) null);
            zj.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            zj.this.a(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            zj.this.a(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (zj.this.f9436w) {
                zj.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (zj.this.f9436w) {
                zj.this.a((Object) null);
            }
            zj.this.a(0, 0);
        }

        @Override // com.applovin.impl.p1
        public void a(l5 l5Var) {
            zj.this.D = l5Var;
            zj.this.f9423i.a(l5Var);
        }

        @Override // com.applovin.impl.p1
        public void b(d9 d9Var, o5 o5Var) {
            zj.this.f9431q = d9Var;
            zj.this.f9423i.b(d9Var, o5Var);
        }

        @Override // com.applovin.impl.p1
        public void c(Exception exc) {
            zj.this.f9423i.c(exc);
        }

        @Override // com.applovin.impl.p1
        public void c(l5 l5Var) {
            zj.this.f9423i.c(l5Var);
            zj.this.f9431q = null;
            zj.this.D = null;
        }

        @Override // com.applovin.impl.p1
        public void a(long j3) {
            zj.this.f9423i.a(j3);
        }

        @Override // com.applovin.impl.p1
        public void b(int i10, long j3, long j10) {
            zj.this.f9423i.b(i10, j3, j10);
        }

        @Override // com.applovin.impl.p1
        public void a(Exception exc) {
            zj.this.f9423i.a(exc);
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i10) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.bo
        public void a(List list) {
            zj.this.I = list;
            Iterator it = zj.this.f9422h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(list);
            }
        }

        @Override // com.applovin.impl.xq
        public void b(Exception exc) {
            zj.this.f9423i.b(exc);
        }

        @Override // com.applovin.impl.nh.c
        public void c(boolean z10) {
            zj.k(zj.this);
        }

        @Override // com.applovin.impl.xq
        public void d(l5 l5Var) {
            zj.this.C = l5Var;
            zj.this.f9423i.d(l5Var);
        }

        @Override // com.applovin.impl.xq
        public void b(String str, long j3, long j10) {
            zj.this.f9423i.b(str, j3, j10);
        }

        @Override // com.applovin.impl.xq
        public void b(l5 l5Var) {
            zj.this.f9423i.b(l5Var);
            zj.this.f9430p = null;
            zj.this.C = null;
        }

        @Override // com.applovin.impl.xq
        public void a(int i10, long j3) {
            zj.this.f9423i.a(i10, j3);
        }

        @Override // com.applovin.impl.af
        public void a(we weVar) {
            zj.this.f9423i.a(weVar);
            zj.this.f9419e.a(weVar);
            Iterator it = zj.this.f9422h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(weVar);
            }
        }

        @Override // com.applovin.impl.ok.b
        public void b(Surface surface) {
            zj.this.a(surface);
        }

        @Override // com.applovin.impl.n1.b
        public void b(float f10) {
            zj.this.X();
        }

        @Override // com.applovin.impl.nh.c
        public void a(boolean z10, int i10) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.xq
        public void a(Object obj, long j3) {
            zj.this.f9423i.a(obj, j3);
            if (zj.this.f9433s == obj) {
                Iterator it = zj.this.f9422h.iterator();
                while (it.hasNext()) {
                    ((nh.e) it.next()).a();
                }
            }
        }

        @Override // com.applovin.impl.p1
        public void a(boolean z10) {
            if (zj.this.H == z10) {
                return;
            }
            zj.this.H = z10;
            zj.this.U();
        }

        @Override // com.applovin.impl.fl.b
        public void a(int i10, boolean z10) {
            Iterator it = zj.this.f9422h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).b(i10, z10);
            }
        }

        @Override // com.applovin.impl.xq
        public void a(String str) {
            zj.this.f9423i.a(str);
        }

        @Override // com.applovin.impl.xq
        public void a(long j3, int i10) {
            zj.this.f9423i.a(j3, i10);
        }

        @Override // com.applovin.impl.xq
        public void a(d9 d9Var, o5 o5Var) {
            zj.this.f9430p = d9Var;
            zj.this.f9423i.a(d9Var, o5Var);
        }

        @Override // com.applovin.impl.xq
        public void a(yq yqVar) {
            zj.this.O = yqVar;
            zj.this.f9423i.a(yqVar);
            Iterator it = zj.this.f9422h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(yqVar);
            }
        }

        @Override // com.applovin.impl.ok.b
        public void a(Surface surface) {
            zj.this.a((Object) null);
        }
    }

    public zj(b bVar) {
        zj zjVar;
        c cVar;
        d dVar;
        Handler handler;
        a8 a8Var;
        k1 k1Var;
        boolean z10;
        boolean z11;
        a4 a4Var = new a4();
        this.f9417c = a4Var;
        try {
            Context applicationContext = bVar.a.getApplicationContext();
            this.f9418d = applicationContext;
            r0 r0Var = bVar.f9447i;
            this.f9423i = r0Var;
            b.m(bVar);
            this.F = bVar.f9449k;
            this.f9438y = bVar.f9454p;
            this.f9439z = bVar.f9455q;
            this.H = bVar.f9453o;
            this.f9429o = bVar.f9461x;
            cVar = new c();
            this.f9420f = cVar;
            dVar = new d();
            this.f9421g = dVar;
            this.f9422h = new CopyOnWriteArraySet();
            handler = new Handler(bVar.f9448j);
            li[] a10 = bVar.f9440b.a(handler, cVar, cVar, cVar, cVar);
            this.f9416b = a10;
            this.G = 1.0f;
            if (yp.a < 21) {
                this.E = d(0);
            } else {
                this.E = r2.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            try {
                a8Var = new a8(a10, bVar.f9443e, bVar.f9444f, bVar.f9445g, bVar.f9446h, r0Var, bVar.f9456r, bVar.f9457s, bVar.f9458t, bVar.u, bVar.f9459v, bVar.f9460w, bVar.f9462y, bVar.f9441c, bVar.f9448j, this, new nh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                zjVar = this;
            } catch (Throwable th2) {
                th = th2;
                zjVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            zjVar = this;
        }
        try {
            zjVar.f9419e = a8Var;
            a8Var.a((nh.c) cVar);
            a8Var.a((z7) cVar);
            if (bVar.f9442d > 0) {
                a8Var.c(bVar.f9442d);
            }
            l1 l1Var = new l1(bVar.a, handler, cVar);
            zjVar.f9424j = l1Var;
            l1Var.a(bVar.f9452n);
            n1 n1Var = new n1(bVar.a, handler, cVar);
            zjVar.f9425k = n1Var;
            if (bVar.f9450l) {
                k1Var = zjVar.F;
            } else {
                k1Var = null;
            }
            n1Var.b(k1Var);
            fl flVar = new fl(bVar.a, handler, cVar);
            zjVar.f9426l = flVar;
            flVar.a(yp.e(zjVar.F.f5585c));
            hr hrVar = new hr(bVar.a);
            zjVar.f9427m = hrVar;
            if (bVar.f9451m != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hrVar.a(z10);
            ds dsVar = new ds(bVar.a);
            zjVar.f9428n = dsVar;
            if (bVar.f9451m == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            dsVar.a(z11);
            zjVar.N = b(flVar);
            zjVar.O = yq.f9267f;
            zjVar.a(1, 10, Integer.valueOf(zjVar.E));
            zjVar.a(2, 10, Integer.valueOf(zjVar.E));
            zjVar.a(1, 3, zjVar.F);
            zjVar.a(2, 4, Integer.valueOf(zjVar.f9438y));
            zjVar.a(2, 5, Integer.valueOf(zjVar.f9439z));
            zjVar.a(1, 9, Boolean.valueOf(zjVar.H));
            zjVar.a(2, 7, dVar);
            zjVar.a(6, 8, dVar);
            a4Var.e();
        } catch (Throwable th4) {
            th = th4;
            zjVar.f9417c.e();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.f9423i.a(this.H);
        Iterator it = this.f9422h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(this.H);
        }
    }

    private void W() {
        if (this.f9435v != null) {
            this.f9419e.a(this.f9421g).a(10000).a((Object) null).j();
            this.f9435v.b(this.f9420f);
            this.f9435v = null;
        }
        TextureView textureView = this.f9437x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f9420f) {
                kc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f9437x.setSurfaceTextureListener(null);
            }
            this.f9437x = null;
        }
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f9420f);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        a(1, 2, Float.valueOf(this.G * this.f9425k.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int o10 = o();
        boolean z10 = true;
        if (o10 != 1) {
            if (o10 != 2 && o10 != 3) {
                if (o10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean S = S();
                hr hrVar = this.f9427m;
                if (!l() || S) {
                    z10 = false;
                }
                hrVar.b(z10);
                this.f9428n.b(l());
                return;
            }
        }
        this.f9427m.b(false);
        this.f9428n.b(false);
    }

    private void Z() {
        IllegalStateException illegalStateException;
        this.f9417c.b();
        if (Thread.currentThread() != p().getThread()) {
            String a10 = yp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p().getThread().getName());
            if (!this.J) {
                if (this.K) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                kc.c("SimpleExoPlayer", a10, illegalStateException);
                this.K = true;
                return;
            }
            throw new IllegalStateException(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public static /* synthetic */ rh k(zj zjVar) {
        zjVar.getClass();
        return null;
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        Z();
        return this.f9419e.A();
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.f9419e.C();
    }

    @Override // com.applovin.impl.nh
    public int E() {
        Z();
        return this.f9419e.E();
    }

    @Override // com.applovin.impl.nh
    public long F() {
        Z();
        return this.f9419e.F();
    }

    public void R() {
        Z();
        W();
        a((Object) null);
        a(0, 0);
    }

    public boolean S() {
        Z();
        return this.f9419e.S();
    }

    @Override // com.applovin.impl.nh
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public y7 c() {
        Z();
        return this.f9419e.c();
    }

    public void V() {
        AudioTrack audioTrack;
        Z();
        if (yp.a < 21 && (audioTrack = this.f9432r) != null) {
            audioTrack.release();
            this.f9432r = null;
        }
        this.f9424j.a(false);
        this.f9426l.c();
        this.f9427m.b(false);
        this.f9428n.b(false);
        this.f9425k.e();
        this.f9419e.W();
        this.f9423i.i();
        W();
        Surface surface = this.f9434t;
        if (surface != null) {
            surface.release();
            this.f9434t = null;
        }
        if (!this.L) {
            this.I = Collections.emptyList();
            this.M = true;
        } else {
            b8.a(a1.a((Object) null));
            throw null;
        }
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        Z();
        return this.f9419e.getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        Z();
        return this.f9419e.getDuration();
    }

    @Override // com.applovin.impl.nh
    public int m() {
        Z();
        return this.f9419e.m();
    }

    @Override // com.applovin.impl.nh
    public go n() {
        Z();
        return this.f9419e.n();
    }

    @Override // com.applovin.impl.nh
    public int o() {
        Z();
        return this.f9419e.o();
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.f9419e.p();
    }

    @Override // com.applovin.impl.nh
    public long q() {
        Z();
        return this.f9419e.q();
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        Z();
        return this.f9419e.r();
    }

    @Override // com.applovin.impl.nh
    public long s() {
        Z();
        return this.f9419e.s();
    }

    @Override // com.applovin.impl.nh
    public int t() {
        Z();
        return this.f9419e.t();
    }

    @Override // com.applovin.impl.nh
    public int v() {
        Z();
        return this.f9419e.v();
    }

    @Override // com.applovin.impl.nh
    public List x() {
        Z();
        return this.I;
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return this.O;
    }

    private int d(int i10) {
        AudioTrack audioTrack = this.f9432r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f9432r.release();
            this.f9432r = null;
        }
        if (this.f9432r == null) {
            this.f9432r = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f9432r.getAudioSessionId();
    }

    @Override // com.applovin.impl.nh
    public long e() {
        Z();
        return this.f9419e.e();
    }

    @Override // com.applovin.impl.nh
    public int f() {
        Z();
        return this.f9419e.f();
    }

    @Override // com.applovin.impl.nh
    public long g() {
        Z();
        return this.f9419e.g();
    }

    @Override // com.applovin.impl.nh
    public long h() {
        Z();
        return this.f9419e.h();
    }

    @Override // com.applovin.impl.nh
    public nh.b i() {
        Z();
        return this.f9419e.i();
    }

    @Override // com.applovin.impl.nh
    public int j() {
        Z();
        return this.f9419e.j();
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        Z();
        return this.f9419e.k();
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        Z();
        return this.f9419e.l();
    }

    public void c(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.f9436w = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f9420f);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a((Object) null);
            a(0, 0);
        }
    }

    @Override // com.applovin.impl.nh
    public void b(nh.e eVar) {
        a1.a(eVar);
        this.f9422h.add(eVar);
        a((nh.c) eVar);
    }

    /* loaded from: classes.dex */
    public static final class d implements vq, t2, oh.b {
        private vq a;

        /* renamed from: b, reason: collision with root package name */
        private t2 f9464b;

        /* renamed from: c, reason: collision with root package name */
        private vq f9465c;

        /* renamed from: d, reason: collision with root package name */
        private t2 f9466d;

        private d() {
        }

        @Override // com.applovin.impl.oh.b
        public void a(int i10, Object obj) {
            if (i10 == 7) {
                this.a = (vq) obj;
                return;
            }
            if (i10 == 8) {
                this.f9464b = (t2) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            ok okVar = (ok) obj;
            if (okVar == null) {
                this.f9465c = null;
                this.f9466d = null;
            } else {
                this.f9465c = okVar.getVideoFrameMetadataListener();
                this.f9466d = okVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.impl.t2
        public void a(long j3, float[] fArr) {
            t2 t2Var = this.f9466d;
            if (t2Var != null) {
                t2Var.a(j3, fArr);
            }
            t2 t2Var2 = this.f9464b;
            if (t2Var2 != null) {
                t2Var2.a(j3, fArr);
            }
        }

        @Override // com.applovin.impl.t2
        public void a() {
            t2 t2Var = this.f9466d;
            if (t2Var != null) {
                t2Var.a();
            }
            t2 t2Var2 = this.f9464b;
            if (t2Var2 != null) {
                t2Var2.a();
            }
        }

        @Override // com.applovin.impl.vq
        public void a(long j3, long j10, d9 d9Var, MediaFormat mediaFormat) {
            vq vqVar = this.f9465c;
            if (vqVar != null) {
                vqVar.a(j3, j10, d9Var, mediaFormat);
            }
            vq vqVar2 = this.a;
            if (vqVar2 != null) {
                vqVar2.a(j3, j10, d9Var, mediaFormat);
            }
        }
    }

    @Override // com.applovin.impl.nh
    public void b(SurfaceView surfaceView) {
        Z();
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.applovin.impl.nh
    public boolean d() {
        Z();
        return this.f9419e.d();
    }

    @Override // com.applovin.impl.nh
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.f9437x) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.nh
    public void b() {
        Z();
        boolean l10 = l();
        int a10 = this.f9425k.a(l10, 2);
        a(l10, a10, b(l10, a10));
        this.f9419e.b();
    }

    public void a(nh.c cVar) {
        a1.a(cVar);
        this.f9419e.a(cVar);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.u) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        Z();
        return this.f9419e.a();
    }

    public void b(nh.c cVar) {
        this.f9419e.e(cVar);
    }

    private void b(SurfaceHolder surfaceHolder) {
        this.f9436w = false;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f9420f);
        Surface surface = this.u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        if (i10 == this.A && i11 == this.B) {
            return;
        }
        this.A = i10;
        this.B = i11;
        this.f9423i.a(i10, i11);
        Iterator it = this.f9422h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(i10, i11);
        }
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        a1.a(eVar);
        this.f9422h.remove(eVar);
        b((nh.c) eVar);
    }

    @Override // com.applovin.impl.nh
    public void b(boolean z10) {
        Z();
        this.f9419e.b(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p6 b(fl flVar) {
        return new p6(0, flVar.b(), flVar.a());
    }

    @Override // com.applovin.impl.nh
    public void a(int i10, long j3) {
        Z();
        this.f9423i.h();
        this.f9419e.a(i10, j3);
    }

    private void a(int i10, int i11, Object obj) {
        for (li liVar : this.f9416b) {
            if (liVar.e() == i10) {
                this.f9419e.a(liVar).a(i11).a(obj).j();
            }
        }
    }

    public void a(wd wdVar) {
        Z();
        this.f9419e.a(wdVar);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z10) {
        Z();
        int a10 = this.f9425k.a(z10, o());
        a(z10, a10, b(z10, a10));
    }

    @Override // com.applovin.impl.nh
    public void a(int i10) {
        Z();
        this.f9419e.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f9434t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        li[] liVarArr = this.f9416b;
        int length = liVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar.e() == 2) {
                arrayList.add(this.f9419e.a(liVar).a(1).a(obj).j());
            }
            i10++;
        }
        Object obj2 = this.f9433s;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((oh) it.next()).a(this.f9429o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f9433s;
            Surface surface = this.f9434t;
            if (obj3 == surface) {
                surface.release();
                this.f9434t = null;
            }
        }
        this.f9433s = obj;
        if (z10) {
            this.f9419e.a(false, y7.a(new e8(3), 1003));
        }
    }

    @Override // com.applovin.impl.nh
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof uq) {
            W();
            a((Object) surfaceView);
            b(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof ok) {
                W();
                this.f9435v = (ok) surfaceView;
                this.f9419e.a(this.f9421g).a(10000).a(this.f9435v).j();
                this.f9435v.a(this.f9420f);
                a(this.f9435v.getVideoSurface());
                b(surfaceView.getHolder());
                return;
            }
            c(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.impl.nh
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            R();
            return;
        }
        W();
        this.f9437x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f9420f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f10) {
        Z();
        float a10 = yp.a(f10, 0.0f, 1.0f);
        if (this.G == a10) {
            return;
        }
        this.G = a10;
        X();
        this.f9423i.a(a10);
        Iterator it = this.f9422h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f9419e.a(z11, i12, i11);
    }
}
