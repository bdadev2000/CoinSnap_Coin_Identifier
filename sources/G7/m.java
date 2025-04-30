package G7;

/* loaded from: classes3.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1333a;

    public m(Class cls) {
        j.e(cls, "jClass");
        this.f1333a = cls;
    }

    @Override // G7.d
    public final Class a() {
        return this.f1333a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (j.a(this.f1333a, ((m) obj).f1333a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1333a.hashCode();
    }

    public final String toString() {
        return this.f1333a.toString() + " (Kotlin reflection is not available)";
    }
}
