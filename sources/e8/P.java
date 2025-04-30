package e8;

import java.util.Map;

/* loaded from: classes3.dex */
public final class P implements Map.Entry, H7.a {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20132c;

    public P(Object obj, Object obj2) {
        this.b = obj;
        this.f20132c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        if (G7.j.a(this.b, p2.b) && G7.j.a(this.f20132c, p2.f20132c)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20132c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f20132c;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i10 + i9;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.b + ", value=" + this.f20132c + ')';
    }
}
