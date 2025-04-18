package h7;

/* loaded from: classes3.dex */
public final class r extends d0 {
    public final Integer a;

    public r(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        Integer num = this.a;
        r rVar = (r) ((d0) obj);
        if (num == null) {
            if (rVar.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(rVar.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
