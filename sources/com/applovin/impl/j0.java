package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class j0 implements i8 {

    /* renamed from: m */
    public static final m8 f5403m = new ht(6);
    private final int a;

    /* renamed from: b */
    private final k0 f5404b;

    /* renamed from: c */
    private final yg f5405c;

    /* renamed from: d */
    private final yg f5406d;

    /* renamed from: e */
    private final xg f5407e;

    /* renamed from: f */
    private k8 f5408f;

    /* renamed from: g */
    private long f5409g;

    /* renamed from: h */
    private long f5410h;

    /* renamed from: i */
    private int f5411i;

    /* renamed from: j */
    private boolean f5412j;

    /* renamed from: k */
    private boolean f5413k;

    /* renamed from: l */
    private boolean f5414l;

    public j0() {
        this(0);
    }

    private void b(j8 j8Var) {
        if (this.f5412j) {
            return;
        }
        this.f5411i = -1;
        j8Var.b();
        long j3 = 0;
        if (j8Var.f() == 0) {
            c(j8Var);
        }
        int i10 = 0;
        int i11 = 0;
        while (j8Var.b(this.f5406d.c(), 0, 2, true)) {
            try {
                this.f5406d.f(0);
                if (!k0.a(this.f5406d.C())) {
                    break;
                }
                if (!j8Var.b(this.f5406d.c(), 0, 4, true)) {
                    break;
                }
                this.f5407e.c(14);
                int a = this.f5407e.a(13);
                if (a > 6) {
                    j3 += a;
                    i11++;
                    if (i11 != 1000 && j8Var.a(a - 6, true)) {
                    }
                    break;
                }
                this.f5412j = true;
                throw ah.a("Malformed ADTS stream", null);
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        j8Var.b();
        if (i10 > 0) {
            this.f5411i = (int) (j3 / i10);
        } else {
            this.f5411i = -1;
        }
        this.f5412j = true;
    }

    public static /* synthetic */ i8[] c() {
        return b();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public j0(int i10) {
        this.a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5404b = new k0(true);
        this.f5405c = new yg(2048);
        this.f5411i = -1;
        this.f5410h = -1L;
        yg ygVar = new yg(10);
        this.f5406d = ygVar;
        this.f5407e = new xg(ygVar.c());
    }

    private static int a(int i10, long j3) {
        return (int) (((i10 * 8) * 1000000) / j3);
    }

    private int c(j8 j8Var) {
        int i10 = 0;
        while (true) {
            j8Var.c(this.f5406d.c(), 0, 10);
            this.f5406d.f(0);
            if (this.f5406d.z() != 4801587) {
                break;
            }
            this.f5406d.g(3);
            int v10 = this.f5406d.v();
            i10 += v10 + 10;
            j8Var.c(v10);
        }
        j8Var.b();
        j8Var.c(i10);
        if (this.f5410h == -1) {
            this.f5410h = i10;
        }
        return i10;
    }

    private ej a(long j3, boolean z10) {
        return new n4(j3, this.f5410h, a(this.f5411i, this.f5404b.d()), this.f5411i, z10);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f5408f = k8Var;
        this.f5404b.a(k8Var, new ep.d(0, 1));
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        a1.b(this.f5408f);
        long a = j8Var.a();
        int i10 = this.a;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && a != -1)) {
            b(j8Var);
        }
        int a10 = j8Var.a(this.f5405c.c(), 0, 2048);
        boolean z10 = a10 == -1;
        b(a, z10);
        if (z10) {
            return -1;
        }
        this.f5405c.f(0);
        this.f5405c.e(a10);
        if (!this.f5413k) {
            this.f5404b.a(this.f5409g, 4);
            this.f5413k = true;
        }
        this.f5404b.a(this.f5405c);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.f5413k = false;
        this.f5404b.a();
        this.f5409g = j10;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        int c10 = c(j8Var);
        int i10 = c10;
        int i11 = 0;
        int i12 = 0;
        do {
            j8Var.c(this.f5406d.c(), 0, 2);
            this.f5406d.f(0);
            if (k0.a(this.f5406d.C())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                j8Var.c(this.f5406d.c(), 0, 4);
                this.f5407e.c(14);
                int a = this.f5407e.a(13);
                if (a <= 6) {
                    i10++;
                    j8Var.b();
                    j8Var.c(i10);
                } else {
                    j8Var.c(a - 6);
                    i12 += a;
                }
            } else {
                i10++;
                j8Var.b();
                j8Var.c(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - c10 < 8192);
        return false;
    }

    private void b(long j3, boolean z10) {
        if (this.f5414l) {
            return;
        }
        boolean z11 = (this.a & 1) != 0 && this.f5411i > 0;
        if (z11 && this.f5404b.d() == C.TIME_UNSET && !z10) {
            return;
        }
        if (z11 && this.f5404b.d() != C.TIME_UNSET) {
            this.f5408f.a(a(j3, (this.a & 2) != 0));
        } else {
            this.f5408f.a(new ej.b(C.TIME_UNSET));
        }
        this.f5414l = true;
    }

    public static /* synthetic */ i8[] b() {
        return new i8[]{new j0()};
    }
}
