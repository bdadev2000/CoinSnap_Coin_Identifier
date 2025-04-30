package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class tb implements i8 {
    private k8 b;

    /* renamed from: c, reason: collision with root package name */
    private int f11359c;

    /* renamed from: d, reason: collision with root package name */
    private int f11360d;

    /* renamed from: e, reason: collision with root package name */
    private int f11361e;

    /* renamed from: g, reason: collision with root package name */
    private Cif f11363g;

    /* renamed from: h, reason: collision with root package name */
    private j8 f11364h;

    /* renamed from: i, reason: collision with root package name */
    private al f11365i;

    /* renamed from: j, reason: collision with root package name */
    private kf f11366j;

    /* renamed from: a, reason: collision with root package name */
    private final yg f11358a = new yg(6);

    /* renamed from: f, reason: collision with root package name */
    private long f11362f = -1;

    private static Cif a(String str, long j7) {
        hf a6;
        if (j7 == -1 || (a6 = is.a(str)) == null) {
            return null;
        }
        return a6.a(j7);
    }

    private void b(j8 j8Var) {
        this.f11358a.d(2);
        j8Var.c(this.f11358a.c(), 0, 2);
        j8Var.c(this.f11358a.C() - 2);
    }

    private int c(j8 j8Var) {
        this.f11358a.d(2);
        j8Var.c(this.f11358a.c(), 0, 2);
        return this.f11358a.C();
    }

    private void d(j8 j8Var) {
        this.f11358a.d(2);
        j8Var.d(this.f11358a.c(), 0, 2);
        int C8 = this.f11358a.C();
        this.f11360d = C8;
        if (C8 == 65498) {
            if (this.f11362f != -1) {
                this.f11359c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((C8 < 65488 || C8 > 65497) && C8 != 65281) {
            this.f11359c = 1;
        }
    }

    private void e(j8 j8Var) {
        String t9;
        if (this.f11360d == 65505) {
            yg ygVar = new yg(this.f11361e);
            j8Var.d(ygVar.c(), 0, this.f11361e);
            if (this.f11363g == null && "http://ns.adobe.com/xap/1.0/".equals(ygVar.t()) && (t9 = ygVar.t()) != null) {
                Cif a6 = a(t9, j8Var.a());
                this.f11363g = a6;
                if (a6 != null) {
                    this.f11362f = a6.f8292d;
                }
            }
        } else {
            j8Var.a(this.f11361e);
        }
        this.f11359c = 0;
    }

    private void f(j8 j8Var) {
        this.f11358a.d(2);
        j8Var.d(this.f11358a.c(), 0, 2);
        this.f11361e = this.f11358a.C() - 2;
        this.f11359c = 2;
    }

    private void g(j8 j8Var) {
        if (!j8Var.b(this.f11358a.c(), 0, 1, true)) {
            b();
            return;
        }
        j8Var.b();
        if (this.f11366j == null) {
            this.f11366j = new kf();
        }
        al alVar = new al(j8Var, this.f11362f);
        this.f11365i = alVar;
        if (this.f11366j.a(alVar)) {
            this.f11366j.a(new bl(this.f11362f, (k8) AbstractC0669a1.a(this.b)));
            c();
        } else {
            b();
        }
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.b = k8Var;
    }

    private void a(we.b... bVarArr) {
        ((k8) AbstractC0669a1.a(this.b)).a(1024, 4).a(new d9.b().b("image/jpeg").a(new we(bVarArr)).a());
    }

    private void c() {
        a((we.b) AbstractC0669a1.a(this.f11363g));
        this.f11359c = 5;
    }

    private void b() {
        a(new we.b[0]);
        ((k8) AbstractC0669a1.a(this.b)).c();
        this.b.a(new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        this.f11359c = 6;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int i9 = this.f11359c;
        if (i9 == 0) {
            d(j8Var);
            return 0;
        }
        if (i9 == 1) {
            f(j8Var);
            return 0;
        }
        if (i9 == 2) {
            e(j8Var);
            return 0;
        }
        if (i9 == 4) {
            long f9 = j8Var.f();
            long j7 = this.f11362f;
            if (f9 != j7) {
                qhVar.f10346a = j7;
                return 1;
            }
            g(j8Var);
            return 0;
        }
        if (i9 != 5) {
            if (i9 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f11365i == null || j8Var != this.f11364h) {
            this.f11364h = j8Var;
            this.f11365i = new al(j8Var, this.f11362f);
        }
        int a6 = ((kf) AbstractC0669a1.a(this.f11366j)).a(this.f11365i, qhVar);
        if (a6 == 1) {
            qhVar.f10346a += this.f11362f;
        }
        return a6;
    }

    @Override // com.applovin.impl.i8
    public void a() {
        kf kfVar = this.f11366j;
        if (kfVar != null) {
            kfVar.a();
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        if (j7 == 0) {
            this.f11359c = 0;
            this.f11366j = null;
        } else if (this.f11359c == 5) {
            ((kf) AbstractC0669a1.a(this.f11366j)).a(j7, j9);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        if (c(j8Var) != 65496) {
            return false;
        }
        int c9 = c(j8Var);
        this.f11360d = c9;
        if (c9 == 65504) {
            b(j8Var);
            this.f11360d = c(j8Var);
        }
        if (this.f11360d != 65505) {
            return false;
        }
        j8Var.c(2);
        this.f11358a.d(6);
        j8Var.c(this.f11358a.c(), 0, 6);
        return this.f11358a.y() == 1165519206 && this.f11358a.C() == 0;
    }
}
