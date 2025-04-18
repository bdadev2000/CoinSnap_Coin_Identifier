package com.applovin.impl;

import android.net.Uri;
import android.os.Handler;
import com.applovin.impl.a7;
import com.applovin.impl.bj;
import com.applovin.impl.ce;
import com.applovin.impl.f9;
import com.applovin.impl.ij;
import com.applovin.impl.l5;
import com.applovin.impl.mc;
import com.applovin.impl.oc;
import com.applovin.impl.ta;
import com.applovin.impl.wd;
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ai implements wd, m8, oc.b, oc.f, bj.d {
    private static final Map N = l();
    private static final f9 O = new f9.b().c("icy").f("application/x-icy").a();
    private boolean B;
    private boolean D;
    private boolean E;
    private int F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: a */
    private final Uri f22852a;

    /* renamed from: b */
    private final i5 f22853b;

    /* renamed from: c */
    private final b7 f22854c;
    private final mc d;

    /* renamed from: f */
    private final ce.a f22855f;

    /* renamed from: g */
    private final a7.a f22856g;

    /* renamed from: h */
    private final b f22857h;

    /* renamed from: i */
    private final n0 f22858i;

    /* renamed from: j */
    private final String f22859j;

    /* renamed from: k */
    private final long f22860k;

    /* renamed from: m */
    private final zh f22862m;

    /* renamed from: o */
    private final Runnable f22864o;

    /* renamed from: p */
    private final Runnable f22865p;

    /* renamed from: r */
    private wd.a f22867r;

    /* renamed from: s */
    private va f22868s;

    /* renamed from: v */
    private boolean f22871v;
    private boolean w;
    private boolean x;

    /* renamed from: y */
    private e f22872y;

    /* renamed from: z */
    private ij f22873z;

    /* renamed from: l */
    private final oc f22861l = new oc("ProgressiveMediaPeriod");

    /* renamed from: n */
    private final c4 f22863n = new c4();

    /* renamed from: q */
    private final Handler f22866q = xp.a();

    /* renamed from: u */
    private d[] f22870u = new d[0];

    /* renamed from: t */
    private bj[] f22869t = new bj[0];
    private long I = -9223372036854775807L;
    private long G = -1;
    private long A = -9223372036854775807L;
    private int C = 1;

    /* loaded from: classes.dex */
    public final class a implements oc.e, ta.a {

        /* renamed from: b */
        private final Uri f22875b;

        /* renamed from: c */
        private final fl f22876c;
        private final zh d;
        private final m8 e;

        /* renamed from: f */
        private final c4 f22877f;

        /* renamed from: h */
        private volatile boolean f22879h;

        /* renamed from: j */
        private long f22881j;

        /* renamed from: m */
        private qo f22884m;

        /* renamed from: n */
        private boolean f22885n;

        /* renamed from: g */
        private final th f22878g = new th();

        /* renamed from: i */
        private boolean f22880i = true;

        /* renamed from: l */
        private long f22883l = -1;

        /* renamed from: a */
        private final long f22874a = nc.a();

        /* renamed from: k */
        private l5 f22882k = a(0);

        public a(Uri uri, i5 i5Var, zh zhVar, m8 m8Var, c4 c4Var) {
            this.f22875b = uri;
            this.f22876c = new fl(i5Var);
            this.d = zhVar;
            this.e = m8Var;
            this.f22877f = c4Var;
        }

        @Override // com.applovin.impl.oc.e
        public void b() {
            this.f22879h = true;
        }

        @Override // com.applovin.impl.oc.e
        public void a() {
            int i2 = 0;
            while (i2 == 0 && !this.f22879h) {
                try {
                    long j2 = this.f22878g.f27165a;
                    l5 a2 = a(j2);
                    this.f22882k = a2;
                    long a3 = this.f22876c.a(a2);
                    this.f22883l = a3;
                    if (a3 != -1) {
                        this.f22883l = a3 + j2;
                    }
                    ai.this.f22868s = va.a(this.f22876c.e());
                    g5 g5Var = this.f22876c;
                    if (ai.this.f22868s != null && ai.this.f22868s.f27516g != -1) {
                        g5Var = new ta(this.f22876c, ai.this.f22868s.f27516g, this);
                        qo o2 = ai.this.o();
                        this.f22884m = o2;
                        o2.a(ai.O);
                    }
                    long j3 = j2;
                    this.d.a(g5Var, this.f22875b, this.f22876c.e(), j2, this.f22883l, this.e);
                    if (ai.this.f22868s != null) {
                        this.d.c();
                    }
                    if (this.f22880i) {
                        this.d.a(j3, this.f22881j);
                        this.f22880i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i2 == 0 && !this.f22879h) {
                            try {
                                this.f22877f.a();
                                i2 = this.d.a(this.f22878g);
                                j3 = this.d.b();
                                if (j3 > ai.this.f22860k + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f22877f.c();
                        ai.this.f22866q.post(ai.this.f22865p);
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (this.d.b() != -1) {
                        this.f22878g.f27165a = this.d.b();
                    }
                    xp.a((i5) this.f22876c);
                } catch (Throwable th) {
                    if (i2 != 1 && this.d.b() != -1) {
                        this.f22878g.f27165a = this.d.b();
                    }
                    xp.a((i5) this.f22876c);
                    throw th;
                }
            }
        }

        @Override // com.applovin.impl.ta.a
        public void a(bh bhVar) {
            long max = !this.f22885n ? this.f22881j : Math.max(ai.this.n(), this.f22881j);
            int a2 = bhVar.a();
            qo qoVar = (qo) b1.a(this.f22884m);
            qoVar.a(bhVar, a2);
            qoVar.a(max, 1, a2, 0, null);
            this.f22885n = true;
        }

        public void a(long j2, long j3) {
            this.f22878g.f27165a = j2;
            this.f22881j = j3;
            this.f22880i = true;
            this.f22885n = false;
        }

        private l5 a(long j2) {
            return new l5.b().a(this.f22875b).a(j2).a(ai.this.f22859j).a(6).a(ai.N).a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(long j2, boolean z2, boolean z3);
    }

    /* loaded from: classes.dex */
    public final class c implements cj {

        /* renamed from: a */
        private final int f22887a;

        public c(int i2) {
            this.f22887a = i2;
        }

        @Override // com.applovin.impl.cj
        public boolean d() {
            return ai.this.a(this.f22887a);
        }

        @Override // com.applovin.impl.cj
        public void a() {
            ai.this.d(this.f22887a);
        }

        @Override // com.applovin.impl.cj
        public int a(g9 g9Var, p5 p5Var, int i2) {
            return ai.this.a(this.f22887a, g9Var, p5Var, i2);
        }

        @Override // com.applovin.impl.cj
        public int a(long j2) {
            return ai.this.a(this.f22887a, j2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f22889a;

        /* renamed from: b */
        public final boolean f22890b;

        public d(int i2, boolean z2) {
            this.f22889a = i2;
            this.f22890b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22889a == dVar.f22889a && this.f22890b == dVar.f22890b;
        }

        public int hashCode() {
            return (this.f22889a * 31) + (this.f22890b ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final po f22891a;

        /* renamed from: b */
        public final boolean[] f22892b;

        /* renamed from: c */
        public final boolean[] f22893c;
        public final boolean[] d;

        public e(po poVar, boolean[] zArr) {
            this.f22891a = poVar;
            this.f22892b = zArr;
            int i2 = poVar.f26088a;
            this.f22893c = new boolean[i2];
            this.d = new boolean[i2];
        }
    }

    public ai(Uri uri, i5 i5Var, zh zhVar, b7 b7Var, a7.a aVar, mc mcVar, ce.a aVar2, b bVar, n0 n0Var, String str, int i2) {
        this.f22852a = uri;
        this.f22853b = i5Var;
        this.f22854c = b7Var;
        this.f22856g = aVar;
        this.d = mcVar;
        this.f22855f = aVar2;
        this.f22857h = bVar;
        this.f22858i = n0Var;
        this.f22859j = str;
        this.f22860k = i2;
        this.f22862m = zhVar;
        final int i3 = 0;
        this.f22864o = new Runnable(this) { // from class: com.applovin.impl.ls

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ai f25150b;

            {
                this.f25150b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                ai aiVar = this.f25150b;
                switch (i4) {
                    case 0:
                        aiVar.r();
                        return;
                    default:
                        aiVar.q();
                        return;
                }
            }
        };
        final int i4 = 1;
        this.f22865p = new Runnable(this) { // from class: com.applovin.impl.ls

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ai f25150b;

            {
                this.f25150b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                ai aiVar = this.f25150b;
                switch (i42) {
                    case 0:
                        aiVar.r();
                        return;
                    default:
                        aiVar.q();
                        return;
                }
            }
        };
    }

    private void k() {
        b1.b(this.w);
        b1.a(this.f22872y);
        b1.a(this.f22873z);
    }

    private static Map l() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        return Collections.unmodifiableMap(hashMap);
    }

    private int m() {
        int i2 = 0;
        for (bj bjVar : this.f22869t) {
            i2 += bjVar.g();
        }
        return i2;
    }

    public long n() {
        long j2 = Long.MIN_VALUE;
        for (bj bjVar : this.f22869t) {
            j2 = Math.max(j2, bjVar.c());
        }
        return j2;
    }

    private boolean p() {
        return this.I != -9223372036854775807L;
    }

    public /* synthetic */ void q() {
        if (this.M) {
            return;
        }
        ((wd.a) b1.a(this.f22867r)).a((pj) this);
    }

    public void r() {
        if (this.M || this.w || !this.f22871v || this.f22873z == null) {
            return;
        }
        for (bj bjVar : this.f22869t) {
            if (bjVar.f() == null) {
                return;
            }
        }
        this.f22863n.c();
        int length = this.f22869t.length;
        oo[] ooVarArr = new oo[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            f9 f9Var = (f9) b1.a(this.f22869t[i2].f());
            String str = f9Var.f23840m;
            boolean g2 = Cif.g(str);
            boolean z2 = g2 || Cif.i(str);
            zArr[i2] = z2;
            this.x = z2 | this.x;
            va vaVar = this.f22868s;
            if (vaVar != null) {
                if (g2 || this.f22870u[i2].f22890b) {
                    bf bfVar = f9Var.f23838k;
                    f9Var = f9Var.a().a(bfVar == null ? new bf(vaVar) : bfVar.a(vaVar)).a();
                }
                if (g2 && f9Var.f23834g == -1 && f9Var.f23835h == -1 && vaVar.f27512a != -1) {
                    f9Var = f9Var.a().b(vaVar.f27512a).a();
                }
            }
            ooVarArr[i2] = new oo(f9Var.a(this.f22854c.a(f9Var)));
        }
        this.f22872y = new e(new po(ooVarArr), zArr);
        this.w = true;
        ((wd.a) b1.a(this.f22867r)).a((wd) this);
    }

    private void u() {
        a aVar = new a(this.f22852a, this.f22853b, this.f22862m, this, this.f22863n);
        if (this.w) {
            b1.b(p());
            long j2 = this.A;
            if (j2 != -9223372036854775807L && this.I > j2) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            aVar.a(((ij) b1.a(this.f22873z)).b(this.I).f24497a.f24924b, this.I);
            for (bj bjVar : this.f22869t) {
                bjVar.c(this.I);
            }
            this.I = -9223372036854775807L;
        }
        this.K = m();
        this.f22855f.c(new nc(aVar.f22874a, aVar.f22882k, this.f22861l.a(aVar, this, this.d.a(this.C))), 1, -1, null, 0, null, aVar.f22881j, this.A);
    }

    private boolean v() {
        return this.E || p();
    }

    @Override // com.applovin.impl.wd
    public void c(long j2) {
    }

    public qo o() {
        return a(new d(0, true));
    }

    public void s() {
        this.f22861l.a(this.d.a(this.C));
    }

    public void t() {
        if (this.w) {
            for (bj bjVar : this.f22869t) {
                bjVar.k();
            }
        }
        this.f22861l.a(this);
        this.f22866q.removeCallbacksAndMessages(null);
        this.f22867r = null;
        this.M = true;
    }

    @Override // com.applovin.impl.wd
    public boolean b(long j2) {
        if (this.L || this.f22861l.c() || this.J) {
            return false;
        }
        if (this.w && this.F == 0) {
            return false;
        }
        boolean e2 = this.f22863n.e();
        if (this.f22861l.d()) {
            return e2;
        }
        u();
        return true;
    }

    public void d(int i2) {
        this.f22869t[i2].j();
        s();
    }

    @Override // com.applovin.impl.wd
    public long e() {
        long j2;
        k();
        boolean[] zArr = this.f22872y.f22892b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.I;
        }
        if (this.x) {
            int length = this.f22869t.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.f22869t[i2].i()) {
                    j2 = Math.min(j2, this.f22869t[i2].c());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = n();
        }
        return j2 == Long.MIN_VALUE ? this.H : j2;
    }

    @Override // com.applovin.impl.wd
    public void f() {
        s();
        if (this.L && !this.w) {
            throw dh.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.impl.wd
    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    @Override // com.applovin.impl.wd
    public long h() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && m() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    private boolean a(a aVar, int i2) {
        ij ijVar;
        if (this.G != -1 || ((ijVar = this.f22873z) != null && ijVar.d() != -9223372036854775807L)) {
            this.K = i2;
            return true;
        }
        if (this.w && !v()) {
            this.J = true;
            return false;
        }
        this.E = this.w;
        this.H = 0L;
        this.K = 0;
        for (bj bjVar : this.f22869t) {
            bjVar.n();
        }
        aVar.a(0L, 0L);
        return true;
    }

    @Override // com.applovin.impl.m8
    public void c() {
        this.f22871v = true;
        this.f22866q.post(this.f22864o);
    }

    private void c(int i2) {
        k();
        boolean[] zArr = this.f22872y.f22892b;
        if (this.J && zArr[i2]) {
            if (this.f22869t[i2].a(false)) {
                return;
            }
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (bj bjVar : this.f22869t) {
                bjVar.n();
            }
            ((wd.a) b1.a(this.f22867r)).a((pj) this);
        }
    }

    @Override // com.applovin.impl.oc.f
    public void d() {
        for (bj bjVar : this.f22869t) {
            bjVar.l();
        }
        this.f22862m.a();
    }

    @Override // com.applovin.impl.wd
    public po b() {
        k();
        return this.f22872y.f22891a;
    }

    private void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f22883l;
        }
    }

    private void b(int i2) {
        k();
        e eVar = this.f22872y;
        boolean[] zArr = eVar.d;
        if (zArr[i2]) {
            return;
        }
        f9 a2 = eVar.f22891a.a(i2).a(0);
        this.f22855f.a(Cif.e(a2.f23840m), a2, 0, (Object) null, this.H);
        zArr[i2] = true;
    }

    @Override // com.applovin.impl.wd
    public void a(long j2, boolean z2) {
        k();
        if (p()) {
            return;
        }
        boolean[] zArr = this.f22872y.f22893c;
        int length = this.f22869t.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f22869t[i2].b(j2, z2, zArr[i2]);
        }
    }

    /* renamed from: c */
    public void b(ij ijVar) {
        this.f22873z = this.f22868s == null ? ijVar : new ij.b(-9223372036854775807L);
        this.A = ijVar.d();
        boolean z2 = this.G == -1 && ijVar.d() == -9223372036854775807L;
        this.B = z2;
        this.C = z2 ? 7 : 1;
        this.f22857h.a(this.A, ijVar.b(), this.B);
        if (this.w) {
            return;
        }
        r();
    }

    @Override // com.applovin.impl.wd
    public long a(long j2, jj jjVar) {
        k();
        if (!this.f22873z.b()) {
            return 0L;
        }
        ij.a b2 = this.f22873z.b(j2);
        return jjVar.a(j2, b2.f24497a.f24923a, b2.f24498b.f24923a);
    }

    @Override // com.applovin.impl.wd
    public boolean a() {
        return this.f22861l.d() && this.f22863n.d();
    }

    public boolean a(int i2) {
        return !v() && this.f22869t[i2].a(this.L);
    }

    @Override // com.applovin.impl.oc.b
    public void a(a aVar, long j2, long j3, boolean z2) {
        fl flVar = aVar.f22876c;
        nc ncVar = new nc(aVar.f22874a, aVar.f22882k, flVar.h(), flVar.i(), j2, j3, flVar.g());
        this.d.a(aVar.f22874a);
        this.f22855f.a(ncVar, 1, -1, null, 0, null, aVar.f22881j, this.A);
        if (z2) {
            return;
        }
        a(aVar);
        for (bj bjVar : this.f22869t) {
            bjVar.n();
        }
        if (this.F > 0) {
            ((wd.a) b1.a(this.f22867r)).a((pj) this);
        }
    }

    @Override // com.applovin.impl.oc.b
    public void a(a aVar, long j2, long j3) {
        ij ijVar;
        if (this.A == -9223372036854775807L && (ijVar = this.f22873z) != null) {
            boolean b2 = ijVar.b();
            long n2 = n();
            long j4 = n2 == Long.MIN_VALUE ? 0L : n2 + 10000;
            this.A = j4;
            this.f22857h.a(j4, b2, this.B);
        }
        fl flVar = aVar.f22876c;
        nc ncVar = new nc(aVar.f22874a, aVar.f22882k, flVar.h(), flVar.i(), j2, j3, flVar.g());
        this.d.a(aVar.f22874a);
        this.f22855f.b(ncVar, 1, -1, null, 0, null, aVar.f22881j, this.A);
        a(aVar);
        this.L = true;
        ((wd.a) b1.a(this.f22867r)).a((pj) this);
    }

    @Override // com.applovin.impl.oc.b
    public oc.c a(a aVar, long j2, long j3, IOException iOException, int i2) {
        boolean z2;
        a aVar2;
        oc.c cVar;
        a(aVar);
        fl flVar = aVar.f22876c;
        nc ncVar = new nc(aVar.f22874a, aVar.f22882k, flVar.h(), flVar.i(), j2, j3, flVar.g());
        long a2 = this.d.a(new mc.a(ncVar, new ud(1, -1, null, 0, null, t2.b(aVar.f22881j), t2.b(this.A)), iOException, i2));
        if (a2 == -9223372036854775807L) {
            cVar = oc.f25825g;
        } else {
            int m2 = m();
            if (m2 > this.K) {
                aVar2 = aVar;
                z2 = true;
            } else {
                z2 = false;
                aVar2 = aVar;
            }
            if (a(aVar2, m2)) {
                cVar = oc.a(z2, a2);
            } else {
                cVar = oc.f25824f;
            }
        }
        boolean z3 = !cVar.a();
        this.f22855f.a(ncVar, 1, -1, null, 0, null, aVar.f22881j, this.A, iOException, z3);
        if (z3) {
            this.d.a(aVar.f22874a);
        }
        return cVar;
    }

    @Override // com.applovin.impl.bj.d
    public void a(f9 f9Var) {
        this.f22866q.post(this.f22864o);
    }

    @Override // com.applovin.impl.wd
    public void a(wd.a aVar, long j2) {
        this.f22867r = aVar;
        this.f22863n.e();
        u();
    }

    private qo a(d dVar) {
        int length = this.f22869t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dVar.equals(this.f22870u[i2])) {
                return this.f22869t[i2];
            }
        }
        bj a2 = bj.a(this.f22858i, this.f22866q.getLooper(), this.f22854c, this.f22856g);
        a2.a(this);
        int i3 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f22870u, i3);
        dVarArr[length] = dVar;
        this.f22870u = (d[]) xp.a((Object[]) dVarArr);
        bj[] bjVarArr = (bj[]) Arrays.copyOf(this.f22869t, i3);
        bjVarArr[length] = a2;
        this.f22869t = (bj[]) xp.a((Object[]) bjVarArr);
        return a2;
    }

    public int a(int i2, g9 g9Var, p5 p5Var, int i3) {
        if (v()) {
            return -3;
        }
        b(i2);
        int a2 = this.f22869t[i2].a(g9Var, p5Var, i3, this.L);
        if (a2 == -3) {
            c(i2);
        }
        return a2;
    }

    private boolean a(boolean[] zArr, long j2) {
        int length = this.f22869t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.f22869t[i2].b(j2, false) && (zArr[i2] || !this.x)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.impl.m8
    public void a(ij ijVar) {
        this.f22866q.post(new ms(0, this, ijVar));
    }

    @Override // com.applovin.impl.wd
    public long a(long j2) {
        k();
        boolean[] zArr = this.f22872y.f22892b;
        if (!this.f22873z.b()) {
            j2 = 0;
        }
        int i2 = 0;
        this.E = false;
        this.H = j2;
        if (p()) {
            this.I = j2;
            return j2;
        }
        if (this.C != 7 && a(zArr, j2)) {
            return j2;
        }
        this.J = false;
        this.I = j2;
        this.L = false;
        if (this.f22861l.d()) {
            bj[] bjVarArr = this.f22869t;
            int length = bjVarArr.length;
            while (i2 < length) {
                bjVarArr[i2].b();
                i2++;
            }
            this.f22861l.a();
        } else {
            this.f22861l.b();
            bj[] bjVarArr2 = this.f22869t;
            int length2 = bjVarArr2.length;
            while (i2 < length2) {
                bjVarArr2[i2].n();
                i2++;
            }
        }
        return j2;
    }

    @Override // com.applovin.impl.wd
    public long a(h8[] h8VarArr, boolean[] zArr, cj[] cjVarArr, boolean[] zArr2, long j2) {
        h8 h8Var;
        k();
        e eVar = this.f22872y;
        po poVar = eVar.f22891a;
        boolean[] zArr3 = eVar.f22893c;
        int i2 = this.F;
        int i3 = 0;
        for (int i4 = 0; i4 < h8VarArr.length; i4++) {
            cj cjVar = cjVarArr[i4];
            if (cjVar != null && (h8VarArr[i4] == null || !zArr[i4])) {
                int i5 = ((c) cjVar).f22887a;
                b1.b(zArr3[i5]);
                this.F--;
                zArr3[i5] = false;
                cjVarArr[i4] = null;
            }
        }
        boolean z2 = !this.D ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < h8VarArr.length; i6++) {
            if (cjVarArr[i6] == null && (h8Var = h8VarArr[i6]) != null) {
                b1.b(h8Var.b() == 1);
                b1.b(h8Var.b(0) == 0);
                int a2 = poVar.a(h8Var.a());
                b1.b(!zArr3[a2]);
                this.F++;
                zArr3[a2] = true;
                cjVarArr[i6] = new c(a2);
                zArr2[i6] = true;
                if (!z2) {
                    bj bjVar = this.f22869t[a2];
                    z2 = (bjVar.b(j2, true) || bjVar.e() == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f22861l.d()) {
                bj[] bjVarArr = this.f22869t;
                int length = bjVarArr.length;
                while (i3 < length) {
                    bjVarArr[i3].b();
                    i3++;
                }
                this.f22861l.a();
            } else {
                bj[] bjVarArr2 = this.f22869t;
                int length2 = bjVarArr2.length;
                while (i3 < length2) {
                    bjVarArr2[i3].n();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = a(j2);
            while (i3 < cjVarArr.length) {
                if (cjVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.D = true;
        return j2;
    }

    public int a(int i2, long j2) {
        if (v()) {
            return 0;
        }
        b(i2);
        bj bjVar = this.f22869t[i2];
        int a2 = bjVar.a(j2, this.L);
        bjVar.f(a2);
        if (a2 == 0) {
            c(i2);
        }
        return a2;
    }

    @Override // com.applovin.impl.m8
    public qo a(int i2, int i3) {
        return a(new d(i2, false));
    }
}
