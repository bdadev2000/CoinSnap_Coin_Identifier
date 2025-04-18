package com.applovin.impl;

import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class c9 implements i8 {

    /* renamed from: q */
    public static final m8 f4063q = new ht(0);

    /* renamed from: f */
    private k8 f4068f;

    /* renamed from: h */
    private boolean f4070h;

    /* renamed from: i */
    private long f4071i;

    /* renamed from: j */
    private int f4072j;

    /* renamed from: k */
    private int f4073k;

    /* renamed from: l */
    private int f4074l;

    /* renamed from: m */
    private long f4075m;

    /* renamed from: n */
    private boolean f4076n;

    /* renamed from: o */
    private r1 f4077o;

    /* renamed from: p */
    private zq f4078p;
    private final yg a = new yg(4);

    /* renamed from: b */
    private final yg f4064b = new yg(9);

    /* renamed from: c */
    private final yg f4065c = new yg(11);

    /* renamed from: d */
    private final yg f4066d = new yg();

    /* renamed from: e */
    private final aj f4067e = new aj();

    /* renamed from: g */
    private int f4069g = 1;

    private void b() {
        if (this.f4076n) {
            return;
        }
        this.f4068f.a(new ej.b(C.TIME_UNSET));
        this.f4076n = true;
    }

    private long c() {
        if (this.f4070h) {
            return this.f4071i + this.f4075m;
        }
        if (this.f4067e.a() == C.TIME_UNSET) {
            return 0L;
        }
        return this.f4075m;
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
            int r2 = r9.f4073k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            com.applovin.impl.r1 r3 = r9.f4077o
            if (r3 == 0) goto L23
            r9.b()
            com.applovin.impl.r1 r2 = r9.f4077o
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            com.applovin.impl.zq r3 = r9.f4078p
            if (r3 == 0) goto L39
            r9.b()
            com.applovin.impl.zq r2 = r9.f4078p
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f4076n
            if (r2 != 0) goto L6e
            com.applovin.impl.aj r2 = r9.f4067e
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            com.applovin.impl.aj r0 = r9.f4067e
            long r0 = r0.a()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            com.applovin.impl.k8 r2 = r9.f4068f
            com.applovin.impl.ib r3 = new com.applovin.impl.ib
            com.applovin.impl.aj r7 = r9.f4067e
            long[] r7 = r7.b()
            com.applovin.impl.aj r8 = r9.f4067e
            long[] r8 = r8.c()
            r3.<init>(r7, r8, r0)
            r2.a(r3)
            r9.f4076n = r6
            goto L21
        L6e:
            int r0 = r9.f4074l
            r10.a(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f4070h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f4070h = r6
            com.applovin.impl.aj r10 = r9.f4067e
            long r1 = r10.a()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f4075m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f4071i = r1
        L8f:
            r10 = 4
            r9.f4072j = r10
            r10 = 2
            r9.f4069g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c9.d(com.applovin.impl.j8):boolean");
    }

    public static /* synthetic */ i8[] e() {
        return d();
    }

    private void f(j8 j8Var) {
        j8Var.a(this.f4072j);
        this.f4072j = 0;
        this.f4069g = 3;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private boolean e(j8 j8Var) {
        if (!j8Var.a(this.f4065c.c(), 0, 11, true)) {
            return false;
        }
        this.f4065c.f(0);
        this.f4073k = this.f4065c.w();
        this.f4074l = this.f4065c.z();
        this.f4075m = this.f4065c.z();
        this.f4075m = ((this.f4065c.w() << 24) | this.f4075m) * 1000;
        this.f4065c.g(3);
        this.f4069g = 4;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f4068f = k8Var;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        a1.b(this.f4068f);
        while (true) {
            int i10 = this.f4069g;
            if (i10 != 1) {
                if (i10 == 2) {
                    f(j8Var);
                } else if (i10 != 3) {
                    if (i10 == 4) {
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
        if (this.f4074l > this.f4066d.b()) {
            yg ygVar = this.f4066d;
            ygVar.a(new byte[Math.max(ygVar.b() * 2, this.f4074l)], 0);
        } else {
            this.f4066d.f(0);
        }
        this.f4066d.e(this.f4074l);
        j8Var.d(this.f4066d.c(), 0, this.f4074l);
        return this.f4066d;
    }

    private boolean c(j8 j8Var) {
        if (!j8Var.a(this.f4064b.c(), 0, 9, true)) {
            return false;
        }
        this.f4064b.f(0);
        this.f4064b.g(4);
        int w10 = this.f4064b.w();
        boolean z10 = (w10 & 4) != 0;
        boolean z11 = (w10 & 1) != 0;
        if (z10 && this.f4077o == null) {
            this.f4077o = new r1(this.f4068f.a(8, 1));
        }
        if (z11 && this.f4078p == null) {
            this.f4078p = new zq(this.f4068f.a(9, 2));
        }
        this.f4068f.c();
        this.f4072j = this.f4064b.j() - 5;
        this.f4069g = 2;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        if (j3 == 0) {
            this.f4069g = 1;
            this.f4070h = false;
        } else {
            this.f4069g = 3;
        }
        this.f4072j = 0;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        j8Var.c(this.a.c(), 0, 3);
        this.a.f(0);
        if (this.a.z() != 4607062) {
            return false;
        }
        j8Var.c(this.a.c(), 0, 2);
        this.a.f(0);
        if ((this.a.C() & 250) != 0) {
            return false;
        }
        j8Var.c(this.a.c(), 0, 4);
        this.a.f(0);
        int j3 = this.a.j();
        j8Var.b();
        j8Var.c(j3);
        j8Var.c(this.a.c(), 0, 4);
        this.a.f(0);
        return this.a.j() == 0;
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new c9()};
    }
}
