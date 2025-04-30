package u7;

/* renamed from: u7.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2827r {

    /* renamed from: a, reason: collision with root package name */
    public final int f23450a;
    public final Object b;

    public C2827r(int i9, Object obj) {
        this.f23450a = i9;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2827r)) {
            return false;
        }
        C2827r c2827r = (C2827r) obj;
        if (this.f23450a == c2827r.f23450a && G7.j.a(this.b, c2827r.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f23450a) * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f23450a + ", value=" + this.b + ')';
    }
}
