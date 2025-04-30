package e8;

/* loaded from: classes3.dex */
public final class C implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f20117a = new Object();
    public static final c0 b = new c0("kotlin.Float", c8.e.f5435h);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Float.valueOf(cVar.C());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        G7.j.e(dVar, "encoder");
        dVar.p(floatValue);
    }
}
