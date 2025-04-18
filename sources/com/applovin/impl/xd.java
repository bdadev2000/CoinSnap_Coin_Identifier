package com.applovin.impl;

import com.applovin.impl.be;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class xd {

    /* renamed from: a, reason: collision with root package name */
    public final wd f27892a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27893b;

    /* renamed from: c, reason: collision with root package name */
    public final cj[] f27894c;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public zd f27895f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27896g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f27897h;

    /* renamed from: i, reason: collision with root package name */
    private final ri[] f27898i;

    /* renamed from: j, reason: collision with root package name */
    private final vo f27899j;

    /* renamed from: k, reason: collision with root package name */
    private final fe f27900k;

    /* renamed from: l, reason: collision with root package name */
    private xd f27901l;

    /* renamed from: m, reason: collision with root package name */
    private po f27902m;

    /* renamed from: n, reason: collision with root package name */
    private wo f27903n;

    /* renamed from: o, reason: collision with root package name */
    private long f27904o;

    public xd(ri[] riVarArr, long j2, vo voVar, n0 n0Var, fe feVar, zd zdVar, wo woVar) {
        this.f27898i = riVarArr;
        this.f27904o = j2;
        this.f27899j = voVar;
        this.f27900k = feVar;
        be.a aVar = zdVar.f28322a;
        this.f27893b = aVar.f28191a;
        this.f27895f = zdVar;
        this.f27902m = po.d;
        this.f27903n = woVar;
        this.f27894c = new cj[riVarArr.length];
        this.f27897h = new boolean[riVarArr.length];
        this.f27892a = a(aVar, feVar, n0Var, zdVar.f28323b, zdVar.d);
    }

    private void b(cj[] cjVarArr) {
        int i2 = 0;
        while (true) {
            ri[] riVarArr = this.f27898i;
            if (i2 >= riVarArr.length) {
                return;
            }
            if (riVarArr[i2].e() == -2) {
                cjVarArr[i2] = null;
            }
            i2++;
        }
    }

    private boolean k() {
        return this.f27901l == null;
    }

    public long a(wo woVar, long j2, boolean z2) {
        return a(woVar, j2, z2, new boolean[this.f27898i.length]);
    }

    public void c(long j2) {
        this.f27904o = j2;
    }

    public xd d() {
        return this.f27901l;
    }

    public long e() {
        if (this.d) {
            return this.f27892a.g();
        }
        return 0L;
    }

    public long f() {
        return this.f27904o;
    }

    public long g() {
        return this.f27895f.f28323b + this.f27904o;
    }

    public po h() {
        return this.f27902m;
    }

    public wo i() {
        return this.f27903n;
    }

    public boolean j() {
        return this.d && (!this.e || this.f27892a.e() == Long.MIN_VALUE);
    }

    public void l() {
        a();
        a(this.f27900k, this.f27892a);
    }

    public void m() {
        wd wdVar = this.f27892a;
        if (wdVar instanceof k3) {
            long j2 = this.f27895f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((k3) wdVar).a(0L, j2);
        }
    }

    public long a(wo woVar, long j2, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= woVar.f27776a) {
                break;
            }
            boolean[] zArr2 = this.f27897h;
            if (z2 || !woVar.a(this.f27903n, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        b(this.f27894c);
        a();
        this.f27903n = woVar;
        b();
        long a2 = this.f27892a.a(woVar.f27778c, this.f27897h, this.f27894c, zArr, j2);
        a(this.f27894c);
        this.e = false;
        int i3 = 0;
        while (true) {
            cj[] cjVarArr = this.f27894c;
            if (i3 >= cjVarArr.length) {
                return a2;
            }
            if (cjVarArr[i3] != null) {
                b1.b(woVar.a(i3));
                if (this.f27898i[i3].e() != -2) {
                    this.e = true;
                }
            } else {
                b1.b(woVar.f27778c[i3] == null);
            }
            i3++;
        }
    }

    public long c() {
        if (!this.d) {
            return this.f27895f.f28323b;
        }
        long e = this.e ? this.f27892a.e() : Long.MIN_VALUE;
        return e == Long.MIN_VALUE ? this.f27895f.e : e;
    }

    public long d(long j2) {
        return j2 - f();
    }

    public long e(long j2) {
        return j2 + f();
    }

    private void b() {
        if (!k()) {
            return;
        }
        int i2 = 0;
        while (true) {
            wo woVar = this.f27903n;
            if (i2 >= woVar.f27776a) {
                return;
            }
            boolean a2 = woVar.a(i2);
            h8 h8Var = this.f27903n.f27778c[i2];
            if (a2 && h8Var != null) {
                h8Var.i();
            }
            i2++;
        }
    }

    public void b(long j2) {
        b1.b(k());
        if (this.d) {
            this.f27892a.c(d(j2));
        }
    }

    public wo b(float f2, fo foVar) {
        wo a2 = this.f27899j.a(this.f27898i, h(), this.f27895f.f28322a, foVar);
        for (h8 h8Var : a2.f27778c) {
            if (h8Var != null) {
                h8Var.a(f2);
            }
        }
        return a2;
    }

    private void a(cj[] cjVarArr) {
        int i2 = 0;
        while (true) {
            ri[] riVarArr = this.f27898i;
            if (i2 >= riVarArr.length) {
                return;
            }
            if (riVarArr[i2].e() == -2 && this.f27903n.a(i2)) {
                cjVarArr[i2] = new s7();
            }
            i2++;
        }
    }

    public void a(long j2) {
        b1.b(k());
        this.f27892a.b(d(j2));
    }

    private static wd a(be.a aVar, fe feVar, n0 n0Var, long j2, long j3) {
        wd a2 = feVar.a(aVar, n0Var, j2);
        return j3 != -9223372036854775807L ? new k3(a2, true, 0L, j3) : a2;
    }

    private void a() {
        if (!k()) {
            return;
        }
        int i2 = 0;
        while (true) {
            wo woVar = this.f27903n;
            if (i2 >= woVar.f27776a) {
                return;
            }
            boolean a2 = woVar.a(i2);
            h8 h8Var = this.f27903n.f27778c[i2];
            if (a2 && h8Var != null) {
                h8Var.f();
            }
            i2++;
        }
    }

    public void a(float f2, fo foVar) {
        this.d = true;
        this.f27902m = this.f27892a.b();
        wo b2 = b(f2, foVar);
        zd zdVar = this.f27895f;
        long j2 = zdVar.f28323b;
        long j3 = zdVar.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a2 = a(b2, j2, false);
        long j4 = this.f27904o;
        zd zdVar2 = this.f27895f;
        this.f27904o = (zdVar2.f28323b - a2) + j4;
        this.f27895f = zdVar2.b(a2);
    }

    private static void a(fe feVar, wd wdVar) {
        try {
            if (wdVar instanceof k3) {
                feVar.a(((k3) wdVar).f24803a);
            } else {
                feVar.a(wdVar);
            }
        } catch (RuntimeException e) {
            pc.a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void a(xd xdVar) {
        if (xdVar == this.f27901l) {
            return;
        }
        a();
        this.f27901l = xdVar;
        b();
    }
}
