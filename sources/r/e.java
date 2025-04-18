package r;

import f.l;

/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f31345a = g.f31349c;

    @Override // r.h
    public final Object c(l lVar) {
        return this.f31345a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (p0.a.g(this.f31345a, ((e) obj).f31345a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31345a.hashCode();
    }
}
