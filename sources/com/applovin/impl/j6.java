package com.applovin.impl;

import com.applovin.impl.ij;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j6 implements kg {

    /* renamed from: a, reason: collision with root package name */
    private final jg f24602a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24603b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24604c;
    private final gl d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private long f24605f;

    /* renamed from: g, reason: collision with root package name */
    private long f24606g;

    /* renamed from: h, reason: collision with root package name */
    private long f24607h;

    /* renamed from: i, reason: collision with root package name */
    private long f24608i;

    /* renamed from: j, reason: collision with root package name */
    private long f24609j;

    /* renamed from: k, reason: collision with root package name */
    private long f24610k;

    /* renamed from: l, reason: collision with root package name */
    private long f24611l;

    /* loaded from: classes.dex */
    public final class b implements ij {
        private b() {
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return true;
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return j6.this.d.a(j6.this.f24605f);
        }

        @Override // com.applovin.impl.ij
        public ij.a b(long j2) {
            long b2 = j6.this.d.b(j2);
            return new ij.a(new kj(j2, xp.b(((((j6.this.f24604c - j6.this.f24603b) * b2) / j6.this.f24605f) + j6.this.f24603b) - 30000, j6.this.f24603b, j6.this.f24604c - 1)));
        }
    }

    public j6(gl glVar, long j2, long j3, long j4, long j5, boolean z2) {
        b1.a(j2 >= 0 && j3 > j2);
        this.d = glVar;
        this.f24603b = j2;
        this.f24604c = j3;
        if (j4 == j3 - j2 || z2) {
            this.f24605f = j5;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.f24602a = new jg();
    }

    private void d(l8 l8Var) {
        while (true) {
            this.f24602a.a(l8Var);
            this.f24602a.a(l8Var, false);
            jg jgVar = this.f24602a;
            if (jgVar.f24675c > this.f24607h) {
                l8Var.b();
                return;
            } else {
                l8Var.a(jgVar.f24678h + jgVar.f24679i);
                this.f24608i = l8Var.f();
                this.f24610k = this.f24602a.f24675c;
            }
        }
    }

    @Override // com.applovin.impl.kg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f24605f != 0) {
            return new b();
        }
        return null;
    }

    public long c(l8 l8Var) {
        this.f24602a.a();
        if (this.f24602a.a(l8Var)) {
            this.f24602a.a(l8Var, false);
            jg jgVar = this.f24602a;
            l8Var.a(jgVar.f24678h + jgVar.f24679i);
            long j2 = this.f24602a.f24675c;
            while (true) {
                jg jgVar2 = this.f24602a;
                if ((jgVar2.f24674b & 4) == 4 || !jgVar2.a(l8Var) || l8Var.f() >= this.f24604c || !this.f24602a.a(l8Var, true)) {
                    break;
                }
                jg jgVar3 = this.f24602a;
                if (!n8.a(l8Var, jgVar3.f24678h + jgVar3.f24679i)) {
                    break;
                }
                j2 = this.f24602a.f24675c;
            }
            return j2;
        }
        throw new EOFException();
    }

    private long b(l8 l8Var) {
        if (this.f24608i == this.f24609j) {
            return -1L;
        }
        long f2 = l8Var.f();
        if (!this.f24602a.a(l8Var, this.f24609j)) {
            long j2 = this.f24608i;
            if (j2 != f2) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f24602a.a(l8Var, false);
        l8Var.b();
        long j3 = this.f24607h;
        jg jgVar = this.f24602a;
        long j4 = jgVar.f24675c;
        long j5 = j3 - j4;
        int i2 = jgVar.f24678h + jgVar.f24679i;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        if (j5 < 0) {
            this.f24609j = f2;
            this.f24611l = j4;
        } else {
            this.f24608i = l8Var.f() + i2;
            this.f24610k = this.f24602a.f24675c;
        }
        long j6 = this.f24609j;
        long j7 = this.f24608i;
        if (j6 - j7 < 100000) {
            this.f24609j = j7;
            return j7;
        }
        long f3 = l8Var.f() - (i2 * (j5 <= 0 ? 2L : 1L));
        long j8 = this.f24609j;
        long j9 = this.f24608i;
        return xp.b((((j8 - j9) * j5) / (this.f24611l - this.f24610k)) + f3, j9, j8 - 1);
    }

    @Override // com.applovin.impl.kg
    public long a(l8 l8Var) {
        int i2 = this.e;
        if (i2 == 0) {
            long f2 = l8Var.f();
            this.f24606g = f2;
            this.e = 1;
            long j2 = this.f24604c - 65307;
            if (j2 > f2) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long b2 = b(l8Var);
                if (b2 != -1) {
                    return b2;
                }
                this.e = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(l8Var);
            this.e = 4;
            return -(this.f24610k + 2);
        }
        this.f24605f = c(l8Var);
        this.e = 4;
        return this.f24606g;
    }

    @Override // com.applovin.impl.kg
    public void a(long j2) {
        this.f24607h = xp.b(j2, 0L, this.f24605f - 1);
        this.e = 2;
        this.f24608i = this.f24603b;
        this.f24609j = this.f24604c;
        this.f24610k = 0L;
        this.f24611l = this.f24605f;
    }
}
