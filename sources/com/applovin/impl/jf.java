package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.hj;
import com.applovin.impl.of;
import com.applovin.impl.ta;
import com.applovin.impl.we;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class jf implements i8 {

    /* renamed from: u */
    public static final m8 f8446u = new A0(7);

    /* renamed from: v */
    private static final ta.a f8447v = new I(20);

    /* renamed from: a */
    private final int f8448a;
    private final long b;

    /* renamed from: c */
    private final yg f8449c;

    /* renamed from: d */
    private final of.a f8450d;

    /* renamed from: e */
    private final x9 f8451e;

    /* renamed from: f */
    private final va f8452f;

    /* renamed from: g */
    private final ro f8453g;

    /* renamed from: h */
    private k8 f8454h;

    /* renamed from: i */
    private ro f8455i;

    /* renamed from: j */
    private ro f8456j;

    /* renamed from: k */
    private int f8457k;
    private we l;
    private long m;

    /* renamed from: n */
    private long f8458n;

    /* renamed from: o */
    private long f8459o;

    /* renamed from: p */
    private int f8460p;

    /* renamed from: q */
    private hj f8461q;

    /* renamed from: r */
    private boolean f8462r;

    /* renamed from: s */
    private boolean f8463s;

    /* renamed from: t */
    private long f8464t;

    public jf() {
        this(0);
    }

    private void b() {
        AbstractC0669a1.b(this.f8455i);
        yp.a(this.f8454h);
    }

    private boolean d(j8 j8Var) {
        hj hjVar = this.f8461q;
        if (hjVar != null) {
            long c9 = hjVar.c();
            if (c9 != -1 && j8Var.d() > c9 - 4) {
                return true;
            }
        }
        try {
            return !j8Var.b(this.f8449c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public void c() {
        this.f8462r = true;
    }

    public jf(int i9) {
        this(i9, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    public static /* synthetic */ boolean a(int i9, int i10, int i11, int i12, int i13) {
        return (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i9 == 2)) || (i10 == 77 && i11 == 76 && i12 == 76 && (i13 == 84 || i9 == 2));
    }

    private hj c(j8 j8Var) {
        int i9;
        yg ygVar = new yg(this.f8450d.f9523c);
        j8Var.c(ygVar.c(), 0, this.f8450d.f9523c);
        of.a aVar = this.f8450d;
        if ((aVar.f9522a & 1) != 0) {
            if (aVar.f9525e != 1) {
                i9 = 36;
            }
            i9 = 21;
        } else {
            if (aVar.f9525e == 1) {
                i9 = 13;
            }
            i9 = 21;
        }
        int i10 = i9;
        int a6 = a(ygVar, i10);
        if (a6 != 1483304551 && a6 != 1231971951) {
            if (a6 == 1447187017) {
                qq a9 = qq.a(j8Var.a(), j8Var.f(), this.f8450d, ygVar);
                j8Var.a(this.f8450d.f9523c);
                return a9;
            }
            j8Var.b();
            return null;
        }
        es a10 = es.a(j8Var.a(), j8Var.f(), this.f8450d, ygVar);
        if (a10 != null && !this.f8451e.a()) {
            j8Var.b();
            j8Var.c(i10 + 141);
            j8Var.c(this.f8449c.c(), 0, 3);
            this.f8449c.f(0);
            this.f8451e.a(this.f8449c.z());
        }
        j8Var.a(this.f8450d.f9523c);
        return (a10 == null || a10.b() || a6 != 1231971951) ? a10 : a(j8Var, false);
    }

    private int e(j8 j8Var) {
        if (this.f8457k == 0) {
            try {
                b(j8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8461q == null) {
            hj b = b(j8Var);
            this.f8461q = b;
            this.f8454h.a(b);
            this.f8456j.a(new d9.b().f(this.f8450d.b).i(4096).c(this.f8450d.f9525e).n(this.f8450d.f9524d).e(this.f8451e.f12162a).f(this.f8451e.b).a((this.f8448a & 8) != 0 ? null : this.l).a());
            this.f8459o = j8Var.f();
        } else if (this.f8459o != 0) {
            long f9 = j8Var.f();
            long j7 = this.f8459o;
            if (f9 < j7) {
                j8Var.a((int) (j7 - f9));
            }
        }
        return f(j8Var);
    }

    private int f(j8 j8Var) {
        if (this.f8460p == 0) {
            j8Var.b();
            if (d(j8Var)) {
                return -1;
            }
            this.f8449c.f(0);
            int j7 = this.f8449c.j();
            if (a(j7, this.f8457k) && of.b(j7) != -1) {
                this.f8450d.a(j7);
                if (this.m == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.m = this.f8461q.a(j8Var.f());
                    if (this.b != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.m = (this.b - this.f8461q.a(0L)) + this.m;
                    }
                }
                this.f8460p = this.f8450d.f9523c;
                hj hjVar = this.f8461q;
                if (hjVar instanceof jb) {
                    jb jbVar = (jb) hjVar;
                    jbVar.a(a(this.f8458n + r0.f9527g), j8Var.f() + this.f8450d.f9523c);
                    if (this.f8463s && jbVar.c(this.f8464t)) {
                        this.f8463s = false;
                        this.f8456j = this.f8455i;
                    }
                }
            } else {
                j8Var.a(1);
                this.f8457k = 0;
                return 0;
            }
        }
        int a6 = this.f8456j.a((e5) j8Var, this.f8460p, true);
        if (a6 == -1) {
            return -1;
        }
        int i9 = this.f8460p - a6;
        this.f8460p = i9;
        if (i9 > 0) {
            return 0;
        }
        this.f8456j.a(a(this.f8458n), 1, this.f8450d.f9523c, 0, null);
        this.f8458n += this.f8450d.f9527g;
        this.f8460p = 0;
        return 0;
    }

    public jf(int i9, long j7) {
        this.f8448a = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.b = j7;
        this.f8449c = new yg(10);
        this.f8450d = new of.a();
        this.f8451e = new x9();
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8452f = new va();
        g7 g7Var = new g7();
        this.f8453g = g7Var;
        this.f8456j = g7Var;
    }

    private static boolean a(int i9, long j7) {
        return ((long) (i9 & (-128000))) == (j7 & (-128000));
    }

    private hj b(j8 j8Var) {
        long a6;
        long j7;
        hj c9 = c(j8Var);
        ff a9 = a(this.l, j8Var.f());
        if (this.f8462r) {
            return new hj.a();
        }
        if ((this.f8448a & 4) != 0) {
            if (a9 != null) {
                a6 = a9.d();
                j7 = a9.c();
            } else if (c9 != null) {
                a6 = c9.d();
                j7 = c9.c();
            } else {
                a6 = a(this.l);
                j7 = -1;
            }
            c9 = new jb(a6, j8Var.f(), j7);
        } else if (a9 != null) {
            c9 = a9;
        } else if (c9 == null) {
            c9 = null;
        }
        if (c9 == null || !(c9.b() || (this.f8448a & 1) == 0)) {
            return a(j8Var, (this.f8448a & 2) != 0);
        }
        return c9;
    }

    private long a(long j7) {
        return ((j7 * 1000000) / this.f8450d.f9524d) + this.m;
    }

    private hj a(j8 j8Var, boolean z8) {
        j8Var.c(this.f8449c.c(), 0, 4);
        this.f8449c.f(0);
        this.f8450d.a(this.f8449c.j());
        return new o4(j8Var.a(), j8Var.f(), this.f8450d, z8);
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new jf()};
    }

    private static long a(we weVar) {
        if (weVar == null) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        int c9 = weVar.c();
        for (int i9 = 0; i9 < c9; i9++) {
            we.b a6 = weVar.a(i9);
            if (a6 instanceof ao) {
                ao aoVar = (ao) a6;
                if (aoVar.f11577a.equals("TLEN")) {
                    return AbstractC0744r2.a(Long.parseLong(aoVar.f6772c));
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private static int a(yg ygVar, int i9) {
        if (ygVar.e() >= i9 + 4) {
            ygVar.f(i9);
            int j7 = ygVar.j();
            if (j7 == 1483304551 || j7 == 1231971951) {
                return j7;
            }
        }
        if (ygVar.e() < 40) {
            return 0;
        }
        ygVar.f(36);
        return ygVar.j() == 1447187017 ? 1447187017 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.a(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.f8457k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
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
            if (r1 != 0) goto L3e
            int r1 = r11.f8448a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            com.applovin.impl.ta$a r1 = com.applovin.impl.jf.f8447v
        L21:
            com.applovin.impl.va r4 = r11.f8452f
            com.applovin.impl.we r1 = r4.a(r12, r1)
            r11.l = r1
            if (r1 == 0) goto L30
            com.applovin.impl.x9 r4 = r11.f8451e
            r4.a(r1)
        L30:
            long r4 = r12.d()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.a(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.d(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            com.applovin.impl.yg r7 = r11.f8449c
            r7.f(r3)
            com.applovin.impl.yg r7 = r11.f8449c
            int r7 = r7.j()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = a(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = com.applovin.impl.of.b(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            com.applovin.impl.ah r12 = com.applovin.impl.ah.a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.b()
            int r5 = r1 + r4
            r12.c(r5)
            goto L88
        L85:
            r12.a(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            com.applovin.impl.of$a r4 = r11.f8450d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.a(r1)
            goto La4
        La1:
            r12.b()
        La4:
            r11.f8457k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.c(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jf.b(com.applovin.impl.j8, boolean):boolean");
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8454h = k8Var;
        ro a6 = k8Var.a(0, 1);
        this.f8455i = a6;
        this.f8456j = a6;
        this.f8454h.c();
    }

    private static ff a(we weVar, long j7) {
        if (weVar == null) {
            return null;
        }
        int c9 = weVar.c();
        for (int i9 = 0; i9 < c9; i9++) {
            we.b a6 = weVar.a(i9);
            if (a6 instanceof ef) {
                return ff.a(j7, (ef) a6, a(weVar));
            }
        }
        return null;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        b();
        int e4 = e(j8Var);
        if (e4 == -1 && (this.f8461q instanceof jb)) {
            long a6 = a(this.f8458n);
            if (this.f8461q.d() != a6) {
                ((jb) this.f8461q).d(a6);
                this.f8454h.a(this.f8461q);
            }
        }
        return e4;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f8457k = 0;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8458n = 0L;
        this.f8460p = 0;
        this.f8464t = j9;
        hj hjVar = this.f8461q;
        if (!(hjVar instanceof jb) || ((jb) hjVar).c(j9)) {
            return;
        }
        this.f8463s = true;
        this.f8456j = this.f8453g;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return b(j8Var, true);
    }
}
