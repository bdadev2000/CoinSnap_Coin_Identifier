package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.ro;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public class xi implements ro {
    private boolean A;
    private d9 B;
    private d9 C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;
    private final wi a;

    /* renamed from: d, reason: collision with root package name */
    private final z6 f9022d;

    /* renamed from: e, reason: collision with root package name */
    private final y6.a f9023e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f9024f;

    /* renamed from: g, reason: collision with root package name */
    private d f9025g;

    /* renamed from: h, reason: collision with root package name */
    private d9 f9026h;

    /* renamed from: i, reason: collision with root package name */
    private x6 f9027i;

    /* renamed from: q, reason: collision with root package name */
    private int f9035q;

    /* renamed from: r, reason: collision with root package name */
    private int f9036r;

    /* renamed from: s, reason: collision with root package name */
    private int f9037s;

    /* renamed from: t, reason: collision with root package name */
    private int f9038t;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9041x;

    /* renamed from: b, reason: collision with root package name */
    private final b f9020b = new b();

    /* renamed from: j, reason: collision with root package name */
    private int f9028j = 1000;

    /* renamed from: k, reason: collision with root package name */
    private int[] f9029k = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private long[] f9030l = new long[1000];

    /* renamed from: o, reason: collision with root package name */
    private long[] f9033o = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private int[] f9032n = new int[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f9031m = new int[1000];

    /* renamed from: p, reason: collision with root package name */
    private ro.a[] f9034p = new ro.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final nk f9021c = new nk(new ss(3));
    private long u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f9039v = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    private long f9040w = Long.MIN_VALUE;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9043z = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9042y = true;

    /* loaded from: classes.dex */
    public static final class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public long f9044b;

        /* renamed from: c, reason: collision with root package name */
        public ro.a f9045c;
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final d9 a;

        /* renamed from: b, reason: collision with root package name */
        public final z6.b f9046b;

        private c(d9 d9Var, z6.b bVar) {
            this.a = d9Var;
            this.f9046b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(d9 d9Var);
    }

    public xi(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        this.f9024f = looper;
        this.f9022d = z6Var;
        this.f9023e = aVar;
        this.a = new wi(n0Var);
    }

    private synchronized boolean a(long j3) {
        if (this.f9035q == 0) {
            return j3 > this.f9039v;
        }
        if (d() >= j3) {
            return false;
        }
        b(this.f9036r + b(j3));
        return true;
    }

    private boolean h() {
        return this.f9038t != this.f9035q;
    }

    private void m() {
        x6 x6Var = this.f9027i;
        if (x6Var != null) {
            x6Var.a(this.f9023e);
            this.f9027i = null;
            this.f9026h = null;
        }
    }

    private synchronized void o() {
        this.f9038t = 0;
        this.a.c();
    }

    public final synchronized long c() {
        return this.f9040w;
    }

    public final synchronized long d() {
        return Math.max(this.f9039v, c(this.f9038t));
    }

    public final int e() {
        return this.f9036r + this.f9038t;
    }

    public final synchronized d9 f() {
        return this.f9043z ? null : this.C;
    }

    public final int g() {
        return this.f9036r + this.f9035q;
    }

    public final synchronized boolean i() {
        return this.f9041x;
    }

    public void j() {
        x6 x6Var = this.f9027i;
        if (x6Var != null && x6Var.b() == 1) {
            throw ((x6.a) a1.a(this.f9027i.getError()));
        }
    }

    public void k() {
        b();
        m();
    }

    public void l() {
        b(true);
        m();
    }

    public final void n() {
        b(false);
    }

    private int b(long j3) {
        int i10 = this.f9035q;
        int d10 = d(i10 - 1);
        while (i10 > this.f9038t && this.f9033o[d10] >= j3) {
            i10--;
            d10--;
            if (d10 == -1) {
                d10 = this.f9028j - 1;
            }
        }
        return i10;
    }

    private long c(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int d10 = d(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f9033o[d10]);
            if ((this.f9032n[d10] & 1) != 0) {
                break;
            }
            d10--;
            if (d10 == -1) {
                d10 = this.f9028j - 1;
            }
        }
        return j3;
    }

    private int d(int i10) {
        int i11 = this.f9037s + i10;
        int i12 = this.f9028j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean e(int i10) {
        x6 x6Var = this.f9027i;
        return x6Var == null || x6Var.b() == 4 || ((this.f9032n[i10] & 1073741824) == 0 && this.f9027i.c());
    }

    public final synchronized void f(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f9038t + i10 <= this.f9035q) {
                    z10 = true;
                    a1.a(z10);
                    this.f9038t += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        a1.a(z10);
        this.f9038t += i10;
    }

    private synchronized void a(long j3, int i10, long j10, int i11, ro.a aVar) {
        z6.b bVar;
        int i12 = this.f9035q;
        if (i12 > 0) {
            int d10 = d(i12 - 1);
            a1.a(this.f9030l[d10] + ((long) this.f9031m[d10]) <= j10);
        }
        this.f9041x = (536870912 & i10) != 0;
        this.f9040w = Math.max(this.f9040w, j3);
        int d11 = d(this.f9035q);
        this.f9033o[d11] = j3;
        this.f9030l[d11] = j10;
        this.f9031m[d11] = i11;
        this.f9032n[d11] = i10;
        this.f9034p[d11] = aVar;
        this.f9029k[d11] = this.D;
        if (this.f9021c.c() || !((c) this.f9021c.b()).a.equals(this.C)) {
            z6 z6Var = this.f9022d;
            if (z6Var != null) {
                bVar = z6Var.b((Looper) a1.a(this.f9024f), this.f9023e, this.C);
            } else {
                bVar = z6.b.a;
            }
            this.f9021c.a(g(), new c((d9) a1.a(this.C), bVar));
        }
        int i13 = this.f9035q + 1;
        this.f9035q = i13;
        int i14 = this.f9028j;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            ro.a[] aVarArr = new ro.a[i15];
            int i16 = this.f9037s;
            int i17 = i14 - i16;
            System.arraycopy(this.f9030l, i16, jArr, 0, i17);
            System.arraycopy(this.f9033o, this.f9037s, jArr2, 0, i17);
            System.arraycopy(this.f9032n, this.f9037s, iArr2, 0, i17);
            System.arraycopy(this.f9031m, this.f9037s, iArr3, 0, i17);
            System.arraycopy(this.f9034p, this.f9037s, aVarArr, 0, i17);
            System.arraycopy(this.f9029k, this.f9037s, iArr, 0, i17);
            int i18 = this.f9037s;
            System.arraycopy(this.f9030l, 0, jArr, i17, i18);
            System.arraycopy(this.f9033o, 0, jArr2, i17, i18);
            System.arraycopy(this.f9032n, 0, iArr2, i17, i18);
            System.arraycopy(this.f9031m, 0, iArr3, i17, i18);
            System.arraycopy(this.f9034p, 0, aVarArr, i17, i18);
            System.arraycopy(this.f9029k, 0, iArr, i17, i18);
            this.f9030l = jArr;
            this.f9033o = jArr2;
            this.f9032n = iArr2;
            this.f9031m = iArr3;
            this.f9034p = aVarArr;
            this.f9029k = iArr;
            this.f9037s = 0;
            this.f9028j = i15;
        }
    }

    public final void b(long j3, boolean z10, boolean z11) {
        this.a.a(a(j3, z10, z11));
    }

    public final void c(long j3) {
        this.u = j3;
    }

    private synchronized boolean c(d9 d9Var) {
        this.f9043z = false;
        if (yp.a(d9Var, this.C)) {
            return false;
        }
        if (!this.f9021c.c() && ((c) this.f9021c.b()).a.equals(d9Var)) {
            this.C = ((c) this.f9021c.b()).a;
        } else {
            this.C = d9Var;
        }
        d9 d9Var2 = this.C;
        this.E = df.a(d9Var2.f4228m, d9Var2.f4225j);
        this.F = false;
        return true;
    }

    public final void b() {
        this.a.a(a());
    }

    private long b(int i10) {
        int g10 = g() - i10;
        boolean z10 = false;
        a1.a(g10 >= 0 && g10 <= this.f9035q - this.f9038t);
        int i11 = this.f9035q - g10;
        this.f9035q = i11;
        this.f9040w = Math.max(this.f9039v, c(i11));
        if (g10 == 0 && this.f9041x) {
            z10 = true;
        }
        this.f9041x = z10;
        this.f9021c.a(i10);
        int i12 = this.f9035q;
        if (i12 == 0) {
            return 0L;
        }
        return this.f9030l[d(i12 - 1)] + this.f9031m[r9];
    }

    public d9 b(d9 d9Var) {
        return (this.G == 0 || d9Var.f4232q == Long.MAX_VALUE) ? d9Var : d9Var.a().a(d9Var.f4232q + this.G).a();
    }

    public void b(boolean z10) {
        this.a.b();
        this.f9035q = 0;
        this.f9036r = 0;
        this.f9037s = 0;
        this.f9038t = 0;
        this.f9042y = true;
        this.u = Long.MIN_VALUE;
        this.f9039v = Long.MIN_VALUE;
        this.f9040w = Long.MIN_VALUE;
        this.f9041x = false;
        this.f9021c.a();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f9043z = true;
        }
    }

    public final synchronized boolean b(long j3, boolean z10) {
        o();
        int d10 = d(this.f9038t);
        if (h() && j3 >= this.f9033o[d10] && (j3 <= this.f9040w || z10)) {
            int a10 = a(d10, this.f9035q - this.f9038t, j3, true);
            if (a10 == -1) {
                return false;
            }
            this.u = j3;
            this.f9038t += a10;
            return true;
        }
        return false;
    }

    private synchronized long a(long j3, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f9035q;
        if (i11 != 0) {
            long[] jArr = this.f9033o;
            int i12 = this.f9037s;
            if (j3 >= jArr[i12]) {
                if (z11 && (i10 = this.f9038t) != i11) {
                    i11 = i10 + 1;
                }
                int a10 = a(i12, i11, j3, z10);
                if (a10 == -1) {
                    return -1L;
                }
                return a(a10);
            }
        }
        return -1L;
    }

    private synchronized long a() {
        int i10 = this.f9035q;
        if (i10 == 0) {
            return -1L;
        }
        return a(i10);
    }

    private long a(int i10) {
        this.f9039v = Math.max(this.f9039v, c(i10));
        this.f9035q -= i10;
        int i11 = this.f9036r + i10;
        this.f9036r = i11;
        int i12 = this.f9037s + i10;
        this.f9037s = i12;
        int i13 = this.f9028j;
        if (i12 >= i13) {
            this.f9037s = i12 - i13;
        }
        int i14 = this.f9038t - i10;
        this.f9038t = i14;
        if (i14 < 0) {
            this.f9038t = 0;
        }
        this.f9021c.b(i11);
        if (this.f9035q == 0) {
            int i15 = this.f9037s;
            if (i15 == 0) {
                i15 = this.f9028j;
            }
            return this.f9030l[i15 - 1] + this.f9031m[r6];
        }
        return this.f9030l[this.f9037s];
    }

    private int a(int i10, int i11, long j3, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.f9033o[i10];
            if (j10 > j3) {
                break;
            }
            if (!z10 || (this.f9032n[i10] & 1) != 0) {
                i12 = i13;
                if (j10 == j3) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f9028j) {
                i10 = 0;
            }
        }
        return i12;
    }

    @Override // com.applovin.impl.ro
    public final void a(d9 d9Var) {
        d9 b3 = b(d9Var);
        this.A = false;
        this.B = d9Var;
        boolean c10 = c(b3);
        d dVar = this.f9025g;
        if (dVar == null || !c10) {
            return;
        }
        dVar.a(b3);
    }

    public final synchronized int a(long j3, boolean z10) {
        int d10 = d(this.f9038t);
        if (h() && j3 >= this.f9033o[d10]) {
            if (j3 > this.f9040w && z10) {
                return this.f9035q - this.f9038t;
            }
            int a10 = a(d10, this.f9035q - this.f9038t, j3, true);
            if (a10 == -1) {
                return 0;
            }
            return a10;
        }
        return 0;
    }

    public synchronized boolean a(boolean z10) {
        d9 d9Var;
        boolean z11 = true;
        if (!h()) {
            if (!z10 && !this.f9041x && ((d9Var = this.C) == null || d9Var == this.f9026h)) {
                z11 = false;
            }
            return z11;
        }
        if (((c) this.f9021c.c(e())).a != this.f9026h) {
            return true;
        }
        return e(d(this.f9038t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
        cVar.f9046b.a();
    }

    private void a(d9 d9Var, e9 e9Var) {
        d9 d9Var2 = this.f9026h;
        boolean z10 = d9Var2 == null;
        w6 w6Var = z10 ? null : d9Var2.f4231p;
        this.f9026h = d9Var;
        w6 w6Var2 = d9Var.f4231p;
        z6 z6Var = this.f9022d;
        e9Var.f4413b = z6Var != null ? d9Var.a(z6Var.a(d9Var)) : d9Var;
        e9Var.a = this.f9027i;
        if (this.f9022d == null) {
            return;
        }
        if (z10 || !yp.a(w6Var, w6Var2)) {
            x6 x6Var = this.f9027i;
            x6 a10 = this.f9022d.a((Looper) a1.a(this.f9024f), this.f9023e, d9Var);
            this.f9027i = a10;
            e9Var.a = a10;
            if (x6Var != null) {
                x6Var.a(this.f9023e);
            }
        }
    }

    private synchronized int a(e9 e9Var, n5 n5Var, boolean z10, boolean z11, b bVar) {
        n5Var.f6352d = false;
        if (!h()) {
            if (!z11 && !this.f9041x) {
                d9 d9Var = this.C;
                if (d9Var == null || (!z10 && d9Var == this.f9026h)) {
                    return -3;
                }
                a((d9) a1.a(d9Var), e9Var);
                return -5;
            }
            n5Var.e(4);
            return -4;
        }
        d9 d9Var2 = ((c) this.f9021c.c(e())).a;
        if (!z10 && d9Var2 == this.f9026h) {
            int d10 = d(this.f9038t);
            if (!e(d10)) {
                n5Var.f6352d = true;
                return -3;
            }
            n5Var.e(this.f9032n[d10]);
            long j3 = this.f9033o[d10];
            n5Var.f6353f = j3;
            if (j3 < this.u) {
                n5Var.b(Integer.MIN_VALUE);
            }
            bVar.a = this.f9031m[d10];
            bVar.f9044b = this.f9030l[d10];
            bVar.f9045c = this.f9034p[d10];
            return -4;
        }
        a(d9Var2, e9Var);
        return -5;
    }

    public int a(e9 e9Var, n5 n5Var, int i10, boolean z10) {
        int a10 = a(e9Var, n5Var, (i10 & 2) != 0, z10, this.f9020b);
        if (a10 == -4 && !n5Var.e()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.a.a(n5Var, this.f9020b);
                } else {
                    this.a.b(n5Var, this.f9020b);
                }
            }
            if (!z11) {
                this.f9038t++;
            }
        }
        return a10;
    }

    @Override // com.applovin.impl.ro
    public final int a(e5 e5Var, int i10, boolean z10, int i11) {
        return this.a.a(e5Var, i10, z10);
    }

    @Override // com.applovin.impl.ro
    public final void a(yg ygVar, int i10, int i11) {
        this.a.a(ygVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // com.applovin.impl.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r12, int r14, int r15, int r16, com.applovin.impl.ro.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            com.applovin.impl.d9 r0 = r8.B
            java.lang.Object r0 = com.applovin.impl.a1.b(r0)
            com.applovin.impl.d9 r0 = (com.applovin.impl.d9) r0
            r11.a(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f9042y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f9042y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L51
            long r6 = r8.u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L51
            boolean r0 = r8.F
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.<init>(r6)
            com.applovin.impl.d9 r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.impl.kc.d(r6, r0)
            r8.F = r2
        L4d:
            r0 = r14 | 1
            r6 = r0
            goto L52
        L51:
            r6 = r14
        L52:
            boolean r0 = r8.H
            if (r0 == 0) goto L63
            if (r3 == 0) goto L62
            boolean r0 = r11.a(r4)
            if (r0 != 0) goto L5f
            goto L62
        L5f:
            r8.H = r1
            goto L63
        L62:
            return
        L63:
            com.applovin.impl.wi r0 = r8.a
            long r0 = r0.a()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long, int, int, int, com.applovin.impl.ro$a):void");
    }

    public final void a(d dVar) {
        this.f9025g = dVar;
    }

    public static xi a(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        return new xi(n0Var, (Looper) a1.a(looper), (z6) a1.a(z6Var), (y6.a) a1.a(aVar));
    }
}
