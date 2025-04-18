package e1;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class s0 extends f1.b implements l0, h, f1.s {

    /* renamed from: f, reason: collision with root package name */
    public final int f30334f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30335g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30336h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f30337i;

    /* renamed from: j, reason: collision with root package name */
    public long f30338j;

    /* renamed from: k, reason: collision with root package name */
    public long f30339k;

    /* renamed from: l, reason: collision with root package name */
    public int f30340l;

    /* renamed from: m, reason: collision with root package name */
    public int f30341m;

    public s0(int i2, int i3, int i4) {
        this.f30334f = i2;
        this.f30335g = i3;
        this.f30336h = i4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:26|(2:31|32)|34|(1:36)|15|16|17|18|(0)(1:20))(0))|23)(2:37|38))(5:39|40|17|(2:18|(0)(0))|23))(4:41|42|43|44))(1:55)|45|46|16|17|(2:18|(0)(0))|23))|45|46|16|17|(2:18|(0)(0))|23)|57|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0038, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:28:0x0094, B:31:0x009b, B:32:0x009f, B:34:0x00a0, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [e1.s0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [e1.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [f1.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [e1.u0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [e1.u0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i0.a i(e1.s0 r8, e1.i r9, h0.g r10) {
        /*
            boolean r0 = r10 instanceof e1.r0
            if (r0 == 0) goto L13
            r0 = r10
            e1.r0 r0 = (e1.r0) r0
            int r1 = r0.f30330h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30330h = r1
            goto L18
        L13:
            e1.r0 r0 = new e1.r0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f30328f
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30330h
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            b1.h1 r8 = r0.d
            e1.u0 r9 = r0.f30327c
            e1.i r2 = r0.f30326b
            e1.s0 r5 = r0.f30325a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            b1.h1 r8 = r0.d
            e1.u0 r9 = r0.f30327c
            e1.i r2 = r0.f30326b
            e1.s0 r5 = r0.f30325a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            e1.u0 r9 = r0.f30327c
            e1.i r8 = r0.f30326b
            e1.s0 r2 = r0.f30325a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            kotlin.jvm.internal.q.m(r10)
            f1.d r10 = r8.a()
            e1.u0 r10 = (e1.u0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            h0.l r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            b1.a0 r5 = b1.a0.f22285b     // Catch: java.lang.Throwable -> Lb1
            h0.j r2 = r2.i(r5)     // Catch: java.lang.Throwable -> Lb1
            b1.h1 r2 = (b1.h1) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            android.support.v4.media.session.i r6 = e1.t0.f30345a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f30325a = r5     // Catch: java.lang.Throwable -> L38
            r0.f30326b = r2     // Catch: java.lang.Throwable -> L38
            r0.f30327c = r9     // Catch: java.lang.Throwable -> L38
            r0.d = r8     // Catch: java.lang.Throwable -> L38
            r0.f30330h = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return r1
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.n()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f30325a = r5     // Catch: java.lang.Throwable -> L38
            r0.f30326b = r2     // Catch: java.lang.Throwable -> L38
            r0.f30327c = r9     // Catch: java.lang.Throwable -> L38
            r0.d = r8     // Catch: java.lang.Throwable -> L38
            r0.f30330h = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return r1
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.s0.i(e1.s0, e1.i, h0.g):i0.a");
    }

    @Override // e1.l0
    public final boolean b(Object obj) {
        int i2;
        boolean z2;
        h0.g[] gVarArr = f1.c.f30457a;
        synchronized (this) {
            if (p(obj)) {
                gVarArr = l(gVarArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (h0.g gVar : gVarArr) {
            if (gVar != null) {
                gVar.resumeWith(d0.b0.f30125a);
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e1.u0, f1.d] */
    @Override // f1.b
    public final f1.d c() {
        ?? obj = new Object();
        obj.f30350a = -1L;
        return obj;
    }

    @Override // e1.h
    public final Object collect(i iVar, h0.g gVar) {
        return i(this, iVar, gVar);
    }

    @Override // f1.b
    public final f1.d[] d() {
        return new u0[2];
    }

    @Override // e1.l0, e1.i
    public final Object emit(Object obj, h0.g gVar) {
        h0.g[] gVarArr;
        q0 q0Var;
        if (b(obj)) {
            return d0.b0.f30125a;
        }
        b1.l lVar = new b1.l(1, b1.f0.r(gVar));
        lVar.p();
        h0.g[] gVarArr2 = f1.c.f30457a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    lVar.resumeWith(d0.b0.f30125a);
                    gVarArr = l(gVarArr2);
                    q0Var = null;
                } else {
                    q0 q0Var2 = new q0(this, this.f30340l + this.f30341m + m(), obj, lVar);
                    k(q0Var2);
                    this.f30341m++;
                    if (this.f30335g == 0) {
                        gVarArr2 = l(gVarArr2);
                    }
                    gVarArr = gVarArr2;
                    q0Var = q0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (q0Var != null) {
            lVar.z(new b1.i(q0Var, 1));
        }
        for (h0.g gVar2 : gVarArr) {
            if (gVar2 != null) {
                gVar2.resumeWith(d0.b0.f30125a);
            }
        }
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        if (o2 != aVar) {
            o2 = d0.b0.f30125a;
        }
        return o2 == aVar ? o2 : d0.b0.f30125a;
    }

    public final Object g(u0 u0Var, r0 r0Var) {
        b1.l lVar = new b1.l(1, b1.f0.r(r0Var));
        lVar.p();
        synchronized (this) {
            if (q(u0Var) < 0) {
                u0Var.f30351b = lVar;
            } else {
                lVar.resumeWith(d0.b0.f30125a);
            }
        }
        Object o2 = lVar.o();
        return o2 == i0.a.f30806a ? o2 : d0.b0.f30125a;
    }

    public final void h() {
        if (this.f30335g != 0 || this.f30341m > 1) {
            Object[] objArr = this.f30337i;
            p0.a.p(objArr);
            while (this.f30341m > 0) {
                long m2 = m();
                int i2 = this.f30340l;
                int i3 = this.f30341m;
                if (objArr[((int) ((m2 + (i2 + i3)) - 1)) & (objArr.length - 1)] != t0.f30345a) {
                    return;
                }
                this.f30341m = i3 - 1;
                t0.d(objArr, m() + this.f30340l + this.f30341m, null);
            }
        }
    }

    public final void j() {
        f1.d[] dVarArr;
        Object[] objArr = this.f30337i;
        p0.a.p(objArr);
        t0.d(objArr, m(), null);
        this.f30340l--;
        long m2 = m() + 1;
        if (this.f30338j < m2) {
            this.f30338j = m2;
        }
        if (this.f30339k < m2) {
            if (this.f30453b != 0 && (dVarArr = this.f30452a) != null) {
                for (f1.d dVar : dVarArr) {
                    if (dVar != null) {
                        u0 u0Var = (u0) dVar;
                        long j2 = u0Var.f30350a;
                        if (j2 >= 0 && j2 < m2) {
                            u0Var.f30350a = m2;
                        }
                    }
                }
            }
            this.f30339k = m2;
        }
    }

    public final void k(Object obj) {
        int i2 = this.f30340l + this.f30341m;
        Object[] objArr = this.f30337i;
        if (objArr == null) {
            objArr = o(0, 2, null);
        } else if (i2 >= objArr.length) {
            objArr = o(i2, objArr.length * 2, objArr);
        }
        t0.d(objArr, m() + i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final h0.g[] l(h0.g[] gVarArr) {
        f1.d[] dVarArr;
        u0 u0Var;
        b1.l lVar;
        int length = gVarArr.length;
        if (this.f30453b != 0 && (dVarArr = this.f30452a) != null) {
            int length2 = dVarArr.length;
            int i2 = 0;
            gVarArr = gVarArr;
            while (i2 < length2) {
                f1.d dVar = dVarArr[i2];
                if (dVar != null && (lVar = (u0Var = (u0) dVar).f30351b) != null && q(u0Var) >= 0) {
                    int length3 = gVarArr.length;
                    gVarArr = gVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(gVarArr, Math.max(2, gVarArr.length * 2));
                        p0.a.r(copyOf, "copyOf(this, newSize)");
                        gVarArr = copyOf;
                    }
                    gVarArr[length] = lVar;
                    u0Var.f30351b = null;
                    length++;
                }
                i2++;
                gVarArr = gVarArr;
            }
        }
        return gVarArr;
    }

    public final long m() {
        return Math.min(this.f30339k, this.f30338j);
    }

    @Override // e1.l0
    public final void n() {
        synchronized (this) {
            s(m() + this.f30340l, this.f30339k, m() + this.f30340l, m() + this.f30340l + this.f30341m);
        }
    }

    public final Object[] o(int i2, int i3, Object[] objArr) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.f30337i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long m2 = m();
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = i4 + m2;
            t0.d(objArr2, j2, objArr[((int) j2) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        int i2 = this.f30453b;
        int i3 = this.f30334f;
        if (i2 == 0) {
            if (i3 != 0) {
                k(obj);
                int i4 = this.f30340l + 1;
                this.f30340l = i4;
                if (i4 > i3) {
                    j();
                }
                this.f30339k = m() + this.f30340l;
            }
            return true;
        }
        int i5 = this.f30340l;
        int i6 = this.f30335g;
        if (i5 >= i6 && this.f30339k <= this.f30338j) {
            int a2 = b1.e0.a(this.f30336h);
            if (a2 == 0) {
                return false;
            }
            if (a2 == 2) {
                return true;
            }
        }
        k(obj);
        int i7 = this.f30340l + 1;
        this.f30340l = i7;
        if (i7 > i6) {
            j();
        }
        long m2 = m() + this.f30340l;
        long j2 = this.f30338j;
        if (((int) (m2 - j2)) > i3) {
            s(j2 + 1, this.f30339k, m() + this.f30340l, m() + this.f30340l + this.f30341m);
        }
        return true;
    }

    public final long q(u0 u0Var) {
        long j2 = u0Var.f30350a;
        if (j2 < m() + this.f30340l) {
            return j2;
        }
        if (this.f30335g <= 0 && j2 <= m() && this.f30341m != 0) {
            return j2;
        }
        return -1L;
    }

    public final Object r(u0 u0Var) {
        Object obj;
        h0.g[] gVarArr = f1.c.f30457a;
        synchronized (this) {
            long q2 = q(u0Var);
            if (q2 < 0) {
                obj = t0.f30345a;
            } else {
                long j2 = u0Var.f30350a;
                Object[] objArr = this.f30337i;
                p0.a.p(objArr);
                Object obj2 = objArr[((int) q2) & (objArr.length - 1)];
                if (obj2 instanceof q0) {
                    obj2 = ((q0) obj2).f30322c;
                }
                u0Var.f30350a = q2 + 1;
                Object obj3 = obj2;
                gVarArr = t(j2);
                obj = obj3;
            }
        }
        for (h0.g gVar : gVarArr) {
            if (gVar != null) {
                gVar.resumeWith(d0.b0.f30125a);
            }
        }
        return obj;
    }

    public final void s(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        for (long m2 = m(); m2 < min; m2++) {
            Object[] objArr = this.f30337i;
            p0.a.p(objArr);
            t0.d(objArr, m2, null);
        }
        this.f30338j = j2;
        this.f30339k = j3;
        this.f30340l = (int) (j4 - min);
        this.f30341m = (int) (j5 - j4);
    }

    public final h0.g[] t(long j2) {
        long j3;
        long j4;
        h0.g[] gVarArr;
        long j5;
        f1.d[] dVarArr;
        long j6 = this.f30339k;
        h0.g[] gVarArr2 = f1.c.f30457a;
        if (j2 > j6) {
            return gVarArr2;
        }
        long m2 = m();
        long j7 = this.f30340l + m2;
        int i2 = this.f30335g;
        if (i2 == 0 && this.f30341m > 0) {
            j7++;
        }
        if (this.f30453b != 0 && (dVarArr = this.f30452a) != null) {
            for (f1.d dVar : dVarArr) {
                if (dVar != null) {
                    long j8 = ((u0) dVar).f30350a;
                    if (j8 >= 0 && j8 < j7) {
                        j7 = j8;
                    }
                }
            }
        }
        if (j7 <= this.f30339k) {
            return gVarArr2;
        }
        long m3 = m() + this.f30340l;
        int min = this.f30453b > 0 ? Math.min(this.f30341m, i2 - ((int) (m3 - j7))) : this.f30341m;
        long j9 = this.f30341m + m3;
        android.support.v4.media.session.i iVar = t0.f30345a;
        if (min > 0) {
            h0.g[] gVarArr3 = new h0.g[min];
            Object[] objArr = this.f30337i;
            p0.a.p(objArr);
            long j10 = m3;
            int i3 = 0;
            while (true) {
                if (m3 >= j9) {
                    j3 = j7;
                    j4 = j9;
                    break;
                }
                j3 = j7;
                Object obj = objArr[((int) m3) & (objArr.length - 1)];
                if (obj != iVar) {
                    p0.a.q(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    q0 q0Var = (q0) obj;
                    int i4 = i3 + 1;
                    j4 = j9;
                    gVarArr3[i3] = q0Var.d;
                    t0.d(objArr, m3, iVar);
                    t0.d(objArr, j10, q0Var.f30322c);
                    j5 = 1;
                    j10++;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j4 = j9;
                    j5 = 1;
                }
                m3 += j5;
                j7 = j3;
                j9 = j4;
            }
            gVarArr = gVarArr3;
            m3 = j10;
        } else {
            j3 = j7;
            j4 = j9;
            gVarArr = gVarArr2;
        }
        int i5 = (int) (m3 - m2);
        long j11 = this.f30453b == 0 ? m3 : j3;
        long max = Math.max(this.f30338j, m3 - Math.min(this.f30334f, i5));
        if (i2 == 0 && max < j4) {
            Object[] objArr2 = this.f30337i;
            p0.a.p(objArr2);
            if (p0.a.g(objArr2[((int) max) & (objArr2.length - 1)], iVar)) {
                m3++;
                max++;
            }
        }
        s(max, j11, m3, j4);
        h();
        return (gVarArr.length == 0) ^ true ? l(gVarArr) : gVarArr;
    }
}
