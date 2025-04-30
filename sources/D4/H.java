package d4;

/* loaded from: classes2.dex */
public final class H extends u {

    /* renamed from: f, reason: collision with root package name */
    public final transient q f19833f;

    /* renamed from: g, reason: collision with root package name */
    public final transient AbstractC2186n f19834g;

    public H(q qVar, I i9) {
        this.f19833f = qVar;
        this.f19834g = i9;
    }

    @Override // d4.AbstractC2180h
    public final int b(Object[] objArr) {
        return this.f19834g.b(objArr);
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f19833f.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return true;
    }

    @Override // d4.AbstractC2180h
    /* renamed from: g */
    public final O iterator() {
        return this.f19834g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((J) this.f19833f).f19841h;
    }
}
