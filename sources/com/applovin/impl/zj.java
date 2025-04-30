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
import com.applovin.impl.C0720l1;
import com.applovin.impl.C0728n1;
import com.applovin.impl.c6;
import com.applovin.impl.fl;
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
public class zj extends AbstractC0680c2 implements nh {

    /* renamed from: A, reason: collision with root package name */
    private int f12598A;

    /* renamed from: B, reason: collision with root package name */
    private int f12599B;

    /* renamed from: C, reason: collision with root package name */
    private l5 f12600C;

    /* renamed from: D, reason: collision with root package name */
    private l5 f12601D;

    /* renamed from: E, reason: collision with root package name */
    private int f12602E;

    /* renamed from: F, reason: collision with root package name */
    private C0716k1 f12603F;

    /* renamed from: G, reason: collision with root package name */
    private float f12604G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f12605H;

    /* renamed from: I, reason: collision with root package name */
    private List f12606I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f12607J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f12608K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f12609L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f12610M;

    /* renamed from: N, reason: collision with root package name */
    private p6 f12611N;
    private yq O;
    protected final li[] b;

    /* renamed from: c, reason: collision with root package name */
    private final a4 f12612c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12613d;

    /* renamed from: e, reason: collision with root package name */
    private final a8 f12614e;

    /* renamed from: f, reason: collision with root package name */
    private final c f12615f;

    /* renamed from: g, reason: collision with root package name */
    private final d f12616g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f12617h;

    /* renamed from: i, reason: collision with root package name */
    private final C0742r0 f12618i;

    /* renamed from: j, reason: collision with root package name */
    private final C0720l1 f12619j;

    /* renamed from: k, reason: collision with root package name */
    private final C0728n1 f12620k;
    private final fl l;
    private final hr m;

    /* renamed from: n, reason: collision with root package name */
    private final ds f12621n;

    /* renamed from: o, reason: collision with root package name */
    private final long f12622o;

    /* renamed from: p, reason: collision with root package name */
    private d9 f12623p;

    /* renamed from: q, reason: collision with root package name */
    private d9 f12624q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f12625r;

    /* renamed from: s, reason: collision with root package name */
    private Object f12626s;

    /* renamed from: t, reason: collision with root package name */
    private Surface f12627t;

    /* renamed from: u, reason: collision with root package name */
    private SurfaceHolder f12628u;

    /* renamed from: v, reason: collision with root package name */
    private ok f12629v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12630w;

    /* renamed from: x, reason: collision with root package name */
    private TextureView f12631x;

    /* renamed from: y, reason: collision with root package name */
    private int f12632y;

    /* renamed from: z, reason: collision with root package name */
    private int f12633z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f12634a;
        private final oi b;

        /* renamed from: c, reason: collision with root package name */
        private j3 f12635c;

        /* renamed from: d, reason: collision with root package name */
        private long f12636d;

        /* renamed from: e, reason: collision with root package name */
        private wo f12637e;

        /* renamed from: f, reason: collision with root package name */
        private yd f12638f;

        /* renamed from: g, reason: collision with root package name */
        private gc f12639g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC0775x1 f12640h;

        /* renamed from: i, reason: collision with root package name */
        private C0742r0 f12641i;

        /* renamed from: j, reason: collision with root package name */
        private Looper f12642j;

        /* renamed from: k, reason: collision with root package name */
        private C0716k1 f12643k;
        private boolean l;
        private int m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f12644n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f12645o;

        /* renamed from: p, reason: collision with root package name */
        private int f12646p;

        /* renamed from: q, reason: collision with root package name */
        private int f12647q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f12648r;

        /* renamed from: s, reason: collision with root package name */
        private fj f12649s;

        /* renamed from: t, reason: collision with root package name */
        private long f12650t;

        /* renamed from: u, reason: collision with root package name */
        private long f12651u;

        /* renamed from: v, reason: collision with root package name */
        private fc f12652v;

        /* renamed from: w, reason: collision with root package name */
        private long f12653w;

        /* renamed from: x, reason: collision with root package name */
        private long f12654x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f12655y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f12656z;

        public b(Context context) {
            this(context, new i6(context), new a6());
        }

        public static /* synthetic */ rh m(b bVar) {
            bVar.getClass();
            return null;
        }

