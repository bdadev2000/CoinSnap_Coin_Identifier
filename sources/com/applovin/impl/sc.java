package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public final class sc extends z3 {

    /* renamed from: j, reason: collision with root package name */
    private final wd f10618j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f10619k;
    private final go.d l;
    private final go.b m;

    /* renamed from: n, reason: collision with root package name */
    private a f10620n;

    /* renamed from: o, reason: collision with root package name */
    private rc f10621o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10622p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10623q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10624r;

    /* loaded from: classes.dex */
    public static final class a extends g9 {

        /* renamed from: g, reason: collision with root package name */
        public static final Object f10625g = new Object();

        /* renamed from: d, reason: collision with root package name */
        private final Object f10626d;

        /* renamed from: f, reason: collision with root package name */
        private final Object f10627f;

        private a(go goVar, Object obj, Object obj2) {
            super(goVar);
            this.f10626d = obj;
            this.f10627f = obj2;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public Object b(int i9) {
            Object b = this.f7798c.b(i9);
            if (yp.a(b, this.f10627f)) {
                return f10625g;
            }
            return b;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public int a(Object obj) {
            Object obj2;
            go goVar = this.f7798c;
            if (f10625g.equals(obj) && (obj2 = this.f10627f) != null) {
                obj = obj2;
            }
            return goVar.a(obj);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i9, go.b bVar, boolean z8) {
            this.f7798c.a(i9, bVar, z8);
            if (yp.a(bVar.b, this.f10627f) && z8) {
                bVar.b = f10625g;
            }
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i9, go.d dVar, long j7) {
            this.f7798c.a(i9, dVar, j7);
            if (yp.a(dVar.f7947a, this.f10626d)) {
                dVar.f7947a = go.d.f7943s;
            }
            return dVar;
        }

        public static a a(od odVar) {
            return new a(new b(odVar), go.d.f7943s, f10625g);
        }

        public static a a(go goVar, Object obj, Object obj2) {
            return new a(goVar, obj, obj2);
        }

        public a a(go goVar) {
            return new a(goVar, this.f10626d, this.f10627f);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends go {

        /* renamed from: c, reason: collision with root package name */
        private final od f10628c;

        public b(od odVar) {
            this.f10628c = odVar;
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
            return obj == a.f10625g ? 0 : -1;
        }

        @Override // com.applovin.impl.go
        public Object b(int i9) {
            return a.f10625g;
        }

        @Override // com.applovin.impl.go
        public go.b a(int i9, go.b bVar, boolean z8) {
            bVar.a(z8 ? 0 : null, z8 ? a.f10625g : null, 0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0L, C0761u.f11516h, true);
            return bVar;
        }

        @Override // com.applovin.impl.go
        public go.d a(int i9, go.d dVar, long j7) {
            dVar.a(go.d.f7943s, this.f10628c, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false, true, null, 0L, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0, 0, 0L);
            dVar.m = true;
            return dVar;
        }
    }

    public sc(wd wdVar, boolean z8) {
        boolean z9;
        this.f10618j = wdVar;
        if (z8 && wdVar.c()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f10619k = z9;
        this.l = new go.d();
        this.m = new go.b();
        go d2 = wdVar.d();
        if (d2 != null) {
            this.f10620n = a.a(d2, (Object) null, (Object) null);
            this.f10624r = true;
        } else {
            this.f10620n = a.a(wdVar.a());
        }
    }

    @Override // com.applovin.impl.wd
    public void b() {
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.AbstractC0675b2
    public void h() {
        this.f10623q = false;
        this.f10622p = false;
        super.h();
    }

    public go i() {
        return this.f10620n;
    }

    private Object a(Object obj) {
        return (this.f10620n.f10627f == null || !this.f10620n.f10627f.equals(obj)) ? obj : a.f10625g;
    }

    @Override // com.applovin.impl.wd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rc a(wd.a aVar, InterfaceC0727n0 interfaceC0727n0, long j7) {
        rc rcVar = new rc(aVar, interfaceC0727n0, j7);
        rcVar.a(this.f10618j);
        if (this.f10623q) {
            rcVar.a(aVar.b(b(aVar.f11475a)));
        } else {
            this.f10621o = rcVar;
            if (!this.f10622p) {
                this.f10622p = true;
                a((Object) null, this.f10618j);
            }
        }
        return rcVar;
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.f10618j.a();
    }

    @Override // com.applovin.impl.z3
    public wd.a a(Void r12, wd.a aVar) {
        return aVar.b(a(aVar.f11475a));
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
            boolean r13 = r12.f10623q
            if (r13 == 0) goto L19
            com.applovin.impl.sc$a r13 = r12.f10620n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            r12.f10620n = r13
            com.applovin.impl.rc r13 = r12.f10621o
            if (r13 == 0) goto Lae
            long r13 = r13.c()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.c()
            if (r13 == 0) goto L36
            boolean r13 = r12.f10624r
            if (r13 == 0) goto L2a
            com.applovin.impl.sc$a r13 = r12.f10620n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.applovin.impl.go.d.f7943s
            java.lang.Object r14 = com.applovin.impl.sc.a.f10625g
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r14)
        L32:
            r12.f10620n = r13
            goto Lae
        L36:
            com.applovin.impl.go$d r13 = r12.l
            r14 = 0
            r15.a(r14, r13)
            com.applovin.impl.go$d r13 = r12.l
            long r0 = r13.c()
            com.applovin.impl.go$d r13 = r12.l
            java.lang.Object r13 = r13.f7947a
            com.applovin.impl.rc r2 = r12.f10621o
            if (r2 == 0) goto L74
            long r2 = r2.d()
            com.applovin.impl.sc$a r4 = r12.f10620n
            com.applovin.impl.rc r5 = r12.f10621o
            com.applovin.impl.wd$a r5 = r5.f10482a
            java.lang.Object r5 = r5.f11475a
            com.applovin.impl.go$b r6 = r12.m
            r4.a(r5, r6)
            com.applovin.impl.go$b r4 = r12.m
            long r4 = r4.e()
            long r4 = r4 + r2
            com.applovin.impl.sc$a r2 = r12.f10620n
            com.applovin.impl.go$d r3 = r12.l
            com.applovin.impl.go$d r14 = r2.a(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.applovin.impl.go$d r7 = r12.l
            com.applovin.impl.go$b r8 = r12.m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f10624r
            if (r14 == 0) goto L94
            com.applovin.impl.sc$a r13 = r12.f10620n
            com.applovin.impl.sc$a r13 = r13.a(r15)
            goto L98
        L94:
            com.applovin.impl.sc$a r13 = com.applovin.impl.sc.a.a(r15, r13, r0)
        L98:
            r12.f10620n = r13
            com.applovin.impl.rc r13 = r12.f10621o
            if (r13 == 0) goto Lae
            r12.a(r1)
            com.applovin.impl.wd$a r13 = r13.f10482a
            java.lang.Object r14 = r13.f11475a
            java.lang.Object r14 = r12.b(r14)
            com.applovin.impl.wd$a r13 = r13.b(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f10624r = r14
            r12.f10623q = r14
            com.applovin.impl.sc$a r14 = r12.f10620n
            r12.a(r14)
            if (r13 == 0) goto Lc6
            com.applovin.impl.rc r14 = r12.f10621o
            java.lang.Object r14 = com.applovin.impl.AbstractC0669a1.a(r14)
            com.applovin.impl.rc r14 = (com.applovin.impl.rc) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sc.a(java.lang.Void, com.applovin.impl.wd, com.applovin.impl.go):void");
    }

    private Object b(Object obj) {
        return (this.f10620n.f10627f == null || !obj.equals(a.f10625g)) ? obj : this.f10620n.f10627f;
    }

    @Override // com.applovin.impl.z3, com.applovin.impl.AbstractC0675b2
    public void a(yo yoVar) {
        super.a(yoVar);
        if (this.f10619k) {
            return;
        }
        this.f10622p = true;
        a((Object) null, this.f10618j);
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((rc) rdVar).i();
        if (rdVar == this.f10621o) {
            this.f10621o = null;
        }
    }

    private void a(long j7) {
        rc rcVar = this.f10621o;
        int a6 = this.f10620n.a(rcVar.f10482a.f11475a);
        if (a6 == -1) {
            return;
        }
        long j9 = this.f10620n.a(a6, this.m).f7935d;
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 >= j9) {
            j7 = Math.max(0L, j9 - 1);
        }
        rcVar.e(j7);
    }
}
