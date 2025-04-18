package d0;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30134a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30135b;

    public k(Object obj, Object obj2) {
        this.f30134a = obj;
        this.f30135b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p0.a.g(this.f30134a, kVar.f30134a) && p0.a.g(this.f30135b, kVar.f30135b);
    }

    public final int hashCode() {
        Object obj = this.f30134a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30135b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f30134a + ", " + this.f30135b + ')';
    }
}
