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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a8 extends AbstractC0680c2 {

    /* renamed from: A */
    private fj f6561A;

    /* renamed from: B */
    private tj f6562B;

    /* renamed from: C */
    private boolean f6563C;

    /* renamed from: D */
    private nh.b f6564D;

    /* renamed from: E */
    private qd f6565E;

    /* renamed from: F */
    private qd f6566F;

    /* renamed from: G */
    private lh f6567G;

    /* renamed from: H */
    private int f6568H;

    /* renamed from: I */
    private int f6569I;

    /* renamed from: J */
    private long f6570J;
    final xo b;

    /* renamed from: c */
    final nh.b f6571c;

    /* renamed from: d */
    private final li[] f6572d;

    /* renamed from: e */
    private final wo f6573e;

    /* renamed from: f */
    private final ha f6574f;

    /* renamed from: g */
    private final c8.f f6575g;

    /* renamed from: h */
    private final c8 f6576h;

    /* renamed from: i */
    private final cc f6577i;

    /* renamed from: j */
    private final CopyOnWriteArraySet f6578j;

    /* renamed from: k */
    private final go.b f6579k;
    private final List l;
    private final boolean m;

    /* renamed from: n */
    private final yd f6580n;

    /* renamed from: o */
    private final C0742r0 f6581o;

    /* renamed from: p */
    private final Looper f6582p;

    /* renamed from: q */
    private final InterfaceC0775x1 f6583q;

    /* renamed from: r */
    private final long f6584r;

    /* renamed from: s */
    private final long f6585s;

    /* renamed from: t */
    private final j3 f6586t;

    /* renamed from: u */
    private int f6587u;

    /* renamed from: v */
    private boolean f6588v;

    /* renamed from: w */
    private int f6589w;

    /* renamed from: x */
    private int f6590x;

    /* renamed from: y */
    private boolean f6591y;

    /* renamed from: z */
    private int f6592z;

    /* loaded from: classes.dex */
    public static final class a implements zd {

        /* renamed from: a */
        private final Object f6593a;
        private go b;

        public a(Object obj, go goVar) {
            this.f6593a = obj;
            this.b = goVar;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.b;
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.f6593a;
        }
    }

    public a8(li[] liVarArr, wo woVar, yd ydVar, gc gcVar, InterfaceC0775x1 interfaceC0775x1, C0742r0 c0742r0, boolean z8, fj fjVar, long j7, long j9, fc fcVar, long j10, boolean z9, j3 j3Var, Looper looper, nh nhVar, nh.b bVar) {
        kc.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.f12454e + "]");
        AbstractC0669a1.b(liVarArr.length > 0);
        this.f6572d = (li[]) AbstractC0669a1.a(liVarArr);
        this.f6573e = (wo) AbstractC0669a1.a(woVar);
        this.f6580n = ydVar;
        this.f6583q = interfaceC0775x1;
        this.f6581o = c0742r0;
        this.m = z8;
        this.f6561A = fjVar;
        this.f6584r = j7;
        this.f6585s = j9;
        this.f6563C = z9;
        this.f6582p = looper;
        this.f6586t = j3Var;
        this.f6587u = 0;
        nh nhVar2 = nhVar != null ? nhVar : this;
        this.f6577i = new cc(looper, j3Var, new C(nhVar2, 1));
        this.f6578j = new CopyOnWriteArraySet();
        this.l = new ArrayList();
        this.f6562B = new tj.a(0);
        xo xoVar = new xo(new ni[liVarArr.length], new f8[liVarArr.length], null);
        this.b = xoVar;
        this.f6579k = new go.b();
        nh.b a6 = new nh.b.a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, woVar.b()).a(bVar).a();
        this.f6571c = a6;
        this.f6564D = new nh.b.a().a(a6).a(3).a(9).a();
        qd qdVar = qd.f10229H;
        this.f6565E = qdVar;
        this.f6566F = qdVar;
        this.f6568H = -1;
        this.f6574f = j3Var.a(looper, null);
        E e4 = new E(this, 2);
        this.f6575g = e4;
        this.f6567G = lh.a(xoVar);
        if (c0742r0 != null) {
            c0742r0.a(nhVar2, looper);
            b((nh.e) c0742r0);
            interfaceC0775x1.a(new Handler(looper), c0742r0);
        }
        this.f6576h = new c8(liVarArr, woVar, xoVar, gcVar, interfaceC0775x1, this.f6587u, this.f6588v, c0742r0, fjVar, fcVar, j10, z9, looper, j3Var, e4);
    }

    private int U() {
        if (this.f6567G.f8832a.c()) {
            return this.f6568H;
        }
        lh lhVar = this.f6567G;
        return lhVar.f8832a.a(lhVar.b.f11475a, this.f6579k).f7934c;
    }

    private void X() {
        nh.b bVar = this.f6564D;
        nh.b a6 = a(this.f6571c);
        this.f6564D = a6;
        if (!a6.equals(bVar)) {
            this.f6577i.a(13, new E(this, 0));
        }
    }

    private nh.f d(long j7) {
        od odVar;
        Object obj;
        int i9;
        Object obj2;
        int t9 = t();
        if (this.f6567G.f8832a.c()) {
            odVar = null;
            obj = null;
            i9 = -1;
            obj2 = null;
        } else {
            lh lhVar = this.f6567G;
            Object obj3 = lhVar.b.f11475a;
            lhVar.f8832a.a(obj3, this.f6579k);
            i9 = this.f6567G.f8832a.a(obj3);
            obj = obj3;
            obj2 = this.f6567G.f8832a.a(t9, this.f6948a).f7947a;
            odVar = this.f6948a.f7948c;
        }
        long b = AbstractC0744r2.b(j7);
        long b8 = this.f6567G.b.a() ? AbstractC0744r2.b(b(this.f6567G)) : b;
        wd.a aVar = this.f6567G.b;
        return new nh.f(obj2, t9, odVar, obj, i9, b, b8, aVar.b, aVar.f11476c);
    }

    @Override // com.applovin.impl.nh
    /* renamed from: V */
    public y7 c() {
        return this.f6567G.f8836f;
    }

    public void W() {
        kc.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + yp.f12454e + "] [" + d8.a() + "]");
        if (!this.f6576h.x()) {
            this.f6577i.b(10, new I(0));
        }
        this.f6577i.b();
        this.f6574f.a((Object) null);
        C0742r0 c0742r0 = this.f6581o;
        if (c0742r0 != null) {
            this.f6583q.a(c0742r0);
        }
        lh a6 = this.f6567G.a(1);
        this.f6567G = a6;
        lh a9 = a6.a(a6.b);
        this.f6567G = a9;
        a9.f8845q = a9.f8847s;
        this.f6567G.f8846r = 0L;
    }

    @Override // com.applovin.impl.nh
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.impl.nh
    public void b(SurfaceView surfaceView) {
    }

    public void c(long j7) {
        this.f6576h.a(j7);
    }

    @Override // com.applovin.impl.nh
    public long e() {
        return this.f6585s;
    }

    @Override // com.applovin.impl.nh
    public int f() {
        if (d()) {
            return this.f6567G.b.f11476c;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public long g() {
        if (d()) {
            lh lhVar = this.f6567G;
            lhVar.f8832a.a(lhVar.b.f11475a, this.f6579k);
            lh lhVar2 = this.f6567G;
            if (lhVar2.f8833c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return lhVar2.f8832a.a(t(), this.f6948a).b();
            }
            return this.f6579k.d() + AbstractC0744r2.b(this.f6567G.f8833c);
        }
        return getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        return AbstractC0744r2.b(a(this.f6567G));
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        if (d()) {
            lh lhVar = this.f6567G;
            wd.a aVar = lhVar.b;
            lhVar.f8832a.a(aVar.f11475a, this.f6579k);
            return AbstractC0744r2.b(this.f6579k.a(aVar.b, aVar.f11476c));
        }
        return G();
    }

    @Override // com.applovin.impl.nh
    public long h() {
        return AbstractC0744r2.b(this.f6567G.f8846r);
    }

    private go R() {
        return new ph(this.l, this.f6562B);
    }

    public static /* synthetic */ void e(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f8835e);
    }

    public static /* synthetic */ void f(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.m);
    }

    public static /* synthetic */ void h(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f8842n);
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        return new uo(this.f6567G.f8839i.f12288c);
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.f6565E;
    }

    @Override // com.applovin.impl.nh
    public int E() {
        if (d()) {
            return this.f6567G.b.b;
        }
        return -1;
    }

    @Override // com.applovin.impl.nh
    public long F() {
        return this.f6584r;
    }

    public boolean S() {
        return this.f6567G.f8844p;
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
        return this.f6564D;
    }

    @Override // com.applovin.impl.nh
    public int j() {
        return this.f6567G.m;
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        return this.f6567G.f8838h;
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        return this.f6567G.l;
    }

    @Override // com.applovin.impl.nh
    public int m() {
        return this.f6587u;
    }

    @Override // com.applovin.impl.nh
    public go n() {
        return this.f6567G.f8832a;
    }

    @Override // com.applovin.impl.nh
    public int o() {
        return this.f6567G.f8835e;
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.f6582p;
    }

    @Override // com.applovin.impl.nh
    public long q() {
        return 3000L;
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        return this.f6588v;
    }

    @Override // com.applovin.impl.nh
    public long s() {
        if (this.f6567G.f8832a.c()) {
            return this.f6570J;
        }
        lh lhVar = this.f6567G;
        if (lhVar.f8841k.f11477d != lhVar.b.f11477d) {
            return lhVar.f8832a.a(t(), this.f6948a).d();
        }
        long j7 = lhVar.f8845q;
        if (this.f6567G.f8841k.a()) {
            lh lhVar2 = this.f6567G;
            go.b a6 = lhVar2.f8832a.a(lhVar2.f8841k.f11475a, this.f6579k);
            long b = a6.b(this.f6567G.f8841k.b);
            j7 = b == Long.MIN_VALUE ? a6.f7935d : b;
        }
        lh lhVar3 = this.f6567G;
        return AbstractC0744r2.b(a(lhVar3.f8832a, lhVar3.f8841k, j7));
    }

    @Override // com.applovin.impl.nh
    public int t() {
        int U8 = U();
        if (U8 == -1) {
            return 0;
        }
        return U8;
    }

    @Override // com.applovin.impl.nh
    public int v() {
        if (this.f6567G.f8832a.c()) {
            return this.f6569I;
        }
        lh lhVar = this.f6567G;
        return lhVar.f8832a.a(lhVar.b.f11475a);
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return yq.f12463f;
    }

    private static boolean c(lh lhVar) {
        return lhVar.f8835e == 3 && lhVar.l && lhVar.m == 0;
    }

    public void a(z7 z7Var) {
        this.f6578j.add(z7Var);
    }

    @Override // com.applovin.impl.nh
    public void b(nh.e eVar) {
        a((nh.c) eVar);
    }

    public void e(nh.c cVar) {
        this.f6577i.b(cVar);
    }

    private static long b(lh lhVar) {
        go.d dVar = new go.d();
        go.b bVar = new go.b();
        lhVar.f8832a.a(lhVar.b.f11475a, bVar);
        if (lhVar.f8833c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return lhVar.f8832a.a(bVar.f7934c, dVar).c();
        }
        return bVar.e() + lhVar.f8833c;
    }

    public /* synthetic */ void c(c8.e eVar) {
        this.f6574f.a((Runnable) new F(0, this, eVar));
    }

    public void a(nh.c cVar) {
        this.f6577i.a(cVar);
    }

    private Pair a(lh lhVar, lh lhVar2, boolean z8, int i9, boolean z9) {
        go goVar = lhVar2.f8832a;
        go goVar2 = lhVar.f8832a;
        if (goVar2.c() && goVar.c()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i10 = 3;
        if (goVar2.c() != goVar.c()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (goVar.a(goVar.a(lhVar2.b.f11475a, this.f6579k).f7934c, this.f6948a).f7947a.equals(goVar2.a(goVar2.a(lhVar.b.f11475a, this.f6579k).f7934c, this.f6948a).f7947a)) {
            if (z8 && i9 == 0 && lhVar2.b.f11477d < lhVar.b.f11477d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return new Pair(Boolean.FALSE, -1);
        }
        if (z8 && i9 == 0) {
            i10 = 1;
        } else if (z8 && i9 == 1) {
            i10 = 2;
        } else if (!z9) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i10));
    }

    public static /* synthetic */ void c(nh.c cVar) {
        cVar.a(y7.a(new e8(1), 1003));
    }

    public static /* synthetic */ void g(lh lhVar, nh.c cVar) {
        cVar.d(c(lhVar));
    }

    public static /* synthetic */ void c(lh lhVar, nh.c cVar) {
        cVar.e(lhVar.f8837g);
        cVar.c(lhVar.f8837g);
    }

    public /* synthetic */ void b(nh.c cVar) {
        cVar.a(this.f6565E);
    }

    public static /* synthetic */ void b(lh lhVar, nh.c cVar) {
        cVar.a(lhVar.f8836f);
    }

    public static /* synthetic */ void b(lh lhVar, int i9, nh.c cVar) {
        cVar.a(lhVar.f8832a, i9);
    }

    @Override // com.applovin.impl.nh
    public boolean d() {
        return this.f6567G.b.a();
    }

    public /* synthetic */ void d(nh.c cVar) {
        cVar.a(this.f6564D);
    }

    @Override // com.applovin.impl.nh
    public void b() {
        lh lhVar = this.f6567G;
        if (lhVar.f8835e != 1) {
            return;
        }
        lh a6 = lhVar.a((y7) null);
        lh a9 = a6.a(a6.f8832a.c() ? 4 : 2);
        this.f6589w++;
        this.f6576h.v();
        a(a9, 1, 1, false, false, 5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1);
    }

    public static /* synthetic */ void d(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.l, lhVar.f8835e);
    }

    private void b(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            this.l.remove(i11);
        }
        this.f6562B = this.f6562B.a(i9, i10);
    }

    @Override // com.applovin.impl.nh
    public void b(final boolean z8) {
        if (this.f6588v != z8) {
            this.f6588v = z8;
            this.f6576h.f(z8);
            this.f6577i.a(9, new cc.a() { // from class: com.applovin.impl.G
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).b(z8);
                }
            });
            X();
            this.f6577i.a();
        }
    }

    private long a(lh lhVar) {
        if (lhVar.f8832a.c()) {
            return AbstractC0744r2.a(this.f6570J);
        }
        if (lhVar.b.a()) {
            return lhVar.f8847s;
        }
        return a(lhVar.f8832a, lhVar.b, lhVar.f8847s);
    }

    private Pair a(go goVar, go goVar2) {
        long g9 = g();
        if (!goVar.c() && !goVar2.c()) {
            Pair a6 = goVar.a(this.f6948a, this.f6579k, t(), AbstractC0744r2.a(g9));
            Object obj = ((Pair) yp.a(a6)).first;
            if (goVar2.a(obj) != -1) {
                return a6;
            }
            Object a9 = c8.a(this.f6948a, this.f6579k, this.f6587u, this.f6588v, obj, goVar, goVar2);
            if (a9 != null) {
                goVar2.a(a9, this.f6579k);
                int i9 = this.f6579k.f7934c;
                return a(goVar2, i9, goVar2.a(i9, this.f6948a).b());
            }
            return a(goVar2, -1, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        }
        boolean z8 = !goVar.c() && goVar2.c();
        int U8 = z8 ? -1 : U();
        if (z8) {
            g9 = -9223372036854775807L;
        }
        return a(goVar2, U8, g9);
    }

    private Pair a(go goVar, int i9, long j7) {
        if (goVar.c()) {
            this.f6568H = i9;
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j7 = 0;
            }
            this.f6570J = j7;
            this.f6569I = 0;
            return null;
        }
        if (i9 == -1 || i9 >= goVar.b()) {
            i9 = goVar.a(this.f6588v);
            j7 = goVar.a(i9, this.f6948a).b();
        }
        return goVar.a(this.f6948a, this.f6579k, i9, AbstractC0744r2.a(j7));
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        return this.f6567G.f8842n;
    }

    private nh.f a(int i9, lh lhVar, int i10) {
        int i11;
        Object obj;
        od odVar;
        Object obj2;
        int i12;
        long j7;
        long j9;
        long b;
        long j10;
        go.b bVar = new go.b();
        if (lhVar.f8832a.c()) {
            i11 = i10;
            obj = null;
            odVar = null;
            obj2 = null;
            i12 = -1;
        } else {
            Object obj3 = lhVar.b.f11475a;
            lhVar.f8832a.a(obj3, bVar);
            int i13 = bVar.f7934c;
            int a6 = lhVar.f8832a.a(obj3);
            Object obj4 = lhVar.f8832a.a(i13, this.f6948a).f7947a;
            odVar = this.f6948a.f7948c;
            obj2 = obj3;
            i12 = a6;
            obj = obj4;
            i11 = i13;
        }
        if (i9 == 0) {
            j7 = bVar.f7936f + bVar.f7935d;
            if (lhVar.b.a()) {
                wd.a aVar = lhVar.b;
                j9 = bVar.a(aVar.b, aVar.f11476c);
                b = b(lhVar);
                long j11 = b;
                j10 = j9;
                j7 = j11;
            } else {
                if (lhVar.b.f11478e != -1 && this.f6567G.b.a()) {
                    j7 = b(this.f6567G);
                }
                j10 = j7;
            }
        } else if (lhVar.b.a()) {
            j9 = lhVar.f8847s;
            b = b(lhVar);
            long j112 = b;
            j10 = j9;
            j7 = j112;
        } else {
            j7 = bVar.f7936f + lhVar.f8847s;
            j10 = j7;
        }
        long b8 = AbstractC0744r2.b(j10);
        long b9 = AbstractC0744r2.b(j7);
        wd.a aVar2 = lhVar.b;
        return new nh.f(obj, i11, odVar, obj2, i12, b8, b9, aVar2.b, aVar2.f11476c);
    }

    /* renamed from: a */
    public void b(c8.e eVar) {
        long j7;
        boolean z8;
        long j9;
        int i9 = this.f6589w - eVar.f7036c;
        this.f6589w = i9;
        boolean z9 = true;
        if (eVar.f7037d) {
            this.f6590x = eVar.f7038e;
            this.f6591y = true;
        }
        if (eVar.f7039f) {
            this.f6592z = eVar.f7040g;
        }
        if (i9 == 0) {
            go goVar = eVar.b.f8832a;
            if (!this.f6567G.f8832a.c() && goVar.c()) {
                this.f6568H = -1;
                this.f6570J = 0L;
                this.f6569I = 0;
            }
            if (!goVar.c()) {
                List d2 = ((ph) goVar).d();
                AbstractC0669a1.b(d2.size() == this.l.size());
                for (int i10 = 0; i10 < d2.size(); i10++) {
                    ((a) this.l.get(i10)).b = (go) d2.get(i10);
                }
            }
            if (this.f6591y) {
                if (eVar.b.b.equals(this.f6567G.b) && eVar.b.f8834d == this.f6567G.f8847s) {
                    z9 = false;
                }
                if (z9) {
                    if (!goVar.c() && !eVar.b.b.a()) {
                        lh lhVar = eVar.b;
                        j9 = a(goVar, lhVar.b, lhVar.f8834d);
                    } else {
                        j9 = eVar.b.f8834d;
                    }
                    j7 = j9;
                } else {
                    j7 = -9223372036854775807L;
                }
                z8 = z9;
            } else {
                j7 = -9223372036854775807L;
                z8 = false;
            }
            this.f6591y = false;
            a(eVar.b, 1, this.f6592z, false, z8, this.f6590x, j7, -1);
        }
    }

    public static /* synthetic */ void a(nh nhVar, nh.c cVar, z8 z8Var) {
        cVar.a(nhVar, new nh.d(z8Var));
    }

    public static /* synthetic */ void a(int i9, nh.f fVar, nh.f fVar2, nh.c cVar) {
        cVar.e(i9);
        cVar.a(fVar, fVar2, i9);
    }

    public static /* synthetic */ void a(lh lhVar, nh.c cVar) {
        cVar.b(lhVar.f8836f);
    }

    public static /* synthetic */ void a(lh lhVar, uo uoVar, nh.c cVar) {
        cVar.a(lhVar.f8838h, uoVar);
    }

    public static /* synthetic */ void a(lh lhVar, int i9, nh.c cVar) {
        cVar.a(lhVar.l, i9);
    }

    private lh a(lh lhVar, go goVar, Pair pair) {
        wd.a aVar;
        xo xoVar;
        lh a6;
        long j7;
        AbstractC0669a1.a(goVar.c() || pair != null);
        go goVar2 = lhVar.f8832a;
        lh a9 = lhVar.a(goVar);
        if (goVar.c()) {
            wd.a a10 = lh.a();
            long a11 = AbstractC0744r2.a(this.f6570J);
            lh a12 = a9.a(a10, a11, a11, a11, 0L, qo.f10419d, this.b, ab.h()).a(a10);
            a12.f8845q = a12.f8847s;
            return a12;
        }
        Object obj = a9.b.f11475a;
        boolean z8 = !obj.equals(((Pair) yp.a(pair)).first);
        wd.a aVar2 = z8 ? new wd.a(pair.first) : a9.b;
        long longValue = ((Long) pair.second).longValue();
        long a13 = AbstractC0744r2.a(g());
        if (!goVar2.c()) {
            a13 -= goVar2.a(obj, this.f6579k).e();
        }
        if (z8 || longValue < a13) {
            AbstractC0669a1.b(!aVar2.a());
            qo qoVar = z8 ? qo.f10419d : a9.f8838h;
            if (z8) {
                aVar = aVar2;
                xoVar = this.b;
            } else {
                aVar = aVar2;
                xoVar = a9.f8839i;
            }
            lh a14 = a9.a(aVar, longValue, longValue, longValue, 0L, qoVar, xoVar, z8 ? ab.h() : a9.f8840j).a(aVar);
            a14.f8845q = longValue;
            return a14;
        }
        if (longValue == a13) {
            int a15 = goVar.a(a9.f8841k.f11475a);
            if (a15 != -1 && goVar.a(a15, this.f6579k).f7934c == goVar.a(aVar2.f11475a, this.f6579k).f7934c) {
                return a9;
            }
            goVar.a(aVar2.f11475a, this.f6579k);
            if (aVar2.a()) {
                j7 = this.f6579k.a(aVar2.b, aVar2.f11476c);
            } else {
                j7 = this.f6579k.f7935d;
            }
            a6 = a9.a(aVar2, a9.f8847s, a9.f8847s, a9.f8834d, j7 - a9.f8847s, a9.f8838h, a9.f8839i, a9.f8840j).a(aVar2);
            a6.f8845q = j7;
        } else {
            AbstractC0669a1.b(!aVar2.a());
            long max = Math.max(0L, a9.f8846r - (longValue - a13));
            long j9 = a9.f8845q;
            if (a9.f8841k.equals(a9.b)) {
                j9 = longValue + max;
            }
            a6 = a9.a(aVar2, longValue, longValue, longValue, max, a9.f8838h, a9.f8839i, a9.f8840j);
            a6.f8845q = j9;
        }
        return a6;
    }

    public void a(we weVar) {
        qd a6 = this.f6565E.a().a(weVar).a();
        if (a6.equals(this.f6565E)) {
            return;
        }
        this.f6565E = a6;
        this.f6577i.b(14, new E(this, 1));
    }

    private long a(go goVar, wd.a aVar, long j7) {
        goVar.a(aVar.f11475a, this.f6579k);
        return this.f6579k.e() + j7;
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        e(eVar);
    }

    private lh a(int i9, int i10) {
        AbstractC0669a1.a(i9 >= 0 && i10 >= i9 && i10 <= this.l.size());
        int t9 = t();
        go n2 = n();
        int size = this.l.size();
        this.f6589w++;
        b(i9, i10);
        go R4 = R();
        lh a6 = a(this.f6567G, R4, a(n2, R4));
        int i11 = a6.f8835e;
        if (i11 != 1 && i11 != 4 && i9 < i10 && i10 == size && t9 >= a6.f8832a.b()) {
            a6 = a6.a(4);
        }
        this.f6576h.b(i9, i10, this.f6562B);
        return a6;
    }

    @Override // com.applovin.impl.nh
    public void a(int i9, long j7) {
        go goVar = this.f6567G.f8832a;
        if (i9 >= 0 && (goVar.c() || i9 < goVar.b())) {
            this.f6589w++;
            if (d()) {
                kc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                c8.e eVar = new c8.e(this.f6567G);
                eVar.a(1);
                this.f6575g.a(eVar);
                return;
            }
            int i10 = o() != 1 ? 2 : 1;
            int t9 = t();
            lh a6 = a(this.f6567G.a(i10), goVar, a(goVar, i9, j7));
            this.f6576h.a(goVar, i9, AbstractC0744r2.a(j7));
            a(a6, 0, 1, true, true, 1, a(a6), t9);
            return;
        }
        throw new xa(goVar, i9, j7);
    }

    public void a(wd wdVar) {
        a(Collections.singletonList(wdVar));
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z8) {
        a(list, -1, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, z8);
    }

    private void a(List list, int i9, long j7, boolean z8) {
        int i10;
        long j9;
        int U8 = U();
        long currentPosition = getCurrentPosition();
        this.f6589w++;
        if (!this.l.isEmpty()) {
            b(0, this.l.size());
        }
        List a6 = a(0, list);
        go R4 = R();
        if (!R4.c() && i9 >= R4.b()) {
            throw new xa(R4, i9, j7);
        }
        if (z8) {
            int a9 = R4.a(this.f6588v);
            j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            i10 = a9;
        } else if (i9 == -1) {
            i10 = U8;
            j9 = currentPosition;
        } else {
            i10 = i9;
            j9 = j7;
        }
        lh a10 = a(this.f6567G, R4, a(R4, i10, j9));
        int i11 = a10.f8835e;
        if (i10 != -1 && i11 != 1) {
            i11 = (R4.c() || i10 >= R4.b()) ? 4 : 2;
        }
        lh a11 = a10.a(i11);
        this.f6576h.a(a6, i10, AbstractC0744r2.a(j9), this.f6562B);
        a(a11, 0, 1, false, (this.f6567G.b.f11475a.equals(a11.b.f11475a) || this.f6567G.f8832a.c()) ? false : true, 4, a(a11), -1);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z8) {
        a(z8, 0, 1);
    }

    public void a(boolean z8, int i9, int i10) {
        lh lhVar = this.f6567G;
        if (lhVar.l == z8 && lhVar.m == i9) {
            return;
        }
        this.f6589w++;
        lh a6 = lhVar.a(z8, i9);
        this.f6576h.a(z8, i9);
        a(a6, 0, i10, false, false, 5, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1);
    }

    @Override // com.applovin.impl.nh
    public void a(final int i9) {
        if (this.f6587u != i9) {
            this.f6587u = i9;
            this.f6576h.a(i9);
            this.f6577i.a(8, new cc.a() { // from class: com.applovin.impl.H
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    ((nh.c) obj).c(i9);
                }
            });
            X();
            this.f6577i.a();
        }
    }

    public void a(boolean z8, y7 y7Var) {
        lh a6;
        if (z8) {
            a6 = a(0, this.l.size()).a((y7) null);
        } else {
            lh lhVar = this.f6567G;
            a6 = lhVar.a(lhVar.b);
            a6.f8845q = a6.f8847s;
            a6.f8846r = 0L;
        }
        lh a9 = a6.a(1);
        if (y7Var != null) {
            a9 = a9.a(y7Var);
        }
        lh lhVar2 = a9;
        this.f6589w++;
        this.f6576h.G();
        a(lhVar2, 0, 1, false, lhVar2.f8832a.c() && !this.f6567G.f8832a.c(), 4, a(lhVar2), -1);
    }

    private void a(final lh lhVar, final int i9, final int i10, boolean z8, boolean z9, int i11, long j7, int i12) {
        lh lhVar2 = this.f6567G;
        this.f6567G = lhVar;
        Pair a6 = a(lhVar, lhVar2, z9, i11, !lhVar2.f8832a.equals(lhVar.f8832a));
        boolean booleanValue = ((Boolean) a6.first).booleanValue();
        final int intValue = ((Integer) a6.second).intValue();
        qd qdVar = this.f6565E;
        if (booleanValue) {
            r3 = lhVar.f8832a.c() ? null : lhVar.f8832a.a(lhVar.f8832a.a(lhVar.b.f11475a, this.f6579k).f7934c, this.f6948a).f7948c;
            qdVar = r3 != null ? r3.f9414d : qd.f10229H;
        }
        if (!lhVar2.f8840j.equals(lhVar.f8840j)) {
            qdVar = qdVar.a().a(lhVar.f8840j).a();
        }
        boolean z10 = !qdVar.equals(this.f6565E);
        this.f6565E = qdVar;
        if (!lhVar2.f8832a.equals(lhVar.f8832a)) {
            final int i13 = 0;
            this.f6577i.a(0, new cc.a() { // from class: com.applovin.impl.A
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i13) {
                        case 0:
                            a8.b((lh) lhVar, i9, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) lhVar, i9, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) lhVar, i9);
                            return;
                    }
                }
            });
        }
        if (z9) {
            this.f6577i.a(11, new J(a(i11, lhVar2, i12), d(j7), i11));
        }
        if (booleanValue) {
            final int i14 = 2;
            this.f6577i.a(1, new cc.a() { // from class: com.applovin.impl.A
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i14) {
                        case 0:
                            a8.b((lh) r3, intValue, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) r3, intValue, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) r3, intValue);
                            return;
                    }
                }
            });
        }
        if (lhVar2.f8836f != lhVar.f8836f) {
            final int i15 = 6;
            this.f6577i.a(10, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i15) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
            if (lhVar.f8836f != null) {
                final int i16 = 7;
                this.f6577i.a(10, new cc.a() { // from class: com.applovin.impl.D
                    @Override // com.applovin.impl.cc.a
                    public final void a(Object obj) {
                        switch (i16) {
                            case 0:
                                a8.c(lhVar, (nh.c) obj);
                                return;
                            case 1:
                                a8.d(lhVar, (nh.c) obj);
                                return;
                            case 2:
                                a8.e(lhVar, (nh.c) obj);
                                return;
                            case 3:
                                a8.f(lhVar, (nh.c) obj);
                                return;
                            case 4:
                                a8.g(lhVar, (nh.c) obj);
                                return;
                            case 5:
                                a8.h(lhVar, (nh.c) obj);
                                return;
                            case 6:
                                a8.a(lhVar, (nh.c) obj);
                                return;
                            default:
                                a8.b(lhVar, (nh.c) obj);
                                return;
                        }
                    }
                });
            }
        }
        xo xoVar = lhVar2.f8839i;
        xo xoVar2 = lhVar.f8839i;
        if (xoVar != xoVar2) {
            this.f6573e.a(xoVar2.f12289d);
            this.f6577i.a(2, new B(0, lhVar, new uo(lhVar.f8839i.f12288c)));
        }
        if (z10) {
            this.f6577i.a(14, new C(this.f6565E, 0));
        }
        if (lhVar2.f8837g != lhVar.f8837g) {
            final int i17 = 0;
            this.f6577i.a(3, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (lhVar2.f8835e != lhVar.f8835e || lhVar2.l != lhVar.l) {
            final int i18 = 1;
            this.f6577i.a(-1, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i18) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (lhVar2.f8835e != lhVar.f8835e) {
            final int i19 = 2;
            this.f6577i.a(4, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i19) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (lhVar2.l != lhVar.l) {
            final int i20 = 1;
            this.f6577i.a(5, new cc.a() { // from class: com.applovin.impl.A
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i20) {
                        case 0:
                            a8.b((lh) lhVar, i10, (nh.c) obj);
                            return;
                        case 1:
                            a8.a((lh) lhVar, i10, (nh.c) obj);
                            return;
                        default:
                            ((nh.c) obj).a((od) lhVar, i10);
                            return;
                    }
                }
            });
        }
        if (lhVar2.m != lhVar.m) {
            final int i21 = 3;
            this.f6577i.a(6, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i21) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (c(lhVar2) != c(lhVar)) {
            final int i22 = 4;
            this.f6577i.a(7, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i22) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (!lhVar2.f8842n.equals(lhVar.f8842n)) {
            final int i23 = 5;
            this.f6577i.a(12, new cc.a() { // from class: com.applovin.impl.D
                @Override // com.applovin.impl.cc.a
                public final void a(Object obj) {
                    switch (i23) {
                        case 0:
                            a8.c(lhVar, (nh.c) obj);
                            return;
                        case 1:
                            a8.d(lhVar, (nh.c) obj);
                            return;
                        case 2:
                            a8.e(lhVar, (nh.c) obj);
                            return;
                        case 3:
                            a8.f(lhVar, (nh.c) obj);
                            return;
                        case 4:
                            a8.g(lhVar, (nh.c) obj);
                            return;
                        case 5:
                            a8.h(lhVar, (nh.c) obj);
                            return;
                        case 6:
                            a8.a(lhVar, (nh.c) obj);
                            return;
                        default:
                            a8.b(lhVar, (nh.c) obj);
                            return;
                    }
                }
            });
        }
        if (z8) {
            this.f6577i.a(-1, new I(5));
        }
        X();
        this.f6577i.a();
        if (lhVar2.f8843o != lhVar.f8843o) {
            Iterator it = this.f6578j.iterator();
            while (it.hasNext()) {
                ((z7) it.next()).f(lhVar.f8843o);
            }
        }
        if (lhVar2.f8844p != lhVar.f8844p) {
            Iterator it2 = this.f6578j.iterator();
            while (it2.hasNext()) {
                ((z7) it2.next()).g(lhVar.f8844p);
            }
        }
    }

    public oh a(oh.b bVar) {
        return new oh(this.f6576h, bVar, this.f6567G.f8832a, t(), this.f6586t, this.f6576h.g());
    }

    private List a(int i9, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ae.c cVar = new ae.c((wd) list.get(i10), this.m);
            arrayList.add(cVar);
            this.l.add(i10 + i9, new a(cVar.b, cVar.f6740a.i()));
        }
        this.f6562B = this.f6562B.b(i9, arrayList.size());
        return arrayList;
    }
}
