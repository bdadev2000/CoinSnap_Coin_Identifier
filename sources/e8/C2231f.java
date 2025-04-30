package e8;

/* renamed from: e8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2231f implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2231f f20162a = new Object();
    public static final c0 b = new c0("kotlin.Boolean", c8.e.f5431d);

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return Boolean.valueOf(cVar.e());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return b;
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        G7.j.e(dVar, "encoder");
        dVar.l(booleanValue);
    }
}
