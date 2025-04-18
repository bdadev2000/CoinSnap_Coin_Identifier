package d1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final h f30179b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f30180a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return p0.a.g(this.f30180a, ((i) obj).f30180a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f30180a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f30180a;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
