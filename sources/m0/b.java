package m0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21421b;

    public b(Object obj, Object obj2) {
        this.a = obj;
        this.f21421b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.a, this.a) || !Objects.equals(bVar.f21421b, this.f21421b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f21421b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.f21421b + "}";
    }
}
