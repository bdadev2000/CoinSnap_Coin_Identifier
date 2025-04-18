package mb;

/* loaded from: classes3.dex */
public final class y0 extends d2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22133b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22134c;

    public y0(String str, String str2, long j3) {
        this.a = str;
        this.f22133b = str2;
        this.f22134c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        if (this.a.equals(((y0) d2Var).a)) {
            y0 y0Var = (y0) d2Var;
            if (this.f22133b.equals(y0Var.f22133b) && this.f22134c == y0Var.f22134c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f22133b.hashCode()) * 1000003;
        long j3 = this.f22134c;
        return hashCode ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.a);
        sb2.append(", code=");
        sb2.append(this.f22133b);
        sb2.append(", address=");
        return a4.j.j(sb2, this.f22134c, "}");
    }
}
