package e8;

/* loaded from: classes3.dex */
public final class T implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f20138a;
    public final f0 b;

    public T(a8.b bVar) {
        G7.j.e(bVar, "serializer");
        this.f20138a = bVar;
        this.b = new f0(bVar.getDescriptor());
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        if (cVar.v()) {
            return cVar.u(this.f20138a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G7.s.a(T.class).equals(G7.s.a(obj.getClass())) && G7.j.a(this.f20138a, ((T) obj).f20138a)) {
            return true;
        }
        return false;
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.f20138a.hashCode();
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        if (obj != null) {
            dVar.g(this.f20138a, obj);
        } else {
            dVar.f();
        }
    }
}
