package com.applovin.impl;

import android.os.Handler;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.go;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class vd {
    private final go.b a = new go.b();

    /* renamed from: b */
    private final go.d f8492b = new go.d();

    /* renamed from: c */
    private final r0 f8493c;

    /* renamed from: d */
    private final Handler f8494d;

    /* renamed from: e */
    private long f8495e;

    /* renamed from: f */
    private int f8496f;

    /* renamed from: g */
    private boolean f8497g;

    /* renamed from: h */
    private sd f8498h;

    /* renamed from: i */
    private sd f8499i;

    /* renamed from: j */
    private sd f8500j;

    /* renamed from: k */
    private int f8501k;

    /* renamed from: l */
    private Object f8502l;

    /* renamed from: m */
    private long f8503m;

    public vd(r0 r0Var, Handler handler) {
        this.f8493c = r0Var;
        this.f8494d = handler;
    }

    private void g() {
        wd.a aVar;
        if (this.f8493c != null) {
            ab.a f10 = ab.f();
            for (sd sdVar = this.f8498h; sdVar != null; sdVar = sdVar.d()) {
                f10.b(sdVar.f7494f.a);
            }
            sd sdVar2 = this.f8499i;
            if (sdVar2 == null) {
                aVar = null;
            } else {
                aVar = sdVar2.f7494f.a;
            }
            this.f8494d.post(new yv(0, this, f10, aVar));
        }
    }

    public sd b() {
        boolean z10;
        sd sdVar = this.f8499i;
        if (sdVar != null && sdVar.d() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        this.f8499i = this.f8499i.d();
        g();
        return this.f8499i;
    }

    public void c() {
        if (this.f8501k == 0) {
            return;
        }
        sd sdVar = (sd) a1.b(this.f8498h);
        this.f8502l = sdVar.f7490b;
        this.f8503m = sdVar.f7494f.a.f8262d;
        while (sdVar != null) {
            sdVar.l();
            sdVar = sdVar.d();
        }
        this.f8498h = null;
        this.f8500j = null;
        this.f8499i = null;
        this.f8501k = 0;
        g();
    }

    public sd d() {
        return this.f8500j;
    }

    public sd e() {
        return this.f8498h;
    }

    public sd f() {
        return this.f8499i;
    }

    public boolean h() {
        sd sdVar = this.f8500j;
        if (sdVar != null && (sdVar.f7494f.f8374i || !sdVar.j() || this.f8500j.f7494f.f8370e == C.TIME_UNSET || this.f8501k >= 100)) {
            return false;
        }
        return true;
    }

    private boolean a(long j3, long j10) {
        return j3 == C.TIME_UNSET || j3 == j10;
    }

    public sd a() {
        sd sdVar = this.f8498h;
        if (sdVar == null) {
            return null;
        }
        if (sdVar == this.f8499i) {
            this.f8499i = sdVar.d();
        }
        this.f8498h.l();
        int i10 = this.f8501k - 1;
        this.f8501k = i10;
        if (i10 == 0) {
            this.f8500j = null;
            sd sdVar2 = this.f8498h;
            this.f8502l = sdVar2.f7490b;
            this.f8503m = sdVar2.f7494f.a.f8262d;
        }
        this.f8498h = this.f8498h.d();
        g();
        return this.f8498h;
    }

    private boolean a(ud udVar, ud udVar2) {
        return udVar.f8367b == udVar2.f8367b && udVar.a.equals(udVar2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.sd a(com.applovin.impl.mi[] r12, com.applovin.impl.wo r13, com.applovin.impl.n0 r14, com.applovin.impl.ae r15, com.applovin.impl.ud r16, com.applovin.impl.xo r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.impl.sd r1 = r0.f8500j
            if (r1 != 0) goto L1e
            com.applovin.impl.wd$a r1 = r8.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1b
            long r1 = r8.f8368c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.f()
            com.applovin.impl.sd r3 = r0.f8500j
            com.applovin.impl.ud r3 = r3.f7494f
            long r3 = r3.f8370e
            long r1 = r1 + r3
            long r3 = r8.f8367b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            com.applovin.impl.sd r10 = new com.applovin.impl.sd
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.impl.sd r1 = r0.f8500j
            if (r1 == 0) goto L43
            r1.a(r10)
            goto L47
        L43:
            r0.f8498h = r10
            r0.f8499i = r10
        L47:
            r1 = 0
            r0.f8502l = r1
            r0.f8500j = r10
            int r1 = r0.f8501k
            int r1 = r1 + 1
            r0.f8501k = r1
            r11.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.mi[], com.applovin.impl.wo, com.applovin.impl.n0, com.applovin.impl.ae, com.applovin.impl.ud, com.applovin.impl.xo):com.applovin.impl.sd");
    }

    private ud a(lh lhVar) {
        return a(lhVar.a, lhVar.f5864b, lhVar.f5865c, lhVar.f5881s);
    }

    private ud a(go goVar, sd sdVar, long j3) {
        long j10;
        ud udVar = sdVar.f7494f;
        long f10 = (sdVar.f() + udVar.f8370e) - j3;
        if (udVar.f8372g) {
            long j11 = 0;
            int a = goVar.a(goVar.a(udVar.a.a), this.a, this.f8492b, this.f8496f, this.f8497g);
            if (a == -1) {
                return null;
            }
            int i10 = goVar.a(a, this.a, true).f4958c;
            Object obj = this.a.f4957b;
            long j12 = udVar.a.f8262d;
            if (goVar.a(i10, this.f8492b).f4983p == a) {
                Pair a10 = goVar.a(this.f8492b, this.a, i10, C.TIME_UNSET, Math.max(0L, f10));
                if (a10 == null) {
                    return null;
                }
                obj = a10.first;
                long longValue = ((Long) a10.second).longValue();
                sd d10 = sdVar.d();
                if (d10 != null && d10.f7490b.equals(obj)) {
                    j12 = d10.f7494f.a.f8262d;
                } else {
                    j12 = this.f8495e;
                    this.f8495e = 1 + j12;
                }
                j10 = longValue;
                j11 = C.TIME_UNSET;
            } else {
                j10 = 0;
            }
            return a(goVar, a(goVar, obj, j10, j12, this.a), j11, j10);
        }
        wd.a aVar = udVar.a;
        goVar.a(aVar.a, this.a);
        if (aVar.a()) {
            int i11 = aVar.f8260b;
            int a11 = this.a.a(i11);
            if (a11 == -1) {
                return null;
            }
            int b3 = this.a.b(i11, aVar.f8261c);
            if (b3 < a11) {
                return a(goVar, aVar.a, i11, b3, udVar.f8368c, aVar.f8262d);
            }
            long j13 = udVar.f8368c;
            if (j13 == C.TIME_UNSET) {
                go.d dVar = this.f8492b;
                go.b bVar = this.a;
                Pair a12 = goVar.a(dVar, bVar, bVar.f4958c, C.TIME_UNSET, Math.max(0L, f10));
                if (a12 == null) {
                    return null;
                }
                j13 = ((Long) a12.second).longValue();
            }
            return a(goVar, aVar.a, Math.max(a(goVar, aVar.a, aVar.f8260b), j13), udVar.f8368c, aVar.f8262d);
        }
        int d11 = this.a.d(aVar.f8263e);
        if (d11 == this.a.a(aVar.f8263e)) {
            return a(goVar, aVar.a, a(goVar, aVar.a, aVar.f8263e), udVar.f8370e, aVar.f8262d);
        }
        return a(goVar, aVar.a, aVar.f8263e, d11, udVar.f8370e, aVar.f8262d);
    }

    private ud a(go goVar, wd.a aVar, long j3, long j10) {
        goVar.a(aVar.a, this.a);
        if (aVar.a()) {
            return a(goVar, aVar.a, aVar.f8260b, aVar.f8261c, j3, aVar.f8262d);
        }
        return a(goVar, aVar.a, j10, j3, aVar.f8262d);
    }

    private ud a(go goVar, Object obj, int i10, int i11, long j3, long j10) {
        wd.a aVar = new wd.a(obj, i10, i11, j10);
        long a = goVar.a(aVar.a, this.a).a(aVar.f8260b, aVar.f8261c);
        long b3 = i11 == this.a.d(i10) ? this.a.b() : 0L;
        return new ud(aVar, (a == C.TIME_UNSET || b3 < a) ? b3 : Math.max(0L, a - 1), j3, C.TIME_UNSET, a, this.a.f(aVar.f8260b), false, false, false);
    }

    private ud a(go goVar, Object obj, long j3, long j10, long j11) {
        long j12 = j3;
        goVar.a(obj, this.a);
        int a = this.a.a(j12);
        wd.a aVar = new wd.a(obj, j11, a);
        boolean a10 = a(aVar);
        boolean a11 = a(goVar, aVar);
        boolean a12 = a(goVar, aVar, a10);
        boolean z10 = a != -1 && this.a.f(a);
        long b3 = a != -1 ? this.a.b(a) : -9223372036854775807L;
        long j13 = (b3 == C.TIME_UNSET || b3 == Long.MIN_VALUE) ? this.a.f4959d : b3;
        if (j13 != C.TIME_UNSET && j12 >= j13) {
            j12 = Math.max(0L, j13 - 1);
        }
        return new ud(aVar, j12, j10, b3, j13, z10, a10, a11, a12);
    }

    private long a(go goVar, Object obj, int i10) {
        goVar.a(obj, this.a);
        long b3 = this.a.b(i10);
        if (b3 == Long.MIN_VALUE) {
            return this.a.f4959d;
        }
        return this.a.c(i10) + b3;
    }

    public ud a(long j3, lh lhVar) {
        sd sdVar = this.f8500j;
        if (sdVar == null) {
            return a(lhVar);
        }
        return a(lhVar.a, sdVar, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.ud a(com.applovin.impl.go r19, com.applovin.impl.ud r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.impl.wd$a r3 = r2.a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.impl.wd$a r4 = r2.a
            java.lang.Object r4 = r4.a
            com.applovin.impl.go$b r5 = r0.a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f8263e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.applovin.impl.go$b r7 = r0.a
            long r7 = r7.b(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.a()
            if (r1 == 0) goto L48
            com.applovin.impl.go$b r1 = r0.a
            int r5 = r3.f8260b
            int r6 = r3.f8261c
            long r5 = r1.a(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.applovin.impl.go$b r1 = r0.a
            long r5 = r1.c()
            goto L46
        L5c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6c
            com.applovin.impl.go$b r1 = r0.a
            int r4 = r3.f8260b
            boolean r1 = r1.f(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f8263e
            if (r1 == r4) goto L7a
            com.applovin.impl.go$b r4 = r0.a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.applovin.impl.ud r15 = new com.applovin.impl.ud
            long r4 = r2.f8367b
            long r1 = r2.f8368c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.go, com.applovin.impl.ud):com.applovin.impl.ud");
    }

    private boolean a(wd.a aVar) {
        return !aVar.a() && aVar.f8263e == -1;
    }

    private boolean a(go goVar, wd.a aVar, boolean z10) {
        int a = goVar.a(aVar.a);
        return !goVar.a(goVar.a(a, this.a).f4958c, this.f8492b).f4977j && goVar.b(a, this.a, this.f8492b, this.f8496f, this.f8497g) && z10;
    }

    private boolean a(go goVar, wd.a aVar) {
        if (a(aVar)) {
            return goVar.a(goVar.a(aVar.a, this.a).f4958c, this.f8492b).f4984q == goVar.a(aVar.a);
        }
        return false;
    }

    public boolean a(rd rdVar) {
        sd sdVar = this.f8500j;
        return sdVar != null && sdVar.a == rdVar;
    }

    public /* synthetic */ void a(ab.a aVar, wd.a aVar2) {
        this.f8493c.a(aVar.a(), aVar2);
    }

    public void a(long j3) {
        sd sdVar = this.f8500j;
        if (sdVar != null) {
            sdVar.b(j3);
        }
    }

    public boolean a(sd sdVar) {
        boolean z10 = false;
        a1.b(sdVar != null);
        if (sdVar.equals(this.f8500j)) {
            return false;
        }
        this.f8500j = sdVar;
        while (sdVar.d() != null) {
            sdVar = sdVar.d();
            if (sdVar == this.f8499i) {
                this.f8499i = this.f8498h;
                z10 = true;
            }
            sdVar.l();
            this.f8501k--;
        }
        this.f8500j.a((sd) null);
        g();
        return z10;
    }

    public wd.a a(go goVar, Object obj, long j3) {
        return a(goVar, obj, j3, a(goVar, obj), this.a);
    }

    private static wd.a a(go goVar, Object obj, long j3, long j10, go.b bVar) {
        goVar.a(obj, bVar);
        int b3 = bVar.b(j3);
        if (b3 == -1) {
            return new wd.a(obj, j10, bVar.a(j3));
        }
        return new wd.a(obj, b3, bVar.d(b3), j10);
    }

    private long a(go goVar, Object obj) {
        int a;
        int i10 = goVar.a(obj, this.a).f4958c;
        Object obj2 = this.f8502l;
        if (obj2 != null && (a = goVar.a(obj2)) != -1 && goVar.a(a, this.a).f4958c == i10) {
            return this.f8503m;
        }
        for (sd sdVar = this.f8498h; sdVar != null; sdVar = sdVar.d()) {
            if (sdVar.f7490b.equals(obj)) {
                return sdVar.f7494f.a.f8262d;
            }
        }
        for (sd sdVar2 = this.f8498h; sdVar2 != null; sdVar2 = sdVar2.d()) {
            int a10 = goVar.a(sdVar2.f7490b);
            if (a10 != -1 && goVar.a(a10, this.a).f4958c == i10) {
                return sdVar2.f7494f.a.f8262d;
            }
        }
        long j3 = this.f8495e;
        this.f8495e = 1 + j3;
        if (this.f8498h == null) {
            this.f8502l = obj;
            this.f8503m = j3;
        }
        return j3;
    }

    private boolean a(go goVar) {
        sd sdVar = this.f8498h;
        if (sdVar == null) {
            return true;
        }
        int a = goVar.a(sdVar.f7490b);
        while (true) {
            a = goVar.a(a, this.a, this.f8492b, this.f8496f, this.f8497g);
            while (sdVar.d() != null && !sdVar.f7494f.f8372g) {
                sdVar = sdVar.d();
            }
            sd d10 = sdVar.d();
            if (a == -1 || d10 == null || goVar.a(d10.f7490b) != a) {
                break;
            }
            sdVar = d10;
        }
        boolean a10 = a(sdVar);
        sdVar.f7494f = a(goVar, sdVar.f7494f);
        return !a10;
    }

    public boolean a(go goVar, long j3, long j10) {
        boolean a;
        ud udVar;
        sd sdVar = this.f8498h;
        sd sdVar2 = null;
        while (sdVar != null) {
            ud udVar2 = sdVar.f7494f;
            if (sdVar2 == null) {
                udVar = a(goVar, udVar2);
            } else {
                ud a10 = a(goVar, sdVar2, j3);
                if (a10 == null) {
                    a = a(sdVar2);
                } else if (a(udVar2, a10)) {
                    udVar = a10;
                } else {
                    a = a(sdVar2);
                }
                return !a;
            }
            sdVar.f7494f = udVar.a(udVar2.f8368c);
            if (!a(udVar2.f8370e, udVar.f8370e)) {
                sdVar.m();
                long j11 = udVar.f8370e;
                return (a(sdVar) || (sdVar == this.f8499i && !sdVar.f7494f.f8371f && ((j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j10 > ((j11 > C.TIME_UNSET ? 1 : (j11 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVar.e(j11)) ? 1 : (j10 == ((j11 > C.TIME_UNSET ? 1 : (j11 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVar.e(j11)) ? 0 : -1)) >= 0))) ? false : true;
            }
            sdVar2 = sdVar;
            sdVar = sdVar.d();
        }
        return true;
    }

    public boolean a(go goVar, int i10) {
        this.f8496f = i10;
        return a(goVar);
    }

    public boolean a(go goVar, boolean z10) {
        this.f8497g = z10;
        return a(goVar);
    }
}
