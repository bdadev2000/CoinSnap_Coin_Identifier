package mb;

/* loaded from: classes3.dex */
public final class k1 extends l2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21991b;

    public k1(String str, String str2) {
        this.a = str;
        this.f21991b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (this.a.equals(((k1) l2Var).a) && this.f21991b.equals(((k1) l2Var).f21991b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21991b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.a);
        sb2.append(", variantId=");
        return vd.e.h(sb2, this.f21991b, "}");
    }
}
