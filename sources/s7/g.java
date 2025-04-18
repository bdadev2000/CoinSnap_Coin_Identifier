package s7;

/* loaded from: classes3.dex */
public abstract class g implements i2 {

    /* renamed from: c, reason: collision with root package name */
    public final int f24359c;

    /* renamed from: f, reason: collision with root package name */
    public o2 f24361f;

    /* renamed from: g, reason: collision with root package name */
    public int f24362g;

    /* renamed from: h, reason: collision with root package name */
    public t7.x f24363h;

    /* renamed from: i, reason: collision with root package name */
    public int f24364i;

    /* renamed from: j, reason: collision with root package name */
    public v8.z0 f24365j;

    /* renamed from: k, reason: collision with root package name */
    public r0[] f24366k;

    /* renamed from: l, reason: collision with root package name */
    public long f24367l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24369n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24370o;

    /* renamed from: p, reason: collision with root package name */
    public n2 f24371p;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24358b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final r4.c f24360d = new r4.c(14, 0);

    /* renamed from: m, reason: collision with root package name */
    public long f24368m = Long.MIN_VALUE;

    public g(int i10) {
        this.f24359c = i10;
    }

    public static int b(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 0 | 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.r c(int r13, s7.r0 r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f24370o
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f24370o = r3
            r3 = 0
            int r4 = r12.w(r14)     // Catch: java.lang.Throwable -> L16 s7.r -> L1b
            r4 = r4 & 7
            r1.f24370o = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f24370o = r3
            throw r2
        L1b:
            r1.f24370o = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.f()
            int r7 = r1.f24362g
            s7.r r11 = new s7.r
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.g.c(int, s7.r0, java.lang.Exception, boolean):s7.r");
    }

    public final r d(k8.w wVar, r0 r0Var) {
        return c(4002, r0Var, wVar, false);
    }

    public n9.p e() {
        return null;
    }

    public abstract String f();

    public final boolean g() {
        return this.f24368m == Long.MIN_VALUE;
    }

    public abstract boolean h();

    @Override // s7.i2
    public void handleMessage(int i10, Object obj) {
    }

    public abstract boolean i();

    public abstract void j();

    public void k(boolean z10, boolean z11) {
    }

    public abstract void l(long j3, boolean z10);

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public abstract void q(r0[] r0VarArr, long j3, long j10);

    public final int r(r4.c cVar, w7.i iVar, int i10) {
        v8.z0 z0Var = this.f24365j;
        z0Var.getClass();
        int d10 = z0Var.d(cVar, iVar, i10);
        if (d10 == -4) {
            if (iVar.c(4)) {
                this.f24368m = Long.MIN_VALUE;
                if (this.f24369n) {
                    return -4;
                }
                return -3;
            }
            long j3 = iVar.f26892h + this.f24367l;
            iVar.f26892h = j3;
            this.f24368m = Math.max(this.f24368m, j3);
        } else if (d10 == -5) {
            r0 r0Var = (r0) cVar.f24000d;
            r0Var.getClass();
            if (r0Var.f24727r != Long.MAX_VALUE) {
                q0 a = r0Var.a();
                a.f24671o = r0Var.f24727r + this.f24367l;
                cVar.f24000d = a.a();
            }
        }
        return d10;
    }

    public abstract void s(long j3, long j10);

    public final void t(r0[] r0VarArr, v8.z0 z0Var, long j3, long j10) {
        v8.u0.m(!this.f24369n);
        this.f24365j = z0Var;
        if (this.f24368m == Long.MIN_VALUE) {
            this.f24368m = j3;
        }
        this.f24366k = r0VarArr;
        this.f24367l = j10;
        q(r0VarArr, j3, j10);
    }

    public final void u() {
        boolean z10;
        if (this.f24364i == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.m(z10);
        this.f24360d.i();
        n();
    }

    public /* bridge */ /* synthetic */ void v(float f10, float f11) {
    }

    public abstract int w(r0 r0Var);

    public int x() {
        return 0;
    }
}
