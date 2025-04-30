package d4;

/* loaded from: classes2.dex */
public final class M extends u {

    /* renamed from: f, reason: collision with root package name */
    public final transient Object f19850f;

    public M(Object obj) {
        obj.getClass();
        this.f19850f = obj;
    }

    @Override // d4.AbstractC2180h
    public final int b(Object[] objArr) {
        objArr[0] = this.f19850f;
        return 1;
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19850f.equals(obj);
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return false;
    }

    @Override // d4.AbstractC2180h
    /* renamed from: g */
    public final O iterator() {
        return new C2172A(this.f19850f);
    }

    @Override // d4.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19850f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f19850f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
