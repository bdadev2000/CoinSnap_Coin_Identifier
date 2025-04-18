package k;

import h.d0;

/* loaded from: classes3.dex */
public final class n extends e {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30893b;

    /* renamed from: c, reason: collision with root package name */
    public final h.g f30894c;

    public n(d0 d0Var, String str, h.g gVar) {
        this.f30892a = d0Var;
        this.f30893b = str;
        this.f30894c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (p0.a.g(this.f30892a, nVar.f30892a) && p0.a.g(this.f30893b, nVar.f30893b) && this.f30894c == nVar.f30894c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f30892a.hashCode() * 31;
        String str = this.f30893b;
        return this.f30894c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
