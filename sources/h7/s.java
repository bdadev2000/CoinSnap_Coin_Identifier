package h7;

/* loaded from: classes3.dex */
public final class s extends e0 {
    public final d0 a;

    public s(d0 d0Var) {
        this.a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        s sVar = (s) ((e0) obj);
        d0 d0Var = this.a;
        if (d0Var == null) {
            if (sVar.a == null) {
                return true;
            }
            return false;
        }
        return d0Var.equals(sVar.a);
    }

    public final int hashCode() {
        d0 d0Var = this.a;
        return (d0Var == null ? 0 : d0Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
