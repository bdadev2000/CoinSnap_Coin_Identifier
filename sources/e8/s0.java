package e8;

import t7.C2728q;

/* loaded from: classes3.dex */
public final class s0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f20191a = new Object();
    public static final G b = W.a(K.f20127a, "kotlin.UInt");

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return new C2728q(cVar.i(b).m());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        int i9 = ((C2728q) obj).b;
        G7.j.e(dVar, "encoder");
        dVar.q(b).y(i9);
    }
}
