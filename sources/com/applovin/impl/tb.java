package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class tb implements i8 {

    /* renamed from: b, reason: collision with root package name */
    private k8 f8190b;

    /* renamed from: c, reason: collision with root package name */
    private int f8191c;

    /* renamed from: d, reason: collision with root package name */
    private int f8192d;

    /* renamed from: e, reason: collision with root package name */
    private int f8193e;

    /* renamed from: g, reason: collision with root package name */
    private Cif f8195g;

    /* renamed from: h, reason: collision with root package name */
    private j8 f8196h;

    /* renamed from: i, reason: collision with root package name */
    private al f8197i;

    /* renamed from: j, reason: collision with root package name */
    private kf f8198j;
    private final yg a = new yg(6);

    /* renamed from: f, reason: collision with root package name */
    private long f8194f = -1;

    private static Cif a(String str, long j3) {
        hf a;
        if (j3 == -1 || (a = is.a(str)) == null) {
            return null;
        }
        return a.a(j3);
    }

    private void b(j8 j8Var) {
        this.a.d(2);
        j8Var.c(this.a.c(), 0, 2);
        j8Var.c(this.a.C() - 2);
    }

    private int c(j8 j8Var) {
        this.a.d(2);
        j8Var.c(this.a.c(), 0, 2);
        return this.a.C();
    }

    private void d(j8 j8Var) {
        this.a.d(2);
        j8Var.d(this.a.c(), 0, 2);
        int C = this.a.C();
        this.f8192d = C;
        if (C == 65498) {
            if (this.f8194f != -1) {
                this.f8191c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((C < 65488 || C > 65497) && C != 65281) {
            this.f8191c = 1;
        }
    }

    private void e(j8 j8Var) {
        String t5;
        if (this.f8192d == 65505) {
            yg ygVar = new yg(this.f8193e);
            j8Var.d(ygVar.c(), 0, this.f8193e);
            if (this.f8195g == null && "http://ns.adobe.com/xap/1.0/".equals(ygVar.t()) && (t5 = ygVar.t()) != null) {
                Cif a = a(t5, j8Var.a());
                this.f8195g = a;
                if (a != null) {
                    this.f8194f = a.f5328d;
                }
            }
        } else {
            j8Var.a(this.f8193e);
        }
        this.f8191c = 0;
    }

    private void f(j8 j8Var) {
        this.a.d(2);
        j8Var.d(this.a.c(), 0, 2);
        this.f8193e = this.a.C() - 2;
        this.f8191c = 2;
    }

    private void g(j8 j8Var) {
        if (!j8Var.b(this.a.c(), 0, 1, true)) {
            b();
            return;
        }
        j8Var.b();
        if (this.f8198j == null) {
            this.f8198j = new kf();
        }
        al alVar = new al(j8Var, this.f8194f);
        this.f8197i = alVar;
        if (this.f8198j.a(alVar)) {
            this.f8198j.a(new bl(this.f8194f, (k8) a1.a(this.f8190b)));
            c();
        } else {
            b();
        }
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8190b = k8Var;
    }

    private void a(we.b... bVarArr) {
        ((k8) a1.a(this.f8190b)).a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4).a(new d9.b().b("image/jpeg").a(new we(bVarArr)).a());
    }

    private void c() {
        a((we.b) a1.a(this.f8195g));
        this.f8191c = 5;
    }

    private void b() {
        a(new we.b[0]);
        ((k8) a1.a(this.f8190b)).c();
        this.f8190b.a(new ej.b(C.TIME_UNSET));
        this.f8191c = 6;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int i10 = this.f8191c;
        if (i10 == 0) {
            d(j8Var);
            return 0;
        }
        if (i10 == 1) {
            f(j8Var);
            return 0;
        }
        if (i10 == 2) {
            e(j8Var);
            return 0;
        }
        if (i10 == 4) {
            long f10 = j8Var.f();
            long j3 = this.f8194f;
            if (f10 != j3) {
                qhVar.a = j3;
                return 1;
            }
            g(j8Var);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f8197i == null || j8Var != this.f8196h) {
            this.f8196h = j8Var;
            this.f8197i = new al(j8Var, this.f8194f);
        }
        int a = ((kf) a1.a(this.f8198j)).a(this.f8197i, qhVar);
        if (a == 1) {
            qhVar.a += this.f8194f;
        }
        return a;
    }

    @Override // com.applovin.impl.i8
    public void a() {
        kf kfVar = this.f8198j;
        if (kfVar != null) {
            kfVar.a();
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        if (j3 == 0) {
            this.f8191c = 0;
            this.f8198j = null;
        } else if (this.f8191c == 5) {
            ((kf) a1.a(this.f8198j)).a(j3, j10);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        if (c(j8Var) != 65496) {
            return false;
        }
        int c10 = c(j8Var);
        this.f8192d = c10;
        if (c10 == 65504) {
            b(j8Var);
            this.f8192d = c(j8Var);
        }
        if (this.f8192d != 65505) {
            return false;
        }
        j8Var.c(2);
        this.a.d(6);
        j8Var.c(this.a.c(), 0, 6);
        return this.a.y() == 1165519206 && this.a.C() == 0;
    }
}
