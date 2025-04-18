package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.hj;
import com.applovin.impl.of;
import com.applovin.impl.ta;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class jf implements i8 {
    public static final m8 u = new ht(7);

    /* renamed from: v */
    private static final ta.a f5487v = new ss(19);
    private final int a;

    /* renamed from: b */
    private final long f5488b;

    /* renamed from: c */
    private final yg f5489c;

    /* renamed from: d */
    private final of.a f5490d;

    /* renamed from: e */
    private final x9 f5491e;

    /* renamed from: f */
    private final va f5492f;

    /* renamed from: g */
    private final ro f5493g;

    /* renamed from: h */
    private k8 f5494h;

    /* renamed from: i */
    private ro f5495i;

    /* renamed from: j */
    private ro f5496j;

    /* renamed from: k */
    private int f5497k;

    /* renamed from: l */
    private we f5498l;

    /* renamed from: m */
    private long f5499m;

    /* renamed from: n */
    private long f5500n;

    /* renamed from: o */
    private long f5501o;

    /* renamed from: p */
    private int f5502p;

    /* renamed from: q */
    private hj f5503q;

    /* renamed from: r */
    private boolean f5504r;

    /* renamed from: s */
    private boolean f5505s;

    /* renamed from: t */
    private long f5506t;

    public jf() {
        this(0);
    }

    private void b() {
        a1.b(this.f5495i);
        yp.a(this.f5494h);
    }

    private boolean d(j8 j8Var) {
        hj hjVar = this.f5503q;
        if (hjVar != null) {
            long c10 = hjVar.c();
            if (c10 != -1 && j8Var.d() > c10 - 4) {
                return true;
            }
        }
        try {
            return !j8Var.b(this.f5489c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public static /* synthetic */ i8[] e() {
        return d();
    }

    public static /* synthetic */ boolean f(int i10, int i11, int i12, int i13, int i14) {
        return a(i10, i11, i12, i13, i14);
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public void c() {
        this.f5504r = true;
    }

    public jf(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private hj c(j8 j8Var) {
        int i10;
        yg ygVar = new yg(this.f5490d.f6586c);
        j8Var.c(ygVar.c(), 0, this.f5490d.f6586c);
        of.a aVar = this.f5490d;
        if ((aVar.a & 1) != 0) {
            if (aVar.f6588e != 1) {
                i10 = 36;
            }
            i10 = 21;
        } else {
            if (aVar.f6588e == 1) {
                i10 = 13;
            }
            i10 = 21;
        }
        int i11 = i10;
        int a = a(ygVar, i11);
        if (a != 1483304551 && a != 1231971951) {
            if (a == 1447187017) {
                qq a10 = qq.a(j8Var.a(), j8Var.f(), this.f5490d, ygVar);
                j8Var.a(this.f5490d.f6586c);
                return a10;
            }
            j8Var.b();
            return null;
        }
        es a11 = es.a(j8Var.a(), j8Var.f(), this.f5490d, ygVar);
        if (a11 != null && !this.f5491e.a()) {
            j8Var.b();
            j8Var.c(i11 + 141);
            j8Var.c(this.f5489c.c(), 0, 3);
            this.f5489c.f(0);
            this.f5491e.a(this.f5489c.z());
        }
        j8Var.a(this.f5490d.f6586c);
        return (a11 == null || a11.b() || a != 1231971951) ? a11 : a(j8Var, false);
    }

    private int e(j8 j8Var) {
        if (this.f5497k == 0) {
            try {
                b(j8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f5503q == null) {
            hj b3 = b(j8Var);
            this.f5503q = b3;
            this.f5494h.a(b3);
            this.f5496j.a(new d9.b().f(this.f5490d.f6585b).i(4096).c(this.f5490d.f6588e).n(this.f5490d.f6587d).e(this.f5491e.a).f(this.f5491e.f8961b).a((this.a & 8) != 0 ? null : this.f5498l).a());
            this.f5501o = j8Var.f();
        } else if (this.f5501o != 0) {
            long f10 = j8Var.f();
            long j3 = this.f5501o;
            if (f10 < j3) {
                j8Var.a((int) (j3 - f10));
            }
        }
        return f(j8Var);
    }

    private int f(j8 j8Var) {
        if (this.f5502p == 0) {
            j8Var.b();
            if (d(j8Var)) {
                return -1;
            }
            this.f5489c.f(0);
            int j3 = this.f5489c.j();
            if (a(j3, this.f5497k) && of.b(j3) != -1) {
                this.f5490d.a(j3);
                if (this.f5499m == C.TIME_UNSET) {
                    this.f5499m = this.f5503q.a(j8Var.f());
                    if (this.f5488b != C.TIME_UNSET) {
                        this.f5499m = (this.f5488b - this.f5503q.a(0L)) + this.f5499m;
                    }
                }
                this.f5502p = this.f5490d.f6586c;
                hj hjVar = this.f5503q;
                if (hjVar instanceof jb) {
                    jb jbVar = (jb) hjVar;
                    jbVar.a(a(this.f5500n + r0.f6590g), j8Var.f() + this.f5490d.f6586c);
                    if (this.f5505s && jbVar.c(this.f5506t)) {
                        this.f5505s = false;
                        this.f5496j = this.f5495i;
                    }
                }
            } else {
                j8Var.a(1);
                this.f5497k = 0;
                return 0;
            }
        }
        int a = this.f5496j.a((e5) j8Var, this.f5502p, true);
        if (a == -1) {
            return -1;
        }
        int i10 = this.f5502p - a;
        this.f5502p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f5496j.a(a(this.f5500n), 1, this.f5490d.f6586c, 0, null);
        this.f5500n += this.f5490d.f6590g;
        this.f5502p = 0;
        return 0;
    }

    public jf(int i10, long j3) {
        this.a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5488b = j3;
        this.f5489c = new yg(10);
        this.f5490d = new of.a();
        this.f5491e = new x9();
        this.f5499m = C.TIME_UNSET;
        this.f5492f = new va();
        g7 g7Var = new g7();
        this.f5493g = g7Var;
        this.f5496j = g7Var;
    }

    private static boolean a(int i10, long j3) {
        return ((long) (i10 & (-128000))) == (j3 & (-128000));
    }

    private hj b(j8 j8Var) {
        long a;
        long j3;
        hj c10 = c(j8Var);
        ff a10 = a(this.f5498l, j8Var.f());
        if (this.f5504r) {
            return new hj.a();
        }
        if ((this.a & 4) != 0) {
            if (a10 != null) {
                a = a10.d();
                j3 = a10.c();
            } else if (c10 != null) {
                a = c10.d();
                j3 = c10.c();
            } else {
                a = a(this.f5498l);
                j3 = -1;
            }
            c10 = new jb(a, j8Var.f(), j3);
        } else if (a10 != null) {
            c10 = a10;
        } else if (c10 == null) {
            c10 = null;
        }
        if (c10 == null || !(c10.b() || (this.a & 1) == 0)) {
            return a(j8Var, (this.a & 2) != 0);
        }
        return c10;
    }

    private long a(long j3) {
        return ((j3 * 1000000) / this.f5490d.f6587d) + this.f5499m;
    }

    private hj a(j8 j8Var, boolean z10) {
        j8Var.c(this.f5489c.c(), 0, 4);
        this.f5489c.f(0);
        this.f5490d.a(this.f5489c.j());
        return new o4(j8Var.a(), j8Var.f(), this.f5490d, z10);
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new jf()};
    }

    private static long a(we weVar) {
        if (weVar == null) {
            return C.TIME_UNSET;
        }
        int c10 = weVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            we.b a = weVar.a(i10);
            if (a instanceof ao) {
                ao aoVar = (ao) a;
                if (aoVar.a.equals("TLEN")) {
                    return r2.a(Long.parseLong(aoVar.f3779c));
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int a(yg ygVar, int i10) {
        if (ygVar.e() >= i10 + 4) {
            ygVar.f(i10);
            int j3 = ygVar.j();
            if (j3 == 1483304551 || j3 == 1231971951) {
                return j3;
            }
        }
        if (ygVar.e() < 40) {
            return 0;
        }
        ygVar.f(36);
        return ygVar.j() == 1447187017 ? 1447187017 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r13 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r12.a(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r11.f5497k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
    
        r12.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(com.applovin.impl.j8 r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.b()
            long r1 = r12.f()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3c
            int r1 = r11.a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            com.applovin.impl.ta$a r1 = com.applovin.impl.jf.f5487v
        L21:
            com.applovin.impl.va r4 = r11.f5492f
            com.applovin.impl.we r1 = r4.a(r12, r1)
            r11.f5498l = r1
            if (r1 == 0) goto L30
            com.applovin.impl.x9 r4 = r11.f5491e
            r4.a(r1)
        L30:
            long r4 = r12.d()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.a(r1)
        L3a:
            r4 = r3
            goto L3e
        L3c:
            r1 = r3
            r4 = r1
        L3e:
            r5 = r4
            r6 = r5
        L40:
            boolean r7 = r11.d(r12)
            r8 = 1
            if (r7 == 0) goto L50
            if (r5 <= 0) goto L4a
            goto L99
        L4a:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L50:
            com.applovin.impl.yg r7 = r11.f5489c
            r7.f(r3)
            com.applovin.impl.yg r7 = r11.f5489c
            int r7 = r7.j()
            if (r4 == 0) goto L64
            long r9 = (long) r4
            boolean r9 = a(r7, r9)
            if (r9 == 0) goto L6b
        L64:
            int r9 = com.applovin.impl.of.b(r7)
            r10 = -1
            if (r9 != r10) goto L8b
        L6b:
            int r4 = r6 + 1
            if (r6 != r0) goto L79
            if (r13 == 0) goto L72
            return r3
        L72:
            java.lang.String r12 = "Searched too many bytes."
            com.applovin.impl.ah r12 = com.applovin.impl.ah.a(r12, r2)
            throw r12
        L79:
            if (r13 == 0) goto L84
            r12.b()
            int r5 = r1 + r4
            r12.c(r5)
            goto L87
        L84:
            r12.a(r8)
        L87:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L40
        L8b:
            int r5 = r5 + 1
            if (r5 != r8) goto L96
            com.applovin.impl.of$a r4 = r11.f5490d
            r4.a(r7)
            r4 = r7
            goto La6
        L96:
            r7 = 4
            if (r5 != r7) goto La6
        L99:
            if (r13 == 0) goto La0
            int r1 = r1 + r6
            r12.a(r1)
            goto La3
        La0:
            r12.b()
        La3:
            r11.f5497k = r4
            return r8
        La6:
            int r9 = r9 + (-4)
            r12.c(r9)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jf.b(com.applovin.impl.j8, boolean):boolean");
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f5494h = k8Var;
        ro a = k8Var.a(0, 1);
        this.f5495i = a;
        this.f5496j = a;
        this.f5494h.c();
    }

    private static ff a(we weVar, long j3) {
        if (weVar == null) {
            return null;
        }
        int c10 = weVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            we.b a = weVar.a(i10);
            if (a instanceof ef) {
                return ff.a(j3, (ef) a, a(weVar));
            }
        }
        return null;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        b();
        int e2 = e(j8Var);
        if (e2 == -1 && (this.f5503q instanceof jb)) {
            long a = a(this.f5500n);
            if (this.f5503q.d() != a) {
                ((jb) this.f5503q).d(a);
                this.f5494h.a(this.f5503q);
            }
        }
        return e2;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.f5497k = 0;
        this.f5499m = C.TIME_UNSET;
        this.f5500n = 0L;
        this.f5502p = 0;
        this.f5506t = j10;
        hj hjVar = this.f5503q;
        if (!(hjVar instanceof jb) || ((jb) hjVar).c(j10)) {
            return;
        }
        this.f5505s = true;
        this.f5496j = this.f5493g;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return b(j8Var, true);
    }
}
