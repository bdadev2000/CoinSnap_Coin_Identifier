package e8;

/* loaded from: classes3.dex */
public final class j0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f20171a = new Object();
    public static final c0 b = new c0("kotlin.Short", c8.e.f5438k);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Short.valueOf(cVar.B());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        G7.j.e(dVar, "encoder");
        dVar.i(shortValue);
    }
}
