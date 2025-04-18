package mb;

/* loaded from: classes3.dex */
public final class e1 extends h2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21902b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21903c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21904d;

    public e1(String str, int i10, int i11, boolean z10) {
        this.a = str;
        this.f21902b = i10;
        this.f21903c = i11;
        this.f21904d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        if (this.a.equals(((e1) h2Var).a)) {
            e1 e1Var = (e1) h2Var;
            if (this.f21902b == e1Var.f21902b && this.f21903c == e1Var.f21903c && this.f21904d == e1Var.f21904d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21902b) * 1000003) ^ this.f21903c) * 1000003;
        if (this.f21904d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.f21902b + ", importance=" + this.f21903c + ", defaultProcess=" + this.f21904d + "}";
    }
}
