package y2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public m f24356a;
    public n b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f24356a == fVar.f24356a && this.b == fVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f24356a.hashCode() * 31;
        n nVar = this.b;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f24356a + ", field=" + this.b + ')';
    }
}
