package com.applovin.impl;

import com.applovin.impl.ej;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h6 implements gg {
    private final fg a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5095b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5096c;

    /* renamed from: d, reason: collision with root package name */
    private final dl f5097d;

    /* renamed from: e, reason: collision with root package name */
    private int f5098e;

    /* renamed from: f, reason: collision with root package name */
    private long f5099f;

    /* renamed from: g, reason: collision with root package name */
    private long f5100g;

    /* renamed from: h, reason: collision with root package name */
    private long f5101h;

    /* renamed from: i, reason: collision with root package name */
    private long f5102i;

    /* renamed from: j, reason: collision with root package name */
    private long f5103j;

    /* renamed from: k, reason: collision with root package name */
    private long f5104k;

    /* renamed from: l, reason: collision with root package name */
    private long f5105l;

    /* loaded from: classes.dex */
    public final class b implements ej {
        private b() {
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return true;
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return h6.this.f5097d.a(h6.this.f5099f);
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j3) {
            long b3 = h6.this.f5097d.b(j3);
            return new ej.a(new gj(j3, yp.b(((((h6.this.f5096c - h6.this.f5095b) * b3) / h6.this.f5099f) + h6.this.f5095b) - 30000, h6.this.f5095b, h6.this.f5096c - 1)));
        }
    }

    public h6(dl dlVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        a1.a(z11);
        this.f5097d = dlVar;
        this.f5095b = j3;
        this.f5096c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f5098e = 0;
        } else {
            this.f5099f = j12;
            this.f5098e = 4;
        }
        this.a = new fg();
    }

    private void d(j8 j8Var) {
        while (true) {
            this.a.a(j8Var);
            this.a.a(j8Var, false);
            fg fgVar = this.a;
            if (fgVar.f4733c > this.f5101h) {
                j8Var.b();
                return;
            } else {
                j8Var.a(fgVar.f4738h + fgVar.f4739i);
                this.f5102i = j8Var.f();
                this.f5104k = this.a.f4733c;
            }
        }
    }

    @Override // com.applovin.impl.gg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f5099f != 0) {
            return new b();
        }
        return null;
    }

    public long c(j8 j8Var) {
        this.a.a();
        if (this.a.a(j8Var)) {
            this.a.a(j8Var, false);
            fg fgVar = this.a;
            j8Var.a(fgVar.f4738h + fgVar.f4739i);
            long j3 = this.a.f4733c;
            while (true) {
                fg fgVar2 = this.a;
                if ((fgVar2.f4732b & 4) == 4 || !fgVar2.a(j8Var) || j8Var.f() >= this.f5096c || !this.a.a(j8Var, true)) {
                    break;
                }
                fg fgVar3 = this.a;
                if (!l8.a(j8Var, fgVar3.f4738h + fgVar3.f4739i)) {
                    break;
                }
                j3 = this.a.f4733c;
            }
            return j3;
        }
        throw new EOFException();
    }

    private long b(j8 j8Var) {
        if (this.f5102i == this.f5103j) {
            return -1L;
        }
        long f10 = j8Var.f();
        if (!this.a.a(j8Var, this.f5103j)) {
            long j3 = this.f5102i;
            if (j3 != f10) {
                return j3;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(j8Var, false);
        j8Var.b();
        long j10 = this.f5101h;
        fg fgVar = this.a;
        long j11 = fgVar.f4733c;
        long j12 = j10 - j11;
        int i10 = fgVar.f4738h + fgVar.f4739i;
        if (0 <= j12 && j12 < 72000) {
            return -1L;
        }
        if (j12 < 0) {
            this.f5103j = f10;
            this.f5105l = j11;
        } else {
            this.f5102i = j8Var.f() + i10;
            this.f5104k = this.a.f4733c;
        }
        long j13 = this.f5103j;
        long j14 = this.f5102i;
        if (j13 - j14 < 100000) {
            this.f5103j = j14;
            return j14;
        }
        long f11 = j8Var.f() - (i10 * (j12 <= 0 ? 2L : 1L));
        long j15 = this.f5103j;
        long j16 = this.f5102i;
        return yp.b((((j15 - j16) * j12) / (this.f5105l - this.f5104k)) + f11, j16, j15 - 1);
    }

    @Override // com.applovin.impl.gg
    public long a(j8 j8Var) {
        int i10 = this.f5098e;
        if (i10 == 0) {
            long f10 = j8Var.f();
            this.f5100g = f10;
            this.f5098e = 1;
            long j3 = this.f5096c - 65307;
            if (j3 > f10) {
                return j3;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long b3 = b(j8Var);
                if (b3 != -1) {
                    return b3;
                }
                this.f5098e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(j8Var);
            this.f5098e = 4;
            return -(this.f5104k + 2);
        }
        this.f5099f = c(j8Var);
        this.f5098e = 4;
        return this.f5100g;
    }

    @Override // com.applovin.impl.gg
    public void a(long j3) {
        this.f5101h = yp.b(j3, 0L, this.f5099f - 1);
        this.f5098e = 2;
        this.f5102i = this.f5095b;
        this.f5103j = this.f5096c;
        this.f5104k = 0L;
        this.f5105l = this.f5099f;
    }
}
