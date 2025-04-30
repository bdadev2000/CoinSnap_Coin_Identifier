package com.applovin.impl;

import com.applovin.impl.rd;

/* loaded from: classes.dex */
public final class i3 implements rd, rd.a {

    /* renamed from: a, reason: collision with root package name */
    public final rd f8203a;
    private rd.a b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f8204c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f8205d;

    /* renamed from: f, reason: collision with root package name */
    long f8206f;

    /* renamed from: g, reason: collision with root package name */
    long f8207g;

    /* loaded from: classes.dex */
    public final class a implements yi {

        /* renamed from: a, reason: collision with root package name */
        public final yi f8208a;
        private boolean b;

        public a(yi yiVar) {
            this.f8208a = yiVar;
        }

        @Override // com.applovin.impl.yi
        public void a() {
            this.f8208a.a();
        }

        public void b() {
            this.b = false;
        }

        @Override // com.applovin.impl.yi
        public boolean d() {
            if (!i3.this.c() && this.f8208a.d()) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.impl.yi
        public int a(e9 e9Var, n5 n5Var, int i9) {
            if (i3.this.c()) {
                return -3;
            }
            if (this.b) {
                n5Var.e(4);
                return -4;
            }
            int a6 = this.f8208a.a(e9Var, n5Var, i9);
            if (a6 == -5) {
                d9 d9Var = (d9) AbstractC0669a1.a(e9Var.b);
                int i10 = d9Var.f7197C;
                if (i10 != 0 || d9Var.f7198D != 0) {
                    i3 i3Var = i3.this;
                    if (i3Var.f8206f != 0) {
                        i10 = 0;
                    }
                    e9Var.b = d9Var.a().e(i10).f(i3Var.f8207g == Long.MIN_VALUE ? d9Var.f7198D : 0).a();
                }
                return -5;
            }
            i3 i3Var2 = i3.this;
            long j7 = i3Var2.f8207g;
            if (j7 == Long.MIN_VALUE || ((a6 != -4 || n5Var.f9275f < j7) && !(a6 == -3 && i3Var2.e() == Long.MIN_VALUE && !n5Var.f9274d))) {
                return a6;
            }
            n5Var.b();
            n5Var.e(4);
            this.b = true;
            return -4;
        }

        @Override // com.applovin.impl.yi
        public int a(long j7) {
            if (i3.this.c()) {
                return -3;
            }
            return this.f8208a.a(j7);
        }
    }

    public i3(rd rdVar, boolean z8, long j7, long j9) {
        long j10;
        this.f8203a = rdVar;
        if (z8) {
            j10 = j7;
        } else {
            j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.f8205d = j10;
        this.f8206f = j7;
        this.f8207g = j9;
    }

    private fj b(long j7, fj fjVar) {
        long b = yp.b(fjVar.f7716a, 0L, j7 - this.f8206f);
        long j9 = fjVar.b;
        long j10 = this.f8207g;
        long b8 = yp.b(j9, 0L, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j7);
        return (b == fjVar.f7716a && b8 == fjVar.b) ? fjVar : new fj(b, b8);
    }

    @Override // com.applovin.impl.rd
    public void a(long j7, boolean z8) {
        this.f8203a.a(j7, z8);
    }

    public boolean c() {
        return this.f8205d != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.rd
    public long e() {
        long e4 = this.f8203a.e();
        if (e4 != Long.MIN_VALUE) {
            long j7 = this.f8207g;
            if (j7 == Long.MIN_VALUE || e4 < j7) {
                return e4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.rd
    public void f() {
        this.f8203a.f();
    }

    @Override // com.applovin.impl.rd
    public long g() {
        long g9 = this.f8203a.g();
        if (g9 != Long.MIN_VALUE) {
            long j7 = this.f8207g;
            if (j7 == Long.MIN_VALUE || g9 < j7) {
                return g9;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.rd
    public long h() {
        boolean z8;
        if (c()) {
            long j7 = this.f8205d;
            this.f8205d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            long h6 = h();
            if (h6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return h6;
            }
            return j7;
        }
        long h9 = this.f8203a.h();
        if (h9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        boolean z9 = false;
        if (h9 >= this.f8206f) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        long j9 = this.f8207g;
        if (j9 == Long.MIN_VALUE || h9 <= j9) {
            z9 = true;
        }
        AbstractC0669a1.b(z9);
        return h9;
    }

    @Override // com.applovin.impl.rd
    public long a(long j7, fj fjVar) {
        long j9 = this.f8206f;
        if (j7 == j9) {
            return j9;
        }
        return this.f8203a.a(j7, b(j7, fjVar));
    }

    @Override // com.applovin.impl.rd
    public void c(long j7) {
        this.f8203a.c(j7);
    }

    @Override // com.applovin.impl.rd
    public boolean a() {
        return this.f8203a.a();
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        ((rd.a) AbstractC0669a1.a(this.b)).a((rd) this);
    }

    @Override // com.applovin.impl.rd
    public void a(rd.a aVar, long j7) {
        this.b = aVar;
        this.f8203a.a(this, j7);
    }

    @Override // com.applovin.impl.rd
    public boolean b(long j7) {
        return this.f8203a.b(j7);
    }

    @Override // com.applovin.impl.rd
    public qo b() {
        return this.f8203a.b();
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
            r5.f8205d = r0
            com.applovin.impl.i3$a[] r0 = r5.f8204c
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
            com.applovin.impl.rd r0 = r5.f8203a
            long r0 = r0.a(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f8206f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f8207g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.impl.AbstractC0669a1.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(long):long");
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rd rdVar) {
        ((rd.a) AbstractC0669a1.a(this.b)).a((lj) this);
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
            r0.f8204c = r2
            int r2 = r1.length
            com.applovin.impl.yi[] r9 = new com.applovin.impl.yi[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.impl.i3$a[] r3 = r0.f8204c
            r4 = r1[r2]
            com.applovin.impl.i3$a r4 = (com.applovin.impl.i3.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.impl.yi r11 = r4.f8208a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.impl.rd r2 = r0.f8203a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.c()
            if (r4 == 0) goto L43
            long r4 = r0.f8206f
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
            r0.f8205d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f8206f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f8207g
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
            com.applovin.impl.AbstractC0669a1.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.impl.i3$a[] r4 = r0.f8204c
            r4[r10] = r11
            goto L84
        L73:
            com.applovin.impl.i3$a[] r5 = r0.f8204c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.applovin.impl.yi r6 = r6.f8208a
            if (r6 == r4) goto L84
        L7d:
            com.applovin.impl.i3$a r6 = new com.applovin.impl.i3$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.applovin.impl.i3$a[] r4 = r0.f8204c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(com.applovin.impl.f8[], boolean[], com.applovin.impl.yi[], boolean[], long):long");
    }

    private static boolean a(long j7, f8[] f8VarArr) {
        if (j7 != 0) {
            for (f8 f8Var : f8VarArr) {
                if (f8Var != null) {
                    d9 g9 = f8Var.g();
                    if (!df.a(g9.m, g9.f7209j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long j7, long j9) {
        this.f8206f = j7;
        this.f8207g = j9;
    }
}
