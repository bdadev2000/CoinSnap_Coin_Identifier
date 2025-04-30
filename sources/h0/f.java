package h0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f20575a;

    public f(String str) {
        this.f20575a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return G7.j.a(this.f20575a, ((f) obj).f20575a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20575a.hashCode();
    }

    public final String toString() {
        return this.f20575a;
    }
}
