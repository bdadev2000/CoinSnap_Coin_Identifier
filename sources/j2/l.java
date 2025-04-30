package j2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Class f21022a;
    public Class b;

    /* renamed from: c, reason: collision with root package name */
    public Class f21023c;

    public l(Class cls, Class cls2, Class cls3) {
        this.f21022a = cls;
        this.b = cls2;
        this.f21023c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f21022a.equals(lVar.f21022a) && this.b.equals(lVar.b) && n.b(this.f21023c, lVar.f21023c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (this.b.hashCode() + (this.f21022a.hashCode() * 31)) * 31;
        Class cls = this.f21023c;
        if (cls != null) {
            i9 = cls.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f21022a + ", second=" + this.b + '}';
    }
}
