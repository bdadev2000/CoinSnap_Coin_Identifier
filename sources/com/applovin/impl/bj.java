package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.qo;
import com.applovin.impl.z6;
import com.google.common.primitives.Ints;

/* loaded from: classes3.dex */
public class bj implements qo {
    private boolean A;
    private f9 B;
    private f9 C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a */
    private final aj f23080a;
    private final b7 d;
    private final a7.a e;

    /* renamed from: f */
    private final Looper f23083f;

    /* renamed from: g */
    private d f23084g;

    /* renamed from: h */
    private f9 f23085h;

    /* renamed from: i */
    private z6 f23086i;

    /* renamed from: q */
    private int f23094q;

    /* renamed from: r */
    private int f23095r;

    /* renamed from: s */
    private int f23096s;

    /* renamed from: t */
    private int f23097t;
    private boolean x;

    /* renamed from: b */
    private final b f23081b = new b();

    /* renamed from: j */
    private int f23087j = 1000;

    /* renamed from: k */
    private int[] f23088k = new int[1000];

    /* renamed from: l */
    private long[] f23089l = new long[1000];

    /* renamed from: o */
    private long[] f23092o = new long[1000];

    /* renamed from: n */
    private int[] f23091n = new int[1000];

    /* renamed from: m */
    private int[] f23090m = new int[1000];

    /* renamed from: p */
    private qo.a[] f23093p = new qo.a[1000];

    /* renamed from: c */
    private final qk f23082c = new qk(new rs(0));

    /* renamed from: u */
    private long f23098u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f23099v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;

    /* renamed from: z */
    private boolean f23101z = true;

    /* renamed from: y */
    private boolean f23100y = true;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public int f23102a;

        /* renamed from: b */
        public long f23103b;

        /* renamed from: c */
        public qo.a f23104c;
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public final f9 f23105a;

        /* renamed from: b */
        public final b7.b f23106b;

        private c(f9 f9Var, b7.b bVar) {
            this.f23105a = f9Var;
            this.f23106b = bVar;
        }

        public /* synthetic */ c(f9 f9Var, b7.b bVar, a aVar) {
            this(f9Var, bVar);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(f9 f9Var);
    }

    public bj(n0 n0Var, Looper looper, b7 b7Var, a7.a aVar) {
        this.f23083f = looper;
        this.d = b7Var;
        this.e = aVar;
        this.f23080a = new aj(n0Var);
    }

