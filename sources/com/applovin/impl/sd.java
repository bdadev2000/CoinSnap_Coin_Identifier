package com.applovin.impl;

import com.applovin.impl.wd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final rd f10629a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final yi[] f10630c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10631d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10632e;

    /* renamed from: f, reason: collision with root package name */
    public ud f10633f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10634g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f10635h;

    /* renamed from: i, reason: collision with root package name */
    private final mi[] f10636i;

    /* renamed from: j, reason: collision with root package name */
    private final wo f10637j;

    /* renamed from: k, reason: collision with root package name */
    private final ae f10638k;
    private sd l;
    private qo m;

    /* renamed from: n, reason: collision with root package name */
    private xo f10639n;

    /* renamed from: o, reason: collision with root package name */
    private long f10640o;

    public sd(mi[] miVarArr, long j7, wo woVar, InterfaceC0727n0 interfaceC0727n0, ae aeVar, ud udVar, xo xoVar) {
        this.f10636i = miVarArr;
        this.f10640o = j7;
        this.f10637j = woVar;
        this.f10638k = aeVar;
        wd.a aVar = udVar.f11582a;
        this.b = aVar.f11475a;
        this.f10633f = udVar;
        this.m = qo.f10419d;
        this.f10639n = xoVar;
        this.f10630c = new yi[miVarArr.length];
        this.f10635h = new boolean[miVarArr.length];
        this.f10629a = a(aVar, aeVar, interfaceC0727n0, udVar.b, udVar.f11584d);
    }

    private void b(yi[] yiVarArr) {
        int i9 = 0;
        while (true) {
            mi[] miVarArr = this.f10636i;
            if (i9 >= miVarArr.length) {
                return;
            }
            if (miVarArr[i9].e() == -2) {
                yiVarArr[i9] = null;
            }
            i9++;
        }
    }

    private boolean k() {
        if (this.l == null) {
            return true;
        }
        return false;
    }

    public long a(xo xoVar, long j7, boolean z8) {
        return a(xoVar, j7, z8, new boolean[this.f10636i.length]);
    }

    public long c() {
        if (!this.f10631d) {
            return this.f10633f.b;
        }
        long e4 = this.f10632e ? this.f10629a.e() : Long.MIN_VALUE;
        return e4 == Long.MIN_VALUE ? this.f10633f.f11585e : e4;
    }

    public sd d() {
        return this.l;
    }

    public long e() {
        if (this.f10631d) {
            return this.f10629a.g();
        }
        return 0L;
    }

    public long f() {
        return this.f10640o;
    }

    public long g() {
        return this.f10633f.b + this.f10640o;
    }

    public qo h() {
        return this.m;
    }

    public xo i() {
        return this.f10639n;
    }

    public boolean j() {
        if (this.f10631d && (!this.f10632e || this.f10629a.e() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public void l() {
        a();
        a(this.f10638k, this.f10629a);
    }

    public void m() {
        rd rdVar = this.f10629a;
        if (rdVar instanceof i3) {
            long j7 = this.f10633f.f11584d;
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j7 = Long.MIN_VALUE;
            }
            ((i3) rdVar).a(0L, j7);
        }
    }

    public long a(xo xoVar, long j7, boolean z8, boolean[] zArr) {
        int i9 = 0;
        while (true) {
            boolean z9 = true;
            if (i9 >= xoVar.f12287a) {
                break;
            }
            boolean[] zArr2 = this.f10635h;
            if (z8 || !xoVar.a(this.f10639n, i9)) {
                z9 = false;
            }
            zArr2[i9] = z9;
            i9++;
        }
        b(this.f10630c);
        a();
        this.f10639n = xoVar;
        b();
        long a6 = this.f10629a.a(xoVar.f12288c, this.f10635h, this.f10630c, zArr, j7);
        a(this.f10630c);
        this.f10632e = false;
        int i10 = 0;
        while (true) {
            yi[] yiVarArr = this.f10630c;
            if (i10 >= yiVarArr.length) {
                return a6;
            }
            if (yiVarArr[i10] != null) {
                AbstractC0669a1.b(xoVar.a(i10));
                if (this.f10636i[i10].e() != -2) {
                    this.f10632e = true;
                }
            } else {
                AbstractC0669a1.b(xoVar.f12288c[i10] == null);
            }
            i10++;
        }
    }

    public long d(long j7) {
        return j7 - f();
    }

    public long e(long j7) {
        return j7 + f();
    }

    private void b() {
        if (!k()) {
            return;
        }
        int i9 = 0;
        while (true) {
            xo xoVar = this.f10639n;
            if (i9 >= xoVar.f12287a) {
                return;
            }
            boolean a6 = xoVar.a(i9);
            f8 f8Var = this.f10639n.f12288c[i9];
            if (a6 && f8Var != null) {
                f8Var.i();
            }
            i9++;
        }
    }

    public void c(long j7) {
        this.f10640o = j7;
    }

    public void b(long j7) {
        AbstractC0669a1.b(k());
        if (this.f10631d) {
            this.f10629a.c(d(j7));
        }
    }

    public xo b(float f9, go goVar) {
        xo a6 = this.f10637j.a(this.f10636i, h(), this.f10633f.f11582a, goVar);
        for (f8 f8Var : a6.f12288c) {
            if (f8Var != null) {
                f8Var.a(f9);
            }
        }
        return a6;
    }

    private void a(yi[] yiVarArr) {
        int i9 = 0;
        while (true) {
            mi[] miVarArr = this.f10636i;
            if (i9 >= miVarArr.length) {
                return;
            }
            if (miVarArr[i9].e() == -2 && this.f10639n.a(i9)) {
                yiVarArr[i9] = new q7();
            }
            i9++;
        }
    }

    public void a(long j7) {
        AbstractC0669a1.b(k());
        this.f10629a.b(d(j7));
    }

    private static rd a(wd.a aVar, ae aeVar, InterfaceC0727n0 interfaceC0727n0, long j7, long j9) {
        rd a6 = aeVar.a(aVar, interfaceC0727n0, j7);
        return j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new i3(a6, true, 0L, j9) : a6;
    }

    private void a() {
        if (!k()) {
            return;
        }
        int i9 = 0;
        while (true) {
            xo xoVar = this.f10639n;
            if (i9 >= xoVar.f12287a) {
                return;
            }
            boolean a6 = xoVar.a(i9);
            f8 f8Var = this.f10639n.f12288c[i9];
            if (a6 && f8Var != null) {
                f8Var.f();
            }
            i9++;
        }
    }

    public void a(float f9, go goVar) {
        this.f10631d = true;
        this.m = this.f10629a.b();
        xo b = b(f9, goVar);
        ud udVar = this.f10633f;
        long j7 = udVar.b;
        long j9 = udVar.f11585e;
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 >= j9) {
            j7 = Math.max(0L, j9 - 1);
        }
        long a6 = a(b, j7, false);
        long j10 = this.f10640o;
        ud udVar2 = this.f10633f;
        this.f10640o = (udVar2.b - a6) + j10;
        this.f10633f = udVar2.b(a6);
    }

    private static void a(ae aeVar, rd rdVar) {
        try {
            if (rdVar instanceof i3) {
                aeVar.a(((i3) rdVar).f8203a);
            } else {
                aeVar.a(rdVar);
            }
        } catch (RuntimeException e4) {
            kc.a("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public void a(sd sdVar) {
        if (sdVar == this.l) {
            return;
        }
        a();
        this.l = sdVar;
        b();
    }
}
