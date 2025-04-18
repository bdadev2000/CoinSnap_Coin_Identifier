package v8;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import s7.p2;

/* loaded from: classes3.dex */
public final class g1 implements w, m9.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final m9.p f26125b;

    /* renamed from: c, reason: collision with root package name */
    public final m9.k f26126c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.w0 f26127d;

    /* renamed from: f, reason: collision with root package name */
    public final ac.e f26128f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.c f26129g;

    /* renamed from: h, reason: collision with root package name */
    public final j1 f26130h;

    /* renamed from: j, reason: collision with root package name */
    public final long f26132j;

    /* renamed from: l, reason: collision with root package name */
    public final s7.r0 f26134l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f26135m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26136n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f26137o;

    /* renamed from: p, reason: collision with root package name */
    public int f26138p;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f26131i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final m9.n0 f26133k = new m9.n0("SingleSampleMediaPeriod");

    public g1(m9.p pVar, m9.k kVar, m9.w0 w0Var, s7.r0 r0Var, long j3, ac.e eVar, f0.c cVar, boolean z10) {
        this.f26125b = pVar;
        this.f26126c = kVar;
        this.f26127d = w0Var;
        this.f26134l = r0Var;
        this.f26132j = j3;
        this.f26128f = eVar;
        this.f26129g = cVar;
        this.f26135m = z10;
        this.f26130h = new j1(new i1("", r0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m9.i0
    public final j8.e a(m9.k0 k0Var, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        j8.e eVar;
        m9.v0 v0Var = ((f1) k0Var).f26111d;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        n9.w wVar = new n9.w(pVar, new u(1, -1, this.f26134l, 0, null, 0L, n9.h0.Q(this.f26132j)), iOException, i10);
        ac.e eVar2 = this.f26128f;
        eVar2.getClass();
        long k10 = ac.e.k(wVar);
        int i11 = 0;
        if (k10 != C.TIME_UNSET && i10 < eVar2.i(1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f26135m && z10) {
            n9.o.g("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f26136n = true;
            eVar = m9.n0.f21691f;
        } else if (k10 != C.TIME_UNSET) {
            eVar = new j8.e(i11, k10, i11);
        } else {
            eVar = m9.n0.f21692g;
        }
        j8.e eVar3 = eVar;
        int i12 = eVar3.a;
        if (i12 == 0 || i12 == 1) {
            i11 = 1;
        }
        this.f26129g.p(pVar, 1, -1, this.f26134l, 0, null, 0L, this.f26132j, iOException, i11 ^ 1);
        return eVar3;
    }

    @Override // m9.i0
    public final void b(m9.k0 k0Var, long j3, long j10, boolean z10) {
        m9.v0 v0Var = ((f1) k0Var).f26111d;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        this.f26128f.getClass();
        this.f26129g.l(pVar, 1, -1, null, 0, null, 0L, this.f26132j);
    }

    @Override // m9.i0
    public final void c(m9.k0 k0Var, long j3, long j10) {
        f1 f1Var = (f1) k0Var;
        this.f26138p = (int) f1Var.f26111d.f21777b;
        byte[] bArr = f1Var.f26112f;
        bArr.getClass();
        this.f26137o = bArr;
        this.f26136n = true;
        m9.v0 v0Var = f1Var.f26111d;
        Uri uri = v0Var.f21778c;
        p pVar = new p(v0Var.f21779d);
        this.f26128f.getClass();
        this.f26129g.n(pVar, 1, -1, this.f26134l, 0, null, 0L, this.f26132j);
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        boolean z10;
        if (!this.f26136n) {
            m9.n0 n0Var = this.f26133k;
            if (!n0Var.a()) {
                if (n0Var.f21695d != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    m9.l createDataSource = this.f26126c.createDataSource();
                    m9.w0 w0Var = this.f26127d;
                    if (w0Var != null) {
                        createDataSource.c(w0Var);
                    }
                    f1 f1Var = new f1(createDataSource, this.f26125b);
                    this.f26129g.r(new p(f1Var.f26109b, this.f26125b, n0Var.c(f1Var, this, this.f26128f.i(1))), 1, -1, this.f26134l, 0, null, 0L, this.f26132j);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        return this.f26136n ? Long.MIN_VALUE : 0L;
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        return (this.f26136n || this.f26133k.a()) ? Long.MIN_VALUE : 0L;
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        return this.f26130h;
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f26133k.a();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        vVar.a(this);
    }

    @Override // v8.w
    public final void o(long j3) {
    }

    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            z0 z0Var = z0VarArr[i10];
            ArrayList arrayList = this.f26131i;
            if (z0Var != null && (qVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(z0Var);
                z0VarArr[i10] = null;
            }
            if (z0VarArr[i10] == null && qVarArr[i10] != null) {
                e1 e1Var = new e1(this);
                arrayList.add(e1Var);
                z0VarArr[i10] = e1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        return j3;
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26131i;
            if (i10 < arrayList.size()) {
                e1 e1Var = (e1) arrayList.get(i10);
                if (e1Var.f26103b == 2) {
                    e1Var.f26103b = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }
}
