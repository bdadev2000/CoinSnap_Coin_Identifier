package b1;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22380a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.l f22381b;

    public v(Object obj, q0.l lVar) {
        this.f22380a = obj;
        this.f22381b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p0.a.g(this.f22380a, vVar.f22380a) && p0.a.g(this.f22381b, vVar.f22381b);
    }

    public final int hashCode() {
        Object obj = this.f22380a;
        return this.f22381b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f22380a + ", onCancellation=" + this.f22381b + ')';
    }
}
