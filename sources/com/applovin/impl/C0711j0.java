package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.io.EOFException;

/* renamed from: com.applovin.impl.j0 */
/* loaded from: classes.dex */
public final class C0711j0 implements i8 {
    public static final m8 m = new A0(6);

    /* renamed from: a */
    private final int f8359a;
    private final C0715k0 b;

    /* renamed from: c */
    private final yg f8360c;

    /* renamed from: d */
    private final yg f8361d;

    /* renamed from: e */
    private final xg f8362e;

    /* renamed from: f */
    private k8 f8363f;

    /* renamed from: g */
    private long f8364g;

    /* renamed from: h */
    private long f8365h;

    /* renamed from: i */
    private int f8366i;

    /* renamed from: j */
    private boolean f8367j;

    /* renamed from: k */
    private boolean f8368k;
    private boolean l;

    public C0711j0() {
        this(0);
    }

    private void b(j8 j8Var) {
        if (this.f8367j) {
            return;
        }
        this.f8366i = -1;
        j8Var.b();
        long j7 = 0;
        if (j8Var.f() == 0) {
            c(j8Var);
        }
        int i9 = 0;
        int i10 = 0;
        while (j8Var.b(this.f8361d.c(), 0, 2, true)) {
            try {
                this.f8361d.f(0);
                if (!C0715k0.a(this.f8361d.C())) {
                    break;
                }
                if (!j8Var.b(this.f8361d.c(), 0, 4, true)) {
                    break;
                }
                this.f8362e.c(14);
                int a6 = this.f8362e.a(13);
                if (a6 > 6) {
                    j7 += a6;
                    i10++;
                    if (i10 == 1000 || !j8Var.a(a6 - 6, true)) {
                        break;
                    }
                } else {
                    this.f8367j = true;
                    throw ah.a("Malformed ADTS stream", null);
                }
            } catch (EOFException unused) {
            }
        }
        i9 = i10;
        j8Var.b();
        if (i9 > 0) {
            this.f8366i = (int) (j7 / i9);
        } else {
            this.f8366i = -1;
        }
        this.f8367j = true;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public C0711j0(int i9) {
        this.f8359a = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.b = new C0715k0(true);
        this.f8360c = new yg(2048);
        this.f8366i = -1;
        this.f8365h = -1L;
        yg ygVar = new yg(10);
        this.f8361d = ygVar;
        this.f8362e = new xg(ygVar.c());
    }

    private static int a(int i9, long j7) {
        return (int) (((i9 * 8) * 1000000) / j7);
    }

    private int c(j8 j8Var) {
        int i9 = 0;
        while (true) {
            j8Var.c(this.f8361d.c(), 0, 10);
            this.f8361d.f(0);
            if (this.f8361d.z() != 4801587) {
                break;
            }
            this.f8361d.g(3);
            int v6 = this.f8361d.v();
            i9 += v6 + 10;
            j8Var.c(v6);
        }
        j8Var.b();
        j8Var.c(i9);
        if (this.f8365h == -1) {
            this.f8365h = i9;
        }
        return i9;
    }

    private ej a(long j7, boolean z8) {
        return new n4(j7, this.f8365h, a(this.f8366i, this.b.d()), this.f8366i, z8);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8363f = k8Var;
        this.b.a(k8Var, new ep.d(0, 1));
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        AbstractC0669a1.b(this.f8363f);
        long a6 = j8Var.a();
        int i9 = this.f8359a;
        if ((i9 & 2) != 0 || ((i9 & 1) != 0 && a6 != -1)) {
            b(j8Var);
        }
        int a9 = j8Var.a(this.f8360c.c(), 0, 2048);
        boolean z8 = a9 == -1;
        b(a6, z8);
        if (z8) {
            return -1;
        }
        this.f8360c.f(0);
        this.f8360c.e(a9);
        if (!this.f8368k) {
            this.b.a(this.f8364g, 4);
            this.f8368k = true;
        }
        this.b.a(this.f8360c);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f8368k = false;
        this.b.a();
        this.f8364g = j9;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        int c9 = c(j8Var);
        int i9 = c9;
        int i10 = 0;
        int i11 = 0;
        do {
            j8Var.c(this.f8361d.c(), 0, 2);
            this.f8361d.f(0);
            if (C0715k0.a(this.f8361d.C())) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                j8Var.c(this.f8361d.c(), 0, 4);
                this.f8362e.c(14);
                int a6 = this.f8362e.a(13);
                if (a6 <= 6) {
                    i9++;
                    j8Var.b();
                    j8Var.c(i9);
                } else {
                    j8Var.c(a6 - 6);
                    i11 += a6;
                }
            } else {
                i9++;
                j8Var.b();
                j8Var.c(i9);
            }
            i10 = 0;
            i11 = 0;
        } while (i9 - c9 < 8192);
        return false;
    }

    private void b(long j7, boolean z8) {
        if (this.l) {
            return;
        }
        boolean z9 = (this.f8359a & 1) != 0 && this.f8366i > 0;
        if (z9 && this.b.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && !z8) {
            return;
        }
        if (z9 && this.b.d() != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f8363f.a(a(j7, (this.f8359a & 2) != 0));
        } else {
            this.f8363f.a(new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        }
        this.l = true;
    }

    public static /* synthetic */ i8[] b() {
        return new i8[]{new C0711j0()};
    }
}
