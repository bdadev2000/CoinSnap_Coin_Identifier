package com.applovin.impl;

import android.os.Handler;
import android.util.Pair;
import com.applovin.impl.be;
import com.applovin.impl.eb;
import com.applovin.impl.fo;

/* loaded from: classes3.dex */
public final class ae {

    /* renamed from: a */
    private final fo.b f22832a = new fo.b();

    /* renamed from: b */
    private final fo.d f22833b = new fo.d();

    /* renamed from: c */
    private final r0 f22834c;
    private final Handler d;
    private long e;

    /* renamed from: f */
    private int f22835f;

    /* renamed from: g */
    private boolean f22836g;

    /* renamed from: h */
    private xd f22837h;

    /* renamed from: i */
    private xd f22838i;

    /* renamed from: j */
    private xd f22839j;

    /* renamed from: k */
    private int f22840k;

    /* renamed from: l */
    private Object f22841l;

    /* renamed from: m */
    private long f22842m;

    public ae(r0 r0Var, Handler handler) {
        this.f22834c = r0Var;
        this.d = handler;
    }

    private void g() {
        if (this.f22834c != null) {
            eb.a f2 = eb.f();
            for (xd xdVar = this.f22837h; xdVar != null; xdVar = xdVar.d()) {
                f2.b(xdVar.f27895f.f28322a);
            }
            xd xdVar2 = this.f22838i;
            this.d.post(new ks(this, 0, f2, xdVar2 == null ? null : xdVar2.f27895f.f28322a));
        }
    }

    public xd b() {
        xd xdVar = this.f22838i;
        b1.b((xdVar == null || xdVar.d() == null) ? false : true);
        this.f22838i = this.f22838i.d();
        g();
        return this.f22838i;
    }

    public void c() {
        if (this.f22840k == 0) {
            return;
        }
        xd xdVar = (xd) b1.b(this.f22837h);
        this.f22841l = xdVar.f27893b;
        this.f22842m = xdVar.f27895f.f28322a.d;
        while (xdVar != null) {
            xdVar.l();
            xdVar = xdVar.d();
        }
        this.f22837h = null;
        this.f22839j = null;
        this.f22838i = null;
        this.f22840k = 0;
        g();
    }

    public xd d() {
        return this.f22839j;
    }

    public xd e() {
        return this.f22837h;
    }

    public xd f() {
        return this.f22838i;
    }

    public boolean h() {
        xd xdVar = this.f22839j;
        return xdVar == null || (!xdVar.f27895f.f28328i && xdVar.j() && this.f22839j.f27895f.e != -9223372036854775807L && this.f22840k < 100);
    }

