package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.ro;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public class xi implements ro {

    /* renamed from: A */
    private boolean f12233A;

    /* renamed from: B */
    private d9 f12234B;

    /* renamed from: C */
    private d9 f12235C;

    /* renamed from: D */
    private int f12236D;

    /* renamed from: E */
    private boolean f12237E;

    /* renamed from: F */
    private boolean f12238F;

    /* renamed from: G */
    private long f12239G;

    /* renamed from: H */
    private boolean f12240H;

    /* renamed from: a */
    private final wi f12241a;

    /* renamed from: d */
    private final z6 f12243d;

    /* renamed from: e */
    private final y6.a f12244e;

    /* renamed from: f */
    private final Looper f12245f;

    /* renamed from: g */
    private d f12246g;

    /* renamed from: h */
    private d9 f12247h;

    /* renamed from: i */
    private x6 f12248i;

    /* renamed from: q */
    private int f12254q;

    /* renamed from: r */
    private int f12255r;

    /* renamed from: s */
    private int f12256s;

    /* renamed from: t */
    private int f12257t;

    /* renamed from: x */
    private boolean f12261x;
    private final b b = new b();

    /* renamed from: j */
    private int f12249j = 1000;

    /* renamed from: k */
    private int[] f12250k = new int[1000];
    private long[] l = new long[1000];

    /* renamed from: o */
    private long[] f12252o = new long[1000];

    /* renamed from: n */
    private int[] f12251n = new int[1000];
    private int[] m = new int[1000];

    /* renamed from: p */
    private ro.a[] f12253p = new ro.a[1000];

    /* renamed from: c */
    private final nk f12242c = new nk(new I(4));

    /* renamed from: u */
    private long f12258u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f12259v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f12260w = Long.MIN_VALUE;

    /* renamed from: z */
    private boolean f12263z = true;

    /* renamed from: y */
    private boolean f12262y = true;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f12264a;
        public long b;

        /* renamed from: c */
        public ro.a f12265c;
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(d9 d9Var);
    }

    public xi(InterfaceC0727n0 interfaceC0727n0, Looper looper, z6 z6Var, y6.a aVar) {
        this.f12245f = looper;
        this.f12243d = z6Var;
        this.f12244e = aVar;
        this.f12241a = new wi(interfaceC0727n0);
    }

    private synchronized boolean a(long j7) {
        if (this.f12254q == 0) {
            return j7 > this.f12259v;
        }
        if (d() >= j7) {
            return false;
        }
        b(this.f12255r + b(j7));
        return true;
    }

    private boolean h() {
        if (this.f12257t != this.f12254q) {
            return true;
        }
        return false;
    }

    private void m() {
        x6 x6Var = this.f12248i;
        if (x6Var != null) {
            x6Var.a(this.f12244e);
            this.f12248i = null;
            this.f12247h = null;
        }
    }

    private synchronized void o() {
        this.f12257t = 0;
        this.f12241a.c();
    }

    public final synchronized long c() {
        return this.f12260w;
    }

    public final synchronized long d() {
        return Math.max(this.f12259v, c(this.f12257t));
    }

    public final int e() {
        return this.f12255r + this.f12257t;
    }

    public final synchronized d9 f() {
        return this.f12263z ? null : this.f12235C;
    }

    public final int g() {
        return this.f12255r + this.f12254q;
    }

    public final synchronized boolean i() {
        return this.f12261x;
    }

    public void j() {
        x6 x6Var = this.f12248i;
        if (x6Var != null && x6Var.b() == 1) {
            throw ((x6.a) AbstractC0669a1.a(this.f12248i.getError()));
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

    private int b(long j7) {
        int i9 = this.f12254q;
        int d2 = d(i9 - 1);
        while (i9 > this.f12257t && this.f12252o[d2] >= j7) {
            i9--;
            d2--;
            if (d2 == -1) {
                d2 = this.f12249j - 1;
            }
        }
        return i9;
    }

    private long c(int i9) {
        long j7 = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int d2 = d(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
            j7 = Math.max(j7, this.f12252o[d2]);
            if ((this.f12251n[d2] & 1) != 0) {
                break;
            }
            d2--;
            if (d2 == -1) {
                d2 = this.f12249j - 1;
            }
        }
        return j7;
    }

    private int d(int i9) {
        int i10 = this.f12256s + i9;
        int i11 = this.f12249j;
        return i10 < i11 ? i10 : i10 - i11;
    }

    private boolean e(int i9) {
        x6 x6Var = this.f12248i;
        return x6Var == null || x6Var.b() == 4 || ((this.f12251n[i9] & 1073741824) == 0 && this.f12248i.c());
    }

    public final synchronized void f(int i9) {
        boolean z8;
        if (i9 >= 0) {
            try {
                if (this.f12257t + i9 <= this.f12254q) {
                    z8 = true;
                    AbstractC0669a1.a(z8);
                    this.f12257t += i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z8 = false;
        AbstractC0669a1.a(z8);
        this.f12257t += i9;
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final d9 f12266a;
        public final z6.b b;

        private c(d9 d9Var, z6.b bVar) {
            this.f12266a = d9Var;
            this.b = bVar;
        }

        public /* synthetic */ c(d9 d9Var, z6.b bVar, a aVar) {
            this(d9Var, bVar);
        }
    }

    private synchronized void a(long j7, int i9, long j9, int i10, ro.a aVar) {
        z6.b bVar;
        try {
            int i11 = this.f12254q;
            if (i11 > 0) {
                int d2 = d(i11 - 1);
                AbstractC0669a1.a(this.l[d2] + ((long) this.m[d2]) <= j9);
            }
            this.f12261x = (536870912 & i9) != 0;
            this.f12260w = Math.max(this.f12260w, j7);
            int d9 = d(this.f12254q);
            this.f12252o[d9] = j7;
            this.l[d9] = j9;
            this.m[d9] = i10;
            this.f12251n[d9] = i9;
            this.f12253p[d9] = aVar;
            this.f12250k[d9] = this.f12236D;
            if (this.f12242c.c() || !((c) this.f12242c.b()).f12266a.equals(this.f12235C)) {
                z6 z6Var = this.f12243d;
                if (z6Var != null) {
                    bVar = z6Var.b((Looper) AbstractC0669a1.a(this.f12245f), this.f12244e, this.f12235C);
                } else {
                    bVar = z6.b.f12540a;
                }
                this.f12242c.a(g(), new c((d9) AbstractC0669a1.a(this.f12235C), bVar));
            }
            int i12 = this.f12254q + 1;
            this.f12254q = i12;
            int i13 = this.f12249j;
            if (i12 == i13) {
                int i14 = i13 + 1000;
                int[] iArr = new int[i14];
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                int[] iArr2 = new int[i14];
                int[] iArr3 = new int[i14];
                ro.a[] aVarArr = new ro.a[i14];
                int i15 = this.f12256s;
                int i16 = i13 - i15;
                System.arraycopy(this.l, i15, jArr, 0, i16);
                System.arraycopy(this.f12252o, this.f12256s, jArr2, 0, i16);
                System.arraycopy(this.f12251n, this.f12256s, iArr2, 0, i16);
                System.arraycopy(this.m, this.f12256s, iArr3, 0, i16);
                System.arraycopy(this.f12253p, this.f12256s, aVarArr, 0, i16);
                System.arraycopy(this.f12250k, this.f12256s, iArr, 0, i16);
                int i17 = this.f12256s;
                System.arraycopy(this.l, 0, jArr, i16, i17);
                System.arraycopy(this.f12252o, 0, jArr2, i16, i17);
                System.arraycopy(this.f12251n, 0, iArr2, i16, i17);
                System.arraycopy(this.m, 0, iArr3, i16, i17);
                System.arraycopy(this.f12253p, 0, aVarArr, i16, i17);
                System.arraycopy(this.f12250k, 0, iArr, i16, i17);
                this.l = jArr;
                this.f12252o = jArr2;
                this.f12251n = iArr2;
                this.m = iArr3;
                this.f12253p = aVarArr;
                this.f12250k = iArr;
                this.f12256s = 0;
                this.f12249j = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(long j7, boolean z8, boolean z9) {
        this.f12241a.a(a(j7, z8, z9));
    }

    public final void c(long j7) {
        this.f12258u = j7;
    }

    private synchronized boolean c(d9 d9Var) {
        try {
            this.f12263z = false;
            if (yp.a(d9Var, this.f12235C)) {
                return false;
            }
            if (!this.f12242c.c() && ((c) this.f12242c.b()).f12266a.equals(d9Var)) {
                this.f12235C = ((c) this.f12242c.b()).f12266a;
            } else {
                this.f12235C = d9Var;
            }
            d9 d9Var2 = this.f12235C;
            this.f12237E = df.a(d9Var2.m, d9Var2.f7209j);
            this.f12238F = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.f12241a.a(a());
    }

    private long b(int i9) {
        int g9 = g() - i9;
        boolean z8 = false;
        AbstractC0669a1.a(g9 >= 0 && g9 <= this.f12254q - this.f12257t);
        int i10 = this.f12254q - g9;
        this.f12254q = i10;
        this.f12260w = Math.max(this.f12259v, c(i10));
        if (g9 == 0 && this.f12261x) {
            z8 = true;
        }
        this.f12261x = z8;
        this.f12242c.a(i9);
        int i11 = this.f12254q;
        if (i11 == 0) {
            return 0L;
        }
        return this.l[d(i11 - 1)] + this.m[r9];
    }

    public d9 b(d9 d9Var) {
        return (this.f12239G == 0 || d9Var.f7214q == Long.MAX_VALUE) ? d9Var : d9Var.a().a(d9Var.f7214q + this.f12239G).a();
    }

    public void b(boolean z8) {
        this.f12241a.b();
        this.f12254q = 0;
        this.f12255r = 0;
        this.f12256s = 0;
        this.f12257t = 0;
        this.f12262y = true;
        this.f12258u = Long.MIN_VALUE;
        this.f12259v = Long.MIN_VALUE;
        this.f12260w = Long.MIN_VALUE;
        this.f12261x = false;
        this.f12242c.a();
        if (z8) {
            this.f12234B = null;
            this.f12235C = null;
            this.f12263z = true;
        }
    }

    public final synchronized boolean b(long j7, boolean z8) {
        o();
        int d2 = d(this.f12257t);
        if (h() && j7 >= this.f12252o[d2] && (j7 <= this.f12260w || z8)) {
            int a6 = a(d2, this.f12254q - this.f12257t, j7, true);
            if (a6 == -1) {
                return false;
            }
            this.f12258u = j7;
            this.f12257t += a6;
            return true;
        }
        return false;
    }

    private synchronized long a(long j7, boolean z8, boolean z9) {
        int i9;
        try {
            int i10 = this.f12254q;
            if (i10 != 0) {
                long[] jArr = this.f12252o;
                int i11 = this.f12256s;
                if (j7 >= jArr[i11]) {
                    if (z9 && (i9 = this.f12257t) != i10) {
                        i10 = i9 + 1;
                    }
                    int a6 = a(i11, i10, j7, z8);
                    if (a6 == -1) {
                        return -1L;
                    }
                    return a(a6);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long a() {
        int i9 = this.f12254q;
        if (i9 == 0) {
            return -1L;
        }
        return a(i9);
    }

    private long a(int i9) {
        this.f12259v = Math.max(this.f12259v, c(i9));
        this.f12254q -= i9;
        int i10 = this.f12255r + i9;
        this.f12255r = i10;
        int i11 = this.f12256s + i9;
        this.f12256s = i11;
        int i12 = this.f12249j;
        if (i11 >= i12) {
            this.f12256s = i11 - i12;
        }
        int i13 = this.f12257t - i9;
        this.f12257t = i13;
        if (i13 < 0) {
            this.f12257t = 0;
        }
        this.f12242c.b(i10);
        if (this.f12254q == 0) {
            int i14 = this.f12256s;
            if (i14 == 0) {
                i14 = this.f12249j;
            }
            return this.l[i14 - 1] + this.m[r6];
        }
        return this.l[this.f12256s];
    }

    private int a(int i9, int i10, long j7, boolean z8) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j9 = this.f12252o[i9];
            if (j9 > j7) {
                break;
            }
            if (!z8 || (this.f12251n[i9] & 1) != 0) {
                i11 = i12;
                if (j9 == j7) {
                    break;
                }
            }
            i9++;
            if (i9 == this.f12249j) {
                i9 = 0;
            }
        }
        return i11;
    }

    @Override // com.applovin.impl.ro
    public final void a(d9 d9Var) {
        d9 b8 = b(d9Var);
        this.f12233A = false;
        this.f12234B = d9Var;
        boolean c9 = c(b8);
        d dVar = this.f12246g;
        if (dVar == null || !c9) {
            return;
        }
        dVar.a(b8);
    }

    public final synchronized int a(long j7, boolean z8) {
        int d2 = d(this.f12257t);
        if (h() && j7 >= this.f12252o[d2]) {
            if (j7 > this.f12260w && z8) {
                return this.f12254q - this.f12257t;
            }
            int a6 = a(d2, this.f12254q - this.f12257t, j7, true);
            if (a6 == -1) {
                return 0;
            }
            return a6;
        }
        return 0;
    }

    public synchronized boolean a(boolean z8) {
        d9 d9Var;
        boolean z9 = true;
        if (!h()) {
            if (!z8 && !this.f12261x && ((d9Var = this.f12235C) == null || d9Var == this.f12247h)) {
                z9 = false;
            }
            return z9;
        }
        if (((c) this.f12242c.c(e())).f12266a != this.f12247h) {
            return true;
        }
        return e(d(this.f12257t));
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.b.a();
    }

    private void a(d9 d9Var, e9 e9Var) {
        d9 d9Var2 = this.f12247h;
        boolean z8 = d9Var2 == null;
        w6 w6Var = z8 ? null : d9Var2.f7213p;
        this.f12247h = d9Var;
        w6 w6Var2 = d9Var.f7213p;
        z6 z6Var = this.f12243d;
        e9Var.b = z6Var != null ? d9Var.a(z6Var.a(d9Var)) : d9Var;
        e9Var.f7387a = this.f12248i;
        if (this.f12243d == null) {
            return;
        }
        if (z8 || !yp.a(w6Var, w6Var2)) {
            x6 x6Var = this.f12248i;
            x6 a6 = this.f12243d.a((Looper) AbstractC0669a1.a(this.f12245f), this.f12244e, d9Var);
            this.f12248i = a6;
            e9Var.f7387a = a6;
            if (x6Var != null) {
                x6Var.a(this.f12244e);
            }
        }
    }

    private synchronized int a(e9 e9Var, n5 n5Var, boolean z8, boolean z9, b bVar) {
        try {
            n5Var.f9274d = false;
            if (!h()) {
                if (!z9 && !this.f12261x) {
                    d9 d9Var = this.f12235C;
                    if (d9Var == null || (!z8 && d9Var == this.f12247h)) {
                        return -3;
                    }
                    a((d9) AbstractC0669a1.a(d9Var), e9Var);
                    return -5;
                }
                n5Var.e(4);
                return -4;
            }
            d9 d9Var2 = ((c) this.f12242c.c(e())).f12266a;
            if (!z8 && d9Var2 == this.f12247h) {
                int d2 = d(this.f12257t);
                if (!e(d2)) {
                    n5Var.f9274d = true;
                    return -3;
                }
                n5Var.e(this.f12251n[d2]);
                long j7 = this.f12252o[d2];
                n5Var.f9275f = j7;
                if (j7 < this.f12258u) {
                    n5Var.b(Integer.MIN_VALUE);
                }
                bVar.f12264a = this.m[d2];
                bVar.b = this.l[d2];
                bVar.f12265c = this.f12253p[d2];
                return -4;
            }
            a(d9Var2, e9Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int a(e9 e9Var, n5 n5Var, int i9, boolean z8) {
        int a6 = a(e9Var, n5Var, (i9 & 2) != 0, z8, this.b);
        if (a6 == -4 && !n5Var.e()) {
            boolean z9 = (i9 & 1) != 0;
            if ((i9 & 4) == 0) {
                if (z9) {
                    this.f12241a.a(n5Var, this.b);
                } else {
                    this.f12241a.b(n5Var, this.b);
                }
            }
            if (!z9) {
                this.f12257t++;
            }
        }
        return a6;
    }

    @Override // com.applovin.impl.ro
    public final int a(e5 e5Var, int i9, boolean z8, int i10) {
        return this.f12241a.a(e5Var, i9, z8);
    }

    @Override // com.applovin.impl.ro
    public final void a(yg ygVar, int i9, int i10) {
        this.f12241a.a(ygVar, i9);
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
            boolean r0 = r8.f12233A
            if (r0 == 0) goto L10
            com.applovin.impl.d9 r0 = r8.f12234B
            java.lang.Object r0 = com.applovin.impl.AbstractC0669a1.b(r0)
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
            boolean r4 = r8.f12262y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f12262y = r1
        L22:
            long r4 = r8.f12239G
            long r4 = r4 + r12
            boolean r6 = r8.f12237E
            if (r6 == 0) goto L51
            long r6 = r8.f12258u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L51
            boolean r0 = r8.f12238F
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.<init>(r6)
            com.applovin.impl.d9 r6 = r8.f12235C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.impl.kc.d(r6, r0)
            r8.f12238F = r2
        L4d:
            r0 = r14 | 1
            r6 = r0
            goto L52
        L51:
            r6 = r14
        L52:
            boolean r0 = r8.f12240H
            if (r0 == 0) goto L63
            if (r3 == 0) goto L62
            boolean r0 = r11.a(r4)
            if (r0 != 0) goto L5f
            goto L62
        L5f:
            r8.f12240H = r1
            goto L63
        L62:
            return
        L63:
            com.applovin.impl.wi r0 = r8.f12241a
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
        this.f12246g = dVar;
    }

    public static xi a(InterfaceC0727n0 interfaceC0727n0, Looper looper, z6 z6Var, y6.a aVar) {
        return new xi(interfaceC0727n0, (Looper) AbstractC0669a1.a(looper), (z6) AbstractC0669a1.a(z6Var), (y6.a) AbstractC0669a1.a(aVar));
    }
}