    private int d(int i2) {
        int i3 = this.f23096s + i2;
        int i4 = this.f23087j;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private boolean h() {
        return this.f23097t != this.f23094q;
    }

    private void m() {
        z6 z6Var = this.f23086i;
        if (z6Var != null) {
            z6Var.a(this.e);
            this.f23086i = null;
            this.f23085h = null;
        }
    }

    private synchronized void o() {
        this.f23097t = 0;
        this.f23080a.c();
    }

    public final void a(d dVar) {
        this.f23084g = dVar;
    }

    public final void c(long j2) {
        this.f23098u = j2;
    }

    public final int e() {
        return this.f23095r + this.f23097t;
    }

    public final synchronized f9 f() {
        return this.f23101z ? null : this.C;
    }

    public final int g() {
        return this.f23095r + this.f23094q;
    }

    public final synchronized boolean i() {
        return this.x;
    }

    public void j() {
        z6 z6Var = this.f23086i;
        if (z6Var != null && z6Var.b() == 1) {
            throw ((z6.a) b1.a(this.f23086i.getError()));
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

    private synchronized boolean a(long j2) {
        if (this.f23094q == 0) {
            return j2 > this.f23099v;
        }
        if (d() >= j2) {
            return false;
        }
        b(this.f23095r + b(j2));
        return true;
    }

    private int b(long j2) {
        int i2 = this.f23094q;
        int d2 = d(i2 - 1);
        while (i2 > this.f23097t && this.f23092o[d2] >= j2) {
            i2--;
            d2--;
            if (d2 == -1) {
                d2 = this.f23087j - 1;
            }
        }
        return i2;
    }

    private boolean e(int i2) {
        z6 z6Var = this.f23086i;
        return z6Var == null || z6Var.b() == 4 || ((this.f23091n[i2] & Ints.MAX_POWER_OF_TWO) == 0 && this.f23086i.c());
    }

    public final synchronized long c() {
        return this.w;
    }

    public final synchronized long d() {
        return Math.max(this.f23099v, c(this.f23097t));
    }

    public final synchronized void f(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                if (this.f23097t + i2 <= this.f23094q) {
                    z2 = true;
                    b1.a(z2);
                    this.f23097t += i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z2 = false;
        b1.a(z2);
        this.f23097t += i2;
    }

    private long c(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int d2 = d(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.f23092o[d2]);
            if ((this.f23091n[d2] & 1) != 0) {
                break;
            }
            d2--;
            if (d2 == -1) {
                d2 = this.f23087j - 1;
            }
        }
        return j2;
    }

    public final void b(long j2, boolean z2, boolean z3) {
        this.f23080a.a(a(j2, z2, z3));
    }

    private synchronized void a(long j2, int i2, long j3, int i3, qo.a aVar) {
        try {
            int i4 = this.f23094q;
            if (i4 > 0) {
                int d2 = d(i4 - 1);
                b1.a(this.f23089l[d2] + ((long) this.f23090m[d2]) <= j3);
            }
            this.x = (536870912 & i2) != 0;
            this.w = Math.max(this.w, j2);
            int d3 = d(this.f23094q);
            this.f23092o[d3] = j2;
            this.f23089l[d3] = j3;
            this.f23090m[d3] = i3;
            this.f23091n[d3] = i2;
            this.f23093p[d3] = aVar;
            this.f23088k[d3] = this.D;
            if (this.f23082c.c() || !((c) this.f23082c.b()).f23105a.equals(this.C)) {
                b7 b7Var = this.d;
                this.f23082c.a(g(), new c((f9) b1.a(this.C), b7Var != null ? b7Var.b((Looper) b1.a(this.f23083f), this.e, this.C) : b7.b.f23028a));
            }
            int i5 = this.f23094q + 1;
            this.f23094q = i5;
            int i6 = this.f23087j;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                int[] iArr = new int[i7];
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                int[] iArr2 = new int[i7];
                int[] iArr3 = new int[i7];
                qo.a[] aVarArr = new qo.a[i7];
                int i8 = this.f23096s;
                int i9 = i6 - i8;
                System.arraycopy(this.f23089l, i8, jArr, 0, i9);
                System.arraycopy(this.f23092o, this.f23096s, jArr2, 0, i9);
                System.arraycopy(this.f23091n, this.f23096s, iArr2, 0, i9);
                System.arraycopy(this.f23090m, this.f23096s, iArr3, 0, i9);
                System.arraycopy(this.f23093p, this.f23096s, aVarArr, 0, i9);
                System.arraycopy(this.f23088k, this.f23096s, iArr, 0, i9);
                int i10 = this.f23096s;
                System.arraycopy(this.f23089l, 0, jArr, i9, i10);
                System.arraycopy(this.f23092o, 0, jArr2, i9, i10);
                System.arraycopy(this.f23091n, 0, iArr2, i9, i10);
                System.arraycopy(this.f23090m, 0, iArr3, i9, i10);
                System.arraycopy(this.f23093p, 0, aVarArr, i9, i10);
                System.arraycopy(this.f23088k, 0, iArr, i9, i10);
                this.f23089l = jArr;
                this.f23092o = jArr2;
                this.f23091n = iArr2;
                this.f23090m = iArr3;
                this.f23093p = aVarArr;
                this.f23088k = iArr;
                this.f23096s = 0;
                this.f23087j = i7;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean c(f9 f9Var) {
        try {
            this.f23101z = false;
            if (xp.a(f9Var, this.C)) {
                return false;
            }
            if (this.f23082c.c() || !((c) this.f23082c.b()).f23105a.equals(f9Var)) {
                this.C = f9Var;
            } else {
                this.C = ((c) this.f23082c.b()).f23105a;
            }
            f9 f9Var2 = this.C;
            this.E = Cif.a(f9Var2.f23840m, f9Var2.f23837j);
            this.F = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.f23080a.a(a());
    }

    private long b(int i2) {
        int g2 = g() - i2;
        boolean z2 = false;
        b1.a(g2 >= 0 && g2 <= this.f23094q - this.f23097t);
        int i3 = this.f23094q - g2;
        this.f23094q = i3;
        this.w = Math.max(this.f23099v, c(i3));
        if (g2 == 0 && this.x) {
            z2 = true;
        }
        this.x = z2;
        this.f23082c.a(i2);
        int i4 = this.f23094q;
        if (i4 == 0) {
            return 0L;
        }
        return this.f23089l[d(i4 - 1)] + this.f23090m[r9];
    }

    public f9 b(f9 f9Var) {
        return (this.G == 0 || f9Var.f23844q == Long.MAX_VALUE) ? f9Var : f9Var.a().a(f9Var.f23844q + this.G).a();
    }

    public void b(boolean z2) {
        this.f23080a.b();
        this.f23094q = 0;
        this.f23095r = 0;
        this.f23096s = 0;
        this.f23097t = 0;
        this.f23100y = true;
        this.f23098u = Long.MIN_VALUE;
        this.f23099v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.f23082c.a();
        if (z2) {
            this.B = null;
            this.C = null;
            this.f23101z = true;
        }
    }

    public final synchronized boolean b(long j2, boolean z2) {
        o();
        int d2 = d(this.f23097t);
        if (h() && j2 >= this.f23092o[d2] && (j2 <= this.w || z2)) {
            int a2 = a(d2, this.f23094q - this.f23097t, j2, true);
            if (a2 == -1) {
                return false;
            }
            this.f23098u = j2;
            this.f23097t += a2;
            return true;
        }
        return false;
    }

    private synchronized long a(long j2, boolean z2, boolean z3) {
        int i2;
        try {
            int i3 = this.f23094q;
            if (i3 != 0) {
                long[] jArr = this.f23092o;
                int i4 = this.f23096s;
                if (j2 >= jArr[i4]) {
                    if (z3 && (i2 = this.f23097t) != i3) {
                        i3 = i2 + 1;
                    }
                    int a2 = a(i4, i3, j2, z2);
                    if (a2 == -1) {
                        return -1L;
                    }
                    return a(a2);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long a() {
        int i2 = this.f23094q;
        if (i2 == 0) {
            return -1L;
        }
        return a(i2);
    }

    private long a(int i2) {
        this.f23099v = Math.max(this.f23099v, c(i2));
        this.f23094q -= i2;
        int i3 = this.f23095r + i2;
        this.f23095r = i3;
        int i4 = this.f23096s + i2;
        this.f23096s = i4;
        int i5 = this.f23087j;
        if (i4 >= i5) {
            this.f23096s = i4 - i5;
        }
        int i6 = this.f23097t - i2;
        this.f23097t = i6;
        if (i6 < 0) {
            this.f23097t = 0;
        }
        this.f23082c.b(i3);
        if (this.f23094q == 0) {
            int i7 = this.f23096s;
            if (i7 == 0) {
                i7 = this.f23087j;
            }
            return this.f23089l[i7 - 1] + this.f23090m[r6];
        }
        return this.f23089l[this.f23096s];
    }

    private int a(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.f23092o[i2];
            if (j3 > j2) {
                break;
            }
            if (!z2 || (this.f23091n[i2] & 1) != 0) {
                i4 = i5;
                if (j3 == j2) {
                    break;
                }
            }
            i2++;
            if (i2 == this.f23087j) {
                i2 = 0;
            }
        }
        return i4;
    }

    @Override // com.applovin.impl.qo
    public final void a(f9 f9Var) {
        f9 b2 = b(f9Var);
        this.A = false;
        this.B = f9Var;
        boolean c2 = c(b2);
        d dVar = this.f23084g;
        if (dVar == null || !c2) {
            return;
        }
        dVar.a(b2);
    }

    public final synchronized int a(long j2, boolean z2) {
        int d2 = d(this.f23097t);
        if (h() && j2 >= this.f23092o[d2]) {
            if (j2 > this.w && z2) {
                return this.f23094q - this.f23097t;
            }
            int a2 = a(d2, this.f23094q - this.f23097t, j2, true);
            if (a2 == -1) {
                return 0;
            }
            return a2;
        }
        return 0;
    }

    public synchronized boolean a(boolean z2) {
        f9 f9Var;
        boolean z3 = true;
        if (h()) {
            if (((c) this.f23082c.c(e())).f23105a != this.f23085h) {
                return true;
            }
            return e(d(this.f23097t));
        }
        if (!z2 && !this.x && ((f9Var = this.C) == null || f9Var == this.f23085h)) {
            z3 = false;
        }
        return z3;
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.f23106b.a();
    }

    private void a(f9 f9Var, g9 g9Var) {
        f9 f9Var2 = this.f23085h;
        boolean z2 = f9Var2 == null;
        y6 y6Var = z2 ? null : f9Var2.f23843p;
        this.f23085h = f9Var;
        y6 y6Var2 = f9Var.f23843p;
        b7 b7Var = this.d;
        g9Var.f24058b = b7Var != null ? f9Var.a(b7Var.a(f9Var)) : f9Var;
        g9Var.f24057a = this.f23086i;
        if (this.d == null) {
            return;
        }
        if (z2 || !xp.a(y6Var, y6Var2)) {
            z6 z6Var = this.f23086i;
            z6 a2 = this.d.a((Looper) b1.a(this.f23083f), this.e, f9Var);
            this.f23086i = a2;
            g9Var.f24057a = a2;
            if (z6Var != null) {
                z6Var.a(this.e);
            }
        }
    }

    private synchronized int a(g9 g9Var, p5 p5Var, boolean z2, boolean z3, b bVar) {
        try {
            p5Var.d = false;
            if (!h()) {
                if (!z3 && !this.x) {
                    f9 f9Var = this.C;
                    if (f9Var == null || (!z2 && f9Var == this.f23085h)) {
                        return -3;
                    }
                    a((f9) b1.a(f9Var), g9Var);
                    return -5;
                }
                p5Var.e(4);
                return -4;
            }
            f9 f9Var2 = ((c) this.f23082c.c(e())).f23105a;
            if (!z2 && f9Var2 == this.f23085h) {
                int d2 = d(this.f23097t);
                if (!e(d2)) {
                    p5Var.d = true;
                    return -3;
                }
                p5Var.e(this.f23091n[d2]);
                long j2 = this.f23092o[d2];
                p5Var.f25964f = j2;
                if (j2 < this.f23098u) {
                    p5Var.b(Integer.MIN_VALUE);
                }
                bVar.f23102a = this.f23090m[d2];
                bVar.f23103b = this.f23089l[d2];
                bVar.f23104c = this.f23093p[d2];
                return -4;
            }
            a(f9Var2, g9Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int a(g9 g9Var, p5 p5Var, int i2, boolean z2) {
        int a2 = a(g9Var, p5Var, (i2 & 2) != 0, z2, this.f23081b);
        if (a2 == -4 && !p5Var.e()) {
            boolean z3 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                if (z3) {
                    this.f23080a.a(p5Var, this.f23081b);
                } else {
                    this.f23080a.b(p5Var, this.f23081b);
                }
            }
            if (!z3) {
                this.f23097t++;
            }
        }
        return a2;
    }

    @Override // com.applovin.impl.qo
    public final int a(g5 g5Var, int i2, boolean z2, int i3) {
        return this.f23080a.a(g5Var, i2, z2);
    }

    @Override // com.applovin.impl.qo
    public final void a(bh bhVar, int i2, int i3) {
        this.f23080a.a(bhVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // com.applovin.impl.qo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r12, int r14, int r15, int r16, com.applovin.impl.qo.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            com.applovin.impl.f9 r0 = r8.B
            java.lang.Object r0 = com.applovin.impl.b1.b(r0)
            com.applovin.impl.f9 r0 = (com.applovin.impl.f9) r0
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
            boolean r4 = r8.f23100y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f23100y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L51
            long r6 = r8.f23098u
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
            com.applovin.impl.f9 r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.impl.pc.d(r6, r0)
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
            com.applovin.impl.aj r0 = r8.f23080a
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.bj.a(long, int, int, int, com.applovin.impl.qo$a):void");
    }

    public static bj a(n0 n0Var, Looper looper, b7 b7Var, a7.a aVar) {
        return new bj(n0Var, (Looper) b1.a(looper), (b7) b1.a(b7Var), (a7.a) b1.a(aVar));
    }
}
