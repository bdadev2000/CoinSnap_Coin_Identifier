package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.v2;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class t extends k1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26276l;

    /* renamed from: m, reason: collision with root package name */
    public final w2 f26277m;

    /* renamed from: n, reason: collision with root package name */
    public final v2 f26278n;

    /* renamed from: o, reason: collision with root package name */
    public r f26279o;

    /* renamed from: p, reason: collision with root package name */
    public q f26280p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26281q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26282r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26283s;

    public t(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.h()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26276l = z11;
        this.f26277m = new w2();
        this.f26278n = new v2();
        x2 f10 = aVar.f();
        if (f10 != null) {
            this.f26279o = new r(f10, null, null);
            this.f26283s = true;
        } else {
            this.f26279o = new r(new s(aVar.g()), w2.f24833t, r.f26257g);
        }
    }

    public final void A(long j3) {
        q qVar = this.f26280p;
        int b3 = this.f26279o.b(qVar.f26246b.a);
        if (b3 == -1) {
            return;
        }
        r rVar = this.f26279o;
        v2 v2Var = this.f26278n;
        rVar.f(b3, v2Var, false);
        long j10 = v2Var.f24788f;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        qVar.f26252i = j3;
    }

    @Override // v8.j, v8.a
    public final void i() {
    }

    @Override // v8.a
    public final void m(w wVar) {
        ((q) wVar).d();
        if (wVar == this.f26280p) {
            this.f26280p = null;
        }
    }

    @Override // v8.j, v8.a
    public final void o() {
        this.f26282r = false;
        this.f26281q = false;
        super.o();
    }

    @Override // v8.k1
    public final z w(z zVar) {
        Object obj = zVar.a;
        Object obj2 = this.f26279o.f26259f;
        if (obj2 != null && obj2.equals(obj)) {
            obj = r.f26257g;
        }
        return zVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    @Override // v8.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(s7.x2 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f26282r
            if (r0 == 0) goto L1c
            v8.r r0 = r14.f26279o
            v8.r r1 = new v8.r
            java.lang.Object r2 = r0.f26258d
            java.lang.Object r0 = r0.f26259f
            r1.<init>(r15, r2, r0)
            r14.f26279o = r1
            v8.q r15 = r14.f26280p
            if (r15 == 0) goto Lbb
            long r0 = r15.f26252i
            r14.A(r0)
            goto Lbb
        L1c:
            boolean r0 = r15.p()
            if (r0 == 0) goto L40
            boolean r0 = r14.f26283s
            if (r0 == 0) goto L32
            v8.r r0 = r14.f26279o
            v8.r r1 = new v8.r
            java.lang.Object r2 = r0.f26258d
            java.lang.Object r0 = r0.f26259f
            r1.<init>(r15, r2, r0)
            goto L3c
        L32:
            java.lang.Object r0 = s7.w2.f24833t
            java.lang.Object r1 = v8.r.f26257g
            v8.r r2 = new v8.r
            r2.<init>(r15, r0, r1)
            r1 = r2
        L3c:
            r14.f26279o = r1
            goto Lbb
        L40:
            r0 = 0
            s7.w2 r1 = r14.f26277m
            r15.m(r0, r1)
            long r2 = r1.f24851o
            java.lang.Object r4 = r1.f24839b
            v8.q r5 = r14.f26280p
            if (r5 == 0) goto L6c
            v8.r r6 = r14.f26279o
            v8.z r7 = r5.f26246b
            java.lang.Object r7 = r7.a
            s7.v2 r8 = r14.f26278n
            r6.g(r7, r8)
            long r6 = r8.f24789g
            long r8 = r5.f26247c
            long r6 = r6 + r8
            v8.r r5 = r14.f26279o
            s7.w2 r0 = r5.m(r0, r1)
            long r0 = r0.f24851o
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L6c
            r12 = r6
            goto L6d
        L6c:
            r12 = r2
        L6d:
            s7.w2 r9 = r14.f26277m
            s7.v2 r10 = r14.f26278n
            r11 = 0
            r8 = r15
            android.util.Pair r0 = r8.i(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.f26283s
            if (r0 == 0) goto L91
            v8.r r0 = r14.f26279o
            v8.r r1 = new v8.r
            java.lang.Object r4 = r0.f26258d
            java.lang.Object r0 = r0.f26259f
            r1.<init>(r15, r4, r0)
            goto L97
        L91:
            v8.r r0 = new v8.r
            r0.<init>(r15, r4, r1)
            r1 = r0
        L97:
            r14.f26279o = r1
            v8.q r15 = r14.f26280p
            if (r15 == 0) goto Lbb
            r14.A(r2)
            v8.z r15 = r15.f26246b
            java.lang.Object r0 = r15.a
            v8.r r1 = r14.f26279o
            java.lang.Object r1 = r1.f26259f
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = v8.r.f26257g
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lb6
            v8.r r0 = r14.f26279o
            java.lang.Object r0 = r0.f26259f
        Lb6:
            v8.z r15 = r15.b(r0)
            goto Lbc
        Lbb:
            r15 = 0
        Lbc:
            r0 = 1
            r14.f26283s = r0
            r14.f26282r = r0
            v8.r r0 = r14.f26279o
            r14.l(r0)
            if (r15 == 0) goto Ld0
            v8.q r0 = r14.f26280p
            r0.getClass()
            r0.c(r15)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.t.x(s7.x2):void");
    }

    @Override // v8.k1
    public final void y() {
        if (!this.f26276l) {
            this.f26281q = true;
            v(null, this.f26189k);
        }
    }

    @Override // v8.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q a(z zVar, m9.q qVar, long j3) {
        boolean z10;
        q qVar2 = new q(zVar, qVar, j3);
        if (qVar2.f26249f == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        a aVar = this.f26189k;
        qVar2.f26249f = aVar;
        if (this.f26282r) {
            Object obj = this.f26279o.f26259f;
            Object obj2 = zVar.a;
            if (obj != null && obj2.equals(r.f26257g)) {
                obj2 = this.f26279o.f26259f;
            }
            qVar2.c(zVar.b(obj2));
        } else {
            this.f26280p = qVar2;
            if (!this.f26281q) {
                this.f26281q = true;
                v(null, aVar);
            }
        }
        return qVar2;
    }
}
