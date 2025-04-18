package v8;

import android.util.SparseArray;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class y0 implements y7.a0 {
    public s7.r0 A;
    public s7.r0 B;
    public boolean C;
    public boolean D;
    public long E;
    public final t0 a;

    /* renamed from: d, reason: collision with root package name */
    public final x7.u f26324d;

    /* renamed from: e, reason: collision with root package name */
    public final x7.q f26325e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f26326f;

    /* renamed from: g, reason: collision with root package name */
    public s7.r0 f26327g;

    /* renamed from: h, reason: collision with root package name */
    public x7.n f26328h;

    /* renamed from: p, reason: collision with root package name */
    public int f26336p;

    /* renamed from: q, reason: collision with root package name */
    public int f26337q;

    /* renamed from: r, reason: collision with root package name */
    public int f26338r;

    /* renamed from: s, reason: collision with root package name */
    public int f26339s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26342w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26345z;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f26322b = new v0();

    /* renamed from: i, reason: collision with root package name */
    public int f26329i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f26330j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f26331k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f26334n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f26333m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f26332l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public y7.z[] f26335o = new y7.z[1000];

    /* renamed from: c, reason: collision with root package name */
    public final f0.c f26323c = new f0.c(new nb.a(28));

    /* renamed from: t, reason: collision with root package name */
    public long f26340t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f26341v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26344y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26343x = true;

    public y0(m9.q qVar, x7.u uVar, x7.q qVar2) {
        this.f26324d = uVar;
        this.f26325e = qVar2;
        this.a = new t0(qVar);
    }

    @Override // y7.a0
    public final void a(int i10, n9.x xVar) {
        while (true) {
            t0 t0Var = this.a;
            if (i10 > 0) {
                int c10 = t0Var.c(i10);
                s0 s0Var = t0Var.f26288f;
                m9.a aVar = s0Var.f26274c;
                xVar.d(aVar.a, ((int) (t0Var.f26289g - s0Var.a)) + aVar.f21642b, c10);
                i10 -= c10;
                long j3 = t0Var.f26289g + c10;
                t0Var.f26289g = j3;
                s0 s0Var2 = t0Var.f26288f;
                if (j3 == s0Var2.f26273b) {
                    t0Var.f26288f = s0Var2.f26275d;
                }
            } else {
                t0Var.getClass();
                return;
            }
        }
    }

    @Override // y7.a0
    public final int b(m9.i iVar, int i10, boolean z10) {
        t0 t0Var = this.a;
        int c10 = t0Var.c(i10);
        s0 s0Var = t0Var.f26288f;
        m9.a aVar = s0Var.f26274c;
        int read = iVar.read(aVar.a, ((int) (t0Var.f26289g - s0Var.a)) + aVar.f21642b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = t0Var.f26289g + read;
        t0Var.f26289g = j3;
        s0 s0Var2 = t0Var.f26288f;
        if (j3 == s0Var2.f26273b) {
            t0Var.f26288f = s0Var2.f26275d;
            return read;
        }
        return read;
    }

    @Override // y7.a0
    public final void d(long j3, int i10, int i11, int i12, y7.z zVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        x7.t tVar;
        boolean z13;
        if (this.f26345z) {
            s7.r0 r0Var = this.A;
            u0.p(r0Var);
            f(r0Var);
        }
        int i13 = i10 & 1;
        if (i13 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26343x) {
            if (!z10) {
                return;
            } else {
                this.f26343x = false;
            }
        }
        long j10 = j3 + this.E;
        if (this.C) {
            if (j10 < this.f26340t) {
                return;
            }
            if (i13 == 0) {
                if (!this.D) {
                    n9.o.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i10 |= 1;
            }
        }
        long j11 = (this.a.f26289g - i11) - i12;
        synchronized (this) {
            int i14 = this.f26336p;
            if (i14 > 0) {
                if (this.f26331k[n(i14 - 1)] + this.f26332l[r14] <= j11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                u0.d(z13);
            }
            if ((536870912 & i10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f26342w = z11;
            this.f26341v = Math.max(this.f26341v, j10);
            int n10 = n(this.f26336p);
            this.f26334n[n10] = j10;
            this.f26331k[n10] = j11;
            this.f26332l[n10] = i11;
            this.f26333m[n10] = i10;
            this.f26335o[n10] = zVar;
            this.f26330j[n10] = 0;
            if (((SparseArray) this.f26323c.f17516c).size() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || !((w0) this.f26323c.j()).a.equals(this.B)) {
                x7.u uVar = this.f26324d;
                if (uVar != null) {
                    tVar = uVar.b(this.f26325e, this.B);
                } else {
                    tVar = x7.t.f27498l8;
                }
                f0.c cVar = this.f26323c;
                int i15 = this.f26337q + this.f26336p;
                s7.r0 r0Var2 = this.B;
                r0Var2.getClass();
                cVar.b(i15, new w0(r0Var2, tVar));
            }
            int i16 = this.f26336p + 1;
            this.f26336p = i16;
            int i17 = this.f26329i;
            if (i16 == i17) {
                int i18 = i17 + 1000;
                long[] jArr = new long[i18];
                long[] jArr2 = new long[i18];
                long[] jArr3 = new long[i18];
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                y7.z[] zVarArr = new y7.z[i18];
                int i19 = this.f26338r;
                int i20 = i17 - i19;
                System.arraycopy(this.f26331k, i19, jArr2, 0, i20);
                System.arraycopy(this.f26334n, this.f26338r, jArr3, 0, i20);
                System.arraycopy(this.f26333m, this.f26338r, iArr, 0, i20);
                System.arraycopy(this.f26332l, this.f26338r, iArr2, 0, i20);
                System.arraycopy(this.f26335o, this.f26338r, zVarArr, 0, i20);
                System.arraycopy(this.f26330j, this.f26338r, jArr, 0, i20);
                int i21 = this.f26338r;
                System.arraycopy(this.f26331k, 0, jArr2, i20, i21);
                System.arraycopy(this.f26334n, 0, jArr3, i20, i21);
                System.arraycopy(this.f26333m, 0, iArr, i20, i21);
                System.arraycopy(this.f26332l, 0, iArr2, i20, i21);
                System.arraycopy(this.f26335o, 0, zVarArr, i20, i21);
                System.arraycopy(this.f26330j, 0, jArr, i20, i21);
                this.f26331k = jArr2;
                this.f26334n = jArr3;
                this.f26333m = iArr;
                this.f26332l = iArr2;
                this.f26335o = zVarArr;
                this.f26330j = jArr;
                this.f26338r = 0;
                this.f26329i = i18;
            }
        }
    }

    @Override // y7.a0
    public final void f(s7.r0 r0Var) {
        s7.r0 r0Var2;
        boolean z10;
        if (this.E != 0 && r0Var.f24727r != Long.MAX_VALUE) {
            s7.q0 q0Var = new s7.q0(r0Var);
            q0Var.f24671o = r0Var.f24727r + this.E;
            r0Var2 = new s7.r0(q0Var);
        } else {
            r0Var2 = r0Var;
        }
        boolean z11 = false;
        this.f26345z = false;
        this.A = r0Var;
        synchronized (this) {
            this.f26344y = false;
            if (!n9.h0.a(r0Var2, this.B)) {
                if (((SparseArray) this.f26323c.f17516c).size() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && ((w0) this.f26323c.j()).a.equals(r0Var2)) {
                    this.B = ((w0) this.f26323c.j()).a;
                } else {
                    this.B = r0Var2;
                }
                s7.r0 r0Var3 = this.B;
                this.C = n9.q.a(r0Var3.f24723n, r0Var3.f24720k);
                this.D = false;
                z11 = true;
            }
        }
        x0 x0Var = this.f26326f;
        if (x0Var != null && z11) {
            p0 p0Var = (p0) x0Var;
            p0Var.f26238r.post(p0Var.f26236p);
        }
    }

    public final long g(int i10) {
        this.u = Math.max(this.u, m(i10));
        this.f26336p -= i10;
        int i11 = this.f26337q + i10;
        this.f26337q = i11;
        int i12 = this.f26338r + i10;
        this.f26338r = i12;
        int i13 = this.f26329i;
        if (i12 >= i13) {
            this.f26338r = i12 - i13;
        }
        int i14 = this.f26339s - i10;
        this.f26339s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f26339s = 0;
        }
        while (true) {
            f0.c cVar = this.f26323c;
            if (i15 >= ((SparseArray) cVar.f17516c).size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < ((SparseArray) cVar.f17516c).keyAt(i16)) {
                break;
            }
            ((n9.c) cVar.f17517d).accept(((SparseArray) cVar.f17516c).valueAt(i15));
            ((SparseArray) cVar.f17516c).removeAt(i15);
            int i17 = cVar.f17515b;
            if (i17 > 0) {
                cVar.f17515b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f26336p == 0) {
            int i18 = this.f26338r;
            if (i18 == 0) {
                i18 = this.f26329i;
            }
            return this.f26331k[i18 - 1] + this.f26332l[r6];
        }
        return this.f26331k[this.f26338r];
    }

    public final void h(long j3, boolean z10) {
        long j10;
        int i10;
        int i11;
        t0 t0Var = this.a;
        synchronized (this) {
            int i12 = this.f26336p;
            if (i12 != 0) {
                long[] jArr = this.f26334n;
                int i13 = this.f26338r;
                if (j3 >= jArr[i13]) {
                    if (z10 && (i11 = this.f26339s) != i12) {
                        i10 = i11 + 1;
                    } else {
                        i10 = i12;
                    }
                    int l10 = l(i13, i10, j3, false);
                    if (l10 != -1) {
                        j10 = g(l10);
                    } else {
                        j10 = -1;
                    }
                }
            }
            j10 = -1;
        }
        t0Var.b(j10);
    }

    public final void i() {
        long g10;
        t0 t0Var = this.a;
        synchronized (this) {
            int i10 = this.f26336p;
            if (i10 == 0) {
                g10 = -1;
            } else {
                g10 = g(i10);
            }
        }
        t0Var.b(g10);
    }

    public final long j(int i10) {
        boolean z10;
        int i11 = this.f26337q;
        int i12 = this.f26336p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f26339s) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        int i14 = this.f26336p - i13;
        this.f26336p = i14;
        this.f26341v = Math.max(this.u, m(i14));
        if (i13 == 0 && this.f26342w) {
            z11 = true;
        }
        this.f26342w = z11;
        f0.c cVar = this.f26323c;
        int i15 = -1;
        for (int size = ((SparseArray) cVar.f17516c).size() - 1; size >= 0 && i10 < ((SparseArray) cVar.f17516c).keyAt(size); size--) {
            ((n9.c) cVar.f17517d).accept(((SparseArray) cVar.f17516c).valueAt(size));
            ((SparseArray) cVar.f17516c).removeAt(size);
        }
        if (((SparseArray) cVar.f17516c).size() > 0) {
            i15 = Math.min(cVar.f17515b, ((SparseArray) cVar.f17516c).size() - 1);
        }
        cVar.f17515b = i15;
        int i16 = this.f26336p;
        if (i16 != 0) {
            return this.f26331k[n(i16 - 1)] + this.f26332l[r9];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z10;
        long j3 = j(i10);
        t0 t0Var = this.a;
        if (j3 <= t0Var.f26289g) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        t0Var.f26289g = j3;
        int i11 = t0Var.f26284b;
        if (j3 != 0) {
            s0 s0Var = t0Var.f26286d;
            if (j3 != s0Var.a) {
                while (t0Var.f26289g > s0Var.f26273b) {
                    s0Var = s0Var.f26275d;
                }
                s0 s0Var2 = s0Var.f26275d;
                s0Var2.getClass();
                t0Var.a(s0Var2);
                s0 s0Var3 = new s0(s0Var.f26273b, i11);
                s0Var.f26275d = s0Var3;
                if (t0Var.f26289g == s0Var.f26273b) {
                    s0Var = s0Var3;
                }
                t0Var.f26288f = s0Var;
                if (t0Var.f26287e == s0Var2) {
                    t0Var.f26287e = s0Var3;
                    return;
                }
                return;
            }
        }
        t0Var.a(t0Var.f26286d);
        s0 s0Var4 = new s0(t0Var.f26289g, i11);
        t0Var.f26286d = s0Var4;
        t0Var.f26287e = s0Var4;
        t0Var.f26288f = s0Var4;
    }

    public final int l(int i10, int i11, long j3, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.f26334n[i10];
            if (j10 <= j3) {
                if (!z10 || (this.f26333m[i10] & 1) != 0) {
                    if (j10 == j3) {
                        return i13;
                    }
                    i12 = i13;
                }
                i10++;
                if (i10 == this.f26329i) {
                    i10 = 0;
                }
            } else {
                return i12;
            }
        }
        return i12;
    }

    public final long m(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int n10 = n(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f26334n[n10]);
            if ((this.f26333m[n10] & 1) != 0) {
                break;
            }
            n10--;
            if (n10 == -1) {
                n10 = this.f26329i - 1;
            }
        }
        return j3;
    }

    public final int n(int i10) {
        int i11 = this.f26338r + i10;
        int i12 = this.f26329i;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return i11;
    }

    public final synchronized int o(long j3, boolean z10) {
        boolean z11;
        int n10 = n(this.f26339s);
        int i10 = this.f26339s;
        int i11 = this.f26336p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j3 >= this.f26334n[n10]) {
            if (j3 > this.f26341v && z10) {
                return i11 - i10;
            }
            int l10 = l(n10, i11 - i10, j3, true);
            if (l10 == -1) {
                return 0;
            }
            return l10;
        }
        return 0;
    }

    public final synchronized boolean p(boolean z10) {
        boolean z11;
        s7.r0 r0Var;
        int i10 = this.f26339s;
        boolean z12 = true;
        if (i10 != this.f26336p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f26342w && ((r0Var = this.B) == null || r0Var == this.f26327g)) {
                z12 = false;
            }
            return z12;
        }
        if (((w0) this.f26323c.i(this.f26337q + i10)).a != this.f26327g) {
            return true;
        }
        return q(n(this.f26339s));
    }

    public final boolean q(int i10) {
        x7.n nVar = this.f26328h;
        if (nVar != null && nVar.getState() != 4 && ((this.f26333m[i10] & 1073741824) != 0 || !this.f26328h.b())) {
            return false;
        }
        return true;
    }

    public final void r(s7.r0 r0Var, r4.c cVar) {
        boolean z10;
        x7.l lVar;
        s7.r0 r0Var2;
        s7.r0 r0Var3 = this.f26327g;
        if (r0Var3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lVar = null;
        } else {
            lVar = r0Var3.f24726q;
        }
        this.f26327g = r0Var;
        x7.l lVar2 = r0Var.f24726q;
        x7.u uVar = this.f26324d;
        if (uVar != null) {
            int d10 = uVar.d(r0Var);
            s7.q0 a = r0Var.a();
            a.F = d10;
            r0Var2 = a.a();
        } else {
            r0Var2 = r0Var;
        }
        cVar.f24000d = r0Var2;
        cVar.f23999c = this.f26328h;
        if (uVar == null) {
            return;
        }
        if (!z10 && n9.h0.a(lVar, lVar2)) {
            return;
        }
        x7.n nVar = this.f26328h;
        x7.q qVar = this.f26325e;
        x7.n a10 = uVar.a(qVar, r0Var);
        this.f26328h = a10;
        cVar.f23999c = a10;
        if (nVar != null) {
            nVar.e(qVar);
        }
    }

    public final int s(r4.c cVar, w7.i iVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v0 v0Var = this.f26322b;
        synchronized (this) {
            iVar.f26891g = false;
            int i12 = this.f26339s;
            if (i12 != this.f26336p) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                if (!z10 && !this.f26342w) {
                    s7.r0 r0Var = this.B;
                    if (r0Var != null && (z11 || r0Var != this.f26327g)) {
                        r(r0Var, cVar);
                        i11 = -5;
                    } else {
                        i11 = -3;
                    }
                }
                iVar.f26867c = 4;
                i11 = -4;
            } else {
                s7.r0 r0Var2 = ((w0) this.f26323c.i(this.f26337q + i12)).a;
                if (!z11 && r0Var2 == this.f26327g) {
                    int n10 = n(this.f26339s);
                    if (!q(n10)) {
                        iVar.f26891g = true;
                        i11 = -3;
                    } else {
                        iVar.f26867c = this.f26333m[n10];
                        if (this.f26339s == this.f26336p - 1 && (z10 || this.f26342w)) {
                            iVar.a(536870912);
                        }
                        long j3 = this.f26334n[n10];
                        iVar.f26892h = j3;
                        if (j3 < this.f26340t) {
                            iVar.a(Integer.MIN_VALUE);
                        }
                        v0Var.a = this.f26332l[n10];
                        v0Var.f26315b = this.f26331k[n10];
                        v0Var.f26316c = this.f26335o[n10];
                        i11 = -4;
                    }
                }
                r(r0Var2, cVar);
                i11 = -5;
            }
        }
        if (i11 == -4 && !iVar.c(4)) {
            if ((i10 & 1) != 0) {
                z13 = true;
            }
            if ((i10 & 4) == 0) {
                if (z13) {
                    t0 t0Var = this.a;
                    t0.f(t0Var.f26287e, iVar, this.f26322b, t0Var.f26285c);
                } else {
                    t0 t0Var2 = this.a;
                    t0Var2.f26287e = t0.f(t0Var2.f26287e, iVar, this.f26322b, t0Var2.f26285c);
                }
            }
            if (!z13) {
                this.f26339s++;
            }
        }
        return i11;
    }

    public final void t(boolean z10) {
        boolean z11;
        f0.c cVar;
        t0 t0Var = this.a;
        t0Var.a(t0Var.f26286d);
        s0 s0Var = t0Var.f26286d;
        int i10 = 0;
        if (s0Var.f26274c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0.m(z11);
        s0Var.a = 0L;
        s0Var.f26273b = t0Var.f26284b + 0;
        s0 s0Var2 = t0Var.f26286d;
        t0Var.f26287e = s0Var2;
        t0Var.f26288f = s0Var2;
        t0Var.f26289g = 0L;
        t0Var.a.a();
        this.f26336p = 0;
        this.f26337q = 0;
        this.f26338r = 0;
        this.f26339s = 0;
        this.f26343x = true;
        this.f26340t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.f26341v = Long.MIN_VALUE;
        this.f26342w = false;
        while (true) {
            cVar = this.f26323c;
            if (i10 >= ((SparseArray) cVar.f17516c).size()) {
                break;
            }
            ((n9.c) cVar.f17517d).accept(((SparseArray) cVar.f17516c).valueAt(i10));
            i10++;
        }
        cVar.f17515b = -1;
        ((SparseArray) cVar.f17516c).clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f26344y = true;
        }
    }

    public final synchronized boolean u(long j3, boolean z10) {
        boolean z11;
        synchronized (this) {
            this.f26339s = 0;
            t0 t0Var = this.a;
            t0Var.f26287e = t0Var.f26286d;
        }
        int n10 = n(0);
        int i10 = this.f26339s;
        int i11 = this.f26336p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j3 >= this.f26334n[n10] && (j3 <= this.f26341v || z10)) {
            int l10 = l(n10, i11 - i10, j3, true);
            if (l10 == -1) {
                return false;
            }
            this.f26340t = j3;
            this.f26339s += l10;
            return true;
        }
        return false;
    }

    public final synchronized void v(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f26339s + i10 <= this.f26336p) {
                    z10 = true;
                    u0.d(z10);
                    this.f26339s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        u0.d(z10);
        this.f26339s += i10;
    }
}
