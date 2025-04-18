package h;

import okio.BufferedSource;

/* loaded from: classes4.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30701a = true;

    @Override // h.i
    public final j a(k.n nVar, q.n nVar2) {
        BufferedSource h2 = nVar.f30892a.h();
        if (!h2.rangeEquals(0L, r.f30695b) && !h2.rangeEquals(0L, r.f30694a)) {
            return null;
        }
        return new u(nVar.f30892a, nVar2, this.f30701a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof s;
    }

    public final int hashCode() {
        return s.class.hashCode();
    }
}
