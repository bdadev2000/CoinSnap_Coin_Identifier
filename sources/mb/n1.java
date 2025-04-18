package mb;

/* loaded from: classes3.dex */
public final class n1 extends p2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22028c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22029d;

    public n1(int i10, String str, String str2, boolean z10) {
        this.a = i10;
        this.f22027b = str;
        this.f22028c = str2;
        this.f22029d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (this.a == ((n1) p2Var).a) {
            n1 n1Var = (n1) p2Var;
            if (this.f22027b.equals(n1Var.f22027b) && this.f22028c.equals(n1Var.f22028c) && this.f22029d == n1Var.f22029d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.f22027b.hashCode()) * 1000003) ^ this.f22028c.hashCode()) * 1000003;
        if (this.f22029d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.f22027b + ", buildVersion=" + this.f22028c + ", jailbroken=" + this.f22029d + "}";
    }
}
