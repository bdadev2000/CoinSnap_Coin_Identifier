package Q7;

/* renamed from: Q7.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0248p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2577a;
    public final F7.l b;

    public C0248p(Object obj, F7.l lVar) {
        this.f2577a = obj;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0248p)) {
            return false;
        }
        C0248p c0248p = (C0248p) obj;
        if (G7.j.a(this.f2577a, c0248p.f2577a) && G7.j.a(this.b, c0248p.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f2577a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f2577a + ", onCancellation=" + this.b + ')';
    }
}
