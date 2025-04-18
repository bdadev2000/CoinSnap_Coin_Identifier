package v8;

import java.util.ArrayList;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class g extends k1 {

    /* renamed from: l, reason: collision with root package name */
    public final long f26113l;

    /* renamed from: m, reason: collision with root package name */
    public final long f26114m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26115n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26116o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f26117p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f26118q;

    /* renamed from: r, reason: collision with root package name */
    public final w2 f26119r;

    /* renamed from: s, reason: collision with root package name */
    public e f26120s;

    /* renamed from: t, reason: collision with root package name */
    public f f26121t;
    public long u;

    /* renamed from: v, reason: collision with root package name */
    public long f26122v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, long j3, long j10, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        boolean z13;
        aVar.getClass();
        if (j3 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        u0.d(z13);
        this.f26113l = j3;
        this.f26114m = j10;
        this.f26115n = z10;
        this.f26116o = z11;
        this.f26117p = z12;
        this.f26118q = new ArrayList();
        this.f26119r = new w2();
    }

    @Override // v8.a
    public final w a(z zVar, m9.q qVar, long j3) {
        d dVar = new d(this.f26189k.a(zVar, qVar, j3), this.f26115n, this.u, this.f26122v);
        this.f26118q.add(dVar);
        return dVar;
    }

    @Override // v8.j, v8.a
    public final void i() {
        f fVar = this.f26121t;
        if (fVar == null) {
            super.i();
            return;
        }
        throw fVar;
    }

    @Override // v8.a
    public final void m(w wVar) {
        ArrayList arrayList = this.f26118q;
        u0.m(arrayList.remove(wVar));
        this.f26189k.m(((d) wVar).f26085b);
        if (arrayList.isEmpty() && !this.f26116o) {
            e eVar = this.f26120s;
            eVar.getClass();
            z(eVar.f26213c);
        }
    }

    @Override // v8.j, v8.a
    public final void o() {
        super.o();
        this.f26121t = null;
        this.f26120s = null;
    }

    @Override // v8.k1
    public final void x(x2 x2Var) {
        if (this.f26121t != null) {
            return;
        }
        z(x2Var);
    }

    public final void z(x2 x2Var) {
        long j3;
        long j10;
        long j11;
        w2 w2Var = this.f26119r;
        x2Var.m(0, w2Var);
        long j12 = w2Var.f24855s;
        e eVar = this.f26120s;
        long j13 = this.f26114m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f26118q;
        if (eVar != null && !arrayList.isEmpty() && !this.f26116o) {
            long j15 = this.u - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f26122v - j12;
            }
            j11 = j14;
            j10 = j15;
        } else {
            boolean z10 = this.f26117p;
            long j16 = this.f26113l;
            if (z10) {
                long j17 = w2Var.f24851o;
                j16 += j17;
                j3 = j17 + j13;
            } else {
                j3 = j13;
            }
            this.u = j12 + j16;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j3;
            }
            this.f26122v = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j18 = this.u;
                long j19 = this.f26122v;
                dVar.f26089g = j18;
                dVar.f26090h = j19;
            }
            j10 = j16;
            j11 = j3;
        }
        try {
            e eVar2 = new e(x2Var, j10, j11);
            this.f26120s = eVar2;
            l(eVar2);
        } catch (f e2) {
            this.f26121t = e2;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f26091i = this.f26121t;
            }
        }
    }
}
