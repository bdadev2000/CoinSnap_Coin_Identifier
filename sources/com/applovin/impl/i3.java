package com.applovin.impl;

import com.applovin.impl.rd;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class i3 implements rd, rd.a {
    public final rd a;

    /* renamed from: b, reason: collision with root package name */
    private rd.a f5239b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f5240c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f5241d;

    /* renamed from: f, reason: collision with root package name */
    long f5242f;

    /* renamed from: g, reason: collision with root package name */
    long f5243g;

    /* loaded from: classes.dex */
    public final class a implements yi {
        public final yi a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5244b;

        public a(yi yiVar) {
            this.a = yiVar;
        }

        @Override // com.applovin.impl.yi
        public void a() {
            this.a.a();
        }

        public void b() {
            this.f5244b = false;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            return !i3.this.c() && this.a.d();
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i10) {
            if (i3.this.c()) {
                return -3;
            }
            if (this.f5244b) {
                n5Var.e(4);
                return -4;
            }
            int a = this.a.a(e9Var, n5Var, i10);
            if (a == -5) {
                d9 d9Var = (d9) a1.a(e9Var.f4413b);
                int i11 = d9Var.C;
                if (i11 != 0 || d9Var.D != 0) {
                    i3 i3Var = i3.this;
                    if (i3Var.f5242f != 0) {
                        i11 = 0;
                    }
                    e9Var.f4413b = d9Var.a().e(i11).f(i3Var.f5243g == Long.MIN_VALUE ? d9Var.D : 0).a();
                }
                return -5;
            }
            i3 i3Var2 = i3.this;
            long j3 = i3Var2.f5243g;
            if (j3 == Long.MIN_VALUE || ((a != -4 || n5Var.f6353f < j3) && !(a == -3 && i3Var2.e() == Long.MIN_VALUE && !n5Var.f6352d))) {
                return a;
            }
            n5Var.b();
            n5Var.e(4);
            this.f5244b = true;
            return -4;
        }

        @Override // com.applovin.impl.yi
        public int a(long j3) {
            if (i3.this.c()) {
                return -3;
            }
            return this.a.a(j3);
        }
    }

    public i3(rd rdVar, boolean z10, long j3, long j10) {
        long j11;
        this.a = rdVar;
        if (z10) {
            j11 = j3;
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f5241d = j11;
        this.f5242f = j3;
        this.f5243g = j10;
    }

    private fj b(long j3, fj fjVar) {
        long b3 = yp.b(fjVar.a, 0L, j3 - this.f5242f);
        long j10 = fjVar.f4760b;
        long j11 = this.f5243g;
        long b10 = yp.b(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j3);
        return (b3 == fjVar.a && b10 == fjVar.f4760b) ? fjVar : new fj(b3, b10);
    }

    @Override // com.applovin.impl.rd
    public void a(long j3, boolean z10) {
        this.a.a(j3, z10);
    }

    public boolean c() {
        return this.f5241d != C.TIME_UNSET;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long e2 = this.a.e();
        if (e2 != Long.MIN_VALUE) {
            long j3 = this.f5243g;
            if (j3 == Long.MIN_VALUE || e2 < j3) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.rd
    public void f() {
        this.a.f();
    }

    @Override // com.applovin.impl.rd
    public long g() {
        long g10 = this.a.g();
        if (g10 != Long.MIN_VALUE) {
            long j3 = this.f5243g;
            if (j3 == Long.MIN_VALUE || g10 < j3) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.rd
    public long h() {
        boolean z10;
        if (c()) {
            long j3 = this.f5241d;
            this.f5241d = C.TIME_UNSET;
            long h10 = h();
            if (h10 != C.TIME_UNSET) {
                return h10;
            }
            return j3;
        }
        long h11 = this.a.h();
        if (h11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z11 = true;
        if (h11 >= this.f5242f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        long j10 = this.f5243g;
        if (j10 != Long.MIN_VALUE && h11 > j10) {
            z11 = false;
        }
        a1.b(z11);
        return h11;
    }

    @Override // com.applovin.impl.rd
    public long a(long j3, fj fjVar) {
        long j10 = this.f5242f;
        if (j3 == j10) {
            return j10;
        }
        return this.a.a(j3, b(j3, fjVar));
    }

    @Override // com.applovin.impl.rd
    public void c(long j3) {
        this.a.c(j3);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.a.a();
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) a1.a(this.f5239b)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j3) {
        this.f5239b = aVar;
        this.a.a(this, j3);
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j3) {
        return this.a.b(j3);
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.applovin.impl.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f5241d = r0
            com.applovin.impl.i3$a[] r0 = r5.f5240c
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
            com.applovin.impl.rd r0 = r5.a
            long r0 = r0.a(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f5242f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f5243g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.impl.a1.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(long):long");
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) a1.a(this.f5239b)).a((lj) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.applovin.impl.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.applovin.impl.f8[] r13, boolean[] r14, com.applovin.impl.yi[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.impl.i3$a[] r2 = new com.applovin.impl.i3.a[r2]
            r0.f5240c = r2
            int r2 = r1.length
            com.applovin.impl.yi[] r9 = new com.applovin.impl.yi[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.impl.i3$a[] r3 = r0.f5240c
            r4 = r1[r2]
            com.applovin.impl.i3$a r4 = (com.applovin.impl.i3.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.impl.yi r11 = r4.a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.impl.rd r2 = r0.a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.c()
            if (r4 == 0) goto L43
            long r4 = r0.f5242f
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
            r0.f5241d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f5242f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f5243g
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
            com.applovin.impl.a1.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.impl.i3$a[] r4 = r0.f5240c
            r4[r10] = r11
            goto L84
        L73:
            com.applovin.impl.i3$a[] r5 = r0.f5240c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.applovin.impl.yi r6 = r6.a
            if (r6 == r4) goto L84
        L7d:
            com.applovin.impl.i3$a r6 = new com.applovin.impl.i3$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.applovin.impl.i3$a[] r4 = r0.f5240c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(com.applovin.impl.f8[], boolean[], com.applovin.impl.yi[], boolean[], long):long");
    }

    private static boolean a(long j3, f8[] f8VarArr) {
        if (j3 != 0) {
            for (f8 f8Var : f8VarArr) {
                if (f8Var != null) {
                    d9 g10 = f8Var.g();
                    if (!df.a(g10.f4228m, g10.f4225j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long j3, long j10) {
        this.f5242f = j3;
        this.f5243g = j10;
    }
}