    private boolean a(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    public xd a() {
        xd xdVar = this.f22837h;
        if (xdVar == null) {
            return null;
        }
        if (xdVar == this.f22838i) {
            this.f22838i = xdVar.d();
        }
        this.f22837h.l();
        int i2 = this.f22840k - 1;
        this.f22840k = i2;
        if (i2 == 0) {
            this.f22839j = null;
            xd xdVar2 = this.f22837h;
            this.f22841l = xdVar2.f27893b;
            this.f22842m = xdVar2.f27895f.f28322a.d;
        }
        this.f22837h = this.f22837h.d();
        g();
        return this.f22837h;
    }

    private boolean a(zd zdVar, zd zdVar2) {
        return zdVar.f28323b == zdVar2.f28323b && zdVar.f28322a.equals(zdVar2.f28322a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.xd a(com.applovin.impl.ri[] r12, com.applovin.impl.vo r13, com.applovin.impl.n0 r14, com.applovin.impl.fe r15, com.applovin.impl.zd r16, com.applovin.impl.wo r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.impl.xd r1 = r0.f22839j
            if (r1 != 0) goto L1f
            com.applovin.impl.be$a r1 = r8.f28322a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1c
            long r1 = r8.f28324c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
        L1a:
            r3 = r1
            goto L2e
        L1c:
            r1 = 0
            goto L1a
        L1f:
            long r1 = r1.f()
            com.applovin.impl.xd r3 = r0.f22839j
            com.applovin.impl.zd r3 = r3.f27895f
            long r3 = r3.e
            long r1 = r1 + r3
            long r3 = r8.f28323b
            long r1 = r1 - r3
            goto L1a
        L2e:
            com.applovin.impl.xd r10 = new com.applovin.impl.xd
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.impl.xd r1 = r0.f22839j
            if (r1 == 0) goto L44
            r1.a(r10)
            goto L48
        L44:
            r0.f22837h = r10
            r0.f22838i = r10
        L48:
            r1 = 0
            r0.f22841l = r1
            r0.f22839j = r10
            int r1 = r0.f22840k
            int r1 = r1 + 1
            r0.f22840k = r1
            r11.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ae.a(com.applovin.impl.ri[], com.applovin.impl.vo, com.applovin.impl.n0, com.applovin.impl.fe, com.applovin.impl.zd, com.applovin.impl.wo):com.applovin.impl.xd");
    }

    private zd a(oh ohVar) {
        return a(ohVar.f25867a, ohVar.f25868b, ohVar.f25869c, ohVar.f25883s);
    }

    private zd a(fo foVar, xd xdVar, long j2) {
        long j3;
        zd zdVar = xdVar.f27895f;
        long f2 = (xdVar.f() + zdVar.e) - j2;
        if (zdVar.f28326g) {
            long j4 = 0;
            int a2 = foVar.a(foVar.a(zdVar.f28322a.f28191a), this.f22832a, this.f22833b, this.f22835f, this.f22836g);
            if (a2 == -1) {
                return null;
            }
            int i2 = foVar.a(a2, this.f22832a, true).f23950c;
            Object obj = this.f22832a.f23949b;
            long j5 = zdVar.f28322a.d;
            if (foVar.a(i2, this.f22833b).f23974p == a2) {
                Pair a3 = foVar.a(this.f22833b, this.f22832a, i2, -9223372036854775807L, Math.max(0L, f2));
                if (a3 == null) {
                    return null;
                }
                obj = a3.first;
                long longValue = ((Long) a3.second).longValue();
                xd d = xdVar.d();
                if (d == null || !d.f27893b.equals(obj)) {
                    j5 = this.e;
                    this.e = 1 + j5;
                } else {
                    j5 = d.f27895f.f28322a.d;
                }
                j3 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return a(foVar, a(foVar, obj, j3, j5, this.f22832a), j4, j3);
        }
        be.a aVar = zdVar.f28322a;
        foVar.a(aVar.f28191a, this.f22832a);
        if (aVar.a()) {
            int i3 = aVar.f28192b;
            int a4 = this.f22832a.a(i3);
            if (a4 == -1) {
                return null;
            }
            int b2 = this.f22832a.b(i3, aVar.f28193c);
            if (b2 < a4) {
                return a(foVar, aVar.f28191a, i3, b2, zdVar.f28324c, aVar.d);
            }
            long j6 = zdVar.f28324c;
            if (j6 == -9223372036854775807L) {
                fo.d dVar = this.f22833b;
                fo.b bVar = this.f22832a;
                Pair a5 = foVar.a(dVar, bVar, bVar.f23950c, -9223372036854775807L, Math.max(0L, f2));
                if (a5 == null) {
                    return null;
                }
                j6 = ((Long) a5.second).longValue();
            }
            return a(foVar, aVar.f28191a, Math.max(a(foVar, aVar.f28191a, aVar.f28192b), j6), zdVar.f28324c, aVar.d);
        }
        int d2 = this.f22832a.d(aVar.e);
        if (d2 == this.f22832a.a(aVar.e)) {
            return a(foVar, aVar.f28191a, a(foVar, aVar.f28191a, aVar.e), zdVar.e, aVar.d);
        }
        return a(foVar, aVar.f28191a, aVar.e, d2, zdVar.e, aVar.d);
    }

    private zd a(fo foVar, be.a aVar, long j2, long j3) {
        foVar.a(aVar.f28191a, this.f22832a);
        if (aVar.a()) {
            return a(foVar, aVar.f28191a, aVar.f28192b, aVar.f28193c, j2, aVar.d);
        }
        return a(foVar, aVar.f28191a, j3, j2, aVar.d);
    }

    private zd a(fo foVar, Object obj, int i2, int i3, long j2, long j3) {
        be.a aVar = new be.a(obj, i2, i3, j3);
        long a2 = foVar.a(aVar.f28191a, this.f22832a).a(aVar.f28192b, aVar.f28193c);
        long b2 = i3 == this.f22832a.d(i2) ? this.f22832a.b() : 0L;
        return new zd(aVar, (a2 == -9223372036854775807L || b2 < a2) ? b2 : Math.max(0L, a2 - 1), j2, -9223372036854775807L, a2, this.f22832a.f(aVar.f28192b), false, false, false);
    }

    private zd a(fo foVar, Object obj, long j2, long j3, long j4) {
        long j5 = j2;
        foVar.a(obj, this.f22832a);
        int a2 = this.f22832a.a(j5);
        be.a aVar = new be.a(obj, j4, a2);
        boolean a3 = a(aVar);
        boolean a4 = a(foVar, aVar);
        boolean a5 = a(foVar, aVar, a3);
        boolean z2 = a2 != -1 && this.f22832a.f(a2);
        long b2 = a2 != -1 ? this.f22832a.b(a2) : -9223372036854775807L;
        long j6 = (b2 == -9223372036854775807L || b2 == Long.MIN_VALUE) ? this.f22832a.d : b2;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - 1);
        }
        return new zd(aVar, j5, j3, b2, j6, z2, a3, a4, a5);
    }

    private long a(fo foVar, Object obj, int i2) {
        foVar.a(obj, this.f22832a);
        long b2 = this.f22832a.b(i2);
        if (b2 == Long.MIN_VALUE) {
            return this.f22832a.d;
        }
        return this.f22832a.c(i2) + b2;
    }

    public zd a(long j2, oh ohVar) {
        xd xdVar = this.f22839j;
        if (xdVar == null) {
            return a(ohVar);
        }
        return a(ohVar.f25867a, xdVar, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.zd a(com.applovin.impl.fo r19, com.applovin.impl.zd r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.impl.be$a r3 = r2.f28322a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.impl.be$a r4 = r2.f28322a
            java.lang.Object r4 = r4.f28191a
            com.applovin.impl.fo$b r5 = r0.f22832a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            com.applovin.impl.fo$b r7 = r0.f22832a
            long r7 = r7.b(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.a()
            if (r1 == 0) goto L48
            com.applovin.impl.fo$b r1 = r0.f22832a
            int r4 = r3.f28192b
            int r5 = r3.f28193c
            long r4 = r1.a(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.applovin.impl.fo$b r1 = r0.f22832a
            long r4 = r1.c()
            goto L46
        L5c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6c
            com.applovin.impl.fo$b r1 = r0.f22832a
            int r4 = r3.f28192b
            boolean r1 = r1.f(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.e
            if (r1 == r6) goto L7a
            com.applovin.impl.fo$b r4 = r0.f22832a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.applovin.impl.zd r15 = new com.applovin.impl.zd
            long r4 = r2.f28323b
            long r1 = r2.f28324c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ae.a(com.applovin.impl.fo, com.applovin.impl.zd):com.applovin.impl.zd");
    }

    private boolean a(be.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean a(fo foVar, be.a aVar, boolean z2) {
        int a2 = foVar.a(aVar.f28191a);
        return !foVar.a(foVar.a(a2, this.f22832a).f23950c, this.f22833b).f23968j && foVar.b(a2, this.f22832a, this.f22833b, this.f22835f, this.f22836g) && z2;
    }

    private boolean a(fo foVar, be.a aVar) {
        if (a(aVar)) {
            return foVar.a(foVar.a(aVar.f28191a, this.f22832a).f23950c, this.f22833b).f23975q == foVar.a(aVar.f28191a);
        }
        return false;
    }

    public boolean a(wd wdVar) {
        xd xdVar = this.f22839j;
        return xdVar != null && xdVar.f27892a == wdVar;
    }

    public /* synthetic */ void a(eb.a aVar, be.a aVar2) {
        this.f22834c.a(aVar.a(), aVar2);
    }

    public void a(long j2) {
        xd xdVar = this.f22839j;
        if (xdVar != null) {
            xdVar.b(j2);
        }
    }

    public boolean a(xd xdVar) {
        boolean z2 = false;
        b1.b(xdVar != null);
        if (xdVar.equals(this.f22839j)) {
            return false;
        }
        this.f22839j = xdVar;
        while (xdVar.d() != null) {
            xdVar = xdVar.d();
            if (xdVar == this.f22838i) {
                this.f22838i = this.f22837h;
                z2 = true;
            }
            xdVar.l();
            this.f22840k--;
        }
        this.f22839j.a((xd) null);
        g();
        return z2;
    }

    public be.a a(fo foVar, Object obj, long j2) {
        return a(foVar, obj, j2, a(foVar, obj), this.f22832a);
    }

    private static be.a a(fo foVar, Object obj, long j2, long j3, fo.b bVar) {
        foVar.a(obj, bVar);
        int b2 = bVar.b(j2);
        if (b2 == -1) {
            return new be.a(obj, j3, bVar.a(j2));
        }
        return new be.a(obj, b2, bVar.d(b2), j3);
    }

    private long a(fo foVar, Object obj) {
        int a2;
        int i2 = foVar.a(obj, this.f22832a).f23950c;
        Object obj2 = this.f22841l;
        if (obj2 != null && (a2 = foVar.a(obj2)) != -1 && foVar.a(a2, this.f22832a).f23950c == i2) {
            return this.f22842m;
        }
        for (xd xdVar = this.f22837h; xdVar != null; xdVar = xdVar.d()) {
            if (xdVar.f27893b.equals(obj)) {
                return xdVar.f27895f.f28322a.d;
            }
        }
        for (xd xdVar2 = this.f22837h; xdVar2 != null; xdVar2 = xdVar2.d()) {
            int a3 = foVar.a(xdVar2.f27893b);
            if (a3 != -1 && foVar.a(a3, this.f22832a).f23950c == i2) {
                return xdVar2.f27895f.f28322a.d;
            }
        }
        long j2 = this.e;
        this.e = 1 + j2;
        if (this.f22837h == null) {
            this.f22841l = obj;
            this.f22842m = j2;
        }
        return j2;
    }

    private boolean a(fo foVar) {
        xd xdVar = this.f22837h;
        if (xdVar == null) {
            return true;
        }
        int a2 = foVar.a(xdVar.f27893b);
        while (true) {
            a2 = foVar.a(a2, this.f22832a, this.f22833b, this.f22835f, this.f22836g);
            while (xdVar.d() != null && !xdVar.f27895f.f28326g) {
                xdVar = xdVar.d();
            }
            xd d = xdVar.d();
            if (a2 == -1 || d == null || foVar.a(d.f27893b) != a2) {
                break;
            }
            xdVar = d;
        }
        boolean a3 = a(xdVar);
        xdVar.f27895f = a(foVar, xdVar.f27895f);
        return !a3;
    }

    public boolean a(fo foVar, long j2, long j3) {
        boolean a2;
        zd zdVar;
        xd xdVar = this.f22837h;
        xd xdVar2 = null;
        while (xdVar != null) {
            zd zdVar2 = xdVar.f27895f;
            if (xdVar2 == null) {
                zdVar = a(foVar, zdVar2);
            } else {
                zd a3 = a(foVar, xdVar2, j2);
                if (a3 == null) {
                    a2 = a(xdVar2);
                } else if (a(zdVar2, a3)) {
                    zdVar = a3;
                } else {
                    a2 = a(xdVar2);
                }
                return !a2;
            }
            xdVar.f27895f = zdVar.a(zdVar2.f28324c);
            if (!a(zdVar2.e, zdVar.e)) {
                xdVar.m();
                long j4 = zdVar.e;
                return (a(xdVar) || (xdVar == this.f22838i && !xdVar.f27895f.f28325f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : xdVar.e(j4)) ? 1 : (j3 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : xdVar.e(j4)) ? 0 : -1)) >= 0))) ? false : true;
            }
            xdVar2 = xdVar;
            xdVar = xdVar.d();
        }
        return true;
    }

    public boolean a(fo foVar, int i2) {
        this.f22835f = i2;
        return a(foVar);
    }

    public boolean a(fo foVar, boolean z2) {
        this.f22836g = z2;
        return a(foVar);
    }
}
