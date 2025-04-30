package e8;

/* renamed from: e8.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2240o implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2240o f20183a = new Object();
    public static final c0 b = new c0("kotlin.Char", c8.e.f5433f);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Character.valueOf(cVar.f());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        char charValue = ((Character) obj).charValue();
        G7.j.e(dVar, "encoder");
        dVar.r(charValue);
    }
}
