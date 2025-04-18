package d1;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f30178a;

    public g(Throwable th) {
        this.f30178a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (p0.a.g(this.f30178a, ((g) obj).f30178a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f30178a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // d1.h
    public final String toString() {
        return "Closed(" + this.f30178a + ')';
    }
}
