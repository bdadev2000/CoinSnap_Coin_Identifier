package v8;

import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s7.p2;
import s7.x1;

/* loaded from: classes3.dex */
public final class p0 implements w, y7.n, m9.i0, m9.l0, x0 {
    public static final Map O;
    public static final s7.r0 P;
    public y7.x A;
    public boolean C;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public long I;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f26223b;

    /* renamed from: c, reason: collision with root package name */
    public final m9.l f26224c;

    /* renamed from: d, reason: collision with root package name */
    public final x7.u f26225d;

    /* renamed from: f, reason: collision with root package name */
    public final ac.e f26226f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.c f26227g;

    /* renamed from: h, reason: collision with root package name */
    public final x7.q f26228h;

    /* renamed from: i, reason: collision with root package name */
    public final r0 f26229i;

    /* renamed from: j, reason: collision with root package name */
    public final m9.q f26230j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26231k;

    /* renamed from: l, reason: collision with root package name */
    public final long f26232l;

    /* renamed from: n, reason: collision with root package name */
    public final h.c f26234n;

    /* renamed from: s, reason: collision with root package name */
    public v f26239s;

    /* renamed from: t, reason: collision with root package name */
    public p8.b f26240t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26242w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26243x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26244y;

    /* renamed from: z, reason: collision with root package name */
    public o0 f26245z;

    /* renamed from: m, reason: collision with root package name */
    public final m9.n0 f26233m = new m9.n0("ProgressiveMediaPeriod");

    /* renamed from: o, reason: collision with root package name */
    public final a4.g0 f26235o = new a4.g0(3);

    /* renamed from: p, reason: collision with root package name */
    public final k0 f26236p = new k0(this, 0);

    /* renamed from: q, reason: collision with root package name */
    public final k0 f26237q = new k0(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final Handler f26238r = n9.h0.j(null);

    /* renamed from: v, reason: collision with root package name */
    public n0[] f26241v = new n0[0];
    public y0[] u = new y0[0];
    public long J = C.TIME_UNSET;
    public long B = C.TIME_UNSET;
    public int D = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        O = Collections.unmodifiableMap(hashMap);
        s7.q0 q0Var = new s7.q0();
        q0Var.a = "icy";
        q0Var.f24667k = "application/x-icy";
        P = q0Var.a();
    }

