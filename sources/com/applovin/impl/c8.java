package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.be;
import com.applovin.impl.e8;
import com.applovin.impl.fe;
import com.applovin.impl.fo;
import com.applovin.impl.hc;
import com.applovin.impl.qh;
import com.applovin.impl.rh;
import com.applovin.impl.wj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class c8 extends d2 {
    private jj A;
    private wj B;
    private boolean C;
    private qh.b D;
    private vd E;
    private vd F;
    private oh G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b */
    final wo f23216b;

    /* renamed from: c */
    final qh.b f23217c;
    private final qi[] d;
    private final vo e;

    /* renamed from: f */
    private final ja f23218f;

    /* renamed from: g */
    private final e8.f f23219g;

    /* renamed from: h */
    private final e8 f23220h;

    /* renamed from: i */
    private final hc f23221i;

    /* renamed from: j */
    private final CopyOnWriteArraySet f23222j;

    /* renamed from: k */
    private final fo.b f23223k;

    /* renamed from: l */
    private final List f23224l;

    /* renamed from: m */
    private final boolean f23225m;

    /* renamed from: n */
    private final de f23226n;

    /* renamed from: o */
    private final r0 f23227o;

    /* renamed from: p */
    private final Looper f23228p;

    /* renamed from: q */
    private final y1 f23229q;

    /* renamed from: r */
    private final long f23230r;

    /* renamed from: s */
    private final long f23231s;

    /* renamed from: t */
    private final l3 f23232t;

    /* renamed from: u */
    private int f23233u;

    /* renamed from: v */
    private boolean f23234v;
    private int w;
    private int x;

    /* renamed from: y */
    private boolean f23235y;

    /* renamed from: z */
    private int f23236z;

    /* loaded from: classes3.dex */
    public static final class a implements ee {

        /* renamed from: a */
        private final Object f23237a;

        /* renamed from: b */
        private fo f23238b;

        public a(Object obj, fo foVar) {
            this.f23237a = obj;
            this.f23238b = foVar;
        }

        @Override // com.applovin.impl.ee
        public Object a() {
            return this.f23237a;
        }

        @Override // com.applovin.impl.ee
        public fo b() {
            return this.f23238b;
        }
    }

    public c8(qi[] qiVarArr, vo voVar, de deVar, lc lcVar, y1 y1Var, r0 r0Var, boolean z2, jj jjVar, long j2, long j3, kc kcVar, long j4, boolean z3, l3 l3Var, Looper looper, qh qhVar, qh.b bVar) {
        pc.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + xp.e + "]");
        b1.b(qiVarArr.length > 0);
        this.d = (qi[]) b1.a(qiVarArr);
        this.e = (vo) b1.a(voVar);
        this.f23226n = deVar;
        this.f23229q = y1Var;
        this.f23227o = r0Var;
        this.f23225m = z2;
        this.A = jjVar;
        this.f23230r = j2;
        this.f23231s = j3;
        this.C = z3;
        this.f23228p = looper;
        this.f23232t = l3Var;
        this.f23233u = 0;
        qh qhVar2 = qhVar != null ? qhVar : this;
        this.f23221i = new hc(looper, l3Var, new is(qhVar2, 1));
        this.f23222j = new CopyOnWriteArraySet();
        this.f23224l = new ArrayList();
        this.B = new wj.a(0);
        wo woVar = new wo(new si[qiVarArr.length], new h8[qiVarArr.length], null);
        this.f23216b = woVar;
        this.f23223k = new fo.b();
        qh.b a2 = new qh.b.a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, voVar.b()).a(bVar).a();
        this.f23217c = a2;
        this.D = new qh.b.a().a(a2).a(3).a(9).a();
        vd vdVar = vd.H;
        this.E = vdVar;
        this.F = vdVar;
        this.H = -1;
        this.f23218f = l3Var.a(looper, null);
        us usVar = new us(this, 0);
        this.f23219g = usVar;
        this.G = oh.a(woVar);
        if (r0Var != null) {
            r0Var.a(qhVar2, looper);
            b((qh.e) r0Var);
            y1Var.a(new Handler(looper), r0Var);
        }
        this.f23220h = new e8(qiVarArr, voVar, woVar, lcVar, y1Var, this.f23233u, this.f23234v, r0Var, jjVar, kcVar, j4, z3, looper, l3Var, usVar);
    }

    private fo R() {
        return new sh(this.f23224l, this.B);
    }

    private int U() {
        if (this.G.f25867a.c()) {
            return this.H;
        }
        oh ohVar = this.G;
        return ohVar.f25867a.a(ohVar.f25868b.f28191a, this.f23223k).f23950c;
    }

    private void X() {
        qh.b bVar = this.D;
        qh.b a2 = a(this.f23217c);
        this.D = a2;
        if (a2.equals(bVar)) {
            return;
        }
        this.f23221i.a(13, new us(this, 1));
    }

    @Override // com.applovin.impl.qh
    public int E() {
        if (d()) {
            return this.G.f25868b.f28192b;
        }
        return -1;
    }

    @Override // com.applovin.impl.qh
    public long F() {
        return this.f23230r;
    }

    public boolean S() {
        return this.G.f25880p;
    }

    @Override // com.applovin.impl.qh
    /* renamed from: T */
    public eb x() {
        return eb.h();
    }

    @Override // com.applovin.impl.qh
    /* renamed from: V */
    public a8 c() {
        return this.G.f25870f;
    }

    public void W() {
        pc.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + xp.e + "] [" + f8.a() + "]");
        if (!this.f23220h.x()) {
            this.f23221i.b(10, new rs(1));
        }
        this.f23221i.b();
        this.f23218f.a((Object) null);
        r0 r0Var = this.f23227o;
        if (r0Var != null) {
            this.f23229q.a(r0Var);
        }
        oh a2 = this.G.a(1);
        this.G = a2;
        oh a3 = a2.a(a2.f25868b);
        this.G = a3;
        a3.f25881q = a3.f25883s;
        this.G.f25882r = 0L;
    }

    @Override // com.applovin.impl.qh
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.qh
    public void b(SurfaceView surfaceView) {
    }

    public void c(long j2) {
        this.f23220h.a(j2);
    }

    @Override // com.applovin.impl.qh
    public long getCurrentPosition() {
        return t2.b(a(this.G));
    }

    @Override // com.applovin.impl.qh
    public long getDuration() {
        if (!d()) {
            return G();
        }
        oh ohVar = this.G;
        be.a aVar = ohVar.f25868b;
        ohVar.f25867a.a(aVar.f28191a, this.f23223k);
        return t2.b(this.f23223k.a(aVar.f28192b, aVar.f28193c));
    }

    private qh.f d(long j2) {
        td tdVar;
        Object obj;
        int i2;
        Object obj2;
        int t2 = t();
        if (this.G.f25867a.c()) {
            tdVar = null;
            obj = null;
            i2 = -1;
            obj2 = null;
        } else {
            oh ohVar = this.G;
            Object obj3 = ohVar.f25868b.f28191a;
            ohVar.f25867a.a(obj3, this.f23223k);
            i2 = this.G.f25867a.a(obj3);
            obj = obj3;
            obj2 = this.G.f25867a.a(t2, this.f23400a).f23961a;
            tdVar = this.f23400a.f23963c;
        }
        long b2 = t2.b(j2);
        long b3 = this.G.f25868b.a() ? t2.b(b(this.G)) : b2;
        be.a aVar = this.G.f25868b;
        return new qh.f(obj2, t2, tdVar, obj, i2, b2, b3, aVar.f28192b, aVar.f28193c);
    }

    @Override // com.applovin.impl.qh
    public to A() {
        return new to(this.G.f25873i.f27778c);
    }

    @Override // com.applovin.impl.qh
    public vd C() {
        return this.E;
    }

    @Override // com.applovin.impl.qh
    public void a(TextureView textureView) {
    }

    @Override // com.applovin.impl.qh
    public void b(TextureView textureView) {
    }

    @Override // com.applovin.impl.qh
    public long e() {
        return this.f23231s;
    }

    @Override // com.applovin.impl.qh
    public int f() {
        if (d()) {
            return this.G.f25868b.f28193c;
        }
        return -1;
    }

    @Override // com.applovin.impl.qh
    public long g() {
        if (d()) {
            oh ohVar = this.G;
            ohVar.f25867a.a(ohVar.f25868b.f28191a, this.f23223k);
            oh ohVar2 = this.G;
            if (ohVar2.f25869c == -9223372036854775807L) {
                return ohVar2.f25867a.a(t(), this.f23400a).b();
            }
            return this.f23223k.d() + t2.b(this.G.f25869c);
        }
        return getCurrentPosition();
    }

    @Override // com.applovin.impl.qh
    public long h() {
        return t2.b(this.G.f25882r);
    }

    @Override // com.applovin.impl.qh
    public qh.b i() {
        return this.D;
    }

    @Override // com.applovin.impl.qh
    public int j() {
        return this.G.f25877m;
    }

    @Override // com.applovin.impl.qh
    public po k() {
        return this.G.f25872h;
    }

    @Override // com.applovin.impl.qh
    public boolean l() {
        return this.G.f25876l;
    }

    @Override // com.applovin.impl.qh
    public int m() {
        return this.f23233u;
    }

    @Override // com.applovin.impl.qh
    public fo n() {
        return this.G.f25867a;
    }

    @Override // com.applovin.impl.qh
    public int o() {
        return this.G.e;
    }

    @Override // com.applovin.impl.qh
    public Looper p() {
        return this.f23228p;
    }

    @Override // com.applovin.impl.qh
    public long q() {
        return 3000L;
    }

    @Override // com.applovin.impl.qh
    public boolean r() {
        return this.f23234v;
    }

    @Override // com.applovin.impl.qh
    public long s() {
        if (this.G.f25867a.c()) {
            return this.J;
        }
        oh ohVar = this.G;
        if (ohVar.f25875k.d != ohVar.f25868b.d) {
            return ohVar.f25867a.a(t(), this.f23400a).d();
        }
        long j2 = ohVar.f25881q;
        if (this.G.f25875k.a()) {
            oh ohVar2 = this.G;
            fo.b a2 = ohVar2.f25867a.a(ohVar2.f25875k.f28191a, this.f23223k);
            long b2 = a2.b(this.G.f25875k.f28192b);
            j2 = b2 == Long.MIN_VALUE ? a2.d : b2;
        }
        oh ohVar3 = this.G;
        return t2.b(a(ohVar3.f25867a, ohVar3.f25875k, j2));
    }

    @Override // com.applovin.impl.qh
    public int t() {
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    @Override // com.applovin.impl.qh
    public int v() {
        if (this.G.f25867a.c()) {
            return this.I;
        }
        oh ohVar = this.G;
        return ohVar.f25867a.a(ohVar.f25868b.f28191a);
    }

    @Override // com.applovin.impl.qh
    public xq z() {
        return xq.f27975f;
    }

    private static boolean c(oh ohVar) {
        return ohVar.e == 3 && ohVar.f25876l && ohVar.f25877m == 0;
    }

    public static /* synthetic */ void e(oh ohVar, qh.c cVar) {
        cVar.b(ohVar.e);
    }

    public static /* synthetic */ void f(oh ohVar, qh.c cVar) {
        cVar.a(ohVar.f25877m);
    }

    public static /* synthetic */ void h(oh ohVar, qh.c cVar) {
        cVar.a(ohVar.f25878n);
    }

    public void a(b8 b8Var) {
        this.f23222j.add(b8Var);
    }

    @Override // com.applovin.impl.qh
    public void b(qh.e eVar) {
        a((qh.c) eVar);
    }

    private static long b(oh ohVar) {
        fo.d dVar = new fo.d();
        fo.b bVar = new fo.b();
        ohVar.f25867a.a(ohVar.f25868b.f28191a, bVar);
        if (ohVar.f25869c == -9223372036854775807L) {
            return ohVar.f25867a.a(bVar.f23950c, dVar).c();
        }
        return bVar.e() + ohVar.f25869c;
    }

    public /* synthetic */ void c(e8.e eVar) {
        this.f23218f.a((Runnable) new ms(1, this, eVar));
    }

    public void a(qh.c cVar) {
        this.f23221i.a(cVar);
    }

    public void e(qh.c cVar) {
        this.f23221i.b(cVar);
    }

    private Pair a(oh ohVar, oh ohVar2, boolean z2, int i2, boolean z3) {
        fo foVar = ohVar2.f25867a;
        fo foVar2 = ohVar.f25867a;
        if (foVar2.c() && foVar.c()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i3 = 3;
        if (foVar2.c() != foVar.c()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (foVar.a(foVar.a(ohVar2.f25868b.f28191a, this.f23223k).f23950c, this.f23400a).f23961a.equals(foVar2.a(foVar2.a(ohVar.f25868b.f28191a, this.f23223k).f23950c, this.f23400a).f23961a)) {
            if (z2 && i2 == 0 && ohVar2.f25868b.d < ohVar.f25868b.d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return new Pair(Boolean.FALSE, -1);
        }
        if (z2 && i2 == 0) {
            i3 = 1;
        } else if (z2 && i2 == 1) {
            i3 = 2;
        } else if (!z3) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i3));
    }

    public static /* synthetic */ void c(qh.c cVar) {
        cVar.a(a8.a(new g8(1), 1003));
    }

    public static /* synthetic */ void c(oh ohVar, qh.c cVar) {
        cVar.e(ohVar.f25871g);
        cVar.c(ohVar.f25871g);
    }

    public static /* synthetic */ void g(oh ohVar, qh.c cVar) {
        cVar.d(c(ohVar));
    }

    public /* synthetic */ void b(qh.c cVar) {
        cVar.a(this.E);
    }

    public static /* synthetic */ void b(oh ohVar, qh.c cVar) {
        cVar.a(ohVar.f25870f);
    }

    public static /* synthetic */ void b(oh ohVar, int i2, qh.c cVar) {
        cVar.a(ohVar.f25867a, i2);
    }

    @Override // com.applovin.impl.qh
    public void b() {
        oh ohVar = this.G;
        if (ohVar.e != 1) {
            return;
        }
        oh a2 = ohVar.a((a8) null);
        oh a3 = a2.a(a2.f25867a.c() ? 4 : 2);
        this.w++;
        this.f23220h.v();
        a(a3, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.applovin.impl.qh
    public boolean d() {
        return this.G.f25868b.a();
    }

    public /* synthetic */ void d(qh.c cVar) {
        cVar.a(this.D);
    }

    public static /* synthetic */ void d(oh ohVar, qh.c cVar) {
        cVar.b(ohVar.f25876l, ohVar.e);
    }

    private void b(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.f23224l.remove(i4);
        }
        this.B = this.B.a(i2, i3);
    }

    @Override // com.applovin.impl.qh
    public void b(final boolean z2) {
        if (this.f23234v != z2) {
            this.f23234v = z2;
            this.f23220h.f(z2);
            this.f23221i.a(9, new hc.a() { // from class: com.applovin.impl.vs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    ((qh.c) obj).b(z2);
                }
            });
            X();
            this.f23221i.a();
        }
    }

    private long a(oh ohVar) {
        if (ohVar.f25867a.c()) {
            return t2.a(this.J);
        }
        if (ohVar.f25868b.a()) {
            return ohVar.f25883s;
        }
        return a(ohVar.f25867a, ohVar.f25868b, ohVar.f25883s);
    }

    private Pair a(fo foVar, fo foVar2) {
        long g2 = g();
        if (!foVar.c() && !foVar2.c()) {
            Pair a2 = foVar.a(this.f23400a, this.f23223k, t(), t2.a(g2));
            Object obj = ((Pair) xp.a(a2)).first;
            if (foVar2.a(obj) != -1) {
                return a2;
            }
            Object a3 = e8.a(this.f23400a, this.f23223k, this.f23233u, this.f23234v, obj, foVar, foVar2);
            if (a3 != null) {
                foVar2.a(a3, this.f23223k);
                int i2 = this.f23223k.f23950c;
                return a(foVar2, i2, foVar2.a(i2, this.f23400a).b());
            }
            return a(foVar2, -1, -9223372036854775807L);
        }
        boolean z2 = !foVar.c() && foVar2.c();
        int U = z2 ? -1 : U();
        if (z2) {
            g2 = -9223372036854775807L;
        }
        return a(foVar2, U, g2);
    }

    private Pair a(fo foVar, int i2, long j2) {
        if (foVar.c()) {
            this.H = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.J = j2;
            this.I = 0;
            return null;
        }
        if (i2 == -1 || i2 >= foVar.b()) {
            i2 = foVar.a(this.f23234v);
            j2 = foVar.a(i2, this.f23400a).b();
        }
        return foVar.a(this.f23400a, this.f23223k, i2, t2.a(j2));
    }

    @Override // com.applovin.impl.qh
    public ph a() {
        return this.G.f25878n;
    }

    private qh.f a(int i2, oh ohVar, int i3) {
        int i4;
        Object obj;
        td tdVar;
        Object obj2;
        int i5;
        long j2;
        long j3;
        long b2;
        long j4;
        fo.b bVar = new fo.b();
        if (ohVar.f25867a.c()) {
            i4 = i3;
            obj = null;
            tdVar = null;
            obj2 = null;
            i5 = -1;
        } else {
            Object obj3 = ohVar.f25868b.f28191a;
            ohVar.f25867a.a(obj3, bVar);
            int i6 = bVar.f23950c;
            int a2 = ohVar.f25867a.a(obj3);
            Object obj4 = ohVar.f25867a.a(i6, this.f23400a).f23961a;
            tdVar = this.f23400a.f23963c;
            obj2 = obj3;
            i5 = a2;
            obj = obj4;
            i4 = i6;
        }
        if (i2 == 0) {
            j2 = bVar.f23951f + bVar.d;
            if (ohVar.f25868b.a()) {
                be.a aVar = ohVar.f25868b;
                j3 = bVar.a(aVar.f28192b, aVar.f28193c);
                b2 = b(ohVar);
                long j5 = b2;
                j4 = j3;
                j2 = j5;
            } else {
                if (ohVar.f25868b.e != -1 && this.G.f25868b.a()) {
                    j2 = b(this.G);
                }
                j4 = j2;
            }
        } else if (ohVar.f25868b.a()) {
            j3 = ohVar.f25883s;
            b2 = b(ohVar);
            long j52 = b2;
            j4 = j3;
            j2 = j52;
        } else {
            j2 = bVar.f23951f + ohVar.f25883s;
            j4 = j2;
        }
        long b3 = t2.b(j4);
        long b4 = t2.b(j2);
        be.a aVar2 = ohVar.f25868b;
        return new qh.f(obj, i4, tdVar, obj2, i5, b3, b4, aVar2.f28192b, aVar2.f28193c);
    }

    /* renamed from: a */
    public void b(e8.e eVar) {
        long j2;
        boolean z2;
        long j3;
        int i2 = this.w - eVar.f23645c;
        this.w = i2;
        boolean z3 = true;
        if (eVar.d) {
            this.x = eVar.e;
            this.f23235y = true;
        }
        if (eVar.f23646f) {
            this.f23236z = eVar.f23647g;
        }
        if (i2 == 0) {
            fo foVar = eVar.f23644b.f25867a;
            if (!this.G.f25867a.c() && foVar.c()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!foVar.c()) {
                List d = ((sh) foVar).d();
                b1.b(d.size() == this.f23224l.size());
                for (int i3 = 0; i3 < d.size(); i3++) {
                    ((a) this.f23224l.get(i3)).f23238b = (fo) d.get(i3);
                }
            }
            if (this.f23235y) {
                if (eVar.f23644b.f25868b.equals(this.G.f25868b) && eVar.f23644b.d == this.G.f25883s) {
                    z3 = false;
                }
                if (z3) {
                    if (!foVar.c() && !eVar.f23644b.f25868b.a()) {
                        oh ohVar = eVar.f23644b;
                        j3 = a(foVar, ohVar.f25868b, ohVar.d);
                    } else {
                        j3 = eVar.f23644b.d;
                    }
                    j2 = j3;
                } else {
                    j2 = -9223372036854775807L;
                }
                z2 = z3;
            } else {
                j2 = -9223372036854775807L;
                z2 = false;
            }
            this.f23235y = false;
            a(eVar.f23644b, 1, this.f23236z, false, z2, this.x, j2, -1);
        }
    }

    public static /* synthetic */ void a(qh qhVar, qh.c cVar, b9 b9Var) {
        cVar.a(qhVar, new qh.d(b9Var));
    }

    public static /* synthetic */ void a(int i2, qh.f fVar, qh.f fVar2, qh.c cVar) {
        cVar.e(i2);
        cVar.a(fVar, fVar2, i2);
    }

    public static /* synthetic */ void a(oh ohVar, qh.c cVar) {
        cVar.b(ohVar.f25870f);
    }

    public static /* synthetic */ void a(oh ohVar, to toVar, qh.c cVar) {
        cVar.a(ohVar.f25872h, toVar);
    }

    public static /* synthetic */ void a(oh ohVar, int i2, qh.c cVar) {
        cVar.a(ohVar.f25876l, i2);
    }

    private oh a(oh ohVar, fo foVar, Pair pair) {
        be.a aVar;
        wo woVar;
        oh a2;
        long j2;
        b1.a(foVar.c() || pair != null);
        fo foVar2 = ohVar.f25867a;
        oh a3 = ohVar.a(foVar);
        if (foVar.c()) {
            be.a a4 = oh.a();
            long a5 = t2.a(this.J);
            oh a6 = a3.a(a4, a5, a5, a5, 0L, po.d, this.f23216b, eb.h()).a(a4);
            a6.f25881q = a6.f25883s;
            return a6;
        }
        Object obj = a3.f25868b.f28191a;
        boolean z2 = !obj.equals(((Pair) xp.a(pair)).first);
        be.a aVar2 = z2 ? new be.a(pair.first) : a3.f25868b;
        long longValue = ((Long) pair.second).longValue();
        long a7 = t2.a(g());
        if (!foVar2.c()) {
            a7 -= foVar2.a(obj, this.f23223k).e();
        }
        if (z2 || longValue < a7) {
            b1.b(!aVar2.a());
            po poVar = z2 ? po.d : a3.f25872h;
            if (z2) {
                aVar = aVar2;
                woVar = this.f23216b;
            } else {
                aVar = aVar2;
                woVar = a3.f25873i;
            }
            oh a8 = a3.a(aVar, longValue, longValue, longValue, 0L, poVar, woVar, z2 ? eb.h() : a3.f25874j).a(aVar);
            a8.f25881q = longValue;
            return a8;
        }
        if (longValue == a7) {
            int a9 = foVar.a(a3.f25875k.f28191a);
            if (a9 != -1 && foVar.a(a9, this.f23223k).f23950c == foVar.a(aVar2.f28191a, this.f23223k).f23950c) {
                return a3;
            }
            foVar.a(aVar2.f28191a, this.f23223k);
            if (aVar2.a()) {
                j2 = this.f23223k.a(aVar2.f28192b, aVar2.f28193c);
            } else {
                j2 = this.f23223k.d;
            }
            a2 = a3.a(aVar2, a3.f25883s, a3.f25883s, a3.d, j2 - a3.f25883s, a3.f25872h, a3.f25873i, a3.f25874j).a(aVar2);
            a2.f25881q = j2;
        } else {
            b1.b(!aVar2.a());
            long max = Math.max(0L, a3.f25882r - (longValue - a7));
            long j3 = a3.f25881q;
            if (a3.f25875k.equals(a3.f25868b)) {
                j3 = longValue + max;
            }
            a2 = a3.a(aVar2, longValue, longValue, longValue, max, a3.f25872h, a3.f25873i, a3.f25874j);
            a2.f25881q = j3;
        }
        return a2;
    }

    public void a(bf bfVar) {
        vd a2 = this.E.a().a(bfVar).a();
        if (a2.equals(this.E)) {
            return;
        }
        this.E = a2;
        this.f23221i.b(14, new us(this, 2));
    }

    private long a(fo foVar, be.a aVar, long j2) {
        foVar.a(aVar.f28191a, this.f23223k);
        return this.f23223k.e() + j2;
    }

    @Override // com.applovin.impl.qh
    public void a(qh.e eVar) {
        e(eVar);
    }

    private oh a(int i2, int i3) {
        b1.a(i2 >= 0 && i3 >= i2 && i3 <= this.f23224l.size());
        int t2 = t();
        fo n2 = n();
        int size = this.f23224l.size();
        this.w++;
        b(i2, i3);
        fo R = R();
        oh a2 = a(this.G, R, a(n2, R));
        int i4 = a2.e;
        if (i4 != 1 && i4 != 4 && i2 < i3 && i3 == size && t2 >= a2.f25867a.b()) {
            a2 = a2.a(4);
        }
        this.f23220h.b(i2, i3, this.B);
        return a2;
    }

    @Override // com.applovin.impl.qh
    public void a(int i2, long j2) {
        fo foVar = this.G.f25867a;
        if (i2 >= 0 && (foVar.c() || i2 < foVar.b())) {
            this.w++;
            if (d()) {
                pc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                e8.e eVar = new e8.e(this.G);
                eVar.a(1);
                this.f23219g.a(eVar);
                return;
            }
            int i3 = o() != 1 ? 2 : 1;
            int t2 = t();
            oh a2 = a(this.G.a(i3), foVar, a(foVar, i2, j2));
            this.f23220h.a(foVar, i2, t2.a(j2));
            a(a2, 0, 1, true, true, 1, a(a2), t2);
            return;
        }
        throw new bb(foVar, i2, j2);
    }

    public void a(be beVar) {
        a(Collections.singletonList(beVar));
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z2) {
        a(list, -1, -9223372036854775807L, z2);
    }

    private void a(List list, int i2, long j2, boolean z2) {
        int i3;
        long j3;
        int U = U();
        long currentPosition = getCurrentPosition();
        this.w++;
        if (!this.f23224l.isEmpty()) {
            b(0, this.f23224l.size());
        }
        List a2 = a(0, list);
        fo R = R();
        if (!R.c() && i2 >= R.b()) {
            throw new bb(R, i2, j2);
        }
        if (z2) {
            j3 = -9223372036854775807L;
            i3 = R.a(this.f23234v);
        } else if (i2 == -1) {
            i3 = U;
            j3 = currentPosition;
        } else {
            i3 = i2;
            j3 = j2;
        }
        oh a3 = a(this.G, R, a(R, i3, j3));
        int i4 = a3.e;
        if (i3 != -1 && i4 != 1) {
            i4 = (R.c() || i3 >= R.b()) ? 4 : 2;
        }
        oh a4 = a3.a(i4);
        this.f23220h.a(a2, i3, t2.a(j3), this.B);
        a(a4, 0, 1, false, (this.G.f25868b.f28191a.equals(a4.f25868b.f28191a) || this.G.f25867a.c()) ? false : true, 4, a(a4), -1);
    }

    @Override // com.applovin.impl.qh
    public void a(boolean z2) {
        a(z2, 0, 1);
    }

    public void a(boolean z2, int i2, int i3) {
        oh ohVar = this.G;
        if (ohVar.f25876l == z2 && ohVar.f25877m == i2) {
            return;
        }
        this.w++;
        oh a2 = ohVar.a(z2, i2);
        this.f23220h.a(z2, i2);
        a(a2, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.applovin.impl.qh
    public void a(int i2) {
        if (this.f23233u != i2) {
            this.f23233u = i2;
            this.f23220h.a(i2);
            this.f23221i.a(8, new at(i2));
            X();
            this.f23221i.a();
        }
    }

    public void a(boolean z2, a8 a8Var) {
        oh a2;
        if (z2) {
            a2 = a(0, this.f23224l.size()).a((a8) null);
        } else {
            oh ohVar = this.G;
            a2 = ohVar.a(ohVar.f25868b);
            a2.f25881q = a2.f25883s;
            a2.f25882r = 0L;
        }
        oh a3 = a2.a(1);
        if (a8Var != null) {
            a3 = a3.a(a8Var);
        }
        oh ohVar2 = a3;
        this.w++;
        this.f23220h.G();
        a(ohVar2, 0, 1, false, ohVar2.f25867a.c() && !this.G.f25867a.c(), 4, a(ohVar2), -1);
    }

    private void a(final oh ohVar, final int i2, final int i3, boolean z2, boolean z3, int i4, long j2, int i5) {
        oh ohVar2 = this.G;
        this.G = ohVar;
        final int i6 = 1;
        Pair a2 = a(ohVar, ohVar2, z3, i4, !ohVar2.f25867a.equals(ohVar.f25867a));
        boolean booleanValue = ((Boolean) a2.first).booleanValue();
        final int intValue = ((Integer) a2.second).intValue();
        vd vdVar = this.E;
        if (booleanValue) {
            r3 = ohVar.f25867a.c() ? null : ohVar.f25867a.a(ohVar.f25867a.a(ohVar.f25868b.f28191a, this.f23223k).f23950c, this.f23400a).f23963c;
            vdVar = r3 != null ? r3.d : vd.H;
        }
        if (!ohVar2.f25874j.equals(ohVar.f25874j)) {
            vdVar = vdVar.a().a(ohVar.f25874j).a();
        }
        boolean z4 = !vdVar.equals(this.E);
        this.E = vdVar;
        final int i7 = 0;
        if (!ohVar2.f25867a.equals(ohVar.f25867a)) {
            this.f23221i.a(0, new hc.a() { // from class: com.applovin.impl.ws
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i8 = i7;
                    int i9 = i2;
                    Object obj2 = ohVar;
                    switch (i8) {
                        case 0:
                            c8.b((oh) obj2, i9, (qh.c) obj);
                            return;
                        case 1:
                            c8.a((oh) obj2, i9, (qh.c) obj);
                            return;
                        default:
                            ((qh.c) obj).a((td) obj2, i9);
                            return;
                    }
                }
            });
        }
        if (z3) {
            this.f23221i.a(11, new ys(a(i4, ohVar2, i5), d(j2), i4));
        }
        final int i8 = 2;
        if (booleanValue) {
            this.f23221i.a(1, new hc.a() { // from class: com.applovin.impl.ws
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i82 = i8;
                    int i9 = intValue;
                    Object obj2 = r3;
                    switch (i82) {
                        case 0:
                            c8.b((oh) obj2, i9, (qh.c) obj);
                            return;
                        case 1:
                            c8.a((oh) obj2, i9, (qh.c) obj);
                            return;
                        default:
                            ((qh.c) obj).a((td) obj2, i9);
                            return;
                    }
                }
            });
        }
        final int i9 = 4;
        final int i10 = 3;
        if (ohVar2.f25870f != ohVar.f25870f) {
            this.f23221i.a(10, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i11 = i10;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i11) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
            if (ohVar.f25870f != null) {
                this.f23221i.a(10, new hc.a() { // from class: com.applovin.impl.xs
                    @Override // com.applovin.impl.hc.a
                    public final void a(Object obj) {
                        int i11 = i9;
                        oh ohVar3 = ohVar;
                        qh.c cVar = (qh.c) obj;
                        switch (i11) {
                            case 0:
                                c8.f(ohVar3, cVar);
                                return;
                            case 1:
                                c8.g(ohVar3, cVar);
                                return;
                            case 2:
                                c8.h(ohVar3, cVar);
                                return;
                            case 3:
                                c8.a(ohVar3, cVar);
                                return;
                            case 4:
                                c8.b(ohVar3, cVar);
                                return;
                            case 5:
                                c8.c(ohVar3, cVar);
                                return;
                            case 6:
                                c8.d(ohVar3, cVar);
                                return;
                            default:
                                c8.e(ohVar3, cVar);
                                return;
                        }
                    }
                });
            }
        }
        wo woVar = ohVar2.f25873i;
        wo woVar2 = ohVar.f25873i;
        if (woVar != woVar2) {
            this.e.a(woVar2.d);
            this.f23221i.a(2, new zs(0, ohVar, new to(ohVar.f25873i.f27778c)));
        }
        if (z4) {
            this.f23221i.a(14, new is(this.E, 2));
        }
        final int i11 = 5;
        if (ohVar2.f25871g != ohVar.f25871g) {
            this.f23221i.a(3, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i11;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        final int i12 = 6;
        if (ohVar2.e != ohVar.e || ohVar2.f25876l != ohVar.f25876l) {
            this.f23221i.a(-1, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i12;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        final int i13 = 7;
        if (ohVar2.e != ohVar.e) {
            this.f23221i.a(4, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i13;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        if (ohVar2.f25876l != ohVar.f25876l) {
            this.f23221i.a(5, new hc.a() { // from class: com.applovin.impl.ws
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i82 = i6;
                    int i92 = i3;
                    Object obj2 = ohVar;
                    switch (i82) {
                        case 0:
                            c8.b((oh) obj2, i92, (qh.c) obj);
                            return;
                        case 1:
                            c8.a((oh) obj2, i92, (qh.c) obj);
                            return;
                        default:
                            ((qh.c) obj).a((td) obj2, i92);
                            return;
                    }
                }
            });
        }
        if (ohVar2.f25877m != ohVar.f25877m) {
            this.f23221i.a(6, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i7;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        if (c(ohVar2) != c(ohVar)) {
            this.f23221i.a(7, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i6;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        if (!ohVar2.f25878n.equals(ohVar.f25878n)) {
            this.f23221i.a(12, new hc.a() { // from class: com.applovin.impl.xs
                @Override // com.applovin.impl.hc.a
                public final void a(Object obj) {
                    int i112 = i8;
                    oh ohVar3 = ohVar;
                    qh.c cVar = (qh.c) obj;
                    switch (i112) {
                        case 0:
                            c8.f(ohVar3, cVar);
                            return;
                        case 1:
                            c8.g(ohVar3, cVar);
                            return;
                        case 2:
                            c8.h(ohVar3, cVar);
                            return;
                        case 3:
                            c8.a(ohVar3, cVar);
                            return;
                        case 4:
                            c8.b(ohVar3, cVar);
                            return;
                        case 5:
                            c8.c(ohVar3, cVar);
                            return;
                        case 6:
                            c8.d(ohVar3, cVar);
                            return;
                        default:
                            c8.e(ohVar3, cVar);
                            return;
                    }
                }
            });
        }
        if (z2) {
            this.f23221i.a(-1, new rs(7));
        }
        X();
        this.f23221i.a();
        if (ohVar2.f25879o != ohVar.f25879o) {
            Iterator it = this.f23222j.iterator();
            while (it.hasNext()) {
                ((b8) it.next()).f(ohVar.f25879o);
            }
        }
        if (ohVar2.f25880p != ohVar.f25880p) {
            Iterator it2 = this.f23222j.iterator();
            while (it2.hasNext()) {
                ((b8) it2.next()).g(ohVar.f25880p);
            }
        }
    }

    public rh a(rh.b bVar) {
        return new rh(this.f23220h, bVar, this.G.f25867a, t(), this.f23232t, this.f23220h.g());
    }

    private List a(int i2, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            fe.c cVar = new fe.c((be) list.get(i3), this.f23225m);
            arrayList.add(cVar);
            this.f23224l.add(i3 + i2, new a(cVar.f23911b, cVar.f23910a.i()));
        }
        this.B = this.B.b(i2, arrayList.size());
        return arrayList;
    }
}
