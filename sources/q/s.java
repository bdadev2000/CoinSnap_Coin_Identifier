package q;

import e0.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f31337b = new s(x.f30219a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f31338a;

    public s(Map map) {
        this.f31338a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            if (p0.a.g(this.f31338a, ((s) obj).f31338a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31338a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f31338a + ')';
    }
}
