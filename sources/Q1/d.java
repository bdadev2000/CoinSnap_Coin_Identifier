package Q1;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f2471a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Class f2472c;

    public d(e eVar) {
        this.f2471a = eVar;
    }

    @Override // Q1.i
    public final void a() {
        this.f2471a.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b || this.f2472c != dVar.f2472c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int i10 = this.b * 31;
        Class cls = this.f2472c;
        if (cls != null) {
            i9 = cls.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.f2472c + '}';
    }
}
