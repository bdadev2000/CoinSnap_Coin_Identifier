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
import com.applovin.impl.e6;
import com.applovin.impl.il;
import com.applovin.impl.m1;
import com.applovin.impl.o1;
import com.applovin.impl.qh;
import com.applovin.impl.rh;
import com.applovin.impl.rk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class ck extends d2 implements qh {
    private int A;
    private int B;
    private n5 C;
    private n5 D;
    private int E;
    private l1 F;
    private float G;
    private boolean H;
    private List I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private r6 N;
    private xq O;

    /* renamed from: b, reason: collision with root package name */
    protected final qi[] f23286b;

    /* renamed from: c, reason: collision with root package name */
    private final c4 f23287c;
    private final Context d;
    private final c8 e;

    /* renamed from: f, reason: collision with root package name */
    private final c f23288f;

    /* renamed from: g, reason: collision with root package name */
    private final d f23289g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f23290h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f23291i;

    /* renamed from: j, reason: collision with root package name */
    private final m1 f23292j;

    /* renamed from: k, reason: collision with root package name */
    private final o1 f23293k;

    /* renamed from: l, reason: collision with root package name */
    private final il f23294l;

    /* renamed from: m, reason: collision with root package name */
    private final gr f23295m;

    /* renamed from: n, reason: collision with root package name */
    private final cs f23296n;

    /* renamed from: o, reason: collision with root package name */
    private final long f23297o;

    /* renamed from: p, reason: collision with root package name */
    private f9 f23298p;

    /* renamed from: q, reason: collision with root package name */
    private f9 f23299q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f23300r;

    /* renamed from: s, reason: collision with root package name */
    private Object f23301s;

    /* renamed from: t, reason: collision with root package name */
    private Surface f23302t;

    /* renamed from: u, reason: collision with root package name */
    private SurfaceHolder f23303u;

    /* renamed from: v, reason: collision with root package name */
    private rk f23304v;
    private boolean w;
    private TextureView x;

    /* renamed from: y, reason: collision with root package name */
    private int f23305y;

    /* renamed from: z, reason: collision with root package name */
    private int f23306z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f23307a;

        /* renamed from: b, reason: collision with root package name */
        private final ti f23308b;

        /* renamed from: c, reason: collision with root package name */
        private l3 f23309c;
        private long d;
        private vo e;

        /* renamed from: f, reason: collision with root package name */
        private de f23310f;

        /* renamed from: g, reason: collision with root package name */
        private lc f23311g;

        /* renamed from: h, reason: collision with root package name */
        private y1 f23312h;

        /* renamed from: i, reason: collision with root package name */
        private r0 f23313i;

        /* renamed from: j, reason: collision with root package name */
        private Looper f23314j;

        /* renamed from: k, reason: collision with root package name */
        private l1 f23315k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f23316l;

        /* renamed from: m, reason: collision with root package name */
        private int f23317m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23318n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f23319o;

        /* renamed from: p, reason: collision with root package name */
        private int f23320p;

        /* renamed from: q, reason: collision with root package name */
        private int f23321q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f23322r;

        /* renamed from: s, reason: collision with root package name */
        private jj f23323s;

        /* renamed from: t, reason: collision with root package name */
        private long f23324t;

        /* renamed from: u, reason: collision with root package name */
        private long f23325u;

        /* renamed from: v, reason: collision with root package name */
        private kc f23326v;
        private long w;
        private long x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f23327y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f23328z;

        public b(Context context) {
            this(context, new k6(context), new c6());
        }

        public static /* synthetic */ uh m(b bVar) {
            bVar.getClass();
            return null;
        }

        public b(Context context, ti tiVar, o8 o8Var) {
            this(context, tiVar, new m6(context), new i6(context, o8Var), new f6(), t5.a(context), new r0(l3.f24977a));
        }

        public ck a() {
            b1.b(!this.f23328z);
            this.f23328z = true;
            return new ck(this);
        }

        public b(Context context, ti tiVar, vo voVar, de deVar, lc lcVar, y1 y1Var, r0 r0Var) {
            this.f23307a = context;
            this.f23308b = tiVar;
            this.e = voVar;
            this.f23310f = deVar;
            this.f23311g = lcVar;
            this.f23312h = y1Var;
            this.f23313i = r0Var;
            this.f23314j = xp.d();
            this.f23315k = l1.f24967g;
            this.f23317m = 0;
            this.f23320p = 1;
            this.f23321q = 0;
            this.f23322r = true;
            this.f23323s = jj.f24698g;
            this.f23324t = 5000L;
            this.f23325u = 15000L;
            this.f23326v = new e6.b().a();
            this.f23309c = l3.f24977a;
            this.w = 500L;
            this.x = 2000L;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements wq, q1, ao, ff, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, rk.b, o1.b, m1.b, il.b, qh.c, b8 {
        private c() {
        }

        @Override // com.applovin.impl.q1
        public void a(String str, long j2, long j3) {
            ck.this.f23291i.a(str, j2, j3);
        }

        @Override // com.applovin.impl.q1
        public void b(String str) {
            ck.this.f23291i.b(str);
        }

        @Override // com.applovin.impl.m1.b
        public void c() {
            ck.this.a(false, -1, 3);
        }

        @Override // com.applovin.impl.il.b
        public void d(int i2) {
            r6 b2 = ck.b(ck.this.f23294l);
            if (b2.equals(ck.this.N)) {
                return;
            }
            ck.this.N = b2;
            Iterator it = ck.this.f23290h.iterator();
            while (it.hasNext()) {
                ((qh.e) it.next()).a(b2);
            }
        }

        @Override // com.applovin.impl.o1.b
        public void f(int i2) {
            boolean l2 = ck.this.l();
            ck.this.a(l2, i2, ck.b(l2, i2));
        }

        @Override // com.applovin.impl.b8
        public void g(boolean z2) {
            ck.this.Y();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            ck.this.a(surfaceTexture);
            ck.this.a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ck.this.a((Object) null);
            ck.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            ck.this.a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            ck.this.a(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ck.this.w) {
                ck.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ck.this.w) {
                ck.this.a((Object) null);
            }
            ck.this.a(0, 0);
        }

        @Override // com.applovin.impl.q1
        public void a(n5 n5Var) {
            ck.this.D = n5Var;
            ck.this.f23291i.a(n5Var);
        }

        @Override // com.applovin.impl.q1
        public void b(f9 f9Var, q5 q5Var) {
            ck.this.f23299q = f9Var;
            ck.this.f23291i.b(f9Var, q5Var);
        }

        @Override // com.applovin.impl.q1
        public void c(Exception exc) {
            ck.this.f23291i.c(exc);
        }

        @Override // com.applovin.impl.q1
        public void c(n5 n5Var) {
            ck.this.f23291i.c(n5Var);
            ck.this.f23299q = null;
            ck.this.D = null;
        }

        @Override // com.applovin.impl.q1
        public void a(long j2) {
            ck.this.f23291i.a(j2);
        }

        @Override // com.applovin.impl.q1
        public void b(int i2, long j2, long j3) {
            ck.this.f23291i.b(i2, j2, j3);
        }

        @Override // com.applovin.impl.q1
        public void a(Exception exc) {
            ck.this.f23291i.a(exc);
        }

        @Override // com.applovin.impl.qh.c
        public void b(int i2) {
            ck.this.Y();
        }

        @Override // com.applovin.impl.ao
        public void a(List list) {
            ck.this.I = list;
            Iterator it = ck.this.f23290h.iterator();
            while (it.hasNext()) {
                ((qh.e) it.next()).a(list);
            }
        }

        @Override // com.applovin.impl.wq
        public void b(Exception exc) {
            ck.this.f23291i.b(exc);
        }

        @Override // com.applovin.impl.qh.c
        public void c(boolean z2) {
            ck.k(ck.this);
        }

        @Override // com.applovin.impl.wq
        public void d(n5 n5Var) {
            ck.this.C = n5Var;
            ck.this.f23291i.d(n5Var);
        }

        @Override // com.applovin.impl.wq
        public void b(String str, long j2, long j3) {
            ck.this.f23291i.b(str, j2, j3);
        }

        @Override // com.applovin.impl.wq
        public void b(n5 n5Var) {
            ck.this.f23291i.b(n5Var);
            ck.this.f23298p = null;
            ck.this.C = null;
        }

        @Override // com.applovin.impl.wq
        public void a(int i2, long j2) {
            ck.this.f23291i.a(i2, j2);
        }

        @Override // com.applovin.impl.ff
        public void a(bf bfVar) {
            ck.this.f23291i.a(bfVar);
            ck.this.e.a(bfVar);
            Iterator it = ck.this.f23290h.iterator();
            while (it.hasNext()) {
                ((qh.e) it.next()).a(bfVar);
            }
        }

        @Override // com.applovin.impl.rk.b
        public void b(Surface surface) {
            ck.this.a(surface);
        }

        @Override // com.applovin.impl.o1.b
        public void b(float f2) {
            ck.this.X();
        }

        @Override // com.applovin.impl.qh.c
        public void a(boolean z2, int i2) {
            ck.this.Y();
        }

        @Override // com.applovin.impl.wq
        public void a(Object obj, long j2) {
            ck.this.f23291i.a(obj, j2);
            if (ck.this.f23301s == obj) {
                Iterator it = ck.this.f23290h.iterator();
                while (it.hasNext()) {
                    ((qh.e) it.next()).a();
                }
            }
        }

        @Override // com.applovin.impl.q1
        public void a(boolean z2) {
            if (ck.this.H == z2) {
                return;
            }
            ck.this.H = z2;
            ck.this.U();
        }

        @Override // com.applovin.impl.il.b
        public void a(int i2, boolean z2) {
            Iterator it = ck.this.f23290h.iterator();
            while (it.hasNext()) {
                ((qh.e) it.next()).b(i2, z2);
            }
        }

        @Override // com.applovin.impl.wq
        public void a(String str) {
            ck.this.f23291i.a(str);
        }

        @Override // com.applovin.impl.wq
        public void a(long j2, int i2) {
            ck.this.f23291i.a(j2, i2);
        }

        @Override // com.applovin.impl.wq
        public void a(f9 f9Var, q5 q5Var) {
            ck.this.f23298p = f9Var;
            ck.this.f23291i.a(f9Var, q5Var);
        }

        @Override // com.applovin.impl.wq
        public void a(xq xqVar) {
            ck.this.O = xqVar;
            ck.this.f23291i.a(xqVar);
            Iterator it = ck.this.f23290h.iterator();
            while (it.hasNext()) {
                ((qh.e) it.next()).a(xqVar);
            }
        }

        @Override // com.applovin.impl.rk.b
        public void a(Surface surface) {
            ck.this.a((Object) null);
        }
    }

    public ck(b bVar) {
        ck ckVar;
        c cVar;
        d dVar;
        Handler handler;
        c8 c8Var;
        c4 c4Var = new c4();
        this.f23287c = c4Var;
        try {
            Context applicationContext = bVar.f23307a.getApplicationContext();
            this.d = applicationContext;
            r0 r0Var = bVar.f23313i;
            this.f23291i = r0Var;
            b.m(bVar);
            this.F = bVar.f23315k;
            this.f23305y = bVar.f23320p;
            this.f23306z = bVar.f23321q;
            this.H = bVar.f23319o;
            this.f23297o = bVar.x;
            cVar = new c();
            this.f23288f = cVar;
            dVar = new d();
            this.f23289g = dVar;
            this.f23290h = new CopyOnWriteArraySet();
            handler = new Handler(bVar.f23314j);
            qi[] a2 = bVar.f23308b.a(handler, cVar, cVar, cVar, cVar);
            this.f23286b = a2;
            this.G = 1.0f;
            if (xp.f27962a < 21) {
                this.E = d(0);
            } else {
                this.E = t2.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            try {
                c8Var = new c8(a2, bVar.e, bVar.f23310f, bVar.f23311g, bVar.f23312h, r0Var, bVar.f23322r, bVar.f23323s, bVar.f23324t, bVar.f23325u, bVar.f23326v, bVar.w, bVar.f23327y, bVar.f23309c, bVar.f23314j, this, new qh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                ckVar = this;
            } catch (Throwable th) {
                th = th;
                ckVar = this;
            }
        } catch (Throwable th2) {
            th = th2;
            ckVar = this;
        }
        try {
            ckVar.e = c8Var;
            c8Var.a((qh.c) cVar);
            c8Var.a((b8) cVar);
            if (bVar.d > 0) {
                c8Var.c(bVar.d);
            }
            m1 m1Var = new m1(bVar.f23307a, handler, cVar);
            ckVar.f23292j = m1Var;
            m1Var.a(bVar.f23318n);
            o1 o1Var = new o1(bVar.f23307a, handler, cVar);
            ckVar.f23293k = o1Var;
            o1Var.b(bVar.f23316l ? ckVar.F : null);
            il ilVar = new il(bVar.f23307a, handler, cVar);
            ckVar.f23294l = ilVar;
            ilVar.a(xp.e(ckVar.F.f24971c));
            gr grVar = new gr(bVar.f23307a);
            ckVar.f23295m = grVar;
            grVar.a(bVar.f23317m != 0);
            cs csVar = new cs(bVar.f23307a);
            ckVar.f23296n = csVar;
            csVar.a(bVar.f23317m == 2);
            ckVar.N = b(ilVar);
            ckVar.O = xq.f27975f;
            ckVar.a(1, 10, Integer.valueOf(ckVar.E));
            ckVar.a(2, 10, Integer.valueOf(ckVar.E));
            ckVar.a(1, 3, ckVar.F);
            ckVar.a(2, 4, Integer.valueOf(ckVar.f23305y));
            ckVar.a(2, 5, Integer.valueOf(ckVar.f23306z));
            ckVar.a(1, 9, Boolean.valueOf(ckVar.H));
            ckVar.a(2, 7, dVar);
            ckVar.a(6, 8, dVar);
            c4Var.e();
        } catch (Throwable th3) {
            th = th3;
            ckVar.f23287c.e();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.f23291i.a(this.H);
        Iterator it = this.f23290h.iterator();
        while (it.hasNext()) {
            ((qh.e) it.next()).a(this.H);
        }
    }

    private void W() {
        if (this.f23304v != null) {
            this.e.a(this.f23289g).a(10000).a((Object) null).j();
            this.f23304v.b(this.f23288f);
            this.f23304v = null;
        }
        TextureView textureView = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f23288f) {
                pc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.x.setSurfaceTextureListener(null);
            }
            this.x = null;
        }
        SurfaceHolder surfaceHolder = this.f23303u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f23288f);
            this.f23303u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        a(1, 2, Float.valueOf(this.G * this.f23293k.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int o2 = o();
        if (o2 != 1) {
            if (o2 == 2 || o2 == 3) {
                this.f23295m.b(l() && !S());
                this.f23296n.b(l());
                return;
            } else if (o2 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f23295m.b(false);
        this.f23296n.b(false);
    }

    private void Z() {
        this.f23287c.b();
        if (Thread.currentThread() != p().getThread()) {
            String a2 = xp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p().getThread().getName());
            if (this.J) {
                throw new IllegalStateException(a2);
            }
            pc.c("SimpleExoPlayer", a2, this.K ? null : new IllegalStateException());
            this.K = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z2, int i2) {
        return (!z2 || i2 == 1) ? 1 : 2;
    }

    public static /* synthetic */ uh k(ck ckVar) {
        ckVar.getClass();
        return null;
    }

    @Override // com.applovin.impl.qh
    public to A() {
        Z();
        return this.e.A();
    }

    @Override // com.applovin.impl.qh
    public vd C() {
        return this.e.C();
    }

    @Override // com.applovin.impl.qh
    public int E() {
        Z();
        return this.e.E();
    }

    @Override // com.applovin.impl.qh
    public long F() {
        Z();
        return this.e.F();
    }

    public void R() {
        Z();
        W();
        a((Object) null);
        a(0, 0);
    }

    public boolean S() {
        Z();
        return this.e.S();
    }

    @Override // com.applovin.impl.qh
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a8 c() {
        Z();
        return this.e.c();
    }

    public void V() {
        AudioTrack audioTrack;
        Z();
        if (xp.f27962a < 21 && (audioTrack = this.f23300r) != null) {
            audioTrack.release();
            this.f23300r = null;
        }
        this.f23292j.a(false);
        this.f23294l.c();
        this.f23295m.b(false);
        this.f23296n.b(false);
        this.f23293k.e();
        this.e.W();
        this.f23291i.i();
        W();
        Surface surface = this.f23302t;
        if (surface != null) {
            surface.release();
            this.f23302t = null;
        }
        if (this.L) {
            d8.a(b1.a((Object) null));
            throw null;
        }
        this.I = Collections.emptyList();
        this.M = true;
    }

    @Override // com.applovin.impl.qh
    public long getCurrentPosition() {
        Z();
        return this.e.getCurrentPosition();
    }

    @Override // com.applovin.impl.qh
    public long getDuration() {
        Z();
        return this.e.getDuration();
    }

    @Override // com.applovin.impl.qh
    public int m() {
        Z();
        return this.e.m();
    }

    @Override // com.applovin.impl.qh
    public fo n() {
        Z();
        return this.e.n();
    }

    @Override // com.applovin.impl.qh
    public int o() {
        Z();
        return this.e.o();
    }

    @Override // com.applovin.impl.qh
    public Looper p() {
        return this.e.p();
    }

    @Override // com.applovin.impl.qh
    public long q() {
        Z();
        return this.e.q();
    }

    @Override // com.applovin.impl.qh
    public boolean r() {
        Z();
        return this.e.r();
    }

    @Override // com.applovin.impl.qh
    public long s() {
        Z();
        return this.e.s();
    }

    @Override // com.applovin.impl.qh
    public int t() {
        Z();
        return this.e.t();
    }

    @Override // com.applovin.impl.qh
    public int v() {
        Z();
        return this.e.v();
    }

    @Override // com.applovin.impl.qh
    public List x() {
        Z();
        return this.I;
    }

    @Override // com.applovin.impl.qh
    public xq z() {
        return this.O;
    }

    private int d(int i2) {
        AudioTrack audioTrack = this.f23300r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i2) {
            this.f23300r.release();
            this.f23300r = null;
        }
        if (this.f23300r == null) {
            this.f23300r = new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
        }
        return this.f23300r.getAudioSessionId();
    }

    @Override // com.applovin.impl.qh
    public long e() {
        Z();
        return this.e.e();
    }

    @Override // com.applovin.impl.qh
    public int f() {
        Z();
        return this.e.f();
    }

    @Override // com.applovin.impl.qh
    public long g() {
        Z();
        return this.e.g();
    }

    @Override // com.applovin.impl.qh
    public long h() {
        Z();
        return this.e.h();
    }

    @Override // com.applovin.impl.qh
    public qh.b i() {
        Z();
        return this.e.i();
    }

    @Override // com.applovin.impl.qh
    public int j() {
        Z();
        return this.e.j();
    }

    @Override // com.applovin.impl.qh
    public po k() {
        Z();
        return this.e.k();
    }

    @Override // com.applovin.impl.qh
    public boolean l() {
        Z();
        return this.e.l();
    }

    public void c(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.w = true;
        this.f23303u = surfaceHolder;
        surfaceHolder.addCallback(this.f23288f);
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

    /* loaded from: classes.dex */
    public static final class d implements uq, v2, rh.b {

        /* renamed from: a, reason: collision with root package name */
        private uq f23330a;

        /* renamed from: b, reason: collision with root package name */
        private v2 f23331b;

        /* renamed from: c, reason: collision with root package name */
        private uq f23332c;
        private v2 d;

        private d() {
        }

        @Override // com.applovin.impl.rh.b
        public void a(int i2, Object obj) {
            if (i2 == 7) {
                this.f23330a = (uq) obj;
                return;
            }
            if (i2 == 8) {
                this.f23331b = (v2) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            rk rkVar = (rk) obj;
            if (rkVar == null) {
                this.f23332c = null;
                this.d = null;
            } else {
                this.f23332c = rkVar.getVideoFrameMetadataListener();
                this.d = rkVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.impl.v2
        public void a(long j2, float[] fArr) {
            v2 v2Var = this.d;
            if (v2Var != null) {
                v2Var.a(j2, fArr);
            }
            v2 v2Var2 = this.f23331b;
            if (v2Var2 != null) {
                v2Var2.a(j2, fArr);
            }
        }

        @Override // com.applovin.impl.v2
        public void a() {
            v2 v2Var = this.d;
            if (v2Var != null) {
                v2Var.a();
            }
            v2 v2Var2 = this.f23331b;
            if (v2Var2 != null) {
                v2Var2.a();
            }
        }

        @Override // com.applovin.impl.uq
        public void a(long j2, long j3, f9 f9Var, MediaFormat mediaFormat) {
            uq uqVar = this.f23332c;
            if (uqVar != null) {
                uqVar.a(j2, j3, f9Var, mediaFormat);
            }
            uq uqVar2 = this.f23330a;
            if (uqVar2 != null) {
                uqVar2.a(j2, j3, f9Var, mediaFormat);
            }
        }
    }

    @Override // com.applovin.impl.qh
    public void b(qh.e eVar) {
        b1.a(eVar);
        this.f23290h.add(eVar);
        a((qh.c) eVar);
    }

    @Override // com.applovin.impl.qh
    public boolean d() {
        Z();
        return this.e.d();
    }

    @Override // com.applovin.impl.qh
    public void b(SurfaceView surfaceView) {
        Z();
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.applovin.impl.qh
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.x) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.qh
    public void b() {
        Z();
        boolean l2 = l();
        int a2 = this.f23293k.a(l2, 2);
        a(l2, a2, b(l2, a2));
        this.e.b();
    }

    public void a(qh.c cVar) {
        b1.a(cVar);
        this.e.a(cVar);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.f23303u) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.qh
    public ph a() {
        Z();
        return this.e.a();
    }

    public void b(qh.c cVar) {
        this.e.e(cVar);
    }

    private void b(SurfaceHolder surfaceHolder) {
        this.w = false;
        this.f23303u = surfaceHolder;
        surfaceHolder.addCallback(this.f23288f);
        Surface surface = this.f23303u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f23303u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3) {
        if (i2 == this.A && i3 == this.B) {
            return;
        }
        this.A = i2;
        this.B = i3;
        this.f23291i.a(i2, i3);
        Iterator it = this.f23290h.iterator();
        while (it.hasNext()) {
            ((qh.e) it.next()).a(i2, i3);
        }
    }

    @Override // com.applovin.impl.qh
    public void a(qh.e eVar) {
        b1.a(eVar);
        this.f23290h.remove(eVar);
        b((qh.c) eVar);
    }

    @Override // com.applovin.impl.qh
    public void b(boolean z2) {
        Z();
        this.e.b(z2);
    }

    @Override // com.applovin.impl.qh
    public void a(int i2, long j2) {
        Z();
        this.f23291i.h();
        this.e.a(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r6 b(il ilVar) {
        return new r6(0, ilVar.b(), ilVar.a());
    }

    private void a(int i2, int i3, Object obj) {
        for (qi qiVar : this.f23286b) {
            if (qiVar.e() == i2) {
                this.e.a(qiVar).a(i3).a(obj).j();
            }
        }
    }

    public void a(be beVar) {
        Z();
        this.e.a(beVar);
    }

    @Override // com.applovin.impl.qh
    public void a(boolean z2) {
        Z();
        int a2 = this.f23293k.a(z2, o());
        a(z2, a2, b(z2, a2));
    }

    @Override // com.applovin.impl.qh
    public void a(int i2) {
        Z();
        this.e.a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.f23302t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        qi[] qiVarArr = this.f23286b;
        int length = qiVarArr.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                break;
            }
            qi qiVar = qiVarArr[i2];
            if (qiVar.e() == 2) {
                arrayList.add(this.e.a(qiVar).a(1).a(obj).j());
            }
            i2++;
        }
        Object obj2 = this.f23301s;
        if (obj2 == null || obj2 == obj) {
            z2 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((rh) it.next()).a(this.f23297o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z2 = false;
            Object obj3 = this.f23301s;
            Surface surface = this.f23302t;
            if (obj3 == surface) {
                surface.release();
                this.f23302t = null;
            }
        }
        this.f23301s = obj;
        if (z2) {
            this.e.a(false, a8.a(new g8(3), 1003));
        }
    }

    @Override // com.applovin.impl.qh
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof tq) {
            W();
            a((Object) surfaceView);
            b(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof rk) {
                W();
                this.f23304v = (rk) surfaceView;
                this.e.a(this.f23289g).a(10000).a(this.f23304v).j();
                this.f23304v.a(this.f23288f);
                a(this.f23304v.getVideoSurface());
                b(surfaceView.getHolder());
                return;
            }
            c(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.impl.qh
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            R();
            return;
        }
        W();
        this.x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            pc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f23288f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f2) {
        Z();
        float a2 = xp.a(f2, 0.0f, 1.0f);
        if (this.G == a2) {
            return;
        }
        this.G = a2;
        X();
        this.f23291i.a(a2);
        Iterator it = this.f23290h.iterator();
        while (it.hasNext()) {
            ((qh.e) it.next()).a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2, int i2, int i3) {
        int i4 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i4 = 1;
        }
        this.e.a(z3, i4, i3);
    }
}
