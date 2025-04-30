package o4;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f21970a;
    public final Class b;

    public q(Class cls, Class cls2) {
        this.f21970a = cls;
        this.b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.b.equals(qVar.b)) {
            return false;
        }
        return this.f21970a.equals(qVar.f21970a);
    }

    public final int hashCode() {
        return this.f21970a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.f21970a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
