package com.applovin.impl;

import com.applovin.impl.ej;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h6 implements gg {

    /* renamed from: a, reason: collision with root package name */
    private final fg f8063a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8064c;

    /* renamed from: d, reason: collision with root package name */
    private final dl f8065d;

    /* renamed from: e, reason: collision with root package name */
    private int f8066e;

    /* renamed from: f, reason: collision with root package name */
    private long f8067f;

    /* renamed from: g, reason: collision with root package name */
    private long f8068g;

    /* renamed from: h, reason: collision with root package name */
    private long f8069h;

    /* renamed from: i, reason: collision with root package name */
    private long f8070i;

    /* renamed from: j, reason: collision with root package name */
    private long f8071j;

    /* renamed from: k, reason: collision with root package name */
    private long f8072k;
    private long l;

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
            return h6.this.f8065d.a(h6.this.f8067f);
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j7) {
            long b = h6.this.f8065d.b(j7);
            return new ej.a(new gj(j7, yp.b(((((h6.this.f8064c - h6.this.b) * b) / h6.this.f8067f) + h6.this.b) - 30000, h6.this.b, h6.this.f8064c - 1)));
        }
    }

    public h6(dl dlVar, long j7, long j9, long j10, long j11, boolean z8) {
        boolean z9;
        if (j7 >= 0 && j9 > j7) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0669a1.a(z9);
        this.f8065d = dlVar;
        this.b = j7;
        this.f8064c = j9;
        if (j10 != j9 - j7 && !z8) {
            this.f8066e = 0;
        } else {
            this.f8067f = j11;
            this.f8066e = 4;
        }
        this.f8063a = new fg();
    }

    private void d(j8 j8Var) {
        while (true) {
            this.f8063a.a(j8Var);
            this.f8063a.a(j8Var, false);
            fg fgVar = this.f8063a;
            if (fgVar.f7690c > this.f8069h) {
                j8Var.b();
                return;
            } else {
                j8Var.a(fgVar.f7695h + fgVar.f7696i);
                this.f8070i = j8Var.f();
                this.f8072k = this.f8063a.f7690c;
            }
        }
    }

    @Override // com.applovin.impl.gg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f8067f != 0) {
            return new b();
        }
        return null;
    }

    public long c(j8 j8Var) {
        this.f8063a.a();
        if (this.f8063a.a(j8Var)) {
            this.f8063a.a(j8Var, false);
            fg fgVar = this.f8063a;
            j8Var.a(fgVar.f7695h + fgVar.f7696i);
            long j7 = this.f8063a.f7690c;
            while (true) {
                fg fgVar2 = this.f8063a;
                if ((fgVar2.b & 4) == 4 || !fgVar2.a(j8Var) || j8Var.f() >= this.f8064c || !this.f8063a.a(j8Var, true)) {
                    break;
                }
                fg fgVar3 = this.f8063a;
                if (!l8.a(j8Var, fgVar3.f7695h + fgVar3.f7696i)) {
                    break;
                }
                j7 = this.f8063a.f7690c;
            }
            return j7;
        }
        throw new EOFException();
    }

    private long b(j8 j8Var) {
        if (this.f8070i == this.f8071j) {
            return -1L;
        }
        long f9 = j8Var.f();
        if (!this.f8063a.a(j8Var, this.f8071j)) {
            long j7 = this.f8070i;
            if (j7 != f9) {
                return j7;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f8063a.a(j8Var, false);
        j8Var.b();
        long j9 = this.f8069h;
        fg fgVar = this.f8063a;
        long j10 = fgVar.f7690c;
        long j11 = j9 - j10;
        int i9 = fgVar.f7695h + fgVar.f7696i;
        if (0 <= j11 && j11 < 72000) {
            return -1L;
        }
        if (j11 < 0) {
            this.f8071j = f9;
            this.l = j10;
        } else {
            this.f8070i = j8Var.f() + i9;
            this.f8072k = this.f8063a.f7690c;
        }
        long j12 = this.f8071j;
        long j13 = this.f8070i;
        if (j12 - j13 < 100000) {
            this.f8071j = j13;
            return j13;
        }
        long f10 = j8Var.f() - (i9 * (j11 <= 0 ? 2L : 1L));
        long j14 = this.f8071j;
        long j15 = this.f8070i;
        return yp.b((((j14 - j15) * j11) / (this.l - this.f8072k)) + f10, j15, j14 - 1);
    }

    @Override // com.applovin.impl.gg
    public long a(j8 j8Var) {
        int i9 = this.f8066e;
        if (i9 == 0) {
            long f9 = j8Var.f();
            this.f8068g = f9;
            this.f8066e = 1;
            long j7 = this.f8064c - 65307;
            if (j7 > f9) {
                return j7;
            }
        } else if (i9 != 1) {
            if (i9 == 2) {
                long b8 = b(j8Var);
                if (b8 != -1) {
                    return b8;
                }
                this.f8066e = 3;
            } else if (i9 != 3) {
                if (i9 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(j8Var);
            this.f8066e = 4;
            return -(this.f8072k + 2);
        }
        this.f8067f = c(j8Var);
        this.f8066e = 4;
        return this.f8068g;
    }

    @Override // com.applovin.impl.gg
    public void a(long j7) {
        this.f8069h = yp.b(j7, 0L, this.f8067f - 1);
        this.f8066e = 2;
        this.f8070i = this.b;
        this.f8071j = this.f8064c;
        this.f8072k = 0L;
        this.l = this.f8067f;
    }
}
