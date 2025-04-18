package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class k3 implements wd, wd.a {

    /* renamed from: a, reason: collision with root package name */
    public final wd f24803a;

    /* renamed from: b, reason: collision with root package name */
    private wd.a f24804b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f24805c = new a[0];
    private long d;

    /* renamed from: f, reason: collision with root package name */
    long f24806f;

    /* renamed from: g, reason: collision with root package name */
    long f24807g;

    /* loaded from: classes.dex */
    public final class a implements cj {

        /* renamed from: a, reason: collision with root package name */
        public final cj f24808a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24809b;

        public a(cj cjVar) {
            this.f24808a = cjVar;
        }

        @Override // com.applovin.impl.cj
        public void a() {
            this.f24808a.a();
        }

        public void b() {
            this.f24809b = false;
        }

        @Override // com.applovin.impl.cj
        public boolean d() {
            return !k3.this.c() && this.f24808a.d();
        }

        @Override // com.applovin.impl.cj
        public int a(g9 g9Var, p5 p5Var, int i2) {
            if (k3.this.c()) {
                return -3;
            }
            if (this.f24809b) {
                p5Var.e(4);
                return -4;
            }
            int a2 = this.f24808a.a(g9Var, p5Var, i2);
            if (a2 == -5) {
                f9 f9Var = (f9) b1.a(g9Var.f24058b);
                int i3 = f9Var.C;
                if (i3 != 0 || f9Var.D != 0) {
                    k3 k3Var = k3.this;
                    if (k3Var.f24806f != 0) {
                        i3 = 0;
                    }
                    g9Var.f24058b = f9Var.a().e(i3).f(k3Var.f24807g == Long.MIN_VALUE ? f9Var.D : 0).a();
                }
                return -5;
            }
            k3 k3Var2 = k3.this;
            long j2 = k3Var2.f24807g;
            if (j2 == Long.MIN_VALUE || ((a2 != -4 || p5Var.f25964f < j2) && !(a2 == -3 && k3Var2.e() == Long.MIN_VALUE && !p5Var.d))) {
                return a2;
            }
            p5Var.b();
            p5Var.e(4);
            this.f24809b = true;
            return -4;
        }

        @Override // com.applovin.impl.cj
        public int a(long j2) {
            if (k3.this.c()) {
                return -3;
            }
            return this.f24808a.a(j2);
        }
    }

    public k3(wd wdVar, boolean z2, long j2, long j3) {
        this.f24803a = wdVar;
        this.d = z2 ? j2 : -9223372036854775807L;
        this.f24806f = j2;
        this.f24807g = j3;
    }

    private jj b(long j2, jj jjVar) {
        long b2 = xp.b(jjVar.f24699a, 0L, j2 - this.f24806f);
        long j3 = jjVar.f24700b;
        long j4 = this.f24807g;
        long b3 = xp.b(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (b2 == jjVar.f24699a && b3 == jjVar.f24700b) ? jjVar : new jj(b2, b3);
    }

    public void a(long j2, long j3) {
        this.f24806f = j2;
        this.f24807g = j3;
    }

    public boolean c() {
        return this.d != -9223372036854775807L;
    }

    @Override // com.applovin.impl.wd
    public long e() {
        long e = this.f24803a.e();
        if (e != Long.MIN_VALUE) {
            long j2 = this.f24807g;
            if (j2 == Long.MIN_VALUE || e < j2) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.wd
    public void f() {
        this.f24803a.f();
    }

    @Override // com.applovin.impl.wd
    public long g() {
        long g2 = this.f24803a.g();
        if (g2 != Long.MIN_VALUE) {
            long j2 = this.f24807g;
            if (j2 == Long.MIN_VALUE || g2 < j2) {
                return g2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.wd
    public long h() {
        if (c()) {
            long j2 = this.d;
            this.d = -9223372036854775807L;
            long h2 = h();
            return h2 != -9223372036854775807L ? h2 : j2;
        }
        long h3 = this.f24803a.h();
        if (h3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        b1.b(h3 >= this.f24806f);
        long j3 = this.f24807g;
        b1.b(j3 == Long.MIN_VALUE || h3 <= j3);
        return h3;
    }

    @Override // com.applovin.impl.wd
    public void a(long j2, boolean z2) {
        this.f24803a.a(j2, z2);
    }

    @Override // com.applovin.impl.wd
    public void c(long j2) {
        this.f24803a.c(j2);
    }

    @Override // com.applovin.impl.wd
    public long a(long j2, jj jjVar) {
        long j3 = this.f24806f;
        if (j2 == j3) {
            return j3;
        }
        return this.f24803a.a(j2, b(j2, jjVar));
    }

    @Override // com.applovin.impl.wd
    public boolean a() {
        return this.f24803a.a();
    }

    @Override // com.applovin.impl.wd.a
    public void a(wd wdVar) {
        ((wd.a) b1.a(this.f24804b)).a((wd) this);
    }

    @Override // com.applovin.impl.wd
    public boolean b(long j2) {
        return this.f24803a.b(j2);
    }

    @Override // com.applovin.impl.wd
    public void a(wd.a aVar, long j2) {
        this.f24804b = aVar;
        this.f24803a.a(this, j2);
    }

    @Override // com.applovin.impl.wd
    public po b() {
        return this.f24803a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.applovin.impl.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.d = r0
            com.applovin.impl.k3$a[] r0 = r5.f24805c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.applovin.impl.wd r0 = r5.f24803a
            long r0 = r0.a(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f24806f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f24807g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.impl.b1.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k3.a(long):long");
    }

    @Override // com.applovin.impl.pj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(wd wdVar) {
        ((wd.a) b1.a(this.f24804b)).a((pj) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.applovin.impl.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.applovin.impl.h8[] r13, boolean[] r14, com.applovin.impl.cj[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.impl.k3$a[] r2 = new com.applovin.impl.k3.a[r2]
            r0.f24805c = r2
            int r2 = r1.length
            com.applovin.impl.cj[] r9 = new com.applovin.impl.cj[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.impl.k3$a[] r3 = r0.f24805c
            r4 = r1[r2]
            com.applovin.impl.k3$a r4 = (com.applovin.impl.k3.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.impl.cj r11 = r4.f24808a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.impl.wd r2 = r0.f24803a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.c()
            if (r4 == 0) goto L43
            long r4 = r0.f24806f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = a(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f24806f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f24807g
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            com.applovin.impl.b1.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.impl.k3$a[] r4 = r0.f24805c
            r4[r10] = r11
            goto L84
        L73:
            com.applovin.impl.k3$a[] r5 = r0.f24805c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.applovin.impl.cj r6 = r6.f24808a
            if (r6 == r4) goto L84
        L7d:
            com.applovin.impl.k3$a r6 = new com.applovin.impl.k3$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.applovin.impl.k3$a[] r4 = r0.f24805c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k3.a(com.applovin.impl.h8[], boolean[], com.applovin.impl.cj[], boolean[], long):long");
    }

    private static boolean a(long j2, h8[] h8VarArr) {
        if (j2 != 0) {
            for (h8 h8Var : h8VarArr) {
                if (h8Var != null) {
                    f9 g2 = h8Var.g();
                    if (!Cif.a(g2.f23840m, g2.f23837j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
