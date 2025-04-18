package yb;

/* loaded from: classes3.dex */
public final class a implements e {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final d f28143b;

    public a(int i10, d dVar) {
        this.a = i10;
        this.f28143b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == ((a) eVar).a && this.f28143b.equals(((a) eVar).f28143b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (this.f28143b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.f28143b + ')';
    }
}
