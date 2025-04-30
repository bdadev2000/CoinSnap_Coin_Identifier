package y2;

/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2949e {

    /* renamed from: a, reason: collision with root package name */
    public final m f24355a;
    public final k b;

    public C2949e(m mVar, k kVar) {
        G7.j.e(kVar, "field");
        this.f24355a = mVar;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2949e)) {
            return false;
        }
        C2949e c2949e = (C2949e) obj;
        if (this.f24355a == c2949e.f24355a && this.b == c2949e.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        m mVar = this.f24355a;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f24355a + ", field=" + this.b + ')';
    }
}
