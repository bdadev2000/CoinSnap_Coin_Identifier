package s7;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class m1 {
    public final v8.w a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24581b;

    /* renamed from: c, reason: collision with root package name */
    public final v8.z0[] f24582c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24584e;

    /* renamed from: f, reason: collision with root package name */
    public n1 f24585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24586g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f24587h;

    /* renamed from: i, reason: collision with root package name */
    public final g[] f24588i;

    /* renamed from: j, reason: collision with root package name */
    public final k9.t f24589j;

    /* renamed from: k, reason: collision with root package name */
    public final w1 f24590k;

    /* renamed from: l, reason: collision with root package name */
    public m1 f24591l;

    /* renamed from: m, reason: collision with root package name */
    public v8.j1 f24592m;

    /* renamed from: n, reason: collision with root package name */
    public k9.x f24593n;

    /* renamed from: o, reason: collision with root package name */
    public long f24594o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [v8.d] */
    public m1(g[] gVarArr, long j3, k9.t tVar, m9.q qVar, w1 w1Var, n1 n1Var, k9.x xVar) {
        this.f24588i = gVarArr;
        this.f24594o = j3;
        this.f24589j = tVar;
        this.f24590k = w1Var;
        v8.z zVar = n1Var.a;
        this.f24581b = zVar.a;
        this.f24585f = n1Var;
        this.f24592m = v8.j1.f26179f;
        this.f24593n = xVar;
        this.f24582c = new v8.z0[gVarArr.length];
        this.f24587h = new boolean[gVarArr.length];
        long j10 = n1Var.f24601d;
        w1Var.getClass();
        int i10 = l2.f24558m;
        Pair pair = (Pair) zVar.a;
        Object obj = pair.first;
        v8.z b3 = zVar.b(pair.second);
        v1 v1Var = (v1) w1Var.f24824d.get(obj);
        v1Var.getClass();
        w1Var.f24827g.add(v1Var);
        u1 u1Var = (u1) w1Var.f24826f.get(v1Var);
        if (u1Var != null) {
            u1Var.a.d(u1Var.f24769b);
        }
        v1Var.f24777c.add(b3);
        v8.q a = v1Var.a.a(b3, qVar, n1Var.f24599b);
        w1Var.f24823c.put(a, v1Var);
        w1Var.c();
        this.a = j10 != C.TIME_UNSET ? new v8.d(a, true, 0L, j10) : a;
    }

    public final long a(k9.x xVar, long j3, boolean z10, boolean[] zArr) {
        g[] gVarArr;
        v8.z0[] z0VarArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= xVar.a) {
                break;
            }
            if (z10 || !xVar.a(this.f24593n, i10)) {
                z12 = false;
            }
            this.f24587h[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            gVarArr = this.f24588i;
            int length = gVarArr.length;
            z0VarArr = this.f24582c;
            if (i11 >= length) {
                break;
            }
            if (gVarArr[i11].f24359c == -2) {
                z0VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f24593n = xVar;
        c();
        long r6 = this.a.r(xVar.f20526c, this.f24587h, this.f24582c, zArr, j3);
        for (int i12 = 0; i12 < gVarArr.length; i12++) {
            if (gVarArr[i12].f24359c == -2 && this.f24593n.b(i12)) {
                z0VarArr[i12] = new v8.m();
            }
        }
        this.f24584e = false;
        for (int i13 = 0; i13 < z0VarArr.length; i13++) {
            if (z0VarArr[i13] != null) {
                v8.u0.m(xVar.b(i13));
                if (gVarArr[i13].f24359c != -2) {
                    this.f24584e = true;
                }
            } else {
                if (xVar.f20526c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v8.u0.m(z11);
            }
        }
        return r6;
    }

    public final void b() {
        boolean z10;
        int i10 = 0;
        if (this.f24591l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            k9.x xVar = this.f24593n;
            if (i10 < xVar.a) {
                boolean b3 = xVar.b(i10);
                k9.q qVar = this.f24593n.f20526c[i10];
                if (b3 && qVar != null) {
                    qVar.disable();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z10;
        int i10 = 0;
        if (this.f24591l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            k9.x xVar = this.f24593n;
            if (i10 < xVar.a) {
                boolean b3 = xVar.b(i10);
                k9.q qVar = this.f24593n.f20526c[i10];
                if (b3 && qVar != null) {
                    qVar.enable();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j3;
        if (!this.f24583d) {
            return this.f24585f.f24599b;
        }
        if (this.f24584e) {
            j3 = this.a.getBufferedPositionUs();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f24585f.f24602e;
        }
        return j3;
    }

    public final long e() {
        return this.f24585f.f24599b + this.f24594o;
    }

    public final void f() {
        b();
        v8.w wVar = this.a;
        try {
            boolean z10 = wVar instanceof v8.d;
            w1 w1Var = this.f24590k;
            if (z10) {
                w1Var.f(((v8.d) wVar).f26085b);
            } else {
                w1Var.f(wVar);
            }
        } catch (RuntimeException e2) {
            n9.o.d("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:342:0x05c8, code lost:
    
        if (r4 != 2) goto L284;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k9.x g(float r39) {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.m1.g(float):k9.x");
    }

    public final void h() {
        v8.w wVar = this.a;
        if (wVar instanceof v8.d) {
            long j3 = this.f24585f.f24601d;
            if (j3 == C.TIME_UNSET) {
                j3 = Long.MIN_VALUE;
            }
            v8.d dVar = (v8.d) wVar;
            dVar.f26089g = 0L;
            dVar.f26090h = j3;
        }
    }
}
