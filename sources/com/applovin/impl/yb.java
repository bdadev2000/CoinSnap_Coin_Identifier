package com.applovin.impl;

import com.applovin.impl.bf;
import com.applovin.impl.f9;
import com.applovin.impl.ij;

/* loaded from: classes4.dex */
public final class yb implements k8 {

    /* renamed from: b, reason: collision with root package name */
    private m8 f28127b;

    /* renamed from: c, reason: collision with root package name */
    private int f28128c;
    private int d;
    private int e;

    /* renamed from: g, reason: collision with root package name */
    private nf f28130g;

    /* renamed from: h, reason: collision with root package name */
    private l8 f28131h;

    /* renamed from: i, reason: collision with root package name */
    private dl f28132i;

    /* renamed from: j, reason: collision with root package name */
    private pf f28133j;

    /* renamed from: a, reason: collision with root package name */
    private final bh f28126a = new bh(6);

    /* renamed from: f, reason: collision with root package name */
    private long f28129f = -1;

    private void b(l8 l8Var) {
        this.f28126a.d(2);
        l8Var.c(this.f28126a.c(), 0, 2);
        l8Var.c(this.f28126a.C() - 2);
    }

    private int c(l8 l8Var) {
        this.f28126a.d(2);
        l8Var.c(this.f28126a.c(), 0, 2);
        return this.f28126a.C();
    }

    private void d(l8 l8Var) {
        this.f28126a.d(2);
        l8Var.d(this.f28126a.c(), 0, 2);
        int C = this.f28126a.C();
        this.d = C;
        if (C == 65498) {
            if (this.f28129f != -1) {
                this.f28128c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((C < 65488 || C > 65497) && C != 65281) {
            this.f28128c = 1;
        }
    }

    private void e(l8 l8Var) {
        String t2;
        if (this.d == 65505) {
            bh bhVar = new bh(this.e);
            l8Var.d(bhVar.c(), 0, this.e);
            if (this.f28130g == null && "http://ns.adobe.com/xap/1.0/".equals(bhVar.t()) && (t2 = bhVar.t()) != null) {
                nf a2 = a(t2, l8Var.a());
                this.f28130g = a2;
                if (a2 != null) {
                    this.f28129f = a2.d;
                }
            }
        } else {
            l8Var.a(this.e);
        }
        this.f28128c = 0;
    }

    private void f(l8 l8Var) {
        this.f28126a.d(2);
        l8Var.d(this.f28126a.c(), 0, 2);
        this.e = this.f28126a.C() - 2;
        this.f28128c = 2;
    }

    private void g(l8 l8Var) {
        if (!l8Var.b(this.f28126a.c(), 0, 1, true)) {
            b();
            return;
        }
        l8Var.b();
        if (this.f28133j == null) {
            this.f28133j = new pf();
        }
        dl dlVar = new dl(l8Var, this.f28129f);
        this.f28132i = dlVar;
        if (!this.f28133j.a(dlVar)) {
            b();
        } else {
            this.f28133j.a(new el(this.f28129f, (m8) b1.a(this.f28127b)));
            c();
        }
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f28127b = m8Var;
    }

    private static nf a(String str, long j2) {
        mf a2;
        if (j2 == -1 || (a2 = hs.a(str)) == null) {
            return null;
        }
        return a2.a(j2);
    }

    private void a(bf.b... bVarArr) {
        ((m8) b1.a(this.f28127b)).a(1024, 4).a(new f9.b().b("image/jpeg").a(new bf(bVarArr)).a());
    }

    private void c() {
        a((bf.b) b1.a(this.f28130g));
        this.f28128c = 5;
    }

    private void b() {
        a(new bf.b[0]);
        ((m8) b1.a(this.f28127b)).c();
        this.f28127b.a(new ij.b(-9223372036854775807L));
        this.f28128c = 6;
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        int i2 = this.f28128c;
        if (i2 == 0) {
            d(l8Var);
            return 0;
        }
        if (i2 == 1) {
            f(l8Var);
            return 0;
        }
        if (i2 == 2) {
            e(l8Var);
            return 0;
        }
        if (i2 == 4) {
            long f2 = l8Var.f();
            long j2 = this.f28129f;
            if (f2 != j2) {
                thVar.f27165a = j2;
                return 1;
            }
            g(l8Var);
            return 0;
        }
        if (i2 != 5) {
            if (i2 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f28132i == null || l8Var != this.f28131h) {
            this.f28131h = l8Var;
            this.f28132i = new dl(l8Var, this.f28129f);
        }
        int a2 = ((pf) b1.a(this.f28133j)).a(this.f28132i, thVar);
        if (a2 == 1) {
            thVar.f27165a += this.f28129f;
        }
        return a2;
    }

    @Override // com.applovin.impl.k8
    public void a() {
        pf pfVar = this.f28133j;
        if (pfVar != null) {
            pfVar.a();
        }
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f28128c = 0;
            this.f28133j = null;
        } else if (this.f28128c == 5) {
            ((pf) b1.a(this.f28133j)).a(j2, j3);
        }
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        if (c(l8Var) != 65496) {
            return false;
        }
        int c2 = c(l8Var);
        this.d = c2;
        if (c2 == 65504) {
            b(l8Var);
            this.d = c(l8Var);
        }
        if (this.d != 65505) {
            return false;
        }
        l8Var.c(2);
        this.f28126a.d(6);
        l8Var.c(this.f28126a.c(), 0, 6);
        return this.f28126a.y() == 1165519206 && this.f28126a.C() == 0;
    }
}
