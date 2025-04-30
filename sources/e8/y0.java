package e8;

/* loaded from: classes3.dex */
public final class y0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f20206a = new Object();
    public static final G b = W.a(j0.f20171a, "kotlin.UShort");

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return new t7.v(cVar.i(b).B());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        short s5 = ((t7.v) obj).b;
        G7.j.e(dVar, "encoder");
        dVar.q(b).i(s5);
    }
}
