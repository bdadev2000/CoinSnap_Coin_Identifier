package com.applovin.impl;

import android.os.Handler;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.go;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class vd {

    /* renamed from: a */
    private final go.b f11715a = new go.b();
    private final go.d b = new go.d();

    /* renamed from: c */
    private final C0742r0 f11716c;

    /* renamed from: d */
    private final Handler f11717d;

    /* renamed from: e */
    private long f11718e;

    /* renamed from: f */
    private int f11719f;

    /* renamed from: g */
    private boolean f11720g;

    /* renamed from: h */
    private sd f11721h;

    /* renamed from: i */
    private sd f11722i;

    /* renamed from: j */
    private sd f11723j;

    /* renamed from: k */
    private int f11724k;
    private Object l;
    private long m;

    public vd(C0742r0 c0742r0, Handler handler) {
        this.f11716c = c0742r0;
        this.f11717d = handler;
    }

    private void g() {
        wd.a aVar;
        if (this.f11716c != null) {
            ab.a f9 = ab.f();
            for (sd sdVar = this.f11721h; sdVar != null; sdVar = sdVar.d()) {
                f9.b(sdVar.f10633f.f11582a);
            }
            sd sdVar2 = this.f11722i;
            if (sdVar2 == null) {
                aVar = null;
            } else {
                aVar = sdVar2.f10633f.f11582a;
            }
            this.f11717d.post(new O2(this, f9, aVar, 0));
        }
    }

    public sd b() {
        boolean z8;
        sd sdVar = this.f11722i;
        if (sdVar != null && sdVar.d() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.f11722i = this.f11722i.d();
        g();
        return this.f11722i;
    }

    public void c() {
        if (this.f11724k == 0) {
            return;
        }
        sd sdVar = (sd) AbstractC0669a1.b(this.f11721h);
        this.l = sdVar.b;
        this.m = sdVar.f10633f.f11582a.f11477d;
        while (sdVar != null) {
            sdVar.l();
            sdVar = sdVar.d();
        }
        this.f11721h = null;
        this.f11723j = null;
        this.f11722i = null;
        this.f11724k = 0;
        g();
    }

    public sd d() {
        return this.f11723j;
    }

    public sd e() {
        return this.f11721h;
    }

    public sd f() {
        return this.f11722i;
    }

    public boolean h() {
        sd sdVar = this.f11723j;
        if (sdVar != null && (sdVar.f10633f.f11589i || !sdVar.j() || this.f11723j.f10633f.f11585e == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.f11724k >= 100)) {
            return false;
        }
        return true;
    }

    private boolean a(long j7, long j9) {
        return j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 == j9;
    }

    public sd a() {
        sd sdVar = this.f11721h;
        if (sdVar == null) {
            return null;
        }
        if (sdVar == this.f11722i) {
            this.f11722i = sdVar.d();
        }
        this.f11721h.l();
        int i9 = this.f11724k - 1;
        this.f11724k = i9;
        if (i9 == 0) {
            this.f11723j = null;
            sd sdVar2 = this.f11721h;
            this.l = sdVar2.b;
            this.m = sdVar2.f10633f.f11582a.f11477d;
        }
        this.f11721h = this.f11721h.d();
        g();
        return this.f11721h;
    }

    private boolean a(ud udVar, ud udVar2) {
        return udVar.b == udVar2.b && udVar.f11582a.equals(udVar2.f11582a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.sd a(com.applovin.impl.mi[] r12, com.applovin.impl.wo r13, com.applovin.impl.InterfaceC0727n0 r14, com.applovin.impl.ae r15, com.applovin.impl.ud r16, com.applovin.impl.xo r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.impl.sd r1 = r0.f11723j
            if (r1 != 0) goto L1f
            com.applovin.impl.wd$a r1 = r8.f11582a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1c
            long r1 = r8.f11583c
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
            com.applovin.impl.sd r3 = r0.f11723j
            com.applovin.impl.ud r3 = r3.f10633f
            long r3 = r3.f11585e
            long r1 = r1 + r3
            long r3 = r8.b
            long r1 = r1 - r3
            goto L1a
        L2e:
            com.applovin.impl.sd r10 = new com.applovin.impl.sd
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.impl.sd r1 = r0.f11723j
            if (r1 == 0) goto L44
            r1.a(r10)
            goto L48
        L44:
            r0.f11721h = r10
            r0.f11722i = r10
        L48:
            r1 = 0
            r0.l = r1
            r0.f11723j = r10
            int r1 = r0.f11724k
            int r1 = r1 + 1
            r0.f11724k = r1
            r11.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.mi[], com.applovin.impl.wo, com.applovin.impl.n0, com.applovin.impl.ae, com.applovin.impl.ud, com.applovin.impl.xo):com.applovin.impl.sd");
    }

    private ud a(lh lhVar) {
        return a(lhVar.f8832a, lhVar.b, lhVar.f8833c, lhVar.f8847s);
    }

    private ud a(go goVar, sd sdVar, long j7) {
        long j9;
        ud udVar = sdVar.f10633f;
        long f9 = (sdVar.f() + udVar.f11585e) - j7;
        if (udVar.f11587g) {
            long j10 = 0;
            int a6 = goVar.a(goVar.a(udVar.f11582a.f11475a), this.f11715a, this.b, this.f11719f, this.f11720g);
            if (a6 == -1) {
                return null;
            }
            int i9 = goVar.a(a6, this.f11715a, true).f7934c;
            Object obj = this.f11715a.b;
            long j11 = udVar.f11582a.f11477d;
            if (goVar.a(i9, this.b).f7958p == a6) {
                Pair a9 = goVar.a(this.b, this.f11715a, i9, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, Math.max(0L, f9));
                if (a9 == null) {
                    return null;
                }
                obj = a9.first;
                long longValue = ((Long) a9.second).longValue();
                sd d2 = sdVar.d();
                if (d2 != null && d2.b.equals(obj)) {
                    j11 = d2.f10633f.f11582a.f11477d;
                } else {
                    j11 = this.f11718e;
                    this.f11718e = 1 + j11;
                }
                j9 = longValue;
                j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            } else {
                j9 = 0;
            }
            return a(goVar, a(goVar, obj, j9, j11, this.f11715a), j10, j9);
        }
        wd.a aVar = udVar.f11582a;
        goVar.a(aVar.f11475a, this.f11715a);
        if (aVar.a()) {
            int i10 = aVar.b;
            int a10 = this.f11715a.a(i10);
            if (a10 == -1) {
                return null;
            }
            int b = this.f11715a.b(i10, aVar.f11476c);
            if (b < a10) {
                return a(goVar, aVar.f11475a, i10, b, udVar.f11583c, aVar.f11477d);
            }
            long j12 = udVar.f11583c;
            if (j12 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                go.d dVar = this.b;
                go.b bVar = this.f11715a;
                Pair a11 = goVar.a(dVar, bVar, bVar.f7934c, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, Math.max(0L, f9));
                if (a11 == null) {
                    return null;
                }
                j12 = ((Long) a11.second).longValue();
            }
            return a(goVar, aVar.f11475a, Math.max(a(goVar, aVar.f11475a, aVar.b), j12), udVar.f11583c, aVar.f11477d);
        }
        int d9 = this.f11715a.d(aVar.f11478e);
        if (d9 == this.f11715a.a(aVar.f11478e)) {
            return a(goVar, aVar.f11475a, a(goVar, aVar.f11475a, aVar.f11478e), udVar.f11585e, aVar.f11477d);
        }
        return a(goVar, aVar.f11475a, aVar.f11478e, d9, udVar.f11585e, aVar.f11477d);
    }

    private ud a(go goVar, wd.a aVar, long j7, long j9) {
        goVar.a(aVar.f11475a, this.f11715a);
        if (aVar.a()) {
            return a(goVar, aVar.f11475a, aVar.b, aVar.f11476c, j7, aVar.f11477d);
        }
        return a(goVar, aVar.f11475a, j9, j7, aVar.f11477d);
    }

    private ud a(go goVar, Object obj, int i9, int i10, long j7, long j9) {
        wd.a aVar = new wd.a(obj, i9, i10, j9);
        long a6 = goVar.a(aVar.f11475a, this.f11715a).a(aVar.b, aVar.f11476c);
        long b = i10 == this.f11715a.d(i9) ? this.f11715a.b() : 0L;
        return new ud(aVar, (a6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || b < a6) ? b : Math.max(0L, a6 - 1), j7, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, a6, this.f11715a.f(aVar.b), false, false, false);
    }

    private ud a(go goVar, Object obj, long j7, long j9, long j10) {
        long j11 = j7;
        goVar.a(obj, this.f11715a);
        int a6 = this.f11715a.a(j11);
        wd.a aVar = new wd.a(obj, j10, a6);
        boolean a9 = a(aVar);
        boolean a10 = a(goVar, aVar);
        boolean a11 = a(goVar, aVar, a9);
        boolean z8 = a6 != -1 && this.f11715a.f(a6);
        long b = a6 != -1 ? this.f11715a.b(a6) : -9223372036854775807L;
        long j12 = (b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || b == Long.MIN_VALUE) ? this.f11715a.f7935d : b;
        if (j12 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        return new ud(aVar, j11, j9, b, j12, z8, a9, a10, a11);
    }

    private long a(go goVar, Object obj, int i9) {
        goVar.a(obj, this.f11715a);
        long b = this.f11715a.b(i9);
        if (b == Long.MIN_VALUE) {
            return this.f11715a.f7935d;
        }
        return this.f11715a.c(i9) + b;
    }

    public ud a(long j7, lh lhVar) {
        sd sdVar = this.f11723j;
        if (sdVar == null) {
            return a(lhVar);
        }
        return a(lhVar.f8832a, sdVar, j7);
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
            com.applovin.impl.wd$a r3 = r2.f11582a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.impl.wd$a r4 = r2.f11582a
            java.lang.Object r4 = r4.f11475a
            com.applovin.impl.go$b r5 = r0.f11715a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f11478e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            com.applovin.impl.go$b r7 = r0.f11715a
            long r7 = r7.b(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.a()
            if (r1 == 0) goto L48
            com.applovin.impl.go$b r1 = r0.f11715a
            int r4 = r3.b
            int r5 = r3.f11476c
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
            com.applovin.impl.go$b r1 = r0.f11715a
            long r4 = r1.c()
            goto L46
        L5c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6c
            com.applovin.impl.go$b r1 = r0.f11715a
            int r4 = r3.b
            boolean r1 = r1.f(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f11478e
            if (r1 == r6) goto L7a
            com.applovin.impl.go$b r4 = r0.f11715a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.applovin.impl.ud r15 = new com.applovin.impl.ud
            long r4 = r2.b
            long r1 = r2.f11583c
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
        return !aVar.a() && aVar.f11478e == -1;
    }

    private boolean a(go goVar, wd.a aVar, boolean z8) {
        int a6 = goVar.a(aVar.f11475a);
        return !goVar.a(goVar.a(a6, this.f11715a).f7934c, this.b).f7954j && goVar.b(a6, this.f11715a, this.b, this.f11719f, this.f11720g) && z8;
    }

    private boolean a(go goVar, wd.a aVar) {
        if (a(aVar)) {
            return goVar.a(goVar.a(aVar.f11475a, this.f11715a).f7934c, this.b).f7959q == goVar.a(aVar.f11475a);
        }
        return false;
    }

    public boolean a(rd rdVar) {
        sd sdVar = this.f11723j;
        return sdVar != null && sdVar.f10629a == rdVar;
    }

    public /* synthetic */ void a(ab.a aVar, wd.a aVar2) {
        this.f11716c.a(aVar.a(), aVar2);
    }

    public void a(long j7) {
        sd sdVar = this.f11723j;
        if (sdVar != null) {
            sdVar.b(j7);
        }
    }

    public boolean a(sd sdVar) {
        boolean z8 = false;
        AbstractC0669a1.b(sdVar != null);
        if (sdVar.equals(this.f11723j)) {
            return false;
        }
        this.f11723j = sdVar;
        while (sdVar.d() != null) {
            sdVar = sdVar.d();
            if (sdVar == this.f11722i) {
                this.f11722i = this.f11721h;
                z8 = true;
            }
            sdVar.l();
            this.f11724k--;
        }
        this.f11723j.a((sd) null);
        g();
        return z8;
    }

    public wd.a a(go goVar, Object obj, long j7) {
        return a(goVar, obj, j7, a(goVar, obj), this.f11715a);
    }

    private static wd.a a(go goVar, Object obj, long j7, long j9, go.b bVar) {
        goVar.a(obj, bVar);
        int b = bVar.b(j7);
        if (b == -1) {
            return new wd.a(obj, j9, bVar.a(j7));
        }
        return new wd.a(obj, b, bVar.d(b), j9);
    }

    private long a(go goVar, Object obj) {
        int a6;
        int i9 = goVar.a(obj, this.f11715a).f7934c;
        Object obj2 = this.l;
        if (obj2 != null && (a6 = goVar.a(obj2)) != -1 && goVar.a(a6, this.f11715a).f7934c == i9) {
            return this.m;
        }
        for (sd sdVar = this.f11721h; sdVar != null; sdVar = sdVar.d()) {
            if (sdVar.b.equals(obj)) {
                return sdVar.f10633f.f11582a.f11477d;
            }
        }
        for (sd sdVar2 = this.f11721h; sdVar2 != null; sdVar2 = sdVar2.d()) {
            int a9 = goVar.a(sdVar2.b);
            if (a9 != -1 && goVar.a(a9, this.f11715a).f7934c == i9) {
                return sdVar2.f10633f.f11582a.f11477d;
            }
        }
        long j7 = this.f11718e;
        this.f11718e = 1 + j7;
        if (this.f11721h == null) {
            this.l = obj;
            this.m = j7;
        }
        return j7;
    }

    private boolean a(go goVar) {
        sd sdVar = this.f11721h;
        if (sdVar == null) {
            return true;
        }
        int a6 = goVar.a(sdVar.b);
        while (true) {
            a6 = goVar.a(a6, this.f11715a, this.b, this.f11719f, this.f11720g);
            while (sdVar.d() != null && !sdVar.f10633f.f11587g) {
                sdVar = sdVar.d();
            }
            sd d2 = sdVar.d();
            if (a6 == -1 || d2 == null || goVar.a(d2.b) != a6) {
                break;
            }
            sdVar = d2;
        }
        boolean a9 = a(sdVar);
        sdVar.f10633f = a(goVar, sdVar.f10633f);
        return !a9;
    }

    public boolean a(go goVar, long j7, long j9) {
        boolean a6;
        ud udVar;
        sd sdVar = this.f11721h;
        sd sdVar2 = null;
        while (sdVar != null) {
            ud udVar2 = sdVar.f10633f;
            if (sdVar2 == null) {
                udVar = a(goVar, udVar2);
            } else {
                ud a9 = a(goVar, sdVar2, j7);
                if (a9 == null) {
                    a6 = a(sdVar2);
                } else if (a(udVar2, a9)) {
                    udVar = a9;
                } else {
                    a6 = a(sdVar2);
                }
                return !a6;
            }
            sdVar.f10633f = udVar.a(udVar2.f11583c);
            if (!a(udVar2.f11585e, udVar.f11585e)) {
                sdVar.m();
                long j10 = udVar.f11585e;
                return (a(sdVar) || (sdVar == this.f11722i && !sdVar.f10633f.f11586f && ((j9 > Long.MIN_VALUE ? 1 : (j9 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j9 > ((j10 > com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 1 : (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVar.e(j10)) ? 1 : (j9 == ((j10 > com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 1 : (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : sdVar.e(j10)) ? 0 : -1)) >= 0))) ? false : true;
            }
            sdVar2 = sdVar;
            sdVar = sdVar.d();
        }
        return true;
    }

    public boolean a(go goVar, int i9) {
        this.f11719f = i9;
        return a(goVar);
    }

    public boolean a(go goVar, boolean z8) {
        this.f11720g = z8;
        return a(goVar);
    }
}
