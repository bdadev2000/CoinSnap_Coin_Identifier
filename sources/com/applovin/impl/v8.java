package com.applovin.impl;

import com.applovin.impl.ij;
import com.applovin.impl.w8;
import com.applovin.impl.x8;

/* loaded from: classes2.dex */
public final class v8 implements k8 {

    /* renamed from: o */
    public static final o8 f27477o = new dt(13);

    /* renamed from: a */
    private final byte[] f27478a;

    /* renamed from: b */
    private final bh f27479b;

    /* renamed from: c */
    private final boolean f27480c;
    private final w8.a d;
    private m8 e;

    /* renamed from: f */
    private qo f27481f;

    /* renamed from: g */
    private int f27482g;

    /* renamed from: h */
    private bf f27483h;

    /* renamed from: i */
    private a9 f27484i;

    /* renamed from: j */
    private int f27485j;

    /* renamed from: k */
    private int f27486k;

    /* renamed from: l */
    private u8 f27487l;

    /* renamed from: m */
    private int f27488m;

    /* renamed from: n */
    private long f27489n;

    public v8() {
        this(0);
    }

    private void b(l8 l8Var) {
        this.f27486k = x8.b(l8Var);
        ((m8) xp.a(this.e)).a(b(l8Var.f(), l8Var.a()));
        this.f27482g = 5;
    }

    private void c(l8 l8Var) {
        byte[] bArr = this.f27478a;
        l8Var.c(bArr, 0, bArr.length);
        l8Var.b();
        this.f27482g = 2;
    }

    private void e(l8 l8Var) {
        x8.a aVar = new x8.a(this.f27484i);
        boolean z2 = false;
        while (!z2) {
            z2 = x8.a(l8Var, aVar);
            this.f27484i = (a9) xp.a(aVar.f27867a);
        }
        b1.a(this.f27484i);
        this.f27485j = Math.max(this.f27484i.f22713c, 6);
        ((qo) xp.a(this.f27481f)).a(this.f27484i.a(this.f27478a, this.f27483h));
        this.f27482g = 4;
    }

    private void f(l8 l8Var) {
        x8.d(l8Var);
        this.f27482g = 3;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public v8(int i2) {
        this.f27478a = new byte[42];
        this.f27479b = new bh(new byte[32768], 0);
        this.f27480c = (i2 & 1) != 0;
        this.d = new w8.a();
        this.f27482g = 0;
    }

    private long a(bh bhVar, boolean z2) {
        boolean z3;
        b1.a(this.f27484i);
        int d = bhVar.d();
        while (d <= bhVar.e() - 16) {
            bhVar.f(d);
            if (w8.a(bhVar, this.f27484i, this.f27486k, this.d)) {
                bhVar.f(d);
                return this.d.f27708a;
            }
            d++;
        }
        if (z2) {
            while (d <= bhVar.e() - this.f27485j) {
                bhVar.f(d);
                try {
                    z3 = w8.a(bhVar, this.f27484i, this.f27486k, this.d);
                } catch (IndexOutOfBoundsException unused) {
                    z3 = false;
                }
                if (bhVar.d() <= bhVar.e() && z3) {
                    bhVar.f(d);
                    return this.d.f27708a;
                }
                d++;
            }
            bhVar.f(bhVar.e());
            return -1L;
        }
        bhVar.f(d);
        return -1L;
    }

    private void d(l8 l8Var) {
        this.f27483h = x8.b(l8Var, !this.f27480c);
        this.f27482g = 1;
    }

    private void c() {
        ((qo) xp.a(this.f27481f)).a((this.f27489n * 1000000) / ((a9) xp.a(this.f27484i)).e, 1, this.f27488m, 0, null);
    }

    private ij b(long j2, long j3) {
        b1.a(this.f27484i);
        a9 a9Var = this.f27484i;
        if (a9Var.f22719k != null) {
            return new z8(a9Var, j2);
        }
        if (j3 != -1 && a9Var.f22718j > 0) {
            u8 u8Var = new u8(a9Var, this.f27486k, j2, j3);
            this.f27487l = u8Var;
            return u8Var.a();
        }
        return new ij.b(a9Var.b());
    }

    private int b(l8 l8Var, th thVar) {
        boolean z2;
        b1.a(this.f27481f);
        b1.a(this.f27484i);
        u8 u8Var = this.f27487l;
        if (u8Var != null && u8Var.b()) {
            return this.f27487l.a(l8Var, thVar);
        }
        if (this.f27489n == -1) {
            this.f27489n = w8.a(l8Var, this.f27484i);
            return 0;
        }
        int e = this.f27479b.e();
        if (e < 32768) {
            int a2 = l8Var.a(this.f27479b.c(), e, 32768 - e);
            z2 = a2 == -1;
            if (!z2) {
                this.f27479b.e(e + a2);
            } else if (this.f27479b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z2 = false;
        }
        int d = this.f27479b.d();
        int i2 = this.f27488m;
        int i3 = this.f27485j;
        if (i2 < i3) {
            bh bhVar = this.f27479b;
            bhVar.g(Math.min(i3 - i2, bhVar.a()));
        }
        long a3 = a(this.f27479b, z2);
        int d2 = this.f27479b.d() - d;
        this.f27479b.f(d);
        this.f27481f.a(this.f27479b, d2);
        this.f27488m += d2;
        if (a3 != -1) {
            c();
            this.f27488m = 0;
            this.f27489n = a3;
        }
        if (this.f27479b.a() < 16) {
            int a4 = this.f27479b.a();
            System.arraycopy(this.f27479b.c(), this.f27479b.d(), this.f27479b.c(), 0, a4);
            this.f27479b.f(0);
            this.f27479b.e(a4);
        }
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.e = m8Var;
        this.f27481f = m8Var.a(0, 1);
        m8Var.c();
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        int i2 = this.f27482g;
        if (i2 == 0) {
            d(l8Var);
            return 0;
        }
        if (i2 == 1) {
            c(l8Var);
            return 0;
        }
        if (i2 == 2) {
            f(l8Var);
            return 0;
        }
        if (i2 == 3) {
            e(l8Var);
            return 0;
        }
        if (i2 == 4) {
            b(l8Var);
            return 0;
        }
        if (i2 == 5) {
            return b(l8Var, thVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f27482g = 0;
        } else {
            u8 u8Var = this.f27487l;
            if (u8Var != null) {
                u8Var.b(j3);
            }
        }
        this.f27489n = j3 != 0 ? -1L : 0L;
        this.f27488m = 0;
        this.f27479b.d(0);
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        x8.a(l8Var, false);
        return x8.a(l8Var);
    }

    public static /* synthetic */ k8[] b() {
        return new k8[]{new v8()};
    }
}
