package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class c9 implements i8 {

    /* renamed from: q */
    public static final m8 f7048q = new A0(0);

    /* renamed from: f */
    private k8 f7053f;

    /* renamed from: h */
    private boolean f7055h;

    /* renamed from: i */
    private long f7056i;

    /* renamed from: j */
    private int f7057j;

    /* renamed from: k */
    private int f7058k;
    private int l;
    private long m;

    /* renamed from: n */
    private boolean f7059n;

    /* renamed from: o */
    private C0743r1 f7060o;

    /* renamed from: p */
    private zq f7061p;

    /* renamed from: a */
    private final yg f7049a = new yg(4);
    private final yg b = new yg(9);

    /* renamed from: c */
    private final yg f7050c = new yg(11);

    /* renamed from: d */
    private final yg f7051d = new yg();

    /* renamed from: e */
    private final aj f7052e = new aj();

    /* renamed from: g */
    private int f7054g = 1;

    private void b() {
        if (this.f7059n) {
            return;
        }
        this.f7053f.a(new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        this.f7059n = true;
    }

    private long c() {
        if (this.f7055h) {
            return this.f7056i + this.m;
        }
        if (this.f7052e.a() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return 0L;
        }
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(com.applovin.impl.j8 r10) {
        /*
            r9 = this;
            long r0 = r9.c()
            int r2 = r9.f7058k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            com.applovin.impl.r1 r3 = r9.f7060o
            if (r3 == 0) goto L23
            r9.b()
            com.applovin.impl.r1 r2 = r9.f7060o
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            com.applovin.impl.zq r3 = r9.f7061p
            if (r3 == 0) goto L39
            r9.b()
            com.applovin.impl.zq r2 = r9.f7061p
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f7059n
            if (r2 != 0) goto L6e
            com.applovin.impl.aj r2 = r9.f7052e
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            com.applovin.impl.aj r0 = r9.f7052e
            long r0 = r0.a()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            com.applovin.impl.k8 r2 = r9.f7053f
            com.applovin.impl.ib r3 = new com.applovin.impl.ib
            com.applovin.impl.aj r7 = r9.f7052e
            long[] r7 = r7.b()
            com.applovin.impl.aj r8 = r9.f7052e
            long[] r8 = r8.c()
            r3.<init>(r7, r8, r0)
            r2.a(r3)
            r9.f7059n = r6
            goto L21
        L6e:
            int r0 = r9.l
            r10.a(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f7055h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f7055h = r6
            com.applovin.impl.aj r10 = r9.f7052e
            long r1 = r10.a()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f7056i = r1
        L8f:
            r10 = 4
            r9.f7057j = r10
            r10 = 2
            r9.f7054g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c9.d(com.applovin.impl.j8):boolean");
    }

    private void f(j8 j8Var) {
        j8Var.a(this.f7057j);
        this.f7057j = 0;
        this.f7054g = 3;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private boolean e(j8 j8Var) {
        if (!j8Var.a(this.f7050c.c(), 0, 11, true)) {
            return false;
        }
        this.f7050c.f(0);
        this.f7058k = this.f7050c.w();
        this.l = this.f7050c.z();
        this.m = this.f7050c.z();
        this.m = ((this.f7050c.w() << 24) | this.m) * 1000;
        this.f7050c.g(3);
        this.f7054g = 4;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f7053f = k8Var;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        AbstractC0669a1.b(this.f7053f);
        while (true) {
            int i9 = this.f7054g;
            if (i9 != 1) {
                if (i9 == 2) {
                    f(j8Var);
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (d(j8Var)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!e(j8Var)) {
                    return -1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    private yg b(j8 j8Var) {
        if (this.l > this.f7051d.b()) {
            yg ygVar = this.f7051d;
            ygVar.a(new byte[Math.max(ygVar.b() * 2, this.l)], 0);
        } else {
            this.f7051d.f(0);
        }
        this.f7051d.e(this.l);
        j8Var.d(this.f7051d.c(), 0, this.l);
        return this.f7051d;
    }

    private boolean c(j8 j8Var) {
        if (!j8Var.a(this.b.c(), 0, 9, true)) {
            return false;
        }
        this.b.f(0);
        this.b.g(4);
        int w2 = this.b.w();
        boolean z8 = (w2 & 4) != 0;
        boolean z9 = (w2 & 1) != 0;
        if (z8 && this.f7060o == null) {
            this.f7060o = new C0743r1(this.f7053f.a(8, 1));
        }
        if (z9 && this.f7061p == null) {
            this.f7061p = new zq(this.f7053f.a(9, 2));
        }
        this.f7053f.c();
        this.f7057j = this.b.j() - 5;
        this.f7054g = 2;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        if (j7 == 0) {
            this.f7054g = 1;
            this.f7055h = false;
        } else {
            this.f7054g = 3;
        }
        this.f7057j = 0;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        j8Var.c(this.f7049a.c(), 0, 3);
        this.f7049a.f(0);
        if (this.f7049a.z() != 4607062) {
            return false;
        }
        j8Var.c(this.f7049a.c(), 0, 2);
        this.f7049a.f(0);
        if ((this.f7049a.C() & 250) != 0) {
            return false;
        }
        j8Var.c(this.f7049a.c(), 0, 4);
        this.f7049a.f(0);
        int j7 = this.f7049a.j();
        j8Var.b();
        j8Var.c(j7);
        j8Var.c(this.f7049a.c(), 0, 4);
        this.f7049a.f(0);
        return this.f7049a.j() == 0;
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new c9()};
    }
}
