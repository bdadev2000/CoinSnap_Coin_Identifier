package j3;

/* loaded from: classes.dex */
public final class r extends D {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f21083a;

    public r(Integer num) {
        this.f21083a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        Integer num = this.f21083a;
        r rVar = (r) ((D) obj);
        if (num == null) {
            if (rVar.f21083a == null) {
                return true;
            }
            return false;
        }
        return num.equals(rVar.f21083a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f21083a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f21083a + "}";
    }
}
