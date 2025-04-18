package d0;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30137a;

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f30136a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return p0.a.g(this.f30137a, ((n) obj).f30137a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f30137a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f30137a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
