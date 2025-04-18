package mb;

/* loaded from: classes3.dex */
public final class f0 extends v1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21907b;

    public f0(String str, String str2) {
        this.a = str;
        this.f21907b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (this.a.equals(((f0) v1Var).a) && this.f21907b.equals(((f0) v1Var).f21907b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21907b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.a);
        sb2.append(", value=");
        return vd.e.h(sb2, this.f21907b, "}");
    }
}
