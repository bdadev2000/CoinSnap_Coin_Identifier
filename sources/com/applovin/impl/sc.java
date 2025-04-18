package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class sc extends z3 {

    /* renamed from: j, reason: collision with root package name */
    private final wd f7477j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7478k;

    /* renamed from: l, reason: collision with root package name */
    private final go.d f7479l;

    /* renamed from: m, reason: collision with root package name */
    private final go.b f7480m;

    /* renamed from: n, reason: collision with root package name */
    private a f7481n;

    /* renamed from: o, reason: collision with root package name */
    private rc f7482o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7483p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7484q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7485r;

    /* loaded from: classes.dex */
    public static final class a extends g9 {

        /* renamed from: g, reason: collision with root package name */
        public static final Object f7486g = new Object();

        /* renamed from: d, reason: collision with root package name */
        private final Object f7487d;

        /* renamed from: f, reason: collision with root package name */
        private final Object f7488f;

        private a(go goVar, Object obj, Object obj2) {
            super(goVar);
            this.f7487d = obj;
            this.f7488f = obj2;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public Object b(int i10) {
            Object b3 = this.f4855c.b(i10);
            if (yp.a(b3, this.f7488f)) {
                return f7486g;
            }
            return b3;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public int a(Object obj) {
            Object obj2;
            go goVar = this.f4855c;
            if (f7486g.equals(obj) && (obj2 = this.f7488f) != null) {
                obj = obj2;
            }
            return goVar.a(obj);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i10, go.b bVar, boolean z10) {
            this.f4855c.a(i10, bVar, z10);
            if (yp.a(bVar.f4957b, this.f7488f) && z10) {
                bVar.f4957b = f7486g;
            }
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i10, go.d dVar, long j3) {
            this.f4855c.a(i10, dVar, j3);
            if (yp.a(dVar.a, this.f7487d)) {
                dVar.a = go.d.f4967s;
            }
            return dVar;
        }

        public static a a(od odVar) {
            return new a(new b(odVar), go.d.f4967s, f7486g);
        }

        public static a a(go goVar, Object obj, Object obj2) {
            return new a(goVar, obj, obj2);
        }

        public a a(go goVar) {
            return new a(goVar, this.f7487d, this.f7488f);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends go {

        /* renamed from: c, reason: collision with root package name */
        private final od f7489c;

        public b(od odVar) {
            this.f7489c = odVar;
        }

        @Override // com.applovin.impl.go
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.go
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.go
        public int a(Object obj) {
            return obj == a.f7486g ? 0 : -1;
        }

        @Override // com.applovin.impl.go
        public Object b(int i10) {
            return a.f7486g;
        }

        @Override // com.applovin.impl.go
        public go.b a(int i10, go.b bVar, boolean z10) {
            bVar.a(z10 ? 0 : null, z10 ? a.f7486g : null, 0, C.TIME_UNSET, 0L, u.f8304h, true);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public go.d a(int i10, go.d dVar, long j3) {
            dVar.a(go.d.f4967s, this.f7489c, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            dVar.f4980m = true;
            return dVar;
        }
    }

    public sc(wd wdVar, boolean z10) {
        boolean z11;
        this.f7477j = wdVar;
        if (z10 && wdVar.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7478k = z11;
        this.f7479l = new go.d();
        this.f7480m = new go.b();
        go d10 = wdVar.d();
        if (d10 != null) {
            this.f7481n = a.a(d10, (Object) null, (Object) null);
            this.f7485r = true;
        } else {
            this.f7481n = a.a(wdVar.a());
        }
    }

    @Override // com.applovin.impl.wd
    public void b() {
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.b2
    public void h() {
        this.f7484q = false;
        this.f7483p = false;
        super.h();
    }

    public go i() {
        return this.f7481n;
    }

    private Object a(Object obj) {
        return (this.f7481n.f7488f == null || !this.f7481n.f7488f.equals(obj)) ? obj : a.f7486g;
    }

    @Override // com.applovin.impl.wd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rc a(wd.a aVar, n0 n0Var, long j3) {
        rc rcVar = new rc(aVar, n0Var, j3);
        rcVar.a(this.f7477j);
        if (this.f7484q) {
            rcVar.a(aVar.b(b(aVar.a)));
        } else {
            this.f7482o = rcVar;
            if (!this.f7483p) {
                this.f7483p = true;
                a((Object) null, this.f7477j);
            }
        }
        return rcVar;
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.f7477j.a();
    }

    @Override // com.applovin.impl.z3
    public wd.a a(Void r12, wd.a aVar) {
        return aVar.b(a(aVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // com.applovin.impl.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Void r13, com.applovin.impl.wd r14, com.applovin.impl.go r15) {
        /*
            r12 = this;
            boolean r13 = r12.f7484q
            if (r13 == 0) goto L19
            com.applovin.impl.sc$a r13 = r12.f7481n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            r12.f7481n = r13
            com.applovin.impl.rc r13 = r12.f7482o
            if (r13 == 0) goto Lae
            long r13 = r13.c()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.c()
            if (r13 == 0) goto L36
            boolean r13 = r12.f7485r
            if (r13 == 0) goto L2a
            com.applovin.impl.sc$a r13 = r12.f7481n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.applovin.impl.go.d.f4967s
            java.lang.Object r14 = com.applovin.impl.sc.a.f7486g
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r14)
        L32:
            r12.f7481n = r13
            goto Lae
        L36:
            com.applovin.impl.go$d r13 = r12.f7479l
            r14 = 0
            r15.a(r14, r13)
            com.applovin.impl.go$d r13 = r12.f7479l
            long r0 = r13.c()
            com.applovin.impl.go$d r13 = r12.f7479l
            java.lang.Object r13 = r13.a
            com.applovin.impl.rc r2 = r12.f7482o
            if (r2 == 0) goto L74
            long r2 = r2.d()
            com.applovin.impl.sc$a r4 = r12.f7481n
            com.applovin.impl.rc r5 = r12.f7482o
            com.applovin.impl.wd$a r5 = r5.a
            java.lang.Object r5 = r5.a
            com.applovin.impl.go$b r6 = r12.f7480m
            r4.a(r5, r6)
            com.applovin.impl.go$b r4 = r12.f7480m
            long r4 = r4.e()
            long r4 = r4 + r2
            com.applovin.impl.sc$a r2 = r12.f7481n
            com.applovin.impl.go$d r3 = r12.f7479l
            com.applovin.impl.go$d r14 = r2.a(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.applovin.impl.go$d r7 = r12.f7479l
            com.applovin.impl.go$b r8 = r12.f7480m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f7485r
            if (r14 == 0) goto L94
            com.applovin.impl.sc$a r13 = r12.f7481n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L98
        L94:
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r0)
        L98:
            r12.f7481n = r13
            com.applovin.impl.rc r13 = r12.f7482o
            if (r13 == 0) goto Lae
            r12.a(r1)
            com.applovin.impl.wd$a r13 = r13.a
            java.lang.Object r14 = r13.a
            java.lang.Object r14 = r12.b(r14)
            com.applovin.impl.wd$a r13 = r13.b(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f7485r = r14
            r12.f7484q = r14
            com.applovin.impl.sc$a r14 = r12.f7481n
            r12.a(r14)
            if (r13 == 0) goto Lc6
            com.applovin.impl.rc r14 = r12.f7482o
            java.lang.Object r14 = com.applovin.impl.a1.a(r14)
            com.applovin.impl.rc r14 = (com.applovin.impl.rc) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sc.a(java.lang.Void, com.applovin.impl.wd, com.applovin.impl.go):void");
    }

    private Object b(Object obj) {
        return (this.f7481n.f7488f == null || !obj.equals(a.f7486g)) ? obj : this.f7481n.f7488f;
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.b2
    public void a(yo yoVar) {
        super.a(yoVar);
        if (this.f7478k) {
            return;
        }
        this.f7483p = true;
        a((Object) null, this.f7477j);
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((rc) rdVar).i();
        if (rdVar == this.f7482o) {
            this.f7482o = null;
        }
    }

    private void a(long j3) {
        rc rcVar = this.f7482o;
        int a10 = this.f7481n.a(rcVar.a.a);
        if (a10 == -1) {
            return;
        }
        long j10 = this.f7481n.a(a10, this.f7480m).f4959d;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        rcVar.e(j3);
    }
}
