package s7;

/* loaded from: classes3.dex */
public final class d2 implements i {

    /* renamed from: b, reason: collision with root package name */
    public final n9.g f24324b;

    static {
        new c2().b();
        n9.h0.E(0);
    }

    public d2(n9.g gVar) {
        this.f24324b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        return this.f24324b.equals(((d2) obj).f24324b);
    }

    public final int hashCode() {
        return this.f24324b.hashCode();
    }
}
