package androidx.work;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f5246a;

    public m(g gVar) {
        this.f5246a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            return this.f5246a.equals(((m) obj).f5246a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5246a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f5246a + '}';
    }
}
