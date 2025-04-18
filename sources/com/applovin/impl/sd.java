package com.applovin.impl;

import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sd {
    public final rd a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7490b;

    /* renamed from: c, reason: collision with root package name */
    public final yi[] f7491c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7492d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7493e;

    /* renamed from: f, reason: collision with root package name */
    public ud f7494f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7495g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f7496h;

    /* renamed from: i, reason: collision with root package name */
    private final mi[] f7497i;

    /* renamed from: j, reason: collision with root package name */
    private final wo f7498j;

    /* renamed from: k, reason: collision with root package name */
    private final ae f7499k;

    /* renamed from: l, reason: collision with root package name */
    private sd f7500l;

    /* renamed from: m, reason: collision with root package name */
    private qo f7501m;

    /* renamed from: n, reason: collision with root package name */
    private xo f7502n;

    /* renamed from: o, reason: collision with root package name */
    private long f7503o;

    public sd(mi[] miVarArr, long j3, wo woVar, n0 n0Var, ae aeVar, ud udVar, xo xoVar) {
        this.f7497i = miVarArr;
        this.f7503o = j3;
        this.f7498j = woVar;
        this.f7499k = aeVar;
        wd.a aVar = udVar.a;
        this.f7490b = aVar.a;
        this.f7494f = udVar;
        this.f7501m = qo.f7276d;
        this.f7502n = xoVar;
        this.f7491c = new yi[miVarArr.length];
        this.f7496h = new boolean[miVarArr.length];
        this.a = a(aVar, aeVar, n0Var, udVar.f8367b, udVar.f8369d);
    }

    private void b(yi[] yiVarArr) {
        int i10 = 0;
        while (true) {
            mi[] miVarArr = this.f7497i;
            if (i10 >= miVarArr.length) {
                return;
            }
            if (miVarArr[i10].e() == -2) {
                yiVarArr[i10] = null;
            }
            i10++;
        }
    }

    private boolean k() {
        return this.f7500l == null;
    }

    public long a(xo xoVar, long j3, boolean z10) {
        return a(xoVar, j3, z10, new boolean[this.f7497i.length]);
    }

    public long c() {
        if (!this.f7492d) {
            return this.f7494f.f8367b;
        }
        long e2 = this.f7493e ? this.a.e() : Long.MIN_VALUE;
        return e2 == Long.MIN_VALUE ? this.f7494f.f8370e : e2;
    }

    public sd d() {
        return this.f7500l;
    }

    public long e() {
        if (this.f7492d) {
            return this.a.g();
        }
        return 0L;
    }

    public long f() {
        return this.f7503o;
    }

    public long g() {
        return this.f7494f.f8367b + this.f7503o;
    }

    public qo h() {
        return this.f7501m;
    }

    public xo i() {
        return this.f7502n;
    }

    public boolean j() {
        if (this.f7492d && (!this.f7493e || this.a.e() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public void l() {
        a();
        a(this.f7499k, this.a);
    }

    public void m() {
        rd rdVar = this.a;
        if (rdVar instanceof i3) {
            long j3 = this.f7494f.f8369d;
            if (j3 == C.TIME_UNSET) {
                j3 = Long.MIN_VALUE;
            }
            ((i3) rdVar).a(0L, j3);
        }
    }

    public long a(xo xoVar, long j3, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xoVar.a) {
                break;
            }
            boolean[] zArr2 = this.f7496h;
            if (z10 || !xoVar.a(this.f7502n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        b(this.f7491c);
        a();
        this.f7502n = xoVar;
        b();
        long a = this.a.a(xoVar.f9070c, this.f7496h, this.f7491c, zArr, j3);
        a(this.f7491c);
        this.f7493e = false;
        int i11 = 0;
        while (true) {
            yi[] yiVarArr = this.f7491c;
            if (i11 >= yiVarArr.length) {
                return a;
            }
            if (yiVarArr[i11] != null) {
                a1.b(xoVar.a(i11));
                if (this.f7497i[i11].e() != -2) {
                    this.f7493e = true;
                }
            } else {
                a1.b(xoVar.f9070c[i11] == null);
            }
            i11++;
        }
    }

    public long d(long j3) {
        return j3 - f();
    }

    public long e(long j3) {
        return j3 + f();
    }

    private void b() {
        if (!k()) {
            return;
        }
        int i10 = 0;
        while (true) {
            xo xoVar = this.f7502n;
            if (i10 >= xoVar.a) {
                return;
            }
            boolean a = xoVar.a(i10);
            f8 f8Var = this.f7502n.f9070c[i10];
            if (a && f8Var != null) {
                f8Var.i();
            }
            i10++;
        }
    }

    public void c(long j3) {
        this.f7503o = j3;
    }

    public void b(long j3) {
        a1.b(k());
        if (this.f7492d) {
            this.a.c(d(j3));
        }
    }

    public xo b(float f10, go goVar) {
        xo a = this.f7498j.a(this.f7497i, h(), this.f7494f.a, goVar);
        for (f8 f8Var : a.f9070c) {
            if (f8Var != null) {
                f8Var.a(f10);
            }
        }
        return a;
    }

    private void a(yi[] yiVarArr) {
        int i10 = 0;
        while (true) {
            mi[] miVarArr = this.f7497i;
            if (i10 >= miVarArr.length) {
                return;
            }
            if (miVarArr[i10].e() == -2 && this.f7502n.a(i10)) {
                yiVarArr[i10] = new q7();
            }
            i10++;
        }
    }

    public void a(long j3) {
        a1.b(k());
        this.a.b(d(j3));
    }

    private static rd a(wd.a aVar, ae aeVar, n0 n0Var, long j3, long j10) {
        rd a = aeVar.a(aVar, n0Var, j3);
        return j10 != C.TIME_UNSET ? new i3(a, true, 0L, j10) : a;
    }

    private void a() {
        if (!k()) {
            return;
        }
        int i10 = 0;
        while (true) {
            xo xoVar = this.f7502n;
            if (i10 >= xoVar.a) {
                return;
            }
            boolean a = xoVar.a(i10);
            f8 f8Var = this.f7502n.f9070c[i10];
            if (a && f8Var != null) {
                f8Var.f();
            }
            i10++;
        }
    }

    public void a(float f10, go goVar) {
        this.f7492d = true;
        this.f7501m = this.a.b();
        xo b3 = b(f10, goVar);
        ud udVar = this.f7494f;
        long j3 = udVar.f8367b;
        long j10 = udVar.f8370e;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        long a = a(b3, j3, false);
        long j11 = this.f7503o;
        ud udVar2 = this.f7494f;
        this.f7503o = (udVar2.f8367b - a) + j11;
        this.f7494f = udVar2.b(a);
    }

    private static void a(ae aeVar, rd rdVar) {
        try {
            if (rdVar instanceof i3) {
                aeVar.a(((i3) rdVar).a);
            } else {
                aeVar.a(rdVar);
            }
        } catch (RuntimeException e2) {
            kc.a("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public void a(sd sdVar) {
        if (sdVar == this.f7500l) {
            return;
        }
        a();
        this.f7500l = sdVar;
        b();
    }
}
