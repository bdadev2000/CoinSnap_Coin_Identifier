package mb;

/* loaded from: classes3.dex */
public final class p1 {
    public final q1 a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f22047b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f22048c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.a = q1Var;
        this.f22047b = s1Var;
        this.f22048c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.a.equals(p1Var.a) && this.f22047b.equals(p1Var.f22047b) && this.f22048c.equals(p1Var.f22048c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f22047b.hashCode()) * 1000003) ^ this.f22048c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.f22047b + ", deviceData=" + this.f22048c + "}";
    }
}
