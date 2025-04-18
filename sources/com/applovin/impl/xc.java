package com.applovin.impl;

import com.applovin.impl.be;
import com.applovin.impl.fo;

/* loaded from: classes3.dex */
public final class xc extends b4 {

    /* renamed from: j, reason: collision with root package name */
    private final be f27880j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27881k;

    /* renamed from: l, reason: collision with root package name */
    private final fo.d f27882l;

    /* renamed from: m, reason: collision with root package name */
    private final fo.b f27883m;

    /* renamed from: n, reason: collision with root package name */
    private a f27884n;

    /* renamed from: o, reason: collision with root package name */
    private wc f27885o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f27886p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27887q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27888r;

    /* loaded from: classes3.dex */
    public static final class a extends i9 {

        /* renamed from: g, reason: collision with root package name */
        public static final Object f27889g = new Object();
        private final Object d;

        /* renamed from: f, reason: collision with root package name */
        private final Object f27890f;

        private a(fo foVar, Object obj, Object obj2) {
            super(foVar);
            this.d = obj;
            this.f27890f = obj2;
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public Object b(int i2) {
            Object b2 = this.f24435c.b(i2);
            return xp.a(b2, this.f27890f) ? f27889g : b2;
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public int a(Object obj) {
            Object obj2;
            fo foVar = this.f24435c;
            if (f27889g.equals(obj) && (obj2 = this.f27890f) != null) {
                obj = obj2;
            }
            return foVar.a(obj);
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public fo.b a(int i2, fo.b bVar, boolean z2) {
            this.f24435c.a(i2, bVar, z2);
            if (xp.a(bVar.f23949b, this.f27890f) && z2) {
                bVar.f23949b = f27889g;
            }
            return bVar;
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public fo.d a(int i2, fo.d dVar, long j2) {
            this.f24435c.a(i2, dVar, j2);
            if (xp.a(dVar.f23961a, this.d)) {
                dVar.f23961a = fo.d.f23957s;
            }
            return dVar;
        }

        public static a a(td tdVar) {
            return new a(new b(tdVar), fo.d.f23957s, f27889g);
        }

        public static a a(fo foVar, Object obj, Object obj2) {
            return new a(foVar, obj, obj2);
        }

        public a a(fo foVar) {
            return new a(foVar, this.d, this.f27890f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends fo {

        /* renamed from: c, reason: collision with root package name */
        private final td f27891c;

        public b(td tdVar) {
            this.f27891c = tdVar;
        }

        @Override // com.applovin.impl.fo
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.fo
        public int a(Object obj) {
            return obj == a.f27889g ? 0 : -1;
        }

        @Override // com.applovin.impl.fo
        public Object b(int i2) {
            return a.f27889g;
        }

        @Override // com.applovin.impl.fo
        public fo.b a(int i2, fo.b bVar, boolean z2) {
            bVar.a(z2 ? 0 : null, z2 ? a.f27889g : null, 0, -9223372036854775807L, 0L, u.f27217h, true);
            return bVar;
        }

        @Override // com.applovin.impl.fo
        public fo.d a(int i2, fo.d dVar, long j2) {
            dVar.a(fo.d.f23957s, this.f27891c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f23971m = true;
            return dVar;
        }
    }

    public xc(be beVar, boolean z2) {
        this.f27880j = beVar;
        this.f27881k = z2 && beVar.c();
        this.f27882l = new fo.d();
        this.f27883m = new fo.b();
        fo d = beVar.d();
        if (d == null) {
            this.f27884n = a.a(beVar.a());
        } else {
            this.f27884n = a.a(d, (Object) null, (Object) null);
            this.f27888r = true;
        }
    }

    @Override // com.applovin.impl.be
    public void b() {
    }

    @Override // com.applovin.impl.b4, com.applovin.impl.c2
    public void h() {
        this.f27887q = false;
        this.f27886p = false;
        super.h();
    }

    public fo i() {
        return this.f27884n;
    }

    private Object a(Object obj) {
        return (this.f27884n.f27890f == null || !this.f27884n.f27890f.equals(obj)) ? obj : a.f27889g;
    }

    @Override // com.applovin.impl.be
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wc a(be.a aVar, n0 n0Var, long j2) {
        wc wcVar = new wc(aVar, n0Var, j2);
        wcVar.a(this.f27880j);
        if (this.f27887q) {
            wcVar.a(aVar.b(b(aVar.f28191a)));
        } else {
            this.f27885o = wcVar;
            if (!this.f27886p) {
                this.f27886p = true;
                a((Object) null, this.f27880j);
            }
        }
        return wcVar;
    }

    @Override // com.applovin.impl.be
    public td a() {
        return this.f27880j.a();
    }

    private Object b(Object obj) {
        return (this.f27884n.f27890f == null || !obj.equals(a.f27889g)) ? obj : this.f27884n.f27890f;
    }

    @Override // com.applovin.impl.b4
    public be.a a(Void r1, be.a aVar) {
        return aVar.b(a(aVar.f28191a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // com.applovin.impl.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Void r13, com.applovin.impl.be r14, com.applovin.impl.fo r15) {
        /*
            r12 = this;
            boolean r13 = r12.f27887q
            if (r13 == 0) goto L19
            com.applovin.impl.xc$a r13 = r12.f27884n
            com.applovin.impl.xc$a r13 = r13.a(r15)
            r12.f27884n = r13
            com.applovin.impl.wc r13 = r12.f27885o
            if (r13 == 0) goto Lae
            long r13 = r13.c()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.c()
            if (r13 == 0) goto L36
            boolean r13 = r12.f27888r
            if (r13 == 0) goto L2a
            com.applovin.impl.xc$a r13 = r12.f27884n
            com.applovin.impl.xc$a r13 = r13.a(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.applovin.impl.fo.d.f23957s
            java.lang.Object r14 = com.applovin.impl.xc.a.f27889g
            com.applovin.impl.xc$a r13 = com.applovin.impl.xc.a.a(r15, r13, r14)
        L32:
            r12.f27884n = r13
            goto Lae
        L36:
            com.applovin.impl.fo$d r13 = r12.f27882l
            r14 = 0
            r15.a(r14, r13)
            com.applovin.impl.fo$d r13 = r12.f27882l
            long r0 = r13.c()
            com.applovin.impl.fo$d r13 = r12.f27882l
            java.lang.Object r13 = r13.f23961a
            com.applovin.impl.wc r2 = r12.f27885o
            if (r2 == 0) goto L74
            long r2 = r2.d()
            com.applovin.impl.xc$a r4 = r12.f27884n
            com.applovin.impl.wc r5 = r12.f27885o
            com.applovin.impl.be$a r5 = r5.f27712a
            java.lang.Object r5 = r5.f28191a
            com.applovin.impl.fo$b r6 = r12.f27883m
            r4.a(r5, r6)
            com.applovin.impl.fo$b r4 = r12.f27883m
            long r4 = r4.e()
            long r4 = r4 + r2
            com.applovin.impl.xc$a r2 = r12.f27884n
            com.applovin.impl.fo$d r3 = r12.f27882l
            com.applovin.impl.fo$d r14 = r2.a(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.applovin.impl.fo$d r7 = r12.f27882l
            com.applovin.impl.fo$b r8 = r12.f27883m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f27888r
            if (r14 == 0) goto L94
            com.applovin.impl.xc$a r13 = r12.f27884n
            com.applovin.impl.xc$a r13 = r13.a(r15)
            goto L98
        L94:
            com.applovin.impl.xc$a r13 = com.applovin.impl.xc.a.a(r15, r13, r0)
        L98:
            r12.f27884n = r13
            com.applovin.impl.wc r13 = r12.f27885o
            if (r13 == 0) goto Lae
            r12.a(r1)
            com.applovin.impl.be$a r13 = r13.f27712a
            java.lang.Object r14 = r13.f28191a
            java.lang.Object r14 = r12.b(r14)
            com.applovin.impl.be$a r13 = r13.b(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f27888r = r14
            r12.f27887q = r14
            com.applovin.impl.xc$a r14 = r12.f27884n
            r12.a(r14)
            if (r13 == 0) goto Lc6
            com.applovin.impl.wc r14 = r12.f27885o
            java.lang.Object r14 = com.applovin.impl.b1.a(r14)
            com.applovin.impl.wc r14 = (com.applovin.impl.wc) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xc.a(java.lang.Void, com.applovin.impl.be, com.applovin.impl.fo):void");
    }

    @Override // com.applovin.impl.b4, com.applovin.impl.c2
    public void a(xo xoVar) {
        super.a(xoVar);
        if (this.f27881k) {
            return;
        }
        this.f27886p = true;
        a((Object) null, this.f27880j);
    }

    @Override // com.applovin.impl.be
    public void a(wd wdVar) {
        ((wc) wdVar).i();
        if (wdVar == this.f27885o) {
            this.f27885o = null;
        }
    }

    private void a(long j2) {
        wc wcVar = this.f27885o;
        int a2 = this.f27884n.a(wcVar.f27712a.f28191a);
        if (a2 == -1) {
            return;
        }
        long j3 = this.f27884n.a(a2, this.f27883m).d;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        wcVar.e(j2);
    }
}
