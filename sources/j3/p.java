package j3;

/* loaded from: classes.dex */
public final class p extends B {

    /* renamed from: a, reason: collision with root package name */
    public final E f21081a;
    public final EnumC2385A b;

    public p(s sVar) {
        EnumC2385A enumC2385A = EnumC2385A.b;
        this.f21081a = sVar;
        this.b = enumC2385A;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        E e4 = this.f21081a;
        if (e4 != null ? e4.equals(((p) b).f21081a) : ((p) b).f21081a == null) {
            EnumC2385A enumC2385A = this.b;
            if (enumC2385A == null) {
                if (((p) b).b == null) {
                    return true;
                }
            } else if (enumC2385A.equals(((p) b).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        E e4 = this.f21081a;
        if (e4 == null) {
            hashCode = 0;
        } else {
            hashCode = e4.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        EnumC2385A enumC2385A = this.b;
        if (enumC2385A != null) {
            i9 = enumC2385A.hashCode();
        }
        return i9 ^ i10;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f21081a + ", productIdOrigin=" + this.b + "}";
    }
}
