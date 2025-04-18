package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.u8;
import com.applovin.impl.v8;

/* loaded from: classes.dex */
public final class t8 implements i8 {

    /* renamed from: o */
    public static final m8 f8155o = new ht(13);
    private final byte[] a;

    /* renamed from: b */
    private final yg f8156b;

    /* renamed from: c */
    private final boolean f8157c;

    /* renamed from: d */
    private final u8.a f8158d;

    /* renamed from: e */
    private k8 f8159e;

    /* renamed from: f */
    private ro f8160f;

    /* renamed from: g */
    private int f8161g;

    /* renamed from: h */
    private we f8162h;

    /* renamed from: i */
    private y8 f8163i;

    /* renamed from: j */
    private int f8164j;

    /* renamed from: k */
    private int f8165k;

    /* renamed from: l */
    private s8 f8166l;

    /* renamed from: m */
    private int f8167m;

    /* renamed from: n */
    private long f8168n;

    public t8() {
        this(0);
    }

    private void b(j8 j8Var) {
        this.f8165k = v8.b(j8Var);
        ((k8) yp.a(this.f8159e)).a(b(j8Var.f(), j8Var.a()));
        this.f8161g = 5;
    }

    private void c(j8 j8Var) {
        byte[] bArr = this.a;
        j8Var.c(bArr, 0, bArr.length);
        j8Var.b();
        this.f8161g = 2;
    }

    public static /* synthetic */ i8[] d() {
        return b();
    }

    private void e(j8 j8Var) {
        v8.a aVar = new v8.a(this.f8163i);
        boolean z10 = false;
        while (!z10) {
            z10 = v8.a(j8Var, aVar);
            this.f8163i = (y8) yp.a(aVar.a);
        }
        a1.a(this.f8163i);
        this.f8164j = Math.max(this.f8163i.f9150c, 6);
        ((ro) yp.a(this.f8160f)).a(this.f8163i.a(this.a, this.f8162h));
        this.f8161g = 4;
    }

    private void f(j8 j8Var) {
        v8.d(j8Var);
        this.f8161g = 3;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public t8(int i10) {
        this.a = new byte[42];
        this.f8156b = new yg(new byte[32768], 0);
        this.f8157c = (i10 & 1) != 0;
        this.f8158d = new u8.a();
        this.f8161g = 0;
    }

    private long a(yg ygVar, boolean z10) {
        boolean z11;
        a1.a(this.f8163i);
        int d10 = ygVar.d();
        while (d10 <= ygVar.e() - 16) {
            ygVar.f(d10);
            if (u8.a(ygVar, this.f8163i, this.f8165k, this.f8158d)) {
                ygVar.f(d10);
                return this.f8158d.a;
            }
            d10++;
        }
        if (z10) {
            while (d10 <= ygVar.e() - this.f8164j) {
                ygVar.f(d10);
                try {
                    z11 = u8.a(ygVar, this.f8163i, this.f8165k, this.f8158d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (ygVar.d() <= ygVar.e() && z11) {
                    ygVar.f(d10);
                    return this.f8158d.a;
                }
                d10++;
            }
            ygVar.f(ygVar.e());
            return -1L;
        }
        ygVar.f(d10);
        return -1L;
    }

    private void d(j8 j8Var) {
        this.f8162h = v8.b(j8Var, !this.f8157c);
        this.f8161g = 1;
    }

    private void c() {
        ((ro) yp.a(this.f8160f)).a((this.f8168n * 1000000) / ((y8) yp.a(this.f8163i)).f9152e, 1, this.f8167m, 0, null);
    }

    private ej b(long j3, long j10) {
        a1.a(this.f8163i);
        y8 y8Var = this.f8163i;
        if (y8Var.f9158k != null) {
            return new x8(y8Var, j3);
        }
        if (j10 != -1 && y8Var.f9157j > 0) {
            s8 s8Var = new s8(y8Var, this.f8165k, j3, j10);
            this.f8166l = s8Var;
            return s8Var.a();
        }
        return new ej.b(y8Var.b());
    }

    private int b(j8 j8Var, qh qhVar) {
        boolean z10;
        a1.a(this.f8160f);
        a1.a(this.f8163i);
        s8 s8Var = this.f8166l;
        if (s8Var != null && s8Var.b()) {
            return this.f8166l.a(j8Var, qhVar);
        }
        if (this.f8168n == -1) {
            this.f8168n = u8.a(j8Var, this.f8163i);
            return 0;
        }
        int e2 = this.f8156b.e();
        if (e2 < 32768) {
            int a = j8Var.a(this.f8156b.c(), e2, 32768 - e2);
            z10 = a == -1;
            if (!z10) {
                this.f8156b.e(e2 + a);
            } else if (this.f8156b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z10 = false;
        }
        int d10 = this.f8156b.d();
        int i10 = this.f8167m;
        int i11 = this.f8164j;
        if (i10 < i11) {
            yg ygVar = this.f8156b;
            ygVar.g(Math.min(i11 - i10, ygVar.a()));
        }
        long a10 = a(this.f8156b, z10);
        int d11 = this.f8156b.d() - d10;
        this.f8156b.f(d10);
        this.f8160f.a(this.f8156b, d11);
        this.f8167m += d11;
        if (a10 != -1) {
            c();
            this.f8167m = 0;
            this.f8168n = a10;
        }
        if (this.f8156b.a() < 16) {
            int a11 = this.f8156b.a();
            System.arraycopy(this.f8156b.c(), this.f8156b.d(), this.f8156b.c(), 0, a11);
            this.f8156b.f(0);
            this.f8156b.e(a11);
        }
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8159e = k8Var;
        this.f8160f = k8Var.a(0, 1);
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int i10 = this.f8161g;
        if (i10 == 0) {
            d(j8Var);
            return 0;
        }
        if (i10 == 1) {
            c(j8Var);
            return 0;
        }
        if (i10 == 2) {
            f(j8Var);
            return 0;
        }
        if (i10 == 3) {
            e(j8Var);
            return 0;
        }
        if (i10 == 4) {
            b(j8Var);
            return 0;
        }
        if (i10 == 5) {
            return b(j8Var, qhVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        if (j3 == 0) {
            this.f8161g = 0;
        } else {
            s8 s8Var = this.f8166l;
            if (s8Var != null) {
                s8Var.b(j10);
            }
        }
        this.f8168n = j10 != 0 ? -1L : 0L;
        this.f8167m = 0;
        this.f8156b.d(0);
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
