package androidx.work;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f5245a = g.f5213c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            return this.f5245a.equals(((k) obj).f5245a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5245a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f5245a + '}';
    }
}
