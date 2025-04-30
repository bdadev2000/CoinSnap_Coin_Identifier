package e8;

/* loaded from: classes3.dex */
public final class K implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final K f20127a = new Object();
    public static final c0 b = new c0("kotlin.Int", c8.e.f5436i);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Integer.valueOf(cVar.m());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        int intValue = ((Number) obj).intValue();
        G7.j.e(dVar, "encoder");
        dVar.y(intValue);
    }
}
