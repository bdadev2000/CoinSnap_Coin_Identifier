package mb;

/* loaded from: classes3.dex */
public final class j1 extends m2 {
    public final l2 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21976b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21977c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21978d;

    public j1(l2 l2Var, String str, String str2, long j3) {
        this.a = l2Var;
        this.f21976b = str;
        this.f21977c = str2;
        this.f21978d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        j1 j1Var = (j1) ((m2) obj);
        if (this.a.equals(j1Var.a)) {
            if (this.f21976b.equals(j1Var.f21976b) && this.f21977c.equals(j1Var.f21977c) && this.f21978d == j1Var.f21978d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21976b.hashCode()) * 1000003) ^ this.f21977c.hashCode()) * 1000003;
        long j3 = this.f21978d;
        return hashCode ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.a);
        sb2.append(", parameterKey=");
        sb2.append(this.f21976b);
        sb2.append(", parameterValue=");
        sb2.append(this.f21977c);
        sb2.append(", templateVersion=");
        return a4.j.j(sb2, this.f21978d, "}");
    }
}
