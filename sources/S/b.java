package S;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2767a;
    public final Object b;

    public b(Object obj, Object obj2) {
        this.f2767a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f2767a, this.f2767a) || !Objects.equals(bVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f2767a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i9 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f2767a + " " + this.b + "}";
    }
}
