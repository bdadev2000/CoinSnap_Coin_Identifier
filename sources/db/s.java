package db;

/* loaded from: classes3.dex */
public final class s {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16967b;

    public s(Class cls, Class cls2) {
        this.a = cls;
        this.f16967b = cls2;
    }

    public static s a(Class cls) {
        return new s(r.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f16967b.equals(sVar.f16967b)) {
            return false;
        }
        return this.a.equals(sVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.f16967b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f16967b;
        Class cls2 = this.a;
        if (cls2 == r.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
