package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class v implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f30936a;

    public v(Class cls) {
        p0.a.s(cls, "jClass");
        this.f30936a = cls;
    }

    @Override // kotlin.jvm.internal.i
    public final Class a() {
        return this.f30936a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            if (p0.a.g(this.f30936a, ((v) obj).f30936a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30936a.hashCode();
    }

    public final String toString() {
        return this.f30936a.toString() + " (Kotlin reflection is not available)";
    }
}
