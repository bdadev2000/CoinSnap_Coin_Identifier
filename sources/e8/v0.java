package e8;

import t7.C2730s;

/* loaded from: classes3.dex */
public final class v0 implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f20197a = new Object();
    public static final G b = W.a(O.f20131a, "kotlin.ULong");

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return new C2730s(cVar.i(b).s());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        long j7 = ((C2730s) obj).b;
        G7.j.e(dVar, "encoder");
        dVar.q(b).B(j7);
    }
}
