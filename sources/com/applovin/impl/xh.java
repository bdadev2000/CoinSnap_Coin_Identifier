package com.applovin.impl;

import android.net.Uri;
import android.os.Handler;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.hc;
import com.applovin.impl.j5;
import com.applovin.impl.jc;
import com.applovin.impl.pa;
import com.applovin.impl.rd;
import com.applovin.impl.xd;
import com.applovin.impl.xi;
import com.applovin.impl.y6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xh implements rd, k8, jc.b, jc.f, xi.d {
    private static final Map N = l();
    private static final d9 O = new d9.b().c("icy").f("application/x-icy").a();
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;
    private final Uri a;

    /* renamed from: b */
    private final g5 f8978b;

    /* renamed from: c */
    private final z6 f8979c;

    /* renamed from: d */
    private final hc f8980d;

    /* renamed from: f */
    private final xd.a f8981f;

    /* renamed from: g */
    private final y6.a f8982g;

    /* renamed from: h */
    private final b f8983h;

    /* renamed from: i */
    private final n0 f8984i;

    /* renamed from: j */
    private final String f8985j;

    /* renamed from: k */
    private final long f8986k;

    /* renamed from: m */
    private final wh f8988m;

    /* renamed from: o */
    private final Runnable f8990o;

    /* renamed from: p */
    private final Runnable f8991p;

    /* renamed from: r */
    private rd.a f8993r;

    /* renamed from: s */
    private ra f8994s;

    /* renamed from: v */
    private boolean f8996v;

    /* renamed from: w */
    private boolean f8997w;

    /* renamed from: x */
    private boolean f8998x;

    /* renamed from: y */
    private e f8999y;

    /* renamed from: z */
    private ej f9000z;

    /* renamed from: l */
    private final jc f8987l = new jc("ProgressiveMediaPeriod");

    /* renamed from: n */
    private final a4 f8989n = new a4();

    /* renamed from: q */
    private final Handler f8992q = yp.a();
    private d[] u = new d[0];

    /* renamed from: t */
    private xi[] f8995t = new xi[0];
    private long I = C.TIME_UNSET;
    private long G = -1;
    private long A = C.TIME_UNSET;
    private int C = 1;

    /* loaded from: classes.dex */
    public final class a implements jc.e, pa.a {

        /* renamed from: b */
        private final Uri f9001b;

        /* renamed from: c */
        private final cl f9002c;

        /* renamed from: d */
        private final wh f9003d;

        /* renamed from: e */
        private final k8 f9004e;

        /* renamed from: f */
        private final a4 f9005f;

        /* renamed from: h */
        private volatile boolean f9007h;

        /* renamed from: j */
        private long f9009j;

        /* renamed from: m */
        private ro f9012m;

        /* renamed from: n */
        private boolean f9013n;

        /* renamed from: g */
        private final qh f9006g = new qh();

        /* renamed from: i */
        private boolean f9008i = true;

        /* renamed from: l */
        private long f9011l = -1;
        private final long a = ic.a();

        /* renamed from: k */
        private j5 f9010k = a(0);

        public a(Uri uri, g5 g5Var, wh whVar, k8 k8Var, a4 a4Var) {
            this.f9001b = uri;
            this.f9002c = new cl(g5Var);
            this.f9003d = whVar;
            this.f9004e = k8Var;
            this.f9005f = a4Var;
        }

        @Override // com.applovin.impl.jc.e
        public void b() {
            this.f9007h = true;
        }

        @Override // com.applovin.impl.jc.e
        public void a() {
            int i10 = 0;
            while (i10 == 0 && !this.f9007h) {
                try {
                    long j3 = this.f9006g.a;
                    j5 a = a(j3);
                    this.f9010k = a;
                    long a10 = this.f9002c.a(a);
                    this.f9011l = a10;
                    if (a10 != -1) {
                        this.f9011l = a10 + j3;
                    }
                    xh.this.f8994s = ra.a(this.f9002c.e());
                    e5 e5Var = this.f9002c;
                    if (xh.this.f8994s != null && xh.this.f8994s.f7347g != -1) {
                        e5Var = new pa(this.f9002c, xh.this.f8994s.f7347g, this);
                        ro o10 = xh.this.o();
                        this.f9012m = o10;
                        o10.a(xh.O);
                    }
                    long j10 = j3;
                    this.f9003d.a(e5Var, this.f9001b, this.f9002c.e(), j3, this.f9011l, this.f9004e);
                    if (xh.this.f8994s != null) {
                        this.f9003d.c();
                    }
                    if (this.f9008i) {
                        this.f9003d.a(j10, this.f9009j);
                        this.f9008i = false;
                    }
                    while (true) {
                        long j11 = j10;
                        while (i10 == 0 && !this.f9007h) {
                            try {
                                this.f9005f.a();
                                i10 = this.f9003d.a(this.f9006g);
                                j10 = this.f9003d.b();
                                if (j10 > xh.this.f8986k + j11) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f9005f.c();
                        xh.this.f8992q.post(xh.this.f8991p);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f9003d.b() != -1) {
                        this.f9006g.a = this.f9003d.b();
                    }
                    yp.a((g5) this.f9002c);
                } catch (Throwable th2) {
                    if (i10 != 1 && this.f9003d.b() != -1) {
                        this.f9006g.a = this.f9003d.b();
                    }
                    yp.a((g5) this.f9002c);
                    throw th2;
                }
            }
        }

        @Override // com.applovin.impl.pa.a
        public void a(yg ygVar) {
            long max = !this.f9013n ? this.f9009j : Math.max(xh.this.n(), this.f9009j);
            int a = ygVar.a();
            ro roVar = (ro) a1.a(this.f9012m);
            roVar.a(ygVar, a);
            roVar.a(max, 1, a, 0, null);
            this.f9013n = true;
        }

        public void a(long j3, long j10) {
            this.f9006g.a = j3;
            this.f9009j = j10;
            this.f9008i = true;
            this.f9013n = false;
        }

        private j5 a(long j3) {
            return new j5.b().a(this.f9001b).a(j3).a(xh.this.f8985j).a(6).a(xh.N).a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(long j3, boolean z10, boolean z11);
    }

    /* loaded from: classes.dex */
    public final class c implements yi {
        private final int a;

        public c(int i10) {
            this.a = i10;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            return xh.this.a(this.a);
        }

        @Override // com.applovin.impl.yi
        public void a() {
            xh.this.d(this.a);
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i10) {
            return xh.this.a(this.a, e9Var, n5Var, i10);
        }

        @Override // com.applovin.impl.yi
        public int a(long j3) {
            return xh.this.a(this.a, j3);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;

        /* renamed from: b */
        public final boolean f9016b;

        public d(int i10, boolean z10) {
            this.a = i10;
            this.f9016b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == dVar.a && this.f9016b == dVar.f9016b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + (this.f9016b ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final qo a;

        /* renamed from: b */
        public final boolean[] f9017b;

        /* renamed from: c */
        public final boolean[] f9018c;

        /* renamed from: d */
        public final boolean[] f9019d;

        public e(qo qoVar, boolean[] zArr) {
            this.a = qoVar;
            this.f9017b = zArr;
            int i10 = qoVar.a;
            this.f9018c = new boolean[i10];
            this.f9019d = new boolean[i10];
        }
    }

    public xh(Uri uri, g5 g5Var, wh whVar, z6 z6Var, y6.a aVar, hc hcVar, xd.a aVar2, b bVar, n0 n0Var, String str, int i10) {
        this.a = uri;
        this.f8978b = g5Var;
        this.f8979c = z6Var;
        this.f8982g = aVar;
        this.f8980d = hcVar;
        this.f8981f = aVar2;
        this.f8983h = bVar;
        this.f8984i = n0Var;
        this.f8985j = str;
        this.f8986k = i10;
        this.f8988m = whVar;
        final int i11 = 0;
        this.f8990o = new Runnable(this) { // from class: com.applovin.impl.gw

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ xh f5044c;

            {
                this.f5044c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                xh xhVar = this.f5044c;
                switch (i12) {
                    case 0:
                        xhVar.r();
                        return;
                    default:
                        xhVar.q();
                        return;
                }
            }
        };
        final int i12 = 1;
        this.f8991p = new Runnable(this) { // from class: com.applovin.impl.gw

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ xh f5044c;

            {
                this.f5044c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                xh xhVar = this.f5044c;
                switch (i122) {
                    case 0:
                        xhVar.r();
                        return;
                    default:
                        xhVar.q();
                        return;
                }
            }
        };
    }

    private void k() {
        a1.b(this.f8997w);
        a1.a(this.f8999y);
        a1.a(this.f9000z);
    }

    private static Map l() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int m() {
        int i10 = 0;
        for (xi xiVar : this.f8995t) {
            i10 += xiVar.g();
        }
        return i10;
    }

    public long n() {
        long j3 = Long.MIN_VALUE;
        for (xi xiVar : this.f8995t) {
            j3 = Math.max(j3, xiVar.c());
        }
        return j3;
    }

    private boolean p() {
        return this.I != C.TIME_UNSET;
    }

    public /* synthetic */ void q() {
        if (!this.M) {
            ((rd.a) a1.a(this.f8993r)).a((lj) this);
        }
    }

    public void r() {
        boolean z10;
        we a10;
        if (!this.M && !this.f8997w && this.f8996v && this.f9000z != null) {
            for (xi xiVar : this.f8995t) {
                if (xiVar.f() == null) {
                    return;
                }
            }
            this.f8989n.c();
            int length = this.f8995t.length;
            po[] poVarArr = new po[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                d9 d9Var = (d9) a1.a(this.f8995t[i10].f());
                String str = d9Var.f4228m;
                boolean g10 = df.g(str);
                if (!g10 && !df.i(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i10] = z10;
                this.f8998x = z10 | this.f8998x;
                ra raVar = this.f8994s;
                if (raVar != null) {
                    if (g10 || this.u[i10].f9016b) {
                        we weVar = d9Var.f4226k;
                        if (weVar == null) {
                            a10 = new we(raVar);
                        } else {
                            a10 = weVar.a(raVar);
                        }
                        d9Var = d9Var.a().a(a10).a();
                    }
                    if (g10 && d9Var.f4222g == -1 && d9Var.f4223h == -1 && raVar.a != -1) {
                        d9Var = d9Var.a().b(raVar.a).a();
                    }
                }
                poVarArr[i10] = new po(d9Var.a(this.f8979c.a(d9Var)));
            }
            this.f8999y = new e(new qo(poVarArr), zArr);
            this.f8997w = true;
            ((rd.a) a1.a(this.f8993r)).a((rd) this);
        }
    }

    private void u() {
        a aVar = new a(this.a, this.f8978b, this.f8988m, this, this.f8989n);
        if (this.f8997w) {
            a1.b(p());
            long j3 = this.A;
            if (j3 == C.TIME_UNSET || this.I <= j3) {
                aVar.a(((ej) a1.a(this.f9000z)).b(this.I).a.f4943b, this.I);
                for (xi xiVar : this.f8995t) {
                    xiVar.c(this.I);
                }
                this.I = C.TIME_UNSET;
            } else {
                this.L = true;
                this.I = C.TIME_UNSET;
                return;
            }
        }
        this.K = m();
        this.f8981f.c(new ic(aVar.a, aVar.f9010k, this.f8987l.a(aVar, this, this.f8980d.a(this.C))), 1, -1, null, 0, null, aVar.f9009j, this.A);
    }

    private boolean v() {
        return this.E || p();
    }

    @Override // com.applovin.impl.rd
    public void c(long j3) {
    }

    public ro o() {
        return a(new d(0, true));
    }

    public void s() {
        this.f8987l.a(this.f8980d.a(this.C));
    }

    public void t() {
        if (this.f8997w) {
            for (xi xiVar : this.f8995t) {
                xiVar.k();
            }
        }
        this.f8987l.a(this);
        this.f8992q.removeCallbacksAndMessages(null);
        this.f8993r = null;
        this.M = true;
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j3) {
        if (this.L || this.f8987l.c() || this.J) {
            return false;
        }
        if (this.f8997w && this.F == 0) {
            return false;
        }
        boolean e2 = this.f8989n.e();
        if (this.f8987l.d()) {
            return e2;
        }
        u();
        return true;
    }

    public void d(int i10) {
        this.f8995t[i10].j();
        s();
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long j3;
        k();
        boolean[] zArr = this.f8999y.f9017b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.I;
        }
        if (this.f8998x) {
            int length = this.f8995t.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f8995t[i10].i()) {
                    j3 = Math.min(j3, this.f8995t[i10].c());
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = n();
        }
        return j3 == Long.MIN_VALUE ? this.H : j3;
    }

    @Override // com.applovin.impl.rd
    public void f() {
        s();
        if (this.L && !this.f8997w) {
            throw ah.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.impl.rd
    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // com.applovin.impl.rd
    public long h() {
        if (!this.E) {
            return C.TIME_UNSET;
        }
        if (!this.L && m() <= this.K) {
            return C.TIME_UNSET;
        }
        this.E = false;
        return this.H;
    }

    private boolean a(a aVar, int i10) {
        ej ejVar;
        if (this.G == -1 && ((ejVar = this.f9000z) == null || ejVar.d() == C.TIME_UNSET)) {
            if (this.f8997w && !v()) {
                this.J = true;
                return false;
            }
            this.E = this.f8997w;
            this.H = 0L;
            this.K = 0;
            for (xi xiVar : this.f8995t) {
                xiVar.n();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.K = i10;
        return true;
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.f8996v = true;
        this.f8992q.post(this.f8990o);
    }

    @Override // com.applovin.impl.jc.f
    public void d() {
        for (xi xiVar : this.f8995t) {
            xiVar.l();
        }
        this.f8988m.a();
    }

    private void c(int i10) {
        k();
        boolean[] zArr = this.f8999y.f9017b;
        if (this.J && zArr[i10]) {
            if (this.f8995t[i10].a(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (xi xiVar : this.f8995t) {
                xiVar.n();
            }
            ((rd.a) a1.a(this.f8993r)).a((lj) this);
        }
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        k();
        return this.f8999y.a;
    }

    private void b(int i10) {
        k();
        e eVar = this.f8999y;
        boolean[] zArr = eVar.f9019d;
        if (zArr[i10]) {
            return;
        }
        d9 a10 = eVar.a.a(i10).a(0);
        this.f8981f.a(df.e(a10.f4228m), a10, 0, (Object) null, this.H);
        zArr[i10] = true;
    }

    private void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f9011l;
        }
    }

    @Override // com.applovin.impl.rd
    public void a(long j3, boolean z10) {
        k();
        if (p()) {
            return;
        }
        boolean[] zArr = this.f8999y.f9018c;
        int length = this.f8995t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f8995t[i10].b(j3, z10, zArr[i10]);
        }
    }

    /* renamed from: c */
    public void b(ej ejVar) {
        this.f9000z = this.f8994s == null ? ejVar : new ej.b(C.TIME_UNSET);
        this.A = ejVar.d();
        boolean z10 = this.G == -1 && ejVar.d() == C.TIME_UNSET;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        this.f8983h.a(this.A, ejVar.b(), this.B);
        if (this.f8997w) {
            return;
        }
        r();
    }

    @Override // com.applovin.impl.rd
    public long a(long j3, fj fjVar) {
        k();
        if (!this.f9000z.b()) {
            return 0L;
        }
        ej.a b3 = this.f9000z.b(j3);
        return fjVar.a(j3, b3.a.a, b3.f4473b.a);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.f8987l.d() && this.f8989n.d();
    }

    public boolean a(int i10) {
        return !v() && this.f8995t[i10].a(this.L);
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j3, long j10, boolean z10) {
        cl clVar = aVar.f9002c;
        ic icVar = new ic(aVar.a, aVar.f9010k, clVar.h(), clVar.i(), j3, j10, clVar.g());
        this.f8980d.a(aVar.a);
        this.f8981f.a(icVar, 1, -1, null, 0, null, aVar.f9009j, this.A);
        if (z10) {
            return;
        }
        a(aVar);
        for (xi xiVar : this.f8995t) {
            xiVar.n();
        }
        if (this.F > 0) {
            ((rd.a) a1.a(this.f8993r)).a((lj) this);
        }
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j3, long j10) {
        ej ejVar;
        if (this.A == C.TIME_UNSET && (ejVar = this.f9000z) != null) {
            boolean b3 = ejVar.b();
            long n10 = n();
            long j11 = n10 == Long.MIN_VALUE ? 0L : n10 + 10000;
            this.A = j11;
            this.f8983h.a(j11, b3, this.B);
        }
        cl clVar = aVar.f9002c;
        ic icVar = new ic(aVar.a, aVar.f9010k, clVar.h(), clVar.i(), j3, j10, clVar.g());
        this.f8980d.a(aVar.a);
        this.f8981f.b(icVar, 1, -1, null, 0, null, aVar.f9009j, this.A);
        a(aVar);
        this.L = true;
        ((rd.a) a1.a(this.f8993r)).a((lj) this);
    }

    @Override // com.applovin.impl.jc.b
    public jc.c a(a aVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        jc.c cVar;
        a(aVar);
        cl clVar = aVar.f9002c;
        ic icVar = new ic(aVar.a, aVar.f9010k, clVar.h(), clVar.i(), j3, j10, clVar.g());
        long a10 = this.f8980d.a(new hc.a(icVar, new pd(1, -1, null, 0, null, r2.b(aVar.f9009j), r2.b(this.A)), iOException, i10));
        if (a10 == C.TIME_UNSET) {
            cVar = jc.f5472g;
        } else {
            int m10 = m();
            if (m10 > this.K) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (a(aVar2, m10)) {
                cVar = jc.a(z10, a10);
            } else {
                cVar = jc.f5471f;
            }
        }
        boolean z11 = !cVar.a();
        this.f8981f.a(icVar, 1, -1, null, 0, null, aVar.f9009j, this.A, iOException, z11);
        if (z11) {
            this.f8980d.a(aVar.a);
        }
        return cVar;
    }

    @Override // com.applovin.impl.xi.d
    public void a(d9 d9Var) {
        this.f8992q.post(this.f8990o);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j3) {
        this.f8993r = aVar;
        this.f8989n.e();
        u();
    }

    private ro a(d dVar) {
        int length = this.f8995t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.u[i10])) {
                return this.f8995t[i10];
            }
        }
        xi a10 = xi.a(this.f8984i, this.f8992q.getLooper(), this.f8979c, this.f8982g);
        a10.a(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.u, i11);
        dVarArr[length] = dVar;
        this.u = (d[]) yp.a((Object[]) dVarArr);
        xi[] xiVarArr = (xi[]) Arrays.copyOf(this.f8995t, i11);
        xiVarArr[length] = a10;
        this.f8995t = (xi[]) yp.a((Object[]) xiVarArr);
        return a10;
    }

    public int a(int i10, e9 e9Var, n5 n5Var, int i11) {
        if (v()) {
            return -3;
        }
        b(i10);
        int a10 = this.f8995t[i10].a(e9Var, n5Var, i11, this.L);
        if (a10 == -3) {
            c(i10);
        }
        return a10;
    }

    private boolean a(boolean[] zArr, long j3) {
        int length = this.f8995t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f8995t[i10].b(j3, false) && (zArr[i10] || !this.f8998x)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.impl.k8
    public void a(ej ejVar) {
        this.f8992q.post(new rs(6, this, ejVar));
    }

    @Override // com.applovin.impl.rd
    public long a(long j3) {
        k();
        boolean[] zArr = this.f8999y.f9017b;
        if (!this.f9000z.b()) {
            j3 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j3;
        if (p()) {
            this.I = j3;
            return j3;
        }
        if (this.C != 7 && a(zArr, j3)) {
            return j3;
        }
        this.J = false;
        this.I = j3;
        this.L = false;
        if (this.f8987l.d()) {
            xi[] xiVarArr = this.f8995t;
            int length = xiVarArr.length;
            while (i10 < length) {
                xiVarArr[i10].b();
                i10++;
            }
            this.f8987l.a();
        } else {
            this.f8987l.b();
            xi[] xiVarArr2 = this.f8995t;
            int length2 = xiVarArr2.length;
            while (i10 < length2) {
                xiVarArr2[i10].n();
                i10++;
            }
        }
        return j3;
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j3) {
        f8 f8Var;
        k();
        e eVar = this.f8999y;
        qo qoVar = eVar.a;
        boolean[] zArr3 = eVar.f9018c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < f8VarArr.length; i12++) {
            yi yiVar = yiVarArr[i12];
            if (yiVar != null && (f8VarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) yiVar).a;
                a1.b(zArr3[i13]);
                this.F--;
                zArr3[i13] = false;
                yiVarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j3 == 0 : i10 != 0;
        for (int i14 = 0; i14 < f8VarArr.length; i14++) {
            if (yiVarArr[i14] == null && (f8Var = f8VarArr[i14]) != null) {
                a1.b(f8Var.b() == 1);
                a1.b(f8Var.b(0) == 0);
                int a10 = qoVar.a(f8Var.a());
                a1.b(!zArr3[a10]);
                this.F++;
                zArr3[a10] = true;
                yiVarArr[i14] = new c(a10);
                zArr2[i14] = true;
                if (!z10) {
                    xi xiVar = this.f8995t[a10];
                    z10 = (xiVar.b(j3, true) || xiVar.e() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f8987l.d()) {
                xi[] xiVarArr = this.f8995t;
                int length = xiVarArr.length;
                while (i11 < length) {
                    xiVarArr[i11].b();
                    i11++;
                }
                this.f8987l.a();
            } else {
                xi[] xiVarArr2 = this.f8995t;
                int length2 = xiVarArr2.length;
                while (i11 < length2) {
                    xiVarArr2[i11].n();
                    i11++;
                }
            }
        } else if (z10) {
            j3 = a(j3);
            while (i11 < yiVarArr.length) {
                if (yiVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j3;
    }

    public int a(int i10, long j3) {
        if (v()) {
            return 0;
        }
        b(i10);
        xi xiVar = this.f8995t[i10];
        int a10 = xiVar.a(j3, this.L);
        xiVar.f(a10);
        if (a10 == 0) {
            c(i10);
        }
        return a10;
    }

    @Override // com.applovin.impl.k8
    public ro a(int i10, int i11) {
        return a(new d(i10, false));
    }
}
