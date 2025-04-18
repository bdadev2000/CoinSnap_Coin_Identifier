package h7;

/* loaded from: classes3.dex */
public final class w extends j0 {
    public final i0 a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f18865b;

    public w(i0 i0Var, h0 h0Var) {
        this.a = i0Var;
        this.f18865b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        i0 i0Var = this.a;
        if (i0Var != null ? i0Var.equals(((w) j0Var).a) : ((w) j0Var).a == null) {
            h0 h0Var = this.f18865b;
            if (h0Var == null) {
                if (((w) j0Var).f18865b == null) {
                    return true;
                }
            } else if (h0Var.equals(((w) j0Var).f18865b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        i0 i0Var = this.a;
        if (i0Var == null) {
            hashCode = 0;
        } else {
            hashCode = i0Var.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        h0 h0Var = this.f18865b;
        if (h0Var != null) {
            i10 = h0Var.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.f18865b + "}";
    }
}
