package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.u8;
import com.applovin.impl.v8;

/* loaded from: classes.dex */
public final class t8 implements i8 {

    /* renamed from: o */
    public static final m8 f11309o = new A0(13);

    /* renamed from: a */
    private final byte[] f11310a;
    private final yg b;

    /* renamed from: c */
    private final boolean f11311c;

    /* renamed from: d */
    private final u8.a f11312d;

    /* renamed from: e */
    private k8 f11313e;

    /* renamed from: f */
    private ro f11314f;

    /* renamed from: g */
    private int f11315g;

    /* renamed from: h */
    private we f11316h;

    /* renamed from: i */
    private y8 f11317i;

    /* renamed from: j */
    private int f11318j;

    /* renamed from: k */
    private int f11319k;
    private s8 l;
    private int m;

    /* renamed from: n */
    private long f11320n;

    public t8() {
        this(0);
    }

    private void b(j8 j8Var) {
        this.f11319k = v8.b(j8Var);
        ((k8) yp.a(this.f11313e)).a(b(j8Var.f(), j8Var.a()));
        this.f11315g = 5;
    }

    private void c(j8 j8Var) {
        byte[] bArr = this.f11310a;
        j8Var.c(bArr, 0, bArr.length);
        j8Var.b();
        this.f11315g = 2;
    }

    private void e(j8 j8Var) {
        v8.a aVar = new v8.a(this.f11317i);
        boolean z8 = false;
        while (!z8) {
            z8 = v8.a(j8Var, aVar);
            this.f11317i = (y8) yp.a(aVar.f11700a);
        }
        AbstractC0669a1.a(this.f11317i);
        this.f11318j = Math.max(this.f11317i.f12353c, 6);
        ((ro) yp.a(this.f11314f)).a(this.f11317i.a(this.f11310a, this.f11316h));
        this.f11315g = 4;
    }

    private void f(j8 j8Var) {
        v8.d(j8Var);
        this.f11315g = 3;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public t8(int i9) {
        this.f11310a = new byte[42];
        this.b = new yg(new byte[32768], 0);
        this.f11311c = (i9 & 1) != 0;
        this.f11312d = new u8.a();
        this.f11315g = 0;
    }

    private long a(yg ygVar, boolean z8) {
        boolean z9;
        AbstractC0669a1.a(this.f11317i);
        int d2 = ygVar.d();
        while (d2 <= ygVar.e() - 16) {
            ygVar.f(d2);
            if (u8.a(ygVar, this.f11317i, this.f11319k, this.f11312d)) {
                ygVar.f(d2);
                return this.f11312d.f11576a;
            }
            d2++;
        }
        if (z8) {
            while (d2 <= ygVar.e() - this.f11318j) {
                ygVar.f(d2);
                try {
                    z9 = u8.a(ygVar, this.f11317i, this.f11319k, this.f11312d);
                } catch (IndexOutOfBoundsException unused) {
                    z9 = false;
                }
                if (ygVar.d() <= ygVar.e() && z9) {
                    ygVar.f(d2);
                    return this.f11312d.f11576a;
                }
                d2++;
            }
            ygVar.f(ygVar.e());
            return -1L;
        }
        ygVar.f(d2);
        return -1L;
    }

    private void d(j8 j8Var) {
        this.f11316h = v8.b(j8Var, !this.f11311c);
        this.f11315g = 1;
    }

    private void c() {
        ((ro) yp.a(this.f11314f)).a((this.f11320n * 1000000) / ((y8) yp.a(this.f11317i)).f12355e, 1, this.m, 0, null);
    }

    private ej b(long j7, long j9) {
        AbstractC0669a1.a(this.f11317i);
        y8 y8Var = this.f11317i;
        if (y8Var.f12361k != null) {
            return new x8(y8Var, j7);
        }
        if (j9 != -1 && y8Var.f12360j > 0) {
            s8 s8Var = new s8(y8Var, this.f11319k, j7, j9);
            this.l = s8Var;
            return s8Var.a();
        }
        return new ej.b(y8Var.b());
    }

    private int b(j8 j8Var, qh qhVar) {
        boolean z8;
        AbstractC0669a1.a(this.f11314f);
        AbstractC0669a1.a(this.f11317i);
        s8 s8Var = this.l;
        if (s8Var != null && s8Var.b()) {
            return this.l.a(j8Var, qhVar);
        }
        if (this.f11320n == -1) {
            this.f11320n = u8.a(j8Var, this.f11317i);
            return 0;
        }
        int e4 = this.b.e();
        if (e4 < 32768) {
            int a6 = j8Var.a(this.b.c(), e4, 32768 - e4);
            z8 = a6 == -1;
            if (!z8) {
                this.b.e(e4 + a6);
            } else if (this.b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z8 = false;
        }
        int d2 = this.b.d();
        int i9 = this.m;
        int i10 = this.f11318j;
        if (i9 < i10) {
            yg ygVar = this.b;
            ygVar.g(Math.min(i10 - i9, ygVar.a()));
        }
        long a9 = a(this.b, z8);
        int d9 = this.b.d() - d2;
        this.b.f(d2);
        this.f11314f.a(this.b, d9);
        this.m += d9;
        if (a9 != -1) {
            c();
            this.m = 0;
            this.f11320n = a9;
        }
        if (this.b.a() < 16) {
            int a10 = this.b.a();
            System.arraycopy(this.b.c(), this.b.d(), this.b.c(), 0, a10);
            this.b.f(0);
            this.b.e(a10);
        }
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f11313e = k8Var;
        this.f11314f = k8Var.a(0, 1);
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int i9 = this.f11315g;
        if (i9 == 0) {
            d(j8Var);
            return 0;
        }
        if (i9 == 1) {
            c(j8Var);
            return 0;
        }
        if (i9 == 2) {
            f(j8Var);
            return 0;
        }
        if (i9 == 3) {
            e(j8Var);
            return 0;
        }
        if (i9 == 4) {
            b(j8Var);
            return 0;
        }
        if (i9 == 5) {
            return b(j8Var, qhVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        if (j7 == 0) {
            this.f11315g = 0;
        } else {
            s8 s8Var = this.l;
            if (s8Var != null) {
                s8Var.b(j9);
            }
        }
        this.f11320n = j9 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.d(0);
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        v8.a(j8Var, false);
        return v8.a(j8Var);
    }

    public static /* synthetic */ i8[] b() {
        return new i8[]{new t8()};
    }
}
