package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes3.dex */
public final class e9 implements k8 {

    /* renamed from: q */
    public static final o8 f23655q = new dt(1);

    /* renamed from: f */
    private m8 f23659f;

    /* renamed from: h */
    private boolean f23661h;

    /* renamed from: i */
    private long f23662i;

    /* renamed from: j */
    private int f23663j;

    /* renamed from: k */
    private int f23664k;

    /* renamed from: l */
    private int f23665l;

    /* renamed from: m */
    private long f23666m;

    /* renamed from: n */
    private boolean f23667n;

    /* renamed from: o */
    private s1 f23668o;

    /* renamed from: p */
    private yq f23669p;

    /* renamed from: a */
    private final bh f23656a = new bh(4);

    /* renamed from: b */
    private final bh f23657b = new bh(9);

    /* renamed from: c */
    private final bh f23658c = new bh(11);
    private final bh d = new bh();
    private final ej e = new ej();

    /* renamed from: g */
    private int f23660g = 1;

    private void b() {
        if (this.f23667n) {
            return;
        }
        this.f23659f.a(new ij.b(-9223372036854775807L));
        this.f23667n = true;
    }

    private long c() {
        if (this.f23661h) {
            return this.f23662i + this.f23666m;
        }
        if (this.e.a() == -9223372036854775807L) {
            return 0L;
        }
        return this.f23666m;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(com.applovin.impl.l8 r10) {
        /*
            r9 = this;
            long r0 = r9.c()
            int r2 = r9.f23664k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            com.applovin.impl.s1 r3 = r9.f23668o
            if (r3 == 0) goto L23
            r9.b()
            com.applovin.impl.s1 r2 = r9.f23668o
            com.applovin.impl.bh r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            com.applovin.impl.yq r3 = r9.f23669p
            if (r3 == 0) goto L39
            r9.b()
            com.applovin.impl.yq r2 = r9.f23669p
            com.applovin.impl.bh r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f23667n
            if (r2 != 0) goto L6e
            com.applovin.impl.ej r2 = r9.e
            com.applovin.impl.bh r10 = r9.b(r10)
            boolean r10 = r2.a(r10, r0)
            com.applovin.impl.ej r0 = r9.e
            long r0 = r0.a()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            com.applovin.impl.m8 r2 = r9.f23659f
            com.applovin.impl.mb r3 = new com.applovin.impl.mb
            com.applovin.impl.ej r7 = r9.e
            long[] r7 = r7.b()
            com.applovin.impl.ej r8 = r9.e
            long[] r8 = r8.c()
            r3.<init>(r7, r8, r0)
            r2.a(r3)
            r9.f23667n = r6
            goto L21
        L6e:
            int r0 = r9.f23665l
            r10.a(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f23661h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f23661h = r6
            com.applovin.impl.ej r10 = r9.e
            long r1 = r10.a()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f23666m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f23662i = r1
        L8f:
            r10 = 4
            r9.f23663j = r10
            r10 = 2
            r9.f23660g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e9.d(com.applovin.impl.l8):boolean");
    }

    private void f(l8 l8Var) {
        l8Var.a(this.f23663j);
        this.f23663j = 0;
        this.f23660g = 3;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    private bh b(l8 l8Var) {
        if (this.f23665l > this.d.b()) {
            bh bhVar = this.d;
            bhVar.a(new byte[Math.max(bhVar.b() * 2, this.f23665l)], 0);
        } else {
            this.d.f(0);
        }
        this.d.e(this.f23665l);
        l8Var.d(this.d.c(), 0, this.f23665l);
        return this.d;
    }

    private boolean c(l8 l8Var) {
        if (!l8Var.a(this.f23657b.c(), 0, 9, true)) {
            return false;
        }
        this.f23657b.f(0);
        this.f23657b.g(4);
        int w = this.f23657b.w();
        boolean z2 = (w & 4) != 0;
        boolean z3 = (w & 1) != 0;
        if (z2 && this.f23668o == null) {
            this.f23668o = new s1(this.f23659f.a(8, 1));
        }
        if (z3 && this.f23669p == null) {
            this.f23669p = new yq(this.f23659f.a(9, 2));
        }
        this.f23659f.c();
        this.f23663j = this.f23657b.j() - 5;
        this.f23660g = 2;
        return true;
    }

    private boolean e(l8 l8Var) {
        if (!l8Var.a(this.f23658c.c(), 0, 11, true)) {
            return false;
        }
        this.f23658c.f(0);
        this.f23664k = this.f23658c.w();
        this.f23665l = this.f23658c.z();
        this.f23666m = this.f23658c.z();
        this.f23666m = ((this.f23658c.w() << 24) | this.f23666m) * 1000;
        this.f23658c.g(3);
        this.f23660g = 4;
        return true;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f23660g = 1;
            this.f23661h = false;
        } else {
            this.f23660g = 3;
        }
        this.f23663j = 0;
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f23659f = m8Var;
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b1.b(this.f23659f);
        while (true) {
            int i2 = this.f23660g;
            if (i2 != 1) {
                if (i2 == 2) {
                    f(l8Var);
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (d(l8Var)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!e(l8Var)) {
                    return -1;
                }
            } else if (!c(l8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        l8Var.c(this.f23656a.c(), 0, 3);
        this.f23656a.f(0);
        if (this.f23656a.z() != 4607062) {
            return false;
        }
        l8Var.c(this.f23656a.c(), 0, 2);
        this.f23656a.f(0);
        if ((this.f23656a.C() & 250) != 0) {
            return false;
        }
        l8Var.c(this.f23656a.c(), 0, 4);
        this.f23656a.f(0);
        int j2 = this.f23656a.j();
        l8Var.b();
        l8Var.c(j2);
        l8Var.c(this.f23656a.c(), 0, 4);
        this.f23656a.f(0);
        return this.f23656a.j() == 0;
    }

    public static /* synthetic */ k8[] d() {
        return new k8[]{new e9()};
    }
}
