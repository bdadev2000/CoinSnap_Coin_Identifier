package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.ae;
import com.applovin.impl.c8;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.tj;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a8 extends c2 {
    private fj A;
    private tj B;
    private boolean C;
    private nh.b D;
    private qd E;
    private qd F;
    private lh G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b */
    final xo f3586b;

    /* renamed from: c */
    final nh.b f3587c;

    /* renamed from: d */
    private final li[] f3588d;

    /* renamed from: e */
    private final wo f3589e;

    /* renamed from: f */
    private final ha f3590f;

    /* renamed from: g */
    private final c8.f f3591g;

    /* renamed from: h */
    private final c8 f3592h;

    /* renamed from: i */
    private final cc f3593i;

    /* renamed from: j */
    private final CopyOnWriteArraySet f3594j;

    /* renamed from: k */
    private final go.b f3595k;

    /* renamed from: l */
    private final List f3596l;

    /* renamed from: m */
    private final boolean f3597m;

    /* renamed from: n */
    private final yd f3598n;

    /* renamed from: o */
    private final r0 f3599o;

    /* renamed from: p */
    private final Looper f3600p;

    /* renamed from: q */
    private final x1 f3601q;

    /* renamed from: r */
    private final long f3602r;

    /* renamed from: s */
    private final long f3603s;

    /* renamed from: t */
    private final j3 f3604t;
    private int u;

    /* renamed from: v */
    private boolean f3605v;

    /* renamed from: w */
    private int f3606w;

    /* renamed from: x */
    private int f3607x;

    /* renamed from: y */
    private boolean f3608y;

    /* renamed from: z */
    private int f3609z;

    /* loaded from: classes.dex */
    public static final class a implements zd {
        private final Object a;

        /* renamed from: b */
        private go f3610b;

        public a(Object obj, go goVar) {
            this.a = obj;
            this.f3610b = goVar;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.f3610b;
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.a;
        }
    }

    public a8(li[] liVarArr, wo woVar, yd ydVar, gc gcVar, x1 x1Var, r0 r0Var, boolean z10, fj fjVar, long j3, long j10, fc fcVar, long j11, boolean z11, j3 j3Var, Looper looper, nh nhVar, nh.b bVar) {
        kc.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.f9256e + "]");
        a1.b(liVarArr.length > 0);
        this.f3588d = (li[]) a1.a(liVarArr);
        this.f3589e = (wo) a1.a(woVar);
        this.f3598n = ydVar;
        this.f3601q = x1Var;
        this.f3599o = r0Var;
        this.f3597m = z10;
        this.A = fjVar;
        this.f3602r = j3;
        this.f3603s = j10;
        this.C = z11;
        this.f3600p = looper;
        this.f3604t = j3Var;
        this.u = 0;
        nh nhVar2 = nhVar != null ? nhVar : this;
        this.f3593i = new cc(looper, j3Var, new js(nhVar2, 0));
        this.f3594j = new CopyOnWriteArraySet();
        this.f3596l = new ArrayList();
        this.B = new tj.a(0);
        xo xoVar = new xo(new ni[liVarArr.length], new f8[liVarArr.length], null);
        this.f3586b = xoVar;
        this.f3595k = new go.b();
        nh.b a10 = new nh.b.a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, woVar.b()).a(bVar).a();
        this.f3587c = a10;
        this.D = new nh.b.a().a(a10).a(3).a(9).a();
        qd qdVar = qd.H;
        this.E = qdVar;
        this.F = qdVar;
        this.H = -1;
        this.f3590f = j3Var.a(looper, null);
        ks ksVar = new ks(this, 0);
        this.f3591g = ksVar;
        this.G = lh.a(xoVar);
        if (r0Var != null) {
            r0Var.a(nhVar2, looper);
            b((nh.e) r0Var);
            x1Var.a(new Handler(looper), r0Var);
        }
        this.f3592h = new c8(liVarArr, woVar, xoVar, gcVar, x1Var, this.u, this.f3605v, r0Var, fjVar, fcVar, j11, z11, looper, j3Var, ksVar);
    }

    private int U() {
        if (this.G.a.c()) {
            return this.H;
        }
        lh lhVar = this.G;
        return lhVar.a.a(lhVar.f5864b.a, this.f3595k).f4958c;
    }

    private void X() {
        nh.b bVar = this.D;
        nh.b a10 = a(this.f3587c);
        this.D = a10;
        if (!a10.equals(bVar)) {
            this.f3593i.a(13, new ks(this, 1));
        }
    }

    private nh.f d(long j3) {
        od odVar;
        Object obj;
        int i10;
        Object obj2;
        int t5 = t();
        if (this.G.a.c()) {
            odVar = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        } else {
            lh lhVar = this.G;
            Object obj3 = lhVar.f5864b.a;
            lhVar.a.a(obj3, this.f3595k);
            i10 = this.G.a.a(obj3);
            obj = obj3;
            obj2 = this.G.a.a(t5, this.a).a;
            odVar = this.a.f4971c;
        }
        long b3 = r2.b(j3);
        long b10 = this.G.f5864b.a() ? r2.b(b(this.G)) : b3;
        wd.a aVar = this.G.f5864b;
        return new nh.f(obj2, t5, odVar, obj, i10, b3, b10, aVar.f8260b, aVar.f8261c);
    }

    @Override // com.applovin.impl.nh
    /* renamed from: V */
    public y7 c() {
        return this.G.f5868f;
    }

    public void W() {
        kc.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.f9256e + "] [" + d8.a() + "]");
        if (!this.f3592h.x()) {
            this.f3593i.b(10, new ss(0));
        }
        this.f3593i.b();
        this.f3590f.a((Object) null);
        r0 r0Var = this.f3599o;
        if (r0Var != null) {
            this.f3601q.a(r0Var);
        }
        lh a10 = this.G.a(1);
        this.G = a10;
        lh a11 = a10.a(a10.f5864b);
        this.G = a11;
        a11.f5879q = a11.f5881s;
        this.G.f5880r = 0L;
    }

    @Override // com.applovin.impl.nh
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.nh
    public void b(SurfaceView surfaceView) {
    }

    public void c(long j3) {
        this.f3592h.a(j3);
    }

    @Override // com.applovin.impl.nh
    public long e() {
        return this.f3603s;
    }

    @Override // com.applovin.impl.nh
    public int f() {
        if (d()) {
            return this.G.f5864b.f8261c;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public long g() {
        if (d()) {
            lh lhVar = this.G;
            lhVar.a.a(lhVar.f5864b.a, this.f3595k);
            lh lhVar2 = this.G;
            if (lhVar2.f5865c == C.TIME_UNSET) {
                return lhVar2.a.a(t(), this.a).b();
            }
            return this.f3595k.d() + r2.b(this.G.f5865c);
        }
        return getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        return r2.b(a(this.G));
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        if (d()) {
            lh lhVar = this.G;
            wd.a aVar = lhVar.f5864b;
            lhVar.a.a(aVar.a, this.f3595k);
            return r2.b(this.f3595k.a(aVar.f8260b, aVar.f8261c));
        }
        return G();
    }

    @Override // com.applovin.impl.nh
    public long h() {
        return r2.b(this.G.f5880r);
    }

    private go R() {
        return new ph(this.f3596l, this.B);
    }

    public static /* synthetic */ void e(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f5867e);
    }

    public static /* synthetic */ void f(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f5875m);
    }

    public static /* synthetic */ void h(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f5876n);
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        return new uo(this.G.f5871i.f9070c);
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.E;
    }

    @Override // com.applovin.impl.nh
    public int E() {
        if (d()) {
            return this.G.f5864b.f8260b;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public long F() {
        return this.f3602r;
    }

    public boolean S() {
        return this.G.f5878p;
    }

    @Override // com.applovin.impl.nh
    /* renamed from: T */
    public ab x() {
        return ab.h();
    }

    @Override // com.applovin.impl.nh
    public void a(TextureView textureView) {
    }

    @Override // com.applovin.impl.nh
    public void b(TextureView textureView) {
    }

    @Override // com.applovin.impl.nh
    public nh.b i() {
        return this.D;
    }

    @Override // com.applovin.impl.nh
    public int j() {
        return this.G.f5875m;
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        return this.G.f5870h;
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        return this.G.f5874l;
    }

    @Override // com.applovin.impl.nh
    public int m() {
        return this.u;
    }

    @Override // com.applovin.impl.nh
    public go n() {
        return this.G.a;
    }

    @Override // com.applovin.impl.nh
    public int o() {
        return this.G.f5867e;
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.f3600p;
    }

    @Override // com.applovin.impl.nh
    public long q() {
        return 3000L;
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        return this.f3605v;
    }

    @Override // com.applovin.impl.nh
    public long s() {
        if (this.G.a.c()) {
            return this.J;
        }
        lh lhVar = this.G;
        if (lhVar.f5873k.f8262d != lhVar.f5864b.f8262d) {
            return lhVar.a.a(t(), this.a).d();
        }
        long j3 = lhVar.f5879q;
        if (this.G.f5873k.a()) {
            lh lhVar2 = this.G;
            go.b a10 = lhVar2.a.a(lhVar2.f5873k.a, this.f3595k);
            long b3 = a10.b(this.G.f5873k.f8260b);
            j3 = b3 == Long.MIN_VALUE ? a10.f4959d : b3;
        }
        lh lhVar3 = this.G;
        return r2.b(a(lhVar3.a, lhVar3.f5873k, j3));
    }

    @Override // com.applovin.impl.nh
    public int t() {
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    @Override // com.applovin.impl.nh
    public int v() {
        if (this.G.a.c()) {
            return this.I;
        }
        lh lhVar = this.G;
        return lhVar.a.a(lhVar.f5864b.a);
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return yq.f9267f;
    }

    private static boolean c(lh lhVar) {
        return lhVar.f5867e == 3 && lhVar.f5874l && lhVar.f5875m == 0;
    }

    public void a(z7 z7Var) {
        this.f3594j.add(z7Var);
    }

    @Override // com.applovin.impl.nh
    public void b(nh.e eVar) {
        a((nh.c) eVar);
    }

    public void e(nh.c cVar) {
        this.f3593i.b(cVar);
    }

    private static long b(lh lhVar) {
        go.d dVar = new go.d();
        go.b bVar = new go.b();
        lhVar.a.a(lhVar.f5864b.a, bVar);
        if (lhVar.f5865c == C.TIME_UNSET) {
            return lhVar.a.a(bVar.f4958c, dVar).c();
        }
        return bVar.e() + lhVar.f5865c;
    }

    public /* synthetic */ void c(c8.e eVar) {
        this.f3590f.a((Runnable) new rs(0, this, eVar));
    }

    public void a(nh.c cVar) {
        this.f3593i.a(cVar);
    }

    private Pair a(lh lhVar, lh lhVar2, boolean z10, int i10, boolean z11) {
        go goVar = lhVar2.a;
        go goVar2 = lhVar.a;
        if (goVar2.c() && goVar.c()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (goVar2.c() != goVar.c()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (goVar.a(goVar.a(lhVar2.f5864b.a, this.f3595k).f4958c, this.a).a.equals(goVar2.a(goVar2.a(lhVar.f5864b.a, this.f3595k).f4958c, this.a).a)) {
            if (z10 && i10 == 0 && lhVar2.f5864b.f8262d < lhVar.f5864b.f8262d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    public static /* synthetic */ void c(nh.c cVar) {
        cVar.a(y7.a(new e8(1), 1003));
    }

    public static /* synthetic */ void g(lh lhVar, nh.c cVar) {
        cVar.d(c(lhVar));
    }

    public static /* synthetic */ void c(lh lhVar, nh.c cVar) {
        cVar.e(lhVar.f5869g);
        cVar.c(lhVar.f5869g);
    }

    public /* synthetic */ void b(nh.c cVar) {
        cVar.a(this.E);
    }

    public static /* synthetic */ void b(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f5868f);
    }

    public static /* synthetic */ void b(lh lhVar, int i10, nh.c cVar) {
        cVar.a(lhVar.a, i10);
    }

    @Override // com.applovin.impl.nh
    public boolean d() {
        return this.G.f5864b.a();
    }

    public /* synthetic */ void d(nh.c cVar) {
        cVar.a(this.D);
    }

    @Override // com.applovin.impl.nh
    public void b() {
        lh lhVar = this.G;
        if (lhVar.f5867e != 1) {
            return;
        }
        lh a10 = lhVar.a((y7) null);
        lh a11 = a10.a(a10.a.c() ? 4 : 2);
        this.f3606w++;
        this.f3592h.v();
        a(a11, 1, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    public static /* synthetic */ void d(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f5874l, lhVar.f5867e);
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f3596l.remove(i12);
        }
        this.B = this.B.a(i10, i11);
    }

    @Override // com.applovin.impl.nh
    public void b(final boolean z10) {
        if (this.f3605v != z10) {
            this.f3605v = z10;
            this.f3592h.f(z10);
            this.f3593i.a(9, new cc.a() { // from class: com.applovin.impl.ps
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).b(z10);
                }
            });
            X();
            this.f3593i.a();
        }
    }

    private long a(lh lhVar) {
        if (lhVar.a.c()) {
            return r2.a(this.J);
        }
        if (lhVar.f5864b.a()) {
            return lhVar.f5881s;
        }
        return a(lhVar.a, lhVar.f5864b, lhVar.f5881s);
    }

    private Pair a(go goVar, go goVar2) {
        long g10 = g();
        if (!goVar.c() && !goVar2.c()) {
            Pair a10 = goVar.a(this.a, this.f3595k, t(), r2.a(g10));
            Object obj = ((Pair) yp.a(a10)).first;
            if (goVar2.a(obj) != -1) {
                return a10;
            }
            Object a11 = c8.a(this.a, this.f3595k, this.u, this.f3605v, obj, goVar, goVar2);
            if (a11 != null) {
                goVar2.a(a11, this.f3595k);
                int i10 = this.f3595k.f4958c;
                return a(goVar2, i10, goVar2.a(i10, this.a).b());
            }
            return a(goVar2, -1, C.TIME_UNSET);
        }
        boolean z10 = !goVar.c() && goVar2.c();
        int U = z10 ? -1 : U();
        if (z10) {
            g10 = -9223372036854775807L;
        }
        return a(goVar2, U, g10);
    }

    private Pair a(go goVar, int i10, long j3) {
        if (goVar.c()) {
            this.H = i10;
            if (j3 == C.TIME_UNSET) {
                j3 = 0;
            }
            this.J = j3;
            this.I = 0;
            return null;
        }
        if (i10 == -1 || i10 >= goVar.b()) {
            i10 = goVar.a(this.f3605v);
            j3 = goVar.a(i10, this.a).b();
        }
        return goVar.a(this.a, this.f3595k, i10, r2.a(j3));
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        return this.G.f5876n;
    }

    private nh.f a(int i10, lh lhVar, int i11) {
        int i12;
        Object obj;
        od odVar;
        Object obj2;
        int i13;
        long j3;
        long j10;
        long b3;
        long j11;
        go.b bVar = new go.b();
        if (lhVar.a.c()) {
            i12 = i11;
            obj = null;
            odVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = lhVar.f5864b.a;
            lhVar.a.a(obj3, bVar);
            int i14 = bVar.f4958c;
            int a10 = lhVar.a.a(obj3);
            Object obj4 = lhVar.a.a(i14, this.a).a;
            odVar = this.a.f4971c;
            obj2 = obj3;
            i13 = a10;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            j3 = bVar.f4960f + bVar.f4959d;
            if (lhVar.f5864b.a()) {
                wd.a aVar = lhVar.f5864b;
                j10 = bVar.a(aVar.f8260b, aVar.f8261c);
                b3 = b(lhVar);
                long j12 = b3;
                j11 = j10;
                j3 = j12;
            } else {
                if (lhVar.f5864b.f8263e != -1 && this.G.f5864b.a()) {
                    j3 = b(this.G);
                }
                j11 = j3;
            }
        } else if (lhVar.f5864b.a()) {
            j10 = lhVar.f5881s;
            b3 = b(lhVar);
            long j122 = b3;
            j11 = j10;
            j3 = j122;
        } else {
            j3 = bVar.f4960f + lhVar.f5881s;
            j11 = j3;
        }
        long b10 = r2.b(j11);
        long b11 = r2.b(j3);
        wd.a aVar2 = lhVar.f5864b;
        return new nh.f(obj, i12, odVar, obj2, i13, b10, b11, aVar2.f8260b, aVar2.f8261c);
    }

    /* renamed from: a */
    public void b(c8.e eVar) {
        long j3;
        boolean z10;
        long j10;
        int i10 = this.f3606w - eVar.f4051c;
        this.f3606w = i10;
        boolean z11 = true;
        if (eVar.f4052d) {
            this.f3607x = eVar.f4053e;
            this.f3608y = true;
        }
        if (eVar.f4054f) {
            this.f3609z = eVar.f4055g;
        }
        if (i10 == 0) {
            go goVar = eVar.f4050b.a;
            if (!this.G.a.c() && goVar.c()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!goVar.c()) {
                List d10 = ((ph) goVar).d();
                a1.b(d10.size() == this.f3596l.size());
                for (int i11 = 0; i11 < d10.size(); i11++) {
                    ((a) this.f3596l.get(i11)).f3610b = (go) d10.get(i11);
                }
            }
            if (this.f3608y) {
                if (eVar.f4050b.f5864b.equals(this.G.f5864b) && eVar.f4050b.f5866d == this.G.f5881s) {
                    z11 = false;
                }
                if (z11) {
                    if (!goVar.c() && !eVar.f4050b.f5864b.a()) {
                        lh lhVar = eVar.f4050b;
                        j10 = a(goVar, lhVar.f5864b, lhVar.f5866d);
                    } else {
                        j10 = eVar.f4050b.f5866d;
                    }
                    j3 = j10;
                } else {
                    j3 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j3 = -9223372036854775807L;
                z10 = false;
            }
            this.f3608y = false;
            a(eVar.f4050b, 1, this.f3609z, false, z10, this.f3607x, j3, -1);
        }
    }

    public static /* synthetic */ void a(nh nhVar, nh.c cVar, z8 z8Var) {
        cVar.a(nhVar, new nh.d(z8Var));
    }

    public static /* synthetic */ void a(int i10, nh.f fVar, nh.f fVar2, nh.c cVar) {
        cVar.e(i10);
        cVar.a(fVar, fVar2, i10);
    }

    public static /* synthetic */ void a(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f5868f);
    }

    public static /* synthetic */ void a(lh lhVar, uo uoVar, nh.c cVar) {
        cVar.a(lhVar.f5870h, uoVar);
    }

    public static /* synthetic */ void a(lh lhVar, int i10, nh.c cVar) {
        cVar.a(lhVar.f5874l, i10);
    }

    private lh a(lh lhVar, go goVar, Pair pair) {
        wd.a aVar;
        xo xoVar;
        lh a10;
        long j3;
        a1.a(goVar.c() || pair != null);
        go goVar2 = lhVar.a;
        lh a11 = lhVar.a(goVar);
        if (goVar.c()) {
            wd.a a12 = lh.a();
            long a13 = r2.a(this.J);
            lh a14 = a11.a(a12, a13, a13, a13, 0L, qo.f7276d, this.f3586b, ab.h()).a(a12);
            a14.f5879q = a14.f5881s;
            return a14;
        }
        Object obj = a11.f5864b.a;
        boolean z10 = !obj.equals(((Pair) yp.a(pair)).first);
        wd.a aVar2 = z10 ? new wd.a(pair.first) : a11.f5864b;
        long longValue = ((Long) pair.second).longValue();
        long a15 = r2.a(g());
        if (!goVar2.c()) {
            a15 -= goVar2.a(obj, this.f3595k).e();
        }
        if (z10 || longValue < a15) {
            a1.b(!aVar2.a());
            qo qoVar = z10 ? qo.f7276d : a11.f5870h;
            if (z10) {
                aVar = aVar2;
                xoVar = this.f3586b;
            } else {
                aVar = aVar2;
                xoVar = a11.f5871i;
            }
            lh a16 = a11.a(aVar, longValue, longValue, longValue, 0L, qoVar, xoVar, z10 ? ab.h() : a11.f5872j).a(aVar);
            a16.f5879q = longValue;
            return a16;
        }
        if (longValue == a15) {
            int a17 = goVar.a(a11.f5873k.a);
            if (a17 != -1 && goVar.a(a17, this.f3595k).f4958c == goVar.a(aVar2.a, this.f3595k).f4958c) {
                return a11;
            }
            goVar.a(aVar2.a, this.f3595k);
            if (aVar2.a()) {
                j3 = this.f3595k.a(aVar2.f8260b, aVar2.f8261c);
            } else {
                j3 = this.f3595k.f4959d;
            }
            a10 = a11.a(aVar2, a11.f5881s, a11.f5881s, a11.f5866d, j3 - a11.f5881s, a11.f5870h, a11.f5871i, a11.f5872j).a(aVar2);
            a10.f5879q = j3;
        } else {
            a1.b(!aVar2.a());
            long max = Math.max(0L, a11.f5880r - (longValue - a15));
            long j10 = a11.f5879q;
            if (a11.f5873k.equals(a11.f5864b)) {
                j10 = longValue + max;
            }
            a10 = a11.a(aVar2, longValue, longValue, longValue, max, a11.f5870h, a11.f5871i, a11.f5872j);
            a10.f5879q = j10;
        }
        return a10;
    }

    public void a(we weVar) {
        qd a10 = this.E.a().a(weVar).a();
        if (a10.equals(this.E)) {
            return;
        }
        this.E = a10;
        this.f3593i.b(14, new ks(this, 2));
    }

    private long a(go goVar, wd.a aVar, long j3) {
        goVar.a(aVar.a, this.f3595k);
        return this.f3595k.e() + j3;
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        e(eVar);
    }

    private lh a(int i10, int i11) {
        a1.a(i10 >= 0 && i11 >= i10 && i11 <= this.f3596l.size());
        int t5 = t();
        go n10 = n();
        int size = this.f3596l.size();
        this.f3606w++;
        b(i10, i11);
        go R = R();
        lh a10 = a(this.G, R, a(n10, R));
        int i12 = a10.f5867e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && t5 >= a10.a.b()) {
            a10 = a10.a(4);
        }
        this.f3592h.b(i10, i11, this.B);
        return a10;
    }

    @Override // com.applovin.impl.nh
    public void a(int i10, long j3) {
        go goVar = this.G.a;
        if (i10 >= 0 && (goVar.c() || i10 < goVar.b())) {
            this.f3606w++;
            if (d()) {
                kc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                c8.e eVar = new c8.e(this.G);
                eVar.a(1);
                this.f3591g.a(eVar);
                return;
            }
            int i11 = o() != 1 ? 2 : 1;
            int t5 = t();
            lh a10 = a(this.G.a(i11), goVar, a(goVar, i10, j3));
            this.f3592h.a(goVar, i10, r2.a(j3));
            a(a10, 0, 1, true, true, 1, a(a10), t5);
            return;
        }
        throw new xa(goVar, i10, j3);
    }

    public void a(wd wdVar) {
        a(Collections.singletonList(wdVar));
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z10) {
        a(list, -1, C.TIME_UNSET, z10);
    }

    private void a(List list, int i10, long j3, boolean z10) {
        int i11;
        long j10;
        int U = U();
        long currentPosition = getCurrentPosition();
        this.f3606w++;
        if (!this.f3596l.isEmpty()) {
            b(0, this.f3596l.size());
        }
        List a10 = a(0, list);
        go R = R();
        if (!R.c() && i10 >= R.b()) {
            throw new xa(R, i10, j3);
        }
        if (z10) {
            int a11 = R.a(this.f3605v);
            j10 = C.TIME_UNSET;
            i11 = a11;
        } else if (i10 == -1) {
            i11 = U;
            j10 = currentPosition;
        } else {
            i11 = i10;
            j10 = j3;
        }
        lh a12 = a(this.G, R, a(R, i11, j10));
        int i12 = a12.f5867e;
        if (i11 != -1 && i12 != 1) {
            i12 = (R.c() || i11 >= R.b()) ? 4 : 2;
        }
        lh a13 = a12.a(i12);
        this.f3592h.a(a10, i11, r2.a(j10), this.B);
        a(a13, 0, 1, false, (this.G.f5864b.a.equals(a13.f5864b.a) || this.G.a.c()) ? false : true, 4, a(a13), -1);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z10) {
        a(z10, 0, 1);
    }

    public void a(boolean z10, int i10, int i11) {
        lh lhVar = this.G;
        if (lhVar.f5874l == z10 && lhVar.f5875m == i10) {
            return;
        }
        this.f3606w++;
        lh a10 = lhVar.a(z10, i10);
        this.f3592h.a(z10, i10);
        a(a10, 0, i11, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.applovin.impl.nh
    public void a(int i10) {
        if (this.u != i10) {
            this.u = i10;
            this.f3592h.a(i10);
            this.f3593i.a(8, new qs(i10));
            X();
            this.f3593i.a();
        }
    }

    public void a(boolean z10, y7 y7Var) {
        lh a10;
        if (z10) {
            a10 = a(0, this.f3596l.size()).a((y7) null);
        } else {
            lh lhVar = this.G;
            a10 = lhVar.a(lhVar.f5864b);
            a10.f5879q = a10.f5881s;
            a10.f5880r = 0L;
        }
        lh a11 = a10.a(1);
        if (y7Var != null) {
            a11 = a11.a(y7Var);
        }
        lh lhVar2 = a11;
        this.f3606w++;
        this.f3592h.G();
        a(lhVar2, 0, 1, false, lhVar2.a.c() && !this.G.a.c(), 4, a(lhVar2), -1);
    }

    private void a(final lh lhVar, final int i10, final int i11, boolean z10, boolean z11, int i12, long j3, int i13) {
        lh lhVar2 = this.G;
        this.G = lhVar;
        final int i14 = 1;
        Pair a10 = a(lhVar, lhVar2, z11, i12, !lhVar2.a.equals(lhVar.a));
        boolean booleanValue = ((Boolean) a10.first).booleanValue();
        final int intValue = ((Integer) a10.second).intValue();
        qd qdVar = this.E;
        if (booleanValue) {
            r3 = lhVar.a.c() ? null : lhVar.a.a(lhVar.a.a(lhVar.f5864b.a, this.f3595k).f4958c, this.a).f4971c;
            qdVar = r3 != null ? r3.f6479d : qd.H;
        }
        if (!lhVar2.f5872j.equals(lhVar.f5872j)) {
            qdVar = qdVar.a().a(lhVar.f5872j).a();
        }
        boolean z12 = !qdVar.equals(this.E);
        this.E = qdVar;
        final int i15 = 0;
        if (!lhVar2.a.equals(lhVar.a)) {
            this.f3593i.a(0, new cc.a() { // from class: com.applovin.impl.ls
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i16 = i15;
                    int i17 = i10;
                    Object obj2 = lhVar;
                    switch (i16) {
                        case 0:
                            a8.b((lh) obj2, i17, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) obj2, i17, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) obj2, i17);
                            return;
                    }
                }
            });
        }
        if (z11) {
            this.f3593i.a(11, new ns(a(i12, lhVar2, i13), d(j3), i12));
        }
        final int i16 = 2;
        if (booleanValue) {
            this.f3593i.a(1, new cc.a() { // from class: com.applovin.impl.ls
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i162 = i16;
                    int i17 = intValue;
                    Object obj2 = r3;
                    switch (i162) {
                        case 0:
                            a8.b((lh) obj2, i17, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) obj2, i17, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) obj2, i17);
                            return;
                    }
                }
            });
        }
        final int i17 = 3;
        final int i18 = 4;
        if (lhVar2.f5868f != lhVar.f5868f) {
            this.f3593i.a(10, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i19 = i17;
                    lh lhVar3 = lhVar;
                    switch (i19) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
            if (lhVar.f5868f != null) {
                this.f3593i.a(10, new cc.a() { // from class: com.applovin.impl.ms
                    @Override // com.applovin.impl.cc.a
                    public final void a(Object obj) {
                        int i19 = i18;
                        lh lhVar3 = lhVar;
                        switch (i19) {
                            case 0:
                                a8.f(lhVar3, (nh.c) obj);
                                return;
                            case 1:
                                a8.g(lhVar3, (nh.c) obj);
                                return;
                            case 2:
                                a8.h(lhVar3, (nh.c) obj);
                                return;
                            case 3:
                                a8.a(lhVar3, (nh.c) obj);
                                return;
                            case 4:
                                a8.b(lhVar3, (nh.c) obj);
                                return;
                            case 5:
                                a8.c(lhVar3, (nh.c) obj);
                                return;
                            case 6:
                                a8.d(lhVar3, (nh.c) obj);
                                return;
                            default:
                                a8.e(lhVar3, (nh.c) obj);
                                return;
                        }
                    }
                });
            }
        }
        xo xoVar = lhVar2.f5871i;
        xo xoVar2 = lhVar.f5871i;
        if (xoVar != xoVar2) {
            this.f3589e.a(xoVar2.f9071d);
            this.f3593i.a(2, new os(0, lhVar, new uo(lhVar.f5871i.f9070c)));
        }
        if (z12) {
            this.f3593i.a(14, new js(this.E, 1));
        }
        final int i19 = 5;
        if (lhVar2.f5869g != lhVar.f5869g) {
            this.f3593i.a(3, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i19;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        final int i20 = 6;
        if (lhVar2.f5867e != lhVar.f5867e || lhVar2.f5874l != lhVar.f5874l) {
            this.f3593i.a(-1, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i20;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        final int i21 = 7;
        if (lhVar2.f5867e != lhVar.f5867e) {
            this.f3593i.a(4, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i21;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (lhVar2.f5874l != lhVar.f5874l) {
            this.f3593i.a(5, new cc.a() { // from class: com.applovin.impl.ls
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i162 = i14;
                    int i172 = i11;
                    Object obj2 = lhVar;
                    switch (i162) {
                        case 0:
                            a8.b((lh) obj2, i172, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) obj2, i172, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) obj2, i172);
                            return;
                    }
                }
            });
        }
        if (lhVar2.f5875m != lhVar.f5875m) {
            this.f3593i.a(6, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i15;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (c(lhVar2) != c(lhVar)) {
            this.f3593i.a(7, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i14;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (!lhVar2.f5876n.equals(lhVar.f5876n)) {
            this.f3593i.a(12, new cc.a() { // from class: com.applovin.impl.ms
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    int i192 = i16;
                    lh lhVar3 = lhVar;
                    switch (i192) {
                        case 0:
                            a8.f(lhVar3, (nh.c) obj);
                            return;
                        case 1:
                            a8.g(lhVar3, (nh.c) obj);
                            return;
                        case 2:
                            a8.h(lhVar3, (nh.c) obj);
                            return;
                        case 3:
                            a8.a(lhVar3, (nh.c) obj);
                            return;
                        case 4:
                            a8.b(lhVar3, (nh.c) obj);
                            return;
                        case 5:
                            a8.c(lhVar3, (nh.c) obj);
                            return;
                        case 6:
                            a8.d(lhVar3, (nh.c) obj);
                            return;
                        default:
                            a8.e(lhVar3, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (z10) {
            this.f3593i.a(-1, new ss(i18));
        }
        X();
        this.f3593i.a();
        if (lhVar2.f5877o != lhVar.f5877o) {
            Iterator it = this.f3594j.iterator();
            while (it.hasNext()) {
                ((z7) it.next()).f(lhVar.f5877o);
            }
        }
        if (lhVar2.f5878p != lhVar.f5878p) {
            Iterator it2 = this.f3594j.iterator();
            while (it2.hasNext()) {
                ((z7) it2.next()).g(lhVar.f5878p);
            }
        }
    }

    public oh a(oh.b bVar) {
        return new oh(this.f3592h, bVar, this.G.a, t(), this.f3604t, this.f3592h.g());
    }

    private List a(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ae.c cVar = new ae.c((wd) list.get(i11), this.f3597m);
            arrayList.add(cVar);
            this.f3596l.add(i11 + i10, new a(cVar.f3748b, cVar.a.i()));
        }
        this.B = this.B.b(i10, arrayList.size());
        return arrayList;
    }
}
