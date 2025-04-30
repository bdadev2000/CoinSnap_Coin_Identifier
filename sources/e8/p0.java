package e8;

import t7.C2726o;

/* loaded from: classes3.dex */
public final class p0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f20186a = new Object();
    public static final G b = W.a(C2234i.f20168a, "kotlin.UByte");

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return new C2726o(cVar.i(b).y());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        byte b8 = ((C2726o) obj).b;
        G7.j.e(dVar, "encoder");
        dVar.q(b).j(b8);
    }
}
