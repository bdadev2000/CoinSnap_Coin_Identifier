package d0;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f30136a;

    public m(Throwable th) {
        p0.a.s(th, "exception");
        this.f30136a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (p0.a.g(this.f30136a, ((m) obj).f30136a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30136a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f30136a + ')';
    }
}
