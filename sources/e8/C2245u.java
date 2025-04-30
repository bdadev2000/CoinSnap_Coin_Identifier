package e8;

/* renamed from: e8.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2245u implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2245u f20194a = new Object();
    public static final c0 b = new c0("kotlin.Double", c8.e.f5434g);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Double.valueOf(cVar.D());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        G7.j.e(dVar, "encoder");
        dVar.h(doubleValue);
    }
}
