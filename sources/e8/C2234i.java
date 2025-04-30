package e8;

/* renamed from: e8.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2234i implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2234i f20168a = new Object();
    public static final c0 b = new c0("kotlin.Byte", c8.e.f5432e);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Byte.valueOf(cVar.y());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        G7.j.e(dVar, "encoder");
        dVar.j(byteValue);
    }
}
