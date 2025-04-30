package J4;

/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1575a;

    public a(int i9) {
        this.f1575a = i9;
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
        a aVar = (a) ((e) obj);
        if (this.f1575a == aVar.f1575a) {
            Object obj2 = d.b;
            aVar.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f1575a) + (d.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1575a + "intEncoding=" + d.b + ')';
    }
}
