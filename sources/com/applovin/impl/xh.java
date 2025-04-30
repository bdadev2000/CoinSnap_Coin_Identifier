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
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xh implements rd, k8, jc.b, jc.f, xi.d {

    /* renamed from: N */
    private static final Map f12180N = l();
    private static final d9 O = new d9.b().c("icy").f("application/x-icy").a();

    /* renamed from: B */
    private boolean f12182B;

    /* renamed from: D */
    private boolean f12184D;

    /* renamed from: E */
    private boolean f12185E;

    /* renamed from: F */
    private int f12186F;

    /* renamed from: H */
    private long f12188H;

    /* renamed from: J */
    private boolean f12190J;

    /* renamed from: K */
    private int f12191K;

    /* renamed from: L */
    private boolean f12192L;

    /* renamed from: M */
    private boolean f12193M;

    /* renamed from: a */
    private final Uri f12194a;
    private final g5 b;

    /* renamed from: c */
    private final z6 f12195c;

    /* renamed from: d */
    private final hc f12196d;

    /* renamed from: f */
    private final xd.a f12197f;

    /* renamed from: g */
    private final y6.a f12198g;

    /* renamed from: h */
    private final b f12199h;

    /* renamed from: i */
    private final InterfaceC0727n0 f12200i;

    /* renamed from: j */
    private final String f12201j;

    /* renamed from: k */
    private final long f12202k;
    private final wh m;

    /* renamed from: o */
    private final Runnable f12204o;

    /* renamed from: p */
    private final Runnable f12205p;

    /* renamed from: r */
    private rd.a f12207r;

    /* renamed from: s */
    private ra f12208s;

    /* renamed from: v */
    private boolean f12211v;

    /* renamed from: w */
    private boolean f12212w;

    /* renamed from: x */
    private boolean f12213x;

    /* renamed from: y */
    private e f12214y;

    /* renamed from: z */
    private ej f12215z;
    private final jc l = new jc("ProgressiveMediaPeriod");

    /* renamed from: n */
    private final a4 f12203n = new a4();

    /* renamed from: q */
    private final Handler f12206q = yp.a();

    /* renamed from: u */
    private d[] f12210u = new d[0];

    /* renamed from: t */
    private xi[] f12209t = new xi[0];

    /* renamed from: I */
    private long f12189I = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: G */
    private long f12187G = -1;

    /* renamed from: A */
    private long f12181A = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: C */
    private int f12183C = 1;

    /* loaded from: classes.dex */
    public final class a implements jc.e, pa.a {
        private final Uri b;

        /* renamed from: c */
        private final cl f12217c;

        /* renamed from: d */
        private final wh f12218d;

        /* renamed from: e */
        private final k8 f12219e;

        /* renamed from: f */
        private final a4 f12220f;

        /* renamed from: h */
        private volatile boolean f12222h;

        /* renamed from: j */
        private long f12224j;
        private ro m;

        /* renamed from: n */
        private boolean f12226n;

        /* renamed from: g */
        private final qh f12221g = new qh();

        /* renamed from: i */
        private boolean f12223i = true;
        private long l = -1;

        /* renamed from: a */
        private final long f12216a = ic.a();

        /* renamed from: k */
        private j5 f12225k = a(0);

        public a(Uri uri, g5 g5Var, wh whVar, k8 k8Var, a4 a4Var) {
            this.b = uri;
            this.f12217c = new cl(g5Var);
            this.f12218d = whVar;
            this.f12219e = k8Var;
            this.f12220f = a4Var;
        }

        @Override // com.applovin.impl.jc.e
        public void b() {
            this.f12222h = true;
        }

        @Override // com.applovin.impl.jc.e
        public void a() {
            int i9 = 0;
            while (i9 == 0 && !this.f12222h) {
                try {
                    long j7 = this.f12221g.f10346a;
                    j5 a6 = a(j7);
                    this.f12225k = a6;
                    long a9 = this.f12217c.a(a6);
                    this.l = a9;
                    if (a9 != -1) {
                        this.l = a9 + j7;
                    }
                    xh.this.f12208s = ra.a(this.f12217c.e());
                    e5 e5Var = this.f12217c;
                    if (xh.this.f12208s != null && xh.this.f12208s.f10481g != -1) {
                        e5Var = new pa(this.f12217c, xh.this.f12208s.f10481g, this);
                        ro o3 = xh.this.o();
                        this.m = o3;
                        o3.a(xh.O);
                    }
                    long j9 = j7;
                    this.f12218d.a(e5Var, this.b, this.f12217c.e(), j7, this.l, this.f12219e);
                    if (xh.this.f12208s != null) {
                        this.f12218d.c();
                    }
                    if (this.f12223i) {
                        this.f12218d.a(j9, this.f12224j);
                        this.f12223i = false;
                    }
                    while (true) {
                        long j10 = j9;
                        while (i9 == 0 && !this.f12222h) {
                            try {
                                this.f12220f.a();
                                i9 = this.f12218d.a(this.f12221g);
                                j9 = this.f12218d.b();
                                if (j9 > xh.this.f12202k + j10) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f12220f.c();
                        xh.this.f12206q.post(xh.this.f12205p);
                    }
                    if (i9 == 1) {
                        i9 = 0;
                    } else if (this.f12218d.b() != -1) {
                        this.f12221g.f10346a = this.f12218d.b();
                    }
                    yp.a((g5) this.f12217c);
                } catch (Throwable th) {
                    if (i9 != 1 && this.f12218d.b() != -1) {
                        this.f12221g.f10346a = this.f12218d.b();
                    }
                    yp.a((g5) this.f12217c);
                    throw th;
                }
            }
        }

        @Override // com.applovin.impl.pa.a
        public void a(yg ygVar) {
            long max = !this.f12226n ? this.f12224j : Math.max(xh.this.n(), this.f12224j);
            int a6 = ygVar.a();
            ro roVar = (ro) AbstractC0669a1.a(this.m);
            roVar.a(ygVar, a6);
            roVar.a(max, 1, a6, 0, null);
            this.f12226n = true;
        }

        public void a(long j7, long j9) {
            this.f12221g.f10346a = j7;
            this.f12224j = j9;
            this.f12223i = true;
            this.f12226n = false;
        }

        private j5 a(long j7) {
            return new j5.b().a(this.b).a(j7).a(xh.this.f12201j).a(6).a(xh.f12180N).a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(long j7, boolean z8, boolean z9);
    }

    /* loaded from: classes.dex */
    public final class c implements yi {

        /* renamed from: a */
        private final int f12228a;

        public c(int i9) {
            this.f12228a = i9;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            return xh.this.a(this.f12228a);
        }

        @Override // com.applovin.impl.yi
        public void a() {
            xh.this.d(this.f12228a);
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i9) {
            return xh.this.a(this.f12228a, e9Var, n5Var, i9);
        }

        @Override // com.applovin.impl.yi
        public int a(long j7) {
            return xh.this.a(this.f12228a, j7);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f12229a;
        public final boolean b;

        public d(int i9, boolean z8) {
            this.f12229a = i9;
            this.b = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f12229a == dVar.f12229a && this.b == dVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f12229a * 31) + (this.b ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final qo f12230a;
        public final boolean[] b;

        /* renamed from: c */
        public final boolean[] f12231c;

        /* renamed from: d */
        public final boolean[] f12232d;

        public e(qo qoVar, boolean[] zArr) {
            this.f12230a = qoVar;
            this.b = zArr;
            int i9 = qoVar.f10421a;
            this.f12231c = new boolean[i9];
            this.f12232d = new boolean[i9];
        }
    }

    public xh(Uri uri, g5 g5Var, wh whVar, z6 z6Var, y6.a aVar, hc hcVar, xd.a aVar2, b bVar, InterfaceC0727n0 interfaceC0727n0, String str, int i9) {
        this.f12194a = uri;
        this.b = g5Var;
        this.f12195c = z6Var;
        this.f12198g = aVar;
        this.f12196d = hcVar;
        this.f12197f = aVar2;
        this.f12199h = bVar;
        this.f12200i = interfaceC0727n0;
        this.f12201j = str;
        this.f12202k = i9;
        this.m = whVar;
        final int i10 = 0;
        this.f12204o = new Runnable(this) { // from class: com.applovin.impl.X2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ xh f6524c;

            {
                this.f6524c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f6524c.r();
                        return;
                    default:
                        this.f6524c.q();
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f12205p = new Runnable(this) { // from class: com.applovin.impl.X2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ xh f6524c;

            {
                this.f6524c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f6524c.r();
                        return;
                    default:
                        this.f6524c.q();
                        return;
                }
            }
        };
    }

    private void k() {
        AbstractC0669a1.b(this.f12212w);
        AbstractC0669a1.a(this.f12214y);
        AbstractC0669a1.a(this.f12215z);
    }

    private static Map l() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int m() {
        int i9 = 0;
        for (xi xiVar : this.f12209t) {
            i9 += xiVar.g();
        }
        return i9;
    }

    public long n() {
        long j7 = Long.MIN_VALUE;
        for (xi xiVar : this.f12209t) {
            j7 = Math.max(j7, xiVar.c());
        }
        return j7;
    }

    private boolean p() {
        if (this.f12189I != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void q() {
        if (!this.f12193M) {
            ((rd.a) AbstractC0669a1.a(this.f12207r)).a((lj) this);
        }
    }

    public void r() {
        boolean z8;
        we a6;
        if (!this.f12193M && !this.f12212w && this.f12211v && this.f12215z != null) {
            for (xi xiVar : this.f12209t) {
                if (xiVar.f() == null) {
                    return;
                }
            }
            this.f12203n.c();
            int length = this.f12209t.length;
            po[] poVarArr = new po[length];
            boolean[] zArr = new boolean[length];
            for (int i9 = 0; i9 < length; i9++) {
                d9 d9Var = (d9) AbstractC0669a1.a(this.f12209t[i9].f());
                String str = d9Var.m;
                boolean g9 = df.g(str);
                if (!g9 && !df.i(str)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                zArr[i9] = z8;
                this.f12213x = z8 | this.f12213x;
                ra raVar = this.f12208s;
                if (raVar != null) {
                    if (g9 || this.f12210u[i9].b) {
                        we weVar = d9Var.f7210k;
                        if (weVar == null) {
                            a6 = new we(raVar);
                        } else {
                            a6 = weVar.a(raVar);
                        }
                        d9Var = d9Var.a().a(a6).a();
                    }
                    if (g9 && d9Var.f7206g == -1 && d9Var.f7207h == -1 && raVar.f10477a != -1) {
                        d9Var = d9Var.a().b(raVar.f10477a).a();
                    }
                }
                poVarArr[i9] = new po(d9Var.a(this.f12195c.a(d9Var)));
            }
            this.f12214y = new e(new qo(poVarArr), zArr);
            this.f12212w = true;
            ((rd.a) AbstractC0669a1.a(this.f12207r)).a((rd) this);
        }
    }

    private void u() {
        a aVar = new a(this.f12194a, this.b, this.m, this, this.f12203n);
        if (this.f12212w) {
            AbstractC0669a1.b(p());
            long j7 = this.f12181A;
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.f12189I <= j7) {
                aVar.a(((ej) AbstractC0669a1.a(this.f12215z)).b(this.f12189I).f7443a.b, this.f12189I);
                for (xi xiVar : this.f12209t) {
                    xiVar.c(this.f12189I);
                }
                this.f12189I = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            } else {
                this.f12192L = true;
                this.f12189I = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                return;
            }
        }
        this.f12191K = m();
        this.f12197f.c(new ic(aVar.f12216a, aVar.f12225k, this.l.a(aVar, this, this.f12196d.a(this.f12183C))), 1, -1, null, 0, null, aVar.f12224j, this.f12181A);
    }

    private boolean v() {
        if (!this.f12185E && !p()) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.rd
    public void c(long j7) {
    }

    public ro o() {
        return a(new d(0, true));
    }

    public void s() {
        this.l.a(this.f12196d.a(this.f12183C));
    }

    public void t() {
        if (this.f12212w) {
            for (xi xiVar : this.f12209t) {
                xiVar.k();
            }
        }
        this.l.a(this);
        this.f12206q.removeCallbacksAndMessages(null);
        this.f12207r = null;
        this.f12193M = true;
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j7) {
        if (this.f12192L || this.l.c() || this.f12190J) {
            return false;
        }
        if (this.f12212w && this.f12186F == 0) {
            return false;
        }
        boolean e4 = this.f12203n.e();
        if (this.l.d()) {
            return e4;
        }
        u();
        return true;
    }

    public void d(int i9) {
        this.f12209t[i9].j();
        s();
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long j7;
        k();
        boolean[] zArr = this.f12214y.b;
        if (this.f12192L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.f12189I;
        }
        if (this.f12213x) {
            int length = this.f12209t.length;
            j7 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                if (zArr[i9] && !this.f12209t[i9].i()) {
                    j7 = Math.min(j7, this.f12209t[i9].c());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = n();
        }
        return j7 == Long.MIN_VALUE ? this.f12188H : j7;
    }

    @Override // com.applovin.impl.rd
    public void f() {
        s();
        if (this.f12192L && !this.f12212w) {
            throw ah.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.impl.rd
    public long g() {
        if (this.f12186F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // com.applovin.impl.rd
    public long h() {
        if (!this.f12185E) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        if (!this.f12192L && m() <= this.f12191K) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.f12185E = false;
        return this.f12188H;
    }

    private boolean a(a aVar, int i9) {
        ej ejVar;
        if (this.f12187G == -1 && ((ejVar = this.f12215z) == null || ejVar.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET)) {
            if (this.f12212w && !v()) {
                this.f12190J = true;
                return false;
            }
            this.f12185E = this.f12212w;
            this.f12188H = 0L;
            this.f12191K = 0;
            for (xi xiVar : this.f12209t) {
                xiVar.n();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.f12191K = i9;
        return true;
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.f12211v = true;
        this.f12206q.post(this.f12204o);
    }

    @Override // com.applovin.impl.jc.f
    public void d() {
        for (xi xiVar : this.f12209t) {
            xiVar.l();
        }
        this.m.a();
    }

    private void c(int i9) {
        k();
        boolean[] zArr = this.f12214y.b;
        if (this.f12190J && zArr[i9]) {
            if (this.f12209t[i9].a(false)) {
                return;
            }
            this.f12189I = 0L;
            this.f12190J = false;
            this.f12185E = true;
            this.f12188H = 0L;
            this.f12191K = 0;
            for (xi xiVar : this.f12209t) {
                xiVar.n();
            }
            ((rd.a) AbstractC0669a1.a(this.f12207r)).a((lj) this);
        }
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        k();
        return this.f12214y.f12230a;
    }

    private void b(int i9) {
        k();
        e eVar = this.f12214y;
        boolean[] zArr = eVar.f12232d;
        if (zArr[i9]) {
            return;
        }
        d9 a6 = eVar.f12230a.a(i9).a(0);
        this.f12197f.a(df.e(a6.m), a6, 0, (Object) null, this.f12188H);
        zArr[i9] = true;
    }

    private void a(a aVar) {
        if (this.f12187G == -1) {
            this.f12187G = aVar.l;
        }
    }

    @Override // com.applovin.impl.rd
    public void a(long j7, boolean z8) {
        k();
        if (p()) {
            return;
        }
        boolean[] zArr = this.f12214y.f12231c;
        int length = this.f12209t.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f12209t[i9].b(j7, z8, zArr[i9]);
        }
    }

    /* renamed from: c */
    public void b(ej ejVar) {
        this.f12215z = this.f12208s == null ? ejVar : new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.f12181A = ejVar.d();
        boolean z8 = this.f12187G == -1 && ejVar.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f12182B = z8;
        this.f12183C = z8 ? 7 : 1;
        this.f12199h.a(this.f12181A, ejVar.b(), this.f12182B);
        if (this.f12212w) {
            return;
        }
        r();
    }

    @Override // com.applovin.impl.rd
    public long a(long j7, fj fjVar) {
        k();
        if (!this.f12215z.b()) {
            return 0L;
        }
        ej.a b8 = this.f12215z.b(j7);
        return fjVar.a(j7, b8.f7443a.f7918a, b8.b.f7918a);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.l.d() && this.f12203n.d();
    }

    public boolean a(int i9) {
        return !v() && this.f12209t[i9].a(this.f12192L);
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j7, long j9, boolean z8) {
        cl clVar = aVar.f12217c;
        ic icVar = new ic(aVar.f12216a, aVar.f12225k, clVar.h(), clVar.i(), j7, j9, clVar.g());
        this.f12196d.a(aVar.f12216a);
        this.f12197f.a(icVar, 1, -1, null, 0, null, aVar.f12224j, this.f12181A);
        if (z8) {
            return;
        }
        a(aVar);
        for (xi xiVar : this.f12209t) {
            xiVar.n();
        }
        if (this.f12186F > 0) {
            ((rd.a) AbstractC0669a1.a(this.f12207r)).a((lj) this);
        }
    }

    @Override // com.applovin.impl.jc.b
    public void a(a aVar, long j7, long j9) {
        ej ejVar;
        if (this.f12181A == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && (ejVar = this.f12215z) != null) {
            boolean b8 = ejVar.b();
            long n2 = n();
            long j10 = n2 == Long.MIN_VALUE ? 0L : n2 + 10000;
            this.f12181A = j10;
            this.f12199h.a(j10, b8, this.f12182B);
        }
        cl clVar = aVar.f12217c;
        ic icVar = new ic(aVar.f12216a, aVar.f12225k, clVar.h(), clVar.i(), j7, j9, clVar.g());
        this.f12196d.a(aVar.f12216a);
        this.f12197f.b(icVar, 1, -1, null, 0, null, aVar.f12224j, this.f12181A);
        a(aVar);
        this.f12192L = true;
        ((rd.a) AbstractC0669a1.a(this.f12207r)).a((lj) this);
    }

    @Override // com.applovin.impl.jc.b
    public jc.c a(a aVar, long j7, long j9, IOException iOException, int i9) {
        boolean z8;
        a aVar2;
        jc.c cVar;
        a(aVar);
        cl clVar = aVar.f12217c;
        ic icVar = new ic(aVar.f12216a, aVar.f12225k, clVar.h(), clVar.i(), j7, j9, clVar.g());
        long a6 = this.f12196d.a(new hc.a(icVar, new pd(1, -1, null, 0, null, AbstractC0744r2.b(aVar.f12224j), AbstractC0744r2.b(this.f12181A)), iOException, i9));
        if (a6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            cVar = jc.f8429g;
        } else {
            int m = m();
            if (m > this.f12191K) {
                aVar2 = aVar;
                z8 = true;
            } else {
                z8 = false;
                aVar2 = aVar;
            }
            if (a(aVar2, m)) {
                cVar = jc.a(z8, a6);
            } else {
                cVar = jc.f8428f;
            }
        }
        boolean z9 = !cVar.a();
        this.f12197f.a(icVar, 1, -1, null, 0, null, aVar.f12224j, this.f12181A, iOException, z9);
        if (z9) {
            this.f12196d.a(aVar.f12216a);
        }
        return cVar;
    }

    @Override // com.applovin.impl.xi.d
    public void a(d9 d9Var) {
        this.f12206q.post(this.f12204o);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j7) {
        this.f12207r = aVar;
        this.f12203n.e();
        u();
    }

    private ro a(d dVar) {
        int length = this.f12209t.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (dVar.equals(this.f12210u[i9])) {
                return this.f12209t[i9];
            }
        }
        xi a6 = xi.a(this.f12200i, this.f12206q.getLooper(), this.f12195c, this.f12198g);
        a6.a(this);
        int i10 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f12210u, i10);
        dVarArr[length] = dVar;
        this.f12210u = (d[]) yp.a((Object[]) dVarArr);
        xi[] xiVarArr = (xi[]) Arrays.copyOf(this.f12209t, i10);
        xiVarArr[length] = a6;
        this.f12209t = (xi[]) yp.a((Object[]) xiVarArr);
        return a6;
    }

    public int a(int i9, e9 e9Var, n5 n5Var, int i10) {
        if (v()) {
            return -3;
        }
        b(i9);
        int a6 = this.f12209t[i9].a(e9Var, n5Var, i10, this.f12192L);
        if (a6 == -3) {
            c(i9);
        }
        return a6;
    }

    private boolean a(boolean[] zArr, long j7) {
        int length = this.f12209t.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (!this.f12209t[i9].b(j7, false) && (zArr[i9] || !this.f12213x)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.impl.k8
    public void a(ej ejVar) {
        this.f12206q.post(new F(6, this, ejVar));
    }

    @Override // com.applovin.impl.rd
    public long a(long j7) {
        k();
        boolean[] zArr = this.f12214y.b;
        if (!this.f12215z.b()) {
            j7 = 0;
        }
        int i9 = 0;
        this.f12185E = false;
        this.f12188H = j7;
        if (p()) {
            this.f12189I = j7;
            return j7;
        }
        if (this.f12183C != 7 && a(zArr, j7)) {
            return j7;
        }
        this.f12190J = false;
        this.f12189I = j7;
        this.f12192L = false;
        if (this.l.d()) {
            xi[] xiVarArr = this.f12209t;
            int length = xiVarArr.length;
            while (i9 < length) {
                xiVarArr[i9].b();
                i9++;
            }
            this.l.a();
        } else {
            this.l.b();
            xi[] xiVarArr2 = this.f12209t;
            int length2 = xiVarArr2.length;
            while (i9 < length2) {
                xiVarArr2[i9].n();
                i9++;
            }
        }
        return j7;
    }

    @Override // com.applovin.impl.rd
    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j7) {
        f8 f8Var;
        k();
        e eVar = this.f12214y;
        qo qoVar = eVar.f12230a;
        boolean[] zArr3 = eVar.f12231c;
        int i9 = this.f12186F;
        int i10 = 0;
        for (int i11 = 0; i11 < f8VarArr.length; i11++) {
            yi yiVar = yiVarArr[i11];
            if (yiVar != null && (f8VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((c) yiVar).f12228a;
                AbstractC0669a1.b(zArr3[i12]);
                this.f12186F--;
                zArr3[i12] = false;
                yiVarArr[i11] = null;
            }
        }
        boolean z8 = !this.f12184D ? j7 == 0 : i9 != 0;
        for (int i13 = 0; i13 < f8VarArr.length; i13++) {
            if (yiVarArr[i13] == null && (f8Var = f8VarArr[i13]) != null) {
                AbstractC0669a1.b(f8Var.b() == 1);
                AbstractC0669a1.b(f8Var.b(0) == 0);
                int a6 = qoVar.a(f8Var.a());
                AbstractC0669a1.b(!zArr3[a6]);
                this.f12186F++;
                zArr3[a6] = true;
                yiVarArr[i13] = new c(a6);
                zArr2[i13] = true;
                if (!z8) {
                    xi xiVar = this.f12209t[a6];
                    z8 = (xiVar.b(j7, true) || xiVar.e() == 0) ? false : true;
                }
            }
        }
        if (this.f12186F == 0) {
            this.f12190J = false;
            this.f12185E = false;
            if (this.l.d()) {
                xi[] xiVarArr = this.f12209t;
                int length = xiVarArr.length;
                while (i10 < length) {
                    xiVarArr[i10].b();
                    i10++;
                }
                this.l.a();
            } else {
                xi[] xiVarArr2 = this.f12209t;
                int length2 = xiVarArr2.length;
                while (i10 < length2) {
                    xiVarArr2[i10].n();
                    i10++;
                }
            }
        } else if (z8) {
            j7 = a(j7);
            while (i10 < yiVarArr.length) {
                if (yiVarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f12184D = true;
        return j7;
    }

    public int a(int i9, long j7) {
        if (v()) {
            return 0;
        }
        b(i9);
        xi xiVar = this.f12209t[i9];
        int a6 = xiVar.a(j7, this.f12192L);
        xiVar.f(a6);
        if (a6 == 0) {
            c(i9);
        }
        return a6;
    }

    @Override // com.applovin.impl.k8
    public ro a(int i9, int i10) {
        return a(new d(i9, false));
    }
}
