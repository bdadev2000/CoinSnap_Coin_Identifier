package e8;

/* loaded from: classes3.dex */
public final class O implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final O f20131a = new Object();
    public static final c0 b = new c0("kotlin.Long", c8.e.f5437j);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Long.valueOf(cVar.s());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        long longValue = ((Number) obj).longValue();
        G7.j.e(dVar, "encoder");
        dVar.B(longValue);
    }
}
