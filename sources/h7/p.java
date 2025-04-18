package h7;

/* loaded from: classes3.dex */
public final class p extends b0 {
    public final e0 a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f18849b;

    public p(e0 e0Var, a0 a0Var) {
        this.a = e0Var;
        this.f18849b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        e0 e0Var = this.a;
        if (e0Var != null ? e0Var.equals(((p) b0Var).a) : ((p) b0Var).a == null) {
            a0 a0Var = this.f18849b;
            if (a0Var == null) {
                if (((p) b0Var).f18849b == null) {
                    return true;
                }
            } else if (a0Var.equals(((p) b0Var).f18849b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        e0 e0Var = this.a;
        if (e0Var == null) {
            hashCode = 0;
        } else {
            hashCode = e0Var.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        a0 a0Var = this.f18849b;
        if (a0Var != null) {
            i10 = a0Var.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.f18849b + "}";
    }
}
