package e1;

/* loaded from: classes.dex */
public final class f1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f30264a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30265b;

    public f1(long j2, long j3) {
        this.f30264a = j2;
        this.f30265b = j3;
        if (j2 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        }
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [j0.i, q0.p] */
    @Override // e1.y0
    public final h a(f1.c0 c0Var) {
        d1 d1Var = new d1(this, null);
        int i2 = b0.f30235a;
        h xVar = new x(new f1.n(d1Var, c0Var, h0.m.f30726a, -2, 1), new j0.i(2, null));
        if (xVar instanceof g1) {
            return xVar;
        }
        l lVar = l.f30303a;
        m mVar = m.f30304a;
        if (xVar instanceof g) {
            g gVar = (g) xVar;
            if (gVar.f30267b == mVar && gVar.f30268c == lVar) {
                return xVar;
            }
        }
        return new g(xVar, lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f30264a == f1Var.f30264a && this.f30265b == f1Var.f30265b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30265b) + (Long.hashCode(this.f30264a) * 31);
    }

    public final String toString() {
        f0.c cVar = new f0.c(2);
        long j2 = this.f30264a;
        if (j2 > 0) {
            cVar.add("stopTimeout=" + j2 + "ms");
        }
        long j3 = this.f30265b;
        if (j3 < Long.MAX_VALUE) {
            cVar.add("replayExpiration=" + j3 + "ms");
        }
        return android.support.v4.media.d.q(new StringBuilder("SharingStarted.WhileSubscribed("), e0.u.K0(b1.f0.e(cVar), null, null, null, null, 63), ')');
    }
}
