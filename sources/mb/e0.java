package mb;

/* loaded from: classes3.dex */
public final class e0 extends t1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21900b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21901c;

    public e0(String str, String str2, String str3) {
        this.a = str;
        this.f21900b = str2;
        this.f21901c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.a.equals(((e0) t1Var).a)) {
            e0 e0Var = (e0) t1Var;
            if (this.f21900b.equals(e0Var.f21900b) && this.f21901c.equals(e0Var.f21901c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21900b.hashCode()) * 1000003) ^ this.f21901c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.a);
        sb2.append(", libraryName=");
        sb2.append(this.f21900b);
        sb2.append(", buildId=");
        return vd.e.h(sb2, this.f21901c, "}");
    }
}