    public p0(Uri uri, m9.l lVar, h.c cVar, x7.u uVar, x7.q qVar, ac.e eVar, f0.c cVar2, r0 r0Var, m9.q qVar2, String str, int i10) {
        this.f26223b = uri;
        this.f26224c = lVar;
        this.f26225d = uVar;
        this.f26228h = qVar;
        this.f26226f = eVar;
        this.f26227g = cVar2;
        this.f26229i = r0Var;
        this.f26230j = qVar2;
        this.f26231k = str;
        this.f26232l = i10;
        this.f26234n = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // m9.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j8.e a(m9.k0 r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            v8.l0 r1 = (v8.l0) r1
            m9.v0 r2 = r1.f26199d
            v8.p r4 = new v8.p
            android.net.Uri r3 = r2.f21778c
            java.util.Map r2 = r2.f21779d
            r4.<init>(r2)
            v8.u r2 = new v8.u
            r6 = 1
            r7 = -1
            r8 = 0
            r9 = 0
            r10 = 0
            long r11 = r1.f26206l
            long r11 = n9.h0.Q(r11)
            long r13 = r0.B
            long r13 = n9.h0.Q(r13)
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            n9.w r3 = new n9.w
            r14 = r22
            r5 = r23
            r3.<init>(r4, r2, r14, r5)
            ac.e r2 = r0.f26226f
            r2.getClass()
            long r2 = ac.e.k(r3)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L48
            j8.e r2 = m9.n0.f21692g
            goto La3
        L48:
            int r7 = r16.f()
            int r10 = r0.L
            if (r7 <= r10) goto L52
            r10 = r9
            goto L53
        L52:
            r10 = r8
        L53:
            boolean r11 = r0.H
            if (r11 != 0) goto L95
            y7.x r11 = r0.A
            if (r11 == 0) goto L64
            long r11 = r11.getDurationUs()
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L64
            goto L95
        L64:
            boolean r5 = r0.f26243x
            if (r5 == 0) goto L72
            boolean r5 = r16.p()
            if (r5 != 0) goto L72
            r0.K = r9
            r5 = r8
            goto L98
        L72:
            boolean r5 = r0.f26243x
            r0.F = r5
            r5 = 0
            r0.I = r5
            r0.L = r8
            v8.y0[] r7 = r0.u
            int r11 = r7.length
            r12 = r8
        L80:
            if (r12 >= r11) goto L8a
            r13 = r7[r12]
            r13.t(r8)
            int r12 = r12 + 1
            goto L80
        L8a:
            y7.p r7 = r1.f26203i
            r7.a = r5
            r1.f26206l = r5
            r1.f26205k = r9
            r1.f26209o = r8
            goto L97
        L95:
            r0.L = r7
        L97:
            r5 = r9
        L98:
            if (r5 == 0) goto La1
            j8.e r5 = new j8.e
            r5.<init>(r10, r2, r8)
            r2 = r5
            goto La3
        La1:
            j8.e r2 = m9.n0.f21691f
        La3:
            int r3 = r2.a
            if (r3 == 0) goto La9
            if (r3 != r9) goto Laa
        La9:
            r8 = r9
        Laa:
            r15 = r8 ^ 1
            f0.c r3 = r0.f26227g
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f26206l
            long r12 = r0.B
            r14 = r22
            r3.p(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.p0.a(m9.k0, long, long, java.io.IOException, int):j8.e");
    }

    @Override // m9.i0
    public final void b(m9.k0 k0Var, long j3, long j10, boolean z10) {
        l0 l0Var = (l0) k0Var;
        m9.v0 v0Var = l0Var.f26199d;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        this.f26226f.getClass();
        this.f26227g.l(pVar, 1, -1, null, 0, null, l0Var.f26206l, this.B);
        if (!z10) {
            for (y0 y0Var : this.u) {
                y0Var.t(false);
            }
            if (this.G > 0) {
                v vVar = this.f26239s;
                vVar.getClass();
                vVar.b(this);
            }
        }
    }

    @Override // m9.i0
    public final void c(m9.k0 k0Var, long j3, long j10) {
        y7.x xVar;
        long j11;
        l0 l0Var = (l0) k0Var;
        if (this.B == C.TIME_UNSET && (xVar = this.A) != null) {
            boolean isSeekable = xVar.isSeekable();
            long g10 = g(true);
            if (g10 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = g10 + 10000;
            }
            this.B = j11;
            this.f26229i.s(j11, isSeekable, this.C);
        }
        m9.v0 v0Var = l0Var.f26199d;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        this.f26226f.getClass();
        this.f26227g.n(pVar, 1, -1, null, 0, null, l0Var.f26206l, this.B);
        this.M = true;
        v vVar = this.f26239s;
        vVar.getClass();
        vVar.b(this);
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        boolean z10;
        if (!this.M) {
            m9.n0 n0Var = this.f26233m;
            if (n0Var.f21695d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !this.K && (!this.f26243x || this.G != 0)) {
                boolean c10 = this.f26235o.c();
                if (!n0Var.a()) {
                    m();
                    return true;
                }
                return c10;
            }
        }
        return false;
    }

    @Override // y7.n
    public final void d(y7.x xVar) {
        this.f26238r.post(new com.facebook.r0(18, this, xVar));
    }

    public final void e() {
        u0.m(this.f26243x);
        this.f26245z.getClass();
        this.A.getClass();
    }

    @Override // y7.n
    public final void endTracks() {
        this.f26242w = true;
        this.f26238r.post(this.f26236p);
    }

    public final int f() {
        int i10 = 0;
        for (y0 y0Var : this.u) {
            i10 += y0Var.f26337q + y0Var.f26336p;
        }
        return i10;
    }

    public final long g(boolean z10) {
        long j3;
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.u.length; i10++) {
            if (!z10) {
                o0 o0Var = this.f26245z;
                o0Var.getClass();
                if (!o0Var.f26220c[i10]) {
                    continue;
                }
            }
            y0 y0Var = this.u[i10];
            synchronized (y0Var) {
                j3 = y0Var.f26341v;
            }
            j10 = Math.max(j10, j3);
        }
        return j10;
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        long j3;
        boolean z10;
        long j10;
        e();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.J;
        }
        if (this.f26244y) {
            int length = this.u.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                o0 o0Var = this.f26245z;
                if (o0Var.f26219b[i10] && o0Var.f26220c[i10]) {
                    y0 y0Var = this.u[i10];
                    synchronized (y0Var) {
                        z10 = y0Var.f26342w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        y0 y0Var2 = this.u[i10];
                        synchronized (y0Var2) {
                            j10 = y0Var2.f26341v;
                        }
                        j3 = Math.min(j3, j10);
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = g(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.I;
        }
        return j3;
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        e();
        return this.f26245z.a;
    }

    public final boolean h() {
        return this.J != C.TIME_UNSET;
    }

    public final void i() {
        s7.r0 r0Var;
        boolean z10;
        l8.b a;
        int i10;
        if (!this.N && !this.f26243x && this.f26242w && this.A != null) {
            y0[] y0VarArr = this.u;
            int length = y0VarArr.length;
            int i11 = 0;
            while (true) {
                s7.r0 r0Var2 = null;
                if (i11 < length) {
                    y0 y0Var = y0VarArr[i11];
                    synchronized (y0Var) {
                        if (!y0Var.f26344y) {
                            r0Var2 = y0Var.B;
                        }
                    }
                    if (r0Var2 == null) {
                        return;
                    } else {
                        i11++;
                    }
                } else {
                    a4.g0 g0Var = this.f26235o;
                    synchronized (g0Var) {
                        g0Var.a = false;
                    }
                    int length2 = this.u.length;
                    i1[] i1VarArr = new i1[length2];
                    boolean[] zArr = new boolean[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        y0 y0Var2 = this.u[i12];
                        synchronized (y0Var2) {
                            if (y0Var2.f26344y) {
                                r0Var = null;
                            } else {
                                r0Var = y0Var2.B;
                            }
                        }
                        r0Var.getClass();
                        String str = r0Var.f24723n;
                        boolean j3 = n9.q.j(str);
                        if (!j3 && !n9.q.l(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        zArr[i12] = z10;
                        this.f26244y = z10 | this.f26244y;
                        p8.b bVar = this.f26240t;
                        if (bVar != null) {
                            if (j3 || this.f26241v[i12].f26214b) {
                                l8.b bVar2 = r0Var.f24721l;
                                if (bVar2 == null) {
                                    a = new l8.b(bVar);
                                } else {
                                    a = bVar2.a(bVar);
                                }
                                s7.q0 q0Var = new s7.q0(r0Var);
                                q0Var.f24665i = a;
                                r0Var = new s7.r0(q0Var);
                            }
                            if (j3 && r0Var.f24717h == -1 && r0Var.f24718i == -1 && (i10 = bVar.f23485b) != -1) {
                                s7.q0 q0Var2 = new s7.q0(r0Var);
                                q0Var2.f24662f = i10;
                                r0Var = new s7.r0(q0Var2);
                            }
                        }
                        int d10 = this.f26225d.d(r0Var);
                        s7.q0 a10 = r0Var.a();
                        a10.F = d10;
                        i1VarArr[i12] = new i1(Integer.toString(i12), a10.a());
                    }
                    this.f26245z = new o0(new j1(i1VarArr), zArr);
                    this.f26243x = true;
                    v vVar = this.f26239s;
                    vVar.getClass();
                    vVar.a(this);
                    return;
                }
            }
        }
    }

    @Override // v8.b1
    public final boolean isLoading() {
        boolean z10;
        if (this.f26233m.a()) {
            a4.g0 g0Var = this.f26235o;
            synchronized (g0Var) {
                z10 = g0Var.a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i10) {
        e();
        o0 o0Var = this.f26245z;
        boolean[] zArr = o0Var.f26221d;
        if (!zArr[i10]) {
            s7.r0 r0Var = o0Var.a.a(i10).f26166f[0];
            this.f26227g.d(n9.q.h(r0Var.f24723n), r0Var, 0, null, this.I);
            zArr[i10] = true;
        }
    }

    public final void k(int i10) {
        e();
        boolean[] zArr = this.f26245z.f26219b;
        if (this.K && zArr[i10] && !this.u[i10].p(false)) {
            this.J = 0L;
            this.K = false;
            this.F = true;
            this.I = 0L;
            this.L = 0;
            for (y0 y0Var : this.u) {
                y0Var.t(false);
            }
            v vVar = this.f26239s;
            vVar.getClass();
            vVar.b(this);
        }
    }

    public final y0 l(n0 n0Var) {
        int length = this.u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (n0Var.equals(this.f26241v[i10])) {
                return this.u[i10];
            }
        }
        x7.u uVar = this.f26225d;
        uVar.getClass();
        x7.q qVar = this.f26228h;
        qVar.getClass();
        y0 y0Var = new y0(this.f26230j, uVar, qVar);
        y0Var.f26326f = this;
        int i11 = length + 1;
        n0[] n0VarArr = (n0[]) Arrays.copyOf(this.f26241v, i11);
        n0VarArr[length] = n0Var;
        this.f26241v = n0VarArr;
        y0[] y0VarArr = (y0[]) Arrays.copyOf(this.u, i11);
        y0VarArr[length] = y0Var;
        this.u = y0VarArr;
        return y0Var;
    }

    public final void m() {
        l0 l0Var = new l0(this, this.f26223b, this.f26224c, this.f26234n, this, this.f26235o);
        if (this.f26243x) {
            u0.m(h());
            long j3 = this.B;
            if (j3 != C.TIME_UNSET && this.J > j3) {
                this.M = true;
                this.J = C.TIME_UNSET;
                return;
            }
            y7.x xVar = this.A;
            xVar.getClass();
            long j10 = xVar.getSeekPoints(this.J).a.f28013b;
            long j11 = this.J;
            l0Var.f26203i.a = j10;
            l0Var.f26206l = j11;
            l0Var.f26205k = true;
            l0Var.f26209o = false;
            for (y0 y0Var : this.u) {
                y0Var.f26340t = this.J;
            }
            this.J = C.TIME_UNSET;
        }
        this.L = f();
        this.f26227g.r(new p(l0Var.f26197b, l0Var.f26207m, this.f26233m.c(l0Var, this, this.f26226f.i(this.D))), 1, -1, null, 0, null, l0Var.f26206l, this.B);
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        int i10 = this.f26226f.i(this.D);
        m9.n0 n0Var = this.f26233m;
        IOException iOException = n0Var.f21695d;
        if (iOException == null) {
            m9.j0 j0Var = n0Var.f21694c;
            if (j0Var != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = j0Var.f21674b;
                }
                IOException iOException2 = j0Var.f21678g;
                if (iOException2 != null && j0Var.f21679h > i10) {
                    throw iOException2;
                }
            }
            if (this.M && !this.f26243x) {
                throw x1.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f26239s = vVar;
        this.f26235o.c();
        m();
    }

    @Override // v8.w
    public final void o(long j3) {
        e();
        if (h()) {
            return;
        }
        boolean[] zArr = this.f26245z.f26220c;
        int length = this.u.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.u[i10].h(j3, zArr[i10]);
        }
    }

    @Override // m9.l0
    public final void onLoaderReleased() {
        for (y0 y0Var : this.u) {
            y0Var.t(true);
            x7.n nVar = y0Var.f26328h;
            if (nVar != null) {
                nVar.e(y0Var.f26325e);
                y0Var.f26328h = null;
                y0Var.f26327g = null;
            }
        }
        h.c cVar = this.f26234n;
        y7.l lVar = (y7.l) cVar.f18524d;
        if (lVar != null) {
            lVar.release();
            cVar.f18524d = null;
        }
        cVar.f18525f = null;
    }

    public final boolean p() {
        return this.F || h();
    }

    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        boolean[] zArr3;
        boolean z10;
        k9.q qVar;
        boolean z11;
        boolean z12;
        e();
        o0 o0Var = this.f26245z;
        j1 j1Var = o0Var.a;
        int i10 = this.G;
        int i11 = 0;
        while (true) {
            int length = qVarArr.length;
            zArr3 = o0Var.f26220c;
            if (i11 >= length) {
                break;
            }
            z0 z0Var = z0VarArr[i11];
            if (z0Var != null && (qVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((m0) z0Var).f26211b;
                u0.m(zArr3[i12]);
                this.G--;
                zArr3[i12] = false;
                z0VarArr[i11] = null;
            }
            i11++;
        }
        if (!this.E ? j3 != 0 : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < qVarArr.length; i13++) {
            if (z0VarArr[i13] == null && (qVar = qVarArr[i13]) != null) {
                if (qVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u0.m(z11);
                if (qVar.getIndexInTrackGroup(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u0.m(z12);
                int indexOf = j1Var.f26182c.indexOf(qVar.getTrackGroup());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                u0.m(!zArr3[indexOf]);
                this.G++;
                zArr3[indexOf] = true;
                z0VarArr[i13] = new m0(this, indexOf);
                zArr2[i13] = true;
                if (!z10) {
                    y0 y0Var = this.u[indexOf];
                    if (!y0Var.u(j3, true) && y0Var.f26337q + y0Var.f26339s != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.F = false;
            m9.n0 n0Var = this.f26233m;
            if (n0Var.a()) {
                for (y0 y0Var2 : this.u) {
                    y0Var2.i();
                }
                m9.j0 j0Var = n0Var.f21694c;
                u0.p(j0Var);
                j0Var.a(false);
            } else {
                for (y0 y0Var3 : this.u) {
                    y0Var3.t(false);
                }
            }
        } else if (z10) {
            j3 = seekToUs(j3);
            for (int i14 = 0; i14 < z0VarArr.length; i14++) {
                if (z0VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.E = true;
        return j3;
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        if (this.F) {
            if (this.M || f() > this.L) {
                this.F = false;
                return this.I;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        e();
        if (!this.A.isSeekable()) {
            return 0L;
        }
        y7.w seekPoints = this.A.getSeekPoints(j3);
        return p2Var.a(j3, seekPoints.a.a, seekPoints.f28011b.a);
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        boolean z10;
        e();
        boolean[] zArr = this.f26245z.f26219b;
        if (!this.A.isSeekable()) {
            j3 = 0;
        }
        this.F = false;
        this.I = j3;
        if (h()) {
            this.J = j3;
            return j3;
        }
        if (this.D != 7) {
            int length = this.u.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.u[i10].u(j3, false) && (zArr[i10] || !this.f26244y)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return j3;
            }
        }
        this.K = false;
        this.J = j3;
        this.M = false;
        m9.n0 n0Var = this.f26233m;
        if (n0Var.a()) {
            for (y0 y0Var : this.u) {
                y0Var.i();
            }
            m9.j0 j0Var = n0Var.f21694c;
            u0.p(j0Var);
            j0Var.a(false);
        } else {
            n0Var.f21695d = null;
            for (y0 y0Var2 : this.u) {
                y0Var2.t(false);
            }
        }
        return j3;
    }

    @Override // y7.n
    public final y7.a0 track(int i10, int i11) {
        return l(new n0(i10, false));
    }
}