        public b(Context context, oi oiVar, m8 m8Var) {
            this(context, oiVar, new k6(context), new g6(context, m8Var), new d6(), r5.a(context), new C0742r0(j3.f8390a));
        }

        public zj a() {
            AbstractC0669a1.b(!this.f12656z);
            this.f12656z = true;
            return new zj(this);
        }

        public b(Context context, oi oiVar, wo woVar, yd ydVar, gc gcVar, InterfaceC0775x1 interfaceC0775x1, C0742r0 c0742r0) {
            this.f12634a = context;
            this.b = oiVar;
            this.f12637e = woVar;
            this.f12638f = ydVar;
            this.f12639g = gcVar;
            this.f12640h = interfaceC0775x1;
            this.f12641i = c0742r0;
            this.f12642j = yp.d();
            this.f12643k = C0716k1.f8529g;
            this.m = 0;
            this.f12646p = 1;
            this.f12647q = 0;
            this.f12648r = true;
            this.f12649s = fj.f7715g;
            this.f12650t = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
            this.f12651u = 15000L;
            this.f12652v = new c6.b().a();
            this.f12635c = j3.f8390a;
            this.f12653w = 500L;
            this.f12654x = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements xq, InterfaceC0736p1, bo, af, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ok.b, C0728n1.b, C0720l1.b, fl.b, nh.c, z7 {
        private c() {
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void a(String str, long j7, long j9) {
            zj.this.f12618i.a(str, j7, j9);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void b(String str) {
            zj.this.f12618i.b(str);
        }

        @Override // com.applovin.impl.C0720l1.b
        public void c() {
            zj.this.a(false, -1, 3);
        }

        @Override // com.applovin.impl.fl.b
        public void d(int i9) {
            p6 b = zj.b(zj.this.l);
            if (b.equals(zj.this.f12611N)) {
                return;
            }
            zj.this.f12611N = b;
            Iterator it = zj.this.f12617h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(b);
            }
        }

        @Override // com.applovin.impl.C0728n1.b
        public void f(int i9) {
            boolean l = zj.this.l();
            zj.this.a(l, i9, zj.b(l, i9));
        }

        @Override // com.applovin.impl.z7
        public void g(boolean z8) {
            zj.this.Y();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            zj.this.a(surfaceTexture);
            zj.this.a(i9, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            zj.this.a((Object) null);
            zj.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            zj.this.a(i9, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
            zj.this.a(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (zj.this.f12630w) {
                zj.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (zj.this.f12630w) {
                zj.this.a((Object) null);
            }
            zj.this.a(0, 0);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void a(l5 l5Var) {
            zj.this.f12601D = l5Var;
            zj.this.f12618i.a(l5Var);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void b(d9 d9Var, o5 o5Var) {
            zj.this.f12624q = d9Var;
            zj.this.f12618i.b(d9Var, o5Var);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void c(Exception exc) {
            zj.this.f12618i.c(exc);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void c(l5 l5Var) {
            zj.this.f12618i.c(l5Var);
            zj.this.f12624q = null;
            zj.this.f12601D = null;
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void a(long j7) {
            zj.this.f12618i.a(j7);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void b(int i9, long j7, long j9) {
            zj.this.f12618i.b(i9, j7, j9);
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void a(Exception exc) {
            zj.this.f12618i.a(exc);
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i9) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.bo
        public void a(List list) {
            zj.this.f12606I = list;
            Iterator it = zj.this.f12617h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(list);
            }
        }

        @Override // com.applovin.impl.xq
        public void b(Exception exc) {
            zj.this.f12618i.b(exc);
        }

        @Override // com.applovin.impl.nh.c
        public void c(boolean z8) {
            zj.k(zj.this);
        }

        @Override // com.applovin.impl.xq
        public void d(l5 l5Var) {
            zj.this.f12600C = l5Var;
            zj.this.f12618i.d(l5Var);
        }

        @Override // com.applovin.impl.xq
        public void b(String str, long j7, long j9) {
            zj.this.f12618i.b(str, j7, j9);
        }

        @Override // com.applovin.impl.xq
        public void b(l5 l5Var) {
            zj.this.f12618i.b(l5Var);
            zj.this.f12623p = null;
            zj.this.f12600C = null;
        }

        @Override // com.applovin.impl.xq
        public void a(int i9, long j7) {
            zj.this.f12618i.a(i9, j7);
        }

        @Override // com.applovin.impl.af
        public void a(we weVar) {
            zj.this.f12618i.a(weVar);
            zj.this.f12614e.a(weVar);
            Iterator it = zj.this.f12617h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(weVar);
            }
        }

        @Override // com.applovin.impl.ok.b
        public void b(Surface surface) {
            zj.this.a(surface);
        }

        @Override // com.applovin.impl.C0728n1.b
        public void b(float f9) {
            zj.this.X();
        }

        @Override // com.applovin.impl.nh.c
        public void a(boolean z8, int i9) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.xq
        public void a(Object obj, long j7) {
            zj.this.f12618i.a(obj, j7);
            if (zj.this.f12626s == obj) {
                Iterator it = zj.this.f12617h.iterator();
                while (it.hasNext()) {
                    ((nh.e) it.next()).a();
                }
            }
        }

        @Override // com.applovin.impl.InterfaceC0736p1
        public void a(boolean z8) {
            if (zj.this.f12605H == z8) {
                return;
            }
            zj.this.f12605H = z8;
            zj.this.U();
        }

        @Override // com.applovin.impl.fl.b
        public void a(int i9, boolean z8) {
            Iterator it = zj.this.f12617h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).b(i9, z8);
            }
        }

        @Override // com.applovin.impl.xq
        public void a(String str) {
            zj.this.f12618i.a(str);
        }

        @Override // com.applovin.impl.xq
        public void a(long j7, int i9) {
            zj.this.f12618i.a(j7, i9);
        }

        @Override // com.applovin.impl.xq
        public void a(d9 d9Var, o5 o5Var) {
            zj.this.f12623p = d9Var;
            zj.this.f12618i.a(d9Var, o5Var);
        }

        @Override // com.applovin.impl.xq
        public void a(yq yqVar) {
            zj.this.O = yqVar;
            zj.this.f12618i.a(yqVar);
            Iterator it = zj.this.f12617h.iterator();
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
        C0716k1 c0716k1;
        boolean z8;
        boolean z9;
        a4 a4Var = new a4();
        this.f12612c = a4Var;
        try {
            Context applicationContext = bVar.f12634a.getApplicationContext();
            this.f12613d = applicationContext;
            C0742r0 c0742r0 = bVar.f12641i;
            this.f12618i = c0742r0;
            b.m(bVar);
            this.f12603F = bVar.f12643k;
            this.f12632y = bVar.f12646p;
            this.f12633z = bVar.f12647q;
            this.f12605H = bVar.f12645o;
            this.f12622o = bVar.f12654x;
            c cVar = new c();
            this.f12615f = cVar;
            d dVar = new d();
            this.f12616g = dVar;
            this.f12617h = new CopyOnWriteArraySet();
            Handler handler = new Handler(bVar.f12642j);
            li[] a6 = bVar.b.a(handler, cVar, cVar, cVar, cVar);
            this.b = a6;
            this.f12604G = 1.0f;
            if (yp.f12451a < 21) {
                this.f12602E = d(0);
            } else {
                this.f12602E = AbstractC0744r2.a(applicationContext);
            }
            this.f12606I = Collections.emptyList();
            this.f12607J = true;
            try {
                a8 a8Var = new a8(a6, bVar.f12637e, bVar.f12638f, bVar.f12639g, bVar.f12640h, c0742r0, bVar.f12648r, bVar.f12649s, bVar.f12650t, bVar.f12651u, bVar.f12652v, bVar.f12653w, bVar.f12655y, bVar.f12635c, bVar.f12642j, this, new nh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                zjVar = this;
                try {
                    zjVar.f12614e = a8Var;
                    a8Var.a((nh.c) cVar);
                    a8Var.a((z7) cVar);
                    if (bVar.f12636d > 0) {
                        a8Var.c(bVar.f12636d);
                    }
                    C0720l1 c0720l1 = new C0720l1(bVar.f12634a, handler, cVar);
                    zjVar.f12619j = c0720l1;
                    c0720l1.a(bVar.f12644n);
                    C0728n1 c0728n1 = new C0728n1(bVar.f12634a, handler, cVar);
                    zjVar.f12620k = c0728n1;
                    if (bVar.l) {
                        c0716k1 = zjVar.f12603F;
                    } else {
                        c0716k1 = null;
                    }
                    c0728n1.b(c0716k1);
                    fl flVar = new fl(bVar.f12634a, handler, cVar);
                    zjVar.l = flVar;
                    flVar.a(yp.e(zjVar.f12603F.f8532c));
                    hr hrVar = new hr(bVar.f12634a);
                    zjVar.m = hrVar;
                    if (bVar.m != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    hrVar.a(z8);
                    ds dsVar = new ds(bVar.f12634a);
                    zjVar.f12621n = dsVar;
                    if (bVar.m == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dsVar.a(z9);
                    zjVar.f12611N = b(flVar);
                    zjVar.O = yq.f12463f;
                    zjVar.a(1, 10, Integer.valueOf(zjVar.f12602E));
                    zjVar.a(2, 10, Integer.valueOf(zjVar.f12602E));
                    zjVar.a(1, 3, zjVar.f12603F);
                    zjVar.a(2, 4, Integer.valueOf(zjVar.f12632y));
                    zjVar.a(2, 5, Integer.valueOf(zjVar.f12633z));
                    zjVar.a(1, 9, Boolean.valueOf(zjVar.f12605H));
                    zjVar.a(2, 7, dVar);
                    zjVar.a(6, 8, dVar);
                    a4Var.e();
                } catch (Throwable th) {
                    th = th;
                    zjVar.f12612c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zjVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            zjVar = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.f12618i.a(this.f12605H);
        Iterator it = this.f12617h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(this.f12605H);
        }
    }

    private void W() {
        if (this.f12629v != null) {
            this.f12614e.a(this.f12616g).a(10000).a((Object) null).j();
            this.f12629v.b(this.f12615f);
            this.f12629v = null;
        }
        TextureView textureView = this.f12631x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f12615f) {
                kc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f12631x.setSurfaceTextureListener(null);
            }
            this.f12631x = null;
        }
        SurfaceHolder surfaceHolder = this.f12628u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f12615f);
            this.f12628u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        a(1, 2, Float.valueOf(this.f12604G * this.f12620k.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int o3 = o();
        boolean z8 = true;
        if (o3 != 1) {
            if (o3 != 2 && o3 != 3) {
                if (o3 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean S8 = S();
                hr hrVar = this.m;
                if (!l() || S8) {
                    z8 = false;
                }
                hrVar.b(z8);
                this.f12621n.b(l());
                return;
            }
        }
        this.m.b(false);
        this.f12621n.b(false);
    }

    private void Z() {
        IllegalStateException illegalStateException;
        this.f12612c.b();
        if (Thread.currentThread() != p().getThread()) {
            String a6 = yp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p().getThread().getName());
            if (!this.f12607J) {
                if (this.f12608K) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                kc.c("SimpleExoPlayer", a6, illegalStateException);
                this.f12608K = true;
                return;
            }
            throw new IllegalStateException(a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z8, int i9) {
        return (!z8 || i9 == 1) ? 1 : 2;
    }

    public static /* synthetic */ rh k(zj zjVar) {
        zjVar.getClass();
        return null;
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        Z();
        return this.f12614e.A();
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.f12614e.C();
    }

    @Override // com.applovin.impl.nh
    public int E() {
        Z();
        return this.f12614e.E();
    }

    @Override // com.applovin.impl.nh
    public long F() {
        Z();
        return this.f12614e.F();
    }

    public void R() {
        Z();
        W();
        a((Object) null);
        a(0, 0);
    }

    public boolean S() {
        Z();
        return this.f12614e.S();
    }

    @Override // com.applovin.impl.nh
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public y7 c() {
        Z();
        return this.f12614e.c();
    }

    public void V() {
        AudioTrack audioTrack;
        Z();
        if (yp.f12451a < 21 && (audioTrack = this.f12625r) != null) {
            audioTrack.release();
            this.f12625r = null;
        }
        this.f12619j.a(false);
        this.l.c();
        this.m.b(false);
        this.f12621n.b(false);
        this.f12620k.e();
        this.f12614e.W();
        this.f12618i.i();
        W();
        Surface surface = this.f12627t;
        if (surface != null) {
            surface.release();
            this.f12627t = null;
        }
        if (!this.f12609L) {
            this.f12606I = Collections.emptyList();
            this.f12610M = true;
        } else {
            b8.a(AbstractC0669a1.a((Object) null));
            throw null;
        }
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        Z();
        return this.f12614e.getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        Z();
        return this.f12614e.getDuration();
    }

    @Override // com.applovin.impl.nh
    public int m() {
        Z();
        return this.f12614e.m();
    }

    @Override // com.applovin.impl.nh
    public go n() {
        Z();
        return this.f12614e.n();
    }

    @Override // com.applovin.impl.nh
    public int o() {
        Z();
        return this.f12614e.o();
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.f12614e.p();
    }

    @Override // com.applovin.impl.nh
    public long q() {
        Z();
        return this.f12614e.q();
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        Z();
        return this.f12614e.r();
    }

    @Override // com.applovin.impl.nh
    public long s() {
        Z();
        return this.f12614e.s();
    }

    @Override // com.applovin.impl.nh
    public int t() {
        Z();
        return this.f12614e.t();
    }

    @Override // com.applovin.impl.nh
    public int v() {
        Z();
        return this.f12614e.v();
    }

    @Override // com.applovin.impl.nh
    public List x() {
        Z();
        return this.f12606I;
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return this.O;
    }

    private int d(int i9) {
        AudioTrack audioTrack = this.f12625r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i9) {
            this.f12625r.release();
            this.f12625r = null;
        }
        if (this.f12625r == null) {
            this.f12625r = new AudioTrack(3, 4000, 4, 2, 2, 0, i9);
        }
        return this.f12625r.getAudioSessionId();
    }

    @Override // com.applovin.impl.nh
    public long e() {
        Z();
        return this.f12614e.e();
    }

    @Override // com.applovin.impl.nh
    public int f() {
        Z();
        return this.f12614e.f();
    }

    @Override // com.applovin.impl.nh
    public long g() {
        Z();
        return this.f12614e.g();
    }

    @Override // com.applovin.impl.nh
    public long h() {
        Z();
        return this.f12614e.h();
    }

    @Override // com.applovin.impl.nh
    public nh.b i() {
        Z();
        return this.f12614e.i();
    }

    @Override // com.applovin.impl.nh
    public int j() {
        Z();
        return this.f12614e.j();
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        Z();
        return this.f12614e.k();
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        Z();
        return this.f12614e.l();
    }

    public void c(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.f12630w = true;
        this.f12628u = surfaceHolder;
        surfaceHolder.addCallback(this.f12615f);
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
        AbstractC0669a1.a(eVar);
        this.f12617h.add(eVar);
        a((nh.c) eVar);
    }

    /* loaded from: classes.dex */
    public static final class d implements vq, InterfaceC0760t2, oh.b {

        /* renamed from: a, reason: collision with root package name */
        private vq f12658a;
        private InterfaceC0760t2 b;

        /* renamed from: c, reason: collision with root package name */
        private vq f12659c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC0760t2 f12660d;

        private d() {
        }

        @Override // com.applovin.impl.oh.b
        public void a(int i9, Object obj) {
            if (i9 == 7) {
                this.f12658a = (vq) obj;
                return;
            }
            if (i9 == 8) {
                this.b = (InterfaceC0760t2) obj;
                return;
            }
            if (i9 != 10000) {
                return;
            }
            ok okVar = (ok) obj;
            if (okVar == null) {
                this.f12659c = null;
                this.f12660d = null;
            } else {
                this.f12659c = okVar.getVideoFrameMetadataListener();
                this.f12660d = okVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.impl.InterfaceC0760t2
        public void a(long j7, float[] fArr) {
            InterfaceC0760t2 interfaceC0760t2 = this.f12660d;
            if (interfaceC0760t2 != null) {
                interfaceC0760t2.a(j7, fArr);
            }
            InterfaceC0760t2 interfaceC0760t22 = this.b;
            if (interfaceC0760t22 != null) {
                interfaceC0760t22.a(j7, fArr);
            }
        }

        @Override // com.applovin.impl.InterfaceC0760t2
        public void a() {
            InterfaceC0760t2 interfaceC0760t2 = this.f12660d;
            if (interfaceC0760t2 != null) {
                interfaceC0760t2.a();
            }
            InterfaceC0760t2 interfaceC0760t22 = this.b;
            if (interfaceC0760t22 != null) {
                interfaceC0760t22.a();
            }
        }

        @Override // com.applovin.impl.vq
        public void a(long j7, long j9, d9 d9Var, MediaFormat mediaFormat) {
            vq vqVar = this.f12659c;
            if (vqVar != null) {
                vqVar.a(j7, j9, d9Var, mediaFormat);
            }
            vq vqVar2 = this.f12658a;
            if (vqVar2 != null) {
                vqVar2.a(j7, j9, d9Var, mediaFormat);
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
        return this.f12614e.d();
    }

    @Override // com.applovin.impl.nh
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.f12631x) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.nh
    public void b() {
        Z();
        boolean l = l();
        int a6 = this.f12620k.a(l, 2);
        a(l, a6, b(l, a6));
        this.f12614e.b();
    }

    public void a(nh.c cVar) {
        AbstractC0669a1.a(cVar);
        this.f12614e.a(cVar);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.f12628u) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        Z();
        return this.f12614e.a();
    }

    public void b(nh.c cVar) {
        this.f12614e.e(cVar);
    }

    private void b(SurfaceHolder surfaceHolder) {
        this.f12630w = false;
        this.f12628u = surfaceHolder;
        surfaceHolder.addCallback(this.f12615f);
        Surface surface = this.f12628u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f12628u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9, int i10) {
        if (i9 == this.f12598A && i10 == this.f12599B) {
            return;
        }
        this.f12598A = i9;
        this.f12599B = i10;
        this.f12618i.a(i9, i10);
        Iterator it = this.f12617h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(i9, i10);
        }
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        AbstractC0669a1.a(eVar);
        this.f12617h.remove(eVar);
        b((nh.c) eVar);
    }

    @Override // com.applovin.impl.nh
    public void b(boolean z8) {
        Z();
        this.f12614e.b(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p6 b(fl flVar) {
        return new p6(0, flVar.b(), flVar.a());
    }

    @Override // com.applovin.impl.nh
    public void a(int i9, long j7) {
        Z();
        this.f12618i.h();
        this.f12614e.a(i9, j7);
    }

    private void a(int i9, int i10, Object obj) {
        for (li liVar : this.b) {
            if (liVar.e() == i9) {
                this.f12614e.a(liVar).a(i10).a(obj).j();
            }
        }
    }

    public void a(wd wdVar) {
        Z();
        this.f12614e.a(wdVar);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z8) {
        Z();
        int a6 = this.f12620k.a(z8, o());
        a(z8, a6, b(z8, a6));
    }

    @Override // com.applovin.impl.nh
    public void a(int i9) {
        Z();
        this.f12614e.a(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f12627t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z8;
        ArrayList arrayList = new ArrayList();
        li[] liVarArr = this.b;
        int length = liVarArr.length;
        int i9 = 0;
        while (true) {
            z8 = true;
            if (i9 >= length) {
                break;
            }
            li liVar = liVarArr[i9];
            if (liVar.e() == 2) {
                arrayList.add(this.f12614e.a(liVar).a(1).a(obj).j());
            }
            i9++;
        }
        Object obj2 = this.f12626s;
        if (obj2 == null || obj2 == obj) {
            z8 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((oh) it.next()).a(this.f12622o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z8 = false;
            Object obj3 = this.f12626s;
            Surface surface = this.f12627t;
            if (obj3 == surface) {
                surface.release();
                this.f12627t = null;
            }
        }
        this.f12626s = obj;
        if (z8) {
            this.f12614e.a(false, y7.a(new e8(3), 1003));
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
                this.f12629v = (ok) surfaceView;
                this.f12614e.a(this.f12616g).a(10000).a(this.f12629v).j();
                this.f12629v.a(this.f12615f);
                a(this.f12629v.getVideoSurface());
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
        this.f12631x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f12615f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f9) {
        Z();
        float a6 = yp.a(f9, 0.0f, 1.0f);
        if (this.f12604G == a6) {
            return;
        }
        this.f12604G = a6;
        X();
        this.f12618i.a(a6);
        Iterator it = this.f12617h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z8, int i9, int i10) {
        int i11 = 0;
        boolean z9 = z8 && i9 != -1;
        if (z9 && i9 != 1) {
            i11 = 1;
        }
        this.f12614e.a(z9, i11, i10);
    }
}
